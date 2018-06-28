package org.jivesoftware.smack;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.XMPPException.StreamErrorException;
import org.jivesoftware.smack.packet.StreamError.Condition;
import org.jivesoftware.smack.util.Async;

public final class ReconnectionManager {
    private static final Map<AbstractXMPPConnection, ReconnectionManager> INSTANCES = new WeakHashMap();
    private static final Logger LOGGER = Logger.getLogger(ReconnectionManager.class.getName());
    private static int defaultFixedDelay = 15;
    private static ReconnectionPolicy defaultReconnectionPolicy = ReconnectionPolicy.RANDOM_INCREASING_DELAY;
    private static boolean enabledPerDefault = false;
    private boolean automaticReconnectEnabled = false;
    private final ConnectionListener connectionListener = new C80003();
    boolean done = false;
    private volatile int fixedDelay = defaultFixedDelay;
    private final int randomBase = (new Random().nextInt(13) + 2);
    private volatile ReconnectionPolicy reconnectionPolicy = defaultReconnectionPolicy;
    private final Runnable reconnectionRunnable;
    private Thread reconnectionThread;
    private final WeakReference<AbstractXMPPConnection> weakRefConnection;

    class C77342 extends Thread {
        private int attempts = 0;

        C77342() {
        }

        private int timeDelay() {
            this.attempts++;
            switch (ReconnectionManager.this.reconnectionPolicy) {
                case FIXED_DELAY:
                    return ReconnectionManager.this.fixedDelay;
                case RANDOM_INCREASING_DELAY:
                    return this.attempts > 13 ? (ReconnectionManager.this.randomBase * 6) * 5 : this.attempts > 7 ? ReconnectionManager.this.randomBase * 6 : ReconnectionManager.this.randomBase;
                default:
                    StringBuilder stringBuilder = new StringBuilder("Unknown reconnection policy ");
                    stringBuilder.append(ReconnectionManager.this.reconnectionPolicy);
                    throw new AssertionError(stringBuilder.toString());
            }
        }

        public void run() {
            AbstractXMPPConnection abstractXMPPConnection = (AbstractXMPPConnection) ReconnectionManager.this.weakRefConnection.get();
            if (abstractXMPPConnection != null) {
                while (ReconnectionManager.this.isReconnectionPossible(abstractXMPPConnection)) {
                    int timeDelay = timeDelay();
                    while (ReconnectionManager.this.isReconnectionPossible(abstractXMPPConnection) && timeDelay > 0) {
                        try {
                            Thread.sleep(1000);
                            timeDelay--;
                            for (ConnectionListener reconnectingIn : abstractXMPPConnection.connectionListeners) {
                                reconnectingIn.reconnectingIn(timeDelay);
                            }
                        } catch (Throwable e) {
                            ReconnectionManager.LOGGER.log(Level.FINE, "waiting for reconnection interrupted", e);
                        }
                    }
                    for (ConnectionListener reconnectingIn2 : abstractXMPPConnection.connectionListeners) {
                        reconnectingIn2.reconnectingIn(0);
                    }
                    try {
                        if (ReconnectionManager.this.isReconnectionPossible(abstractXMPPConnection)) {
                            try {
                                abstractXMPPConnection.connect();
                            } catch (Throwable e2) {
                                ReconnectionManager.LOGGER.log(Level.FINER, "Connection was already connected on reconnection attempt", e2);
                            }
                        }
                        if (!abstractXMPPConnection.isAuthenticated()) {
                            abstractXMPPConnection.login();
                        }
                        this.attempts = 0;
                    } catch (Throwable e22) {
                        ReconnectionManager.LOGGER.log(Level.FINER, "Reconnection not required, was already logged in", e22);
                    } catch (Exception e3) {
                        for (ConnectionListener reconnectingIn3 : abstractXMPPConnection.connectionListeners) {
                            reconnectingIn3.reconnectionFailed(e3);
                        }
                    }
                }
            }
        }
    }

    public enum ReconnectionPolicy {
        RANDOM_INCREASING_DELAY,
        FIXED_DELAY
    }

