package org.jivesoftware.smack.roster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.a.a;
import org.b.a.b.d;
import org.b.a.f;
import org.b.a.h;
import org.b.a.i;
import org.b.c.a.c;
import org.jivesoftware.smack.AbstractConnectionListener;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.ExceptionCallback;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException.FeatureNotSupportedException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.SmackException.NotLoggedInException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.PresenceTypeFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.filter.ToMatchesFilter;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smack.roster.SubscribeListener.SubscribeAnswer;
import org.jivesoftware.smack.roster.packet.RosterPacket;
import org.jivesoftware.smack.roster.packet.RosterPacket.Item;
import org.jivesoftware.smack.roster.packet.RosterPacket.ItemType;
import org.jivesoftware.smack.roster.packet.RosterVer;
import org.jivesoftware.smack.roster.packet.SubscriptionPreApproval;
import org.jivesoftware.smack.roster.rosterstore.RosterStore;
import org.jivesoftware.smack.util.Objects;

public final class Roster extends Manager {
    public static final int INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE = 1024;
    private static final Map<XMPPConnection, Roster> INSTANCES = new WeakHashMap();
    private static final Logger LOGGER = Logger.getLogger(Roster.class.getName());
    private static final StanzaFilter OUTGOING_USER_UNAVAILABLE_PRESENCE = new AndFilter(PresenceTypeFilter.UNAVAILABLE, ToMatchesFilter.MATCH_NO_TO_SET);
    private static final StanzaFilter PRESENCE_PACKET_FILTER = StanzaTypeFilter.PRESENCE;
    private static int defaultNonRosterPresenceMapMaxSize = 1024;
    private static SubscriptionMode defaultSubscriptionMode = SubscriptionMode.reject_all;
    private static boolean rosterLoadedAtLoginDefault = true;
    private final Map<a, RosterEntry> entries = new ConcurrentHashMap();
    private final Map<String, RosterGroup> groups = new ConcurrentHashMap();
    private final c<a, Map<d, Presence>> nonRosterPresenceMap = new c(defaultNonRosterPresenceMapMaxSize);
    private final Set<PresenceEventListener> presenceEventListeners = new CopyOnWriteArraySet();
    private final Map<a, Map<d, Presence>> presenceMap = new ConcurrentHashMap();
    private final PresencePacketListener presencePacketListener = new PresencePacketListener();
    private SubscriptionMode previousSubscriptionMode;
    private final Set<RosterListener> rosterListeners = new LinkedHashSet();
    private final Object rosterListenersAndEntriesLock = new Object();
    private boolean rosterLoadedAtLogin = rosterLoadedAtLoginDefault;
    private final Set<RosterLoadedListener> rosterLoadedListeners = new LinkedHashSet();
    private RosterState rosterState = RosterState.uninitialized;
    private RosterStore rosterStore;
    private final Set<SubscribeListener> subscribeListeners = new CopyOnWriteArraySet();
    private SubscriptionMode subscriptionMode = getDefaultSubscriptionMode();
    private final Set<RosterEntry> unfiledEntries = new CopyOnWriteArraySet();

    private enum RosterState {
        uninitialized,
        loading,
        loaded
    }

    public enum SubscriptionMode {
        accept_all,
        reject_all,
        manual
    }

