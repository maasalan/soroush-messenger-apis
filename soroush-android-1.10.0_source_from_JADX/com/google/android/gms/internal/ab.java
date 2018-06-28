package com.google.android.gms.internal;

import com.google.android.gms.analytics.C1677r;

public final class ab extends C5506v {
    final ad f18067a = new ad(this);
    bl f18068b;
    private final az f18069c;
    private final ca f18070d;

    protected ab(C1827x c1827x) {
        super(c1827x);
        this.f18070d = new ca(c1827x.f6285c);
        this.f18069c = new ac(this, c1827x);
    }

    static /* synthetic */ void m15928a(ab abVar) {
        C1677r.m4275b();
        if (abVar.m15930b()) {
            abVar.m5143b("Inactivity, disconnecting from device AnalyticsService");
            abVar.m15933e();
        }
    }

    public final boolean m15929a(com.google.android.gms.internal.bk r8) {
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
        r7 = this;
        com.google.android.gms.common.internal.ac.m4376a(r8);
        com.google.android.gms.analytics.C1677r.m4275b();
        r7.m12037k();
        r0 = r7.f18068b;
        r6 = 0;
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        return r6;
    L_0x000f:
        r1 = r8.f5592f;
        if (r1 == 0) goto L_0x0019;
    L_0x0013:
        r1 = com.google.android.gms.internal.ax.m4592h();
    L_0x0017:
        r4 = r1;
        goto L_0x001e;
    L_0x0019:
        r1 = com.google.android.gms.internal.ax.m4593i();
        goto L_0x0017;
    L_0x001e:
        r5 = java.util.Collections.emptyList();
        r1 = r8.f5587a;	 Catch:{ RemoteException -> 0x002e }
        r2 = r8.f5590d;	 Catch:{ RemoteException -> 0x002e }
        r0.mo1594a(r1, r2, r4, r5);	 Catch:{ RemoteException -> 0x002e }
        r7.m15931c();	 Catch:{ RemoteException -> 0x002e }
        r8 = 1;
        return r8;
    L_0x002e:
        r8 = "Failed to send hits to AnalyticsService";
        r7.m5143b(r8);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ab.a(com.google.android.gms.internal.bk):boolean");
    }

    public final boolean m15930b() {
        C1677r.m4275b();
        m12037k();
        return this.f18068b != null;
    }

    final void m15931c() {
        this.f18070d.m4641a();
        this.f18069c.m4601a(((Long) bf.f5542A.f5585a).longValue());
    }

    protected final void c_() {
    }

    public final boolean m15932d() {
        C1677r.m4275b();
        m12037k();
        if (this.f18068b != null) {
            return true;
        }
        bl a = this.f18067a.m4575a();
        if (a == null) {
            return false;
        }
        this.f18068b = a;
        m15931c();
        return true;
    }

    public final void m15933e() {
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
        com.google.android.gms.analytics.C1677r.m4275b();
        r2.m12037k();
        com.google.android.gms.common.stats.C1775a.m4485a();	 Catch:{ IllegalStateException -> 0x0012, IllegalStateException -> 0x0012 }
        r0 = r2.f6279f;	 Catch:{ IllegalStateException -> 0x0012, IllegalStateException -> 0x0012 }
        r0 = r0.f6283a;	 Catch:{ IllegalStateException -> 0x0012, IllegalStateException -> 0x0012 }
        r1 = r2.f18067a;	 Catch:{ IllegalStateException -> 0x0012, IllegalStateException -> 0x0012 }
        r0.unbindService(r1);	 Catch:{ IllegalStateException -> 0x0012, IllegalStateException -> 0x0012 }
    L_0x0012:
        r0 = r2.f18068b;
        if (r0 == 0) goto L_0x0022;
    L_0x0016:
        r0 = 0;
        r2.f18068b = r0;
        r0 = r2.f6279f;
        r0 = r0.m5162c();
        r0.m16770d();
    L_0x0022:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ab.e():void");
    }
}
