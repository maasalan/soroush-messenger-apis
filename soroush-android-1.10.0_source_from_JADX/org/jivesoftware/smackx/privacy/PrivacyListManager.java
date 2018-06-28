package org.jivesoftware.smackx.privacy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jivesoftware.smack.AbstractConnectionListener;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.IQResultReplyFilter;
import org.jivesoftware.smack.filter.IQTypeFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.privacy.filter.SetActiveListFilter;
import org.jivesoftware.smackx.privacy.filter.SetDefaultListFilter;
import org.jivesoftware.smackx.privacy.packet.Privacy;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;

public final class PrivacyListManager extends Manager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Map<XMPPConnection, PrivacyListManager> INSTANCES = new WeakHashMap();
    public static final String NAMESPACE = "jabber:iq:privacy";
    public static final StanzaFilter PRIVACY_FILTER = new StanzaTypeFilter(Privacy.class);
    private static final StanzaFilter PRIVACY_RESULT = new AndFilter(IQTypeFilter.RESULT, PRIVACY_FILTER);
    private volatile String cachedActiveListName;
    private volatile String cachedDefaultListName;
    private final Set<PrivacyListListener> listeners = new CopyOnWriteArraySet();

    static class C79521 implements ConnectionCreationListener {
        C79521() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            PrivacyListManager.getInstanceFor(xMPPConnection);
        }
    }

    class C79543 implements StanzaListener {
        C79543() {
        }

        public void processStanza(Stanza stanza) {
            XMPPConnection access$100 = PrivacyListManager.this.connection();
            Privacy privacy = (Privacy) stanza;
            StanzaFilter iQResultReplyFilter = new IQResultReplyFilter(privacy, access$100);
            final String activeName = privacy.getActiveName();
            final boolean isDeclineActiveList = privacy.isDeclineActiveList();
            access$100.addOneTimeSyncCallback(new StanzaListener() {
                public void processStanza(Stanza stanza) {
                    PrivacyListManager privacyListManager;
                    String str;
                    if (isDeclineActiveList) {
                        privacyListManager = PrivacyListManager.this;
                        str = null;
                    } else {
                        privacyListManager = PrivacyListManager.this;
                        str = activeName;
                    }
                    privacyListManager.cachedActiveListName = str;
                }
            }, iQResultReplyFilter);
        }
    }

    class C79564 implements StanzaListener {
        C79564() {
        }

        public void processStanza(Stanza stanza) {
            XMPPConnection access$300 = PrivacyListManager.this.connection();
            Privacy privacy = (Privacy) stanza;
            StanzaFilter iQResultReplyFilter = new IQResultReplyFilter(privacy, access$300);
            final String defaultName = privacy.getDefaultName();
            final boolean isDeclineDefaultList = privacy.isDeclineDefaultList();
            access$300.addOneTimeSyncCallback(new StanzaListener() {
                public void processStanza(Stanza stanza) {
                    PrivacyListManager privacyListManager;
                    String str;
                    if (isDeclineDefaultList) {
                        privacyListManager = PrivacyListManager.this;
                        str = null;
                    } else {
                        privacyListManager = PrivacyListManager.this;
                        str = defaultName;
                    }
                    privacyListManager.cachedDefaultListName = str;
                }
            }, iQResultReplyFilter);
        }
    }

    class C79575 implements StanzaListener {
        C79575() {
        }

        public void processStanza(Stanza stanza) {
            Privacy privacy = (Privacy) stanza;
            String activeName = privacy.getActiveName();
            if (activeName != null) {
                PrivacyListManager.this.cachedActiveListName = activeName;
            }
            String defaultName = privacy.getDefaultName();
            if (defaultName != null) {
                PrivacyListManager.this.cachedDefaultListName = defaultName;
            }
        }
    }

    class C80336 extends AbstractConnectionListener {
        C80336() {
        }

        public void authenticated(XMPPConnection xMPPConnection, boolean z) {
            if (!z) {
                PrivacyListManager.this.cachedActiveListName = PrivacyListManager.this.cachedDefaultListName = null;
            }
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79521());
    }

    private PrivacyListManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        xMPPConnection.registerIQRequestHandler(new AbstractIqRequestHandler("query", "jabber:iq:privacy", Type.set, Mode.sync) {
            public IQ handleIQRequest(IQ iq) {
                Privacy privacy = (Privacy) iq;
                for (PrivacyListListener privacyListListener : PrivacyListManager.this.listeners) {
                    for (Entry entry : privacy.getItemLists().entrySet()) {
                        String str = (String) entry.getKey();
                        List list = (List) entry.getValue();
                        if (list.isEmpty()) {
                            privacyListListener.updatedPrivacyList(str);
                        } else {
                            privacyListListener.setPrivacyList(str, list);
                        }
                    }
                }
                return IQ.createResultIQ(privacy);
            }
        });
        xMPPConnection.addPacketSendingListener(new C79543(), SetActiveListFilter.INSTANCE);
        xMPPConnection.addPacketSendingListener(new C79564(), SetDefaultListFilter.INSTANCE);
        xMPPConnection.addSyncStanzaListener(new C79575(), PRIVACY_RESULT);
        xMPPConnection.addConnectionListener(new C80336());
        ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature("jabber:iq:privacy");
    }

    public static synchronized PrivacyListManager getInstanceFor(XMPPConnection xMPPConnection) {
        PrivacyListManager privacyListManager;
        synchronized (PrivacyListManager.class) {
            privacyListManager = (PrivacyListManager) INSTANCES.get(xMPPConnection);
            if (privacyListManager == null) {
                privacyListManager = new PrivacyListManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, privacyListManager);
            }
        }
        return privacyListManager;
    }

    private List<PrivacyItem> getPrivacyListItems(String str) {
        Privacy privacy = new Privacy();
        privacy.setPrivacyList(str, new ArrayList());
        return getRequest(privacy).getPrivacyList(str);
    }

    private Privacy getPrivacyWithListNames() {
        return getRequest(new Privacy());
    }

    private Privacy getRequest(Privacy privacy) {
        privacy.setType(Type.get);
        return (Privacy) connection().createStanzaCollectorAndSend(privacy).nextResultOrThrow();
    }

    private Stanza setRequest(Privacy privacy) {
        privacy.setType(Type.set);
        return connection().createStanzaCollectorAndSend(privacy).nextResultOrThrow();
    }

    public final boolean addListener(PrivacyListListener privacyListListener) {
        return this.listeners.add(privacyListListener);
    }

    public final void createPrivacyList(String str, List<PrivacyItem> list) {
        updatePrivacyList(str, list);
    }

    public final void declineActiveList() {
        Privacy privacy = new Privacy();
        privacy.setDeclineActiveList(true);
        setRequest(privacy);
    }

    public final void declineDefaultList() {
        Privacy privacy = new Privacy();
        privacy.setDeclineDefaultList(true);
        setRequest(privacy);
    }

    public final void deletePrivacyList(String str) {
        Privacy privacy = new Privacy();
        privacy.setPrivacyList(str, new ArrayList());
        setRequest(privacy);
    }

    public final PrivacyList getActiveList() {
        Privacy privacyWithListNames = getPrivacyWithListNames();
        CharSequence activeName = privacyWithListNames.getActiveName();
        if (StringUtils.isNullOrEmpty(activeName)) {
            return null;
        }
        boolean z = activeName != null && activeName.equals(privacyWithListNames.getDefaultName());
        return new PrivacyList(true, z, activeName, getPrivacyListItems(activeName));
    }

    public final String getActiveListName() {
        return this.cachedActiveListName != null ? this.cachedActiveListName : getPrivacyWithListNames().getActiveName();
    }

    public final PrivacyList getDefaultList() {
        Privacy privacyWithListNames = getPrivacyWithListNames();
        CharSequence defaultName = privacyWithListNames.getDefaultName();
        return StringUtils.isNullOrEmpty(defaultName) ? null : new PrivacyList(defaultName.equals(privacyWithListNames.getActiveName()), true, defaultName, getPrivacyListItems(defaultName));
    }

    public final String getDefaultListName() {
        return this.cachedDefaultListName != null ? this.cachedDefaultListName : getPrivacyWithListNames().getDefaultName();
    }

    public final String getEffectiveListName() {
        String activeListName = getActiveListName();
        return activeListName != null ? activeListName : getDefaultListName();
    }

    public final PrivacyList getPrivacyList(String str) {
        str = (String) StringUtils.requireNotNullOrEmpty(str, "List name must not be null");
        return new PrivacyList(false, false, str, getPrivacyListItems(str));
    }

    public final List<PrivacyList> getPrivacyLists() {
        Privacy privacyWithListNames = getPrivacyWithListNames();
        Set<String> privacyListNames = privacyWithListNames.getPrivacyListNames();
        List<PrivacyList> arrayList = new ArrayList(privacyListNames.size());
        for (String str : privacyListNames) {
            arrayList.add(new PrivacyList(str.equals(privacyWithListNames.getActiveName()), str.equals(privacyWithListNames.getDefaultName()), str, getPrivacyListItems(str)));
        }
        return arrayList;
    }

    public final boolean isSupported() {
        return ServiceDiscoveryManager.getInstanceFor(connection()).serverSupportsFeature("jabber:iq:privacy");
    }

    public final boolean removeListener(PrivacyListListener privacyListListener) {
        return this.listeners.remove(privacyListListener);
    }

    public final void setActiveListName(String str) {
        Privacy privacy = new Privacy();
        privacy.setActiveName(str);
        setRequest(privacy);
    }

    public final void setDefaultListName(String str) {
        Privacy privacy = new Privacy();
        privacy.setDefaultName(str);
        setRequest(privacy);
    }

    public final void updatePrivacyList(String str, List<PrivacyItem> list) {
        Privacy privacy = new Privacy();
        privacy.setPrivacyList(str, list);
        setRequest(privacy);
    }
}
