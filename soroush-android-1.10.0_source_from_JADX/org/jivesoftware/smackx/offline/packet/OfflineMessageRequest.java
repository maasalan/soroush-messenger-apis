package org.jivesoftware.smackx.offline.packet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.amp.packet.AMPExtension.Action;
import org.jivesoftware.smackx.iot.data.element.NodeElement;
import org.xmlpull.v1.XmlPullParser;

public class OfflineMessageRequest extends IQ {
    public static final String ELEMENT = "offline";
    public static final String NAMESPACE = "http://jabber.org/protocol/offline";
    private boolean fetch = false;
    private final List<Item> items = new ArrayList();
    private boolean purge = false;

    public static class Item {
        private String action;
        private String jid;
        private String node;

        public Item(String str) {
            this.node = str;
        }

        public String getAction() {
            return this.action;
        }

        public String getJid() {
            return this.jid;
        }

        public String getNode() {
            return this.node;
        }

        public void setAction(String str) {
            this.action = str;
        }

        public void setJid(String str) {
            this.jid = str;
        }

        public String toXML() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<item");
            if (getAction() != null) {
                stringBuilder.append(" action=\"");
                stringBuilder.append(getAction());
                stringBuilder.append('\"');
            }
            if (getJid() != null) {
                stringBuilder.append(" jid=\"");
                stringBuilder.append(getJid());
                stringBuilder.append('\"');
            }
            if (getNode() != null) {
                stringBuilder.append(" node=\"");
                stringBuilder.append(getNode());
                stringBuilder.append('\"');
            }
            stringBuilder.append("/>");
            return stringBuilder.toString();
        }
    }

    public static class Provider extends IQProvider<OfflineMessageRequest> {
        private static Item parseItem(XmlPullParser xmlPullParser) {
            Item item = new Item(xmlPullParser.getAttributeValue("", NodeElement.ELEMENT));
            item.setAction(xmlPullParser.getAttributeValue("", Action.ATTRIBUTE_NAME));
            item.setJid(xmlPullParser.getAttributeValue("", ParserUtils.JID));
            Object obj = null;
            while (obj == null) {
                if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("item")) {
                    obj = 1;
                }
            }
            return item;
        }

        public OfflineMessageRequest parse(XmlPullParser xmlPullParser, int i) {
            OfflineMessageRequest offlineMessageRequest = new OfflineMessageRequest();
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        offlineMessageRequest.addItem(parseItem(xmlPullParser));
                    } else if (xmlPullParser.getName().equals("purge")) {
                        offlineMessageRequest.setPurge(true);
                    } else if (xmlPullParser.getName().equals("fetch")) {
                        offlineMessageRequest.setFetch(true);
                    }
                } else if (next == 3 && xmlPullParser.getName().equals(OfflineMessageRequest.ELEMENT)) {
                    z = true;
                }
            }
            return offlineMessageRequest;
        }
    }

    public OfflineMessageRequest() {
        super(ELEMENT, NAMESPACE);
    }

    public void addItem(Item item) {
        synchronized (this.items) {
            this.items.add(item);
        }
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        synchronized (this.items) {
            for (int i = 0; i < this.items.size(); i++) {
                iQChildElementXmlStringBuilder.append(((Item) this.items.get(i)).toXML());
            }
        }
        if (this.purge) {
            iQChildElementXmlStringBuilder.append((CharSequence) "<purge/>");
        }
        if (this.fetch) {
            iQChildElementXmlStringBuilder.append((CharSequence) "<fetch/>");
        }
        return iQChildElementXmlStringBuilder;
    }

    public List<Item> getItems() {
        List<Item> unmodifiableList;
        synchronized (this.items) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(this.items));
        }
        return unmodifiableList;
    }

    public boolean isFetch() {
        return this.fetch;
    }

    public boolean isPurge() {
        return this.purge;
    }

    public void setFetch(boolean z) {
        this.fetch = z;
    }

    public void setPurge(boolean z) {
        this.purge = z;
    }
}
