package org.jivesoftware.smack.debugger;

import java.io.Reader;
import java.io.Writer;
import org.b.a.f;
import org.jivesoftware.smack.ConnectionListener;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.ObservableReader;
import org.jivesoftware.smack.util.ObservableWriter;
import org.jivesoftware.smack.util.ReaderListener;
import org.jivesoftware.smack.util.WriterListener;

public abstract class AbstractDebugger implements SmackDebugger {
    public static boolean printInterpreted = false;
    private final ConnectionListener connListener;
    private final XMPPConnection connection;
    private final StanzaListener listener;
    private ObservableReader reader;
    private final ReaderListener readerListener;
    private ObservableWriter writer;
    private final WriterListener writerListener;

    public AbstractDebugger(final XMPPConnection xMPPConnection, Writer writer, Reader reader) {
        this.connection = xMPPConnection;
        this.reader = new ObservableReader(reader);
        this.readerListener = new ReaderListener() {
            public void read(String str) {
                AbstractDebugger abstractDebugger = AbstractDebugger.this;
                StringBuilder stringBuilder = new StringBuilder("RECV (");
                stringBuilder.append(xMPPConnection.getConnectionCounter());
                stringBuilder.append("): ");
                stringBuilder.append(str);
                abstractDebugger.log(stringBuilder.toString());
            }
        };
        this.reader.addReaderListener(this.readerListener);
        this.writer = new ObservableWriter(writer);
        this.writerListener = new WriterListener() {
            public void write(String str) {
                AbstractDebugger abstractDebugger = AbstractDebugger.this;
                StringBuilder stringBuilder = new StringBuilder("SENT (");
                stringBuilder.append(xMPPConnection.getConnectionCounter());
                stringBuilder.append("): ");
                stringBuilder.append(str);
                abstractDebugger.log(stringBuilder.toString());
            }
        };
        this.writer.addWriterListener(this.writerListener);
        this.listener = new StanzaListener() {
            public void processStanza(Stanza stanza) {
                if (AbstractDebugger.printInterpreted) {
                    AbstractDebugger abstractDebugger = AbstractDebugger.this;
                    StringBuilder stringBuilder = new StringBuilder("RCV PKT (");
                    stringBuilder.append(xMPPConnection.getConnectionCounter());
                    stringBuilder.append("): ");
                    stringBuilder.append(stanza.toXML());
                    abstractDebugger.log(stringBuilder.toString());
                }
            }
        };
        this.connListener = new ConnectionListener() {
            public void authenticated(XMPPConnection xMPPConnection, boolean z) {
                StringBuilder stringBuilder = new StringBuilder("XMPPConnection authenticated (");
                stringBuilder.append(xMPPConnection);
                stringBuilder.append(")");
                String stringBuilder2 = stringBuilder.toString();
                if (z) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(stringBuilder2);
                    stringBuilder3.append(" and resumed");
                    stringBuilder2 = stringBuilder3.toString();
                }
                AbstractDebugger.this.log(stringBuilder2);
            }

            public void connected(XMPPConnection xMPPConnection) {
                AbstractDebugger abstractDebugger = AbstractDebugger.this;
                StringBuilder stringBuilder = new StringBuilder("XMPPConnection connected (");
                stringBuilder.append(xMPPConnection);
                stringBuilder.append(")");
                abstractDebugger.log(stringBuilder.toString());
            }

            public void connectionClosed() {
                AbstractDebugger abstractDebugger = AbstractDebugger.this;
                StringBuilder stringBuilder = new StringBuilder("XMPPConnection closed (");
                stringBuilder.append(xMPPConnection);
                stringBuilder.append(")");
                abstractDebugger.log(stringBuilder.toString());
            }

            public void connectionClosedOnError(Exception exception) {
                AbstractDebugger abstractDebugger = AbstractDebugger.this;
                StringBuilder stringBuilder = new StringBuilder("XMPPConnection closed due to an exception (");
                stringBuilder.append(xMPPConnection);
                stringBuilder.append(")");
                abstractDebugger.log(stringBuilder.toString(), exception);
            }

            public void reconnectingIn(int i) {
                AbstractDebugger abstractDebugger = AbstractDebugger.this;
                StringBuilder stringBuilder = new StringBuilder("XMPPConnection (");
                stringBuilder.append(xMPPConnection);
                stringBuilder.append(") will reconnect in ");
                stringBuilder.append(i);
                abstractDebugger.log(stringBuilder.toString());
            }

            public void reconnectionFailed(Exception exception) {
                AbstractDebugger abstractDebugger = AbstractDebugger.this;
                StringBuilder stringBuilder = new StringBuilder("Reconnection failed due to an exception (");
                stringBuilder.append(xMPPConnection);
                stringBuilder.append(")");
                abstractDebugger.log(stringBuilder.toString(), exception);
            }

            public void reconnectionSuccessful() {
                AbstractDebugger abstractDebugger = AbstractDebugger.this;
                StringBuilder stringBuilder = new StringBuilder("XMPPConnection reconnected (");
                stringBuilder.append(xMPPConnection);
                stringBuilder.append(")");
                abstractDebugger.log(stringBuilder.toString());
            }
        };
    }

    public Reader getReader() {
        return this.reader;
    }

    public StanzaListener getReaderListener() {
        return this.listener;
    }

    public Writer getWriter() {
        return this.writer;
    }

    public StanzaListener getWriterListener() {
        return null;
    }

    public abstract void log(String str);

    public abstract void log(String str, Throwable th);

    public Reader newConnectionReader(Reader reader) {
        this.reader.removeReaderListener(this.readerListener);
        ObservableReader observableReader = new ObservableReader(reader);
        observableReader.addReaderListener(this.readerListener);
        this.reader = observableReader;
        return this.reader;
    }

    public Writer newConnectionWriter(Writer writer) {
        this.writer.removeWriterListener(this.writerListener);
        ObservableWriter observableWriter = new ObservableWriter(writer);
        observableWriter.addWriterListener(this.writerListener);
        this.writer = observableWriter;
        return this.writer;
    }

    public void userHasLogged(f fVar) {
        String bVar = fVar.a().toString();
        boolean equals = "".equals(bVar);
        StringBuilder stringBuilder = new StringBuilder("User logged (");
        stringBuilder.append(this.connection.getConnectionCounter());
        stringBuilder.append("): ");
        if (equals) {
            bVar = "";
        }
        stringBuilder.append(bVar);
        stringBuilder.append("@");
        stringBuilder.append(this.connection.getXMPPServiceDomain());
        stringBuilder.append(":");
        stringBuilder.append(this.connection.getPort());
        bVar = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(bVar);
        stringBuilder2.append("/");
        stringBuilder2.append(fVar.c());
        log(stringBuilder2.toString());
        this.connection.addConnectionListener(this.connListener);
    }
}
