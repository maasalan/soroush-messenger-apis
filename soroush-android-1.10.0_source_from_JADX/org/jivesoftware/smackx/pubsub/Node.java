package org.jivesoftware.smackx.pubsub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.filter.FlexibleStanzaTypeFilter;
import org.jivesoftware.smack.filter.OrFilter;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.delay.DelayInformationManager;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo;
import org.jivesoftware.smackx.pubsub.listener.ItemDeleteListener;
import org.jivesoftware.smackx.pubsub.listener.ItemEventListener;
import org.jivesoftware.smackx.pubsub.listener.NodeConfigListener;
import org.jivesoftware.smackx.pubsub.packet.PubSub;
import org.jivesoftware.smackx.pubsub.packet.PubSubNamespace;
import org.jivesoftware.smackx.pubsub.util.NodeUtils;
import org.jivesoftware.smackx.shim.packet.Header;
import org.jivesoftware.smackx.shim.packet.HeadersExtension;
import org.jivesoftware.smackx.xdata.Form;

public abstract class Node {
    protected ConcurrentHashMap<NodeConfigListener, StanzaListener> configEventToListenerMap = new ConcurrentHashMap();
    protected final String id;
    protected ConcurrentHashMap<ItemDeleteListener, StanzaListener> itemDeleteToListenerMap = new ConcurrentHashMap();
    protected ConcurrentHashMap<ItemEventListener<Item>, StanzaListener> itemEventToListenerMap = new ConcurrentHashMap();
    protected final PubSubManager pubSubManager;

    public class ItemDeleteTranslator implements StanzaListener {
        private ItemDeleteListener listener;

        public ItemDeleteTranslator(ItemDeleteListener itemDeleteListener) {
            this.listener = itemDeleteListener;
        }

        public void processStanza(Stanza stanza) {
            EventElement eventElement = (EventElement) stanza.getExtension(EventElement.ELEMENT, PubSubNamespace.EVENT.getXmlns());
            if (((ExtensionElement) eventElement.getExtensions().get(0)).getElementName().equals(PubSubElementType.PURGE_EVENT.getElementName())) {
                this.listener.handlePurge();
                return;
            }
            ItemsExtension itemsExtension = (ItemsExtension) eventElement.getEvent();
            Collection<RetractItem> items = itemsExtension.getItems();
            List arrayList = new ArrayList(items.size());
            for (RetractItem id : items) {
                arrayList.add(id.getId());
            }
            this.listener.handleDeletedItems(new ItemDeleteEvent(itemsExtension.getNode(), arrayList, Node.getSubscriptionIds(stanza)));
        }
    }

    public class ItemEventTranslator implements StanzaListener {
        private ItemEventListener listener;

        public ItemEventTranslator(ItemEventListener itemEventListener) {
            this.listener = itemEventListener;
        }

        public void processStanza(Stanza stanza) {
            ItemsExtension itemsExtension = (ItemsExtension) ((EventElement) stanza.getExtension(EventElement.ELEMENT, PubSubNamespace.EVENT.getXmlns())).getEvent();
            this.listener.handlePublishedItems(new ItemPublishEvent(itemsExtension.getNode(), itemsExtension.getItems(), Node.getSubscriptionIds(stanza), DelayInformationManager.getDelayTimestamp(stanza)));
        }
    }

    public static class NodeConfigTranslator implements StanzaListener {
        private NodeConfigListener listener;

        public NodeConfigTranslator(NodeConfigListener nodeConfigListener) {
            this.listener = nodeConfigListener;
        }

        public void processStanza(Stanza stanza) {
            this.listener.handleNodeConfiguration((ConfigurationEvent) ((EventElement) stanza.getExtension(EventElement.ELEMENT, PubSubNamespace.EVENT.getXmlns())).getEvent());
        }
    }

    class EventContentFilter extends FlexibleStanzaTypeFilter<Message> {
        private final boolean allowEmpty;
        private final String firstElement;
        private final String secondElement;

        EventContentFilter(Node node, String str) {
            this(str, null);
        }

        EventContentFilter(String str, String str2) {
            this.firstElement = str;
            this.secondElement = str2;
            boolean z = this.firstElement.equals(EventElementType.items.toString()) && "item".equals(str2);
            this.allowEmpty = z;
        }

        public boolean acceptSpecific(Message message) {
            EventElement from = EventElement.from(message);
            if (from == null) {
                return false;
            }
            NodeExtension event = from.getEvent();
            if (event == null || !event.getElementName().equals(this.firstElement) || !event.getNode().equals(Node.this.getId())) {
                return false;
            }
            if (this.secondElement == null) {
                return true;
            }
            if (event instanceof EmbeddedPacketExtension) {
                List extensions = ((EmbeddedPacketExtension) event).getExtensions();
                return (this.allowEmpty && extensions.isEmpty()) ? true : extensions.size() > 0 && ((ExtensionElement) extensions.get(0)).getElementName().equals(this.secondElement);
            }
        }
    }

