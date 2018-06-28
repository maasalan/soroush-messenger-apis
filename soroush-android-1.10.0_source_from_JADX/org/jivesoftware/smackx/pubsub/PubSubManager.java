package org.jivesoftware.smackx.pubsub;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.a.a;
import org.b.a.a.d;
import org.b.a.b;
import org.b.a.i;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.EmptyResultIQ;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.jivesoftware.smackx.pubsub.packet.PubSub;
import org.jivesoftware.smackx.pubsub.packet.PubSubNamespace;
import org.jivesoftware.smackx.pubsub.util.NodeUtils;
import org.jivesoftware.smackx.xdata.Form;
import org.jivesoftware.smackx.xdata.FormField;

public final class PubSubManager extends Manager {
    private static final Map<XMPPConnection, Map<a, PubSubManager>> INSTANCES = new WeakHashMap();
    private static final Logger LOGGER = Logger.getLogger(PubSubManager.class.getName());
    private final Map<String, Node> nodeMap = new ConcurrentHashMap();
    private final a pubSubService;

    PubSubManager(XMPPConnection xMPPConnection, a aVar) {
        super(xMPPConnection);
        this.pubSubService = aVar;
    }

    public static PubSubManager getInstance(XMPPConnection xMPPConnection) {
        a pubSubService;
        Throwable e;
        Logger logger;
        Level level;
        String str;
        StringBuilder stringBuilder;
        if (xMPPConnection.isAuthenticated()) {
            try {
                pubSubService = getPubSubService(xMPPConnection);
            } catch (NoResponseException e2) {
                e = e2;
                logger = LOGGER;
                level = Level.WARNING;
                str = "Could not determine PubSub service";
                logger.log(level, str, e);
                pubSubService = null;
                if (pubSubService == null) {
                    try {
                        stringBuilder = new StringBuilder("pubsub.");
                        stringBuilder.append(xMPPConnection.getXMPPServiceDomain());
                        pubSubService = d.e(stringBuilder.toString());
                    } catch (Throwable e3) {
                        throw new RuntimeException(e3);
                    }
                }
                return getInstance(xMPPConnection, pubSubService);
            } catch (InterruptedException e4) {
                e = e4;
                logger = LOGGER;
                level = Level.FINE;
                str = "Interupted while trying to determine PubSub service";
                logger.log(level, str, e);
                pubSubService = null;
                if (pubSubService == null) {
                    stringBuilder = new StringBuilder("pubsub.");
                    stringBuilder.append(xMPPConnection.getXMPPServiceDomain());
                    pubSubService = d.e(stringBuilder.toString());
                }
                return getInstance(xMPPConnection, pubSubService);
            }
            if (pubSubService == null) {
                stringBuilder = new StringBuilder("pubsub.");
                stringBuilder.append(xMPPConnection.getXMPPServiceDomain());
                pubSubService = d.e(stringBuilder.toString());
            }
            return getInstance(xMPPConnection, pubSubService);
        }
        pubSubService = null;
        if (pubSubService == null) {
            stringBuilder = new StringBuilder("pubsub.");
            stringBuilder.append(xMPPConnection.getXMPPServiceDomain());
            pubSubService = d.e(stringBuilder.toString());
        }
        return getInstance(xMPPConnection, pubSubService);
    }

    public static synchronized PubSubManager getInstance(XMPPConnection xMPPConnection, a aVar) {
        PubSubManager pubSubManager;
        synchronized (PubSubManager.class) {
            Map map = (Map) INSTANCES.get(xMPPConnection);
            if (map == null) {
                map = new HashMap();
                INSTANCES.put(xMPPConnection, map);
            }
            pubSubManager = (PubSubManager) map.get(aVar);
            if (pubSubManager == null) {
                pubSubManager = new PubSubManager(xMPPConnection, aVar);
                map.put(aVar, pubSubManager);
            }
        }
        return pubSubManager;
    }

    public static b getPubSubService(XMPPConnection xMPPConnection) {
        return ServiceDiscoveryManager.getInstanceFor(xMPPConnection).findService("http://jabber.org/protocol/pubsub", true, "pubsub", "service");
    }

    private PubSub sendPubsubPacket(Type type, ExtensionElement extensionElement, PubSubNamespace pubSubNamespace) {
        return sendPubsubPacket(this.pubSubService, type, Collections.singletonList(extensionElement), pubSubNamespace);
    }

    public final boolean canCreateNodesAndPublishItems() {
        try {
            LeafNode createNode = createNode();
            if (createNode != null) {
                deleteNode(createNode.getId());
            }
            return true;
        } catch (XMPPErrorException e) {
            if (e.getXMPPError().getCondition() == Condition.forbidden) {
                return false;
            }
            throw e;
        }
    }

    public final LeafNode createNode() {
        LeafNode leafNode = new LeafNode(this, ((NodeExtension) sendPubsubPacket(Type.set, new NodeExtension(PubSubElementType.CREATE), null).getExtension("create", PubSubNamespace.BASIC.getXmlns())).getNode());
        this.nodeMap.put(leafNode.getId(), leafNode);
        return leafNode;
    }

