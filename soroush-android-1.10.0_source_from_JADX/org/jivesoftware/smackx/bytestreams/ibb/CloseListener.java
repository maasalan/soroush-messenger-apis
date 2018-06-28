package org.jivesoftware.smackx.bytestreams.ibb;

import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Close;

class CloseListener extends AbstractIqRequestHandler {
    private final InBandBytestreamManager manager;

    protected CloseListener(InBandBytestreamManager inBandBytestreamManager) {
        super(Close.ELEMENT, "http://jabber.org/protocol/ibb", Type.set, Mode.async);
        this.manager = inBandBytestreamManager;
    }

    public org.jivesoftware.smack.packet.IQ handleIQRequest(org.jivesoftware.smack.packet.IQ r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r3 = (org.jivesoftware.smackx.bytestreams.ibb.packet.Close) r3;
        r0 = r2.manager;
        r0 = r0.getSessions();
        r1 = r3.getSessionID();
        r0 = r0.get(r1);
        r0 = (org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession) r0;
        r1 = 0;
        if (r0 != 0) goto L_0x001c;
    L_0x0015:
        r0 = r2.manager;	 Catch:{ InterruptedException -> 0x001b, InterruptedException -> 0x001b }
        r0.replyItemNotFoundPacket(r3);	 Catch:{ InterruptedException -> 0x001b, InterruptedException -> 0x001b }
        return r1;
    L_0x001b:
        return r1;
    L_0x001c:
        r0.closeByPeer(r3);	 Catch:{ InterruptedException -> 0x002c, InterruptedException -> 0x002c }
        r0 = r2.manager;
        r0 = r0.getSessions();
        r3 = r3.getSessionID();
        r0.remove(r3);
    L_0x002c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.ibb.CloseListener.handleIQRequest(org.jivesoftware.smack.packet.IQ):org.jivesoftware.smack.packet.IQ");
    }
}
