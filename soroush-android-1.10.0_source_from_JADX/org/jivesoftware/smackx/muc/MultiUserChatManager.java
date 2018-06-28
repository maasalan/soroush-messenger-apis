package org.jivesoftware.smackx.muc;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.a.b;
import org.b.a.b.d;
import org.b.a.e;
import org.b.a.g;
import org.b.a.i;
import org.jivesoftware.smack.AbstractConnectionListener;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.MessageTypeFilter;
import org.jivesoftware.smack.filter.NotFilter;
import org.jivesoftware.smack.filter.StanzaExtensionFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.Async;
import org.jivesoftware.smackx.disco.AbstractNodeInformationProvider;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.disco.packet.DiscoverItems.Item;
import org.jivesoftware.smackx.muc.MultiUserChatException.NotAMucServiceException;
import org.jivesoftware.smackx.muc.packet.MUCInitialPresence;
import org.jivesoftware.smackx.muc.packet.MUCUser;
import org.jivesoftware.smackx.muc.packet.MUCUser.Decline;
import org.jivesoftware.smackx.muc.packet.MUCUser.Invite;

public final class MultiUserChatManager extends Manager {
    private static final String DISCO_NODE = "http://jabber.org/protocol/muc#rooms";
    private static final Map<XMPPConnection, MultiUserChatManager> INSTANCES = new WeakHashMap();
    private static final StanzaFilter INVITATION_FILTER = new AndFilter(StanzaTypeFilter.MESSAGE, new StanzaExtensionFilter(new MUCUser()), new NotFilter(MessageTypeFilter.ERROR));
    private static final Logger LOGGER = Logger.getLogger(MultiUserChatManager.class.getName());
    private AutoJoinFailedCallback autoJoinFailedCallback;
    private boolean autoJoinOnReconnect;
    private final Set<InvitationListener> invitationsListeners = new CopyOnWriteArraySet();
    private final Set<e> joinedRooms = new HashSet();
    private final Map<e, WeakReference<MultiUserChat>> multiUserChats = new HashMap();