    public final LeafNode createNode(String str) {
        return (LeafNode) createNode(str, null);
    }

    public final Node createNode(String str, Form form) {
        boolean equals;
        Node leafNode;
        PubSub createPubsubPacket = PubSub.createPubsubPacket(this.pubSubService, Type.set, new NodeExtension(PubSubElementType.CREATE, str), null);
        if (form != null) {
            createPubsubPacket.addExtension(new FormNode(FormNodeType.CONFIGURE, form));
            FormField field = form.getField(ConfigureNodeFields.node_type.getFieldName());
            if (field != null) {
                equals = ((String) field.getValues().get(0)).equals(NodeType.leaf.toString());
                sendPubsubPacket(createPubsubPacket);
                leafNode = equals ? new LeafNode(this, str) : new CollectionNode(this, str);
                this.nodeMap.put(leafNode.getId(), leafNode);
                return leafNode;
            }
        }
        equals = true;
        sendPubsubPacket(createPubsubPacket);
        if (equals) {
        }
        this.nodeMap.put(leafNode.getId(), leafNode);
        return leafNode;
    }

    public final void deleteNode(String str) {
        sendPubsubPacket(Type.set, new NodeExtension(PubSubElementType.DELETE, str), PubSubElementType.DELETE.getNamespace());
        this.nodeMap.remove(str);
    }

    public final DiscoverItems discoverNodes(String str) {
        IQ discoverItems = new DiscoverItems();
        if (str != null) {
            discoverItems.setNode(str);
        }
        discoverItems.setTo(this.pubSubService);
        return (DiscoverItems) connection().createStanzaCollectorAndSend(discoverItems).nextResultOrThrow();
    }

    public final List<Affiliation> getAffiliations() {
        return ((AffiliationsExtension) sendPubsubPacket(Type.get, new NodeExtension(PubSubElementType.AFFILIATIONS), null).getExtension(PubSubElementType.AFFILIATIONS)).getAffiliations();
    }

    final XMPPConnection getConnection() {
        return connection();
    }

    public final ConfigureForm getDefaultConfiguration() {
        return NodeUtils.getFormFromPacket(sendPubsubPacket(Type.get, new NodeExtension(PubSubElementType.DEFAULT), PubSubElementType.DEFAULT.getNamespace()), PubSubElementType.DEFAULT);
    }

    public final <T extends Node> T getNode(String str) {
        Node node = (Node) this.nodeMap.get(str);
        if (node != null) {
            return node;
        }
        T leafNode;
        IQ discoverInfo = new DiscoverInfo();
        discoverInfo.setTo(this.pubSubService);
        discoverInfo.setNode(str);
        DiscoverInfo discoverInfo2 = (DiscoverInfo) connection().createStanzaCollectorAndSend(discoverInfo).nextResultOrThrow();
        if (discoverInfo2.hasIdentity("pubsub", "leaf")) {
            leafNode = new LeafNode(this, str);
        } else if (discoverInfo2.hasIdentity("pubsub", "collection")) {
            leafNode = new CollectionNode(this, str);
        } else {
            StringBuilder stringBuilder = new StringBuilder("PubSub service '");
            stringBuilder.append(this.pubSubService);
            stringBuilder.append("' returned disco info result for node '");
            stringBuilder.append(str);
            stringBuilder.append("', but it did not contain an Identity of type 'leaf' or 'collection' (and category 'pubsub'), which is not allowed according to XEP-60 5.3.");
            throw new AssertionError(stringBuilder.toString());
        }
        this.nodeMap.put(str, leafNode);
        return leafNode;
    }

    public final a getServiceJid() {
        return this.pubSubService;
    }

    public final List<Subscription> getSubscriptions() {
        return ((SubscriptionsExtension) sendPubsubPacket(Type.get, new NodeExtension(PubSubElementType.SUBSCRIPTIONS), null).getExtension(PubSubElementType.SUBSCRIPTIONS.getElementName(), PubSubElementType.SUBSCRIPTIONS.getNamespace().getXmlns())).getSubscriptions();
    }

    public final DiscoverInfo getSupportedFeatures() {
        return ServiceDiscoveryManager.getInstanceFor(connection()).discoverInfo(this.pubSubService);
    }

    final PubSub sendPubsubPacket(i iVar, Type type, List<ExtensionElement> list, PubSubNamespace pubSubNamespace) {
        PubSub pubSub = new PubSub(iVar, type, pubSubNamespace);
        for (ExtensionElement addExtension : list) {
            pubSub.addExtension(addExtension);
        }
        return sendPubsubPacket(pubSub);
    }

    final PubSub sendPubsubPacket(PubSub pubSub) {
        IQ iq = (IQ) connection().createStanzaCollectorAndSend(pubSub).nextResultOrThrow();
        return iq instanceof EmptyResultIQ ? null : (PubSub) iq;
    }
}
