package org.jivesoftware.smack.roster.packet;

import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.util.XmlStringBuilder;

public final class SubscriptionPreApproval implements ExtensionElement {
    public static final String ELEMENT = "sub";
    public static final SubscriptionPreApproval INSTANCE = new SubscriptionPreApproval();
    public static final String NAMESPACE = "urn:xmpp:features:pre-approval";

    private SubscriptionPreApproval() {
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
