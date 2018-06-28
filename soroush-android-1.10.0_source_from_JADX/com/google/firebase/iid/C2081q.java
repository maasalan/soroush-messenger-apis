package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.stats.C1775a;
import java.util.LinkedList;
import java.util.Queue;

final class C2081q implements ServiceConnection {
    int f7007a;
    final Messenger f7008b;
    C2086v f7009c;
    final Queue<C2087x<?>> f7010d;
    final SparseArray<C2087x<?>> f7011e;
    final /* synthetic */ C2080p f7012f;

    private C2081q(C2080p c2080p) {
        this.f7012f = c2080p;
        this.f7007a = 0;
        this.f7008b = new Messenger(new Handler(Looper.getMainLooper(), new C2082r(this)));
        this.f7010d = new LinkedList();
        this.f7011e = new SparseArray();
    }

    private final void m5681a(C2088y c2088y) {
        for (C2087x a : this.f7010d) {
            a.m5690a(c2088y);
        }
        this.f7010d.clear();
        for (int i = 0; i < this.f7011e.size(); i++) {
            ((C2087x) this.f7011e.valueAt(i)).m5690a(c2088y);
        }
        this.f7011e.clear();
    }

    private final void m5682c() {
        this.f7012f.f7004b.execute(new C2084t(this));
    }

    final synchronized void m5683a() {
        if (this.f7007a == 2 && this.f7010d.isEmpty() && this.f7011e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f7007a = 3;
            C1775a.m4485a();
            this.f7012f.f7003a.unbindService(this);
        }
    }

    final synchronized void m5684a(int i) {
        C2087x c2087x = (C2087x) this.f7011e.get(i);
        if (c2087x != null) {
            StringBuilder stringBuilder = new StringBuilder(31);
            stringBuilder.append("Timing out request: ");
            stringBuilder.append(i);
            Log.w("MessengerIpcClient", stringBuilder.toString());
            this.f7011e.remove(i);
            c2087x.m5690a(new C2088y(3, "Timed out waiting for response"));
            m5683a();
        }
    }

