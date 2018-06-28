package org.jivesoftware.smackx.iot.provisioning.element;

import org.b.a.a;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class Unfriend implements ExtensionElement {
    public static final String ELEMENT = "UNFRIEND";
    public static final String NAMESPACE = "urn:xmpp:iot:provisioning";
    private final a jid;

    public Unfriend(a aVar) {
        this.jid = aVar;
    }

    public static Unfriend from(Message message) {
        return (Unfriend) message.getExtension(ELEMENT, "urn:xmpp:iot:provisioning");
    }

    public String getElementName() {
        return ELEMENT;
    }

    public a getJid() {
        return this.jid;
    }

    public String getNamespace() {
        return "urn:xmpp:iot:provisioning";
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.attribute(ParserUtils.JID, this.jid);
        xmlStringBuilder.closeEmptyElement();
        return xmlStringBuilder;
    }
}
