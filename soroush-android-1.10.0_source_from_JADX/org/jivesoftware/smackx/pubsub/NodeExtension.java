package org.jivesoftware.smackx.pubsub;

import org.jivesoftware.smack.packet.ExtensionElement;

public class NodeExtension implements ExtensionElement {
    private final PubSubElementType element;
    private final String node;

    public NodeExtension(PubSubElementType pubSubElementType) {
        this(pubSubElementType, null);
    }

    public NodeExtension(PubSubElementType pubSubElementType, String str) {
        this.element = pubSubElementType;
        this.node = str;
    }

    public String getElementName() {
        return this.element.getElementName();
    }

    public String getNamespace() {
        return this.element.getNamespace().getXmlns();
    }

    public String getNode() {
        return this.node;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append(" - content [");
        stringBuilder.append(toXML());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public CharSequence toXML() {
        String str;
        StringBuilder stringBuilder = new StringBuilder("<");
        stringBuilder.append(getElementName());
        if (this.node == null) {
            str = "";
        } else {
            StringBuilder stringBuilder2 = new StringBuilder(" node='");
            stringBuilder2.append(this.node);
            stringBuilder2.append('\'');
            str = stringBuilder2.toString();
        }
        stringBuilder.append(str);
        stringBuilder.append("/>");
        return stringBuilder.toString();
    }
}
