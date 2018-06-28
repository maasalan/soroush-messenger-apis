package org.jivesoftware.smackx.filetransfer;

import org.b.a.i;
import org.jivesoftware.smackx.si.packet.StreamInitiation;

public class FileTransferRequest {
    private final FileTransferManager manager;
    private final StreamInitiation streamInitiation;

    public FileTransferRequest(FileTransferManager fileTransferManager, StreamInitiation streamInitiation) {
        this.streamInitiation = streamInitiation;
        this.manager = fileTransferManager;
    }

    public IncomingFileTransfer accept() {
        return this.manager.createIncomingFileTransfer(this);
    }

    public String getDescription() {
        return this.streamInitiation.getFile().getDesc();
    }

    public String getFileName() {
        return this.streamInitiation.getFile().getName();
    }

    public long getFileSize() {
        return this.streamInitiation.getFile().getSize();
    }

    public String getMimeType() {
        return this.streamInitiation.getMimeType();
    }

    public i getRequestor() {
        return this.streamInitiation.getFrom();
    }

    public String getStreamID() {
        return this.streamInitiation.getSessionID();
    }

    protected StreamInitiation getStreamInitiation() {
        return this.streamInitiation;
    }

    public void reject() {
        this.manager.rejectIncomingFileTransfer(this);
    }
}
