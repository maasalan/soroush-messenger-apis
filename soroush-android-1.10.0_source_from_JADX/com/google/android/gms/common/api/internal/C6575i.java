package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1708a;
import com.google.android.gms.common.api.C1708a.C1704a;
import com.google.android.gms.common.api.C1708a.C1705c;
import com.google.android.gms.common.api.C1708a.C5446f;
import com.google.android.gms.common.api.C1712d;
import com.google.android.gms.common.api.C1715e.C1713a;
import com.google.android.gms.common.api.C1715e.C1714b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.internal.ag;
import com.google.android.gms.common.internal.ao;
import com.google.android.gms.common.internal.aw;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.internal.lm;
import com.google.android.gms.p160b.C1693e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class C6575i<O extends C1704a> implements C1713a, C1714b, aw {
    final C5446f f17990a;
    final C1722b f17991b;
    final Set<ak> f17992c = new HashSet();
    final Map<C1734x<?>, aa> f17993d = new HashMap();
    final int f17994e;
    boolean f17995f;
    final /* synthetic */ C1723g f17996g;
    private final Queue<C1721a> f17997h = new LinkedList();
    private final C1705c f17998i;
    private final aj<O> f17999j;
    private final ab f18000k;
    private ConnectionResult f18001l = null;

    public C6575i(C1723g c1723g, C1712d<O> c1712d) {
        this.f17996g = c1723g;
        Looper looper = c1723g.f5264d.getLooper();
        ax a = c1712d.m4307a();
        a.f5388c = c1712d.f5221a.getPackageName();
        a.f5389d = c1712d.f5221a.getClass().getName();
        aw a2 = a.m4436a();
        C1708a c1708a = c1712d.f5222b;
        ac.m4382a(c1708a.f5211a != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        this.f17990a = c1708a.f5211a.mo3026a(c1712d.f5221a, looper, a2, c1712d.f5223c, this, this);
        this.f17998i = this.f17990a instanceof ag ? ag.m18790j() : this.f17990a;
        this.f17999j = c1712d.f5224d;
        this.f17991b = new C1722b();
        this.f17994e = c1712d.f5226f;
        if (this.f17990a.mo3413d()) {
            this.f18000k = new ab(c1723g.f5268k, c1723g.f5264d, c1712d.m4307a().m4436a());
        } else {
            this.f18000k = null;
        }
    }

    private final void m15884b(ConnectionResult connectionResult) {
        for (ak a : this.f17992c) {
            a.m4324a(this.f17999j, connectionResult);
        }
        this.f17992c.clear();
    }

    private final void m15885b(com.google.android.gms.common.api.internal.C1721a r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r2 = this;
        r0 = r2.f17991b;
        r1 = r2.m15899k();
        r3.mo1550a(r0, r1);
        r3.mo1551a(r2);	 Catch:{ DeadObjectException -> 0x000d }
        return;
    L_0x000d:
        r2.mo3014b();
        r3 = r2.f17990a;
        r3.m11752a();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.i.b(com.google.android.gms.common.api.internal.a):void");
    }

    public final void mo3012a() {
        if (Looper.myLooper() == this.f17996g.f5264d.getLooper()) {
            m15891c();
        } else {
            this.f17996g.f5264d.post(new C1724j(this));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3013a(com.google.android.gms.common.ConnectionResult r5) {
        /*
        r4 = this;
        r0 = r4.f17996g;
        r0 = r0.f5264d;
        com.google.android.gms.common.internal.ac.m4380a(r0);
        r0 = r4.f18000k;
        if (r0 == 0) goto L_0x0018;
    L_0x000d:
        r0 = r4.f18000k;
        r1 = r0.f20368e;
        if (r1 == 0) goto L_0x0018;
    L_0x0013:
        r0 = r0.f20368e;
        r0.m11752a();
    L_0x0018:
        r4.m15894f();
        r0 = r4.f17996g;
        r1 = -1;
        r0.f5270m = r1;
        r4.m15884b(r5);
        r0 = r5.f17969b;
        r1 = 4;
        if (r0 != r1) goto L_0x0031;
    L_0x0029:
        r5 = com.google.android.gms.common.api.internal.C1723g.f5259e;
        r4.m15888a(r5);
        return;
    L_0x0031:
        r0 = r4.f17997h;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x003c;
    L_0x0039:
        r4.f18001l = r5;
        return;
    L_0x003c:
        r0 = com.google.android.gms.common.api.internal.C1723g.f5260i;
        monitor-enter(r0);
        r1 = r4.f17996g;	 Catch:{ all -> 0x00cc }
        r1 = r1.f5272o;	 Catch:{ all -> 0x00cc }
        if (r1 == 0) goto L_0x0064;
    L_0x0049:
        r1 = r4.f17996g;	 Catch:{ all -> 0x00cc }
        r1 = r1.f5273p;	 Catch:{ all -> 0x00cc }
        r2 = r4.f17999j;	 Catch:{ all -> 0x00cc }
        r1 = r1.contains(r2);	 Catch:{ all -> 0x00cc }
        if (r1 == 0) goto L_0x0064;
    L_0x0057:
        r1 = r4.f17996g;	 Catch:{ all -> 0x00cc }
        r1 = r1.f5272o;	 Catch:{ all -> 0x00cc }
        r2 = r4.f17994e;	 Catch:{ all -> 0x00cc }
        r1.m11761b(r5, r2);	 Catch:{ all -> 0x00cc }
        monitor-exit(r0);	 Catch:{ all -> 0x00cc }
        return;
    L_0x0064:
        monitor-exit(r0);	 Catch:{ all -> 0x00cc }
        r0 = r4.f17996g;
        r1 = r4.f17994e;
        r0 = r0.m4348a(r5, r1);
        if (r0 != 0) goto L_0x00cb;
    L_0x006f:
        r5 = r5.f17969b;
        r0 = 18;
        if (r5 != r0) goto L_0x0078;
    L_0x0075:
        r5 = 1;
        r4.f17995f = r5;
    L_0x0078:
        r5 = r4.f17995f;
        if (r5 == 0) goto L_0x009a;
    L_0x007c:
        r5 = r4.f17996g;
        r5 = r5.f5264d;
        r0 = r4.f17996g;
        r0 = r0.f5264d;
        r1 = 9;
        r2 = r4.f17999j;
        r0 = android.os.Message.obtain(r0, r1, r2);
        r1 = r4.f17996g;
        r1 = r1.f5265f;
        r5.sendMessageDelayed(r0, r1);
        return;
    L_0x009a:
        r5 = new com.google.android.gms.common.api.Status;
        r0 = 17;
        r1 = r4.f17999j;
        r1 = r1.f5238a;
        r1 = r1.f5213c;
        r2 = 38;
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r2 = r2 + r3;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "API: ";
        r3.append(r2);
        r3.append(r1);
        r1 = " is not available on this device.";
        r3.append(r1);
        r1 = r3.toString();
        r5.<init>(r0, r1);
        r4.m15888a(r5);
    L_0x00cb:
        return;
    L_0x00cc:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00cc }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.i.a(com.google.android.gms.common.ConnectionResult):void");
    }

    public final void m15888a(Status status) {
        ac.m4380a(this.f17996g.f5264d);
        for (C1721a a : this.f17997h) {
            a.mo1549a(status);
        }
        this.f17997h.clear();
    }

    public final void m15889a(C1721a c1721a) {
        ac.m4380a(this.f17996g.f5264d);
        if (this.f17990a.m11756b()) {
            m15885b(c1721a);
            m15897i();
            return;
        }
        this.f17997h.add(c1721a);
        if (this.f18001l == null || !this.f18001l.m15869a()) {
            m15898j();
        } else {
            mo3013a(this.f18001l);
        }
    }

    public final void mo3014b() {
        if (Looper.myLooper() == this.f17996g.f5264d.getLooper()) {
            m15892d();
        } else {
            this.f17996g.f5264d.post(new C1725k(this));
        }
    }

    final void m15891c() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r2 = this;
        r2.m15894f();
        r0 = com.google.android.gms.common.ConnectionResult.f17968a;
        r2.m15884b(r0);
        r2.m15896h();
        r0 = r2.f17993d;
        r0 = r0.values();
        r0 = r0.iterator();
    L_0x0015:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x002c;
    L_0x001b:
        r0.next();
        r1 = new com.google.android.gms.b.e;	 Catch:{ DeadObjectException -> 0x0024, RemoteException -> 0x0015 }
        r1.<init>();	 Catch:{ DeadObjectException -> 0x0024, RemoteException -> 0x0015 }
        goto L_0x0015;
    L_0x0024:
        r2.mo3014b();
        r0 = r2.f17990a;
        r0.m11752a();
    L_0x002c:
        r0 = r2.f17990a;
        r0 = r0.m11756b();
        if (r0 == 0) goto L_0x0048;
    L_0x0034:
        r0 = r2.f17997h;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0048;
    L_0x003c:
        r0 = r2.f17997h;
        r0 = r0.remove();
        r0 = (com.google.android.gms.common.api.internal.C1721a) r0;
        r2.m15885b(r0);
        goto L_0x002c;
    L_0x0048:
        r2.m15897i();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.i.c():void");
    }

    final void m15892d() {
        m15894f();
        this.f17995f = true;
        this.f17991b.m4330a(true, ag.f5236a);
        this.f17996g.f5264d.sendMessageDelayed(Message.obtain(this.f17996g.f5264d, 9, this.f17999j), this.f17996g.f5265f);
        this.f17996g.f5264d.sendMessageDelayed(Message.obtain(this.f17996g.f5264d, 11, this.f17999j), this.f17996g.f5266g);
        this.f17996g.f5270m = -1;
    }

    public final void m15893e() {
        ac.m4380a(this.f17996g.f5264d);
        m15888a(C1723g.f5258a);
        int i = 0;
        this.f17991b.m4330a(false, C1723g.f5258a);
        C1734x[] c1734xArr = (C1734x[]) this.f17993d.keySet().toArray(new C1734x[this.f17993d.size()]);
        int length = c1734xArr.length;
        while (i < length) {
            m15889a(new ah(c1734xArr[i], new C1693e()));
            i++;
        }
        m15884b(new ConnectionResult(4));
        this.f17990a.m11754a(new C5455l(this));
    }

    public final void m15894f() {
        ac.m4380a(this.f17996g.f5264d);
        this.f18001l = null;
    }

    public final ConnectionResult m15895g() {
        ac.m4380a(this.f17996g.f5264d);
        return this.f18001l;
    }

    final void m15896h() {
        if (this.f17995f) {
            this.f17996g.f5264d.removeMessages(11, this.f17999j);
            this.f17996g.f5264d.removeMessages(9, this.f17999j);
            this.f17995f = false;
        }
    }

    final void m15897i() {
        this.f17996g.f5264d.removeMessages(12, this.f17999j);
        this.f17996g.f5264d.sendMessageDelayed(this.f17996g.f5264d.obtainMessage(12, this.f17999j), this.f17996g.f5267h);
    }

    public final void m15898j() {
        ac.m4380a(this.f17996g.f5264d);
        if (!this.f17990a.m11756b() && !this.f17990a.m11757c()) {
            if (this.f17996g.f5270m != 0) {
                this.f17996g.f5270m = this.f17996g.f5269l.mo1557a(this.f17996g.f5268k);
                if (this.f17996g.f5270m != 0) {
                    mo3013a(new ConnectionResult(this.f17996g.f5270m, null));
                    return;
                }
            }
            ao c5456n = new C5456n(this.f17996g, this.f17990a, this.f17999j);
            if (this.f17990a.mo3413d()) {
                ab abVar = this.f18000k;
                if (abVar.f20368e != null) {
                    abVar.f20368e.m11752a();
                }
                abVar.f20367d.f5382g = Integer.valueOf(System.identityHashCode(abVar));
                abVar.f20368e = (lm) abVar.f20366c.mo3026a(abVar.f20364a, abVar.f20365b.getLooper(), abVar.f20367d, abVar.f20367d.f5381f, abVar, abVar);
                abVar.f20369f = c5456n;
                abVar.f20368e.mo3414e();
            }
            this.f17990a.m11753a(c5456n);
        }
    }

    public final boolean m15899k() {
        return this.f17990a.mo3413d();
    }
}
