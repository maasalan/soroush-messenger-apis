package org.jivesoftware.smackx.iqprivate.packet;

import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;

public class PrivateDataIQ extends IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "jabber:iq:private";
    private final String getElement;
    private final String getNamespace;
    private final PrivateData privateData;

    public PrivateDataIQ(String str, String str2) {
        this(null, str, str2);
        setType(Type.get);
    }

    public PrivateDataIQ(PrivateData privateData) {
        this(privateData, null, null);
        setType(Type.set);
    }

    private PrivateDataIQ(PrivateData privateData, String str, String str2) {
        super("query", NAMESPACE);
        this.privateData = privateData;
        this.getElement = str;
        this.getNamespace = str2;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        if (this.privateData != null) {
            iQChildElementXmlStringBuilder.append(this.privateData.toXML());
            return iQChildElementXmlStringBuilder;
        }
        iQChildElementXmlStringBuilder.halfOpenElement(this.getElement).xmlnsAttribute(this.getNamespace).closeEmptyElement();
        return iQChildElementXmlStringBuilder;
    }

    public PrivateData getPrivateData() {
        return this.privateData;
    }
}
