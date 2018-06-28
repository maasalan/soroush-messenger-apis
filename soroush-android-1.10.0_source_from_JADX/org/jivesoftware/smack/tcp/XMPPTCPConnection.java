package org.jivesoftware.smack.tcp;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.PasswordCallback;
import org.b.a.a.d;
import org.b.c.b;
import org.jivesoftware.smack.AbstractConnectionListener;
import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.ConnectionConfiguration.DnssecMode;
import org.jivesoftware.smack.ConnectionConfiguration.SecurityMode;
import org.jivesoftware.smack.SmackConfiguration;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.AlreadyConnectedException;
import org.jivesoftware.smack.SmackException.AlreadyLoggedInException;
import org.jivesoftware.smack.SmackException.ConnectionException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.SmackException.SecurityRequiredByServerException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.SynchronizationPoint;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.XMPPException.FailedNonzaException;
import org.jivesoftware.smack.XMPPException.StreamErrorException;
import org.jivesoftware.smack.compress.packet.Compress;
import org.jivesoftware.smack.compress.packet.Compress.Feature;
import org.jivesoftware.smack.compression.XMPPInputOutputStream;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.packet.Element;
import org.jivesoftware.smack.packet.Nonza;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.packet.StartTls;
import org.jivesoftware.smack.packet.StreamOpen;
import org.jivesoftware.smack.proxy.ProxyInfo;
import org.jivesoftware.smack.sm.SMUtils;
import org.jivesoftware.smack.sm.StreamManagementException.StreamManagementCounterError;
import org.jivesoftware.smack.sm.StreamManagementException.StreamManagementNotEnabledException;
import org.jivesoftware.smack.sm.packet.StreamManagement;
import org.jivesoftware.smack.sm.packet.StreamManagement.AckAnswer;
import org.jivesoftware.smack.sm.packet.StreamManagement.AckRequest;
import org.jivesoftware.smack.sm.packet.StreamManagement.Enable;
import org.jivesoftware.smack.sm.packet.StreamManagement.Resume;
import org.jivesoftware.smack.sm.packet.StreamManagement.StreamManagementFeature;
import org.jivesoftware.smack.sm.predicates.Predicate;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration.Builder;
import org.jivesoftware.smack.util.ArrayBlockingQueueWithShutdown;
import org.jivesoftware.smack.util.Async;
import org.jivesoftware.smack.util.DNSUtil;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.TLSUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smack.util.dns.HostAddress;
import org.jivesoftware.smack.util.dns.SmackDaneProvider;
import org.jivesoftware.smack.util.dns.SmackDaneVerifier;
import org.xmlpull.v1.XmlPullParser;

public class XMPPTCPConnection extends AbstractXMPPConnection {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Logger LOGGER = Logger.getLogger(XMPPTCPConnection.class.getName());
    private static final int QUEUE_SIZE = 500;
    private static BundleAndDeferCallback defaultBundleAndDeferCallback = null;
    private static boolean useSmDefault = true;
    private static boolean useSmResumptionDefault = true;
    private BundleAndDeferCallback bundleAndDeferCallback;
    private long clientHandledStanzasCount;
    private final SynchronizationPoint<Exception> closingStreamReceived;
    private final SynchronizationPoint<SmackException> compressSyncPoint;
    private final XMPPTCPConnectionConfiguration config;
    private boolean disconnectedButResumeable;
    private final SynchronizationPoint<Exception> initalOpenStreamSend;
    private final SynchronizationPoint<XMPPException> maybeCompressFeaturesReceived;
    protected PacketReader packetReader;
    protected PacketWriter packetWriter;
    private final Set<StanzaFilter> requestAckPredicates;
    private SSLSocket secureSocket;
    private long serverHandledStanzasCount;
    private int smClientMaxResumptionTime;
    private final SynchronizationPoint<SmackException> smEnabledSyncPoint;
    private final SynchronizationPoint<FailedNonzaException> smResumedSyncPoint;
    private int smServerMaxResumptimTime;
    private String smSessionId;
    private boolean smWasEnabledAtLeastOnce;
    private Socket socket;
    private final Collection<StanzaListener> stanzaAcknowledgedListeners;
    private final Map<String, StanzaListener> stanzaIdAcknowledgedListeners;
    private BlockingQueue<Stanza> unacknowledgedStanzas;
    private boolean useSm;
    private boolean useSmResumption;

    protected class PacketReader {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private volatile boolean done;
        XmlPullParser parser;

        class C77601 implements Runnable {
            C77601() {
            }

            public void run() {
                PacketReader.this.parsePackets();
            }
        }

        static {
            Class cls = XMPPTCPConnection.class;
        }

