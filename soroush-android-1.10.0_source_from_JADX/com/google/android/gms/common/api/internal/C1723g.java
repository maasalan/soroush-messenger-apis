package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.v4.p038g.C0464b;
import com.google.android.gms.common.C1771k;
import com.google.android.gms.common.C5458b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1712d;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class C1723g implements Callback {
    public static final Status f5258a = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status f5259e = new Status(4, "The user must be signed in to make this API call.");
    private static final Object f5260i = new Object();
    private static C1723g f5261j;
    public final AtomicInteger f5262b = new AtomicInteger(1);
    public final AtomicInteger f5263c = new AtomicInteger(0);
    public final Handler f5264d;
    private long f5265f = 5000;
    private long f5266g = 120000;
    private long f5267h = 10000;
    private final Context f5268k;
    private final C5458b f5269l;
    private int f5270m = -1;
    private final Map<aj<?>, C6575i<?>> f5271n = new ConcurrentHashMap(5, 0.75f, 1);
    private C6574d f5272o = null;
    private final Set<aj<?>> f5273p = new C0464b();
    private final Set<aj<?>> f5274q = new C0464b();

    private C1723g(Context context, Looper looper, C5458b c5458b) {
        this.f5268k = context;
        this.f5264d = new Handler(looper, this);
        this.f5269l = c5458b;
        this.f5264d.sendMessage(this.f5264d.obtainMessage(6));
    }

    public static C1723g m4333a(Context context) {
        C1723g c1723g;
        synchronized (f5260i) {
            if (f5261j == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f5261j = new C1723g(context.getApplicationContext(), handlerThread.getLooper(), C5458b.m11789a());
            }
            c1723g = f5261j;
        }
        return c1723g;
    }

    private final void m4334a(C1712d<?> c1712d) {
        aj ajVar = c1712d.f5224d;
        C6575i c6575i = (C6575i) this.f5271n.get(ajVar);
        if (c6575i == null) {
            c6575i = new C6575i(this, c1712d);
            this.f5271n.put(ajVar, c6575i);
        }
        if (c6575i.m15899k()) {
            this.f5274q.add(ajVar);
        }
        c6575i.m15898j();
    }

    private final void m4340d() {
        for (aj remove : this.f5274q) {
            ((C6575i) this.f5271n.remove(remove)).m15893e();
        }
        this.f5274q.clear();
    }

    public final void m4347a() {
        this.f5264d.sendMessage(this.f5264d.obtainMessage(3));
    }

    final boolean m4348a(ConnectionResult connectionResult, int i) {
        C1771k c1771k = this.f5269l;
        Context context = this.f5268k;
        PendingIntent a = connectionResult.m15869a() ? connectionResult.f17970c : c1771k.mo1558a(context, connectionResult.f17969b, 0);
        if (a == null) {
            return false;
        }
        c1771k.m11794a(context, connectionResult.f17969b, GoogleApiActivity.m4304a(context, a, i));
        return true;
    }

    public final void m4349b(ConnectionResult connectionResult, int i) {
        if (!m4348a(connectionResult, i)) {
            this.f5264d.sendMessage(this.f5264d.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r8) {
        /*
        r7 = this;
        r0 = r8.what;
        r1 = 300000; // 0x493e0 float:4.2039E-40 double:1.482197E-318;
        r3 = 0;
        r4 = 1;
        switch(r0) {
            case 1: goto L_0x0283;
            case 2: goto L_0x022e;
            case 3: goto L_0x0211;
            case 4: goto L_0x01cd;
            case 5: goto L_0x0144;
            case 6: goto L_0x00e5;
            case 7: goto L_0x00dd;
            case 8: goto L_0x01cd;
            case 9: goto L_0x00ba;
            case 10: goto L_0x00b6;
            case 11: goto L_0x006f;
            case 12: goto L_0x0025;
            case 13: goto L_0x01cd;
            default: goto L_0x000a;
        };
    L_0x000a:
        r0 = "GoogleApiManager";
        r8 = r8.what;
        r1 = 31;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r1);
        r1 = "Unknown message id: ";
        r2.append(r1);
        r2.append(r8);
        r8 = r2.toString();
        android.util.Log.w(r0, r8);
        return r3;
    L_0x0025:
        r0 = r7.f5271n;
        r1 = r8.obj;
        r0 = r0.containsKey(r1);
        if (r0 == 0) goto L_0x02bc;
    L_0x002f:
        r0 = r7.f5271n;
        r8 = r8.obj;
        r8 = r0.get(r8);
        r8 = (com.google.android.gms.common.api.internal.C6575i) r8;
        r0 = r8.f17996g;
        r0 = r0.f5264d;
        com.google.android.gms.common.internal.ac.m4380a(r0);
        r0 = r8.f17990a;
        r0 = r0.m11756b();
        if (r0 == 0) goto L_0x02bc;
    L_0x0048:
        r0 = r8.f17993d;
        r0 = r0.size();
        if (r0 != 0) goto L_0x02bc;
    L_0x0050:
        r0 = r8.f17991b;
        r1 = r0.f5256a;
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x0062;
    L_0x005a:
        r0 = r0.f5257b;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0063;
    L_0x0062:
        r3 = r4;
    L_0x0063:
        if (r3 == 0) goto L_0x0069;
    L_0x0065:
        r8.m15897i();
        return r4;
    L_0x0069:
        r8 = r8.f17990a;
        r8.m11752a();
        return r4;
    L_0x006f:
        r0 = r7.f5271n;
        r1 = r8.obj;
        r0 = r0.containsKey(r1);
        if (r0 == 0) goto L_0x02bc;
    L_0x0079:
        r0 = r7.f5271n;
        r8 = r8.obj;
        r8 = r0.get(r8);
        r8 = (com.google.android.gms.common.api.internal.C6575i) r8;
        r0 = r8.f17996g;
        r0 = r0.f5264d;
        com.google.android.gms.common.internal.ac.m4380a(r0);
        r0 = r8.f17995f;
        if (r0 == 0) goto L_0x02bc;
    L_0x008e:
        r8.m15896h();
        r0 = r8.f17996g;
        r0 = r0.f5269l;
        r1 = r8.f17996g;
        r1 = r1.f5268k;
        r0 = r0.mo1557a(r1);
        r1 = 18;
        r2 = 8;
        if (r0 != r1) goto L_0x00ab;
    L_0x00a3:
        r0 = new com.google.android.gms.common.api.Status;
        r1 = "Connection timed out while waiting for Google Play services update to complete.";
        r0.<init>(r2, r1);
        goto L_0x00b2;
    L_0x00ab:
        r0 = new com.google.android.gms.common.api.Status;
        r1 = "API failed to connect while resuming due to an unknown error.";
        r0.<init>(r2, r1);
    L_0x00b2:
        r8.m15888a(r0);
        goto L_0x0069;
    L_0x00b6:
        r7.m4340d();
        return r4;
    L_0x00ba:
        r0 = r7.f5271n;
        r1 = r8.obj;
        r0 = r0.containsKey(r1);
        if (r0 == 0) goto L_0x02bc;
    L_0x00c4:
        r0 = r7.f5271n;
        r8 = r8.obj;
        r8 = r0.get(r8);
        r8 = (com.google.android.gms.common.api.internal.C6575i) r8;
        r0 = r8.f17996g;
        r0 = r0.f5264d;
        com.google.android.gms.common.internal.ac.m4380a(r0);
        r0 = r8.f17995f;
        if (r0 == 0) goto L_0x02bc;
    L_0x00d9:
        r8.m15898j();
        return r4;
    L_0x00dd:
        r8 = r8.obj;
        r8 = (com.google.android.gms.common.api.C1712d) r8;
        r7.m4334a(r8);
        return r4;
    L_0x00e5:
        r8 = r7.f5268k;
        r8 = r8.getApplicationContext();
        r8 = r8 instanceof android.app.Application;
        if (r8 == 0) goto L_0x02bc;
    L_0x00ef:
        r8 = r7.f5268k;
        r8 = r8.getApplicationContext();
        r8 = (android.app.Application) r8;
        com.google.android.gms.common.api.internal.al.m4326a(r8);
        r8 = com.google.android.gms.common.api.internal.al.m4325a();
        r0 = new com.google.android.gms.common.api.internal.h;
        r0.<init>(r7);
        r8.m4328a(r0);
        r8 = com.google.android.gms.common.api.internal.al.m4325a();
        r0 = r8.f5248b;
        r0 = r0.get();
        if (r0 != 0) goto L_0x0139;
    L_0x0112:
        r0 = android.os.Build.VERSION.SDK_INT;
        r5 = 16;
        if (r0 < r5) goto L_0x0119;
    L_0x0118:
        r3 = r4;
    L_0x0119:
        if (r3 == 0) goto L_0x0137;
    L_0x011b:
        r0 = new android.app.ActivityManager$RunningAppProcessInfo;
        r0.<init>();
        android.app.ActivityManager.getMyMemoryState(r0);
        r3 = r8.f5248b;
        r3 = r3.getAndSet(r4);
        if (r3 != 0) goto L_0x0139;
    L_0x012b:
        r0 = r0.importance;
        r3 = 100;
        if (r0 <= r3) goto L_0x0139;
    L_0x0131:
        r0 = r8.f5247a;
        r0.set(r4);
        goto L_0x0139;
    L_0x0137:
        r8 = r4;
        goto L_0x013f;
    L_0x0139:
        r8 = r8.f5247a;
        r8 = r8.get();
    L_0x013f:
        if (r8 != 0) goto L_0x02bc;
    L_0x0141:
        r7.f5267h = r1;
        return r4;
    L_0x0144:
        r0 = r8.arg1;
        r8 = r8.obj;
        r8 = (com.google.android.gms.common.ConnectionResult) r8;
        r1 = 0;
        r2 = r7.f5271n;
        r2 = r2.values();
        r2 = r2.iterator();
    L_0x0155:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0166;
    L_0x015b:
        r3 = r2.next();
        r3 = (com.google.android.gms.common.api.internal.C6575i) r3;
        r5 = r3.f17994e;
        if (r5 != r0) goto L_0x0155;
    L_0x0165:
        r1 = r3;
    L_0x0166:
        if (r1 == 0) goto L_0x01aa;
    L_0x0168:
        r0 = new com.google.android.gms.common.api.Status;
        r2 = 17;
        r3 = r7.f5269l;
        r5 = r8.f17969b;
        r3 = r3.mo1560b(r5);
        r8 = r8.f17971d;
        r5 = 69;
        r6 = java.lang.String.valueOf(r3);
        r6 = r6.length();
        r5 = r5 + r6;
        r6 = java.lang.String.valueOf(r8);
        r6 = r6.length();
        r5 = r5 + r6;
        r6 = new java.lang.StringBuilder;
        r6.<init>(r5);
        r5 = "Error resolution was canceled by the user, original error message: ";
        r6.append(r5);
        r6.append(r3);
        r3 = ": ";
        r6.append(r3);
        r6.append(r8);
        r8 = r6.toString();
        r0.<init>(r2, r8);
        r1.m15888a(r0);
        return r4;
    L_0x01aa:
        r8 = "GoogleApiManager";
        r1 = 76;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r1);
        r1 = "Could not find API instance ";
        r2.append(r1);
        r2.append(r0);
        r0 = " while trying to fail enqueued calls.";
        r2.append(r0);
        r0 = r2.toString();
        r1 = new java.lang.Exception;
        r1.<init>();
        android.util.Log.wtf(r8, r0, r1);
        return r4;
    L_0x01cd:
        r8 = r8.obj;
        r8 = (com.google.android.gms.common.api.internal.C1735y) r8;
        r0 = r7.f5271n;
        r1 = r8.f5293c;
        r1 = r1.f5224d;
        r0 = r0.get(r1);
        r0 = (com.google.android.gms.common.api.internal.C6575i) r0;
        if (r0 != 0) goto L_0x01f0;
    L_0x01df:
        r0 = r8.f5293c;
        r7.m4334a(r0);
        r0 = r7.f5271n;
        r1 = r8.f5293c;
        r1 = r1.f5224d;
        r0 = r0.get(r1);
        r0 = (com.google.android.gms.common.api.internal.C6575i) r0;
    L_0x01f0:
        r1 = r0.m15899k();
        if (r1 == 0) goto L_0x020b;
    L_0x01f6:
        r1 = r7.f5263c;
        r1 = r1.get();
        r2 = r8.f5292b;
        if (r1 == r2) goto L_0x020b;
    L_0x0200:
        r8 = r8.f5291a;
        r1 = f5258a;
        r8.mo1549a(r1);
        r0.m15893e();
        return r4;
    L_0x020b:
        r8 = r8.f5291a;
        r0.m15889a(r8);
        return r4;
    L_0x0211:
        r8 = r7.f5271n;
        r8 = r8.values();
        r8 = r8.iterator();
    L_0x021b:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x02bc;
    L_0x0221:
        r0 = r8.next();
        r0 = (com.google.android.gms.common.api.internal.C6575i) r0;
        r0.m15894f();
        r0.m15898j();
        goto L_0x021b;
    L_0x022e:
        r8 = r8.obj;
        r8 = (com.google.android.gms.common.api.internal.ak) r8;
        r0 = r8.f5242a;
        r0 = r0.keySet();
        r0 = r0.iterator();
    L_0x023c:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x02bc;
    L_0x0242:
        r1 = r0.next();
        r1 = (com.google.android.gms.common.api.internal.aj) r1;
        r2 = r7.f5271n;
        r2 = r2.get(r1);
        r2 = (com.google.android.gms.common.api.internal.C6575i) r2;
        if (r2 != 0) goto L_0x025d;
    L_0x0252:
        r0 = new com.google.android.gms.common.ConnectionResult;
        r2 = 13;
        r0.<init>(r2);
        r8.m4324a(r1, r0);
        return r4;
    L_0x025d:
        r3 = r2.f17990a;
        r3 = r3.m11756b();
        if (r3 == 0) goto L_0x026b;
    L_0x0265:
        r2 = com.google.android.gms.common.ConnectionResult.f17968a;
    L_0x0267:
        r8.m4324a(r1, r2);
        goto L_0x023c;
    L_0x026b:
        r3 = r2.m15895g();
        if (r3 == 0) goto L_0x0276;
    L_0x0271:
        r2 = r2.m15895g();
        goto L_0x0267;
    L_0x0276:
        r1 = r2.f17996g;
        r1 = r1.f5264d;
        com.google.android.gms.common.internal.ac.m4380a(r1);
        r1 = r2.f17992c;
        r1.add(r8);
        goto L_0x023c;
    L_0x0283:
        r8 = r8.obj;
        r8 = (java.lang.Boolean) r8;
        r8 = r8.booleanValue();
        if (r8 == 0) goto L_0x028f;
    L_0x028d:
        r1 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
    L_0x028f:
        r7.f5267h = r1;
        r8 = r7.f5264d;
        r0 = 12;
        r8.removeMessages(r0);
        r8 = r7.f5271n;
        r8 = r8.keySet();
        r8 = r8.iterator();
    L_0x02a2:
        r1 = r8.hasNext();
        if (r1 == 0) goto L_0x02bc;
    L_0x02a8:
        r1 = r8.next();
        r1 = (com.google.android.gms.common.api.internal.aj) r1;
        r2 = r7.f5264d;
        r3 = r7.f5264d;
        r1 = r3.obtainMessage(r0, r1);
        r5 = r7.f5267h;
        r2.sendMessageDelayed(r1, r5);
        goto L_0x02a2;
    L_0x02bc:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.g.handleMessage(android.os.Message):boolean");
    }
}
