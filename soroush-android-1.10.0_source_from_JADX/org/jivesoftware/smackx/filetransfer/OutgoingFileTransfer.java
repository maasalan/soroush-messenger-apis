package org.jivesoftware.smackx.filetransfer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.a.i;
import org.jivesoftware.smack.SmackException.IllegalStateChangeException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smackx.filetransfer.FileTransfer.Error;
import org.jivesoftware.smackx.filetransfer.FileTransfer.Status;

public class OutgoingFileTransfer extends FileTransfer {
    private static final Logger LOGGER = Logger.getLogger(OutgoingFileTransfer.class.getName());
    private static int RESPONSE_TIMEOUT = 60000;
    private NegotiationProgress callback;
    private i initiator;
    private OutputStream outputStream;
    private Thread transferThread;

    public interface NegotiationProgress {
        void errorEstablishingStream(Exception exception);

        void outputStreamEstablished(OutputStream outputStream);

        void statusUpdated(Status status, Status status2);
    }

    protected OutgoingFileTransfer(i iVar, i iVar2, String str, FileTransferNegotiator fileTransferNegotiator) {
        super(iVar2, str, fileTransferNegotiator);
        this.initiator = iVar;
    }

    private void checkTransferThread() {
        if ((this.transferThread != null && this.transferThread.isAlive()) || isDone()) {
            throw new IllegalStateException("File transfer in progress or has already completed.");
        }
    }

    public static int getResponseTimeout() {
        return RESPONSE_TIMEOUT;
    }

    private void handleXMPPException(XMPPErrorException xMPPErrorException) {
        XMPPError xMPPError = xMPPErrorException.getXMPPError();
        if (xMPPError != null) {
            switch (xMPPError.getCondition()) {
                case forbidden:
                    setStatus(Status.refused);
                    return;
                case bad_request:
                    setStatus(Status.error);
                    setError(Error.not_acceptable);
                    break;
                default:
                    setStatus(Status.error);
                    break;
            }
        }
        setException(xMPPErrorException);
    }

    private OutputStream negotiateStream(String str, long j, String str2) {
        if (updateStatus(Status.initial, Status.negotiating_transfer)) {
            StreamNegotiator negotiateOutgoingTransfer = this.negotiator.negotiateOutgoingTransfer(getPeer(), this.streamID, str, j, str2, RESPONSE_TIMEOUT);
            if (updateStatus(Status.negotiating_transfer, Status.negotiating_stream)) {
                this.outputStream = negotiateOutgoingTransfer.createOutgoingStream(this.streamID, this.initiator, getPeer());
                if (updateStatus(Status.negotiating_stream, Status.negotiated)) {
                    return this.outputStream;
                }
                throw new IllegalStateChangeException();
            }
            throw new IllegalStateChangeException();
        }
        throw new IllegalStateChangeException();
    }

    public static void setResponseTimeout(int i) {
        RESPONSE_TIMEOUT = i;
    }

    public void cancel() {
        setStatus(Status.cancelled);
    }

    public long getBytesSent() {
        return this.amountWritten;
    }

    protected OutputStream getOutputStream() {
        return getStatus().equals(Status.negotiated) ? this.outputStream : null;
    }

    public synchronized OutputStream sendFile(String str, long j, String str2) {
        if (!isDone()) {
            if (this.outputStream == null) {
                try {
                    setFileInfo(str, j);
                    this.outputStream = negotiateStream(str, j, str2);
                } catch (XMPPErrorException e) {
                    handleXMPPException(e);
                    throw e;
                }
            }
        }
        throw new IllegalStateException("The negotation process has already been attempted on this file transfer");
        return this.outputStream;
    }

