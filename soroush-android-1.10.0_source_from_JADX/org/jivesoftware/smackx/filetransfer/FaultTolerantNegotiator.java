package org.jivesoftware.smackx.filetransfer;

import java.io.InputStream;
import org.b.a.i;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Open;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream;
import org.jivesoftware.smackx.si.packet.StreamInitiation;

public class FaultTolerantNegotiator extends StreamNegotiator {
    private final XMPPConnection connection;
    private final StreamNegotiator primaryNegotiator;
    private final StreamNegotiator secondaryNegotiator;

    public FaultTolerantNegotiator(XMPPConnection xMPPConnection, StreamNegotiator streamNegotiator, StreamNegotiator streamNegotiator2) {
        this.primaryNegotiator = streamNegotiator;
        this.secondaryNegotiator = streamNegotiator2;
        this.connection = xMPPConnection;
    }

    private StreamNegotiator determineNegotiator(Stanza stanza) {
        if (stanza instanceof Bytestream) {
            return this.primaryNegotiator;
        }
        if (stanza instanceof Open) {
            return this.secondaryNegotiator;
        }
        throw new IllegalStateException("Unknown stream initation type");
    }

    public InputStream createIncomingStream(StreamInitiation streamInitiation) {
        Stanza initiateIncomingStream = initiateIncomingStream(this.connection, streamInitiation);
        return determineNegotiator(initiateIncomingStream).negotiateIncomingStream(initiateIncomingStream);
    }

    public java.io.OutputStream createOutgoingStream(java.lang.String r2, org.b.a.i r3, org.b.a.i r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.primaryNegotiator;	 Catch:{ Exception -> 0x0007 }
        r0 = r0.createOutgoingStream(r2, r3, r4);	 Catch:{ Exception -> 0x0007 }
        return r0;
    L_0x0007:
        r0 = r1.secondaryNegotiator;
        r0 = r0.createOutgoingStream(r2, r3, r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.filetransfer.FaultTolerantNegotiator.createOutgoingStream(java.lang.String, org.b.a.i, org.b.a.i):java.io.OutputStream");
    }

    public String[] getNamespaces() {
        Object namespaces = this.primaryNegotiator.getNamespaces();
        Object namespaces2 = this.secondaryNegotiator.getNamespaces();
        Object obj = new String[(namespaces.length + namespaces2.length)];
        System.arraycopy(namespaces, 0, obj, 0, namespaces.length);
        System.arraycopy(namespaces2, 0, obj, namespaces.length, namespaces2.length);
        return obj;
    }

    InputStream negotiateIncomingStream(Stanza stanza) {
        throw new UnsupportedOperationException("Negotiation only handled by create incoming stream method.");
    }

    public void newStreamInitiation(i iVar, String str) {
        this.primaryNegotiator.newStreamInitiation(iVar, str);
        this.secondaryNegotiator.newStreamInitiation(iVar, str);
    }
}
