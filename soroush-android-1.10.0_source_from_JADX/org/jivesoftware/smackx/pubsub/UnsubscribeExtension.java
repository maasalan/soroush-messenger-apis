package org.jivesoftware.smackx.pubsub;

import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.iot.data.element.NodeElement;

public class UnsubscribeExtension extends NodeExtension {
    protected String id;
    protected String jid;

    public UnsubscribeExtension(String str) {
        this(str, null, null);
    }

    public UnsubscribeExtension(String str, String str2) {
        this(str, str2, null);
    }

    public UnsubscribeExtension(String str, String str2, String str3) {
        super(PubSubElementType.UNSUBSCRIBE, str2);
        this.jid = str;
        this.id = str3;
    }

    public String getId() {
        return this.id;
    }

    public String getJid() {
        return this.jid;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        xmlStringBuilder.halfOpenElement(getElementName());
        xmlStringBuilder.attribute(ParserUtils.JID, this.jid);
        xmlStringBuilder.optAttribute(NodeElement.ELEMENT, getNode());
        xmlStringBuilder.optAttribute("subid", this.id);
        xmlStringBuilder.closeEmptyElement();
        return xmlStringBuilder;
    }
}
