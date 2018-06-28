package org.jivesoftware.smackx.filetransfer;

import java.io.InputStream;
import java.io.OutputStream;
import org.b.a.i;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.EventManger;
import org.jivesoftware.smack.util.EventManger.Callback;
import org.jivesoftware.smackx.si.packet.StreamInitiation;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.packet.DataForm;

public abstract class StreamNegotiator {
    protected static final EventManger<String, IQ, NotConnectedException> initationSetEvents = new EventManger();

    protected static StreamInitiation createInitiationAccept(StreamInitiation streamInitiation, String[] strArr) {
        StreamInitiation streamInitiation2 = new StreamInitiation();
        streamInitiation2.setTo(streamInitiation.getFrom());
        streamInitiation2.setFrom(streamInitiation.getTo());
        streamInitiation2.setType(Type.result);
        streamInitiation2.setStanzaId(streamInitiation.getStanzaId());
        DataForm dataForm = new DataForm(DataForm.Type.submit);
        FormField formField = new FormField("stream-method");
        for (String addValue : strArr) {
            formField.addValue(addValue);
        }
        dataForm.addField(formField);
        streamInitiation2.setFeatureNegotiationForm(dataForm);
        return streamInitiation2;
    }

    public static void signal(String str, IQ iq) {
        initationSetEvents.signalEvent(str, iq);
    }

    public abstract InputStream createIncomingStream(StreamInitiation streamInitiation);

    public abstract OutputStream createOutgoingStream(String str, i iVar, i iVar2);

    public abstract String[] getNamespaces();

    protected final IQ initiateIncomingStream(final XMPPConnection xMPPConnection, StreamInitiation streamInitiation) {
        final StreamInitiation createInitiationAccept = createInitiationAccept(streamInitiation, getNamespaces());
        newStreamInitiation(streamInitiation.getFrom(), streamInitiation.getSessionID());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(streamInitiation.getFrom().toString());
        stringBuilder.append('\t');
        stringBuilder.append(streamInitiation.getSessionID());
        try {
            IQ iq = (IQ) initationSetEvents.performActionAndWaitForEvent(stringBuilder.toString(), xMPPConnection.getReplyTimeout(), new Callback<NotConnectedException>() {
                public void action() {
                    /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                    /*
                    r2 = this;
                    r0 = r6;	 Catch:{ InterruptedException -> 0x0007 }
                    r1 = r0;	 Catch:{ InterruptedException -> 0x0007 }
                    r0.sendStanza(r1);	 Catch:{ InterruptedException -> 0x0007 }
                L_0x0007:
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.filetransfer.StreamNegotiator.1.action():void");
                }
            });
            if (iq == null) {
                throw NoResponseException.newWith(xMPPConnection, "stream initiation");
            }
            XMPPErrorException.ifHasErrorThenThrow(iq);
            return iq;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    abstract InputStream negotiateIncomingStream(Stanza stanza);

    protected abstract void newStreamInitiation(i iVar, String str);
}
