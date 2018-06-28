package org.jivesoftware.smackx.iot.provisioning.element;

import org.b.a.i;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.util.ParserUtils;

public class IoTIsFriend extends IQ {
    public static final String ELEMENT = "isFriend";
    public static final String NAMESPACE = "urn:xmpp:iot:provisioning";
    private final i jid;

    public IoTIsFriend(i iVar) {
        super("isFriend", "urn:xmpp:iot:provisioning");
        this.jid = iVar;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.attribute(ParserUtils.JID, this.jid);
        iQChildElementXmlStringBuilder.setEmptyElement();
        return iQChildElementXmlStringBuilder;
    }
}