    final synchronized void m5685a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String str2 = "MessengerIpcClient";
            String str3 = "Disconnected: ";
            String valueOf = String.valueOf(str);
            Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        switch (this.f7007a) {
            case 0:
                throw new IllegalStateException();
            case 1:
            case 2:
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f7007a = 4;
                C1775a.m4485a();
                this.f7012f.f7003a.unbindService(this);
                m5681a(new C2088y(i, str));
                return;
            case 3:
                this.f7007a = 4;
                return;
            case 4:
                return;
            default:
                int i2 = this.f7007a;
                StringBuilder stringBuilder = new StringBuilder(26);
                stringBuilder.append("Unknown state: ");
                stringBuilder.append(i2);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final boolean m5686a(android.os.Message r5) {
        /*
        r4 = this;
        r0 = r5.arg1;
        r1 = "MessengerIpcClient";
        r2 = 3;
        r1 = android.util.Log.isLoggable(r1, r2);
        if (r1 == 0) goto L_0x0023;
    L_0x000b:
        r1 = "MessengerIpcClient";
        r2 = 41;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Received response to request: ";
        r3.append(r2);
        r3.append(r0);
        r2 = r3.toString();
        android.util.Log.d(r1, r2);
    L_0x0023:
        monitor-enter(r4);
        r1 = r4.f7011e;	 Catch:{ all -> 0x006f }
        r1 = r1.get(r0);	 Catch:{ all -> 0x006f }
        r1 = (com.google.firebase.iid.C2087x) r1;	 Catch:{ all -> 0x006f }
        r2 = 1;
        if (r1 != 0) goto L_0x0049;
    L_0x002f:
        r5 = "MessengerIpcClient";
        r1 = 50;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x006f }
        r3.<init>(r1);	 Catch:{ all -> 0x006f }
        r1 = "Received response for unknown request: ";
        r3.append(r1);	 Catch:{ all -> 0x006f }
        r3.append(r0);	 Catch:{ all -> 0x006f }
        r0 = r3.toString();	 Catch:{ all -> 0x006f }
        android.util.Log.w(r5, r0);	 Catch:{ all -> 0x006f }
        monitor-exit(r4);	 Catch:{ all -> 0x006f }
        return r2;
    L_0x0049:
        r3 = r4.f7011e;	 Catch:{ all -> 0x006f }
        r3.remove(r0);	 Catch:{ all -> 0x006f }
        r4.m5683a();	 Catch:{ all -> 0x006f }
        monitor-exit(r4);	 Catch:{ all -> 0x006f }
        r5 = r5.getData();
        r0 = "unsupported";
        r3 = 0;
        r0 = r5.getBoolean(r0, r3);
        if (r0 == 0) goto L_0x006b;
    L_0x005f:
        r5 = new com.google.firebase.iid.y;
        r0 = 4;
        r3 = "Not supported by GmsCore";
        r5.<init>(r0, r3);
        r1.m5690a(r5);
        return r2;
    L_0x006b:
        r1.mo1779a(r5);
        return r2;
    L_0x006f:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x006f }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.q.a(android.os.Message):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final synchronized boolean m5687a(com.google.firebase.iid.C2087x r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.f7007a;	 Catch:{ all -> 0x0089 }
        r1 = 0;
        r2 = 1;
        switch(r0) {
            case 0: goto L_0x001e;
            case 1: goto L_0x0017;
            case 2: goto L_0x000d;
            case 3: goto L_0x000b;
            case 4: goto L_0x000b;
            default: goto L_0x0008;
        };	 Catch:{ all -> 0x0089 }
    L_0x0008:
        r6 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0089 }
        goto L_0x0070;
    L_0x000b:
        monitor-exit(r5);
        return r1;
    L_0x000d:
        r0 = r5.f7010d;	 Catch:{ all -> 0x0089 }
        r0.add(r6);	 Catch:{ all -> 0x0089 }
        r5.m5682c();	 Catch:{ all -> 0x0089 }
        monitor-exit(r5);
        return r2;
    L_0x0017:
        r0 = r5.f7010d;	 Catch:{ all -> 0x0089 }
        r0.add(r6);	 Catch:{ all -> 0x0089 }
        monitor-exit(r5);
        return r2;
    L_0x001e:
        r0 = r5.f7010d;	 Catch:{ all -> 0x0089 }
        r0.add(r6);	 Catch:{ all -> 0x0089 }
        r6 = r5.f7007a;	 Catch:{ all -> 0x0089 }
        if (r6 != 0) goto L_0x0029;
    L_0x0027:
        r6 = r2;
        goto L_0x002a;
    L_0x0029:
        r6 = r1;
    L_0x002a:
        com.google.android.gms.common.internal.ac.m4381a(r6);	 Catch:{ all -> 0x0089 }
        r6 = "MessengerIpcClient";
        r0 = 2;
        r6 = android.util.Log.isLoggable(r6, r0);	 Catch:{ all -> 0x0089 }
        if (r6 == 0) goto L_0x003d;
    L_0x0036:
        r6 = "MessengerIpcClient";
        r0 = "Starting bind to GmsCore";
        android.util.Log.v(r6, r0);	 Catch:{ all -> 0x0089 }
    L_0x003d:
        r5.f7007a = r2;	 Catch:{ all -> 0x0089 }
        r6 = new android.content.Intent;	 Catch:{ all -> 0x0089 }
        r0 = "com.google.android.c2dm.intent.REGISTER";
        r6.<init>(r0);	 Catch:{ all -> 0x0089 }
        r0 = "com.google.android.gms";
        r6.setPackage(r0);	 Catch:{ all -> 0x0089 }
        com.google.android.gms.common.stats.C1775a.m4485a();	 Catch:{ all -> 0x0089 }
        r0 = r5.f7012f;	 Catch:{ all -> 0x0089 }
        r0 = r0.f7003a;	 Catch:{ all -> 0x0089 }
        r6 = com.google.android.gms.common.stats.C1775a.m4487b(r0, r6, r5, r2);	 Catch:{ all -> 0x0089 }
        if (r6 != 0) goto L_0x005e;
    L_0x0058:
        r6 = "Unable to bind to service";
        r5.m5685a(r1, r6);	 Catch:{ all -> 0x0089 }
        goto L_0x006e;
    L_0x005e:
        r6 = r5.f7012f;	 Catch:{ all -> 0x0089 }
        r6 = r6.f7004b;	 Catch:{ all -> 0x0089 }
        r0 = new com.google.firebase.iid.s;	 Catch:{ all -> 0x0089 }
        r0.<init>(r5);	 Catch:{ all -> 0x0089 }
        r3 = 30;
        r1 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x0089 }
        r6.schedule(r0, r3, r1);	 Catch:{ all -> 0x0089 }
    L_0x006e:
        monitor-exit(r5);
        return r2;
    L_0x0070:
        r0 = r5.f7007a;	 Catch:{ all -> 0x0089 }
        r1 = 26;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0089 }
        r2.<init>(r1);	 Catch:{ all -> 0x0089 }
        r1 = "Unknown state: ";
        r2.append(r1);	 Catch:{ all -> 0x0089 }
        r2.append(r0);	 Catch:{ all -> 0x0089 }
        r0 = r2.toString();	 Catch:{ all -> 0x0089 }
        r6.<init>(r0);	 Catch:{ all -> 0x0089 }
        throw r6;	 Catch:{ all -> 0x0089 }
    L_0x0089:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.q.a(com.google.firebase.iid.x):boolean");
    }

    final synchronized void m5688b() {
        if (this.f7007a == 1) {
            m5685a(1, "Timed out while binding");
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            m5685a(0, "Null service connection");
            return;
        }
        try {
            this.f7009c = new C2086v(iBinder);
            this.f7007a = 2;
            m5682c();
        } catch (RemoteException e) {
            m5685a(0, e.getMessage());
        }
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        m5685a(2, "Service disconnected");
    }
}
