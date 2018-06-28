package org.jivesoftware.smackx.filetransfer;

import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;
import org.b.a.i;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.filetransfer.FileTransferException.NoAcceptableTransferMechanisms;
import org.jivesoftware.smackx.filetransfer.FileTransferException.NoStreamMethodsOfferedException;
import org.jivesoftware.smackx.hoxt.packet.AbstractHttpOverXmpp.Ibb;
import org.jivesoftware.smackx.si.packet.StreamInitiation;
import org.jivesoftware.smackx.si.packet.StreamInitiation.File;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.FormField.Option;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import org.jivesoftware.smackx.xdata.packet.DataForm.Type;

public final class FileTransferNegotiator extends Manager {
    public static boolean IBB_ONLY = false;
    private static final Map<XMPPConnection, FileTransferNegotiator> INSTANCES = new WeakHashMap();
    private static final String[] NAMESPACE;
    public static final String SI_NAMESPACE = "http://jabber.org/protocol/si";
    public static final String SI_PROFILE_FILE_TRANSFER_NAMESPACE = "http://jabber.org/protocol/si/profile/file-transfer";
    protected static final String STREAM_DATA_FIELD_NAME = "stream-method";
    private static final String STREAM_INIT_PREFIX = "jsi_";
    private static final Random randomGenerator = new Random();
    private final StreamNegotiator byteStreamTransferManager;
    private final StreamNegotiator inbandTransferManager;

    static {
        r0 = new String[2];
        boolean z = false;
        r0[0] = "http://jabber.org/protocol/si";
        r0[1] = SI_PROFILE_FILE_TRANSFER_NAMESPACE;
        NAMESPACE = r0;
        if (System.getProperty(Ibb.ELEMENT) != null) {
            z = true;
        }
        IBB_ONLY = z;
    }

    private FileTransferNegotiator(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        this.byteStreamTransferManager = new Socks5TransferNegotiator(xMPPConnection);
        this.inbandTransferManager = new IBBTransferNegotiator(xMPPConnection);
        setServiceEnabled(xMPPConnection, true);
    }

    private static DataForm createDefaultInitiationForm() {
        DataForm dataForm = new DataForm(Type.form);
        FormField formField = new FormField(STREAM_DATA_FIELD_NAME);
        formField.setType(FormField.Type.list_single);
        if (!IBB_ONLY) {
            formField.addOption(new Option(Bytestream.NAMESPACE));
        }
        formField.addOption(new Option("http://jabber.org/protocol/ibb"));
        dataForm.addField(formField);
        return dataForm;
    }

    public static synchronized FileTransferNegotiator getInstanceFor(XMPPConnection xMPPConnection) {
        FileTransferNegotiator fileTransferNegotiator;
        synchronized (FileTransferNegotiator.class) {
            fileTransferNegotiator = (FileTransferNegotiator) INSTANCES.get(xMPPConnection);
            if (fileTransferNegotiator == null) {
                fileTransferNegotiator = new FileTransferNegotiator(xMPPConnection);
                INSTANCES.put(xMPPConnection, fileTransferNegotiator);
            }
        }
        return fileTransferNegotiator;
    }

    private StreamNegotiator getNegotiator(FormField formField) {
        Object obj = null;
        Object obj2 = null;
        for (Option value : formField.getOptions()) {
            String value2 = value.getValue();
            if (value2.equals(Bytestream.NAMESPACE) && !IBB_ONLY) {
                obj = 1;
            } else if (value2.equals("http://jabber.org/protocol/ibb")) {
                obj2 = 1;
            }
        }
        if (obj != null || obj2 != null) {
            return (obj == null || obj2 == null) ? obj != null ? this.byteStreamTransferManager : this.inbandTransferManager : new FaultTolerantNegotiator(connection(), this.byteStreamTransferManager, this.inbandTransferManager);
        } else {
            throw new NoAcceptableTransferMechanisms();
        }
    }