    Node(PubSubManager pubSubManager, String str) {
        this.pubSubManager = pubSubManager;
        this.id = str;
    }

    private List<Affiliation> getAffiliations(PubSubNamespace pubSubNamespace, List<ExtensionElement> list, Collection<ExtensionElement> collection) {
        PubSub createPubsubPacket = createPubsubPacket(Type.get, new NodeExtension(PubSubElementType.AFFILIATIONS, getId()), pubSubNamespace);
        if (list != null) {
            for (ExtensionElement addExtension : list) {
                createPubsubPacket.addExtension(addExtension);
            }
        }
        createPubsubPacket = sendPubsubPacket(createPubsubPacket);
        if (collection != null) {
            collection.addAll(createPubsubPacket.getExtensions());
        }
        return ((AffiliationsExtension) createPubsubPacket.getExtension(PubSubElementType.AFFILIATIONS)).getAffiliations();
    }

    private static List<String> getSubscriptionIds(Stanza stanza) {
        HeadersExtension headersExtension = (HeadersExtension) stanza.getExtension(HeadersExtension.ELEMENT, HeadersExtension.NAMESPACE);
        if (headersExtension == null) {
            return null;
        }
        List<String> arrayList = new ArrayList(headersExtension.getHeaders().size());
        for (Header value : headersExtension.getHeaders()) {
            arrayList.add(value.getValue());
        }
        return arrayList;
    }

    private List<Subscription> getSubscriptions(List<ExtensionElement> list, Collection<ExtensionElement> collection, PubSubNamespace pubSubNamespace) {
        PubSub createPubsubPacket = createPubsubPacket(Type.get, new NodeExtension(PubSubElementType.SUBSCRIPTIONS, getId()), pubSubNamespace);
        if (list != null) {
            for (ExtensionElement addExtension : list) {
                createPubsubPacket.addExtension(addExtension);
            }
        }
        PubSub sendPubsubPacket = sendPubsubPacket(createPubsubPacket);
        if (collection != null) {
            collection.addAll(sendPubsubPacket.getExtensions());
        }
        return ((SubscriptionsExtension) sendPubsubPacket.getExtension(PubSubElementType.SUBSCRIPTIONS)).getSubscriptions();
    }

    public void addConfigurationListener(NodeConfigListener nodeConfigListener) {
        StanzaListener nodeConfigTranslator = new NodeConfigTranslator(nodeConfigListener);
        this.configEventToListenerMap.put(nodeConfigListener, nodeConfigTranslator);
        this.pubSubManager.getConnection().addSyncStanzaListener(nodeConfigTranslator, new EventContentFilter(this, EventElementType.configuration.toString()));
    }

    public void addItemDeleteListener(ItemDeleteListener itemDeleteListener) {
        StanzaListener itemDeleteTranslator = new ItemDeleteTranslator(itemDeleteListener);
        this.itemDeleteToListenerMap.put(itemDeleteListener, itemDeleteTranslator);
        EventContentFilter eventContentFilter = new EventContentFilter(EventElementType.items.toString(), "retract");
        EventContentFilter eventContentFilter2 = new EventContentFilter(this, EventElementType.purge.toString());
        this.pubSubManager.getConnection().addSyncStanzaListener(itemDeleteTranslator, new OrFilter(eventContentFilter, eventContentFilter2));
    }

    public void addItemEventListener(ItemEventListener itemEventListener) {
        StanzaListener itemEventTranslator = new ItemEventTranslator(itemEventListener);
        this.itemEventToListenerMap.put(itemEventListener, itemEventTranslator);
        this.pubSubManager.getConnection().addSyncStanzaListener(itemEventTranslator, new EventContentFilter(EventElementType.items.toString(), "item"));
    }

    protected PubSub createPubsubPacket(Type type, ExtensionElement extensionElement) {
        return createPubsubPacket(type, extensionElement, null);
    }

    protected PubSub createPubsubPacket(Type type, ExtensionElement extensionElement, PubSubNamespace pubSubNamespace) {
        return PubSub.createPubsubPacket(this.pubSubManager.getServiceJid(), type, extensionElement, pubSubNamespace);
    }

    public DiscoverInfo discoverInfo() {
        IQ discoverInfo = new DiscoverInfo();
        discoverInfo.setTo(this.pubSubManager.getServiceJid());
        discoverInfo.setNode(getId());
        return (DiscoverInfo) this.pubSubManager.getConnection().createStanzaCollectorAndSend(discoverInfo).nextResultOrThrow();
    }

    public List<Affiliation> getAffiliations() {
        return getAffiliations(null, null);
    }

