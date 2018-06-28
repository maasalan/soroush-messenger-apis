package org.jivesoftware.smackx.muc.packet;

import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.xmlpull.v1.XmlPullParser;

public class GroupChatInvitation implements ExtensionElement {
    public static final String ELEMENT = "x";
    public static final String NAMESPACE = "jabber:x:conference";
    private final String roomAddress;

    public static class Provider extends ExtensionElementProvider<GroupChatInvitation> {
        public GroupChatInvitation parse(XmlPullParser xmlPullParser, int i) {
            String attributeValue = xmlPullParser.getAttributeValue("", ParserUtils.JID);
            xmlPullParser.next();
            return new GroupChatInvitation(attributeValue);
        }
    }

    public GroupChatInvitation(String str) {
        this.roomAddress = str;
    }

    public static GroupChatInvitation from(Stanza stanza) {
        return (GroupChatInvitation) stanza.getExtension("x", NAMESPACE);
    }

    @Deprecated
    public static GroupChatInvitation getFrom(Stanza stanza) {
        return from(stanza);
    }

    public String getElementName() {
        return "x";
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public String getRoomAddress() {
        return this.roomAddress;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.attribute(ParserUtils.JID, getRoomAddress());
        xmlStringBuilder.closeEmptyElement();
        return xmlStringBuilder;
    }
}
