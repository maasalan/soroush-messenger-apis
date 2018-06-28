package org.jivesoftware.smack.roster.packet;

import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.util.XmlStringBuilder;

public final class RosterVer implements ExtensionElement {
    public static final String ELEMENT = "ver";
    public static final RosterVer INSTANCE = new RosterVer();
    public static final String NAMESPACE = "urn:xmpp:features:rosterver";

    private RosterVer() {
    }

    public final String getElementName() {
        return ELEMENT;
    }

    public final String getNamespace() {
        return NAMESPACE;
    }

    public final XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.closeEmptyElement();
        return xmlStringBuilder;
    }
}
