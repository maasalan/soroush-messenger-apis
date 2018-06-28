package org.jivesoftware.smack.packet;

import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;

public class StreamOpen implements Nonza {
    public static final String CLIENT_NAMESPACE = "jabber:client";
    public static final String ELEMENT = "stream:stream";
    public static final String SERVER_NAMESPACE = "jabber:server";
    public static final String VERSION = "1.0";
    private final String contentNamespace;
    private final String from;
    private final String id;
    private final String lang;
    private final String to;

    public enum StreamContentNamespace {
        client,
        server
    }

    public StreamOpen(CharSequence charSequence) {
        this(charSequence, null, null, null, StreamContentNamespace.client);
    }

    public StreamOpen(CharSequence charSequence, CharSequence charSequence2, String str) {
        this(charSequence, charSequence2, str, "en", StreamContentNamespace.client);
    }

    public StreamOpen(CharSequence charSequence, CharSequence charSequence2, String str, String str2, StreamContentNamespace streamContentNamespace) {
        String str3;
        this.to = StringUtils.maybeToString(charSequence);
        this.from = StringUtils.maybeToString(charSequence2);
        this.id = str;
        this.lang = str2;
        switch (streamContentNamespace) {
            case client:
                str3 = CLIENT_NAMESPACE;
                break;
            case server:
                str3 = SERVER_NAMESPACE;
                break;
            default:
                throw new IllegalStateException();
        }
        this.contentNamespace = str3;
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getNamespace() {
        return this.contentNamespace;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.attribute(PrivacyItem.SUBSCRIPTION_TO, this.to);
        xmlStringBuilder.attribute("xmlns:stream", "http://etherx.jabber.org/streams");
        xmlStringBuilder.attribute("version", "1.0");
        xmlStringBuilder.optAttribute(PrivacyItem.SUBSCRIPTION_FROM, this.from);
        xmlStringBuilder.optAttribute(MessageCorrectExtension.ID_TAG, this.id);
        xmlStringBuilder.xmllangAttribute(this.lang);
        xmlStringBuilder.rightAngleBracket();
        return xmlStringBuilder;
    }
}
