package org.jivesoftware.smackx.iot.provisioning;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.a.a;
import org.b.a.b;
import org.b.a.i;
import org.b.c.a.c;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.StanzaExtensionFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Presence.Type;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.roster.AbstractPresenceEventListener;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smack.roster.SubscribeListener;
import org.jivesoftware.smack.roster.SubscribeListener.SubscribeAnswer;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo;
import org.jivesoftware.smackx.iot.IoTManager;
import org.jivesoftware.smackx.iot.discovery.IoTDiscoveryManager;
import org.jivesoftware.smackx.iot.provisioning.element.ClearCache;
import org.jivesoftware.smackx.iot.provisioning.element.ClearCacheResponse;
import org.jivesoftware.smackx.iot.provisioning.element.Friend;
import org.jivesoftware.smackx.iot.provisioning.element.IoTIsFriend;
import org.jivesoftware.smackx.iot.provisioning.element.IoTIsFriendResponse;
import org.jivesoftware.smackx.iot.provisioning.element.Unfriend;

public final class IoTProvisioningManager extends Manager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final StanzaFilter FRIEND_MESSAGE = new AndFilter(StanzaTypeFilter.MESSAGE, new StanzaExtensionFilter(Friend.ELEMENT, "urn:xmpp:iot:provisioning"));
    private static final Map<XMPPConnection, IoTProvisioningManager> INSTANCES = new WeakHashMap();
    private static final Logger LOGGER = Logger.getLogger(IoTProvisioningManager.class.getName());
    private static final StanzaFilter UNFRIEND_MESSAGE = new AndFilter(StanzaTypeFilter.MESSAGE, new StanzaExtensionFilter(Unfriend.ELEMENT, "urn:xmpp:iot:provisioning"));
    private final Set<BecameFriendListener> becameFriendListeners = new CopyOnWriteArraySet();
    private i configuredProvisioningServer;
    private final c<a, Void> friendshipDeniedCache = new c(16);
    private final c<a, Void> friendshipRequestedCache = new c(16);
    private final c<i, c<a, Void>> negativeFriendshipRequestCache = new c(8);
    private final Roster roster;
    private final Set<WasUnfriendedListener> wasUnfriendedListeners = new CopyOnWriteArraySet();

    static class C79281 implements ConnectionCreationListener {
        C79281() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            if (IoTManager.isAutoEnableActive()) {
                IoTProvisioningManager.getInstanceFor(xMPPConnection);
            }
        }
    }

    class C79292 implements StanzaListener {
        C79292() {
        }

        public void processStanza(Stanza stanza) {
            if (IoTProvisioningManager.this.isFromProvisioningService(stanza, true)) {
                i jid = Unfriend.from((Message) stanza).getJid();
                XMPPConnection access$100 = IoTProvisioningManager.this.connection();
                if (Roster.getInstanceFor(access$100).isSubscribedToMyPresence(jid)) {
                    stanza = new Presence(Type.unsubscribed);
                    stanza.setTo(jid);
                    access$100.sendStanza(stanza);
                    return;
                }
                Logger access$200 = IoTProvisioningManager.LOGGER;
                StringBuilder stringBuilder = new StringBuilder("Ignoring <unfriend/> request '");
                stringBuilder.append(stanza);
                stringBuilder.append("' because ");
                stringBuilder.append(jid);
                stringBuilder.append(" is already not subscribed to our presence.");
                access$200.warning(stringBuilder.toString());
            }
        }
    }

    class C79303 implements StanzaListener {
        C79303() {
        }

        public void processStanza(Stanza stanza) {
            Message message = (Message) stanza;
            i friend = Friend.from(message).getFriend();
            if (IoTProvisioningManager.this.isFromProvisioningService(message, false)) {
                XMPPConnection access$300 = IoTProvisioningManager.this.connection();
                access$300.sendStanza(new Message(friend, new Friend(access$300.getUser().m())));
                return;
            }
            a m = message.getFrom().m();
            if (!IoTProvisioningManager.this.friendshipDeniedCache.containsKey(m)) {
                Logger access$200 = IoTProvisioningManager.LOGGER;
                Level level = Level.WARNING;
                StringBuilder stringBuilder = new StringBuilder("Ignoring friendship recommendation ");
                stringBuilder.append(message);
                stringBuilder.append(" because friendship to this JID was not previously denied.");
                access$200.log(level, stringBuilder.toString());
            } else if (m.a(friend)) {
                IoTProvisioningManager.this.sendFriendshipRequest(friend);
            } else {
                Logger access$2002 = IoTProvisioningManager.LOGGER;
                Level level2 = Level.WARNING;
                StringBuilder stringBuilder2 = new StringBuilder("Ignoring friendship recommendation ");
                stringBuilder2.append(message);
                stringBuilder2.append(" because it does not recommend itself, but ");
                stringBuilder2.append(friend);
                stringBuilder2.append('.');
                access$2002.log(level2, stringBuilder2.toString());
            }
        }
    }

    class C79315 implements SubscribeListener {
        C79315() {
        }

        public SubscribeAnswer processSubscribe(i iVar, Presence presence) {
            i configuredProvisioningServer;
            try {
                if (IoTDiscoveryManager.getInstanceFor(IoTProvisioningManager.this.connection()).isRegistry(iVar.m())) {
                    return SubscribeAnswer.Approve;
                }
            } catch (Throwable e) {
                Logger access$200 = IoTProvisioningManager.LOGGER;
                Level level = Level.WARNING;
                StringBuilder stringBuilder = new StringBuilder("Could not determine if ");
                stringBuilder.append(iVar);
                stringBuilder.append(" is a registry");
                access$200.log(level, stringBuilder.toString(), e);
            }
            try {
                configuredProvisioningServer = IoTProvisioningManager.this.getConfiguredProvisioningServer();
            } catch (Throwable e2) {
                Logger access$2002 = IoTProvisioningManager.LOGGER;
                Level level2 = Level.WARNING;
                StringBuilder stringBuilder2 = new StringBuilder("Could not determine privisioning server. Ignoring friend request from ");
                stringBuilder2.append(iVar);
                access$2002.log(level2, stringBuilder2.toString(), e2);
                configuredProvisioningServer = null;
            }
            if (configuredProvisioningServer == null) {
                return null;
            }
            try {
                return IoTProvisioningManager.this.isFriend(configuredProvisioningServer, iVar.m()) ? SubscribeAnswer.Approve : SubscribeAnswer.Deny;
            } catch (Throwable e22) {
                access$2002 = IoTProvisioningManager.LOGGER;
                level2 = Level.WARNING;
                stringBuilder2 = new StringBuilder("Could not determine if ");
                stringBuilder2.append(iVar);
                stringBuilder2.append(" is a friend.");
                access$2002.log(level2, stringBuilder2.toString(), e22);
                return null;
            }
        }
    }

    class C80256 extends AbstractPresenceEventListener {
        C80256() {
        }

        public void presenceSubscribed(a aVar, Presence presence) {
            IoTProvisioningManager.this.friendshipRequestedCache.remove(aVar);
            for (BecameFriendListener becameFriend : IoTProvisioningManager.this.becameFriendListeners) {
                becameFriend.becameFriend(aVar, presence);
            }
        }

        public void presenceUnsubscribed(a aVar, Presence presence) {
            if (IoTProvisioningManager.this.friendshipRequestedCache.containsKey(aVar)) {
                IoTProvisioningManager.this.friendshipDeniedCache.put(aVar, null);
            }
            for (WasUnfriendedListener wasUnfriendedListener : IoTProvisioningManager.this.wasUnfriendedListeners) {
                wasUnfriendedListener.wasUnfriendedListener(aVar, presence);
            }
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79281());
    }

    private IoTProvisioningManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        xMPPConnection.addAsyncStanzaListener(new C79292(), UNFRIEND_MESSAGE);
        xMPPConnection.addAsyncStanzaListener(new C79303(), FRIEND_MESSAGE);
        xMPPConnection.registerIQRequestHandler(new AbstractIqRequestHandler(ClearCache.ELEMENT, "urn:xmpp:iot:provisioning", IQ.Type.set, Mode.async) {
            public IQ handleIQRequest(IQ iq) {
                if (!IoTProvisioningManager.this.isFromProvisioningService(iq, true)) {
                    return null;
                }
                ClearCache clearCache = (ClearCache) iq;
                c cVar = (c) IoTProvisioningManager.this.negativeFriendshipRequestCache.get(iq.getFrom());
                if (cVar != null) {
                    cVar.clear();
                }
                return new ClearCacheResponse(clearCache);
            }
        });
        this.roster = Roster.getInstanceFor(xMPPConnection);
        this.roster.addSubscribeListener(new C79315());
        this.roster.addPresenceEventListener(new C80256());
    }

    public static synchronized IoTProvisioningManager getInstanceFor(XMPPConnection xMPPConnection) {
        IoTProvisioningManager ioTProvisioningManager;
        synchronized (IoTProvisioningManager.class) {
            ioTProvisioningManager = (IoTProvisioningManager) INSTANCES.get(xMPPConnection);
            if (ioTProvisioningManager == null) {
                ioTProvisioningManager = new IoTProvisioningManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, ioTProvisioningManager);
            }
        }
        return ioTProvisioningManager;
    }

    private boolean isFromProvisioningService(Stanza stanza, boolean z) {
        try {
            i configuredProvisioningServer = getConfiguredProvisioningServer();
            Logger logger;
            if (configuredProvisioningServer == null) {
                if (z) {
                    logger = LOGGER;
                    StringBuilder stringBuilder = new StringBuilder("Ignoring request '");
                    stringBuilder.append(stanza);
                    stringBuilder.append("' because no provisioning server configured.");
                    logger.warning(stringBuilder.toString());
                }
                return false;
            } else if (configuredProvisioningServer.a(stanza.getFrom())) {
                return true;
            } else {
                if (z) {
                    logger = LOGGER;
                    StringBuilder stringBuilder2 = new StringBuilder("Ignoring  request '");
                    stringBuilder2.append(stanza);
                    stringBuilder2.append("' because not from provising server '");
                    stringBuilder2.append(configuredProvisioningServer);
                    stringBuilder2.append("'.");
                    logger.warning(stringBuilder2.toString());
                }
                return false;
            }
        } catch (Throwable e) {
            LOGGER.log(Level.WARNING, "Could determine provisioning server", e);
            return false;
        }
    }

    public final boolean addBecameFriendListener(BecameFriendListener becameFriendListener) {
        return this.becameFriendListeners.add(becameFriendListener);
    }

    public final boolean addWasUnfriendedListener(WasUnfriendedListener wasUnfriendedListener) {
        return this.wasUnfriendedListeners.add(wasUnfriendedListener);
    }

    public final b findProvisioningServerComponent() {
        List findServicesDiscoverInfo = ServiceDiscoveryManager.getInstanceFor(connection()).findServicesDiscoverInfo("urn:xmpp:iot:provisioning", true, true);
        return findServicesDiscoverInfo.isEmpty() ? null : ((DiscoverInfo) findServicesDiscoverInfo.get(0)).getFrom().t();
    }

    public final i getConfiguredProvisioningServer() {
        if (this.configuredProvisioningServer == null) {
            this.configuredProvisioningServer = findProvisioningServerComponent();
        }
        return this.configuredProvisioningServer;
    }

    public final boolean iAmFriendOf(a aVar) {
        return this.roster.iAmSubscribedTo(aVar);
    }

    public final boolean isFriend(i iVar, a aVar) {
        c cVar = (c) this.negativeFriendshipRequestCache.get(iVar);
        if (cVar != null && cVar.containsKey(aVar)) {
            return false;
        }
        IQ ioTIsFriend = new IoTIsFriend(aVar);
        ioTIsFriend.setTo(iVar);
        boolean isFriendResult = ((IoTIsFriendResponse) connection().createStanzaCollectorAndSend(ioTIsFriend).nextResultOrThrow()).getIsFriendResult();
        if (!isFriendResult) {
            if (cVar == null) {
                cVar = new c(Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE);
                this.negativeFriendshipRequestCache.put(iVar, cVar);
            }
            cVar.put(aVar, null);
        }
        return isFriendResult;
    }

    public final boolean isMyFriend(i iVar) {
        return this.roster.isSubscribedToMyPresence(iVar);
    }

    public final boolean removeBecameFriendListener(BecameFriendListener becameFriendListener) {
        return this.becameFriendListeners.remove(becameFriendListener);
    }

    public final boolean removeWasUnfriendedListener(WasUnfriendedListener wasUnfriendedListener) {
        return this.wasUnfriendedListeners.remove(wasUnfriendedListener);
    }

    public final void sendFriendshipRequest(a aVar) {
        Stanza presence = new Presence(Type.subscribe);
        presence.setTo((i) aVar);
        this.friendshipRequestedCache.put(aVar, null);
        connection().sendStanza(presence);
    }

    public final void sendFriendshipRequestIfRequired(a aVar) {
        if (!iAmFriendOf(aVar)) {
            sendFriendshipRequest(aVar);
        }
    }

    public final void setConfiguredProvisioningServer(i iVar) {
        this.configuredProvisioningServer = iVar;
    }

    public final void unfriend(i iVar) {
        if (isMyFriend(iVar)) {
            Stanza presence = new Presence(Type.unsubscribed);
            presence.setTo(iVar);
            connection().sendStanza(presence);
        }
    }
}