    static class C78951 implements ConnectionCreationListener {
        C78951() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            Roster.getInstanceFor(xMPPConnection);
        }
    }

    class C78974 implements StanzaListener {
        C78974() {
        }

        public void processStanza(Stanza stanza) {
            Roster.this.setOfflinePresences();
        }
    }

    class C78985 implements ExceptionCallback {
        C78985() {
        }

        public void processException(Exception exception) {
            Roster.this.rosterState = RosterState.uninitialized;
            Roster.LOGGER.log(exception instanceof NotConnectedException ? Level.FINE : Level.SEVERE, "Exception reloading roster", exception);
            for (RosterLoadedListener onRosterLoadingFailed : Roster.this.rosterLoadedListeners) {
                onRosterLoadingFailed.onRosterLoadingFailed(exception);
            }
        }
    }

    private class PresencePacketListener implements StanzaListener {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        static {
            Class cls = Roster.class;
        }

        private PresencePacketListener() {
        }

        public void processStanza(Stanza stanza) {
            a m;
            h hVar;
            if (Roster.this.rosterState == RosterState.loading) {
                try {
                    Roster.this.waitUntilLoaded();
                } catch (Throwable e) {
                    Roster.LOGGER.log(Level.INFO, "Presence listener was interrupted", e);
                }
            }
            if (!Roster.this.isLoaded() && Roster.this.rosterLoadedAtLogin) {
                Logger access$500 = Roster.LOGGER;
                StringBuilder stringBuilder = new StringBuilder("Roster not loaded while processing ");
                stringBuilder.append(stanza);
                access$500.warning(stringBuilder.toString());
            }
            Presence presence = (Presence) stanza;
            i from = presence.getFrom();
            Object obj = d.a;
            a aVar = null;
            if (from != null) {
                obj = from.u();
                if (obj == null) {
                    obj = d.a;
                    m = from.m();
                    hVar = null;
                } else {
                    hVar = from.s();
                    m = null;
                }
            } else {
                m = null;
                hVar = m;
            }
            if (from != null) {
                aVar = from.m();
            }
            Map access$1100;
            switch (presence.getType()) {
                case available:
                    access$1100 = Roster.this.getOrCreatePresencesInternal(aVar);
                    access$1100.remove(d.a);
                    access$1100.put(obj, presence);
                    if (Roster.this.contains(aVar)) {
                        Roster.this.fireRosterPresenceEvent(presence);
                    }
                    for (PresenceEventListener presenceAvailable : Roster.this.presenceEventListeners) {
                        presenceAvailable.presenceAvailable(hVar, presence);
                    }
                    break;
                case unavailable:
                    if (from.j()) {
                        access$1100 = Roster.this.getOrCreatePresencesInternal(aVar);
                        obj = d.a;
                    } else {
                        if (Roster.this.presenceMap.get(aVar) != null) {
                            access$1100 = (Map) Roster.this.presenceMap.get(aVar);
                        }
                        if (Roster.this.contains(aVar)) {
                            Roster.this.fireRosterPresenceEvent(presence);
                        }
                        if (hVar == null) {
                            for (PresenceEventListener presenceAvailable2 : Roster.this.presenceEventListeners) {
                                presenceAvailable2.presenceUnavailable(hVar, presence);
                            }
                            return;
                        }
                        access$500 = Roster.LOGGER;
                        stringBuilder = new StringBuilder("Unavailable presence from bare JID: ");
                        stringBuilder.append(presence);
                        access$500.fine(stringBuilder.toString());
                        return;
                    }
                    access$1100.put(obj, presence);
                    if (Roster.this.contains(aVar)) {
                        Roster.this.fireRosterPresenceEvent(presence);
                    }
                    if (hVar == null) {
                        access$500 = Roster.LOGGER;
                        stringBuilder = new StringBuilder("Unavailable presence from bare JID: ");
                        stringBuilder.append(presence);
                        access$500.fine(stringBuilder.toString());
                        return;
                    }
                    while (r0.hasNext()) {
                        presenceAvailable2.presenceUnavailable(hVar, presence);
                    }
                    return;
                case error:
                    if (from != null && from.f()) {
                        Map access$11002 = Roster.this.getOrCreatePresencesInternal(aVar);
                        access$11002.clear();
                        access$11002.put(d.a, presence);
                        if (Roster.this.contains(aVar)) {
                            Roster.this.fireRosterPresenceEvent(presence);
                        }
                        for (PresenceEventListener presenceError : Roster.this.presenceEventListeners) {
                            presenceError.presenceError(from, presence);
                        }
                        return;
                    }
                case subscribed:
                    for (PresenceEventListener presenceAvailable22 : Roster.this.presenceEventListeners) {
                        presenceAvailable22.presenceSubscribed(m, presence);
                    }
                    return;
                case unsubscribed:
                    for (PresenceEventListener presenceAvailable222 : Roster.this.presenceEventListeners) {
                        presenceAvailable222.presenceUnsubscribed(m, presence);
                    }
                    break;
                default:
                    return;
            }
        }
    }

    private class RosterResultListener implements StanzaListener {
        private RosterResultListener() {
        }

        public void processStanza(Stanza stanza) {
            XMPPConnection access$1500 = Roster.this.connection();
            Roster.LOGGER.log(Level.FINE, "RosterResultListener received {}", stanza);
            Collection arrayList = new ArrayList();
            Collection arrayList2 = new ArrayList();
            Collection arrayList3 = new ArrayList();
            Collection arrayList4 = new ArrayList();
            Item item;
            if (stanza instanceof RosterPacket) {
                RosterPacket rosterPacket = (RosterPacket) stanza;
                Collection arrayList5 = new ArrayList();
                for (Item item2 : rosterPacket.getRosterItems()) {
                    if (Roster.hasValidSubscriptionType(item2)) {
                        arrayList5.add(item2);
                    }
                }
                Iterator it = arrayList5.iterator();
                while (it.hasNext()) {
                    item = (Item) it.next();
                    Roster.this.addUpdateEntry(arrayList, arrayList2, arrayList4, item, new RosterEntry(item, Roster.this, access$1500));
                }
                Set<i> hashSet = new HashSet();
                for (RosterEntry jid : Roster.this.entries.values()) {
                    hashSet.add(jid.getJid());
                }
                hashSet.removeAll(arrayList);
                hashSet.removeAll(arrayList2);
                hashSet.removeAll(arrayList4);
                for (i iVar : hashSet) {
                    Roster.this.deleteEntry(arrayList3, (RosterEntry) Roster.this.entries.get(iVar));
                }
                if (Roster.this.rosterStore != null) {
                    Roster.this.rosterStore.resetEntries(arrayList5, rosterPacket.getVersion());
                }
                Roster.this.removeEmptyGroups();
            } else {
                List<Item> entries = Roster.this.rosterStore.getEntries();
                if (entries == null) {
                    Roster.this.rosterStore.resetStore();
                    try {
                        Roster.this.reload();
                        return;
                    } catch (NotLoggedInException e) {
                        Throwable e2 = e;
                        Logger access$500 = Roster.LOGGER;
                        Level level = Level.FINE;
                        String str = "Exception while trying to load the roster after the roster store was corrupted";
                        access$500.log(level, str, e2);
                        return;
                    }
                }
                for (Item item3 : entries) {
                    Roster.this.addUpdateEntry(arrayList, arrayList2, arrayList4, item3, new RosterEntry(item3, Roster.this, access$1500));
                }
            }
            Roster.this.rosterState = RosterState.loaded;
            synchronized (Roster.this) {
                Roster.this.notifyAll();
            }
            Roster.this.fireRosterChangedEvent(arrayList, arrayList2, arrayList3);
            try {
                synchronized (Roster.this.rosterLoadedListeners) {
                    for (RosterLoadedListener onRosterLoaded : Roster.this.rosterLoadedListeners) {
                        onRosterLoaded.onRosterLoaded(Roster.this);
                    }
                }
            } catch (Exception e3) {
                e2 = e3;
                access$500 = Roster.LOGGER;
                level = Level.WARNING;
                str = "RosterLoadedListener threw exception";
            }
        }
    }

    class C80033 extends AbstractConnectionListener {
        C80033() {
        }

        public void authenticated(XMPPConnection xMPPConnection, boolean z) {
            if (Roster.this.isRosterLoadedAtLogin() && !z) {
                Roster.this.setOfflinePresencesAndResetLoaded();
                try {
                    Roster.this.reload();
                } catch (Throwable e) {
                    Roster.LOGGER.log(Level.SEVERE, "Could not reload Roster", e);
                }
            }
        }

        public void connectionClosed() {
            Roster.this.setOfflinePresencesAndResetLoaded();
        }
    }

    private final class RosterPushListener extends AbstractIqRequestHandler {
        private RosterPushListener() {
            super("query", RosterPacket.NAMESPACE, Type.set, Mode.sync);
        }

        public final IQ handleIQRequest(IQ iq) {
            XMPPConnection access$2300 = Roster.this.connection();
            RosterPacket rosterPacket = (RosterPacket) iq;
            f user = access$2300.getUser();
            if (user == null) {
                Logger access$500 = Roster.LOGGER;
                StringBuilder stringBuilder = new StringBuilder("Ignoring roster push ");
                stringBuilder.append(iq);
                stringBuilder.append(" while ");
                stringBuilder.append(access$2300);
                stringBuilder.append(" has no bound resource. This may be a server bug.");
                access$500.warning(stringBuilder.toString());
                return null;
            }
            CharSequence b = user.b();
            i from = rosterPacket.getFrom();
            if (from == null || from.a(b)) {
                Collection rosterItems = rosterPacket.getRosterItems();
                if (rosterItems.size() != 1) {
                    Logger access$5002 = Roster.LOGGER;
                    StringBuilder stringBuilder2 = new StringBuilder("Ignoring roster push with not exaclty one entry. size=");
                    stringBuilder2.append(rosterItems.size());
                    access$5002.warning(stringBuilder2.toString());
                    return IQ.createErrorResponse(iq, Condition.bad_request);
                }
                Collection arrayList = new ArrayList();
                Collection arrayList2 = new ArrayList();
                Collection arrayList3 = new ArrayList();
                Collection arrayList4 = new ArrayList();
                Item item = (Item) rosterItems.iterator().next();
                RosterEntry rosterEntry = new RosterEntry(item, Roster.this, access$2300);
                String version = rosterPacket.getVersion();
                if (item.getItemType().equals(ItemType.remove)) {
                    Roster.this.deleteEntry(arrayList3, rosterEntry);
                    if (Roster.this.rosterStore != null) {
                        Roster.this.rosterStore.removeEntry(rosterEntry.getJid(), version);
                    }
                } else if (Roster.hasValidSubscriptionType(item)) {
                    Roster.this.addUpdateEntry(arrayList, arrayList2, arrayList4, item, rosterEntry);
                    if (Roster.this.rosterStore != null) {
                        Roster.this.rosterStore.addEntry(item, version);
                    }
                }
                Roster.this.removeEmptyGroups();
                Roster.this.fireRosterChangedEvent(arrayList, arrayList2, arrayList3);
                return IQ.createResultIQ(rosterPacket);
            }
            access$5002 = Roster.LOGGER;
            stringBuilder2 = new StringBuilder("Ignoring roster push with a non matching 'from' ourJid='");
            stringBuilder2.append(b);
            stringBuilder2.append("' from='");
            stringBuilder2.append(from);
            stringBuilder2.append("'");
            access$5002.warning(stringBuilder2.toString());
            return IQ.createErrorResponse(iq, Condition.service_unavailable);
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C78951());
    }

    private Roster(final XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        xMPPConnection.registerIQRequestHandler(new RosterPushListener());
        xMPPConnection.addSyncStanzaListener(this.presencePacketListener, PRESENCE_PACKET_FILTER);
        xMPPConnection.addAsyncStanzaListener(new StanzaListener() {
            public void processStanza(Stanza stanza) {
                Presence presence = (Presence) stanza;
                i from = presence.getFrom();
                SubscribeAnswer subscribeAnswer = null;
                switch (Roster.this.subscriptionMode) {
                    case manual:
                        for (SubscribeListener processSubscribe : Roster.this.subscribeListeners) {
                            subscribeAnswer = processSubscribe.processSubscribe(from, presence);
                            if (subscribeAnswer != null) {
                                if (subscribeAnswer == null) {
                                    return;
                                }
                            }
                        }
                        if (subscribeAnswer == null) {
                            return;
                        }
                        break;
                    case accept_all:
                        subscribeAnswer = SubscribeAnswer.Approve;
                        break;
                    case reject_all:
                        subscribeAnswer = SubscribeAnswer.Deny;
                        break;
                    default:
                        break;
                }
                Stanza presence2 = subscribeAnswer == SubscribeAnswer.Approve ? new Presence(Presence.Type.subscribed) : new Presence(Presence.Type.unsubscribed);
                presence2.setTo(presence.getFrom());
                xMPPConnection.sendStanza(presence2);
            }
        }, PresenceTypeFilter.SUBSCRIBE);
        xMPPConnection.addConnectionListener(new C80033());
        xMPPConnection.addPacketSendingListener(new C78974(), OUTGOING_USER_UNAVAILABLE_PRESENCE);
        if (xMPPConnection.isAuthenticated()) {
            try {
                reloadAndWait();
            } catch (Throwable e) {
                LOGGER.log(Level.SEVERE, "Could not reload Roster", e);
            }
        }
    }

    private void addUpdateEntry(Collection<i> collection, Collection<i> collection2, Collection<i> collection3, Item item, RosterEntry rosterEntry) {
        synchronized (this.rosterListenersAndEntriesLock) {
            RosterEntry rosterEntry2 = (RosterEntry) this.entries.put(item.getJid(), rosterEntry);
        }
        if (rosterEntry2 == null) {
            a jid = item.getJid();
            collection.add(jid);
            move(jid, this.nonRosterPresenceMap, this.presenceMap);
        } else {
            Item toRosterItem = RosterEntry.toRosterItem(rosterEntry2);
            if (rosterEntry2.equalsDeep(rosterEntry)) {
                if (item.getGroupNames().equals(toRosterItem.getGroupNames())) {
                    collection3.add(item.getJid());
                }
            }
            collection2.add(item.getJid());
            rosterEntry2.updateItem(item);
        }
        if (item.getGroupNames().isEmpty()) {
            this.unfiledEntries.add(rosterEntry);
        } else {
            this.unfiledEntries.remove(rosterEntry);
        }
        Collection arrayList = new ArrayList();
        for (String str : item.getGroupNames()) {
            arrayList.add(str);
            RosterGroup group = getGroup(str);
            if (group == null) {
                group = createGroup(str);
                this.groups.put(str, group);
            }
            group.addEntryLocal(rosterEntry);
        }
        List<String> arrayList2 = new ArrayList();
        for (RosterGroup group2 : getGroups()) {
            arrayList2.add(group2.getName());
        }
        arrayList2.removeAll(arrayList);
        for (String str2 : arrayList2) {
            RosterGroup group3 = getGroup(str2);
            group3.removeEntryLocal(rosterEntry);
            if (group3.getEntryCount() == 0) {
                this.groups.remove(str2);
            }
        }
    }

    private void deleteEntry(Collection<i> collection, RosterEntry rosterEntry) {
        a jid = rosterEntry.getJid();
        this.entries.remove(jid);
        this.unfiledEntries.remove(rosterEntry);
        move(jid, this.presenceMap, this.nonRosterPresenceMap);
        collection.add(jid);
        for (Entry entry : this.groups.entrySet()) {
            RosterGroup rosterGroup = (RosterGroup) entry.getValue();
            rosterGroup.removeEntryLocal(rosterEntry);
            if (rosterGroup.getEntryCount() == 0) {
                this.groups.remove(entry.getKey());
            }
        }
    }

    private void fireRosterChangedEvent(Collection<i> collection, Collection<i> collection2, Collection<i> collection3) {
        synchronized (this.rosterListenersAndEntriesLock) {
            for (RosterListener rosterListener : this.rosterListeners) {
                if (!collection.isEmpty()) {
                    rosterListener.entriesAdded(collection);
                }
                if (!collection2.isEmpty()) {
                    rosterListener.entriesUpdated(collection2);
                }
                if (!collection3.isEmpty()) {
                    rosterListener.entriesDeleted(collection3);
                }
            }
        }
    }

    private void fireRosterPresenceEvent(Presence presence) {
        synchronized (this.rosterListenersAndEntriesLock) {
            for (RosterListener presenceChanged : this.rosterListeners) {
                presenceChanged.presenceChanged(presence);
            }
        }
    }

    public static SubscriptionMode getDefaultSubscriptionMode() {
        return defaultSubscriptionMode;
    }

    public static synchronized Roster getInstanceFor(XMPPConnection xMPPConnection) {
        Roster roster;
        synchronized (Roster.class) {
            roster = (Roster) INSTANCES.get(xMPPConnection);
            if (roster == null) {
                roster = new Roster(xMPPConnection);
                INSTANCES.put(xMPPConnection, roster);
            }
        }
        return roster;
    }

    private synchronized Map<d, Presence> getOrCreatePresencesInternal(a aVar) {
        Map<d, Presence> presencesInternal;
        presencesInternal = getPresencesInternal(aVar);
        if (presencesInternal == null) {
            presencesInternal = new ConcurrentHashMap();
            if (contains(aVar)) {
                this.presenceMap.put(aVar, presencesInternal);
            } else {
                this.nonRosterPresenceMap.put(aVar, presencesInternal);
            }
        }
        return presencesInternal;
    }

    private Map<d, Presence> getPresencesInternal(a aVar) {
        Map<d, Presence> map = (Map) this.presenceMap.get(aVar);
        return map == null ? (Map) this.nonRosterPresenceMap.get(aVar) : map;
    }

    private static boolean hasValidSubscriptionType(Item item) {
        switch (item.getItemType()) {
            case none:
            case from:
            case to:
            case both:
                return true;
            default:
                return false;
        }
    }

    private static void move(a aVar, Map<a, Map<d, Presence>> map, Map<a, Map<d, Presence>> map2) {
        Map map3 = (Map) map.remove(aVar);
        if (map3 != null && !map3.isEmpty()) {
            map2.put(aVar, map3);
        }
    }

    private void removeEmptyGroups() {
        for (RosterGroup rosterGroup : getGroups()) {
            if (rosterGroup.getEntryCount() == 0) {
                this.groups.remove(rosterGroup.getName());
            }
        }
    }

    public static void setDefaultNonRosterPresenceMapMaxSize(int i) {
        defaultNonRosterPresenceMapMaxSize = i;
    }

    public static void setDefaultSubscriptionMode(SubscriptionMode subscriptionMode) {
        defaultSubscriptionMode = subscriptionMode;
    }

    private void setOfflinePresences() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = r6.presenceMap;
        r0 = r0.keySet();
        r0 = r0.iterator();
    L_0x000a:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0071;
    L_0x0010:
        r1 = r0.next();
        r1 = (org.b.a.i) r1;
        r2 = r6.presenceMap;
        r2 = r2.get(r1);
        r2 = (java.util.Map) r2;
        if (r2 == 0) goto L_0x000a;
    L_0x0020:
        r2 = r2.keySet();
        r2 = r2.iterator();
    L_0x0028:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x000a;
    L_0x002e:
        r3 = r2.next();
        r3 = (org.b.a.b.d) r3;
        r4 = new org.jivesoftware.smack.packet.Presence;
        r5 = org.jivesoftware.smack.packet.Presence.Type.unavailable;
        r4.<init>(r5);
        r5 = r1.n();
        if (r5 != 0) goto L_0x005a;
    L_0x0041:
        r3 = LOGGER;
        r4 = new java.lang.StringBuilder;
        r5 = "Can not transform user JID to bare JID: '";
        r4.<init>(r5);
        r4.append(r1);
        r5 = "'";
        r4.append(r5);
        r4 = r4.toString();
        r3.warning(r4);
        goto L_0x0028;
    L_0x005a:
        r3 = org.b.a.a.d.a(r5, r3);
        r4.setFrom(r3);
        r3 = r6.presencePacketListener;	 Catch:{ NotConnectedException -> 0x0068, InterruptedException -> 0x0067 }
        r3.processStanza(r4);	 Catch:{ NotConnectedException -> 0x0068, InterruptedException -> 0x0067 }
        goto L_0x0028;
    L_0x0067:
        return;
    L_0x0068:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = "presencePakcetListener should never throw a NotConnectedException when processStanza is called with a presence of type unavailable";
        r1.<init>(r2, r0);
        throw r1;
    L_0x0071:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.roster.Roster.setOfflinePresences():void");
    }

    private void setOfflinePresencesAndResetLoaded() {
        setOfflinePresences();
        this.rosterState = RosterState.uninitialized;
    }

    public static void setRosterLoadedAtLoginDefault(boolean z) {
        rosterLoadedAtLoginDefault = z;
    }

    public final boolean addPresenceEventListener(PresenceEventListener presenceEventListener) {
        return this.presenceEventListeners.add(presenceEventListener);
    }

    public final boolean addRosterListener(RosterListener rosterListener) {
        boolean add;
        synchronized (this.rosterListenersAndEntriesLock) {
            add = this.rosterListeners.add(rosterListener);
        }
        return add;
    }

    public final boolean addRosterLoadedListener(RosterLoadedListener rosterLoadedListener) {
        boolean add;
        synchronized (rosterLoadedListener) {
            add = this.rosterLoadedListeners.add(rosterLoadedListener);
        }
        return add;
    }

    public final boolean addSubscribeListener(SubscribeListener subscribeListener) {
        Objects.requireNonNull(subscribeListener, "SubscribeListener argument must not be null");
        if (this.subscriptionMode != SubscriptionMode.manual) {
            this.previousSubscriptionMode = this.subscriptionMode;
            this.subscriptionMode = SubscriptionMode.manual;
        }
        return this.subscribeListeners.add(subscribeListener);
    }

    public final boolean contains(a aVar) {
        return getEntry(aVar) != null;
    }

    public final void createEntry(a aVar, String str, String[] strArr) {
        XMPPConnection authenticatedConnectionOrThrow = getAuthenticatedConnectionOrThrow();
        IQ rosterPacket = new RosterPacket();
        rosterPacket.setType(Type.set);
        Item item = new Item(aVar, str);
        if (strArr != null) {
            for (String str2 : strArr) {
                if (str2 != null && str2.trim().length() > 0) {
                    item.addGroupName(str2);
                }
            }
        }
        rosterPacket.addRosterItem(item);
        authenticatedConnectionOrThrow.createStanzaCollectorAndSend(rosterPacket).nextResultOrThrow();
        sendSubscriptionRequest(aVar);
    }

    public final RosterGroup createGroup(String str) {
        XMPPConnection connection = connection();
        if (this.groups.containsKey(str)) {
            return (RosterGroup) this.groups.get(str);
        }
        RosterGroup rosterGroup = new RosterGroup(str, connection);
        this.groups.put(str, rosterGroup);
        return rosterGroup;
    }

    public final List<Presence> getAllPresences(a aVar) {
        Map presencesInternal = getPresencesInternal(aVar);
        if (presencesInternal == null) {
            new Presence(Presence.Type.unavailable).setFrom((i) aVar);
            return new ArrayList(Arrays.asList(new Presence[]{r0}));
        }
        List<Presence> arrayList = new ArrayList(presencesInternal.values().size());
        for (Presence clone : presencesInternal.values()) {
            arrayList.add(clone.clone());
        }
        return arrayList;
    }

    public final List<Presence> getAvailablePresences(a aVar) {
        List<Presence> allPresences = getAllPresences(aVar);
        List<Presence> arrayList = new ArrayList(allPresences.size());
        for (Presence presence : allPresences) {
            if (presence.isAvailable()) {
                arrayList.add(presence);
            }
        }
        return arrayList;
    }

    public final Set<RosterEntry> getEntries() {
        Set<RosterEntry> hashSet;
        synchronized (this.rosterListenersAndEntriesLock) {
            hashSet = new HashSet(this.entries.size());
            for (RosterEntry add : this.entries.values()) {
                hashSet.add(add);
            }
        }
        return hashSet;
    }

    public final void getEntriesAndAddListener(RosterListener rosterListener, RosterEntries rosterEntries) {
        Objects.requireNonNull(rosterListener, "listener must not be null");
        Objects.requireNonNull(rosterEntries, "rosterEntries must not be null");
        synchronized (this.rosterListenersAndEntriesLock) {
            rosterEntries.rosterEntries(this.entries.values());
            addRosterListener(rosterListener);
        }
    }

    public final RosterEntry getEntry(a aVar) {
        return aVar == null ? null : (RosterEntry) this.entries.get(aVar);
    }

    public final int getEntryCount() {
        return getEntries().size();
    }

    public final RosterGroup getGroup(String str) {
        return (RosterGroup) this.groups.get(str);
    }

    public final int getGroupCount() {
        return this.groups.size();
    }

    public final Collection<RosterGroup> getGroups() {
        return Collections.unmodifiableCollection(this.groups.values());
    }

    public final Presence getPresence(a aVar) {
        Presence presence;
        Map presencesInternal = getPresencesInternal(aVar);
        if (presencesInternal == null) {
            presence = new Presence(Presence.Type.unavailable);
        } else {
            Presence presence2 = null;
            Presence presence3 = null;
            for (d dVar : presencesInternal.keySet()) {
                Presence presence4 = (Presence) presencesInternal.get(dVar);
                if (presence4.isAvailable()) {
                    if (presence2 != null) {
                        if (presence4.getPriority() <= presence2.getPriority()) {
                            if (presence4.getPriority() == presence2.getPriority()) {
                                Presence.Mode mode = presence4.getMode();
                                if (mode == null) {
                                    mode = Presence.Mode.available;
                                }
                                Enum mode2 = presence2.getMode();
                                if (mode2 == null) {
                                    mode2 = Presence.Mode.available;
                                }
                                if (mode.compareTo(mode2) >= 0) {
                                }
                            }
                        }
                    }
                    presence2 = presence4;
                } else {
                    presence3 = presence4;
                }
            }
            if (presence2 != null) {
                return presence2.clone();
            }
            if (presence3 != null) {
                return presence3.clone();
            }
            presence = new Presence(Presence.Type.unavailable);
        }
        presence.setFrom((i) aVar);
        return presence;
    }

    public final Presence getPresenceResource(h hVar) {
        Presence presence;
        a m = hVar.m();
        d c = hVar.c();
        Map presencesInternal = getPresencesInternal(m);
        if (presencesInternal == null) {
            presence = new Presence(Presence.Type.unavailable);
        } else {
            presence = (Presence) presencesInternal.get(c);
            if (presence != null) {
                return presence.clone();
            }
            presence = new Presence(Presence.Type.unavailable);
        }
        presence.setFrom((i) hVar);
        return presence;
    }

    public final java.util.List<org.jivesoftware.smack.packet.Presence> getPresences(org.b.a.a r8) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0067 in {2, 4, 10, 11, 15, 17, 18} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r7 = this;
        r0 = r7.getPresencesInternal(r8);
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x001b;
    L_0x0008:
        r0 = new org.jivesoftware.smack.packet.Presence;
        r3 = org.jivesoftware.smack.packet.Presence.Type.unavailable;
        r0.<init>(r3);
        r0.setFrom(r8);
        r8 = new org.jivesoftware.smack.packet.Presence[r2];
        r8[r1] = r0;
    L_0x0016:
        r8 = java.util.Arrays.asList(r8);
        return r8;
    L_0x001b:
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = 0;
        r0 = r0.values();
        r0 = r0.iterator();
    L_0x0029:
        r5 = r0.hasNext();
        if (r5 == 0) goto L_0x0045;
    L_0x002f:
        r5 = r0.next();
        r5 = (org.jivesoftware.smack.packet.Presence) r5;
        r6 = r5.isAvailable();
        if (r6 == 0) goto L_0x0043;
    L_0x003b:
        r5 = r5.clone();
        r3.add(r5);
        goto L_0x0029;
    L_0x0043:
        r4 = r5;
        goto L_0x0029;
    L_0x0045:
        r0 = r3.isEmpty();
        if (r0 != 0) goto L_0x004d;
    L_0x004b:
        r8 = r3;
        return r8;
    L_0x004d:
        if (r4 == 0) goto L_0x0058;
    L_0x004f:
        r8 = new org.jivesoftware.smack.packet.Presence[r2];
        r0 = r4.clone();
        r8[r1] = r0;
        goto L_0x0016;
    L_0x0058:
        r0 = new org.jivesoftware.smack.packet.Presence;
        r3 = org.jivesoftware.smack.packet.Presence.Type.unavailable;
        r0.<init>(r3);
        r0.setFrom(r8);
        r8 = new org.jivesoftware.smack.packet.Presence[r2];
        r8[r1] = r0;
        goto L_0x0016;
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.roster.Roster.getPresences(org.b.a.a):java.util.List<org.jivesoftware.smack.packet.Presence>");
    }

    final RosterStore getRosterStore() {
        return this.rosterStore;
    }

    public final SubscriptionMode getSubscriptionMode() {
        return this.subscriptionMode;
    }

    public final Set<RosterEntry> getUnfiledEntries() {
        return Collections.unmodifiableSet(this.unfiledEntries);
    }

    public final int getUnfiledEntryCount() {
        return this.unfiledEntries.size();
    }

    public final boolean iAmSubscribedTo(i iVar) {
        if (iVar == null) {
            return false;
        }
        RosterEntry entry = getEntry(iVar.m());
        return entry == null ? false : entry.canSeeHisPresence();
    }

    public final boolean isLoaded() {
        return this.rosterState == RosterState.loaded;
    }

    public final boolean isRosterLoadedAtLogin() {
        return this.rosterLoadedAtLogin;
    }

    public final boolean isRosterVersioningSupported() {
        return connection().hasFeature(RosterVer.ELEMENT, RosterVer.NAMESPACE);
    }

    public final boolean isSubscribedToMyPresence(i iVar) {
        if (iVar == null) {
            return false;
        }
        Object m = iVar.m();
        if (connection().getXMPPServiceDomain().a(m)) {
            return true;
        }
        RosterEntry entry = getEntry(m);
        return entry == null ? false : entry.canSeeMyPresence();
    }

    public final boolean isSubscriptionPreApprovalSupported() {
        return getAuthenticatedConnectionOrThrow().hasFeature(SubscriptionPreApproval.ELEMENT, SubscriptionPreApproval.NAMESPACE);
    }

    public final void preApprove(a aVar) {
        XMPPConnection connection = connection();
        if (isSubscriptionPreApprovalSupported()) {
            Stanza presence = new Presence(Presence.Type.subscribed);
            presence.setTo((i) aVar);
            connection.sendStanza(presence);
            return;
        }
        throw new FeatureNotSupportedException("Pre-approving");
    }

    public final void preApproveAndCreateEntry(a aVar, String str, String[] strArr) {
        preApprove(aVar);
        createEntry(aVar, str, strArr);
    }

    public final void reload() {
        XMPPConnection authenticatedConnectionOrThrow = getAuthenticatedConnectionOrThrow();
        IQ rosterPacket = new RosterPacket();
        if (this.rosterStore != null && isRosterVersioningSupported()) {
            rosterPacket.setVersion(this.rosterStore.getRosterVersion());
        }
        this.rosterState = RosterState.loading;
        authenticatedConnectionOrThrow.sendIqWithResponseCallback(rosterPacket, new RosterResultListener(), new C78985());
    }

    public final void reloadAndWait() {
        reload();
        waitUntilLoaded();
    }

    public final void removeEntry(RosterEntry rosterEntry) {
        XMPPConnection authenticatedConnectionOrThrow = getAuthenticatedConnectionOrThrow();
        if (this.entries.containsKey(rosterEntry.getJid())) {
            IQ rosterPacket = new RosterPacket();
            rosterPacket.setType(Type.set);
            Item toRosterItem = RosterEntry.toRosterItem(rosterEntry);
            toRosterItem.setItemType(ItemType.remove);
            rosterPacket.addRosterItem(toRosterItem);
            authenticatedConnectionOrThrow.createStanzaCollectorAndSend(rosterPacket).nextResultOrThrow();
        }
    }

    public final boolean removePresenceEventListener(PresenceEventListener presenceEventListener) {
        return this.presenceEventListeners.remove(presenceEventListener);
    }

    public final boolean removeRosterListener(RosterListener rosterListener) {
        boolean remove;
        synchronized (this.rosterListenersAndEntriesLock) {
            remove = this.rosterListeners.remove(rosterListener);
        }
        return remove;
    }

    public final boolean removeRosterLoadedListener(RosterLoadedListener rosterLoadedListener) {
        boolean remove;
        synchronized (rosterLoadedListener) {
            remove = this.rosterLoadedListeners.remove(rosterLoadedListener);
        }
        return remove;
    }

    public final boolean removeSubscribeListener(SubscribeListener subscribeListener) {
        boolean remove = this.subscribeListeners.remove(subscribeListener);
        if (remove && this.subscribeListeners.isEmpty()) {
            setSubscriptionMode(this.previousSubscriptionMode);
        }
        return remove;
    }

    public final void sendSubscriptionRequest(a aVar) {
        XMPPConnection authenticatedConnectionOrThrow = getAuthenticatedConnectionOrThrow();
        Stanza presence = new Presence(Presence.Type.subscribe);
        presence.setTo((i) aVar);
        authenticatedConnectionOrThrow.sendStanza(presence);
    }

    public final void setNonRosterPresenceMapMaxSize(int i) {
        this.nonRosterPresenceMap.a = i;
    }

    public final void setRosterLoadedAtLogin(boolean z) {
        this.rosterLoadedAtLogin = z;
    }

    public final boolean setRosterStore(RosterStore rosterStore) {
        this.rosterStore = rosterStore;
        try {
            reload();
            return true;
        } catch (Throwable e) {
            LOGGER.log(Level.FINER, "Could not reload roster", e);
            return false;
        }
    }

    public final void setSubscriptionMode(SubscriptionMode subscriptionMode) {
        this.subscriptionMode = subscriptionMode;
    }

    protected final boolean waitUntilLoaded() {
        long replyTimeout = connection().getReplyTimeout();
        long currentTimeMillis = System.currentTimeMillis();
        while (!isLoaded() && replyTimeout > 0) {
            synchronized (this) {
                if (!isLoaded()) {
                    wait(replyTimeout);
                }
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            replyTimeout -= currentTimeMillis2 - currentTimeMillis;
            currentTimeMillis = currentTimeMillis2;
        }
        return isLoaded();
    }
}
