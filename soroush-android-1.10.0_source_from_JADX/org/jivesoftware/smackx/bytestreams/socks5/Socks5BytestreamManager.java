package org.jivesoftware.smackx.bytestreams.socks5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.b.a.i;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smackx.bytestreams.BytestreamListener;
import org.jivesoftware.smackx.bytestreams.BytestreamManager;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.StreamHost;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;

public final class Socks5BytestreamManager extends Manager implements BytestreamManager {
    private static final String SESSION_ID_PREFIX = "js5_";
    private static final Map<XMPPConnection, Socks5BytestreamManager> managers = new WeakHashMap();
    private static final Random randomGenerator = new Random();
    private final List<BytestreamListener> allRequestListeners = Collections.synchronizedList(new LinkedList());
    private List<String> ignoredBytestreamRequests = Collections.synchronizedList(new LinkedList());
    private final InitiationListener initiationListener = new InitiationListener(this);
    private i lastWorkingProxy;
    private final Set<i> proxyBlacklist = Collections.synchronizedSet(new HashSet());
    private int proxyConnectionTimeout = 10000;
    private boolean proxyPrioritizationEnabled = true;
    private int targetResponseTimeout = 10000;
    private final Map<i, BytestreamListener> userListeners = new ConcurrentHashMap();

    static class C79091 implements ConnectionCreationListener {
        C79091() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            Socks5BytestreamManager.getBytestreamManager(xMPPConnection);
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79091());
    }

    private Socks5BytestreamManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        activate();
    }

    private void activate() {
        connection().registerIQRequestHandler(this.initiationListener);
        enableService();
    }

    private static Bytestream createBytestreamInitiation(String str, i iVar, List<StreamHost> list) {
        Bytestream bytestream = new Bytestream(str);
        for (StreamHost addStreamHost : list) {
            bytestream.addStreamHost(addStreamHost);
        }
        bytestream.setType(Type.set);
        bytestream.setTo(iVar);
        return bytestream;
    }

    private static Bytestream createStreamHostRequest(i iVar) {
        Bytestream bytestream = new Bytestream();
        bytestream.setType(Type.get);
        bytestream.setTo(iVar);
        return bytestream;
    }

    private java.util.List<org.b.a.i> determineProxies() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = r7.connection();
        r1 = org.jivesoftware.smackx.disco.ServiceDiscoveryManager.getInstanceFor(r0);
        r2 = new java.util.ArrayList;
        r2.<init>();
        r0 = r0.getXMPPServiceDomain();
        r0 = r1.discoverItems(r0);
        r0 = r0.getItems();
        r0 = r0.iterator();
    L_0x001d:
        r3 = r0.hasNext();
        if (r3 == 0) goto L_0x0059;
    L_0x0023:
        r3 = r0.next();
        r3 = (org.jivesoftware.smackx.disco.packet.DiscoverItems.Item) r3;
        r4 = r7.proxyBlacklist;
        r5 = r3.getEntityID();
        r4 = r4.contains(r5);
        if (r4 != 0) goto L_0x001d;
    L_0x0035:
        r4 = r3.getEntityID();	 Catch:{ NoResponseException -> 0x004f, NoResponseException -> 0x004f }
        r4 = r1.discoverInfo(r4);	 Catch:{ NoResponseException -> 0x004f, NoResponseException -> 0x004f }
        r5 = "proxy";
        r6 = "bytestreams";
        r4 = r4.hasIdentity(r5, r6);
        if (r4 == 0) goto L_0x004f;
    L_0x0047:
        r3 = r3.getEntityID();
        r2.add(r3);
        goto L_0x001d;
    L_0x004f:
        r4 = r7.proxyBlacklist;
        r3 = r3.getEntityID();
        r4.add(r3);
        goto L_0x001d;
    L_0x0059:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager.determineProxies():java.util.List<org.b.a.i>");
    }

    private java.util.List<org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.StreamHost> determineStreamHostInfos(java.util.List<org.b.a.i> r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4.connection();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = r4.getLocalStreamHost();
        if (r2 == 0) goto L_0x0012;
    L_0x000f:
        r1.addAll(r2);
    L_0x0012:
        r5 = r5.iterator();
    L_0x0016:
        r2 = r5.hasNext();
        if (r2 == 0) goto L_0x003e;
    L_0x001c:
        r2 = r5.next();
        r2 = (org.b.a.i) r2;
        r3 = createStreamHostRequest(r2);
        r3 = r0.createStanzaCollectorAndSend(r3);	 Catch:{ Exception -> 0x0038 }
        r3 = r3.nextResultOrThrow();	 Catch:{ Exception -> 0x0038 }
        r3 = (org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream) r3;	 Catch:{ Exception -> 0x0038 }
        r3 = r3.getStreamHosts();	 Catch:{ Exception -> 0x0038 }
        r1.addAll(r3);	 Catch:{ Exception -> 0x0038 }
        goto L_0x0016;
    L_0x0038:
        r3 = r4.proxyBlacklist;
        r3.add(r2);
        goto L_0x0016;
    L_0x003e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager.determineStreamHostInfos(java.util.List):java.util.List<org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream$StreamHost>");
    }

    private void enableService() {
        ServiceDiscoveryManager.getInstanceFor(connection()).addFeature(Bytestream.NAMESPACE);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager getBytestreamManager(org.jivesoftware.smack.XMPPConnection r3) {
        /*
        r0 = org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager.class;
        monitor-enter(r0);
        if (r3 != 0) goto L_0x0008;
    L_0x0005:
        r3 = 0;
        monitor-exit(r0);
        return r3;
    L_0x0008:
        r1 = managers;	 Catch:{ all -> 0x001e }
        r1 = r1.get(r3);	 Catch:{ all -> 0x001e }
        r1 = (org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager) r1;	 Catch:{ all -> 0x001e }
        if (r1 != 0) goto L_0x001c;
    L_0x0012:
        r1 = new org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager;	 Catch:{ all -> 0x001e }
        r1.<init>(r3);	 Catch:{ all -> 0x001e }
        r2 = managers;	 Catch:{ all -> 0x001e }
        r2.put(r3, r1);	 Catch:{ all -> 0x001e }
    L_0x001c:
        monitor-exit(r0);
        return r1;
    L_0x001e:
        r3 = move-exception;
        monitor-exit(r0);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager.getBytestreamManager(org.jivesoftware.smack.XMPPConnection):org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager");
    }

    private List<StreamHost> getLocalStreamHost() {
        XMPPConnection connection = connection();
        Socks5Proxy socks5Proxy = Socks5Proxy.getSocks5Proxy();
        if (!socks5Proxy.isRunning()) {
            return null;
        }
        List<String> localAddresses = socks5Proxy.getLocalAddresses();
        if (localAddresses.isEmpty()) {
            return null;
        }
        int port = socks5Proxy.getPort();
        List<StreamHost> arrayList = new ArrayList();
        for (String str : localAddresses) {
            r6 = new String[3];
            int i = 0;
            r6[0] = "127.0.0.1";
            r6[1] = "0:0:0:0:0:0:0:1";
            r6[2] = "::1";
            while (i < 3) {
                if (str.startsWith(r6[i])) {
                    break;
                }
                i++;
            }
            arrayList.add(new StreamHost(connection.getUser(), str, port));
        }
        return arrayList;
    }

    private static String getNextSessionID() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SESSION_ID_PREFIX);
        stringBuilder.append(Math.abs(randomGenerator.nextLong()));
        return stringBuilder.toString();
    }

    private boolean supportsSocks5(i iVar) {
        return ServiceDiscoveryManager.getInstanceFor(connection()).supportsFeature(iVar, Bytestream.NAMESPACE);
    }

    public final void addIncomingBytestreamListener(BytestreamListener bytestreamListener) {
        this.allRequestListeners.add(bytestreamListener);
    }

    public final void addIncomingBytestreamListener(BytestreamListener bytestreamListener, i iVar) {
        this.userListeners.put(iVar, bytestreamListener);
    }

    public final synchronized void disableService() {
        XMPPConnection connection = connection();
        connection.unregisterIQRequestHandler(this.initiationListener);
        this.initiationListener.shutdown();
        this.allRequestListeners.clear();
        this.userListeners.clear();
        this.lastWorkingProxy = null;
        this.proxyBlacklist.clear();
        this.ignoredBytestreamRequests.clear();
        managers.remove(connection);
        if (managers.size() == 0) {
            Socks5Proxy.getSocks5Proxy().stop();
        }
        ServiceDiscoveryManager instanceFor = ServiceDiscoveryManager.getInstanceFor(connection);
        if (instanceFor != null) {
            instanceFor.removeFeature(Bytestream.NAMESPACE);
        }
    }

    public final Socks5BytestreamSession establishSession(i iVar) {
        return establishSession(iVar, getNextSessionID());
    }

    public final org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamSession establishSession(org.b.a.i r12, java.lang.String r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r11 = this;
        r6 = r11.connection();
        r0 = r11.supportsSocks5(r12);
        if (r0 != 0) goto L_0x0012;
    L_0x000a:
        r13 = new org.jivesoftware.smack.SmackException$FeatureNotSupportedException;
        r0 = "SOCKS5 Bytestream";
        r13.<init>(r0, r12);
        throw r13;
    L_0x0012:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = 0;
        r2 = r11.determineProxies();	 Catch:{ XMPPErrorException -> 0x0021 }
        r0.addAll(r2);	 Catch:{ XMPPErrorException -> 0x0021 }
        r2 = r1;
        goto L_0x0022;
    L_0x0021:
        r2 = move-exception;
    L_0x0022:
        r0 = r11.determineStreamHostInfos(r0);
        r3 = r0.isEmpty();
        if (r3 == 0) goto L_0x0037;
    L_0x002c:
        if (r2 == 0) goto L_0x002f;
    L_0x002e:
        throw r2;
    L_0x002f:
        r12 = new org.jivesoftware.smack.SmackException;
        r13 = "no SOCKS5 proxies available";
        r12.<init>(r13);
        throw r12;
    L_0x0037:
        r2 = r6.getUser();
        r7 = org.jivesoftware.smackx.bytestreams.socks5.Socks5Utils.createDigest(r13, r2, r12);
        r2 = r11.proxyPrioritizationEnabled;
        if (r2 == 0) goto L_0x006d;
    L_0x0043:
        r2 = r11.lastWorkingProxy;
        if (r2 == 0) goto L_0x006d;
    L_0x0047:
        r2 = r0.iterator();
    L_0x004b:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0064;
    L_0x0051:
        r3 = r2.next();
        r3 = (org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.StreamHost) r3;
        r4 = r3.getJID();
        r5 = r11.lastWorkingProxy;
        r4 = r4.a(r5);
        if (r4 == 0) goto L_0x004b;
    L_0x0063:
        r1 = r3;
    L_0x0064:
        if (r1 == 0) goto L_0x006d;
    L_0x0066:
        r0.remove(r1);
        r2 = 0;
        r0.add(r2, r1);
    L_0x006d:
        r8 = org.jivesoftware.smackx.bytestreams.socks5.Socks5Proxy.getSocks5Proxy();
        r8.addTransfer(r7);	 Catch:{ TimeoutException -> 0x00cd }
        r0 = createBytestreamInitiation(r13, r12, r0);	 Catch:{ TimeoutException -> 0x00cd }
        r1 = r6.createStanzaCollectorAndSend(r0);	 Catch:{ TimeoutException -> 0x00cd }
        r2 = r11.getTargetResponseTimeout();	 Catch:{ TimeoutException -> 0x00cd }
        r2 = (long) r2;	 Catch:{ TimeoutException -> 0x00cd }
        r1 = r1.nextResultOrThrow(r2);	 Catch:{ TimeoutException -> 0x00cd }
        r1 = (org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream) r1;	 Catch:{ TimeoutException -> 0x00cd }
        r1 = r1.getUsedHost();	 Catch:{ TimeoutException -> 0x00cd }
        r1 = r1.getJID();	 Catch:{ TimeoutException -> 0x00cd }
        r9 = r0.getStreamHost(r1);	 Catch:{ TimeoutException -> 0x00cd }
        if (r9 != 0) goto L_0x009d;	 Catch:{ TimeoutException -> 0x00cd }
    L_0x0095:
        r12 = new org.jivesoftware.smack.SmackException;	 Catch:{ TimeoutException -> 0x00cd }
        r13 = "Remote user responded with unknown host";	 Catch:{ TimeoutException -> 0x00cd }
        r12.<init>(r13);	 Catch:{ TimeoutException -> 0x00cd }
        throw r12;	 Catch:{ TimeoutException -> 0x00cd }
    L_0x009d:
        r10 = new org.jivesoftware.smackx.bytestreams.socks5.Socks5ClientForInitiator;	 Catch:{ TimeoutException -> 0x00cd }
        r0 = r10;	 Catch:{ TimeoutException -> 0x00cd }
        r1 = r9;	 Catch:{ TimeoutException -> 0x00cd }
        r2 = r7;	 Catch:{ TimeoutException -> 0x00cd }
        r3 = r6;	 Catch:{ TimeoutException -> 0x00cd }
        r4 = r13;	 Catch:{ TimeoutException -> 0x00cd }
        r5 = r12;	 Catch:{ TimeoutException -> 0x00cd }
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ TimeoutException -> 0x00cd }
        r12 = r11.getProxyConnectionTimeout();	 Catch:{ TimeoutException -> 0x00cd }
        r12 = r10.getSocket(r12);	 Catch:{ TimeoutException -> 0x00cd }
        r13 = r9.getJID();	 Catch:{ TimeoutException -> 0x00cd }
        r11.lastWorkingProxy = r13;	 Catch:{ TimeoutException -> 0x00cd }
        r13 = new org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamSession;	 Catch:{ TimeoutException -> 0x00cd }
        r0 = r9.getJID();	 Catch:{ TimeoutException -> 0x00cd }
        r1 = r6.getUser();	 Catch:{ TimeoutException -> 0x00cd }
        r0 = r0.a(r1);	 Catch:{ TimeoutException -> 0x00cd }
        r13.<init>(r12, r0);	 Catch:{ TimeoutException -> 0x00cd }
        r8.removeTransfer(r7);
        return r13;
    L_0x00cb:
        r12 = move-exception;
        goto L_0x00d5;
    L_0x00cd:
        r12 = new java.io.IOException;	 Catch:{ all -> 0x00cb }
        r13 = "Timeout while connecting to SOCKS5 proxy";	 Catch:{ all -> 0x00cb }
        r12.<init>(r13);	 Catch:{ all -> 0x00cb }
        throw r12;	 Catch:{ all -> 0x00cb }
    L_0x00d5:
        r8.removeTransfer(r7);
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamManager.establishSession(org.b.a.i, java.lang.String):org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamSession");
    }

    protected final List<BytestreamListener> getAllRequestListeners() {
        return this.allRequestListeners;
    }

    protected final XMPPConnection getConnection() {
        return connection();
    }

    protected final List<String> getIgnoredBytestreamRequests() {
        return this.ignoredBytestreamRequests;
    }

    public final int getProxyConnectionTimeout() {
        if (this.proxyConnectionTimeout <= 0) {
            this.proxyConnectionTimeout = 10000;
        }
        return this.proxyConnectionTimeout;
    }

    public final int getTargetResponseTimeout() {
        if (this.targetResponseTimeout <= 0) {
            this.targetResponseTimeout = 10000;
        }
        return this.targetResponseTimeout;
    }

    protected final BytestreamListener getUserListener(i iVar) {
        return (BytestreamListener) this.userListeners.get(iVar);
    }

    public final void ignoreBytestreamRequestOnce(String str) {
        this.ignoredBytestreamRequests.add(str);
    }

    public final boolean isProxyPrioritizationEnabled() {
        return this.proxyPrioritizationEnabled;
    }

    public final void removeIncomingBytestreamListener(String str) {
        this.userListeners.remove(str);
    }

    public final void removeIncomingBytestreamListener(BytestreamListener bytestreamListener) {
        this.allRequestListeners.remove(bytestreamListener);
    }

    protected final void replyRejectPacket(IQ iq) {
        connection().sendStanza(IQ.createErrorResponse(iq, XMPPError.getBuilder(Condition.not_acceptable)));
    }

    public final void setProxyConnectionTimeout(int i) {
        this.proxyConnectionTimeout = i;
    }

    public final void setProxyPrioritizationEnabled(boolean z) {
        this.proxyPrioritizationEnabled = z;
    }

    public final void setTargetResponseTimeout(int i) {
        this.targetResponseTimeout = i;
    }
}