    static class C78871 implements ConnectionCreationListener {
        C78871() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            if (xMPPConnection instanceof AbstractXMPPConnection) {
                ReconnectionManager.getInstanceFor((AbstractXMPPConnection) xMPPConnection);
            }
        }
    }

    class C80003 extends AbstractConnectionListener {
        C80003() {
        }

        public void authenticated(XMPPConnection xMPPConnection, boolean z) {
            ReconnectionManager.this.done = false;
        }

        public void connectionClosed() {
            ReconnectionManager.this.done = true;
        }

        public void connectionClosedOnError(Exception exception) {
            ReconnectionManager.this.done = false;
            if (ReconnectionManager.this.isAutomaticReconnectEnabled()) {
                if (exception instanceof StreamErrorException) {
                    if (Condition.conflict == ((StreamErrorException) exception).getStreamError().getCondition()) {
                        return;
                    }
                }
                ReconnectionManager.this.reconnect();
            }
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C78871());
    }

    private ReconnectionManager(AbstractXMPPConnection abstractXMPPConnection) {
        this.weakRefConnection = new WeakReference(abstractXMPPConnection);
        this.reconnectionRunnable = new C77342();
        if (getEnabledPerDefault()) {
            enableAutomaticReconnection();
        }
    }

    public static boolean getEnabledPerDefault() {
        return enabledPerDefault;
    }

    public static synchronized ReconnectionManager getInstanceFor(AbstractXMPPConnection abstractXMPPConnection) {
        ReconnectionManager reconnectionManager;
        synchronized (ReconnectionManager.class) {
            reconnectionManager = (ReconnectionManager) INSTANCES.get(abstractXMPPConnection);
            if (reconnectionManager == null) {
                reconnectionManager = new ReconnectionManager(abstractXMPPConnection);
                INSTANCES.put(abstractXMPPConnection, reconnectionManager);
            }
        }
        return reconnectionManager;
    }

    private boolean isReconnectionPossible(XMPPConnection xMPPConnection) {
        return (this.done || xMPPConnection.isConnected() || !isAutomaticReconnectEnabled()) ? false : true;
    }

    private synchronized void reconnect() {
        XMPPConnection xMPPConnection = (XMPPConnection) this.weakRefConnection.get();
        if (xMPPConnection == null) {
            LOGGER.fine("Connection is null, will not reconnect");
        } else if (this.reconnectionThread == null || !this.reconnectionThread.isAlive()) {
            Runnable runnable = this.reconnectionRunnable;
            StringBuilder stringBuilder = new StringBuilder("Smack Reconnection Manager (");
            stringBuilder.append(xMPPConnection.getConnectionCounter());
            stringBuilder.append(')');
            this.reconnectionThread = Async.go(runnable, stringBuilder.toString());
        }
    }

    public static void setDefaultFixedDelay(int i) {
        defaultFixedDelay = i;
        setDefaultReconnectionPolicy(ReconnectionPolicy.FIXED_DELAY);
    }

    public static void setDefaultReconnectionPolicy(ReconnectionPolicy reconnectionPolicy) {
        defaultReconnectionPolicy = reconnectionPolicy;
    }

    public static void setEnabledPerDefault(boolean z) {
        enabledPerDefault = z;
    }

    public final synchronized void disableAutomaticReconnection() {
        if (this.automaticReconnectEnabled) {
            XMPPConnection xMPPConnection = (XMPPConnection) this.weakRefConnection.get();
            if (xMPPConnection == null) {
                throw new IllegalStateException("Connection instance no longer available");
            }
            xMPPConnection.removeConnectionListener(this.connectionListener);
            this.automaticReconnectEnabled = false;
        }
    }

    public final synchronized void enableAutomaticReconnection() {
        if (!this.automaticReconnectEnabled) {
            XMPPConnection xMPPConnection = (XMPPConnection) this.weakRefConnection.get();
            if (xMPPConnection == null) {
                throw new IllegalStateException("Connection instance no longer available");
            }
            xMPPConnection.addConnectionListener(this.connectionListener);
            this.automaticReconnectEnabled = true;
        }
    }

    public final boolean isAutomaticReconnectEnabled() {
        return this.automaticReconnectEnabled;
    }

    public final void setFixedDelay(int i) {
        this.fixedDelay = i;
        setReconnectionPolicy(ReconnectionPolicy.FIXED_DELAY);
    }

    public final void setReconnectionPolicy(ReconnectionPolicy reconnectionPolicy) {
        this.reconnectionPolicy = reconnectionPolicy;
    }
}
