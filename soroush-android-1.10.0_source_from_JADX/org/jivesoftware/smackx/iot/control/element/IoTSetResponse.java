package org.jivesoftware.smackx.iot.control.element;

import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;

public class IoTSetResponse extends IQ {
    public static final String ELEMENT = "setResponse";
    public static final String NAMESPACE = "urn:xmpp:iot:control";

    public IoTSetResponse() {
        super(ELEMENT, "urn:xmpp:iot:control");
    }

    public IoTSetResponse(IoTSetRequest ioTSetRequest) {
        this();
        initialzeAsResultFor(ioTSetRequest);
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.setEmptyElement();
        return iQChildElementXmlStringBuilder;
    }
}
