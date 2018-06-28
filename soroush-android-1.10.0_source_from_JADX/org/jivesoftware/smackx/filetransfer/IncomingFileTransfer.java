package org.jivesoftware.smackx.filetransfer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smackx.filetransfer.FileTransfer.Error;
import org.jivesoftware.smackx.filetransfer.FileTransfer.Status;

public class IncomingFileTransfer extends FileTransfer {
    private static final Logger LOGGER = Logger.getLogger(IncomingFileTransfer.class.getName());
    private InputStream inputStream;
    private FileTransferRequest recieveRequest;

    protected IncomingFileTransfer(FileTransferRequest fileTransferRequest, FileTransferNegotiator fileTransferNegotiator) {
        super(fileTransferRequest.getRequestor(), fileTransferRequest.getStreamID(), fileTransferNegotiator);
        this.recieveRequest = fileTransferRequest;
    }

    private InputStream negotiateStream() {
        setStatus(Status.negotiating_transfer);
        final StreamNegotiator selectStreamNegotiator = this.negotiator.selectStreamNegotiator(this.recieveRequest);
        setStatus(Status.negotiating_stream);
        FutureTask futureTask = new FutureTask(new Callable<InputStream>() {
            public InputStream call() {
                return selectStreamNegotiator.createIncomingStream(IncomingFileTransfer.this.recieveRequest.getStreamInitiation());
            }
        });
        futureTask.run();
        try {
            InputStream inputStream = (InputStream) futureTask.get(15, TimeUnit.SECONDS);
            futureTask.cancel(true);
            setStatus(Status.negotiated);
            return inputStream;
        } catch (Throwable e) {
            Throwable cause = e.getCause();
            if (cause instanceof XMPPErrorException) {
                throw ((XMPPErrorException) cause);
            } else if (cause instanceof InterruptedException) {
                throw ((InterruptedException) cause);
            } else if (cause instanceof NoResponseException) {
                throw ((NoResponseException) cause);
            } else if (cause instanceof SmackException) {
                throw ((SmackException) cause);
            } else {
                throw new SmackException("Error in execution", e);
            }
        } catch (Throwable e2) {
            throw new SmackException("Request timed out", e2);
        } catch (Throwable th) {
            futureTask.cancel(true);
        }
    }

    public void cancel() {
        setStatus(Status.cancelled);
    }

    public InputStream recieveFile() {
        if (this.inputStream != null) {
            throw new IllegalStateException("Transfer already negotiated!");
        }
        try {
            this.inputStream = negotiateStream();
            return this.inputStream;
        } catch (Exception e) {
            setException(e);
            throw e;
        }
    }

    public void recieveFile(final File file) {
        if (file == null) {
            throw new IllegalArgumentException("File cannot be null");
        }
        if (!file.exists()) {
            file.createNewFile();
        }
        if (file.canWrite()) {
            Runnable c77841 = new Runnable() {
                public void run() {
                    OutputStream fileOutputStream;
                    Exception e;
                    IncomingFileTransfer incomingFileTransfer;
                    Error error;
                    Exception exception;
                    try {
                        IncomingFileTransfer.this.inputStream = IncomingFileTransfer.this.negotiateStream();
                        try {
                            fileOutputStream = new FileOutputStream(file);
                            try {
                                IncomingFileTransfer.this.setStatus(Status.in_progress);
                                IncomingFileTransfer.this.writeToStream(IncomingFileTransfer.this.inputStream, fileOutputStream);
                            } catch (FileNotFoundException e2) {
                                e = e2;
                                IncomingFileTransfer.this.setStatus(Status.error);
                                incomingFileTransfer = IncomingFileTransfer.this;
                                error = Error.bad_file;
                                incomingFileTransfer.setError(error);
                                IncomingFileTransfer.this.setException(e);
                                if (IncomingFileTransfer.this.getStatus().equals(Status.in_progress)) {
                                    IncomingFileTransfer.this.setStatus(Status.complete);
                                }
                                if (IncomingFileTransfer.this.inputStream != null) {
                                    try {
                                        IncomingFileTransfer.this.inputStream.close();
                                    } catch (Throwable e3) {
                                        IncomingFileTransfer.LOGGER.log(Level.WARNING, "Closing input stream", e3);
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable e32) {
                                        IncomingFileTransfer.LOGGER.log(Level.WARNING, "Closing output stream", e32);
                                    }
                                }
                            } catch (IOException e4) {
                                e = e4;
                                IncomingFileTransfer.this.setStatus(Status.error);
                                incomingFileTransfer = IncomingFileTransfer.this;
                                error = Error.stream;
                                incomingFileTransfer.setError(error);
                                IncomingFileTransfer.this.setException(e);
                                if (IncomingFileTransfer.this.getStatus().equals(Status.in_progress)) {
                                    IncomingFileTransfer.this.setStatus(Status.complete);
                                }
                                if (IncomingFileTransfer.this.inputStream != null) {
                                    IncomingFileTransfer.this.inputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            }
                        } catch (Exception e5) {
                            exception = e5;
                            fileOutputStream = null;
                            e = exception;
                            IncomingFileTransfer.this.setStatus(Status.error);
                            incomingFileTransfer = IncomingFileTransfer.this;
                            error = Error.bad_file;
                            incomingFileTransfer.setError(error);
                            IncomingFileTransfer.this.setException(e);
                            if (IncomingFileTransfer.this.getStatus().equals(Status.in_progress)) {
                                IncomingFileTransfer.this.setStatus(Status.complete);
                            }
                            if (IncomingFileTransfer.this.inputStream != null) {
                                IncomingFileTransfer.this.inputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        } catch (Exception e52) {
                            exception = e52;
                            fileOutputStream = null;
                            e = exception;
                            IncomingFileTransfer.this.setStatus(Status.error);
                            incomingFileTransfer = IncomingFileTransfer.this;
                            error = Error.stream;
                            incomingFileTransfer.setError(error);
                            IncomingFileTransfer.this.setException(e);
                            if (IncomingFileTransfer.this.getStatus().equals(Status.in_progress)) {
                                IncomingFileTransfer.this.setStatus(Status.complete);
                            }
                            if (IncomingFileTransfer.this.inputStream != null) {
                                IncomingFileTransfer.this.inputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        }
                        if (IncomingFileTransfer.this.getStatus().equals(Status.in_progress)) {
                            IncomingFileTransfer.this.setStatus(Status.complete);
                        }
                        if (IncomingFileTransfer.this.inputStream != null) {
                            IncomingFileTransfer.this.inputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } catch (Exception e6) {
                        IncomingFileTransfer.this.setStatus(Status.error);
                        IncomingFileTransfer.this.setException(e6);
                    }
                }
            };
            StringBuilder stringBuilder = new StringBuilder("File Transfer ");
            stringBuilder.append(this.streamID);
            new Thread(c77841, stringBuilder.toString()).start();
            return;
        }
        throw new IllegalArgumentException("Cannot write to provided file");
    }
}
