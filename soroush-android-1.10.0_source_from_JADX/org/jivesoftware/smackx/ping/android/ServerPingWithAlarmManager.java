package org.jivesoftware.smackx.ping.android;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Logger;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.util.Async;
import org.jivesoftware.smackx.ping.PingManager;

public final class ServerPingWithAlarmManager extends Manager {
    private static final BroadcastReceiver ALARM_BROADCAST_RECEIVER = new C78022();
    private static final Map<XMPPConnection, ServerPingWithAlarmManager> INSTANCES = new WeakHashMap();
    private static final Logger LOGGER = Logger.getLogger(ServerPingWithAlarmManager.class.getName());
    private static final String PING_ALARM_ACTION = "org.igniterealtime.smackx.ping.ACTION";
    private static AlarmManager sAlarmManager;
    private static Context sContext;
    private static PendingIntent sPendingIntent;
    private boolean mEnabled = true;

    static class C78022 extends BroadcastReceiver {
        C78022() {
        }

        public final void onReceive(Context context, Intent intent) {
            ServerPingWithAlarmManager.LOGGER.fine("Ping Alarm broadcast received");
            synchronized (ServerPingWithAlarmManager.class) {
                Set<Entry> hashSet = new HashSet(ServerPingWithAlarmManager.INSTANCES.entrySet());
            }
            for (Entry entry : hashSet) {
                XMPPConnection xMPPConnection = (XMPPConnection) entry.getKey();
                Logger access$000;
                StringBuilder stringBuilder;
                if (((ServerPingWithAlarmManager) entry.getValue()).isEnabled()) {
                    access$000 = ServerPingWithAlarmManager.LOGGER;
                    stringBuilder = new StringBuilder("Calling pingServerIfNecessary for connection ");
                    stringBuilder.append(xMPPConnection);
                    access$000.fine(stringBuilder.toString());
                    final PingManager instanceFor = PingManager.getInstanceFor(xMPPConnection);
                    Runnable c78011 = new Runnable() {
                        public void run() {
                            instanceFor.pingServerIfNecessary();
                        }
                    };
                    StringBuilder stringBuilder2 = new StringBuilder("PingServerIfNecessary (");
                    stringBuilder2.append(xMPPConnection.getConnectionCounter());
                    stringBuilder2.append(')');
                    Async.go(c78011, stringBuilder2.toString());
                } else {
                    access$000 = ServerPingWithAlarmManager.LOGGER;
                    stringBuilder = new StringBuilder("NOT calling pingServerIfNecessary (disabled) on connection ");
                    stringBuilder.append(xMPPConnection.getConnectionCounter());
                    access$000.fine(stringBuilder.toString());
                }
            }
        }
    }

    static class C79511 implements ConnectionCreationListener {
        C79511() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            ServerPingWithAlarmManager.getInstanceFor(xMPPConnection);
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79511());
    }

    private ServerPingWithAlarmManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
    }

    public static synchronized ServerPingWithAlarmManager getInstanceFor(XMPPConnection xMPPConnection) {
        ServerPingWithAlarmManager serverPingWithAlarmManager;
        synchronized (ServerPingWithAlarmManager.class) {
            serverPingWithAlarmManager = (ServerPingWithAlarmManager) INSTANCES.get(xMPPConnection);
            if (serverPingWithAlarmManager == null) {
                serverPingWithAlarmManager = new ServerPingWithAlarmManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, serverPingWithAlarmManager);
            }
        }
        return serverPingWithAlarmManager;
    }

    public static void onCreate(Context context) {
        sContext = context;
        context.registerReceiver(ALARM_BROADCAST_RECEIVER, new IntentFilter(PING_ALARM_ACTION));
        sAlarmManager = (AlarmManager) context.getSystemService("alarm");
        sPendingIntent = PendingIntent.getBroadcast(context, 0, new Intent(PING_ALARM_ACTION), 0);
        sAlarmManager.setInexactRepeating(2, SystemClock.elapsedRealtime() + 1800000, 1800000, sPendingIntent);
    }

    public static void onDestroy() {
        sContext.unregisterReceiver(ALARM_BROADCAST_RECEIVER);
        sAlarmManager.cancel(sPendingIntent);
    }

    public final boolean isEnabled() {
        return this.mEnabled;
    }

    public final void setEnabled(boolean z) {
        this.mEnabled = z;
    }
}
