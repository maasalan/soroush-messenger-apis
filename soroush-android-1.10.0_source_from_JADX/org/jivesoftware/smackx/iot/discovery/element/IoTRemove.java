package org.jivesoftware.smackx.iot.discovery.element;

import org.b.a.a;
import org.b.a.i;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.iot.element.NodeInfo;

public class IoTRemove extends IQ {
    public static final String ELEMENT = "remove";
    public static final String NAMESPACE = "urn:xmpp:iot:discovery";
    private final a jid;
    private final NodeInfo nodeInfo;

    public IoTRemove(a aVar) {
        this(aVar, NodeInfo.EMPTY);
    }

    public IoTRemove(a aVar, NodeInfo nodeInfo) {
        super("remove", "urn:xmpp:iot:discovery");
        this.jid = aVar;
        this.nodeInfo = nodeInfo;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.attribute(ParserUtils.JID, this.jid);
        this.nodeInfo.appendTo(iQChildElementXmlStringBuilder);
        iQChildElementXmlStringBuilder.setEmptyElement();
        return iQChildElementXmlStringBuilder;
    }

    public i getJid() {
        return this.jid;
    }

    public String getNodeId() {
        return this.nodeInfo != null ? this.nodeInfo.getNodeId() : null;
    }

    public String getSourceId() {
        return this.nodeInfo != null ? this.nodeInfo.getSourceId() : null;
    }
}
