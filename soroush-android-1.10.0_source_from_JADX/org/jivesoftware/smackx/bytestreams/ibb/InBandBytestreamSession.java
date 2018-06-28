package org.jivesoftware.smackx.bytestreams.ibb;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.b.a.i;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smack.util.stringencoder.Base64;
import org.jivesoftware.smackx.bytestreams.BytestreamSession;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Close;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Data;
import org.jivesoftware.smackx.bytestreams.ibb.packet.DataPacketExtension;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Open;

public class InBandBytestreamSession implements BytestreamSession {
    private final Open byteStreamRequest;
    private boolean closeBothStreamsEnabled = false;
    private final XMPPConnection connection;
    private IBBInputStream inputStream;
    private boolean isClosed = false;
    private IBBOutputStream outputStream;
    private i remoteJID;

    private abstract class IBBInputStream extends InputStream {
        private byte[] buffer;
        private int bufferPointer = -1;
        private boolean closeInvoked = false;
        private final StanzaListener dataPacketListener = getDataPacketListener();
        protected final BlockingQueue<DataPacketExtension> dataQueue = new LinkedBlockingQueue();
        private boolean isClosed = false;
        private int readTimeout = 0;
        private long seq = -1;

        public IBBInputStream() {
            InBandBytestreamSession.this.connection.addSyncStanzaListener(this.dataPacketListener, getDataPacketFilter());
        }

        private void checkClosed() {
            if (this.closeInvoked) {
                this.dataQueue.clear();
                throw new IOException("Stream is closed");
            }
        }

        private void cleanup() {
            InBandBytestreamSession.this.connection.removeSyncStanzaListener(this.dataPacketListener);
        }

        private void closeInternal() {
            if (!this.isClosed) {
                this.isClosed = true;
            }
        }

