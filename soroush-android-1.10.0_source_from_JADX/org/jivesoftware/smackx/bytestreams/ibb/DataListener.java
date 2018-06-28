package org.jivesoftware.smackx.bytestreams.ibb;

import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.IQ.Type;

class DataListener extends AbstractIqRequestHandler {
    private final InBandBytestreamManager manager;

    public DataListener(InBandBytestreamManager inBandBytestreamManager) {
        super("data", "http://jabber.org/protocol/ibb", Type.set, Mode.async);
        this.manager = inBandBytestreamManager;
    }

    public org.jivesoftware.smack.packet.IQ handleIQRequest(org.jivesoftware.smack.packet.IQ r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r3 = (org.jivesoftware.smackx.bytestreams.ibb.packet.Data) r3;
        r0 = r2.manager;
        r0 = r0.getSessions();
        r1 = r3.getDataPacketExtension();
        r1 = r1.getSessionID();
        r0 = r0.get(r1);
        r0 = (org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession) r0;
        r1 = 0;
        if (r0 != 0) goto L_0x001f;
    L_0x0019:
        r0 = r2.manager;	 Catch:{ NotConnectedException -> 0x0022, NotConnectedException -> 0x0022 }
        r0.replyItemNotFoundPacket(r3);	 Catch:{ NotConnectedException -> 0x0022, NotConnectedException -> 0x0022 }
        return r1;	 Catch:{ NotConnectedException -> 0x0022, NotConnectedException -> 0x0022 }
    L_0x001f:
        r0.processIQPacket(r3);	 Catch:{ NotConnectedException -> 0x0022, NotConnectedException -> 0x0022 }
    L_0x0022:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.ibb.DataListener.handleIQRequest(org.jivesoftware.smack.packet.IQ):org.jivesoftware.smack.packet.IQ");
    }
}
