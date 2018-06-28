package org.jivesoftware.smackx.offline;

import java.util.ArrayList;
import java.util.List;
import org.jivesoftware.smack.StanzaCollector;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.StanzaExtensionFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.jivesoftware.smackx.offline.packet.OfflineMessageInfo;
import org.jivesoftware.smackx.offline.packet.OfflineMessageRequest;
import org.jivesoftware.smackx.offline.packet.OfflineMessageRequest.Item;
import org.jivesoftware.smackx.xdata.Form;

public class OfflineMessageManager {
    private static final StanzaFilter PACKET_FILTER = new AndFilter(new StanzaExtensionFilter(new OfflineMessageInfo()), StanzaTypeFilter.MESSAGE);
    private static final String namespace = "http://jabber.org/protocol/offline";
    private final XMPPConnection connection;

    public OfflineMessageManager(XMPPConnection xMPPConnection) {
        this.connection = xMPPConnection;
    }

    public void deleteMessages() {
        IQ offlineMessageRequest = new OfflineMessageRequest();
        offlineMessageRequest.setType(Type.set);
        offlineMessageRequest.setPurge(true);
        this.connection.createStanzaCollectorAndSend(offlineMessageRequest).nextResultOrThrow();
    }

    public void deleteMessages(List<String> list) {
        IQ offlineMessageRequest = new OfflineMessageRequest();
        offlineMessageRequest.setType(Type.set);
        for (String item : list) {
            Item item2 = new Item(item);
            item2.setAction("remove");
            offlineMessageRequest.addItem(item2);
        }
        this.connection.createStanzaCollectorAndSend(offlineMessageRequest).nextResultOrThrow();
    }

    public List<OfflineMessageHeader> getHeaders() {
        List<OfflineMessageHeader> arrayList = new ArrayList();
        for (DiscoverItems.Item offlineMessageHeader : ServiceDiscoveryManager.getInstanceFor(this.connection).discoverItems(null, "http://jabber.org/protocol/offline").getItems()) {
            arrayList.add(new OfflineMessageHeader(offlineMessageHeader));
        }
        return arrayList;
    }

    public int getMessageCount() {
        Form formFrom = Form.getFormFrom(ServiceDiscoveryManager.getInstanceFor(this.connection).discoverInfo(null, "http://jabber.org/protocol/offline"));
        return formFrom != null ? Integer.parseInt((String) formFrom.getField("number_of_messages").getValues().get(0)) : 0;
    }

    public List<Message> getMessages() {
        IQ offlineMessageRequest = new OfflineMessageRequest();
        offlineMessageRequest.setFetch(true);
        StanzaCollector createStanzaCollectorAndSend = this.connection.createStanzaCollectorAndSend(offlineMessageRequest);
        StanzaCollector createStanzaCollector = this.connection.createStanzaCollector(StanzaCollector.newConfiguration().setStanzaFilter(PACKET_FILTER).setCollectorToReset(createStanzaCollectorAndSend));
        try {
            createStanzaCollectorAndSend.nextResultOrThrow();
            createStanzaCollector.cancel();
            List<Message> arrayList = new ArrayList(createStanzaCollector.getCollectedCount());
            while (true) {
                Message message = (Message) createStanzaCollector.pollResult();
                if (message == null) {
                    break;
                }
                arrayList.add(message);
            }
            return arrayList;
        } finally {
            createStanzaCollector.cancel();
        }
    }

    public List<Message> getMessages(final List<String> list) {
        List<Message> arrayList = new ArrayList();
        IQ offlineMessageRequest = new OfflineMessageRequest();
        for (String item : list) {
            Item item2 = new Item(item);
            item2.setAction("view");
            offlineMessageRequest.addItem(item2);
        }
        StanzaFilter andFilter = new AndFilter(PACKET_FILTER, new StanzaFilter() {
            public boolean accept(Stanza stanza) {
                return list.contains(((OfflineMessageInfo) stanza.getExtension(OfflineMessageRequest.ELEMENT, "http://jabber.org/protocol/offline")).getNode());
            }
        });
        int size = list.size();
        StanzaCollector createStanzaCollector = this.connection.createStanzaCollector(andFilter);
        try {
            this.connection.createStanzaCollectorAndSend(offlineMessageRequest).nextResultOrThrow();
            Stanza nextResult = createStanzaCollector.nextResult();
            while (true) {
                Message message = (Message) nextResult;
                if (message == null || size <= 0) {
                    createStanzaCollector.cancel();
                } else {
                    size--;
                    arrayList.add(message);
                    nextResult = createStanzaCollector.nextResult();
                }
            }
            createStanzaCollector.cancel();
            return arrayList;
        } catch (Throwable th) {
            createStanzaCollector.cancel();
        }
    }

    public boolean supportsFlexibleRetrieval() {
        return ServiceDiscoveryManager.getInstanceFor(this.connection).serverSupportsFeature("http://jabber.org/protocol/offline");
    }
}
