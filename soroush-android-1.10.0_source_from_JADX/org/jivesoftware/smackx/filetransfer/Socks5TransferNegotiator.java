package org.jivesoftware.smackx.filetransfer;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import org.b.a.i;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager;
import org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamRequest;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream;
import org.jivesoftware.smackx.si.packet.StreamInitiation;

public class Socks5TransferNegotiator extends StreamNegotiator {
    private XMPPConnection connection;
    private Socks5BytestreamManager manager = Socks5BytestreamManager.getBytestreamManager(this.connection);

    private static final class ByteStreamRequest extends Socks5BytestreamRequest {
        private ByteStreamRequest(Socks5BytestreamManager socks5BytestreamManager, Bytestream bytestream) {
            super(socks5BytestreamManager, bytestream);
        }
    }

    Socks5TransferNegotiator(XMPPConnection xMPPConnection) {
        this.connection = xMPPConnection;
    }

    public InputStream createIncomingStream(StreamInitiation streamInitiation) {
        this.manager.ignoreBytestreamRequestOnce(streamInitiation.getSessionID());
        return negotiateIncomingStream(initiateIncomingStream(this.connection, streamInitiation));
    }

    public OutputStream createOutgoingStream(String str, i iVar, i iVar2) {
        try {
            return this.manager.establishSession(iVar2, str).getOutputStream();
        } catch (Throwable e) {
            throw new SmackException("error establishing SOCKS5 Bytestream", e);
        } catch (Throwable e2) {
            throw new SmackException("error establishing SOCKS5 Bytestream", e2);
        }
    }

    public String[] getNamespaces() {
        return new String[]{Bytestream.NAMESPACE};
    }

    InputStream negotiateIncomingStream(Stanza stanza) {
        try {
            InputStream pushbackInputStream = new PushbackInputStream(new ByteStreamRequest(this.manager, (Bytestream) stanza).accept().getInputStream());
            pushbackInputStream.unread(pushbackInputStream.read());
            return pushbackInputStream;
        } catch (Throwable e) {
            throw new SmackException("Error establishing input stream", e);
        }
    }

    public void newStreamInitiation(i iVar, String str) {
        this.manager.ignoreBytestreamRequestOnce(str);
    }
}
