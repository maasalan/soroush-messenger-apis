package org.jivesoftware.smackx.filetransfer;

import java.io.InputStream;
import java.io.OutputStream;
import org.b.a.i;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamRequest;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Open;
import org.jivesoftware.smackx.si.packet.StreamInitiation;

public class IBBTransferNegotiator extends StreamNegotiator {
    private XMPPConnection connection;
    private InBandBytestreamManager manager;

    private static final class ByteStreamRequest extends InBandBytestreamRequest {
        private ByteStreamRequest(InBandBytestreamManager inBandBytestreamManager, Open open) {
            super(inBandBytestreamManager, open);
        }
    }

    protected IBBTransferNegotiator(XMPPConnection xMPPConnection) {
        this.connection = xMPPConnection;
        this.manager = InBandBytestreamManager.getByteStreamManager(xMPPConnection);
    }

    public InputStream createIncomingStream(StreamInitiation streamInitiation) {
        this.manager.ignoreBytestreamRequestOnce(streamInitiation.getSessionID());
        return negotiateIncomingStream(initiateIncomingStream(this.connection, streamInitiation));
    }

    public OutputStream createOutgoingStream(String str, i iVar, i iVar2) {
        InBandBytestreamSession establishSession = this.manager.establishSession(iVar2, str);
        establishSession.setCloseBothStreamsEnabled(true);
        return establishSession.getOutputStream();
    }

    public String[] getNamespaces() {
        return new String[]{"http://jabber.org/protocol/ibb"};
    }

    InputStream negotiateIncomingStream(Stanza stanza) {
        InBandBytestreamSession accept = new ByteStreamRequest(this.manager, (Open) stanza).accept();
        accept.setCloseBothStreamsEnabled(true);
        return accept.getInputStream();
    }

    public void newStreamInitiation(i iVar, String str) {
        this.manager.ignoreBytestreamRequestOnce(str);
    }
}
