package org.jivesoftware.smackx.httpfileupload;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.b.a.b;
import org.jivesoftware.smack.AbstractConnectionListener;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo;
import org.jivesoftware.smackx.httpfileupload.element.Slot;
import org.jivesoftware.smackx.httpfileupload.element.SlotRequest;
import org.jivesoftware.smackx.httpfileupload.element.SlotRequest_V0_2;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.packet.DataForm;

public final class HttpFileUploadManager extends Manager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Map<XMPPConnection, HttpFileUploadManager> INSTANCES = new WeakHashMap();
    private static final Logger LOGGER = Logger.getLogger(HttpFileUploadManager.class.getName());
    public static final String NAMESPACE = "urn:xmpp:http:upload:0";
    public static final String NAMESPACE_0_2 = "urn:xmpp:http:upload";
    private UploadService defaultUploadService;
    private SSLSocketFactory tlsSocketFactory;

    static class C79241 implements ConnectionCreationListener {
        C79241() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            HttpFileUploadManager.getInstanceFor(xMPPConnection);
        }
    }

    class C80202 extends AbstractConnectionListener {
        C80202() {
        }

        public void authenticated(XMPPConnection xMPPConnection, boolean z) {
            if (!z) {
            }
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79241());
    }

    private HttpFileUploadManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        xMPPConnection.addConnectionListener(new C80202());
    }

    private static boolean containsHttpFileUploadNamespace(DiscoverInfo discoverInfo) {
        if (!discoverInfo.containsFeature("urn:xmpp:http:upload:0")) {
            if (!discoverInfo.containsFeature("urn:xmpp:http:upload")) {
                return false;
            }
        }
        return true;
    }

    public static synchronized HttpFileUploadManager getInstanceFor(XMPPConnection xMPPConnection) {
        HttpFileUploadManager httpFileUploadManager;
        synchronized (HttpFileUploadManager.class) {
            httpFileUploadManager = (HttpFileUploadManager) INSTANCES.get(xMPPConnection);
            if (httpFileUploadManager == null) {
                httpFileUploadManager = new HttpFileUploadManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, httpFileUploadManager);
            }
        }
        return httpFileUploadManager;
    }

    private void uploadFile(File file, Slot slot, UploadProgressListener uploadProgressListener) {
        BufferedInputStream bufferedInputStream;
        long length = file.length();
        if (length >= 2147483647L) {
            StringBuilder stringBuilder = new StringBuilder("File size ");
            stringBuilder.append(length);
            stringBuilder.append(" must be less than 2147483647");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        OutputStream outputStream;
        int i = (int) length;
        InputStream fileInputStream = new FileInputStream(file);
        URL putUrl = slot.getPutUrl();
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(putUrl.openConnection()));
        httpURLConnection.setRequestMethod("PUT");
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setFixedLengthStreamingMode(i);
        httpURLConnection.setRequestProperty("Content-Type", "application/octet-stream;");
        for (Entry entry : slot.getHeaders().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        SSLSocketFactory sSLSocketFactory = this.tlsSocketFactory;
        if (sSLSocketFactory != null && (httpURLConnection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        try {
            outputStream = httpURLConnection.getOutputStream();
            long j = 0;
            if (uploadProgressListener != null) {
                uploadProgressListener.onUploadProgress(0, length);
            }
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            byte[] bArr = new byte[ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
                long j2 = j + ((long) read);
                if (uploadProgressListener != null) {
                    uploadProgressListener.onUploadProgress(j2, length);
                }
                j = j2;
            }
            bufferedInputStream.close();
        } catch (Throwable e) {
            LOGGER.log(Level.WARNING, "Exception while closing input stream", e);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
        try {
            outputStream.close();
        } catch (Throwable e2) {
            LOGGER.log(Level.WARNING, "Exception while closing output stream", e2);
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 204) {
            switch (responseCode) {
                case 200:
                case 201:
                    break;
                default:
                    StringBuilder stringBuilder2 = new StringBuilder("Error response ");
                    stringBuilder2.append(responseCode);
                    stringBuilder2.append(" from server during file upload: ");
                    stringBuilder2.append(httpURLConnection.getResponseMessage());
                    stringBuilder2.append(", file size: ");
                    stringBuilder2.append(length);
                    stringBuilder2.append(", put URL: ");
                    stringBuilder2.append(putUrl);
                    throw new IOException(stringBuilder2.toString());
            }
        }
        httpURLConnection.disconnect();
    }

    private static UploadService uploadServiceFrom(DiscoverInfo discoverInfo) {
        Version version;
        if (discoverInfo.containsFeature("urn:xmpp:http:upload:0")) {
            version = Version.v0_3;
        } else if (discoverInfo.containsFeature("urn:xmpp:http:upload")) {
            version = Version.v0_2;
        } else {
            throw new AssertionError();
        }
        b t = discoverInfo.getFrom().t();
        DataForm from = DataForm.from(discoverInfo);
        if (from == null) {
            return new UploadService(t, version);
        }
        FormField field = from.getField("max-file-size");
        if (field == null) {
            return new UploadService(t, version);
        }
        List values = field.getValues();
        return values.isEmpty() ? new UploadService(t, version) : new UploadService(t, version, Long.valueOf((String) values.get(0)));
    }

    public final boolean discoverUploadService() {
        ServiceDiscoveryManager instanceFor = ServiceDiscoveryManager.getInstanceFor(connection());
        List findServicesDiscoverInfo = instanceFor.findServicesDiscoverInfo("urn:xmpp:http:upload:0", true, true);
        if (findServicesDiscoverInfo.isEmpty()) {
            findServicesDiscoverInfo = instanceFor.findServicesDiscoverInfo("urn:xmpp:http:upload", true, true);
            if (findServicesDiscoverInfo.isEmpty()) {
                return false;
            }
        }
        this.defaultUploadService = uploadServiceFrom((DiscoverInfo) findServicesDiscoverInfo.get(0));
        return true;
    }

    public final UploadService getDefaultUploadService() {
        return this.defaultUploadService;
    }

    public final boolean isUploadServiceDiscovered() {
        return this.defaultUploadService != null;
    }

    public final Slot requestSlot(String str, long j) {
        return requestSlot(str, j, null, null);
    }

    public final Slot requestSlot(String str, long j, String str2) {
        return requestSlot(str, j, str2, null);
    }

    public final Slot requestSlot(String str, long j, String str2, b bVar) {
        XMPPConnection connection = connection();
        UploadService uploadService = this.defaultUploadService;
        if (bVar != null) {
            if (uploadService == null || !uploadService.getAddress().a(bVar)) {
                DiscoverInfo discoverInfo = ServiceDiscoveryManager.getInstanceFor(connection).discoverInfo(bVar);
                if (containsHttpFileUploadNamespace(discoverInfo)) {
                    uploadService = uploadServiceFrom(discoverInfo);
                } else {
                    StringBuilder stringBuilder = new StringBuilder("There is no HTTP upload service running at the given address '");
                    stringBuilder.append(bVar);
                    stringBuilder.append('\'');
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        if (uploadService == null) {
            throw new SmackException("No upload service specified and also none discovered.");
        } else if (uploadService.acceptsFileOfSize(j)) {
            switch (uploadService.getVersion()) {
                case v0_3:
                    IQ slotRequest = new SlotRequest(uploadService.getAddress(), str, j, str2);
                    break;
                case v0_2:
                    IQ slotRequest_V0_2 = new SlotRequest_V0_2(uploadService.getAddress(), str, j, str2);
                    break;
                default:
                    throw new AssertionError();
            }
            return (Slot) connection.createStanzaCollectorAndSend(r15).nextResultOrThrow();
        } else {
            StringBuilder stringBuilder2 = new StringBuilder("Requested file size ");
            stringBuilder2.append(j);
            stringBuilder2.append(" is greater than max allowed size ");
            stringBuilder2.append(uploadService.getMaxFileSize());
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    public final void setTlsContext(SSLContext sSLContext) {
        if (sSLContext != null) {
            this.tlsSocketFactory = sSLContext.getSocketFactory();
        }
    }

    public final URL uploadFile(File file) {
        return uploadFile(file, null);
    }

    public final URL uploadFile(File file, UploadProgressListener uploadProgressListener) {
        if (file.isFile()) {
            Slot requestSlot = requestSlot(file.getName(), file.length(), "application/octet-stream");
            uploadFile(file, requestSlot, uploadProgressListener);
            return requestSlot.getGetUrl();
        }
        StringBuilder stringBuilder = new StringBuilder("The path ");
        stringBuilder.append(file.getAbsolutePath());
        stringBuilder.append(" is not a file");
        throw new FileNotFoundException(stringBuilder.toString());
    }

    public final void useTlsSettingsFrom(ConnectionConfiguration connectionConfiguration) {
        setTlsContext(connectionConfiguration.getCustomSSLContext());
    }
}
