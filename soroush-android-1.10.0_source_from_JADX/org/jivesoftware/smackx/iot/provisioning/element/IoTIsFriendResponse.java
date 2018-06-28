package org.jivesoftware.smackx.iot.provisioning.element;

import org.b.a.a;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.mam.element.MamElements.MamResultExtension;

public class IoTIsFriendResponse extends IQ {
    public static final String ELEMENT = "isFriend";
    public static final String NAMESPACE = "urn:xmpp:iot:provisioning";
    private final a jid;
    private final boolean result;

    public IoTIsFriendResponse(a aVar, boolean z) {
        super("isFriend", "urn:xmpp:iot:provisioning");
        this.jid = aVar;
        this.result = z;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.attribute(ParserUtils.JID, this.jid);
        iQChildElementXmlStringBuilder.attribute(MamResultExtension.ELEMENT, this.result);
        return iQChildElementXmlStringBuilder;
    }

    public boolean getIsFriendResult() {
        return this.result;
    }

    public a getJid() {
        return this.jid;
    }
}
