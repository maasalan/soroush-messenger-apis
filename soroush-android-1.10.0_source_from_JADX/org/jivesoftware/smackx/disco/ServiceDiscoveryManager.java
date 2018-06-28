package org.jivesoftware.smackx.disco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.a.i;
import org.b.c.a.a;
import org.b.c.a.b;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smackx.caps.EntityCapsManager;
import org.jivesoftware.smackx.caps.EntityCapsManager.NodeVerHash;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo.Identity;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.jivesoftware.smackx.disco.packet.DiscoverItems.Item;
import org.jivesoftware.smackx.xdata.packet.DataForm;

public final class ServiceDiscoveryManager extends Manager {
    private static final String DEFAULT_IDENTITY_CATEGORY = "client";
    private static final String DEFAULT_IDENTITY_NAME = "Smack";
    private static final String DEFAULT_IDENTITY_TYPE = "pc";
    private static final Logger LOGGER = Logger.getLogger(ServiceDiscoveryManager.class.getName());
    private static Identity defaultIdentity = new Identity(DEFAULT_IDENTITY_CATEGORY, DEFAULT_IDENTITY_NAME, DEFAULT_IDENTITY_TYPE);
    private static Map<XMPPConnection, ServiceDiscoveryManager> instances = new WeakHashMap();
    private EntityCapsManager capsManager;
    private DataForm extendedInfo = null;
    private final Set<String> features = new HashSet();
    private Set<Identity> identities = new HashSet();
    private Identity identity = defaultIdentity;
    private Map<String, NodeInformationProvider> nodeInformationProviders = new ConcurrentHashMap();
    private a<String, List<DiscoverInfo>> services = new b(25, 86400000);

