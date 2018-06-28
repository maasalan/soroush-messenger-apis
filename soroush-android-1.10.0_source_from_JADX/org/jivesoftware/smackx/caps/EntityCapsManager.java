package org.jivesoftware.smackx.caps;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.a.h;
import org.b.a.i;
import org.b.c.a.c;
import org.jivesoftware.smack.AbstractConnectionListener;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.filter.PresenceTypeFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.roster.AbstractPresenceEventListener;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.stringencoder.Base64;
import org.jivesoftware.smackx.caps.cache.EntityCapsPersistentCache;
import org.jivesoftware.smackx.caps.packet.CapsExtension;
import org.jivesoftware.smackx.disco.AbstractNodeInformationProvider;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo.Feature;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo.Identity;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class EntityCapsManager extends Manager {
    static final c<String, DiscoverInfo> CAPS_CACHE = new c(IjkMediaCodecInfo.RANK_MAX);
    private static String DEFAULT_ENTITY_NODE = "http://www.igniterealtime.org/projects/smack";
    private static final String DEFAULT_HASH = "SHA-1";
    public static final String ELEMENT = "c";
    static final c<i, NodeVerHash> JID_TO_NODEVER_CACHE = new c(10000);
    private static final Logger LOGGER = Logger.getLogger(EntityCapsManager.class.getName());
    public static final String NAMESPACE = "http://jabber.org/protocol/caps";
    private static final StanzaFilter PRESENCES_WITH_CAPS;
    private static final Map<String, MessageDigest> SUPPORTED_HASHES = new HashMap();
    private static boolean autoEnableEntityCaps = true;
    private static Map<XMPPConnection, EntityCapsManager> instances = new WeakHashMap();
    protected static EntityCapsPersistentCache persistentCache;
    private CapsVersionAndHash currentCapsVersion;
    private boolean entityCapsEnabled;
    private String entityNode = DEFAULT_ENTITY_NODE;
    private final Queue<CapsVersionAndHash> lastLocalCapsVersions = new ConcurrentLinkedQueue();
    private volatile Presence presenceSend;
    private final ServiceDiscoveryManager sdm;

    static class C77808 implements Comparator<FormField> {
        C77808() {
        }

        public final int compare(FormField formField, FormField formField2) {
            return formField.getVariable().compareTo(formField2.getVariable());
        }
    }

    public static class NodeVerHash {
        private String hash;
        private String node;
        private String nodeVer;
        private String ver;

        NodeVerHash(String str, String str2, String str3) {
            this.node = str;
            this.ver = str2;
            this.hash = str3;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("#");
            stringBuilder.append(str2);
            this.nodeVer = stringBuilder.toString();
        }

        NodeVerHash(String str, CapsVersionAndHash capsVersionAndHash) {
            this(str, capsVersionAndHash.version, capsVersionAndHash.hash);
        }

        public String getHash() {
            return this.hash;
        }

        public String getNode() {
            return this.node;
        }

        public String getNodeVer() {
            return this.nodeVer;
        }

        public String getVer() {
            return this.ver;
        }
    }

    static class C79101 implements ConnectionCreationListener {
        C79101() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            EntityCapsManager.getInstanceFor(xMPPConnection);
        }
    }

    class C79113 implements StanzaListener {
        C79113() {
        }

        public void processStanza(Stanza stanza) {
            if (EntityCapsManager.this.entityCapsEnabled()) {
                EntityCapsManager.addCapsExtensionInfo(stanza.getFrom(), CapsExtension.from(stanza));
            }
        }
    }

    class C79125 implements StanzaListener {
        C79125() {
        }

        public void processStanza(Stanza stanza) {
            EntityCapsManager.this.presenceSend = (Presence) stanza;
        }
    }

    class C79136 implements StanzaListener {
        C79136() {
        }

        public void processStanza(Stanza stanza) {
            if (EntityCapsManager.this.entityCapsEnabled) {
                CapsVersionAndHash capsVersionAndHash = EntityCapsManager.this.getCapsVersionAndHash();
                stanza.overrideExtension(new CapsExtension(EntityCapsManager.this.entityNode, capsVersionAndHash.version, capsVersionAndHash.hash));
                return;
            }
            stanza.removeExtension("c", "http://jabber.org/protocol/caps");
        }
    }

    class C80102 extends AbstractConnectionListener {
        C80102() {
        }

        private void processCapsStreamFeatureIfAvailable(XMPPConnection xMPPConnection) {
            CapsExtension capsExtension = (CapsExtension) xMPPConnection.getFeature("c", "http://jabber.org/protocol/caps");
            if (capsExtension != null) {
                EntityCapsManager.addCapsExtensionInfo(xMPPConnection.getXMPPServiceDomain(), capsExtension);
            }
        }

        public void authenticated(XMPPConnection xMPPConnection, boolean z) {
            processCapsStreamFeatureIfAvailable(xMPPConnection);
            if (!z) {
                EntityCapsManager.this.presenceSend = null;
            }
        }

        public void connected(XMPPConnection xMPPConnection) {
            processCapsStreamFeatureIfAvailable(xMPPConnection);
        }
    }

    class C80114 extends AbstractPresenceEventListener {
        C80114() {
        }

        public void presenceUnavailable(h hVar, Presence presence) {
            EntityCapsManager.JID_TO_NODEVER_CACHE.remove(hVar);
        }
    }

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = org.jivesoftware.smackx.caps.EntityCapsManager.class;
        r0 = r0.getName();
        r0 = java.util.logging.Logger.getLogger(r0);
        LOGGER = r0;
        r0 = new java.util.HashMap;
        r0.<init>();
        SUPPORTED_HASHES = r0;
        r0 = new java.util.WeakHashMap;
        r0.<init>();
        instances = r0;
        r0 = new org.jivesoftware.smack.filter.AndFilter;
        r1 = 2;
        r1 = new org.jivesoftware.smack.filter.StanzaFilter[r1];
        r2 = new org.jivesoftware.smack.filter.StanzaTypeFilter;
        r3 = org.jivesoftware.smack.packet.Presence.class;
        r2.<init>(r3);
        r3 = 0;
        r1[r3] = r2;
        r2 = new org.jivesoftware.smack.filter.StanzaExtensionFilter;
        r3 = "c";
        r4 = "http://jabber.org/protocol/caps";
        r2.<init>(r3, r4);
        r3 = 1;
        r1[r3] = r2;
        r0.<init>(r1);
        PRESENCES_WITH_CAPS = r0;
        r0 = new org.b.c.a.c;
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0.<init>(r1);
        CAPS_CACHE = r0;
        r0 = new org.b.c.a.c;
        r1 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r0.<init>(r1);
        JID_TO_NODEVER_CACHE = r0;
        r0 = new org.jivesoftware.smackx.caps.EntityCapsManager$1;
        r0.<init>();
        org.jivesoftware.smack.XMPPConnectionRegistry.addConnectionCreationListener(r0);
        r0 = "SHA-1";	 Catch:{ NoSuchAlgorithmException -> 0x0061 }
        r0 = java.security.MessageDigest.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0061 }
        r1 = SUPPORTED_HASHES;	 Catch:{ NoSuchAlgorithmException -> 0x0061 }
        r2 = "SHA-1";	 Catch:{ NoSuchAlgorithmException -> 0x0061 }
        r1.put(r2, r0);	 Catch:{ NoSuchAlgorithmException -> 0x0061 }
    L_0x0061:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.caps.EntityCapsManager.<clinit>():void");
    }

    private EntityCapsManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        this.sdm = ServiceDiscoveryManager.getInstanceFor(xMPPConnection);
        instances.put(xMPPConnection, this);
        xMPPConnection.addConnectionListener(new C80102());
        updateLocalEntityCaps();
        if (autoEnableEntityCaps) {
            enableEntityCaps();
        }
        xMPPConnection.addAsyncStanzaListener(new C79113(), PRESENCES_WITH_CAPS);
        Roster.getInstanceFor(xMPPConnection).addPresenceEventListener(new C80114());
        xMPPConnection.addPacketSendingListener(new C79125(), PresenceTypeFilter.OUTGOING_PRESENCE_BROADCAST);
        xMPPConnection.addPacketInterceptor(new C79136(), PresenceTypeFilter.AVAILABLE);
        this.sdm.setEntityCapsManager(this);
    }

    private static void addCapsExtensionInfo(i iVar, CapsExtension capsExtension) {
        String hash = capsExtension.getHash();
        if (SUPPORTED_HASHES.containsKey(hash.toUpperCase(Locale.US))) {
            hash = hash.toLowerCase(Locale.US);
            JID_TO_NODEVER_CACHE.put(iVar, new NodeVerHash(capsExtension.getNode(), capsExtension.getVer(), hash));
        }
    }

    public static void addDiscoverInfoByNode(String str, DiscoverInfo discoverInfo) {
        CAPS_CACHE.put(str, discoverInfo);
        if (persistentCache != null) {
            persistentCache.addDiscoverInfoByNodePersistent(str, discoverInfo);
        }
    }

    public static void clearMemoryCache() {
        JID_TO_NODEVER_CACHE.clear();
        CAPS_CACHE.clear();
    }

    private static void formFieldValuesToCaps(List<String> list, StringBuilder stringBuilder) {
        SortedSet<String> treeSet = new TreeSet();
        for (String add : list) {
            treeSet.add(add);
        }
        for (String append : treeSet) {
            stringBuilder.append(append);
            stringBuilder.append('<');
        }
    }

    protected static CapsVersionAndHash generateVerificationString(DiscoverInfo discoverInfo) {
        return generateVerificationString(discoverInfo, null);
    }

    protected static CapsVersionAndHash generateVerificationString(DiscoverInfo discoverInfo, String str) {
        if (str == null) {
            str = "SHA-1";
        }
        MessageDigest messageDigest = (MessageDigest) SUPPORTED_HASHES.get(str.toUpperCase(Locale.US));
        FormField formField = null;
        if (messageDigest == null) {
            return null;
        }
        str = str.toLowerCase(Locale.US);
        DataForm from = DataForm.from(discoverInfo);
        StringBuilder stringBuilder = new StringBuilder();
        SortedSet<Identity> treeSet = new TreeSet();
        for (Identity add : discoverInfo.getIdentities()) {
            treeSet.add(add);
        }
        for (Identity identity : treeSet) {
            stringBuilder.append(identity.getCategory());
            stringBuilder.append('/');
            stringBuilder.append(identity.getType());
            stringBuilder.append('/');
            stringBuilder.append(identity.getLanguage() == null ? "" : identity.getLanguage());
            stringBuilder.append('/');
            stringBuilder.append(identity.getName() == null ? "" : identity.getName());
            stringBuilder.append('<');
        }
        SortedSet<String> treeSet2 = new TreeSet();
        for (Feature var : discoverInfo.getFeatures()) {
            treeSet2.add(var.getVar());
        }
        for (String append : treeSet2) {
            stringBuilder.append(append);
            stringBuilder.append('<');
        }
        if (from != null && from.hasHiddenFormTypeField()) {
            synchronized (from) {
                SortedSet<FormField> treeSet3 = new TreeSet(new C77808());
                for (FormField formField2 : from.getFields()) {
                    if (formField2.getVariable().equals(FormField.FORM_TYPE)) {
                        formField = formField2;
                    } else {
                        treeSet3.add(formField2);
                    }
                }
                if (formField != null) {
                    formFieldValuesToCaps(formField.getValues(), stringBuilder);
                }
                for (FormField formField3 : treeSet3) {
                    stringBuilder.append(formField3.getVariable());
                    stringBuilder.append('<');
                    formFieldValuesToCaps(formField3.getValues(), stringBuilder);
                }
            }
        }
        try {
            byte[] bytes = stringBuilder.toString().getBytes(StringUtils.UTF8);
            synchronized (messageDigest) {
                bytes = messageDigest.digest(bytes);
            }
            return new CapsVersionAndHash(Base64.encodeToString(bytes), str);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static DiscoverInfo getDiscoverInfoByUser(i iVar) {
        NodeVerHash nodeVerHash = (NodeVerHash) JID_TO_NODEVER_CACHE.get(iVar);
        return nodeVerHash == null ? null : getDiscoveryInfoByNodeVer(nodeVerHash.nodeVer);
    }

    public static DiscoverInfo getDiscoveryInfoByNodeVer(String str) {
        DiscoverInfo discoverInfo = (DiscoverInfo) CAPS_CACHE.get(str);
        if (discoverInfo == null && persistentCache != null) {
            discoverInfo = persistentCache.lookup(str);
            if (discoverInfo != null) {
                CAPS_CACHE.put(str, discoverInfo);
            }
        }
        return discoverInfo != null ? new DiscoverInfo(discoverInfo) : discoverInfo;
    }

    public static synchronized EntityCapsManager getInstanceFor(XMPPConnection xMPPConnection) {
        EntityCapsManager entityCapsManager;
        synchronized (EntityCapsManager.class) {
            if (SUPPORTED_HASHES.size() <= 0) {
                throw new IllegalStateException("No supported hashes for EntityCapsManager");
            }
            entityCapsManager = (EntityCapsManager) instances.get(xMPPConnection);
            if (entityCapsManager == null) {
                entityCapsManager = new EntityCapsManager(xMPPConnection);
            }
        }
        return entityCapsManager;
    }

    public static NodeVerHash getNodeVerHashByJid(i iVar) {
        return (NodeVerHash) JID_TO_NODEVER_CACHE.get(iVar);
    }

    public static String getNodeVersionByJid(i iVar) {
        NodeVerHash nodeVerHash = (NodeVerHash) JID_TO_NODEVER_CACHE.get(iVar);
        return nodeVerHash != null ? nodeVerHash.nodeVer : null;
    }

    public static void removeUserCapsNode(String str) {
        JID_TO_NODEVER_CACHE.remove(str);
    }

    public static void setDefaultEntityNode(String str) {
        DEFAULT_ENTITY_NODE = str;
    }

    public static void setMaxsCacheSizes(int i, int i2) {
        JID_TO_NODEVER_CACHE.a = i;
        CAPS_CACHE.a = i2;
    }

    public static void setPersistentCache(EntityCapsPersistentCache entityCapsPersistentCache) {
        persistentCache = entityCapsPersistentCache;
    }

    public static boolean verifyDiscoverInfoVersion(String str, String str2, DiscoverInfo discoverInfo) {
        return (discoverInfo.containsDuplicateIdentities() || discoverInfo.containsDuplicateFeatures() || verifyPacketExtensions(discoverInfo) || !str.equals(generateVerificationString(discoverInfo, str2).version)) ? false : true;
    }

    protected static boolean verifyPacketExtensions(DiscoverInfo discoverInfo) {
        List<FormField> linkedList = new LinkedList();
        for (ExtensionElement extensionElement : discoverInfo.getExtensions()) {
            if (extensionElement.getNamespace().equals("jabber:x:data")) {
                for (FormField formField : ((DataForm) extensionElement).getFields()) {
                    if (formField.getVariable().equals(FormField.FORM_TYPE)) {
                        for (FormField equals : linkedList) {
                            if (formField.equals(equals)) {
                                return true;
                            }
                        }
                        linkedList.add(formField);
                    }
                }
                continue;
            }
        }
        return false;
    }

    public final boolean areEntityCapsSupported(i iVar) {
        return this.sdm.supportsFeature(iVar, "http://jabber.org/protocol/caps");
    }

    public final boolean areEntityCapsSupportedByServer() {
        return areEntityCapsSupported(connection().getXMPPServiceDomain());
    }

    public final synchronized void disableEntityCaps() {
        this.entityCapsEnabled = false;
        this.sdm.removeFeature("http://jabber.org/protocol/caps");
    }

    public final synchronized void enableEntityCaps() {
        this.sdm.addFeature("http://jabber.org/protocol/caps");
        updateLocalEntityCaps();
        this.entityCapsEnabled = true;
    }

    public final boolean entityCapsEnabled() {
        return this.entityCapsEnabled;
    }

    public final CapsVersionAndHash getCapsVersionAndHash() {
        return this.currentCapsVersion;
    }

    public final String getLocalNodeVer() {
        CapsVersionAndHash capsVersionAndHash = getCapsVersionAndHash();
        if (capsVersionAndHash == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.entityNode);
        stringBuilder.append('#');
        stringBuilder.append(capsVersionAndHash.version);
        return stringBuilder.toString();
    }

    public final void setEntityNode(String str) {
        this.entityNode = str;
        updateLocalEntityCaps();
    }

    public final void updateLocalEntityCaps() {
        XMPPConnection connection = connection();
        DiscoverInfo discoverInfo = new DiscoverInfo();
        discoverInfo.setType(Type.result);
        this.sdm.addDiscoverInfoTo(discoverInfo);
        this.currentCapsVersion = generateVerificationString(discoverInfo);
        String localNodeVer = getLocalNodeVer();
        discoverInfo.setNode(localNodeVer);
        addDiscoverInfoByNode(localNodeVer, discoverInfo);
        if (this.lastLocalCapsVersions.size() > 10) {
            CapsVersionAndHash capsVersionAndHash = (CapsVersionAndHash) this.lastLocalCapsVersions.poll();
            ServiceDiscoveryManager serviceDiscoveryManager = this.sdm;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.entityNode);
            stringBuilder.append('#');
            stringBuilder.append(capsVersionAndHash.version);
            serviceDiscoveryManager.removeNodeInformationProvider(stringBuilder.toString());
        }
        this.lastLocalCapsVersions.add(this.currentCapsVersion);
        if (connection != null) {
            JID_TO_NODEVER_CACHE.put(connection.getUser(), new NodeVerHash(this.entityNode, this.currentCapsVersion));
        }
        final List linkedList = new LinkedList(ServiceDiscoveryManager.getInstanceFor(connection).getIdentities());
        this.sdm.setNodeInformationProvider(localNodeVer, new AbstractNodeInformationProvider() {
            List<String> features = EntityCapsManager.this.sdm.getFeatures();
            List<ExtensionElement> packetExtensions = EntityCapsManager.this.sdm.getExtendedInfoAsList();

            public List<String> getNodeFeatures() {
                return this.features;
            }

            public List<Identity> getNodeIdentities() {
                return linkedList;
            }

            public List<ExtensionElement> getNodePacketExtensions() {
                return this.packetExtensions;
            }
        });
        if (!(connection == null || !connection.isAuthenticated() || this.presenceSend == null)) {
            try {
                connection.sendStanza(this.presenceSend.cloneWithNewId());
            } catch (Throwable e) {
                LOGGER.log(Level.WARNING, "Could could not update presence with caps info", e);
            }
        }
    }
}
