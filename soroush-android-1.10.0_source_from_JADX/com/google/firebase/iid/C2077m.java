package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class C2077m implements ServiceConnection {
    private final Context f6987a;
    private final Intent f6988b;
    private final ScheduledExecutorService f6989c;
    private final Queue<C2073i> f6990d;
    private C2075k f6991e;
    private boolean f6992f;

    public C2077m(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0));
    }

    private C2077m(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f6990d = new LinkedList();
        this.f6992f = false;
        this.f6987a = context.getApplicationContext();
        this.f6988b = new Intent(str).setPackage(this.f6987a.getPackageName());
        this.f6989c = scheduledExecutorService;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m5665a() {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = "EnhancedIntentService";
        r1 = 3;
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00fc }
        if (r0 == 0) goto L_0x0011;
    L_0x000a:
        r0 = "EnhancedIntentService";
        r2 = "flush queue called";
        android.util.Log.d(r0, r2);	 Catch:{ all -> 0x00fc }
    L_0x0011:
        r0 = r5.f6990d;	 Catch:{ all -> 0x00fc }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00fc }
        if (r0 != 0) goto L_0x00fa;
    L_0x0019:
        r0 = "EnhancedIntentService";
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00fc }
        if (r0 == 0) goto L_0x0028;
    L_0x0021:
        r0 = "EnhancedIntentService";
        r2 = "found intent to be delivered";
        android.util.Log.d(r0, r2);	 Catch:{ all -> 0x00fc }
    L_0x0028:
        r0 = r5.f6991e;	 Catch:{ all -> 0x00fc }
        if (r0 == 0) goto L_0x0099;
    L_0x002c:
        r0 = r5.f6991e;	 Catch:{ all -> 0x00fc }
        r0 = r0.isBinderAlive();	 Catch:{ all -> 0x00fc }
        if (r0 == 0) goto L_0x0099;
    L_0x0034:
        r0 = "EnhancedIntentService";
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00fc }
        if (r0 == 0) goto L_0x0043;
    L_0x003c:
        r0 = "EnhancedIntentService";
        r2 = "binder is alive, sending the intent.";
        android.util.Log.d(r0, r2);	 Catch:{ all -> 0x00fc }
    L_0x0043:
        r0 = r5.f6990d;	 Catch:{ all -> 0x00fc }
        r0 = r0.poll();	 Catch:{ all -> 0x00fc }
        r0 = (com.google.firebase.iid.C2073i) r0;	 Catch:{ all -> 0x00fc }
        r2 = r5.f6991e;	 Catch:{ all -> 0x00fc }
        r3 = android.os.Binder.getCallingUid();	 Catch:{ all -> 0x00fc }
        r4 = android.os.Process.myUid();	 Catch:{ all -> 0x00fc }
        if (r3 == r4) goto L_0x005f;
    L_0x0057:
        r0 = new java.lang.SecurityException;	 Catch:{ all -> 0x00fc }
        r1 = "Binding only allowed within app";
        r0.<init>(r1);	 Catch:{ all -> 0x00fc }
        throw r0;	 Catch:{ all -> 0x00fc }
    L_0x005f:
        r3 = "EnhancedIntentService";
        r3 = android.util.Log.isLoggable(r3, r1);	 Catch:{ all -> 0x00fc }
        if (r3 == 0) goto L_0x006e;
    L_0x0067:
        r3 = "EnhancedIntentService";
        r4 = "service received new intent via bind strategy";
        android.util.Log.d(r3, r4);	 Catch:{ all -> 0x00fc }
    L_0x006e:
        r3 = r2.f6984a;	 Catch:{ all -> 0x00fc }
        r4 = r0.f6978a;	 Catch:{ all -> 0x00fc }
        r3 = r3.mo1781c(r4);	 Catch:{ all -> 0x00fc }
        if (r3 == 0) goto L_0x007c;
    L_0x0078:
        r0.m5663a();	 Catch:{ all -> 0x00fc }
        goto L_0x0011;
    L_0x007c:
        r3 = "EnhancedIntentService";
        r3 = android.util.Log.isLoggable(r3, r1);	 Catch:{ all -> 0x00fc }
        if (r3 == 0) goto L_0x008b;
    L_0x0084:
        r3 = "EnhancedIntentService";
        r4 = "intent being queued for bg execution";
        android.util.Log.d(r3, r4);	 Catch:{ all -> 0x00fc }
    L_0x008b:
        r3 = r2.f6984a;	 Catch:{ all -> 0x00fc }
        r3 = r3.f6970a;	 Catch:{ all -> 0x00fc }
        r4 = new com.google.firebase.iid.l;	 Catch:{ all -> 0x00fc }
        r4.<init>(r2, r0);	 Catch:{ all -> 0x00fc }
        r3.execute(r4);	 Catch:{ all -> 0x00fc }
        goto L_0x0011;
    L_0x0099:
        r0 = "EnhancedIntentService";
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00fc }
        r1 = 1;
        if (r0 == 0) goto L_0x00bd;
    L_0x00a2:
        r0 = "EnhancedIntentService";
        r2 = r5.f6992f;	 Catch:{ all -> 0x00fc }
        r2 = r2 ^ r1;
        r3 = 39;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00fc }
        r4.<init>(r3);	 Catch:{ all -> 0x00fc }
        r3 = "binder is dead. start connection? ";
        r4.append(r3);	 Catch:{ all -> 0x00fc }
        r4.append(r2);	 Catch:{ all -> 0x00fc }
        r2 = r4.toString();	 Catch:{ all -> 0x00fc }
        android.util.Log.d(r0, r2);	 Catch:{ all -> 0x00fc }
    L_0x00bd:
        r0 = r5.f6992f;	 Catch:{ all -> 0x00fc }
        if (r0 != 0) goto L_0x00f8;
    L_0x00c1:
        r5.f6992f = r1;	 Catch:{ all -> 0x00fc }
        com.google.android.gms.common.stats.C1775a.m4485a();	 Catch:{ SecurityException -> 0x00dc }
        r0 = r5.f6987a;	 Catch:{ SecurityException -> 0x00dc }
        r1 = r5.f6988b;	 Catch:{ SecurityException -> 0x00dc }
        r2 = 65;
        r0 = com.google.android.gms.common.stats.C1775a.m4487b(r0, r1, r5, r2);	 Catch:{ SecurityException -> 0x00dc }
        if (r0 == 0) goto L_0x00d4;
    L_0x00d2:
        monitor-exit(r5);
        return;
    L_0x00d4:
        r0 = "EnhancedIntentService";
        r1 = "binding to the service failed";
        android.util.Log.e(r0, r1);	 Catch:{ SecurityException -> 0x00dc }
        goto L_0x00e4;
    L_0x00dc:
        r0 = move-exception;
        r1 = "EnhancedIntentService";
        r2 = "Exception while binding the service";
        android.util.Log.e(r1, r2, r0);	 Catch:{ all -> 0x00fc }
    L_0x00e4:
        r0 = r5.f6990d;	 Catch:{ all -> 0x00fc }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00fc }
        if (r0 != 0) goto L_0x00f8;
    L_0x00ec:
        r0 = r5.f6990d;	 Catch:{ all -> 0x00fc }
        r0 = r0.poll();	 Catch:{ all -> 0x00fc }
        r0 = (com.google.firebase.iid.C2073i) r0;	 Catch:{ all -> 0x00fc }
        r0.m5663a();	 Catch:{ all -> 0x00fc }
        goto L_0x00e4;
    L_0x00f8:
        monitor-exit(r5);
        return;
    L_0x00fa:
        monitor-exit(r5);
        return;
    L_0x00fc:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.m.a():void");
    }

    public final synchronized void m5666a(Intent intent, PendingResult pendingResult) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
        }
        this.f6990d.add(new C2073i(intent, pendingResult, this.f6989c));
        m5665a();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f6992f = false;
            this.f6991e = (C2075k) iBinder;
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                String valueOf = String.valueOf(componentName);
                StringBuilder stringBuilder = new StringBuilder(20 + String.valueOf(valueOf).length());
                stringBuilder.append("onServiceConnected: ");
                stringBuilder.append(valueOf);
                Log.d("EnhancedIntentService", stringBuilder.toString());
            }
            m5665a();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder stringBuilder = new StringBuilder(23 + String.valueOf(valueOf).length());
            stringBuilder.append("onServiceDisconnected: ");
            stringBuilder.append(valueOf);
            Log.d("EnhancedIntentService", stringBuilder.toString());
        }
        m5665a();
    }
}
