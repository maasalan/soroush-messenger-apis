package org.jivesoftware.smackx.ping;

import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.a.i;
import org.jivesoftware.smack.AbstractConnectionClosedListener;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.util.SmackExecutorThreadFactory;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.ping.packet.Ping;

public final class PingManager extends Manager {
    private static final Map<XMPPConnection, PingManager> INSTANCES = new WeakHashMap();
    private static final Logger LOGGER = Logger.getLogger(PingManager.class.getName());
    private static int defaultPingInterval = 1800;
    private final ScheduledExecutorService executorService;
    private ScheduledFuture<?> nextAutomaticPing;
    private final Set<PingFailedListener> pingFailedListeners = new CopyOnWriteArraySet();
    private int pingInterval = defaultPingInterval;
    private final Runnable pingServerRunnable = new C78004();

    class C78004 implements Runnable {
        C78004() {
        }

        public void run() {
            PingManager.LOGGER.fine("ServerPingTask run()");
            PingManager.this.pingServerIfNecessary();
        }
    }

    static class C79501 implements ConnectionCreationListener {
        C79501() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            PingManager.getInstanceFor(xMPPConnection);
        }
    }

    class C80403 extends AbstractConnectionClosedListener {
        C80403() {
        }

        public void authenticated(XMPPConnection xMPPConnection, boolean z) {
            PingManager.this.maybeSchedulePingServerTask();
        }

        public void connectionTerminated() {
            PingManager.this.maybeStopPingServerTask();
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79501());
    }

    private PingManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        this.executorService = Executors.newSingleThreadScheduledExecutor(new SmackExecutorThreadFactory(xMPPConnection, "Ping"));
        ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature(Ping.NAMESPACE);
        xMPPConnection.registerIQRequestHandler(new AbstractIqRequestHandler(Ping.ELEMENT, Ping.NAMESPACE, Type.get, Mode.async) {
            public IQ handleIQRequest(IQ iq) {
                return ((Ping) iq).getPong();
            }
        });
        xMPPConnection.addConnectionListener(new C80403());
        maybeSchedulePingServerTask();
    }

    public static synchronized PingManager getInstanceFor(XMPPConnection xMPPConnection) {
        PingManager pingManager;
        synchronized (PingManager.class) {
            pingManager = (PingManager) INSTANCES.get(xMPPConnection);
            if (pingManager == null) {
                pingManager = new PingManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, pingManager);
            }
        }
        return pingManager;
    }

    private void maybeSchedulePingServerTask() {
        maybeSchedulePingServerTask(0);
    }

    private synchronized void maybeSchedulePingServerTask(int i) {
        maybeStopPingServerTask();
        if (this.pingInterval > 0) {
            int i2 = this.pingInterval - i;
            Logger logger = LOGGER;
            StringBuilder stringBuilder = new StringBuilder("Scheduling ServerPingTask in ");
            stringBuilder.append(i2);
            stringBuilder.append(" seconds (pingInterval=");
            stringBuilder.append(this.pingInterval);
            stringBuilder.append(", delta=");
            stringBuilder.append(i);
            stringBuilder.append(")");
            logger.fine(stringBuilder.toString());
            this.nextAutomaticPing = this.executorService.schedule(this.pingServerRunnable, (long) i2, TimeUnit.SECONDS);
        }
    }

    private void maybeStopPingServerTask() {
        if (this.nextAutomaticPing != null) {
            this.nextAutomaticPing.cancel(true);
            this.nextAutomaticPing = null;
        }
    }

    public static void setDefaultPingInterval(int i) {
        defaultPingInterval = i;
    }

    protected final void finalize() {
        LOGGER.fine("finalizing PingManager: Shutting down executor service");
        try {
            this.executorService.shutdown();
        } catch (Throwable th) {
            LOGGER.log(Level.WARNING, "finalize() threw throwable", th);
        } finally {
            super.finalize();
        }
    }

    public final int getPingInterval() {
        return this.pingInterval;
    }

    public final boolean isPingSupported(i iVar) {
        return ServiceDiscoveryManager.getInstanceFor(connection()).supportsFeature(iVar, Ping.NAMESPACE);
    }

    public final boolean ping(i iVar) {
        return ping(iVar, connection().getReplyTimeout());
    }

    public final boolean ping(org.b.a.i r3, long r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.connection();
        r1 = r0.isAuthenticated();
        if (r1 != 0) goto L_0x0010;
    L_0x000a:
        r3 = new org.jivesoftware.smack.SmackException$NotConnectedException;
        r3.<init>();
        throw r3;
    L_0x0010:
        r1 = new org.jivesoftware.smackx.ping.packet.Ping;
        r1.<init>(r3);
        r1 = r0.createStanzaCollectorAndSend(r1);	 Catch:{ XMPPException -> 0x001e }
        r1.nextResultOrThrow(r4);	 Catch:{ XMPPException -> 0x001e }
        r3 = 1;
        return r3;
    L_0x001e:
        r4 = r0.getXMPPServiceDomain();
        r3 = r3.a(r4);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.ping.PingManager.ping(org.b.a.i, long):boolean");
    }

    public final boolean pingMyServer() {
        return pingMyServer(true);
    }

    public final boolean pingMyServer(boolean z) {
        return pingMyServer(z, connection().getReplyTimeout());
    }

    public final boolean pingMyServer(boolean r2, long r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.connection();	 Catch:{ NoResponseException -> 0x000d }
        r0 = r0.getXMPPServiceDomain();	 Catch:{ NoResponseException -> 0x000d }
        r3 = r1.ping(r0, r3);	 Catch:{ NoResponseException -> 0x000d }
        goto L_0x000e;
    L_0x000d:
        r3 = 0;
    L_0x000e:
        if (r3 != 0) goto L_0x0028;
    L_0x0010:
        if (r2 == 0) goto L_0x0028;
    L_0x0012:
        r2 = r1.pingFailedListeners;
        r2 = r2.iterator();
    L_0x0018:
        r4 = r2.hasNext();
        if (r4 == 0) goto L_0x0028;
    L_0x001e:
        r4 = r2.next();
        r4 = (org.jivesoftware.smackx.ping.PingFailedListener) r4;
        r4.pingFailed();
        goto L_0x0018;
    L_0x0028:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.ping.PingManager.pingMyServer(boolean, long):boolean");
    }

    public final synchronized void pingServerIfNecessary() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = r10.connection();	 Catch:{ all -> 0x0089 }
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r10);
        return;
    L_0x0009:
        r1 = r10.pingInterval;	 Catch:{ all -> 0x0089 }
        if (r1 > 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r10);
        return;
    L_0x000f:
        r1 = r0.getLastStanzaReceived();	 Catch:{ all -> 0x0089 }
        r3 = 0;	 Catch:{ all -> 0x0089 }
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));	 Catch:{ all -> 0x0089 }
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ all -> 0x0089 }
        if (r5 <= 0) goto L_0x002c;	 Catch:{ all -> 0x0089 }
    L_0x001b:
        r5 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0089 }
        r7 = r5 - r1;	 Catch:{ all -> 0x0089 }
        r7 = r7 / r3;	 Catch:{ all -> 0x0089 }
        r1 = (int) r7;	 Catch:{ all -> 0x0089 }
        r2 = r10.pingInterval;	 Catch:{ all -> 0x0089 }
        if (r1 >= r2) goto L_0x002c;	 Catch:{ all -> 0x0089 }
    L_0x0027:
        r10.maybeSchedulePingServerTask(r1);	 Catch:{ all -> 0x0089 }
        monitor-exit(r10);
        return;
    L_0x002c:
        r1 = r0.isAuthenticated();	 Catch:{ all -> 0x0089 }
        if (r1 == 0) goto L_0x0080;
    L_0x0032:
        r1 = 0;
        r2 = r1;
        r5 = r2;
    L_0x0035:
        r6 = 3;
        if (r2 >= r6) goto L_0x0061;
    L_0x0038:
        if (r2 == 0) goto L_0x0040;
    L_0x003a:
        java.lang.Thread.sleep(r3);	 Catch:{ InterruptedException -> 0x003e }
        goto L_0x0040;
    L_0x003e:
        monitor-exit(r10);
        return;
    L_0x0040:
        r5 = r10.pingMyServer(r1);	 Catch:{ InterruptedException -> 0x0045, InterruptedException -> 0x0045 }
        goto L_0x005c;
    L_0x0045:
        r5 = move-exception;
        r6 = LOGGER;	 Catch:{ all -> 0x0089 }
        r7 = java.util.logging.Level.WARNING;	 Catch:{ all -> 0x0089 }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0089 }
        r9 = "Exception while pinging server of ";	 Catch:{ all -> 0x0089 }
        r8.<init>(r9);	 Catch:{ all -> 0x0089 }
        r8.append(r0);	 Catch:{ all -> 0x0089 }
        r8 = r8.toString();	 Catch:{ all -> 0x0089 }
        r6.log(r7, r8, r5);	 Catch:{ all -> 0x0089 }
        r5 = r1;	 Catch:{ all -> 0x0089 }
    L_0x005c:
        if (r5 != 0) goto L_0x0061;	 Catch:{ all -> 0x0089 }
    L_0x005e:
        r2 = r2 + 1;	 Catch:{ all -> 0x0089 }
        goto L_0x0035;	 Catch:{ all -> 0x0089 }
    L_0x0061:
        if (r5 != 0) goto L_0x007b;	 Catch:{ all -> 0x0089 }
    L_0x0063:
        r0 = r10.pingFailedListeners;	 Catch:{ all -> 0x0089 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0089 }
    L_0x0069:
        r1 = r0.hasNext();	 Catch:{ all -> 0x0089 }
        if (r1 == 0) goto L_0x0079;	 Catch:{ all -> 0x0089 }
    L_0x006f:
        r1 = r0.next();	 Catch:{ all -> 0x0089 }
        r1 = (org.jivesoftware.smackx.ping.PingFailedListener) r1;	 Catch:{ all -> 0x0089 }
        r1.pingFailed();	 Catch:{ all -> 0x0089 }
        goto L_0x0069;
    L_0x0079:
        monitor-exit(r10);
        return;
    L_0x007b:
        r10.maybeSchedulePingServerTask();	 Catch:{ all -> 0x0089 }
        monitor-exit(r10);
        return;
    L_0x0080:
        r0 = LOGGER;	 Catch:{ all -> 0x0089 }
        r1 = "XMPPConnection was not authenticated";	 Catch:{ all -> 0x0089 }
        r0.warning(r1);	 Catch:{ all -> 0x0089 }
        monitor-exit(r10);
        return;
    L_0x0089:
        r0 = move-exception;
        monitor-exit(r10);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.ping.PingManager.pingServerIfNecessary():void");
    }

    public final void registerPingFailedListener(PingFailedListener pingFailedListener) {
        this.pingFailedListeners.add(pingFailedListener);
    }

    public final void setPingInterval(int i) {
        this.pingInterval = i;
        maybeSchedulePingServerTask();
    }

    public final void unregisterPingFailedListener(PingFailedListener pingFailedListener) {
        this.pingFailedListeners.remove(pingFailedListener);
    }
}
