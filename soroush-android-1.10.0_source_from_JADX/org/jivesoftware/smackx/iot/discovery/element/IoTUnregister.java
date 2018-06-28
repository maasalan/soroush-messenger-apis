package org.jivesoftware.smackx.iot.discovery.element;

import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smackx.iot.element.NodeInfo;

public class IoTUnregister extends IQ {
    public static final String ELEMENT = "unregister";
    public static final String NAMESPACE = "urn:xmpp:iot:discovery";
    private final NodeInfo nodeInfo;

    public IoTUnregister(NodeInfo nodeInfo) {
        super(ELEMENT, "urn:xmpp:iot:discovery");
        this.nodeInfo = nodeInfo;
        setType(Type.set);
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        this.nodeInfo.appendTo(iQChildElementXmlStringBuilder);
        iQChildElementXmlStringBuilder.rightAngleBracket();
        return iQChildElementXmlStringBuilder;
    }
}