    static class C79441 implements ConnectionCreationListener {
        C79441() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature(MUCInitialPresence.NAMESPACE);
            final WeakReference weakReference = new WeakReference(xMPPConnection);
            ServiceDiscoveryManager.getInstanceFor(xMPPConnection).setNodeInformationProvider(MultiUserChatManager.DISCO_NODE, new AbstractNodeInformationProvider() {
                public List<Item> getNodeItems() {
                    XMPPConnection xMPPConnection = (XMPPConnection) weakReference.get();
                    if (xMPPConnection == null) {
                        return Collections.emptyList();
                    }
                    Set<e> joinedRooms = MultiUserChatManager.getInstanceFor(xMPPConnection).getJoinedRooms();
                    List<Item> arrayList = new ArrayList();
                    for (e item : joinedRooms) {
                        arrayList.add(new Item(item));
                    }
                    return arrayList;
                }
            });
        }
    }

    class C79452 implements StanzaListener {
        C79452() {
        }

        public void processStanza(Stanza stanza) {
            C79452 c79452 = this;
            Message message = (Message) stanza;
            MUCUser from = MUCUser.from(message);
            if (from.getInvite() != null) {
                e n = message.getFrom().n();
                if (n == null) {
                    Logger access$000 = MultiUserChatManager.LOGGER;
                    StringBuilder stringBuilder = new StringBuilder("Invite to non bare JID: '");
                    stringBuilder.append(message.toXML());
                    stringBuilder.append("'");
                    access$000.warning(stringBuilder.toString());
                    return;
                }
                MultiUserChat multiUserChat = MultiUserChatManager.this.getMultiUserChat(n);
                XMPPConnection access$100 = MultiUserChatManager.this.connection();
                Invite invite = from.getInvite();
                g from2 = invite.getFrom();
                String reason = invite.getReason();
                String password = from.getPassword();
                Iterator it = MultiUserChatManager.this.invitationsListeners.iterator();
                while (it.hasNext()) {
                    Iterator it2 = it;
                    ((InvitationListener) it.next()).invitationReceived(access$100, multiUserChat, from2, reason, password, message, invite);
                    it = it2;
                }
            }
        }
    }

    class C80293 extends AbstractConnectionListener {
        C80293() {
        }

        public void authenticated(XMPPConnection xMPPConnection, boolean z) {
            if (!z && MultiUserChatManager.this.autoJoinOnReconnect) {
                final Set joinedRooms = MultiUserChatManager.this.getJoinedRooms();
                if (!joinedRooms.isEmpty()) {
                    Async.go(new Runnable() {
                        public void run() {
                            Throwable e;
                            AutoJoinFailedCallback access$400 = MultiUserChatManager.this.autoJoinFailedCallback;
                            for (e multiUserChat : joinedRooms) {
                                MultiUserChat multiUserChat2 = MultiUserChatManager.this.getMultiUserChat(multiUserChat);
                                if (multiUserChat2.isJoined()) {
                                    d nickname = multiUserChat2.getNickname();
                                    if (nickname != null) {
                                        try {
                                            multiUserChat2.leave();
                                            try {
                                                multiUserChat2.join(nickname);
                                            } catch (NotAMucServiceException e2) {
                                                e = e2;
                                                if (access$400 != null) {
                                                    access$400.autoJoinFailed(multiUserChat2, e);
                                                    return;
                                                }
                                            }
                                        } catch (NotConnectedException e3) {
                                            e = e3;
                                            if (access$400 != null) {
                                                access$400.autoJoinFailed(multiUserChat2, e);
                                            }
                                            MultiUserChatManager.LOGGER.log(Level.WARNING, "Could not leave room", e);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                    });
                }
            }
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79441());
    }

    private MultiUserChatManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        xMPPConnection.addAsyncStanzaListener(new C79452(), INVITATION_FILTER);
        xMPPConnection.addConnectionListener(new C80293());
    }

    private MultiUserChat createNewMucAndAddToMap(e eVar) {
        MultiUserChat multiUserChat = new MultiUserChat(connection(), eVar, this);
        this.multiUserChats.put(eVar, new WeakReference(multiUserChat));
        return multiUserChat;
    }

    public static synchronized MultiUserChatManager getInstanceFor(XMPPConnection xMPPConnection) {
        MultiUserChatManager multiUserChatManager;
        synchronized (MultiUserChatManager.class) {
            multiUserChatManager = (MultiUserChatManager) INSTANCES.get(xMPPConnection);
            if (multiUserChatManager == null) {
                multiUserChatManager = new MultiUserChatManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, multiUserChatManager);
            }
        }
        return multiUserChatManager;
    }

    public final void addInvitationListener(InvitationListener invitationListener) {
        this.invitationsListeners.add(invitationListener);
    }

    final void addJoinedRoom(e eVar) {
        this.joinedRooms.add(eVar);
    }

    public final void decline(e eVar, e eVar2, String str) {
        Stanza message = new Message((i) eVar);
        ExtensionElement mUCUser = new MUCUser();
        mUCUser.setDecline(new Decline(str, eVar2));
        message.addExtension(mUCUser);
        connection().sendStanza(message);
    }

    public final List<HostedRoom> getHostedRooms(b bVar) {
        if (providesMucService(bVar)) {
            List<Item> items = ServiceDiscoveryManager.getInstanceFor(connection()).discoverItems(bVar).getItems();
            List<HostedRoom> arrayList = new ArrayList(items.size());
            for (Item hostedRoom : items) {
                arrayList.add(new HostedRoom(hostedRoom));
            }
            return arrayList;
        }
        throw new NotAMucServiceException(bVar);
    }

    public final List<e> getJoinedRooms(g gVar) {
        List<Item> items = ServiceDiscoveryManager.getInstanceFor(connection()).discoverItems(gVar, DISCO_NODE).getItems();
        List<e> arrayList = new ArrayList(items.size());
        for (Item item : items) {
            e n = item.getEntityID().n();
            if (n == null) {
                Logger logger = LOGGER;
                StringBuilder stringBuilder = new StringBuilder("Not a bare JID: ");
                stringBuilder.append(item.getEntityID());
                logger.warning(stringBuilder.toString());
            } else {
                arrayList.add(n);
            }
        }
        return arrayList;
    }

    public final Set<e> getJoinedRooms() {
        return Collections.unmodifiableSet(this.joinedRooms);
    }

    public final synchronized MultiUserChat getMultiUserChat(e eVar) {
        WeakReference weakReference = (WeakReference) this.multiUserChats.get(eVar);
        if (weakReference == null) {
            return createNewMucAndAddToMap(eVar);
        }
        MultiUserChat multiUserChat = (MultiUserChat) weakReference.get();
        if (multiUserChat != null) {
            return multiUserChat;
        }
        return createNewMucAndAddToMap(eVar);
    }

    public final RoomInfo getRoomInfo(e eVar) {
        return new RoomInfo(ServiceDiscoveryManager.getInstanceFor(connection()).discoverInfo(eVar));
    }

    public final List<b> getXMPPServiceDomains() {
        return ServiceDiscoveryManager.getInstanceFor(connection()).findServices(MUCInitialPresence.NAMESPACE, false, false);
    }

    public final boolean isServiceEnabled(i iVar) {
        return ServiceDiscoveryManager.getInstanceFor(connection()).supportsFeature(iVar, MUCInitialPresence.NAMESPACE);
    }

    public final boolean providesMucService(b bVar) {
        return ServiceDiscoveryManager.getInstanceFor(connection()).supportsFeature(bVar, MUCInitialPresence.NAMESPACE);
    }

    public final void removeInvitationListener(InvitationListener invitationListener) {
        this.invitationsListeners.remove(invitationListener);
    }

    final void removeJoinedRoom(e eVar) {
        this.joinedRooms.remove(eVar);
    }

    public final void setAutoJoinFailedCallback(AutoJoinFailedCallback autoJoinFailedCallback) {
        this.autoJoinFailedCallback = autoJoinFailedCallback;
        if (autoJoinFailedCallback != null) {
            setAutoJoinOnReconnect(true);
        }
    }

    public final void setAutoJoinOnReconnect(boolean z) {
        this.autoJoinOnReconnect = z;
    }
}