    public synchronized void sendFile(final File file, final String str) {
        checkTransferThread();
        if (file != null && file.exists()) {
            if (file.canRead()) {
                setFileInfo(file.getAbsolutePath(), file.getName(), file.length());
                Runnable c77872 = new Runnable() {
                    public void run() {
                        Exception e;
                        InputStream fileInputStream;
                        Throwable e2;
                        Exception exception;
                        try {
                            OutgoingFileTransfer.this.outputStream = OutgoingFileTransfer.this.negotiateStream(file.getName(), file.length(), str);
                        } catch (XMPPErrorException e3) {
                            OutgoingFileTransfer.this.handleXMPPException(e3);
                            return;
                        } catch (Exception e4) {
                            OutgoingFileTransfer.this.setException(e4);
                        }
                        if (OutgoingFileTransfer.this.outputStream != null && OutgoingFileTransfer.this.updateStatus(Status.negotiated, Status.in_progress)) {
                            try {
                                fileInputStream = new FileInputStream(file);
                                try {
                                    OutgoingFileTransfer.this.writeToStream(fileInputStream, OutgoingFileTransfer.this.outputStream);
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable e22) {
                                        OutgoingFileTransfer.LOGGER.log(Level.WARNING, "Closing input stream", e22);
                                    }
                                } catch (FileNotFoundException e5) {
                                    e4 = e5;
                                    OutgoingFileTransfer.this.setStatus(Status.error);
                                    OutgoingFileTransfer.this.setError(Error.bad_file);
                                    OutgoingFileTransfer.this.setException(e4);
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (Throwable e222) {
                                            OutgoingFileTransfer.LOGGER.log(Level.WARNING, "Closing input stream", e222);
                                        }
                                    }
                                    OutgoingFileTransfer.this.outputStream.close();
                                    OutgoingFileTransfer.this.updateStatus(Status.in_progress, Status.complete);
                                } catch (IOException e6) {
                                    e4 = e6;
                                    try {
                                        OutgoingFileTransfer.this.setStatus(Status.error);
                                        OutgoingFileTransfer.this.setException(e4);
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (Throwable e2222) {
                                                OutgoingFileTransfer.LOGGER.log(Level.WARNING, "Closing input stream", e2222);
                                            }
                                        }
                                        OutgoingFileTransfer.this.outputStream.close();
                                        OutgoingFileTransfer.this.updateStatus(Status.in_progress, Status.complete);
                                    } catch (Throwable th) {
                                        e2222 = th;
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (Throwable e7) {
                                                OutgoingFileTransfer.LOGGER.log(Level.WARNING, "Closing input stream", e7);
                                            }
                                        }
                                        try {
                                            OutgoingFileTransfer.this.outputStream.close();
                                        } catch (Throwable e72) {
                                            OutgoingFileTransfer.LOGGER.log(Level.WARNING, "Closing output stream", e72);
                                        }
                                        throw e2222;
                                    }
                                }
                                try {
                                    OutgoingFileTransfer.this.outputStream.close();
                                } catch (Throwable e22222) {
                                    OutgoingFileTransfer.LOGGER.log(Level.WARNING, "Closing output stream", e22222);
                                }
                            } catch (Exception e8) {
                                exception = e8;
                                fileInputStream = null;
                                e4 = exception;
                                OutgoingFileTransfer.this.setStatus(Status.error);
                                OutgoingFileTransfer.this.setError(Error.bad_file);
                                OutgoingFileTransfer.this.setException(e4);
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                OutgoingFileTransfer.this.outputStream.close();
                                OutgoingFileTransfer.this.updateStatus(Status.in_progress, Status.complete);
                            } catch (Exception e82) {
                                exception = e82;
                                fileInputStream = null;
                                e4 = exception;
                                OutgoingFileTransfer.this.setStatus(Status.error);
                                OutgoingFileTransfer.this.setException(e4);
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                OutgoingFileTransfer.this.outputStream.close();
                                OutgoingFileTransfer.this.updateStatus(Status.in_progress, Status.complete);
                            } catch (Throwable e722) {
                                Throwable th2 = e722;
                                fileInputStream = null;
                                e22222 = th2;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                OutgoingFileTransfer.this.outputStream.close();
                                throw e22222;
                            }
                            OutgoingFileTransfer.this.updateStatus(Status.in_progress, Status.complete);
                        }
                    }
                };
                StringBuilder stringBuilder = new StringBuilder("File Transfer ");
                stringBuilder.append(this.streamID);
                this.transferThread = new Thread(c77872, stringBuilder.toString());
                this.transferThread.start();
            }
        }
        throw new IllegalArgumentException("Could not read file");
    }

    public synchronized void sendFile(String str, long j, String str2, NegotiationProgress negotiationProgress) {
        if (negotiationProgress == null) {
            throw new IllegalArgumentException("Callback progress cannot be null.");
        }
        checkTransferThread();
        if (!isDone()) {
            if (this.outputStream == null) {
                setFileInfo(str, j);
                this.callback = negotiationProgress;
                final String str3 = str;
                final long j2 = j;
                final String str4 = str2;
                final NegotiationProgress negotiationProgress2 = negotiationProgress;
                Runnable c77861 = new Runnable() {
                    public void run() {
                        try {
                            OutgoingFileTransfer.this.outputStream = OutgoingFileTransfer.this.negotiateStream(str3, j2, str4);
                            negotiationProgress2.outputStreamEstablished(OutgoingFileTransfer.this.outputStream);
                        } catch (XMPPErrorException e) {
                            OutgoingFileTransfer.this.handleXMPPException(e);
                        } catch (Exception e2) {
                            OutgoingFileTransfer.this.setException(e2);
                        }
                    }
                };
                StringBuilder stringBuilder = new StringBuilder("File Transfer Negotiation ");
                stringBuilder.append(this.streamID);
                this.transferThread = new Thread(c77861, stringBuilder.toString());
                this.transferThread.start();
            }
        }
        throw new IllegalStateException("The negotation process has already been attempted for this file transfer");
    }

    public synchronized void sendStream(InputStream inputStream, String str, long j, String str2) {
        checkTransferThread();
        setFileInfo(str, j);
        final String str3 = str;
        final long j2 = j;
        final String str4 = str2;
        final InputStream inputStream2 = inputStream;
        Runnable c77883 = new Runnable() {
            public void run() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                /*
                r6 = this;
                r0 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this;	 Catch:{ XMPPErrorException -> 0x00a1, Exception -> 0x0012 }
                r1 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this;	 Catch:{ XMPPErrorException -> 0x00a1, Exception -> 0x0012 }
                r2 = r3;	 Catch:{ XMPPErrorException -> 0x00a1, Exception -> 0x0012 }
                r3 = r4;	 Catch:{ XMPPErrorException -> 0x00a1, Exception -> 0x0012 }
                r5 = r6;	 Catch:{ XMPPErrorException -> 0x00a1, Exception -> 0x0012 }
                r1 = r1.negotiateStream(r2, r3, r5);	 Catch:{ XMPPErrorException -> 0x00a1, Exception -> 0x0012 }
                r0.outputStream = r1;	 Catch:{ XMPPErrorException -> 0x00a1, Exception -> 0x0012 }
                goto L_0x0018;
            L_0x0012:
                r0 = move-exception;
                r1 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this;
                r1.setException(r0);
            L_0x0018:
                r0 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this;
                r0 = r0.outputStream;
                if (r0 != 0) goto L_0x0021;
            L_0x0020:
                return;
            L_0x0021:
                r0 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this;
                r1 = org.jivesoftware.smackx.filetransfer.FileTransfer.Status.negotiated;
                r2 = org.jivesoftware.smackx.filetransfer.FileTransfer.Status.in_progress;
                r0 = r0.updateStatus(r1, r2);
                if (r0 != 0) goto L_0x002e;
            L_0x002d:
                return;
            L_0x002e:
                r0 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this;	 Catch:{ IOException -> 0x0059 }
                r1 = r7;	 Catch:{ IOException -> 0x0059 }
                r2 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this;	 Catch:{ IOException -> 0x0059 }
                r2 = r2.outputStream;	 Catch:{ IOException -> 0x0059 }
                r0.writeToStream(r1, r2);	 Catch:{ IOException -> 0x0059 }
                r0 = r7;	 Catch:{ IOException -> 0x007b }
                if (r0 == 0) goto L_0x0044;	 Catch:{ IOException -> 0x007b }
            L_0x003f:
                r0 = r7;	 Catch:{ IOException -> 0x007b }
                r0.close();	 Catch:{ IOException -> 0x007b }
            L_0x0044:
                r0 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this;	 Catch:{ IOException -> 0x007b }
                r0 = r0.outputStream;	 Catch:{ IOException -> 0x007b }
                r0.flush();	 Catch:{ IOException -> 0x007b }
                r0 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this;	 Catch:{ IOException -> 0x007b }
            L_0x004f:
                r0 = r0.outputStream;	 Catch:{ IOException -> 0x007b }
                r0.close();	 Catch:{ IOException -> 0x007b }
                goto L_0x007b;
            L_0x0057:
                r0 = move-exception;
                goto L_0x0085;
            L_0x0059:
                r0 = move-exception;
                r1 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this;	 Catch:{ all -> 0x0057 }
                r2 = org.jivesoftware.smackx.filetransfer.FileTransfer.Status.error;	 Catch:{ all -> 0x0057 }
                r1.setStatus(r2);	 Catch:{ all -> 0x0057 }
                r1 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this;	 Catch:{ all -> 0x0057 }
                r1.setException(r0);	 Catch:{ all -> 0x0057 }
                r0 = r7;	 Catch:{ IOException -> 0x007b }
                if (r0 == 0) goto L_0x006f;	 Catch:{ IOException -> 0x007b }
            L_0x006a:
                r0 = r7;	 Catch:{ IOException -> 0x007b }
                r0.close();	 Catch:{ IOException -> 0x007b }
            L_0x006f:
                r0 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this;	 Catch:{ IOException -> 0x007b }
                r0 = r0.outputStream;	 Catch:{ IOException -> 0x007b }
                r0.flush();	 Catch:{ IOException -> 0x007b }
                r0 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this;	 Catch:{ IOException -> 0x007b }
                goto L_0x004f;
            L_0x007b:
                r0 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this;
                r1 = org.jivesoftware.smackx.filetransfer.FileTransfer.Status.in_progress;
                r2 = org.jivesoftware.smackx.filetransfer.FileTransfer.Status.complete;
                r0.updateStatus(r1, r2);
                return;
            L_0x0085:
                r1 = r7;	 Catch:{ IOException -> 0x00a0 }
                if (r1 == 0) goto L_0x008e;	 Catch:{ IOException -> 0x00a0 }
            L_0x0089:
                r1 = r7;	 Catch:{ IOException -> 0x00a0 }
                r1.close();	 Catch:{ IOException -> 0x00a0 }
            L_0x008e:
                r1 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this;	 Catch:{ IOException -> 0x00a0 }
                r1 = r1.outputStream;	 Catch:{ IOException -> 0x00a0 }
                r1.flush();	 Catch:{ IOException -> 0x00a0 }
                r1 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this;	 Catch:{ IOException -> 0x00a0 }
                r1 = r1.outputStream;	 Catch:{ IOException -> 0x00a0 }
                r1.close();	 Catch:{ IOException -> 0x00a0 }
            L_0x00a0:
                throw r0;
            L_0x00a1:
                r0 = move-exception;
                r1 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this;
                r1.handleXMPPException(r0);
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.3.run():void");
            }
        };
        StringBuilder stringBuilder = new StringBuilder("File Transfer ");
        stringBuilder.append(this.streamID);
        this.transferThread = new Thread(c77883, stringBuilder.toString());
        this.transferThread.start();
    }

    protected void setException(Exception exception) {
        super.setException(exception);
        if (this.callback != null) {
            this.callback.errorEstablishingStream(exception);
        }
    }

    protected void setOutputStream(OutputStream outputStream) {
        if (this.outputStream == null) {
            this.outputStream = outputStream;
        }
    }

    protected void setStatus(Status status) {
        Status status2 = getStatus();
        super.setStatus(status);
        if (this.callback != null) {
            this.callback.statusUpdated(status2, status);
        }
    }

    protected boolean updateStatus(Status status, Status status2) {
        boolean updateStatus = super.updateStatus(status, status2);
        if (this.callback != null && updateStatus) {
            this.callback.statusUpdated(status, status2);
        }
        return updateStatus;
    }
}
