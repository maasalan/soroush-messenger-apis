package org.jivesoftware.smackx.bytestreams.socks5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.bytestreams.BytestreamListener;
import org.jivesoftware.smackx.bytestreams.BytestreamRequest;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream;
import org.jivesoftware.smackx.filetransfer.StreamNegotiator;

final class InitiationListener extends AbstractIqRequestHandler {
    private static final Logger LOGGER = Logger.getLogger(InitiationListener.class.getName());
    private final ExecutorService initiationListenerExecutor = Executors.newCachedThreadPool();
    private final Socks5BytestreamManager manager;

    protected InitiationListener(Socks5BytestreamManager socks5BytestreamManager) {
        super("query", Bytestream.NAMESPACE, Type.set, Mode.async);
        this.manager = socks5BytestreamManager;
    }

    private void processRequest(Stanza stanza) {
        Bytestream bytestream = (Bytestream) stanza;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bytestream.getFrom().toString());
        stringBuilder.append('\t');
        stringBuilder.append(bytestream.getSessionID());
        StreamNegotiator.signal(stringBuilder.toString(), bytestream);
        if (!this.manager.getIgnoredBytestreamRequests().remove(bytestream.getSessionID())) {
            BytestreamRequest socks5BytestreamRequest = new Socks5BytestreamRequest(this.manager, bytestream);
            BytestreamListener userListener = this.manager.getUserListener(bytestream.getFrom());
            if (userListener != null) {
                userListener.incomingBytestreamRequest(socks5BytestreamRequest);
            } else if (this.manager.getAllRequestListeners().isEmpty()) {
                this.manager.replyRejectPacket(bytestream);
            } else {
                for (BytestreamListener userListener2 : this.manager.getAllRequestListeners()) {
                    userListener2.incomingBytestreamRequest(socks5BytestreamRequest);
                }
            }
        }
    }

    public final IQ handleIQRequest(final IQ iq) {
        this.initiationListenerExecutor.execute(new Runnable() {
            public void run() {
                try {
                    InitiationListener.this.processRequest(iq);
                } catch (Throwable e) {
                    InitiationListener.LOGGER.log(Level.WARNING, "process request", e);
                }
            }
        });
        return null;
    }

    protected final void shutdown() {
        this.initiationListenerExecutor.shutdownNow();
    }
}
