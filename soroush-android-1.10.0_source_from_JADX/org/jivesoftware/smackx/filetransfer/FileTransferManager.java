package org.jivesoftware.smackx.filetransfer;

import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.b.a.f;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smackx.si.packet.StreamInitiation;

public final class FileTransferManager extends Manager {
    private static final Map<XMPPConnection, FileTransferManager> INSTANCES = new WeakHashMap();
    private final FileTransferNegotiator fileTransferNegotiator;
    private final List<FileTransferListener> listeners = new CopyOnWriteArrayList();

    private FileTransferManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        this.fileTransferNegotiator = FileTransferNegotiator.getInstanceFor(xMPPConnection);
        xMPPConnection.registerIQRequestHandler(new AbstractIqRequestHandler(StreamInitiation.ELEMENT, "http://jabber.org/protocol/si", Type.set, Mode.async) {
            public IQ handleIQRequest(IQ iq) {
                FileTransferRequest fileTransferRequest = new FileTransferRequest(FileTransferManager.this, (StreamInitiation) iq);
                for (FileTransferListener fileTransferRequest2 : FileTransferManager.this.listeners) {
                    fileTransferRequest2.fileTransferRequest(fileTransferRequest);
                }
                return null;
            }
        });
    }

    public static synchronized FileTransferManager getInstanceFor(XMPPConnection xMPPConnection) {
        FileTransferManager fileTransferManager;
        synchronized (FileTransferManager.class) {
            fileTransferManager = (FileTransferManager) INSTANCES.get(xMPPConnection);
            if (fileTransferManager == null) {
                fileTransferManager = new FileTransferManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, fileTransferManager);
            }
        }
        return fileTransferManager;
    }

    public final void addFileTransferListener(FileTransferListener fileTransferListener) {
        this.listeners.add(fileTransferListener);
    }

    protected final IncomingFileTransfer createIncomingFileTransfer(FileTransferRequest fileTransferRequest) {
        if (fileTransferRequest == null) {
            throw new NullPointerException("RecieveRequest cannot be null");
        }
        IncomingFileTransfer incomingFileTransfer = new IncomingFileTransfer(fileTransferRequest, this.fileTransferNegotiator);
        incomingFileTransfer.setFileInfo(fileTransferRequest.getFileName(), fileTransferRequest.getFileSize());
        return incomingFileTransfer;
    }

    public final OutgoingFileTransfer createOutgoingFileTransfer(f fVar) {
        if (fVar != null) {
            return new OutgoingFileTransfer(connection().getUser(), fVar, FileTransferNegotiator.getNextStreamID(), this.fileTransferNegotiator);
        }
        throw new IllegalArgumentException("userID was null");
    }

    protected final void rejectIncomingFileTransfer(FileTransferRequest fileTransferRequest) {
        connection().sendStanza(IQ.createErrorResponse(fileTransferRequest.getStreamInitiation(), XMPPError.getBuilder(Condition.forbidden)));
    }

    public final void removeFileTransferListener(FileTransferListener fileTransferListener) {
        this.listeners.remove(fileTransferListener);
    }
}
