package org.jivesoftware.smackx.httpfileupload.element;

import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class FileTooLargeError implements ExtensionElement {
    public static final String ELEMENT = "file-too-large";
    public static final String NAMESPACE = "urn:xmpp:http:upload:0";
    private final long maxFileSize;
    private final String namespace;

    public FileTooLargeError(long j) {
        this(j, "urn:xmpp:http:upload:0");
    }

    protected FileTooLargeError(long j, String str) {
        this.maxFileSize = j;
        this.namespace = str;
    }

    public static FileTooLargeError from(IQ iq) {
        XMPPError error = iq.getError();
        return error == null ? null : (FileTooLargeError) error.getExtension(ELEMENT, "urn:xmpp:http:upload:0");
    }

    public String getElementName() {
        return ELEMENT;
    }

    public long getMaxFileSize() {
        return this.maxFileSize;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.element("max-file-size", String.valueOf(this.maxFileSize));
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
