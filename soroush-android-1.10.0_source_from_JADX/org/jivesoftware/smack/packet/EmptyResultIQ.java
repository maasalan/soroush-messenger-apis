package org.jivesoftware.smack.packet;

import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;

public class EmptyResultIQ extends IQ {
    public EmptyResultIQ() {
        super(null, null);
        setType(Type.result);
    }

    public EmptyResultIQ(IQ iq) {
        this();
        initialzeAsResultFor(iq);
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        return null;
    }
}
