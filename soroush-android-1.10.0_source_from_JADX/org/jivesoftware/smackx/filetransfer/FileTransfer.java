package org.jivesoftware.smackx.filetransfer;

import java.io.InputStream;
import java.io.OutputStream;
import org.b.a.i;

public abstract class FileTransfer {
    private static final int BUFFER_SIZE = 8192;
    protected long amountWritten = -1;
    private Error error;
    private Exception exception;
    private String fileName;
    private String filePath;
    private long fileSize;
    protected FileTransferNegotiator negotiator;
    private i peer;
    private Status status = Status.initial;
    private final Object statusMonitor = new Object();
    protected String streamID;

    public enum Error {
        none("No error"),
        not_acceptable("The peer did not find any of the provided stream mechanisms acceptable."),
        bad_file("The provided file to transfer does not exist or could not be read."),
        no_response("The remote user did not respond or the connection timed out."),
        connection("An error occured over the socket connected to send the file."),
        stream("An error occured while sending or recieving the file.");
        
        private final String msg;

        private Error(String str) {
            this.msg = str;
        }

        public final String getMessage() {
            return this.msg;
        }

        public final String toString() {
            return this.msg;
        }
    }

    public enum Status {
        error("Error"),
        initial("Initial"),
        negotiating_transfer("Negotiating Transfer"),
        refused("Refused"),
        negotiating_stream("Negotiating Stream"),
        negotiated("Negotiated"),
        in_progress("In Progress"),
        complete("Complete"),
        cancelled("Cancelled");
        
        private final String status;

        private Status(String str) {
            this.status = str;
        }

        public final String toString() {
            return this.status;
        }
    }

    protected FileTransfer(i iVar, String str, FileTransferNegotiator fileTransferNegotiator) {
        this.peer = iVar;
        this.streamID = str;
        this.negotiator = fileTransferNegotiator;
    }

    public abstract void cancel();

    public long getAmountWritten() {
        return this.amountWritten;
    }

    public Error getError() {
        return this.error;
    }

    public Exception getException() {
        return this.exception;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public i getPeer() {
        return this.peer;
    }

    public double getProgress() {
        if (this.amountWritten > 0) {
            if (this.fileSize > 0) {
                return ((double) this.amountWritten) / ((double) this.fileSize);
            }
        }
        return 0.0d;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getStreamID() {
        return this.streamID;
    }

    public boolean isDone() {
        if (!(this.status == Status.cancelled || this.status == Status.error || this.status == Status.complete)) {
            if (this.status != Status.refused) {
                return false;
            }
        }
        return true;
    }

    protected void setError(Error error) {
        this.error = error;
    }

    protected void setException(Exception exception) {
        this.exception = exception;
    }

    protected void setFileInfo(String str, long j) {
        this.fileName = str;
        this.fileSize = j;
    }

    protected void setFileInfo(String str, String str2, long j) {
        this.filePath = str;
        this.fileName = str2;
        this.fileSize = j;
    }

    protected void setStatus(Status status) {
        synchronized (this.statusMonitor) {
            this.status = status;
        }
    }

    protected boolean updateStatus(Status status, Status status2) {
        synchronized (this.statusMonitor) {
            if (status != this.status) {
                return false;
            }
            this.status = status2;
            return true;
        }
    }

    protected void writeToStream(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[BUFFER_SIZE];
        this.amountWritten = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0 && !getStatus().equals(Status.cancelled)) {
                outputStream.write(bArr, 0, read);
                this.amountWritten += (long) read;
            }
        }
        if (!getStatus().equals(Status.cancelled) && getError() == Error.none && this.amountWritten != this.fileSize) {
            setStatus(Status.error);
            this.error = Error.connection;
        }
    }
}
