package org.jivesoftware.smackx.blocking.element;

import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class BlockedErrorExtension implements ExtensionElement {
    public static final String ELEMENT = "blocked";
    public static final String NAMESPACE = "urn:xmpp:blocking:errors";

    public static BlockedErrorExtension from(Message message) {
        XMPPError error = message.getError();
        return error == null ? null : (BlockedErrorExtension) error.getExtension(ELEMENT, NAMESPACE);
    }

    public static boolean isInside(Message message) {
        return from(message) != null;
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public CharSequence toXML() {
        CharSequence xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.closeEmptyElement();
        return xmlStringBuilder;
    }
}
