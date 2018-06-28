package org.jivesoftware.smackx.iot.data.element;

import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;

public class IoTDataRequest extends IQ {
    public static final String ELEMENT = "req";
    public static final String NAMESPACE = "urn:xmpp:iot:sensordata";
    private final boolean momentary;
    private final int seqNr;

    public IoTDataRequest(int i, boolean z) {
        super("req", "urn:xmpp:iot:sensordata");
        this.seqNr = i;
        this.momentary = z;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.attribute("seqnr", this.seqNr);
        iQChildElementXmlStringBuilder.optBooleanAttribute("momentary", this.momentary);
        iQChildElementXmlStringBuilder.setEmptyElement();
        return iQChildElementXmlStringBuilder;
    }

    public int getSequenceNr() {
        return this.seqNr;
    }

    public boolean isMomentary() {
        return this.momentary;
    }
}