    public List<Affiliation> getAffiliations(List<ExtensionElement> list, Collection<ExtensionElement> collection) {
        return getAffiliations(PubSubNamespace.BASIC, list, collection);
    }

    public List<Affiliation> getAffiliationsAsOwner() {
        return getAffiliationsAsOwner(null, null);
    }

    public List<Affiliation> getAffiliationsAsOwner(List<ExtensionElement> list, Collection<ExtensionElement> collection) {
        return getAffiliations(PubSubNamespace.OWNER, list, collection);
    }

    public String getId() {
        return this.id;
    }

    public ConfigureForm getNodeConfiguration() {
        return NodeUtils.getFormFromPacket(sendPubsubPacket(createPubsubPacket(Type.get, new NodeExtension(PubSubElementType.CONFIGURE_OWNER, getId()), PubSubNamespace.OWNER)), PubSubElementType.CONFIGURE_OWNER);
    }

    public SubscribeForm getSubscriptionOptions(String str) {
        return getSubscriptionOptions(str, null);
    }

    public SubscribeForm getSubscriptionOptions(String str, String str2) {
        return new SubscribeForm(((FormNode) sendPubsubPacket(createPubsubPacket(Type.get, new OptionsExtension(str, getId(), str2))).getExtension(PubSubElementType.OPTIONS)).getForm());
    }

    public List<Subscription> getSubscriptions() {
        return getSubscriptions(null, null);
    }

    public List<Subscription> getSubscriptions(List<ExtensionElement> list, Collection<ExtensionElement> collection) {
        return getSubscriptions(list, collection, null);
    }

    public List<Subscription> getSubscriptionsAsOwner() {
        return getSubscriptionsAsOwner(null, null);
    }

    public List<Subscription> getSubscriptionsAsOwner(List<ExtensionElement> list, Collection<ExtensionElement> collection) {
        return getSubscriptions(list, collection, PubSubNamespace.OWNER);
    }

    public PubSub modifyAffiliationAsOwner(List<Affiliation> list) {
        for (Affiliation pubSubNamespace : list) {
            if (pubSubNamespace.getPubSubNamespace() != PubSubNamespace.OWNER) {
                throw new IllegalArgumentException("Must use Affiliation(BareJid, Type) affiliations");
            }
        }
        return sendPubsubPacket(createPubsubPacket(Type.set, new AffiliationsExtension(list, getId()), PubSubNamespace.OWNER));
    }

    public void removeConfigurationListener(NodeConfigListener nodeConfigListener) {
        StanzaListener stanzaListener = (StanzaListener) this.configEventToListenerMap.remove(nodeConfigListener);
        if (stanzaListener != null) {
            this.pubSubManager.getConnection().removeSyncStanzaListener(stanzaListener);
        }
    }

    public void removeItemDeleteListener(ItemDeleteListener itemDeleteListener) {
        StanzaListener stanzaListener = (StanzaListener) this.itemDeleteToListenerMap.remove(itemDeleteListener);
        if (stanzaListener != null) {
            this.pubSubManager.getConnection().removeSyncStanzaListener(stanzaListener);
        }
    }

    public void removeItemEventListener(ItemEventListener itemEventListener) {
        StanzaListener stanzaListener = (StanzaListener) this.itemEventToListenerMap.remove(itemEventListener);
        if (stanzaListener != null) {
            this.pubSubManager.getConnection().removeSyncStanzaListener(stanzaListener);
        }
    }

    public void sendConfigurationForm(Form form) {
        this.pubSubManager.getConnection().createStanzaCollectorAndSend(createPubsubPacket(Type.set, new FormNode(FormNodeType.CONFIGURE_OWNER, getId(), form), PubSubNamespace.OWNER)).nextResultOrThrow();
    }

    protected PubSub sendPubsubPacket(PubSub pubSub) {
        return this.pubSubManager.sendPubsubPacket(pubSub);
    }

    public Subscription subscribe(String str) {
        return (Subscription) sendPubsubPacket(createPubsubPacket(Type.set, new SubscribeExtension(str, getId()))).getExtension(PubSubElementType.SUBSCRIPTION);
    }

    public Subscription subscribe(String str, SubscribeForm subscribeForm) {
        PubSub createPubsubPacket = createPubsubPacket(Type.set, new SubscribeExtension(str, getId()));
        createPubsubPacket.addExtension(new FormNode(FormNodeType.OPTIONS, subscribeForm));
        return (Subscription) sendPubsubPacket(createPubsubPacket).getExtension(PubSubElementType.SUBSCRIPTION);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" ");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(" id: ");
        stringBuilder.append(this.id);
        return stringBuilder.toString();
    }

    public void unsubscribe(String str) {
        unsubscribe(str, null);
    }

    public void unsubscribe(String str, String str2) {
        sendPubsubPacket(createPubsubPacket(Type.set, new UnsubscribeExtension(str, getId(), str2)));
    }
}
