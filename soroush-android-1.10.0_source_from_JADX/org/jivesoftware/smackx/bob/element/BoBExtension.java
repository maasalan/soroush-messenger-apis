package org.jivesoftware.smackx.bob.element;

import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.bob.BoBHash;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import org.jivesoftware.smackx.xhtmlim.packet.XHTMLExtension;

public class BoBExtension extends XHTMLExtension {
    private final String alt;
    private final BoBHash bobHash;
    private final String paragraph;

    public BoBExtension(BoBHash boBHash, String str, String str2) {
        this.bobHash = boBHash;
        this.alt = str;
        this.paragraph = str2;
    }

    public static BoBExtension from(Message message) {
        return (BoBExtension) message.getExtension(XHTMLExtension.ELEMENT, XHTMLExtension.NAMESPACE);
    }

    public String getAlt() {
        return this.alt;
    }

    public BoBHash getBoBHash() {
        return this.bobHash;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.halfOpenElement(Message.BODY);
        xmlStringBuilder.xmlnsAttribute(XHTMLText.NAMESPACE);
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.openElement(XHTMLText.f24840P);
        xmlStringBuilder.optEscape(this.paragraph);
        xmlStringBuilder.halfOpenElement(XHTMLText.IMG);
        xmlStringBuilder.optAttribute("alt", this.alt);
        xmlStringBuilder.attribute("src", this.bobHash.toSrc());
        xmlStringBuilder.closeEmptyElement();
        xmlStringBuilder.closeElement(XHTMLText.f24840P);
        xmlStringBuilder.closeElement(Message.BODY);
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