        private synchronized boolean loadBuffer() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r9 = this;
            monitor-enter(r9);
            r0 = 0;
            r1 = 0;
            r2 = r9.readTimeout;	 Catch:{ InterruptedException -> 0x0070 }
            if (r2 != 0) goto L_0x0024;	 Catch:{ InterruptedException -> 0x0070 }
        L_0x0007:
            if (r0 != 0) goto L_0x0039;	 Catch:{ InterruptedException -> 0x0070 }
        L_0x0009:
            r0 = r9.isClosed;	 Catch:{ InterruptedException -> 0x0070 }
            if (r0 == 0) goto L_0x0017;	 Catch:{ InterruptedException -> 0x0070 }
        L_0x000d:
            r0 = r9.dataQueue;	 Catch:{ InterruptedException -> 0x0070 }
            r0 = r0.isEmpty();	 Catch:{ InterruptedException -> 0x0070 }
            if (r0 == 0) goto L_0x0017;
        L_0x0015:
            monitor-exit(r9);
            return r1;
        L_0x0017:
            r0 = r9.dataQueue;	 Catch:{ InterruptedException -> 0x0070 }
            r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ InterruptedException -> 0x0070 }
            r4 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x0070 }
            r0 = r0.poll(r2, r4);	 Catch:{ InterruptedException -> 0x0070 }
            r0 = (org.jivesoftware.smackx.bytestreams.ibb.packet.DataPacketExtension) r0;	 Catch:{ InterruptedException -> 0x0070 }
            goto L_0x0007;	 Catch:{ InterruptedException -> 0x0070 }
        L_0x0024:
            r0 = r9.dataQueue;	 Catch:{ InterruptedException -> 0x0070 }
            r2 = r9.readTimeout;	 Catch:{ InterruptedException -> 0x0070 }
            r2 = (long) r2;	 Catch:{ InterruptedException -> 0x0070 }
            r4 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x0070 }
            r0 = r0.poll(r2, r4);	 Catch:{ InterruptedException -> 0x0070 }
            r0 = (org.jivesoftware.smackx.bytestreams.ibb.packet.DataPacketExtension) r0;	 Catch:{ InterruptedException -> 0x0070 }
            if (r0 != 0) goto L_0x0039;	 Catch:{ InterruptedException -> 0x0070 }
        L_0x0033:
            r0 = new java.net.SocketTimeoutException;	 Catch:{ InterruptedException -> 0x0070 }
            r0.<init>();	 Catch:{ InterruptedException -> 0x0070 }
            throw r0;	 Catch:{ InterruptedException -> 0x0070 }
        L_0x0039:
            r2 = r9.seq;	 Catch:{ all -> 0x006e }
            r4 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;	 Catch:{ all -> 0x006e }
            r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));	 Catch:{ all -> 0x006e }
            if (r6 != 0) goto L_0x0046;	 Catch:{ all -> 0x006e }
        L_0x0042:
            r2 = -1;	 Catch:{ all -> 0x006e }
            r9.seq = r2;	 Catch:{ all -> 0x006e }
        L_0x0046:
            r2 = r0.getSeq();	 Catch:{ all -> 0x006e }
            r4 = 1;	 Catch:{ all -> 0x006e }
            r6 = r2 - r4;	 Catch:{ all -> 0x006e }
            r4 = r9.seq;	 Catch:{ all -> 0x006e }
            r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));	 Catch:{ all -> 0x006e }
            if (r8 == 0) goto L_0x0061;	 Catch:{ all -> 0x006e }
        L_0x0054:
            r0 = org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession.this;	 Catch:{ all -> 0x006e }
            r0.close();	 Catch:{ all -> 0x006e }
            r0 = new java.io.IOException;	 Catch:{ all -> 0x006e }
            r1 = "Packets out of sequence";	 Catch:{ all -> 0x006e }
            r0.<init>(r1);	 Catch:{ all -> 0x006e }
            throw r0;	 Catch:{ all -> 0x006e }
        L_0x0061:
            r9.seq = r2;	 Catch:{ all -> 0x006e }
            r0 = r0.getDecodedData();	 Catch:{ all -> 0x006e }
            r9.buffer = r0;	 Catch:{ all -> 0x006e }
            r9.bufferPointer = r1;	 Catch:{ all -> 0x006e }
            r0 = 1;
            monitor-exit(r9);
            return r0;
        L_0x006e:
            r0 = move-exception;
            goto L_0x0079;
        L_0x0070:
            r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x006e }
            r0.interrupt();	 Catch:{ all -> 0x006e }
            monitor-exit(r9);
            return r1;
        L_0x0079:
            monitor-exit(r9);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession.IBBInputStream.loadBuffer():boolean");
        }

        public void close() {
            if (!this.closeInvoked) {
                this.closeInvoked = true;
                InBandBytestreamSession.this.closeByLocal(true);
            }
        }

        protected abstract StanzaFilter getDataPacketFilter();

        protected abstract StanzaListener getDataPacketListener();

        public boolean markSupported() {
            return false;
        }

        public synchronized int read() {
            checkClosed();
            if ((this.bufferPointer == -1 || this.bufferPointer >= this.buffer.length) && !loadBuffer()) {
                return -1;
            }
            byte[] bArr = this.buffer;
            int i = this.bufferPointer;
            this.bufferPointer = i + 1;
            return bArr[i] & 255;
        }

        public synchronized int read(byte[] bArr) {
            return read(bArr, 0, bArr.length);
        }

        public synchronized int read(byte[] bArr, int i, int i2) {
            if (bArr == null) {
                throw new NullPointerException();
            }
            if (i >= 0 && i <= bArr.length && i2 >= 0) {
                int i3 = i + i2;
                if (i3 <= bArr.length) {
                    if (i3 >= 0) {
                        if (i2 == 0) {
                            return 0;
                        }
                        checkClosed();
                        if ((this.bufferPointer == -1 || this.bufferPointer >= this.buffer.length) && !loadBuffer()) {
                            return -1;
                        }
                        i3 = this.buffer.length - this.bufferPointer;
                        if (i2 > i3) {
                            i2 = i3;
                        }
                        System.arraycopy(this.buffer, this.bufferPointer, bArr, i, i2);
                        this.bufferPointer += i2;
                        return i2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    private abstract class IBBOutputStream extends OutputStream {
        protected final byte[] buffer;
        protected int bufferPointer = 0;
        protected boolean isClosed = false;
        protected long seq = 0;

        public IBBOutputStream() {
            this.buffer = new byte[InBandBytestreamSession.this.byteStreamRequest.getBlockSize()];
        }

        private synchronized void flushBuffer() {
            if (this.bufferPointer != 0) {
                try {
                    writeToXML(new DataPacketExtension(InBandBytestreamSession.this.byteStreamRequest.getSessionID(), this.seq, Base64.encodeToString(this.buffer, 0, this.bufferPointer)));
                    this.bufferPointer = 0;
                    this.seq = this.seq + 1 == 65535 ? 0 : this.seq + 1;
                } catch (Throwable e) {
                    IOException iOException = new IOException();
                    iOException.initCause(e);
                    throw iOException;
                }
            }
        }

        private synchronized void writeOut(byte[] bArr, int i, int i2) {
            if (this.isClosed) {
                throw new IOException("Stream is closed");
            }
            int i3 = 0;
            if (i2 > this.buffer.length - this.bufferPointer) {
                i3 = this.buffer.length - this.bufferPointer;
                System.arraycopy(bArr, i, this.buffer, this.bufferPointer, i3);
                this.bufferPointer += i3;
                flushBuffer();
            }
            i2 -= i3;
            System.arraycopy(bArr, i + i3, this.buffer, this.bufferPointer, i2);
            this.bufferPointer += i2;
        }

        public void close() {
            if (!this.isClosed) {
                InBandBytestreamSession.this.closeByLocal(false);
            }
        }

        protected void closeInternal(boolean r2) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r1 = this;
            r0 = r1.isClosed;
            if (r0 == 0) goto L_0x0005;
        L_0x0004:
            return;
        L_0x0005:
            r0 = 1;
            r1.isClosed = r0;
            if (r2 == 0) goto L_0x000e;
        L_0x000a:
            r1.flushBuffer();	 Catch:{ IOException -> 0x000e }
            return;
        L_0x000e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession.IBBOutputStream.closeInternal(boolean):void");
        }

        public synchronized void flush() {
            if (this.isClosed) {
                throw new IOException("Stream is closed");
            }
            flushBuffer();
        }

        public synchronized void write(int i) {
            if (this.isClosed) {
                throw new IOException("Stream is closed");
            }
            if (this.bufferPointer >= this.buffer.length) {
                flushBuffer();
            }
            byte[] bArr = this.buffer;
            int i2 = this.bufferPointer;
            this.bufferPointer = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public synchronized void write(byte[] bArr) {
            write(bArr, 0, bArr.length);
        }

        public synchronized void write(byte[] bArr, int i, int i2) {
            if (bArr == null) {
                throw new NullPointerException();
            }
            if (i >= 0 && i <= bArr.length && i2 >= 0) {
                int i3 = i + i2;
                if (i3 <= bArr.length) {
                    if (i3 >= 0) {
                        if (i2 != 0) {
                            if (this.isClosed) {
                                throw new IOException("Stream is closed");
                            } else if (i2 >= this.buffer.length) {
                                writeOut(bArr, i, this.buffer.length);
                                write(bArr, i + this.buffer.length, i2 - this.buffer.length);
                                return;
                            } else {
                                writeOut(bArr, i, i2);
                                return;
                            }
                        }
                        return;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }

        protected abstract void writeToXML(DataPacketExtension dataPacketExtension);
    }

    private class IBBDataPacketFilter implements StanzaFilter {
        private IBBDataPacketFilter() {
        }

        public boolean accept(Stanza stanza) {
            if (!stanza.getFrom().a(InBandBytestreamSession.this.remoteJID)) {
                return false;
            }
            DataPacketExtension dataPacketExtension;
            if (stanza instanceof Data) {
                dataPacketExtension = ((Data) stanza).getDataPacketExtension();
            } else {
                dataPacketExtension = (DataPacketExtension) stanza.getExtension("data", "http://jabber.org/protocol/ibb");
                if (dataPacketExtension == null) {
                    return false;
                }
            }
            return dataPacketExtension.getSessionID().equals(InBandBytestreamSession.this.byteStreamRequest.getSessionID());
        }
    }

    private class IQIBBInputStream extends IBBInputStream {

        class C79071 implements StanzaListener {
            private long lastSequence = -1;

            C79071() {
            }

            public void processStanza(Stanza stanza) {
                IQ iq;
                Condition condition;
                DataPacketExtension dataPacketExtension = ((Data) stanza).getDataPacketExtension();
                if (dataPacketExtension.getSeq() <= this.lastSequence) {
                    iq = (IQ) stanza;
                    condition = Condition.unexpected_request;
                } else if (dataPacketExtension.getDecodedData() == null) {
                    iq = (IQ) stanza;
                    condition = Condition.bad_request;
                } else {
                    IQIBBInputStream.this.dataQueue.offer(dataPacketExtension);
                    InBandBytestreamSession.this.connection.sendStanza(IQ.createResultIQ((IQ) stanza));
                    this.lastSequence = dataPacketExtension.getSeq();
                    if (this.lastSequence == 65535) {
                        this.lastSequence = -1;
                    }
                    return;
                }
                InBandBytestreamSession.this.connection.sendStanza(IQ.createErrorResponse(iq, condition));
            }
        }

        private IQIBBInputStream() {
            super();
        }

        protected StanzaFilter getDataPacketFilter() {
            return new AndFilter(new StanzaTypeFilter(Data.class), new IBBDataPacketFilter());
        }

        protected StanzaListener getDataPacketListener() {
            return new C79071();
        }
    }

    private class IQIBBOutputStream extends IBBOutputStream {
        private IQIBBOutputStream() {
            super();
        }

        protected synchronized void writeToXML(DataPacketExtension dataPacketExtension) {
            IQ data = new Data(dataPacketExtension);
            data.setTo(InBandBytestreamSession.this.remoteJID);
            try {
                InBandBytestreamSession.this.connection.createStanzaCollectorAndSend(data).nextResultOrThrow();
            } catch (Throwable e) {
                if (!this.isClosed) {
                    InBandBytestreamSession.this.close();
                    IOException iOException = new IOException();
                    iOException.initCause(e);
                    throw iOException;
                }
            }
        }
    }

    private class MessageIBBInputStream extends IBBInputStream {

        class C79081 implements StanzaListener {
            C79081() {
            }

            public void processStanza(Stanza stanza) {
                DataPacketExtension dataPacketExtension = (DataPacketExtension) stanza.getExtension("data", "http://jabber.org/protocol/ibb");
                if (dataPacketExtension.getDecodedData() != null) {
                    MessageIBBInputStream.this.dataQueue.offer(dataPacketExtension);
                }
            }
        }

        private MessageIBBInputStream() {
            super();
        }

        protected StanzaFilter getDataPacketFilter() {
            return new AndFilter(new StanzaTypeFilter(Message.class), new IBBDataPacketFilter());
        }

        protected StanzaListener getDataPacketListener() {
            return new C79081();
        }
    }

    private class MessageIBBOutputStream extends IBBOutputStream {
        private MessageIBBOutputStream() {
            super();
        }

        protected synchronized void writeToXML(DataPacketExtension dataPacketExtension) {
            Stanza message = new Message(InBandBytestreamSession.this.remoteJID);
            message.addExtension(dataPacketExtension);
            InBandBytestreamSession.this.connection.sendStanza(message);
        }
    }

    protected InBandBytestreamSession(XMPPConnection xMPPConnection, Open open, i iVar) {
        this.connection = xMPPConnection;
        this.byteStreamRequest = open;
        this.remoteJID = iVar;
        switch (open.getStanza()) {
            case IQ:
                this.inputStream = new IQIBBInputStream();
                this.outputStream = new IQIBBOutputStream();
                return;
            case MESSAGE:
                this.inputStream = new MessageIBBInputStream();
                this.outputStream = new MessageIBBOutputStream();
                return;
            default:
                return;
        }
    }

    public void close() {
        closeByLocal(true);
        closeByLocal(false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected synchronized void closeByLocal(boolean r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.isClosed;	 Catch:{ all -> 0x006d }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r2);
        return;
    L_0x0007:
        r0 = r2.closeBothStreamsEnabled;	 Catch:{ all -> 0x006d }
        r1 = 1;
        if (r0 == 0) goto L_0x0012;
    L_0x000c:
        r3 = r2.inputStream;	 Catch:{ all -> 0x006d }
        r3.closeInternal();	 Catch:{ all -> 0x006d }
        goto L_0x001a;
    L_0x0012:
        if (r3 == 0) goto L_0x001a;
    L_0x0014:
        r3 = r2.inputStream;	 Catch:{ all -> 0x006d }
        r3.closeInternal();	 Catch:{ all -> 0x006d }
        goto L_0x001f;
    L_0x001a:
        r3 = r2.outputStream;	 Catch:{ all -> 0x006d }
        r3.closeInternal(r1);	 Catch:{ all -> 0x006d }
    L_0x001f:
        r3 = r2.inputStream;	 Catch:{ all -> 0x006d }
        r3 = r3.isClosed;	 Catch:{ all -> 0x006d }
        if (r3 == 0) goto L_0x006b;
    L_0x0027:
        r3 = r2.outputStream;	 Catch:{ all -> 0x006d }
        r3 = r3.isClosed;	 Catch:{ all -> 0x006d }
        if (r3 == 0) goto L_0x006b;
    L_0x002d:
        r2.isClosed = r1;	 Catch:{ all -> 0x006d }
        r3 = new org.jivesoftware.smackx.bytestreams.ibb.packet.Close;	 Catch:{ all -> 0x006d }
        r0 = r2.byteStreamRequest;	 Catch:{ all -> 0x006d }
        r0 = r0.getSessionID();	 Catch:{ all -> 0x006d }
        r3.<init>(r0);	 Catch:{ all -> 0x006d }
        r0 = r2.remoteJID;	 Catch:{ all -> 0x006d }
        r3.setTo(r0);	 Catch:{ all -> 0x006d }
        r0 = r2.connection;	 Catch:{ Exception -> 0x0061 }
        r3 = r0.createStanzaCollectorAndSend(r3);	 Catch:{ Exception -> 0x0061 }
        r3.nextResultOrThrow();	 Catch:{ Exception -> 0x0061 }
        r3 = r2.inputStream;	 Catch:{ all -> 0x006d }
        r3.cleanup();	 Catch:{ all -> 0x006d }
        r3 = r2.connection;	 Catch:{ all -> 0x006d }
        r3 = org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager.getByteStreamManager(r3);	 Catch:{ all -> 0x006d }
        r3 = r3.getSessions();	 Catch:{ all -> 0x006d }
        r0 = r2.byteStreamRequest;	 Catch:{ all -> 0x006d }
        r0 = r0.getSessionID();	 Catch:{ all -> 0x006d }
        r3.remove(r0);	 Catch:{ all -> 0x006d }
        goto L_0x006b;
    L_0x0061:
        r3 = move-exception;
        r0 = new java.io.IOException;	 Catch:{ all -> 0x006d }
        r0.<init>();	 Catch:{ all -> 0x006d }
        r0.initCause(r3);	 Catch:{ all -> 0x006d }
        throw r0;	 Catch:{ all -> 0x006d }
    L_0x006b:
        monitor-exit(r2);
        return;
    L_0x006d:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession.closeByLocal(boolean):void");
    }

    protected void closeByPeer(Close close) {
        this.inputStream.closeInternal();
        this.inputStream.cleanup();
        this.outputStream.closeInternal(false);
        this.connection.sendStanza(IQ.createResultIQ(close));
    }

    public InputStream getInputStream() {
        return this.inputStream;
    }

    public OutputStream getOutputStream() {
        return this.outputStream;
    }

    public int getReadTimeout() {
        return this.inputStream.readTimeout;
    }

    public boolean isCloseBothStreamsEnabled() {
        return this.closeBothStreamsEnabled;
    }

    public void processIQPacket(Data data) {
        this.inputStream.dataPacketListener.processStanza(data);
    }

    public void setCloseBothStreamsEnabled(boolean z) {
        this.closeBothStreamsEnabled = z;
    }

    public void setReadTimeout(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Timeout must be >= 0");
        }
        this.inputStream.readTimeout = i;
    }
}
