package org.jivesoftware.smackx.iot.discovery.element;

import org.b.a.i;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.iot.element.NodeInfo;

public class IoTDisown extends IQ {
    public static final String ELEMENT = "disown";
    public static final String NAMESPACE = "urn:xmpp:iot:discovery";
    private final i jid;
    private final NodeInfo nodeInfo;

    public IoTDisown(i iVar) {
        this(iVar, NodeInfo.EMPTY);
    }

    public IoTDisown(i iVar, NodeInfo nodeInfo) {
        super("disown", "urn:xmpp:iot:discovery");
        this.jid = iVar;
        this.nodeInfo = nodeInfo;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.attribute(ParserUtils.JID, this.jid);
        this.nodeInfo.appendTo(iQChildElementXmlStringBuilder);
        iQChildElementXmlStringBuilder.rightAngleBracket();
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