    public static String getNextStreamID() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(STREAM_INIT_PREFIX);
        stringBuilder.append(Math.abs(randomGenerator.nextLong()));
        return stringBuilder.toString();
    }

    private StreamNegotiator getOutgoingNegotiator(FormField formField) {
        Object obj = null;
        Object obj2 = null;
        for (String str : formField.getValues()) {
            if (str.equals(Bytestream.NAMESPACE) && !IBB_ONLY) {
                obj = 1;
            } else if (str.equals("http://jabber.org/protocol/ibb")) {
                obj2 = 1;
            }
        }
        if (obj != null || obj2 != null) {
            return (obj == null || obj2 == null) ? obj != null ? this.byteStreamTransferManager : this.inbandTransferManager : new FaultTolerantNegotiator(connection(), this.byteStreamTransferManager, this.inbandTransferManager);
        } else {
            throw new NoAcceptableTransferMechanisms();
        }
    }

    private static FormField getStreamMethodField(DataForm dataForm) {
        return dataForm.getField(STREAM_DATA_FIELD_NAME);
    }

    public static Collection<String> getSupportedProtocols() {
        List arrayList = new ArrayList();
        arrayList.add("http://jabber.org/protocol/ibb");
        if (!IBB_ONLY) {
            arrayList.add(Bytestream.NAMESPACE);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean isServiceEnabled(XMPPConnection xMPPConnection) {
        ServiceDiscoveryManager instanceFor = ServiceDiscoveryManager.getInstanceFor(xMPPConnection);
        List<String> arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(NAMESPACE));
        arrayList.add("http://jabber.org/protocol/ibb");
        if (!IBB_ONLY) {
            arrayList.add(Bytestream.NAMESPACE);
        }
        for (String includesFeature : arrayList) {
            if (!instanceFor.includesFeature(includesFeature)) {
                return false;
            }
        }
        return true;
    }

    private static void setServiceEnabled(XMPPConnection xMPPConnection, boolean z) {
        ServiceDiscoveryManager instanceFor = ServiceDiscoveryManager.getInstanceFor(xMPPConnection);
        List<String> arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(NAMESPACE));
        arrayList.add("http://jabber.org/protocol/ibb");
        if (!IBB_ONLY) {
            arrayList.add(Bytestream.NAMESPACE);
        }
        for (String str : arrayList) {
            if (z) {
                instanceFor.addFeature(str);
            } else {
                instanceFor.removeFeature(str);
            }
        }
    }

    public final StreamNegotiator negotiateOutgoingTransfer(i iVar, String str, String str2, long j, String str3, int i) {
        IQ streamInitiation = new StreamInitiation();
        streamInitiation.setSessionID(str);
        streamInitiation.setMimeType(URLConnection.guessContentTypeFromName(str2));
        File file = new File(str2, j);
        file.setDesc(str3);
        streamInitiation.setFile(file);
        streamInitiation.setFeatureNegotiationForm(createDefaultInitiationForm());
        streamInitiation.setFrom(connection().getUser());
        streamInitiation.setTo(iVar);
        streamInitiation.setType(IQ.Type.set);
        Stanza nextResultOrThrow = connection().createStanzaCollectorAndSend(streamInitiation).nextResultOrThrow((long) i);
        if (!(nextResultOrThrow instanceof IQ)) {
            return null;
        }
        IQ iq = (IQ) nextResultOrThrow;
        if (iq.getType().equals(IQ.Type.result)) {
            return getOutgoingNegotiator(getStreamMethodField(((StreamInitiation) nextResultOrThrow).getFeatureNegotiationForm()));
        }
        throw new XMPPErrorException(iq, iq.getError());
    }

    public final StreamNegotiator selectStreamNegotiator(FileTransferRequest fileTransferRequest) {
        IQ streamInitiation = fileTransferRequest.getStreamInitiation();
        FormField streamMethodField = getStreamMethodField(streamInitiation.getFeatureNegotiationForm());
        if (streamMethodField == null) {
            connection().sendStanza(IQ.createErrorResponse(streamInitiation, XMPPError.from(Condition.bad_request, "No stream methods contained in stanza.")));
            throw new NoStreamMethodsOfferedException();
        }
        try {
            return getNegotiator(streamMethodField);
        } catch (NoAcceptableTransferMechanisms e) {
            connection().sendStanza(IQ.createErrorResponse(streamInitiation, XMPPError.from(Condition.bad_request, "No acceptable transfer mechanism")));
            throw e;
        }
    }
}
