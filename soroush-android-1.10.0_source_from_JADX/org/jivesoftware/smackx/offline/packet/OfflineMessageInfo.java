package org.jivesoftware.smackx.offline.packet;

import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.iot.data.element.NodeElement;
import org.xmlpull.v1.XmlPullParser;

public class OfflineMessageInfo implements ExtensionElement {
    private String node = null;

    public static class Provider extends ExtensionElementProvider<OfflineMessageInfo> {
        public OfflineMessageInfo parse(XmlPullParser xmlPullParser, int i) {
            OfflineMessageInfo offlineMessageInfo = new OfflineMessageInfo();
            Object obj = null;
            while (obj == null) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        offlineMessageInfo.setNode(xmlPullParser.getAttributeValue("", NodeElement.ELEMENT));
                    }
                } else if (next == 3 && xmlPullParser.getName().equals(OfflineMessageRequest.ELEMENT)) {
                    obj = 1;
                }
            }
            return offlineMessageInfo;
        }
    }

    public String getElementName() {
        return OfflineMessageRequest.ELEMENT;
    }

    public String getNamespace() {
        return OfflineMessageRequest.NAMESPACE;
    }

    public String getNode() {
        return this.node;
    }

    public void setNode(String str) {
        this.node = str;
    }

    public String toXML() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('<');
        stringBuilder.append(getElementName());
        stringBuilder.append(" xmlns=\"");
        stringBuilder.append(getNamespace());
        stringBuilder.append("\">");
        if (getNode() != null) {
            stringBuilder.append("<item node=\"");
            stringBuilder.append(getNode());
            stringBuilder.append("\"/>");
        }
        stringBuilder.append("</");
        stringBuilder.append(getElementName());
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}
