package org.jivesoftware.smackx.iot.provisioning.element;

import org.b.a.a;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class Friend implements ExtensionElement {
    public static final String ELEMENT = "friend";
    public static final String NAMESPACE = "urn:xmpp:iot:provisioning";
    private final a friend;

    public Friend(a aVar) {
        this.friend = (a) Objects.requireNonNull(aVar, "Friend must not be null");
    }

    public static Friend from(Message message) {
        return (Friend) message.getExtension(ELEMENT, "urn:xmpp:iot:provisioning");
    }

    public String getElementName() {
        return ELEMENT;
    }

    public a getFriend() {
        return this.friend;
    }

    public String getNamespace() {
        return "urn:xmpp:iot:provisioning";
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.attribute(ParserUtils.JID, this.friend);
        xmlStringBuilder.closeEmptyElement();
        return xmlStringBuilder;
    }
}
