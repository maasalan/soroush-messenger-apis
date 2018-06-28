package org.jivesoftware.smackx.nick.packet;

import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.xmlpull.v1.XmlPullParser;

public class Nick implements ExtensionElement {
    public static final String ELEMENT_NAME = "nick";
    public static final String NAMESPACE = "http://jabber.org/protocol/nick";
    private String name = null;

    public static class Provider extends ExtensionElementProvider<Nick> {
        public Nick parse(XmlPullParser xmlPullParser, int i) {
            return new Nick(xmlPullParser.nextText());
        }
    }

    public Nick(String str) {
        this.name = str;
    }

    public String getElementName() {
        return ELEMENT_NAME;
    }

    public String getName() {
        return this.name;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toXML() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('<');
        stringBuilder.append("nick xmlns=\"http://jabber.org/protocol/nick\">");
        stringBuilder.append(getName());
        stringBuilder.append("</nick>");
        return stringBuilder.toString();
    }
}
