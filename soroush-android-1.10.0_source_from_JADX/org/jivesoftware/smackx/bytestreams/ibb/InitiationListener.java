package org.jivesoftware.smackx.bytestreams.ibb;

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
import org.jivesoftware.smackx.bytestreams.ibb.packet.Open;
import org.jivesoftware.smackx.filetransfer.StreamNegotiator;

class InitiationListener extends AbstractIqRequestHandler {
    private static final Logger LOGGER = Logger.getLogger(InitiationListener.class.getName());
    private final ExecutorService initiationListenerExecutor = Executors.newCachedThreadPool();
    private final InBandBytestreamManager manager;

    protected InitiationListener(InBandBytestreamManager inBandBytestreamManager) {
        super("open", "http://jabber.org/protocol/ibb", Type.set, Mode.async);
        this.manager = inBandBytestreamManager;
    }

    private void processRequest(Stanza stanza) {
        Open open = (Open) stanza;
        if (open.getBlockSize() > this.manager.getMaximumBlockSize()) {
            this.manager.replyResourceConstraintPacket(open);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(open.getFrom().toString());
        stringBuilder.append('\t');
        stringBuilder.append(open.getSessionID());
        StreamNegotiator.signal(stringBuilder.toString(), open);
        if (!this.manager.getIgnoredBytestreamRequests().remove(open.getSessionID())) {
            BytestreamRequest inBandBytestreamRequest = new InBandBytestreamRequest(this.manager, open);
            BytestreamListener userListener = this.manager.getUserListener(open.getFrom());
            if (userListener != null) {
                userListener.incomingBytestreamRequest(inBandBytestreamRequest);
            } else if (this.manager.getAllRequestListeners().isEmpty()) {
                this.manager.replyRejectPacket(open);
            } else {
                for (BytestreamListener userListener2 : this.manager.getAllRequestListeners()) {
                    userListener2.incomingBytestreamRequest(inBandBytestreamRequest);
                }
            }
        }
    }

    public IQ handleIQRequest(final IQ iq) {
        this.initiationListenerExecutor.execute(new Runnable() {
            public void run() {
                try {
                    InitiationListener.this.processRequest(iq);
                } catch (Throwable e) {
                    InitiationListener.LOGGER.log(Level.WARNING, "proccessRequest", e);
                }
            }
        });
        return null;
    }

    protected void shutdown() {
        this.initiationListenerExecutor.shutdownNow();
    }
}
