package org.jivesoftware.smackx.muclight.element;

import org.b.a.i;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;

public class MUCLightGetConfigsIQ extends IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "urn:xmpp:muclight:0#configuration";
    private String version;

    public MUCLightGetConfigsIQ(i iVar) {
        this(iVar, null);
    }

    public MUCLightGetConfigsIQ(i iVar, String str) {
        super("query", "urn:xmpp:muclight:0#configuration");
        this.version = str;
        setType(Type.get);
        setTo(iVar);
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        iQChildElementXmlStringBuilder.optElement("version", this.version);
        return iQChildElementXmlStringBuilder;
    }
}
