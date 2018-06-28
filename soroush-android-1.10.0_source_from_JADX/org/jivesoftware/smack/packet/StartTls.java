package org.jivesoftware.smack.packet;

import org.jivesoftware.smack.util.XmlStringBuilder;

public class StartTls implements Nonza {
    public static final String ELEMENT = "starttls";
    public static final String NAMESPACE = "urn:ietf:params:xml:ns:xmpp-tls";
    private final boolean required;

    public StartTls() {
        this(false);
    }

    public StartTls(boolean z) {
        this.required = z;
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public boolean required() {
        return this.required;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.condEmptyElement(this.required, "required");
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
