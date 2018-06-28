package org.jivesoftware.smackx.push_notifications.element;

import org.b.a.i;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.iot.data.element.NodeElement;

public class DisablePushNotificationsIQ extends IQ {
    public static final String ELEMENT = "disable";
    public static final String NAMESPACE = "urn:xmpp:push:0";
    private final i jid;
    private final String node;

    public DisablePushNotificationsIQ(i iVar) {
        this(iVar, null);
    }

    public DisablePushNotificationsIQ(i iVar, String str) {
        super("disable", "urn:xmpp:push:0");
        this.jid = iVar;
        this.node = str;
        setType(Type.set);
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.attribute(ParserUtils.JID, this.jid);
        iQChildElementXmlStringBuilder.optAttribute(NodeElement.ELEMENT, this.node);
        iQChildElementXmlStringBuilder.rightAngleBracket();
        return iQChildElementXmlStringBuilder;
    }

    public i getJid() {
        return this.jid;
    }

    public String getNode() {
        return this.node;
    }
}