    static class C79201 implements ConnectionCreationListener {
        C79201() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            ServiceDiscoveryManager.getInstanceFor(xMPPConnection);
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79201());
    }

    private ServiceDiscoveryManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        addFeature(DiscoverInfo.NAMESPACE);
        addFeature(DiscoverItems.NAMESPACE);
        xMPPConnection.registerIQRequestHandler(new AbstractIqRequestHandler("query", DiscoverItems.NAMESPACE, Type.get, Mode.async) {
            public IQ handleIQRequest(IQ iq) {
                DiscoverItems discoverItems = (DiscoverItems) iq;
                IQ discoverItems2 = new DiscoverItems();
                discoverItems2.setType(Type.result);
                discoverItems2.setTo(discoverItems.getFrom());
                discoverItems2.setStanzaId(discoverItems.getStanzaId());
                discoverItems2.setNode(discoverItems.getNode());
                NodeInformationProvider access$000 = ServiceDiscoveryManager.this.getNodeInformationProvider(discoverItems.getNode());
                if (access$000 != null) {
                    discoverItems2.addItems(access$000.getNodeItems());
                    discoverItems2.addExtensions(access$000.getNodePacketExtensions());
                    return discoverItems2;
                }
                if (discoverItems.getNode() != null) {
                    discoverItems2.setType(Type.error);
                    discoverItems2.setError(XMPPError.getBuilder(Condition.item_not_found));
                }
                return discoverItems2;
            }
        });
        xMPPConnection.registerIQRequestHandler(new AbstractIqRequestHandler("query", DiscoverInfo.NAMESPACE, Type.get, Mode.async) {
            public IQ handleIQRequest(IQ iq) {
                DiscoverInfo discoverInfo = (DiscoverInfo) iq;
                IQ discoverInfo2 = new DiscoverInfo();
                discoverInfo2.setType(Type.result);
                discoverInfo2.setTo(discoverInfo.getFrom());
                discoverInfo2.setStanzaId(discoverInfo.getStanzaId());
                discoverInfo2.setNode(discoverInfo.getNode());
                if (discoverInfo.getNode() == null) {
                    ServiceDiscoveryManager.this.addDiscoverInfoTo(discoverInfo2);
                    return discoverInfo2;
                }
                NodeInformationProvider access$000 = ServiceDiscoveryManager.this.getNodeInformationProvider(discoverInfo.getNode());
                if (access$000 != null) {
                    discoverInfo2.addFeatures(access$000.getNodeFeatures());
                    discoverInfo2.addIdentities(access$000.getNodeIdentities());
                    discoverInfo2.addExtensions(access$000.getNodePacketExtensions());
                    return discoverInfo2;
                }
                discoverInfo2.setType(Type.error);
                discoverInfo2.setError(XMPPError.getBuilder(Condition.item_not_found));
                return discoverInfo2;
            }
        });
    }

    public static boolean canPublishItems(DiscoverInfo discoverInfo) {
        return discoverInfo.containsFeature("http://jabber.org/protocol/disco#publish");
    }

    public static synchronized ServiceDiscoveryManager getInstanceFor(XMPPConnection xMPPConnection) {
        ServiceDiscoveryManager serviceDiscoveryManager;
        synchronized (ServiceDiscoveryManager.class) {
            serviceDiscoveryManager = (ServiceDiscoveryManager) instances.get(xMPPConnection);
            if (serviceDiscoveryManager == null) {
                serviceDiscoveryManager = new ServiceDiscoveryManager(xMPPConnection);
                instances.put(xMPPConnection, serviceDiscoveryManager);
            }
        }
        return serviceDiscoveryManager;
    }

    private NodeInformationProvider getNodeInformationProvider(String str) {
        return str == null ? null : (NodeInformationProvider) this.nodeInformationProviders.get(str);
    }

    private void renewEntityCapsVersion() {
        if (this.capsManager != null && this.capsManager.entityCapsEnabled()) {
            this.capsManager.updateLocalEntityCaps();
        }
    }

    public static void setDefaultIdentity(Identity identity) {
        defaultIdentity = identity;
    }

    public final synchronized void addDiscoverInfoTo(DiscoverInfo discoverInfo) {
        discoverInfo.addIdentities(getIdentities());
        for (String addFeature : getFeatures()) {
            discoverInfo.addFeature(addFeature);
        }
        discoverInfo.addExtension(this.extendedInfo);
    }

    public final synchronized void addFeature(String str) {
        this.features.add(str);
        renewEntityCapsVersion();
    }

    public final synchronized void addIdentity(Identity identity) {
        this.identities.add(identity);
        renewEntityCapsVersion();
    }

    public final boolean canPublishItems(i iVar) {
        return canPublishItems(discoverInfo(iVar));
    }

    public final DiscoverInfo discoverInfo(i iVar) {
        String str = null;
        if (iVar == null) {
            return discoverInfo(null, null);
        }
        DiscoverInfo discoverInfoByUser = EntityCapsManager.getDiscoverInfoByUser(iVar);
        if (discoverInfoByUser != null) {
            return discoverInfoByUser;
        }
        NodeVerHash nodeVerHashByJid = EntityCapsManager.getNodeVerHashByJid(iVar);
        if (nodeVerHashByJid != null) {
            str = nodeVerHashByJid.getNodeVer();
        }
        DiscoverInfo discoverInfo = discoverInfo(iVar, str);
        if (nodeVerHashByJid != null && EntityCapsManager.verifyDiscoverInfoVersion(nodeVerHashByJid.getVer(), nodeVerHashByJid.getHash(), discoverInfo)) {
            EntityCapsManager.addDiscoverInfoByNode(nodeVerHashByJid.getNodeVer(), discoverInfo);
        }
        return discoverInfo;
    }

    public final DiscoverInfo discoverInfo(i iVar, String str) {
        IQ discoverInfo = new DiscoverInfo();
        discoverInfo.setType(Type.get);
        discoverInfo.setTo(iVar);
        discoverInfo.setNode(str);
        return (DiscoverInfo) connection().createStanzaCollectorAndSend(discoverInfo).nextResultOrThrow();
    }

    public final DiscoverItems discoverItems(i iVar) {
        return discoverItems(iVar, null);
    }

    public final DiscoverItems discoverItems(i iVar, String str) {
        IQ discoverItems = new DiscoverItems();
        discoverItems.setType(Type.get);
        discoverItems.setTo(iVar);
        discoverItems.setNode(str);
        return (DiscoverItems) connection().createStanzaCollectorAndSend(discoverItems).nextResultOrThrow();
    }

    public final org.b.a.b findService(String str, boolean z) {
        return findService(str, z, null, null);
    }

    public final org.b.a.b findService(String str, boolean z, String str2, String str3) {
        List findServicesDiscoverInfo = findServicesDiscoverInfo(str, true, z);
        if (findServicesDiscoverInfo.isEmpty()) {
            return null;
        }
        DiscoverInfo discoverInfo = (DiscoverInfo) findServicesDiscoverInfo.get(0);
        if (str2 == null || str3 == null) {
            if (str2 == null) {
                if (str3 != null) {
                }
            }
            throw new IllegalArgumentException("Must specify either both, category and type, or none");
        } else if (!discoverInfo.hasIdentity(str2, str3)) {
            return null;
        }
        return discoverInfo.getFrom().t();
    }

    public final List<org.b.a.b> findServices(String str, boolean z, boolean z2) {
        List<DiscoverInfo> findServicesDiscoverInfo = findServicesDiscoverInfo(str, z, z2);
        List<org.b.a.b> arrayList = new ArrayList(findServicesDiscoverInfo.size());
        for (DiscoverInfo from : findServicesDiscoverInfo) {
            arrayList.add(from.getFrom().t());
        }
        return arrayList;
    }

    public final List<DiscoverInfo> findServicesDiscoverInfo(String str, boolean z, boolean z2) {
        List<DiscoverInfo> list;
        Throwable e;
        Logger logger;
        Level level;
        String str2;
        i xMPPServiceDomain = connection().getXMPPServiceDomain();
        if (z2) {
            list = (List) this.services.a(str);
            if (list != null) {
                return list;
            }
        }
        list = new LinkedList();
        try {
            DiscoverInfo discoverInfo = discoverInfo(xMPPServiceDomain);
            if (discoverInfo.containsFeature(str)) {
                list.add(discoverInfo);
                if (z) {
                    if (z2) {
                        this.services.put(str, list);
                    }
                    return list;
                }
            }
            try {
                for (Item item : discoverItems(xMPPServiceDomain).getItems()) {
                    try {
                        DiscoverInfo discoverInfo2 = discoverInfo(item.getEntityID());
                        if (discoverInfo2.containsFeature(str)) {
                            list.add(discoverInfo2);
                            if (z) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } catch (Throwable e2) {
                        Logger logger2 = LOGGER;
                        Level level2 = Level.WARNING;
                        StringBuilder stringBuilder = new StringBuilder("Exception while discovering info for feature ");
                        stringBuilder.append(str);
                        stringBuilder.append(" of ");
                        stringBuilder.append(item.getEntityID());
                        stringBuilder.append(" node: ");
                        stringBuilder.append(item.getNode());
                        logger2.log(level2, stringBuilder.toString(), e2);
                    }
                }
                if (z2) {
                    this.services.put(str, list);
                }
                return list;
            } catch (XMPPErrorException e3) {
                e = e3;
                logger = LOGGER;
                level = Level.WARNING;
                str2 = "Could not discover items about service";
                logger.log(level, str2, e);
                return list;
            }
        } catch (XMPPErrorException e4) {
            e = e4;
            logger = LOGGER;
            level = Level.WARNING;
            str2 = "Could not discover information about service";
            logger.log(level, str2, e);
            return list;
        }
    }

    public final DataForm getExtendedInfo() {
        return this.extendedInfo;
    }

    public final List<ExtensionElement> getExtendedInfoAsList() {
        if (this.extendedInfo == null) {
            return null;
        }
        List<ExtensionElement> arrayList = new ArrayList(1);
        arrayList.add(this.extendedInfo);
        return arrayList;
    }

    public final synchronized List<String> getFeatures() {
        return new ArrayList(this.features);
    }

    public final Set<Identity> getIdentities() {
        Set hashSet = new HashSet(this.identities);
        hashSet.add(defaultIdentity);
        return Collections.unmodifiableSet(hashSet);
    }

    public final Identity getIdentity() {
        return this.identity;
    }

    public final String getIdentityName() {
        return this.identity.getName();
    }

    public final String getIdentityType() {
        return this.identity.getType();
    }

    public final synchronized boolean includesFeature(String str) {
        return this.features.contains(str);
    }

    public final void publishItems(i iVar, String str, DiscoverItems discoverItems) {
        discoverItems.setType(Type.set);
        discoverItems.setTo(iVar);
        discoverItems.setNode(str);
        connection().createStanzaCollectorAndSend(discoverItems).nextResultOrThrow();
    }

    public final void publishItems(i iVar, DiscoverItems discoverItems) {
        publishItems(iVar, null, discoverItems);
    }

    public final synchronized void removeExtendedInfo() {
        this.extendedInfo = null;
        renewEntityCapsVersion();
    }

    public final synchronized void removeFeature(String str) {
        this.features.remove(str);
        renewEntityCapsVersion();
    }

    public final synchronized boolean removeIdentity(Identity identity) {
        boolean z;
        if (identity.equals(this.identity)) {
            z = false;
        } else {
            this.identities.remove(identity);
            renewEntityCapsVersion();
            z = true;
        }
        return z;
    }

    public final void removeNodeInformationProvider(String str) {
        this.nodeInformationProviders.remove(str);
    }

    public final boolean serverSupportsFeature(CharSequence charSequence) {
        return serverSupportsFeatures(charSequence);
    }

    public final boolean serverSupportsFeatures(Collection<? extends CharSequence> collection) {
        return supportsFeatures(connection().getXMPPServiceDomain(), (Collection) collection);
    }

    public final boolean serverSupportsFeatures(CharSequence... charSequenceArr) {
        return serverSupportsFeatures(Arrays.asList(charSequenceArr));
    }

    public final void setEntityCapsManager(EntityCapsManager entityCapsManager) {
        this.capsManager = entityCapsManager;
    }

    public final synchronized void setExtendedInfo(DataForm dataForm) {
        this.extendedInfo = dataForm;
        renewEntityCapsVersion();
    }

    public final synchronized void setIdentity(Identity identity) {
        this.identity = (Identity) Objects.requireNonNull(identity, "Identity can not be null");
        renewEntityCapsVersion();
    }

    public final void setNodeInformationProvider(String str, NodeInformationProvider nodeInformationProvider) {
        this.nodeInformationProviders.put(str, nodeInformationProvider);
    }

    public final boolean supportsFeature(i iVar, CharSequence charSequence) {
        return supportsFeatures(iVar, charSequence);
    }

    public final boolean supportsFeatures(i iVar, Collection<? extends CharSequence> collection) {
        DiscoverInfo discoverInfo = discoverInfo(iVar);
        for (CharSequence containsFeature : collection) {
            if (!discoverInfo.containsFeature(containsFeature)) {
                return false;
            }
        }
        return true;
    }

    public final boolean supportsFeatures(i iVar, CharSequence... charSequenceArr) {
        return supportsFeatures(iVar, Arrays.asList(charSequenceArr));
    }
}