        protected PacketReader() {
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void parsePackets() {
            /*
            r7 = this;
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.initalOpenStreamSend;	 Catch:{ Exception -> 0x0422 }
            r0.checkIfSuccessOrWait();	 Catch:{ Exception -> 0x0422 }
            r0 = r7.parser;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.getEventType();	 Catch:{ Exception -> 0x0422 }
        L_0x000f:
            r1 = r7.done;	 Catch:{ Exception -> 0x0422 }
            if (r1 != 0) goto L_0x0421;
        L_0x0013:
            switch(r0) {
                case 1: goto L_0x0411;
                case 2: goto L_0x0092;
                case 3: goto L_0x0018;
                default: goto L_0x0016;
            };	 Catch:{ Exception -> 0x0422 }
        L_0x0016:
            goto L_0x0419;
        L_0x0018:
            r0 = r7.parser;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.getName();	 Catch:{ Exception -> 0x0422 }
            r1 = "stream";
            r0 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r0 == 0) goto L_0x0419;
        L_0x0026:
            r0 = r7.parser;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.getNamespace();	 Catch:{ Exception -> 0x0422 }
            r1 = "http://etherx.jabber.org/streams";
            r0 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r0 != 0) goto L_0x0059;
        L_0x0034:
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.LOGGER;	 Catch:{ Exception -> 0x0422 }
            r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0422 }
            r1.<init>();	 Catch:{ Exception -> 0x0422 }
            r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1.append(r2);	 Catch:{ Exception -> 0x0422 }
            r2 = " </stream> but different namespace ";
            r1.append(r2);	 Catch:{ Exception -> 0x0422 }
            r2 = r7.parser;	 Catch:{ Exception -> 0x0422 }
            r2 = r2.getNamespace();	 Catch:{ Exception -> 0x0422 }
            r1.append(r2);	 Catch:{ Exception -> 0x0422 }
            r1 = r1.toString();	 Catch:{ Exception -> 0x0422 }
        L_0x0054:
            r0.warning(r1);	 Catch:{ Exception -> 0x0422 }
            goto L_0x0419;
        L_0x0059:
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.packetWriter;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.queue;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.isShutdown();	 Catch:{ Exception -> 0x0422 }
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1 = r1.closingStreamReceived;	 Catch:{ Exception -> 0x0422 }
            r1.reportSuccess();	 Catch:{ Exception -> 0x0422 }
            if (r0 == 0) goto L_0x0071;
        L_0x0070:
            return;
        L_0x0071:
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.LOGGER;	 Catch:{ Exception -> 0x0422 }
            r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0422 }
            r1.<init>();	 Catch:{ Exception -> 0x0422 }
            r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1.append(r2);	 Catch:{ Exception -> 0x0422 }
            r2 = " received closing </stream> element. Server wants to terminate the connection, calling disconnect()";
            r1.append(r2);	 Catch:{ Exception -> 0x0422 }
            r1 = r1.toString();	 Catch:{ Exception -> 0x0422 }
            r0.info(r1);	 Catch:{ Exception -> 0x0422 }
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r0.disconnect();	 Catch:{ Exception -> 0x0422 }
            goto L_0x0419;
        L_0x0092:
            r0 = r7.parser;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.getName();	 Catch:{ Exception -> 0x0422 }
            r1 = r0.hashCode();	 Catch:{ Exception -> 0x0422 }
            r2 = 2;
            r3 = 0;
            r4 = -1;
            r5 = 1;
            switch(r1) {
                case -1867169789: goto L_0x0149;
                case -1609594047: goto L_0x013e;
                case -1281977283: goto L_0x0133;
                case -1276666629: goto L_0x0129;
                case -1086574198: goto L_0x011f;
                case -891990144: goto L_0x0115;
                case -369449087: goto L_0x010a;
                case -309519186: goto L_0x0100;
                case -290659267: goto L_0x00f6;
                case 97: goto L_0x00ea;
                case 114: goto L_0x00de;
                case 3368: goto L_0x00d3;
                case 96784904: goto L_0x00c8;
                case 954925063: goto L_0x00bd;
                case 1097547223: goto L_0x00b1;
                case 1402633315: goto L_0x00a5;
                default: goto L_0x00a3;
            };	 Catch:{ Exception -> 0x0422 }
        L_0x00a3:
            goto L_0x0154;
        L_0x00a5:
            r1 = "challenge";
            r1 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r1 == 0) goto L_0x0154;
        L_0x00ad:
            r1 = 8;
            goto L_0x0155;
        L_0x00b1:
            r1 = "resumed";
            r1 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r1 == 0) goto L_0x0154;
        L_0x00b9:
            r1 = 13;
            goto L_0x0155;
        L_0x00bd:
            r1 = "message";
            r1 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r1 == 0) goto L_0x0154;
        L_0x00c5:
            r1 = r3;
            goto L_0x0155;
        L_0x00c8:
            r1 = "error";
            r1 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r1 == 0) goto L_0x0154;
        L_0x00d0:
            r1 = 4;
            goto L_0x0155;
        L_0x00d3:
            r1 = "iq";
            r1 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r1 == 0) goto L_0x0154;
        L_0x00db:
            r1 = r5;
            goto L_0x0155;
        L_0x00de:
            r1 = "r";
            r1 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r1 == 0) goto L_0x0154;
        L_0x00e6:
            r1 = 15;
            goto L_0x0155;
        L_0x00ea:
            r1 = "a";
            r1 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r1 == 0) goto L_0x0154;
        L_0x00f2:
            r1 = 14;
            goto L_0x0155;
        L_0x00f6:
            r1 = "features";
            r1 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r1 == 0) goto L_0x0154;
        L_0x00fe:
            r1 = 5;
            goto L_0x0155;
        L_0x0100:
            r1 = "proceed";
            r1 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r1 == 0) goto L_0x0154;
        L_0x0108:
            r1 = 6;
            goto L_0x0155;
        L_0x010a:
            r1 = "compressed";
            r1 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r1 == 0) goto L_0x0154;
        L_0x0112:
            r1 = 10;
            goto L_0x0155;
        L_0x0115:
            r1 = "stream";
            r1 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r1 == 0) goto L_0x0154;
        L_0x011d:
            r1 = 3;
            goto L_0x0155;
        L_0x011f:
            r1 = "failure";
            r1 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r1 == 0) goto L_0x0154;
        L_0x0127:
            r1 = 7;
            goto L_0x0155;
        L_0x0129:
            r1 = "presence";
            r1 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r1 == 0) goto L_0x0154;
        L_0x0131:
            r1 = r2;
            goto L_0x0155;
        L_0x0133:
            r1 = "failed";
            r1 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r1 == 0) goto L_0x0154;
        L_0x013b:
            r1 = 12;
            goto L_0x0155;
        L_0x013e:
            r1 = "enabled";
            r1 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r1 == 0) goto L_0x0154;
        L_0x0146:
            r1 = 11;
            goto L_0x0155;
        L_0x0149:
            r1 = "success";
            r1 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r1 == 0) goto L_0x0154;
        L_0x0151:
            r1 = 9;
            goto L_0x0155;
        L_0x0154:
            r1 = r4;
        L_0x0155:
            r6 = 0;
            switch(r1) {
                case 0: goto L_0x03d7;
                case 1: goto L_0x03d7;
                case 2: goto L_0x03d7;
                case 3: goto L_0x03b0;
                case 4: goto L_0x038d;
                case 5: goto L_0x0384;
                case 6: goto L_0x0368;
                case 7: goto L_0x0303;
                case 8: goto L_0x02f2;
                case 9: goto L_0x02d7;
                case 10: goto L_0x02c6;
                case 11: goto L_0x0268;
                case 12: goto L_0x0215;
                case 13: goto L_0x0190;
                case 14: goto L_0x017f;
                case 15: goto L_0x015f;
                default: goto L_0x0159;
            };	 Catch:{ Exception -> 0x0422 }
        L_0x0159:
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.LOGGER;	 Catch:{ Exception -> 0x0422 }
            goto L_0x03ff;
        L_0x015f:
            r0 = r7.parser;	 Catch:{ Exception -> 0x0422 }
            org.jivesoftware.smack.sm.provider.ParseStreamManagement.ackRequest(r0);	 Catch:{ Exception -> 0x0422 }
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.smEnabledSyncPoint;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.wasSuccessful();	 Catch:{ Exception -> 0x0422 }
            if (r0 == 0) goto L_0x0177;
        L_0x0170:
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r0.sendSmAcknowledgementInternal();	 Catch:{ Exception -> 0x0422 }
            goto L_0x0419;
        L_0x0177:
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.LOGGER;	 Catch:{ Exception -> 0x0422 }
            r1 = "SM Ack Request received while SM is not enabled";
            goto L_0x0054;
        L_0x017f:
            r0 = r7.parser;	 Catch:{ Exception -> 0x0422 }
            r0 = org.jivesoftware.smack.sm.provider.ParseStreamManagement.ackAnswer(r0);	 Catch:{ Exception -> 0x0422 }
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r2 = r0.getHandledCount();	 Catch:{ Exception -> 0x0422 }
            r1.processHandledCount(r2);	 Catch:{ Exception -> 0x0422 }
            goto L_0x0419;
        L_0x0190:
            r0 = r7.parser;	 Catch:{ Exception -> 0x0422 }
            r0 = org.jivesoftware.smack.sm.provider.ParseStreamManagement.resumed(r0);	 Catch:{ Exception -> 0x0422 }
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1 = r1.smSessionId;	 Catch:{ Exception -> 0x0422 }
            r2 = r0.getPrevId();	 Catch:{ Exception -> 0x0422 }
            r1 = r1.equals(r2);	 Catch:{ Exception -> 0x0422 }
            if (r1 != 0) goto L_0x01b6;
        L_0x01a6:
            r1 = new org.jivesoftware.smack.sm.StreamManagementException$StreamIdDoesNotMatchException;	 Catch:{ Exception -> 0x0422 }
            r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r2 = r2.smSessionId;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.getPrevId();	 Catch:{ Exception -> 0x0422 }
            r1.<init>(r2, r0);	 Catch:{ Exception -> 0x0422 }
            throw r1;	 Catch:{ Exception -> 0x0422 }
        L_0x01b6:
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1 = r1.smResumedSyncPoint;	 Catch:{ Exception -> 0x0422 }
            r1.reportSuccess();	 Catch:{ Exception -> 0x0422 }
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1 = r1.smEnabledSyncPoint;	 Catch:{ Exception -> 0x0422 }
            r1.reportSuccess();	 Catch:{ Exception -> 0x0422 }
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r2 = r0.getHandledCount();	 Catch:{ Exception -> 0x0422 }
            r1.processHandledCount(r2);	 Catch:{ Exception -> 0x0422 }
            r0 = new java.util.ArrayList;	 Catch:{ Exception -> 0x0422 }
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1 = r1.unacknowledgedStanzas;	 Catch:{ Exception -> 0x0422 }
            r1 = r1.size();	 Catch:{ Exception -> 0x0422 }
            r0.<init>(r1);	 Catch:{ Exception -> 0x0422 }
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1 = r1.unacknowledgedStanzas;	 Catch:{ Exception -> 0x0422 }
            r1.drainTo(r0);	 Catch:{ Exception -> 0x0422 }
            r1 = r0.iterator();	 Catch:{ Exception -> 0x0422 }
        L_0x01ed:
            r2 = r1.hasNext();	 Catch:{ Exception -> 0x0422 }
            if (r2 == 0) goto L_0x01ff;
        L_0x01f3:
            r2 = r1.next();	 Catch:{ Exception -> 0x0422 }
            r2 = (org.jivesoftware.smack.packet.Stanza) r2;	 Catch:{ Exception -> 0x0422 }
            r3 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r3.sendStanzaInternal(r2);	 Catch:{ Exception -> 0x0422 }
            goto L_0x01ed;
        L_0x01ff:
            r0 = r0.isEmpty();	 Catch:{ Exception -> 0x0422 }
            if (r0 != 0) goto L_0x020a;
        L_0x0205:
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r0.requestSmAcknowledgementInternal();	 Catch:{ Exception -> 0x0422 }
        L_0x020a:
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.LOGGER;	 Catch:{ Exception -> 0x0422 }
            r1 = "Stream Management (XEP-198): Stream resumed";
        L_0x0210:
            r0.fine(r1);	 Catch:{ Exception -> 0x0422 }
            goto L_0x0419;
        L_0x0215:
            r0 = r7.parser;	 Catch:{ Exception -> 0x0422 }
            r0 = org.jivesoftware.smack.sm.provider.ParseStreamManagement.failed(r0);	 Catch:{ Exception -> 0x0422 }
            r1 = new org.jivesoftware.smack.XMPPException$FailedNonzaException;	 Catch:{ Exception -> 0x0422 }
            r2 = r0.getXMPPErrorCondition();	 Catch:{ Exception -> 0x0422 }
            r1.<init>(r0, r2);	 Catch:{ Exception -> 0x0422 }
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.smResumedSyncPoint;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.requestSent();	 Catch:{ Exception -> 0x0422 }
            if (r0 == 0) goto L_0x023b;
        L_0x0230:
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.smResumedSyncPoint;	 Catch:{ Exception -> 0x0422 }
        L_0x0236:
            r0.reportFailure(r1);	 Catch:{ Exception -> 0x0422 }
            goto L_0x0419;
        L_0x023b:
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.smEnabledSyncPoint;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.requestSent();	 Catch:{ Exception -> 0x0422 }
            if (r0 != 0) goto L_0x024f;
        L_0x0247:
            r0 = new java.lang.IllegalStateException;	 Catch:{ Exception -> 0x0422 }
            r1 = "Failed element received but SM was not previously enabled";
            r0.<init>(r1);	 Catch:{ Exception -> 0x0422 }
            throw r0;	 Catch:{ Exception -> 0x0422 }
        L_0x024f:
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.smEnabledSyncPoint;	 Catch:{ Exception -> 0x0422 }
            r2 = new org.jivesoftware.smack.SmackException;	 Catch:{ Exception -> 0x0422 }
            r2.<init>(r1);	 Catch:{ Exception -> 0x0422 }
            r0.reportFailure(r2);	 Catch:{ Exception -> 0x0422 }
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.lastFeaturesReceived;	 Catch:{ Exception -> 0x0422 }
        L_0x0263:
            r0.reportSuccess();	 Catch:{ Exception -> 0x0422 }
            goto L_0x0419;
        L_0x0268:
            r0 = r7.parser;	 Catch:{ Exception -> 0x0422 }
            r0 = org.jivesoftware.smack.sm.provider.ParseStreamManagement.enabled(r0);	 Catch:{ Exception -> 0x0422 }
            r1 = r0.isResumeSet();	 Catch:{ Exception -> 0x0422 }
            if (r1 == 0) goto L_0x02a4;
        L_0x0274:
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r2 = r0.getId();	 Catch:{ Exception -> 0x0422 }
            r1.smSessionId = r2;	 Catch:{ Exception -> 0x0422 }
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1 = r1.smSessionId;	 Catch:{ Exception -> 0x0422 }
            r1 = org.jivesoftware.smack.util.StringUtils.isNullOrEmpty(r1);	 Catch:{ Exception -> 0x0422 }
            if (r1 == 0) goto L_0x029a;
        L_0x0289:
            r0 = new org.jivesoftware.smack.SmackException;	 Catch:{ Exception -> 0x0422 }
            r1 = "Stream Management 'enabled' element with resume attribute but without session id received";
            r0.<init>(r1);	 Catch:{ Exception -> 0x0422 }
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1 = r1.smEnabledSyncPoint;	 Catch:{ Exception -> 0x0422 }
            r1.reportFailure(r0);	 Catch:{ Exception -> 0x0422 }
            throw r0;	 Catch:{ Exception -> 0x0422 }
        L_0x029a:
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.getMaxResumptionTime();	 Catch:{ Exception -> 0x0422 }
            r1.smServerMaxResumptimTime = r0;	 Catch:{ Exception -> 0x0422 }
            goto L_0x02a9;
        L_0x02a4:
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r0.smSessionId = r6;	 Catch:{ Exception -> 0x0422 }
        L_0x02a9:
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1 = 0;
            r0.clientHandledStanzasCount = r1;	 Catch:{ Exception -> 0x0422 }
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r0.smWasEnabledAtLeastOnce = r5;	 Catch:{ Exception -> 0x0422 }
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.smEnabledSyncPoint;	 Catch:{ Exception -> 0x0422 }
            r0.reportSuccess();	 Catch:{ Exception -> 0x0422 }
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.LOGGER;	 Catch:{ Exception -> 0x0422 }
            r1 = "Stream Management (XEP-198): succesfully enabled";
            goto L_0x0210;
        L_0x02c6:
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r0.initReaderAndWriter();	 Catch:{ Exception -> 0x0422 }
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r0.openStream();	 Catch:{ Exception -> 0x0422 }
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.compressSyncPoint;	 Catch:{ Exception -> 0x0422 }
            goto L_0x0263;
        L_0x02d7:
            r0 = new org.jivesoftware.smack.sasl.packet.SaslStreamElements$Success;	 Catch:{ Exception -> 0x0422 }
            r1 = r7.parser;	 Catch:{ Exception -> 0x0422 }
            r1 = r1.nextText();	 Catch:{ Exception -> 0x0422 }
            r0.<init>(r1);	 Catch:{ Exception -> 0x0422 }
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1.openStream();	 Catch:{ Exception -> 0x0422 }
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1 = r1.getSASLAuthentication();	 Catch:{ Exception -> 0x0422 }
            r1.authenticated(r0);	 Catch:{ Exception -> 0x0422 }
            goto L_0x0419;
        L_0x02f2:
            r0 = r7.parser;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.nextText();	 Catch:{ Exception -> 0x0422 }
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1 = r1.getSASLAuthentication();	 Catch:{ Exception -> 0x0422 }
            r1.challengeReceived(r0);	 Catch:{ Exception -> 0x0422 }
            goto L_0x0419;
        L_0x0303:
            r0 = r7.parser;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.getNamespace(r6);	 Catch:{ Exception -> 0x0422 }
            r1 = r0.hashCode();	 Catch:{ Exception -> 0x0422 }
            r6 = -1570142914; // 0xffffffffa269853e float:-3.1647926E-18 double:NaN;
            if (r1 == r6) goto L_0x0331;
        L_0x0312:
            r2 = 919182852; // 0x36c99e04 float:6.0086622E-6 double:4.541366694E-315;
            if (r1 == r2) goto L_0x0327;
        L_0x0317:
            r2 = 2117926358; // 0x7e3cfdd6 float:6.2803214E37 double:1.046394654E-314;
            if (r1 == r2) goto L_0x031d;
        L_0x031c:
            goto L_0x033a;
        L_0x031d:
            r1 = "http://jabber.org/protocol/compress";
            r0 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r0 == 0) goto L_0x033a;
        L_0x0325:
            r2 = r5;
            goto L_0x033b;
        L_0x0327:
            r1 = "urn:ietf:params:xml:ns:xmpp-tls";
            r0 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r0 == 0) goto L_0x033a;
        L_0x032f:
            r2 = r3;
            goto L_0x033b;
        L_0x0331:
            r1 = "urn:ietf:params:xml:ns:xmpp-sasl";
            r0 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r0 == 0) goto L_0x033a;
        L_0x0339:
            goto L_0x033b;
        L_0x033a:
            r2 = r4;
        L_0x033b:
            switch(r2) {
                case 0: goto L_0x0360;
                case 1: goto L_0x0351;
                case 2: goto L_0x0340;
                default: goto L_0x033e;
            };	 Catch:{ Exception -> 0x0422 }
        L_0x033e:
            goto L_0x0419;
        L_0x0340:
            r0 = r7.parser;	 Catch:{ Exception -> 0x0422 }
            r0 = org.jivesoftware.smack.util.PacketParserUtils.parseSASLFailure(r0);	 Catch:{ Exception -> 0x0422 }
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1 = r1.getSASLAuthentication();	 Catch:{ Exception -> 0x0422 }
            r1.authenticationFailed(r0);	 Catch:{ Exception -> 0x0422 }
            goto L_0x0419;
        L_0x0351:
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.compressSyncPoint;	 Catch:{ Exception -> 0x0422 }
            r1 = new org.jivesoftware.smack.SmackException;	 Catch:{ Exception -> 0x0422 }
            r2 = "Could not establish compression";
            r1.<init>(r2);	 Catch:{ Exception -> 0x0422 }
            goto L_0x0236;
        L_0x0360:
            r0 = new org.jivesoftware.smack.SmackException;	 Catch:{ Exception -> 0x0422 }
            r1 = "TLS negotiation has failed";
            r0.<init>(r1);	 Catch:{ Exception -> 0x0422 }
            throw r0;	 Catch:{ Exception -> 0x0422 }
        L_0x0368:
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0374 }
            r0.proceedTLSReceived();	 Catch:{ Exception -> 0x0374 }
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0374 }
            r0.openStream();	 Catch:{ Exception -> 0x0374 }
            goto L_0x0419;
        L_0x0374:
            r0 = move-exception;
            r1 = new org.jivesoftware.smack.SmackException;	 Catch:{ Exception -> 0x0422 }
            r1.<init>(r0);	 Catch:{ Exception -> 0x0422 }
            r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r2 = r2.tlsHandled;	 Catch:{ Exception -> 0x0422 }
            r2.reportFailure(r1);	 Catch:{ Exception -> 0x0422 }
            throw r0;	 Catch:{ Exception -> 0x0422 }
        L_0x0384:
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1 = r7.parser;	 Catch:{ Exception -> 0x0422 }
            r0.parseFeatures(r1);	 Catch:{ Exception -> 0x0422 }
            goto L_0x0419;
        L_0x038d:
            r0 = r7.parser;	 Catch:{ Exception -> 0x0422 }
            r0 = org.jivesoftware.smack.util.PacketParserUtils.parseStreamError(r0);	 Catch:{ Exception -> 0x0422 }
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1 = r1.saslFeatureReceived;	 Catch:{ Exception -> 0x0422 }
            r2 = new org.jivesoftware.smack.XMPPException$StreamErrorException;	 Catch:{ Exception -> 0x0422 }
            r2.<init>(r0);	 Catch:{ Exception -> 0x0422 }
            r1.reportFailure(r2);	 Catch:{ Exception -> 0x0422 }
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1 = r1.tlsHandled;	 Catch:{ Exception -> 0x0422 }
            r1.reportSuccess();	 Catch:{ Exception -> 0x0422 }
            r1 = new org.jivesoftware.smack.XMPPException$StreamErrorException;	 Catch:{ Exception -> 0x0422 }
            r1.<init>(r0);	 Catch:{ Exception -> 0x0422 }
            throw r1;	 Catch:{ Exception -> 0x0422 }
        L_0x03b0:
            r0 = "jabber:client";
            r1 = r7.parser;	 Catch:{ Exception -> 0x0422 }
            r1 = r1.getNamespace(r6);	 Catch:{ Exception -> 0x0422 }
            r0 = r0.equals(r1);	 Catch:{ Exception -> 0x0422 }
            if (r0 == 0) goto L_0x0419;
        L_0x03be:
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1 = r7.parser;	 Catch:{ Exception -> 0x0422 }
            r2 = "";
            r3 = "id";
            r1 = r1.getAttributeValue(r2, r3);	 Catch:{ Exception -> 0x0422 }
            r0.streamId = r1;	 Catch:{ Exception -> 0x0422 }
            r0 = r7.parser;	 Catch:{ Exception -> 0x0422 }
            r1 = "";
            r2 = "from";
            r0.getAttributeValue(r1, r2);	 Catch:{ Exception -> 0x0422 }
            goto L_0x0419;
        L_0x03d7:
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ all -> 0x03ee }
            r1 = r7.parser;	 Catch:{ all -> 0x03ee }
            r0.parseAndProcessStanza(r1);	 Catch:{ all -> 0x03ee }
            r0 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r1 = r1.clientHandledStanzasCount;	 Catch:{ Exception -> 0x0422 }
            r1 = org.jivesoftware.smack.sm.SMUtils.incrementHeight(r1);	 Catch:{ Exception -> 0x0422 }
            r0.clientHandledStanzasCount = r1;	 Catch:{ Exception -> 0x0422 }
            goto L_0x0419;
        L_0x03ee:
            r0 = move-exception;
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;	 Catch:{ Exception -> 0x0422 }
            r2 = r2.clientHandledStanzasCount;	 Catch:{ Exception -> 0x0422 }
            r2 = org.jivesoftware.smack.sm.SMUtils.incrementHeight(r2);	 Catch:{ Exception -> 0x0422 }
            r1.clientHandledStanzasCount = r2;	 Catch:{ Exception -> 0x0422 }
            throw r0;	 Catch:{ Exception -> 0x0422 }
        L_0x03ff:
            r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0422 }
            r3 = "Unknown top level stream element: ";
            r2.<init>(r3);	 Catch:{ Exception -> 0x0422 }
            r2.append(r0);	 Catch:{ Exception -> 0x0422 }
            r0 = r2.toString();	 Catch:{ Exception -> 0x0422 }
            r1.warning(r0);	 Catch:{ Exception -> 0x0422 }
            goto L_0x0419;
        L_0x0411:
            r0 = new org.jivesoftware.smack.SmackException;	 Catch:{ Exception -> 0x0422 }
            r1 = "Parser got END_DOCUMENT event. This could happen e.g. if the server closed the connection without sending a closing stream element";
            r0.<init>(r1);	 Catch:{ Exception -> 0x0422 }
            throw r0;	 Catch:{ Exception -> 0x0422 }
        L_0x0419:
            r0 = r7.parser;	 Catch:{ Exception -> 0x0422 }
            r0 = r0.next();	 Catch:{ Exception -> 0x0422 }
            goto L_0x000f;
        L_0x0421:
            return;
        L_0x0422:
            r0 = move-exception;
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;
            r1 = r1.closingStreamReceived;
            r1.reportFailure(r0);
            r1 = r7.done;
            if (r1 != 0) goto L_0x0443;
        L_0x0430:
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;
            r1 = r1.packetWriter;
            r1 = r1.queue;
            r1 = r1.isShutdown();
            if (r1 != 0) goto L_0x0443;
        L_0x043e:
            r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this;
            r1.notifyConnectionError(r0);
        L_0x0443:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.tcp.XMPPTCPConnection.PacketReader.parsePackets():void");
        }

        void init() {
            this.done = false;
            Runnable c77601 = new C77601();
            StringBuilder stringBuilder = new StringBuilder("Smack Packet Reader (");
            stringBuilder.append(XMPPTCPConnection.this.getConnectionCounter());
            stringBuilder.append(")");
            Async.go(c77601, stringBuilder.toString());
        }

        void shutdown() {
            this.done = true;
        }
    }

    protected class PacketWriter {
        public static final int QUEUE_SIZE = 500;
        private volatile boolean instantShutdown;
        private final ArrayBlockingQueueWithShutdown<Element> queue = new ArrayBlockingQueueWithShutdown(500, true);
        private boolean shouldBundleAndDefer;
        protected SynchronizationPoint<NoResponseException> shutdownDone = new SynchronizationPoint(XMPPTCPConnection.this, "shutdown completed");
        protected volatile Long shutdownTimestamp = null;

        class C77611 implements Runnable {
            C77611() {
            }

            public void run() {
                PacketWriter.this.writePackets();
            }
        }

        protected PacketWriter() {
        }

        private boolean done() {
            return this.shutdownTimestamp != null;
        }

        private void drainWriterQueueToUnacknowledgedStanzas() {
            Object<Element> arrayList = new ArrayList(this.queue.size());
            this.queue.drainTo(arrayList);
            for (Element element : arrayList) {
                if (element instanceof Stanza) {
                    XMPPTCPConnection.this.unacknowledgedStanzas.add((Stanza) element);
                }
            }
        }

        private Element nextStreamElement() {
            if (this.queue.isEmpty()) {
                this.shouldBundleAndDefer = true;
            }
            try {
                return (Element) this.queue.take();
            } catch (Throwable e) {
                if (!this.queue.isShutdown()) {
                    XMPPTCPConnection.LOGGER.log(Level.WARNING, "Packet writer thread was interrupted. Don't do that. Use disconnect() instead.", e);
                }
                return null;
            }
        }

        private void writePackets() {
            Exception exception = null;
            try {
                XMPPTCPConnection.this.openStream();
                XMPPTCPConnection.this.initalOpenStreamSend.reportSuccess();
                while (!done()) {
                    Element nextStreamElement = nextStreamElement();
                    if (nextStreamElement != null) {
                        Stanza stanza;
                        BundleAndDeferCallback access$3400 = XMPPTCPConnection.this.bundleAndDeferCallback;
                        if (access$3400 != null && XMPPTCPConnection.this.isAuthenticated() && this.shouldBundleAndDefer) {
                            this.shouldBundleAndDefer = false;
                            AtomicBoolean atomicBoolean = new AtomicBoolean();
                            int bundleAndDeferMillis = access$3400.getBundleAndDeferMillis(new BundleAndDefer(atomicBoolean));
                            if (bundleAndDeferMillis > 0) {
                                long j = (long) bundleAndDeferMillis;
                                long currentTimeMillis = System.currentTimeMillis();
                                synchronized (atomicBoolean) {
                                    long j2 = j;
                                    while (!atomicBoolean.get() && j2 > 0) {
                                        atomicBoolean.wait(j2);
                                        j2 = j - (System.currentTimeMillis() - currentTimeMillis);
                                    }
                                }
                            }
                        }
                        if (nextStreamElement instanceof Stanza) {
                            stanza = (Stanza) nextStreamElement;
                        } else {
                            if (nextStreamElement instanceof Enable) {
                                XMPPTCPConnection.this.unacknowledgedStanzas = new ArrayBlockingQueue(500);
                            }
                            stanza = null;
                        }
                        if (!(XMPPTCPConnection.this.unacknowledgedStanzas == null || stanza == null)) {
                            if (((double) XMPPTCPConnection.this.unacknowledgedStanzas.size()) == 400.0d) {
                                XMPPTCPConnection.this.writer.write(AckRequest.INSTANCE.toXML().toString());
                                XMPPTCPConnection.this.writer.flush();
                            }
                            XMPPTCPConnection.this.unacknowledgedStanzas.put(stanza);
                        }
                        CharSequence toXML = nextStreamElement.toXML();
                        if (toXML instanceof XmlStringBuilder) {
                            ((XmlStringBuilder) toXML).write(XMPPTCPConnection.this.writer);
                        } else {
                            XMPPTCPConnection.this.writer.write(toXML.toString());
                        }
                        if (this.queue.isEmpty()) {
                            XMPPTCPConnection.this.writer.flush();
                        }
                        if (stanza != null) {
                            XMPPTCPConnection.this.firePacketSendingListeners(stanza);
                        }
                    }
                }
                if (!this.instantShutdown) {
                    while (!this.queue.isEmpty()) {
                        try {
                            XMPPTCPConnection.this.writer.write(((Element) this.queue.remove()).toXML().toString());
                        } catch (Throwable e) {
                            XMPPTCPConnection.LOGGER.log(Level.WARNING, "Exception flushing queue during shutdown, ignore and continue", e);
                        }
                    }
                    XMPPTCPConnection.this.writer.flush();
                    try {
                        XMPPTCPConnection.this.writer.write("</stream:stream>");
                        XMPPTCPConnection.this.writer.flush();
                    } catch (Throwable e2) {
                        XMPPTCPConnection.LOGGER.log(Level.WARNING, "Exception writing closing stream element", e2);
                    }
                    this.queue.clear();
                } else if (this.instantShutdown && XMPPTCPConnection.this.isSmEnabled()) {
                    drainWriterQueueToUnacknowledgedStanzas();
                }
            } catch (Throwable e22) {
                throw new IllegalStateException(e22);
            } catch (Throwable e222) {
                try {
                    if (done() || this.queue.isShutdown()) {
                        XMPPTCPConnection.LOGGER.log(Level.FINE, "Ignoring Exception in writePackets()", e222);
                    } else {
                        exception = e222;
                    }
                } catch (Throwable th) {
                    XMPPTCPConnection.LOGGER.fine("Reporting shutdownDone success in writer thread");
                    this.shutdownDone.reportSuccess();
                }
            }
            XMPPTCPConnection.LOGGER.fine("Reporting shutdownDone success in writer thread");
            this.shutdownDone.reportSuccess();
            if (exception != null) {
                XMPPTCPConnection.this.notifyConnectionError(exception);
            }
        }

        void init() {
            this.shutdownDone.init();
            this.shutdownTimestamp = null;
            if (XMPPTCPConnection.this.unacknowledgedStanzas != null) {
                drainWriterQueueToUnacknowledgedStanzas();
            }
            this.queue.start();
            Runnable c77611 = new C77611();
            StringBuilder stringBuilder = new StringBuilder("Smack Packet Writer (");
            stringBuilder.append(XMPPTCPConnection.this.getConnectionCounter());
            stringBuilder.append(")");
            Async.go(c77611, stringBuilder.toString());
        }

        protected void sendStreamElement(Element element) {
            throwNotConnectedExceptionIfDoneAndResumptionNotPossible();
            try {
                this.queue.put(element);
            } catch (InterruptedException e) {
                throwNotConnectedExceptionIfDoneAndResumptionNotPossible();
                throw e;
            }
        }

        void shutdown(boolean z) {
            this.instantShutdown = z;
            this.queue.shutdown();
            this.shutdownTimestamp = Long.valueOf(System.currentTimeMillis());
            try {
                this.shutdownDone.checkIfSuccessOrWait();
            } catch (Throwable e) {
                XMPPTCPConnection.LOGGER.log(Level.WARNING, "shutdownDone was not marked as successful by the writer thread", e);
            }
        }

        protected void throwNotConnectedExceptionIfDoneAndResumptionNotPossible() {
            boolean done = done();
            if (done) {
                boolean isSmResumptionPossible = XMPPTCPConnection.this.isSmResumptionPossible();
                if (!isSmResumptionPossible) {
                    XMPPConnection xMPPConnection = XMPPTCPConnection.this;
                    StringBuilder stringBuilder = new StringBuilder("done=");
                    stringBuilder.append(done);
                    stringBuilder.append(" smResumptionPossible=");
                    stringBuilder.append(isSmResumptionPossible);
                    throw new NotConnectedException(xMPPConnection, stringBuilder.toString());
                }
            }
        }
    }

    class C80051 extends AbstractConnectionListener {
        C80051() {
        }

        public void connectionClosedOnError(Exception exception) {
            if (exception instanceof StreamErrorException) {
                XMPPTCPConnection.this.dropSmState();
            }
        }
    }

    public XMPPTCPConnection(CharSequence charSequence, String str) {
        this(b.a(charSequence.toString()), str, b.b(charSequence.toString()));
    }

    public XMPPTCPConnection(CharSequence charSequence, String str, String str2) {
        this(((Builder) ((Builder) XMPPTCPConnectionConfiguration.builder().setUsernameAndPassword(charSequence, str)).setXmppDomain(d.e(str2))).build());
    }

    public XMPPTCPConnection(XMPPTCPConnectionConfiguration xMPPTCPConnectionConfiguration) {
        super(xMPPTCPConnectionConfiguration);
        this.disconnectedButResumeable = false;
        this.initalOpenStreamSend = new SynchronizationPoint(this, "initial open stream element send to server");
        this.maybeCompressFeaturesReceived = new SynchronizationPoint(this, "stream compression feature");
        this.compressSyncPoint = new SynchronizationPoint(this, "stream compression");
        this.closingStreamReceived = new SynchronizationPoint(this, "stream closing element received");
        this.bundleAndDeferCallback = defaultBundleAndDeferCallback;
        this.smResumedSyncPoint = new SynchronizationPoint(this, "stream resumed element");
        this.smEnabledSyncPoint = new SynchronizationPoint(this, "stream enabled element");
        this.smClientMaxResumptionTime = -1;
        this.smServerMaxResumptimTime = -1;
        this.useSm = useSmDefault;
        this.useSmResumption = useSmResumptionDefault;
        this.serverHandledStanzasCount = 0;
        this.clientHandledStanzasCount = 0;
        this.smWasEnabledAtLeastOnce = false;
        this.stanzaAcknowledgedListeners = new ConcurrentLinkedQueue();
        this.stanzaIdAcknowledgedListeners = new ConcurrentHashMap();
        this.requestAckPredicates = new LinkedHashSet();
        this.config = xMPPTCPConnectionConfiguration;
        addConnectionListener(new C80051());
    }

    private void connectUsingConfiguration() {
        List populateHostAddresses = populateHostAddresses();
        SocketFactory socketFactory = this.config.getSocketFactory();
        ProxyInfo proxyInfo = this.config.getProxyInfo();
        int connectTimeout = this.config.getConnectTimeout();
        if (socketFactory == null) {
            socketFactory = SocketFactory.getDefault();
        }
        for (HostAddress hostAddress : this.hostAddresses) {
            Logger logger;
            StringBuilder stringBuilder;
            String fqdn = hostAddress.getFQDN();
            int port = hostAddress.getPort();
            StringBuilder stringBuilder2;
            if (proxyInfo == null) {
                Iterator it = hostAddress.getInetAddresses().iterator();
                while (it.hasNext()) {
                    this.socket = socketFactory.createSocket();
                    InetAddress inetAddress = (InetAddress) it.next();
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(inetAddress);
                    stringBuilder2.append(" at port ");
                    stringBuilder2.append(port);
                    String stringBuilder3 = stringBuilder2.toString();
                    Logger logger2 = LOGGER;
                    StringBuilder stringBuilder4 = new StringBuilder("Trying to establish TCP connection to ");
                    stringBuilder4.append(stringBuilder3);
                    logger2.finer(stringBuilder4.toString());
                    try {
                        this.socket.connect(new InetSocketAddress(inetAddress, port), connectTimeout);
                        logger = LOGGER;
                        stringBuilder = new StringBuilder("Established TCP connection to ");
                        stringBuilder.append(stringBuilder3);
                    } catch (Exception e) {
                        hostAddress.setException(inetAddress, e);
                        if (!it.hasNext()) {
                            break;
                        }
                    }
                }
                populateHostAddresses.add(hostAddress);
            } else {
                this.socket = socketFactory.createSocket();
                StringBuilder stringBuilder5 = new StringBuilder("Host of HostAddress ");
                stringBuilder5.append(hostAddress);
                stringBuilder5.append(" must not be null when using a Proxy");
                StringUtils.requireNotNullOrEmpty(fqdn, stringBuilder5.toString());
                stringBuilder5 = new StringBuilder();
                stringBuilder5.append(fqdn);
                stringBuilder5.append(" at port ");
                stringBuilder5.append(port);
                String stringBuilder6 = stringBuilder5.toString();
                Logger logger3 = LOGGER;
                stringBuilder2 = new StringBuilder("Trying to establish TCP connection via Proxy to ");
                stringBuilder2.append(stringBuilder6);
                logger3.finer(stringBuilder2.toString());
                try {
                    proxyInfo.getProxySocketConnection().connect(this.socket, fqdn, port, connectTimeout);
                    logger = LOGGER;
                    stringBuilder = new StringBuilder("Established TCP connection to ");
                    stringBuilder.append(stringBuilder6);
                } catch (Exception e2) {
                    hostAddress.setException(e2);
                }
            }
            logger.finer(stringBuilder.toString());
            this.host = fqdn;
            this.port = port;
            return;
        }
        throw ConnectionException.from(populateHostAddresses);
    }

    private void dropSmState() {
        this.smSessionId = null;
        this.unacknowledgedStanzas = null;
    }

    private void initConnection() {
        Object obj;
        if (this.packetReader != null) {
            if (this.packetWriter != null) {
                obj = null;
                this.compressionHandler = null;
                initReaderAndWriter();
                if (obj != null) {
                    this.packetWriter = new PacketWriter();
                    this.packetReader = new PacketReader();
                    if (this.config.isDebuggerEnabled()) {
                        addAsyncStanzaListener(this.debugger.getReaderListener(), null);
                        if (this.debugger.getWriterListener() != null) {
                            addPacketSendingListener(this.debugger.getWriterListener(), null);
                        }
                    }
                }
                this.packetWriter.init();
                this.packetReader.init();
            }
        }
        obj = 1;
        this.compressionHandler = null;
        initReaderAndWriter();
        if (obj != null) {
            this.packetWriter = new PacketWriter();
            this.packetReader = new PacketReader();
            if (this.config.isDebuggerEnabled()) {
                addAsyncStanzaListener(this.debugger.getReaderListener(), null);
                if (this.debugger.getWriterListener() != null) {
                    addPacketSendingListener(this.debugger.getWriterListener(), null);
                }
            }
        }
        this.packetWriter.init();
        this.packetReader.init();
    }

    private void initReaderAndWriter() {
        InputStream inputStream = this.socket.getInputStream();
        OutputStream outputStream = this.socket.getOutputStream();
        if (this.compressionHandler != null) {
            inputStream = this.compressionHandler.getInputStream(inputStream);
            outputStream = this.compressionHandler.getOutputStream(outputStream);
        }
        this.writer = new OutputStreamWriter(outputStream, StringUtils.UTF8);
        this.reader = new BufferedReader(new InputStreamReader(inputStream, StringUtils.UTF8));
        initDebugger();
    }

    private void maybeEnableCompression() {
        if (this.config.isCompressionEnabled()) {
            this.maybeCompressFeaturesReceived.checkIfSuccessOrWait();
            Feature feature = (Feature) getFeature(Feature.ELEMENT, "http://jabber.org/protocol/compress");
            if (feature != null) {
                XMPPInputOutputStream maybeGetCompressionHandler = maybeGetCompressionHandler(feature);
                this.compressionHandler = maybeGetCompressionHandler;
                if (maybeGetCompressionHandler != null) {
                    this.compressSyncPoint.sendAndWaitForResponseOrThrow(new Compress(this.compressionHandler.getCompressionMethod()));
                } else {
                    LOGGER.warning("Could not enable compression because no matching handler/method pair was found");
                }
            }
        }
    }

    private static XMPPInputOutputStream maybeGetCompressionHandler(Feature feature) {
        for (XMPPInputOutputStream xMPPInputOutputStream : SmackConfiguration.getCompresionHandlers()) {
            if (feature.getMethods().contains(xMPPInputOutputStream.getCompressionMethod())) {
                return xMPPInputOutputStream;
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void notifyConnectionError(java.lang.Exception r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.packetReader;	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x000d;
    L_0x0005:
        r0 = r1.packetReader;	 Catch:{ all -> 0x0024 }
        r0 = r0.done;	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x001a;
    L_0x000d:
        r0 = r1.packetWriter;	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x0022;
    L_0x0011:
        r0 = r1.packetWriter;	 Catch:{ all -> 0x0024 }
        r0 = r0.done();	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x001a;
    L_0x0019:
        goto L_0x0022;
    L_0x001a:
        r1.instantShutdown();	 Catch:{ all -> 0x0024 }
        r1.callConnectionClosedOnErrorListener(r2);	 Catch:{ all -> 0x0024 }
        monitor-exit(r1);
        return;
    L_0x0022:
        monitor-exit(r1);
        return;
    L_0x0024:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.tcp.XMPPTCPConnection.notifyConnectionError(java.lang.Exception):void");
    }

    private void proceedTLSReceived() {
        SmackDaneVerifier newInstance;
        KeyStore instance;
        PasswordCallback passwordCallback;
        Throwable e;
        KeyManagerFactory instance2;
        KeyManager[] keyManagers;
        SSLContext instance3;
        SecureRandom secureRandom;
        X509TrustManager customX509TrustManager;
        Socket socket;
        SSLSocket sSLSocket;
        HostnameVerifier hostnameVerifier;
        StringBuilder stringBuilder;
        PasswordCallback passwordCallback2;
        SSLContext customSSLContext = this.config.getCustomSSLContext();
        TrustManager[] trustManagerArr = null;
        if (this.config.getDnssecMode() == DnssecMode.needsDnssecAndDane) {
            SmackDaneProvider daneProvider = DNSUtil.getDaneProvider();
            if (daneProvider == null) {
                throw new UnsupportedOperationException("DANE enabled but no SmackDaneProvider configured");
            }
            newInstance = daneProvider.newInstance();
            if (newInstance == null) {
                throw new IllegalStateException("DANE requested but DANE provider did not return a DANE verifier");
            }
        }
        newInstance = null;
        if (customSSLContext == null) {
            String keystoreType = this.config.getKeystoreType();
            CallbackHandler callbackHandler = this.config.getCallbackHandler();
            CharSequence keystorePath = this.config.getKeystorePath();
            if ("PKCS11".equals(keystoreType)) {
                try {
                    Constructor constructor = Class.forName("sun.security.pkcs11.SunPKCS11").getConstructor(new Class[]{InputStream.class});
                    StringBuilder stringBuilder2 = new StringBuilder("name = SmartCard\nlibrary = ");
                    stringBuilder2.append(this.config.getPKCS11Library());
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(stringBuilder2.toString().getBytes(StringUtils.UTF8));
                    Provider provider = (Provider) constructor.newInstance(new Object[]{byteArrayInputStream});
                    Security.addProvider(provider);
                    instance = KeyStore.getInstance("PKCS11", provider);
                    passwordCallback = new PasswordCallback("PKCS11 Password: ", false);
                    try {
                        callbackHandler.handle(new Callback[]{passwordCallback});
                        instance.load(null, passwordCallback.getPassword());
                    } catch (Exception e2) {
                        e = e2;
                        LOGGER.log(Level.WARNING, "Exception", e);
                        instance = null;
                        if (instance != null) {
                            instance2 = KeyManagerFactory.getInstance("SunX509");
                            if (passwordCallback == null) {
                                instance2.init(instance, passwordCallback.getPassword());
                                passwordCallback.clearPassword();
                            } else {
                                try {
                                    instance2.init(instance, null);
                                } catch (Throwable e3) {
                                    LOGGER.log(Level.WARNING, "NullPointerException", e3);
                                }
                            }
                            keyManagers = instance2.getKeyManagers();
                            instance3 = SSLContext.getInstance(TLSUtils.TLS);
                            secureRandom = new SecureRandom();
                            customX509TrustManager = this.config.getCustomX509TrustManager();
                            if (newInstance == null) {
                                newInstance.init(instance3, keyManagers, customX509TrustManager, secureRandom);
                            } else {
                                if (customX509TrustManager != null) {
                                    trustManagerArr = new TrustManager[]{customX509TrustManager};
                                }
                                instance3.init(keyManagers, trustManagerArr, secureRandom);
                            }
                            customSSLContext = instance3;
                            socket = this.socket;
                            this.socket = customSSLContext.getSocketFactory().createSocket(socket, this.host, socket.getPort(), true);
                            sSLSocket = (SSLSocket) this.socket;
                            TLSUtils.setEnabledProtocolsAndCiphers(sSLSocket, this.config.getEnabledSSLProtocols(), this.config.getEnabledSSLCiphers());
                            initReaderAndWriter();
                            sSLSocket.startHandshake();
                            if (newInstance != null) {
                                newInstance.finish(sSLSocket);
                            }
                            hostnameVerifier = getConfiguration().getHostnameVerifier();
                            if (hostnameVerifier == null) {
                                throw new IllegalStateException("No HostnameVerifier set. Use connectionConfiguration.setHostnameVerifier() to configure.");
                            } else if (hostnameVerifier.verify(getXMPPServiceDomain().toString(), sSLSocket.getSession())) {
                                stringBuilder = new StringBuilder("Hostname verification of certificate failed. Certificate does not authenticate ");
                                stringBuilder.append(getXMPPServiceDomain());
                                throw new CertificateException(stringBuilder.toString());
                            } else {
                                this.secureSocket = sSLSocket;
                            }
                        }
                        keyManagers = null;
                        instance3 = SSLContext.getInstance(TLSUtils.TLS);
                        secureRandom = new SecureRandom();
                        customX509TrustManager = this.config.getCustomX509TrustManager();
                        if (newInstance == null) {
                            if (customX509TrustManager != null) {
                                trustManagerArr = new TrustManager[]{customX509TrustManager};
                            }
                            instance3.init(keyManagers, trustManagerArr, secureRandom);
                        } else {
                            newInstance.init(instance3, keyManagers, customX509TrustManager, secureRandom);
                        }
                        customSSLContext = instance3;
                        socket = this.socket;
                        this.socket = customSSLContext.getSocketFactory().createSocket(socket, this.host, socket.getPort(), true);
                        sSLSocket = (SSLSocket) this.socket;
                        TLSUtils.setEnabledProtocolsAndCiphers(sSLSocket, this.config.getEnabledSSLProtocols(), this.config.getEnabledSSLCiphers());
                        initReaderAndWriter();
                        sSLSocket.startHandshake();
                        if (newInstance != null) {
                            newInstance.finish(sSLSocket);
                        }
                        hostnameVerifier = getConfiguration().getHostnameVerifier();
                        if (hostnameVerifier == null) {
                            throw new IllegalStateException("No HostnameVerifier set. Use connectionConfiguration.setHostnameVerifier() to configure.");
                        } else if (hostnameVerifier.verify(getXMPPServiceDomain().toString(), sSLSocket.getSession())) {
                            stringBuilder = new StringBuilder("Hostname verification of certificate failed. Certificate does not authenticate ");
                            stringBuilder.append(getXMPPServiceDomain());
                            throw new CertificateException(stringBuilder.toString());
                        } else {
                            this.secureSocket = sSLSocket;
                        }
                    }
                } catch (Exception e4) {
                    e3 = e4;
                    passwordCallback = null;
                    LOGGER.log(Level.WARNING, "Exception", e3);
                    instance = null;
                    if (instance != null) {
                        instance2 = KeyManagerFactory.getInstance("SunX509");
                        if (passwordCallback == null) {
                            instance2.init(instance, null);
                        } else {
                            instance2.init(instance, passwordCallback.getPassword());
                            passwordCallback.clearPassword();
                        }
                        keyManagers = instance2.getKeyManagers();
                        instance3 = SSLContext.getInstance(TLSUtils.TLS);
                        secureRandom = new SecureRandom();
                        customX509TrustManager = this.config.getCustomX509TrustManager();
                        if (newInstance == null) {
                            newInstance.init(instance3, keyManagers, customX509TrustManager, secureRandom);
                        } else {
                            if (customX509TrustManager != null) {
                                trustManagerArr = new TrustManager[]{customX509TrustManager};
                            }
                            instance3.init(keyManagers, trustManagerArr, secureRandom);
                        }
                        customSSLContext = instance3;
                        socket = this.socket;
                        this.socket = customSSLContext.getSocketFactory().createSocket(socket, this.host, socket.getPort(), true);
                        sSLSocket = (SSLSocket) this.socket;
                        TLSUtils.setEnabledProtocolsAndCiphers(sSLSocket, this.config.getEnabledSSLProtocols(), this.config.getEnabledSSLCiphers());
                        initReaderAndWriter();
                        sSLSocket.startHandshake();
                        if (newInstance != null) {
                            newInstance.finish(sSLSocket);
                        }
                        hostnameVerifier = getConfiguration().getHostnameVerifier();
                        if (hostnameVerifier == null) {
                            throw new IllegalStateException("No HostnameVerifier set. Use connectionConfiguration.setHostnameVerifier() to configure.");
                        } else if (hostnameVerifier.verify(getXMPPServiceDomain().toString(), sSLSocket.getSession())) {
                            this.secureSocket = sSLSocket;
                        } else {
                            stringBuilder = new StringBuilder("Hostname verification of certificate failed. Certificate does not authenticate ");
                            stringBuilder.append(getXMPPServiceDomain());
                            throw new CertificateException(stringBuilder.toString());
                        }
                    }
                    keyManagers = null;
                    instance3 = SSLContext.getInstance(TLSUtils.TLS);
                    secureRandom = new SecureRandom();
                    customX509TrustManager = this.config.getCustomX509TrustManager();
                    if (newInstance == null) {
                        if (customX509TrustManager != null) {
                            trustManagerArr = new TrustManager[]{customX509TrustManager};
                        }
                        instance3.init(keyManagers, trustManagerArr, secureRandom);
                    } else {
                        newInstance.init(instance3, keyManagers, customX509TrustManager, secureRandom);
                    }
                    customSSLContext = instance3;
                    socket = this.socket;
                    this.socket = customSSLContext.getSocketFactory().createSocket(socket, this.host, socket.getPort(), true);
                    sSLSocket = (SSLSocket) this.socket;
                    TLSUtils.setEnabledProtocolsAndCiphers(sSLSocket, this.config.getEnabledSSLProtocols(), this.config.getEnabledSSLCiphers());
                    initReaderAndWriter();
                    sSLSocket.startHandshake();
                    if (newInstance != null) {
                        newInstance.finish(sSLSocket);
                    }
                    hostnameVerifier = getConfiguration().getHostnameVerifier();
                    if (hostnameVerifier == null) {
                        throw new IllegalStateException("No HostnameVerifier set. Use connectionConfiguration.setHostnameVerifier() to configure.");
                    } else if (hostnameVerifier.verify(getXMPPServiceDomain().toString(), sSLSocket.getSession())) {
                        stringBuilder = new StringBuilder("Hostname verification of certificate failed. Certificate does not authenticate ");
                        stringBuilder.append(getXMPPServiceDomain());
                        throw new CertificateException(stringBuilder.toString());
                    } else {
                        this.secureSocket = sSLSocket;
                    }
                }
            }
            if ("Apple".equals(keystoreType)) {
                instance = KeyStore.getInstance("KeychainStore", "Apple");
            } else if (keystoreType != null) {
                instance = KeyStore.getInstance(keystoreType);
                if (callbackHandler != null && StringUtils.isNotEmpty(keystorePath)) {
                    try {
                        passwordCallback2 = new PasswordCallback("Keystore Password: ", false);
                        try {
                            callbackHandler.handle(new Callback[]{passwordCallback2});
                            instance.load(new FileInputStream(keystorePath), passwordCallback2.getPassword());
                        } catch (Exception e5) {
                            e3 = e5;
                            LOGGER.log(Level.WARNING, "Exception", e3);
                            instance = null;
                            passwordCallback = passwordCallback2;
                            if (instance != null) {
                                instance2 = KeyManagerFactory.getInstance("SunX509");
                                if (passwordCallback == null) {
                                    instance2.init(instance, passwordCallback.getPassword());
                                    passwordCallback.clearPassword();
                                } else {
                                    instance2.init(instance, null);
                                }
                                keyManagers = instance2.getKeyManagers();
                                instance3 = SSLContext.getInstance(TLSUtils.TLS);
                                secureRandom = new SecureRandom();
                                customX509TrustManager = this.config.getCustomX509TrustManager();
                                if (newInstance == null) {
                                    newInstance.init(instance3, keyManagers, customX509TrustManager, secureRandom);
                                } else {
                                    if (customX509TrustManager != null) {
                                        trustManagerArr = new TrustManager[]{customX509TrustManager};
                                    }
                                    instance3.init(keyManagers, trustManagerArr, secureRandom);
                                }
                                customSSLContext = instance3;
                                socket = this.socket;
                                this.socket = customSSLContext.getSocketFactory().createSocket(socket, this.host, socket.getPort(), true);
                                sSLSocket = (SSLSocket) this.socket;
                                TLSUtils.setEnabledProtocolsAndCiphers(sSLSocket, this.config.getEnabledSSLProtocols(), this.config.getEnabledSSLCiphers());
                                initReaderAndWriter();
                                sSLSocket.startHandshake();
                                if (newInstance != null) {
                                    newInstance.finish(sSLSocket);
                                }
                                hostnameVerifier = getConfiguration().getHostnameVerifier();
                                if (hostnameVerifier == null) {
                                    throw new IllegalStateException("No HostnameVerifier set. Use connectionConfiguration.setHostnameVerifier() to configure.");
                                } else if (hostnameVerifier.verify(getXMPPServiceDomain().toString(), sSLSocket.getSession())) {
                                    this.secureSocket = sSLSocket;
                                } else {
                                    stringBuilder = new StringBuilder("Hostname verification of certificate failed. Certificate does not authenticate ");
                                    stringBuilder.append(getXMPPServiceDomain());
                                    throw new CertificateException(stringBuilder.toString());
                                }
                            }
                            keyManagers = null;
                            instance3 = SSLContext.getInstance(TLSUtils.TLS);
                            secureRandom = new SecureRandom();
                            customX509TrustManager = this.config.getCustomX509TrustManager();
                            if (newInstance == null) {
                                if (customX509TrustManager != null) {
                                    trustManagerArr = new TrustManager[]{customX509TrustManager};
                                }
                                instance3.init(keyManagers, trustManagerArr, secureRandom);
                            } else {
                                newInstance.init(instance3, keyManagers, customX509TrustManager, secureRandom);
                            }
                            customSSLContext = instance3;
                            socket = this.socket;
                            this.socket = customSSLContext.getSocketFactory().createSocket(socket, this.host, socket.getPort(), true);
                            sSLSocket = (SSLSocket) this.socket;
                            TLSUtils.setEnabledProtocolsAndCiphers(sSLSocket, this.config.getEnabledSSLProtocols(), this.config.getEnabledSSLCiphers());
                            initReaderAndWriter();
                            sSLSocket.startHandshake();
                            if (newInstance != null) {
                                newInstance.finish(sSLSocket);
                            }
                            hostnameVerifier = getConfiguration().getHostnameVerifier();
                            if (hostnameVerifier == null) {
                                throw new IllegalStateException("No HostnameVerifier set. Use connectionConfiguration.setHostnameVerifier() to configure.");
                            } else if (hostnameVerifier.verify(getXMPPServiceDomain().toString(), sSLSocket.getSession())) {
                                stringBuilder = new StringBuilder("Hostname verification of certificate failed. Certificate does not authenticate ");
                                stringBuilder.append(getXMPPServiceDomain());
                                throw new CertificateException(stringBuilder.toString());
                            } else {
                                this.secureSocket = sSLSocket;
                            }
                        }
                    } catch (Exception e6) {
                        e3 = e6;
                        passwordCallback2 = null;
                        LOGGER.log(Level.WARNING, "Exception", e3);
                        instance = null;
                        passwordCallback = passwordCallback2;
                        if (instance != null) {
                            instance2 = KeyManagerFactory.getInstance("SunX509");
                            if (passwordCallback == null) {
                                instance2.init(instance, null);
                            } else {
                                instance2.init(instance, passwordCallback.getPassword());
                                passwordCallback.clearPassword();
                            }
                            keyManagers = instance2.getKeyManagers();
                            instance3 = SSLContext.getInstance(TLSUtils.TLS);
                            secureRandom = new SecureRandom();
                            customX509TrustManager = this.config.getCustomX509TrustManager();
                            if (newInstance == null) {
                                newInstance.init(instance3, keyManagers, customX509TrustManager, secureRandom);
                            } else {
                                if (customX509TrustManager != null) {
                                    trustManagerArr = new TrustManager[]{customX509TrustManager};
                                }
                                instance3.init(keyManagers, trustManagerArr, secureRandom);
                            }
                            customSSLContext = instance3;
                            socket = this.socket;
                            this.socket = customSSLContext.getSocketFactory().createSocket(socket, this.host, socket.getPort(), true);
                            sSLSocket = (SSLSocket) this.socket;
                            TLSUtils.setEnabledProtocolsAndCiphers(sSLSocket, this.config.getEnabledSSLProtocols(), this.config.getEnabledSSLCiphers());
                            initReaderAndWriter();
                            sSLSocket.startHandshake();
                            if (newInstance != null) {
                                newInstance.finish(sSLSocket);
                            }
                            hostnameVerifier = getConfiguration().getHostnameVerifier();
                            if (hostnameVerifier == null) {
                                throw new IllegalStateException("No HostnameVerifier set. Use connectionConfiguration.setHostnameVerifier() to configure.");
                            } else if (hostnameVerifier.verify(getXMPPServiceDomain().toString(), sSLSocket.getSession())) {
                                this.secureSocket = sSLSocket;
                            } else {
                                stringBuilder = new StringBuilder("Hostname verification of certificate failed. Certificate does not authenticate ");
                                stringBuilder.append(getXMPPServiceDomain());
                                throw new CertificateException(stringBuilder.toString());
                            }
                        }
                        keyManagers = null;
                        instance3 = SSLContext.getInstance(TLSUtils.TLS);
                        secureRandom = new SecureRandom();
                        customX509TrustManager = this.config.getCustomX509TrustManager();
                        if (newInstance == null) {
                            if (customX509TrustManager != null) {
                                trustManagerArr = new TrustManager[]{customX509TrustManager};
                            }
                            instance3.init(keyManagers, trustManagerArr, secureRandom);
                        } else {
                            newInstance.init(instance3, keyManagers, customX509TrustManager, secureRandom);
                        }
                        customSSLContext = instance3;
                        socket = this.socket;
                        this.socket = customSSLContext.getSocketFactory().createSocket(socket, this.host, socket.getPort(), true);
                        sSLSocket = (SSLSocket) this.socket;
                        TLSUtils.setEnabledProtocolsAndCiphers(sSLSocket, this.config.getEnabledSSLProtocols(), this.config.getEnabledSSLCiphers());
                        initReaderAndWriter();
                        sSLSocket.startHandshake();
                        if (newInstance != null) {
                            newInstance.finish(sSLSocket);
                        }
                        hostnameVerifier = getConfiguration().getHostnameVerifier();
                        if (hostnameVerifier == null) {
                            throw new IllegalStateException("No HostnameVerifier set. Use connectionConfiguration.setHostnameVerifier() to configure.");
                        } else if (hostnameVerifier.verify(getXMPPServiceDomain().toString(), sSLSocket.getSession())) {
                            stringBuilder = new StringBuilder("Hostname verification of certificate failed. Certificate does not authenticate ");
                            stringBuilder.append(getXMPPServiceDomain());
                            throw new CertificateException(stringBuilder.toString());
                        } else {
                            this.secureSocket = sSLSocket;
                        }
                    }
                    passwordCallback = passwordCallback2;
                }
            } else {
                instance = null;
                passwordCallback = instance;
            }
            instance.load(null, null);
            passwordCallback = null;
            if (instance != null) {
                instance2 = KeyManagerFactory.getInstance("SunX509");
                if (passwordCallback == null) {
                    instance2.init(instance, null);
                } else {
                    instance2.init(instance, passwordCallback.getPassword());
                    passwordCallback.clearPassword();
                }
                keyManagers = instance2.getKeyManagers();
                instance3 = SSLContext.getInstance(TLSUtils.TLS);
                secureRandom = new SecureRandom();
                customX509TrustManager = this.config.getCustomX509TrustManager();
                if (newInstance == null) {
                    newInstance.init(instance3, keyManagers, customX509TrustManager, secureRandom);
                } else {
                    if (customX509TrustManager != null) {
                        trustManagerArr = new TrustManager[]{customX509TrustManager};
                    }
                    instance3.init(keyManagers, trustManagerArr, secureRandom);
                }
                customSSLContext = instance3;
            }
            keyManagers = null;
            instance3 = SSLContext.getInstance(TLSUtils.TLS);
            secureRandom = new SecureRandom();
            customX509TrustManager = this.config.getCustomX509TrustManager();
            if (newInstance == null) {
                if (customX509TrustManager != null) {
                    trustManagerArr = new TrustManager[]{customX509TrustManager};
                }
                instance3.init(keyManagers, trustManagerArr, secureRandom);
            } else {
                newInstance.init(instance3, keyManagers, customX509TrustManager, secureRandom);
            }
            customSSLContext = instance3;
        }
        socket = this.socket;
        this.socket = customSSLContext.getSocketFactory().createSocket(socket, this.host, socket.getPort(), true);
        sSLSocket = (SSLSocket) this.socket;
        TLSUtils.setEnabledProtocolsAndCiphers(sSLSocket, this.config.getEnabledSSLProtocols(), this.config.getEnabledSSLCiphers());
        initReaderAndWriter();
        sSLSocket.startHandshake();
        if (newInstance != null) {
            newInstance.finish(sSLSocket);
        }
        hostnameVerifier = getConfiguration().getHostnameVerifier();
        if (hostnameVerifier == null) {
            throw new IllegalStateException("No HostnameVerifier set. Use connectionConfiguration.setHostnameVerifier() to configure.");
        } else if (hostnameVerifier.verify(getXMPPServiceDomain().toString(), sSLSocket.getSession())) {
            stringBuilder = new StringBuilder("Hostname verification of certificate failed. Certificate does not authenticate ");
            stringBuilder.append(getXMPPServiceDomain());
            throw new CertificateException(stringBuilder.toString());
        } else {
            this.secureSocket = sSLSocket;
        }
    }

    private void processHandledCount(long j) {
        long calculateDelta = SMUtils.calculateDelta(j, this.serverHandledStanzasCount);
        final List<Stanza> arrayList = new ArrayList(calculateDelta <= 2147483647L ? (int) calculateDelta : ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        for (long j2 = 0; j2 < calculateDelta; j2++) {
            Stanza stanza = (Stanza) this.unacknowledgedStanzas.poll();
            if (stanza == null) {
                throw new StreamManagementCounterError(j, this.serverHandledStanzasCount, calculateDelta, arrayList);
            }
            arrayList.add(stanza);
        }
        Object obj = 1;
        if (this.stanzaAcknowledgedListeners.isEmpty()) {
            for (Stanza stanzaId : arrayList) {
                String stanzaId2 = stanzaId.getStanzaId();
                if (stanzaId2 != null && this.stanzaIdAcknowledgedListeners.containsKey(stanzaId2)) {
                    break;
                }
            }
            obj = null;
        }
        if (obj != null) {
            asyncGo(new Runnable() {
                public void run() {
                    for (Stanza stanza : arrayList) {
                        for (StanzaListener processStanza : XMPPTCPConnection.this.stanzaAcknowledgedListeners) {
                            try {
                                processStanza.processStanza(stanza);
                            } catch (Throwable e) {
                                XMPPTCPConnection.LOGGER.log(Level.FINER, "Received exception", e);
                            }
                        }
                        CharSequence stanzaId = stanza.getStanzaId();
                        if (!StringUtils.isNullOrEmpty(stanzaId)) {
                            StanzaListener stanzaListener = (StanzaListener) XMPPTCPConnection.this.stanzaIdAcknowledgedListeners.remove(stanzaId);
                            if (stanzaListener != null) {
                                try {
                                    stanzaListener.processStanza(stanza);
                                } catch (Throwable e2) {
                                    XMPPTCPConnection.LOGGER.log(Level.FINER, "Received exception", e2);
                                }
                            }
                        }
                    }
                }
            });
        }
        this.serverHandledStanzasCount = j;
    }

    private void requestSmAcknowledgementInternal() {
        this.packetWriter.sendStreamElement(AckRequest.INSTANCE);
    }

    private void sendSmAcknowledgementInternal() {
        this.packetWriter.sendStreamElement(new AckAnswer(this.clientHandledStanzasCount));
    }

    public static void setDefaultBundleAndDeferCallback(BundleAndDeferCallback bundleAndDeferCallback) {
        defaultBundleAndDeferCallback = bundleAndDeferCallback;
    }

    public static void setUseStreamManagementDefault(boolean z) {
        useSmDefault = z;
    }

    @Deprecated
    public static void setUseStreamManagementResumptiodDefault(boolean z) {
        setUseStreamManagementResumptionDefault(z);
    }

    public static void setUseStreamManagementResumptionDefault(boolean z) {
        if (z) {
            setUseStreamManagementDefault(z);
        }
        useSmResumptionDefault = z;
    }

    private void shutdown(boolean z) {
        if (!this.disconnectedButResumeable) {
            if (this.packetWriter != null) {
                LOGGER.finer("PacketWriter shutdown()");
                this.packetWriter.shutdown(z);
            }
            LOGGER.finer("PacketWriter has been shut down");
            if (!z) {
                try {
                    this.closingStreamReceived.checkIfSuccessOrWait();
                } catch (Throwable e) {
                    Logger logger = LOGGER;
                    Level level = Level.INFO;
                    StringBuilder stringBuilder = new StringBuilder("Exception while waiting for closing stream element from the server ");
                    stringBuilder.append(this);
                    logger.log(level, stringBuilder.toString(), e);
                }
            }
            if (this.packetReader != null) {
                LOGGER.finer("PacketReader shutdown()");
                this.packetReader.shutdown();
            }
            LOGGER.finer("PacketReader has been shut down");
            try {
                this.socket.close();
            } catch (Throwable e2) {
                LOGGER.log(Level.WARNING, "shutdown", e2);
            }
            setWasAuthenticated();
            if (isSmResumptionPossible() && z) {
                this.disconnectedButResumeable = true;
            } else {
                this.disconnectedButResumeable = false;
                this.smSessionId = null;
            }
            this.authenticated = false;
            this.connected = false;
            this.secureSocket = null;
            this.reader = null;
            this.writer = null;
            this.maybeCompressFeaturesReceived.init();
            this.compressSyncPoint.init();
            this.smResumedSyncPoint.init();
            this.smEnabledSyncPoint.init();
            this.initalOpenStreamSend.init();
        }
    }

    public boolean addRequestAckPredicate(StanzaFilter stanzaFilter) {
        boolean add;
        synchronized (this.requestAckPredicates) {
            add = this.requestAckPredicates.add(stanzaFilter);
        }
        return add;
    }

    public void addStanzaAcknowledgedListener(StanzaListener stanzaListener) {
        this.stanzaAcknowledgedListeners.add(stanzaListener);
    }

    public StanzaListener addStanzaIdAcknowledgedListener(final String str, StanzaListener stanzaListener) {
        if (this.smWasEnabledAtLeastOnce) {
            schedule(new Runnable() {
                public void run() {
                    XMPPTCPConnection.this.stanzaIdAcknowledgedListeners.remove(str);
                }
            }, (long) Math.min(getMaxSmResumptionTime(), 43200), TimeUnit.SECONDS);
            return (StanzaListener) this.stanzaIdAcknowledgedListeners.put(str, stanzaListener);
        }
        throw new StreamManagementNotEnabledException();
    }

    protected void afterFeaturesReceived() {
        StartTls startTls = (StartTls) getFeature(StartTls.ELEMENT, StartTls.NAMESPACE);
        if (startTls != null) {
            if (startTls.required() && this.config.getSecurityMode() == SecurityMode.disabled) {
                Exception securityRequiredByServerException = new SecurityRequiredByServerException();
                this.tlsHandled.reportFailure(securityRequiredByServerException);
                notifyConnectionError(securityRequiredByServerException);
                return;
            } else if (this.config.getSecurityMode() != SecurityMode.disabled) {
                sendNonza(new StartTls());
                if (getSASLAuthentication().authenticationSuccessful()) {
                    this.maybeCompressFeaturesReceived.reportSuccess();
                }
            }
        }
        this.tlsHandled.reportSuccess();
        if (getSASLAuthentication().authenticationSuccessful()) {
            this.maybeCompressFeaturesReceived.reportSuccess();
        }
    }

    protected void afterSuccessfulLogin(boolean z) {
        this.disconnectedButResumeable = false;
        super.afterSuccessfulLogin(z);
    }

    protected void connectInternal() {
        this.closingStreamReceived.init();
        connectUsingConfiguration();
        initConnection();
    }

    public int getMaxSmResumptionTime() {
        int i = this.smClientMaxResumptionTime;
        int i2 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        i = i > 0 ? this.smClientMaxResumptionTime : ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        if (this.smServerMaxResumptimTime > 0) {
            i2 = this.smServerMaxResumptimTime;
        }
        return Math.min(i, i2);
    }

    public synchronized void instantShutdown() {
        shutdown(true);
    }

    public boolean isDisconnectedButSmResumptionPossible() {
        return this.disconnectedButResumeable && isSmResumptionPossible();
    }

    public boolean isSecureConnection() {
        return this.secureSocket != null;
    }

    public boolean isSmAvailable() {
        return hasFeature(StreamManagementFeature.ELEMENT, StreamManagement.NAMESPACE);
    }

    public boolean isSmEnabled() {
        return this.smEnabledSyncPoint.wasSuccessful();
    }

    public boolean isSmResumptionPossible() {
        if (this.smSessionId == null) {
            return false;
        }
        Long l = this.packetWriter.shutdownTimestamp;
        if (l == null) {
            return true;
        }
        return System.currentTimeMillis() <= l.longValue() + (((long) getMaxSmResumptionTime()) * 1000);
    }

    public boolean isUsingCompression() {
        return this.compressionHandler != null && this.compressSyncPoint.wasSuccessful();
    }

    protected synchronized void loginInternal(String str, String str2, org.b.a.b.d dVar) {
        this.saslAuthentication.authenticate(str, str2, this.config.getAuthzid(), this.secureSocket != null ? this.secureSocket.getSession() : null);
        maybeEnableCompression();
        if (isSmResumptionPossible()) {
            this.smResumedSyncPoint.sendAndWaitForResponse(new Resume(this.clientHandledStanzasCount, this.smSessionId));
            if (this.smResumedSyncPoint.wasSuccessful()) {
                afterSuccessfulLogin(true);
                return;
            }
            LOGGER.fine("Stream resumption failed, continuing with normal stream establishment process");
        }
        Object<Stanza> linkedList = new LinkedList();
        if (this.unacknowledgedStanzas != null) {
            this.unacknowledgedStanzas.drainTo(linkedList);
            dropSmState();
        }
        bindResourceAndEstablishSession(dVar);
        if (isSmAvailable() && this.useSm) {
            this.serverHandledStanzasCount = 0;
            this.smEnabledSyncPoint.sendAndWaitForResponseOrThrow(new Enable(this.useSmResumption, this.smClientMaxResumptionTime));
            synchronized (this.requestAckPredicates) {
                if (this.requestAckPredicates.isEmpty()) {
                    this.requestAckPredicates.add(Predicate.forMessagesOrAfter5Stanzas());
                }
            }
        }
        for (Stanza sendStanzaInternal : linkedList) {
            sendStanzaInternal(sendStanzaInternal);
        }
        afterSuccessfulLogin(false);
    }

    void openStream() {
        CharSequence xMPPServiceDomain = getXMPPServiceDomain();
        CharSequence username = this.config.getUsername();
        sendNonza(new StreamOpen(xMPPServiceDomain, username != null ? b.a(username, xMPPServiceDomain) : null, getStreamId()));
        try {
            this.packetReader.parser = PacketParserUtils.newXmppParser(this.reader);
        } catch (Throwable e) {
            throw new SmackException(e);
        }
    }

    public void removeAllRequestAckPredicates() {
        synchronized (this.requestAckPredicates) {
            this.requestAckPredicates.clear();
        }
    }

    public void removeAllStanzaAcknowledgedListeners() {
        this.stanzaAcknowledgedListeners.clear();
    }

    public void removeAllStanzaIdAcknowledgedListeners() {
        this.stanzaIdAcknowledgedListeners.clear();
    }

    public boolean removeRequestAckPredicate(StanzaFilter stanzaFilter) {
        boolean remove;
        synchronized (this.requestAckPredicates) {
            remove = this.requestAckPredicates.remove(stanzaFilter);
        }
        return remove;
    }

    public boolean removeStanzaAcknowledgedListener(StanzaListener stanzaListener) {
        return this.stanzaAcknowledgedListeners.remove(stanzaListener);
    }

    public StanzaListener removeStanzaIdAcknowledgedListener(String str) {
        return (StanzaListener) this.stanzaIdAcknowledgedListeners.remove(str);
    }

    public void requestSmAcknowledgement() {
        if (isSmEnabled()) {
            requestSmAcknowledgementInternal();
            return;
        }
        throw new StreamManagementNotEnabledException();
    }

    public void sendNonza(Nonza nonza) {
        this.packetWriter.sendStreamElement(nonza);
    }

    public void sendSmAcknowledgement() {
        if (isSmEnabled()) {
            sendSmAcknowledgementInternal();
            return;
        }
        throw new StreamManagementNotEnabledException();
    }

    protected void sendStanzaInternal(Stanza stanza) {
        this.packetWriter.sendStreamElement(stanza);
        if (isSmEnabled()) {
            for (StanzaFilter accept : this.requestAckPredicates) {
                if (accept.accept(stanza)) {
                    requestSmAcknowledgementInternal();
                    return;
                }
            }
        }
    }

    public void setBundleandDeferCallback(BundleAndDeferCallback bundleAndDeferCallback) {
        this.bundleAndDeferCallback = bundleAndDeferCallback;
    }

    public void setPreferredResumptionTime(int i) {
        this.smClientMaxResumptionTime = i;
    }

    public void setUseStreamManagement(boolean z) {
        this.useSm = z;
    }

    public void setUseStreamManagementResumption(boolean z) {
        if (z) {
            setUseStreamManagement(z);
        }
        this.useSmResumption = z;
    }

    protected void setWriter(Writer writer) {
        this.writer = writer;
    }

    protected void shutdown() {
        if (isSmEnabled()) {
            try {
                sendSmAcknowledgementInternal();
            } catch (Throwable e) {
                LOGGER.log(Level.FINE, "Can not send final SM ack as connection is not connected", e);
            }
        }
        shutdown(false);
    }

    public boolean streamWasResumed() {
        return this.smResumedSyncPoint.wasSuccessful();
    }

    protected void throwAlreadyConnectedExceptionIfAppropriate() {
        if (isConnected() && !this.disconnectedButResumeable) {
            throw new AlreadyConnectedException();
        }
    }

    protected void throwAlreadyLoggedInExceptionIfAppropriate() {
        if (isAuthenticated() && !this.disconnectedButResumeable) {
            throw new AlreadyLoggedInException();
        }
    }

    protected void throwNotConnectedExceptionIfAppropriate() {
        if (this.packetWriter == null) {
            throw new NotConnectedException();
        }
        this.packetWriter.throwNotConnectedExceptionIfDoneAndResumptionNotPossible();
    }
}
