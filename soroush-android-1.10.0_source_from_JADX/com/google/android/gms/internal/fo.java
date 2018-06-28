package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.util.C1785d;
import java.math.BigInteger;
import java.util.Locale;

public final class fo extends hq {
    private String f18120a;
    private String f18121b;
    private int f18122c;
    private String f18123d;
    private String f18124e;
    private long f18125f;
    private long f18126g;
    private int f18127h;
    private String f18128i;

    fo(gr grVar) {
        super(grVar);
    }

    private final java.lang.String m16121D() {
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
        r2.mo1606c();
        r0 = com.google.firebase.iid.FirebaseInstanceId.m5609a();	 Catch:{ IllegalStateException -> 0x000c }
        r0 = r0.m5620c();	 Catch:{ IllegalStateException -> 0x000c }
        return r0;
    L_0x000c:
        r0 = r2.mo1623t();
        r0 = r0.f18136c;
        r1 = "Failed to retrieve Firebase Instance Id";
        r0.m4846a(r1);
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fo.D():java.lang.String");
    }

    final String m16122A() {
        m11975L();
        return this.f18128i;
    }

    final int m16123B() {
        m11975L();
        return this.f18122c;
    }

    final int m16124C() {
        m11975L();
        return this.f18127h;
    }

    final zzcff m16125a(String str) {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        mo1606c();
        String z4 = m16150z();
        String A = m16122A();
        m11975L();
        String str2 = this.f18121b;
        long B = (long) m16123B();
        m11975L();
        String str3 = this.f18123d;
        m11975L();
        mo1606c();
        if (this.f18125f == 0) {
            r0.f18125f = r0.s.m4910i().m16608b(mo1615l(), mo1615l().getPackageName());
        }
        long j2 = r0.f18125f;
        boolean s = r0.s.m4920s();
        boolean z5 = mo1624u().f18163r ^ 1;
        String D = m16121D();
        m11975L();
        gr grVar = r0.s;
        Long valueOf = Long.valueOf(grVar.m4905d().f18153h.m4854a());
        if (valueOf.longValue() == 0) {
            j = grVar.f5878l;
            z = s;
            z2 = z5;
        } else {
            z = s;
            z2 = z5;
            j = Math.min(grVar.f5878l, valueOf.longValue());
        }
        int C = m16124C();
        Boolean b = mo1625v().m11922b("google_analytics_adid_collection_enabled");
        if (b != null) {
            if (!b.booleanValue()) {
                z3 = false;
                return new zzcff(z4, A, str2, B, str3, 11720, j2, str, z, z2, D, 0, j, C, Boolean.valueOf(z3).booleanValue());
            }
        }
        z3 = true;
        return new zzcff(z4, A, str2, B, str3, 11720, j2, str, z, z2, D, 0, j, C, Boolean.valueOf(z3).booleanValue());
    }

    public final /* bridge */ /* synthetic */ void mo1604a() {
        super.mo1604a();
    }

    public final /* bridge */ /* synthetic */ void mo1605b() {
        super.mo1605b();
    }

    public final /* bridge */ /* synthetic */ void mo1606c() {
        super.mo1606c();
    }

    public final /* bridge */ /* synthetic */ eo mo1607d() {
        return super.mo1607d();
    }

    protected final void d_() {
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
        r10 = this;
        r0 = "unknown";
        r1 = "Unknown";
        r2 = "Unknown";
        r3 = r10.mo1615l();
        r3 = r3.getPackageName();
        r4 = r10.mo1615l();
        r4 = r4.getPackageManager();
        r5 = 0;
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r4 != 0) goto L_0x002b;
    L_0x001b:
        r4 = r10.mo1623t();
        r4 = r4.f18134a;
        r7 = "PackageManager is null, app identity information might be inaccurate. appId";
        r8 = com.google.android.gms.internal.ft.m16220a(r3);
        r4.m4847a(r7, r8);
        goto L_0x0085;
    L_0x002b:
        r7 = r4.getInstallerPackageName(r3);	 Catch:{ IllegalArgumentException -> 0x0031 }
        r0 = r7;
        goto L_0x0040;
    L_0x0031:
        r7 = r10.mo1623t();
        r7 = r7.f18134a;
        r8 = "Error retrieving app installer package name. appId";
        r9 = com.google.android.gms.internal.ft.m16220a(r3);
        r7.m4847a(r8, r9);
    L_0x0040:
        if (r0 != 0) goto L_0x0045;
    L_0x0042:
        r0 = "manual_install";
        goto L_0x004f;
    L_0x0045:
        r7 = "com.android.vending";
        r7 = r7.equals(r0);
        if (r7 == 0) goto L_0x004f;
    L_0x004d:
        r0 = "";
    L_0x004f:
        r7 = r10.mo1615l();	 Catch:{ NameNotFoundException -> 0x0076 }
        r7 = r7.getPackageName();	 Catch:{ NameNotFoundException -> 0x0076 }
        r7 = r4.getPackageInfo(r7, r5);	 Catch:{ NameNotFoundException -> 0x0076 }
        if (r7 == 0) goto L_0x0085;	 Catch:{ NameNotFoundException -> 0x0076 }
    L_0x005d:
        r8 = r7.applicationInfo;	 Catch:{ NameNotFoundException -> 0x0076 }
        r4 = r4.getApplicationLabel(r8);	 Catch:{ NameNotFoundException -> 0x0076 }
        r8 = android.text.TextUtils.isEmpty(r4);	 Catch:{ NameNotFoundException -> 0x0076 }
        if (r8 != 0) goto L_0x006e;	 Catch:{ NameNotFoundException -> 0x0076 }
    L_0x0069:
        r4 = r4.toString();	 Catch:{ NameNotFoundException -> 0x0076 }
        r2 = r4;	 Catch:{ NameNotFoundException -> 0x0076 }
    L_0x006e:
        r4 = r7.versionName;	 Catch:{ NameNotFoundException -> 0x0076 }
        r1 = r7.versionCode;	 Catch:{ NameNotFoundException -> 0x0075 }
        r6 = r1;
        r1 = r4;
        goto L_0x0085;
    L_0x0075:
        r1 = r4;
    L_0x0076:
        r4 = r10.mo1623t();
        r4 = r4.f18134a;
        r7 = "Error retrieving package info. appId, appName";
        r8 = com.google.android.gms.internal.ft.m16220a(r3);
        r4.m4848a(r7, r8, r2);
    L_0x0085:
        r10.f18120a = r3;
        r10.f18123d = r0;
        r10.f18121b = r1;
        r10.f18122c = r6;
        r10.f18124e = r2;
        r0 = 0;
        r10.f18125f = r0;
        r2 = r10.mo1615l();
        r2 = com.google.android.gms.common.api.internal.C1730t.m4352a(r2);
        r4 = 1;
        if (r2 == 0) goto L_0x00a6;
    L_0x009e:
        r6 = r2.m15872b();
        if (r6 == 0) goto L_0x00a6;
    L_0x00a4:
        r6 = r4;
        goto L_0x00a7;
    L_0x00a6:
        r6 = r5;
    L_0x00a7:
        if (r6 != 0) goto L_0x00ca;
    L_0x00a9:
        if (r2 != 0) goto L_0x00b7;
    L_0x00ab:
        r2 = r10.mo1623t();
        r2 = r2.f18134a;
        r7 = "GoogleService failed to initialize (no status)";
        r2.m4846a(r7);
        goto L_0x00ca;
    L_0x00b7:
        r7 = r10.mo1623t();
        r7 = r7.f18134a;
        r8 = "GoogleService failed to initialize, status";
        r9 = r2.f17982g;
        r9 = java.lang.Integer.valueOf(r9);
        r2 = r2.f17983h;
        r7.m4848a(r8, r9, r2);
    L_0x00ca:
        if (r6 == 0) goto L_0x011a;
    L_0x00cc:
        r2 = r10.mo1625v();
        r6 = "firebase_analytics_collection_enabled";
        r2 = r2.m11922b(r6);
        r6 = r10.mo1625v();
        r6 = r6.m11946x();
        if (r6 == 0) goto L_0x00ec;
    L_0x00e0:
        r2 = r10.mo1623t();
        r2 = r2.f18138e;
        r4 = "Collection disabled with firebase_analytics_collection_deactivated=1";
    L_0x00e8:
        r2.m4846a(r4);
        goto L_0x011a;
    L_0x00ec:
        if (r2 == 0) goto L_0x00fd;
    L_0x00ee:
        r6 = r2.booleanValue();
        if (r6 != 0) goto L_0x00fd;
    L_0x00f4:
        r2 = r10.mo1623t();
        r2 = r2.f18138e;
        r4 = "Collection disabled with firebase_analytics_collection_enabled=0";
        goto L_0x00e8;
    L_0x00fd:
        if (r2 != 0) goto L_0x010e;
    L_0x00ff:
        r2 = com.google.android.gms.common.api.internal.C1730t.m4355b();
        if (r2 == 0) goto L_0x010e;
    L_0x0105:
        r2 = r10.mo1623t();
        r2 = r2.f18138e;
        r4 = "Collection disabled with google_app_measurement_enable=0";
        goto L_0x00e8;
    L_0x010e:
        r2 = r10.mo1623t();
        r2 = r2.f18140g;
        r6 = "Collection enabled";
        r2.m4846a(r6);
        goto L_0x011b;
    L_0x011a:
        r4 = r5;
    L_0x011b:
        r2 = "";
        r10.f18128i = r2;
        r10.f18126g = r0;
        r0 = com.google.android.gms.common.api.internal.C1730t.m4354a();	 Catch:{ IllegalStateException -> 0x0141 }
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalStateException -> 0x0141 }
        if (r1 == 0) goto L_0x012d;	 Catch:{ IllegalStateException -> 0x0141 }
    L_0x012b:
        r0 = "";	 Catch:{ IllegalStateException -> 0x0141 }
    L_0x012d:
        r10.f18128i = r0;	 Catch:{ IllegalStateException -> 0x0141 }
        if (r4 == 0) goto L_0x0151;	 Catch:{ IllegalStateException -> 0x0141 }
    L_0x0131:
        r0 = r10.mo1623t();	 Catch:{ IllegalStateException -> 0x0141 }
        r0 = r0.f18140g;	 Catch:{ IllegalStateException -> 0x0141 }
        r1 = "App package, google app id";	 Catch:{ IllegalStateException -> 0x0141 }
        r2 = r10.f18120a;	 Catch:{ IllegalStateException -> 0x0141 }
        r4 = r10.f18128i;	 Catch:{ IllegalStateException -> 0x0141 }
        r0.m4848a(r1, r2, r4);	 Catch:{ IllegalStateException -> 0x0141 }
        goto L_0x0151;
    L_0x0141:
        r0 = move-exception;
        r1 = r10.mo1623t();
        r1 = r1.f18134a;
        r2 = "getGoogleAppId or isMeasurementEnabled failed with exception. appId";
        r3 = com.google.android.gms.internal.ft.m16220a(r3);
        r1.m4848a(r2, r3, r0);
    L_0x0151:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 16;
        if (r0 < r1) goto L_0x0162;
    L_0x0157:
        r0 = r10.mo1615l();
        r0 = com.google.android.gms.internal.dx.m4755a(r0);
        r10.f18127h = r0;
        return;
    L_0x0162:
        r10.f18127h = r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fo.d_():void");
    }

    public final /* bridge */ /* synthetic */ eu mo1608e() {
        return super.mo1608e();
    }

    public final /* bridge */ /* synthetic */ hs mo1609f() {
        return super.mo1609f();
    }

    public final /* bridge */ /* synthetic */ fo mo1610g() {
        return super.mo1610g();
    }

    public final /* bridge */ /* synthetic */ fd mo1611h() {
        return super.mo1611h();
    }

    public final /* bridge */ /* synthetic */ il mo1612i() {
        return super.mo1612i();
    }

    public final /* bridge */ /* synthetic */ ih mo1613j() {
        return super.mo1613j();
    }

    public final /* bridge */ /* synthetic */ C1785d mo1614k() {
        return super.mo1614k();
    }

    public final /* bridge */ /* synthetic */ Context mo1615l() {
        return super.mo1615l();
    }

    public final /* bridge */ /* synthetic */ fp mo1616m() {
        return super.mo1616m();
    }

    public final /* bridge */ /* synthetic */ ex mo1617n() {
        return super.mo1617n();
    }

    public final /* bridge */ /* synthetic */ fr mo1618o() {
        return super.mo1618o();
    }

    public final /* bridge */ /* synthetic */ ju mo1619p() {
        return super.mo1619p();
    }

    public final /* bridge */ /* synthetic */ gl mo1620q() {
        return super.mo1620q();
    }

    public final /* bridge */ /* synthetic */ jk mo1621r() {
        return super.mo1621r();
    }

    public final /* bridge */ /* synthetic */ gm mo1622s() {
        return super.mo1622s();
    }

    public final /* bridge */ /* synthetic */ ft mo1623t() {
        return super.mo1623t();
    }

    public final /* bridge */ /* synthetic */ gd mo1624u() {
        return super.mo1624u();
    }

    public final /* bridge */ /* synthetic */ ew mo1625v() {
        return super.mo1625v();
    }

    protected final boolean mo3036w() {
        return true;
    }

    final String m16149y() {
        mo1619p().m16641z().nextBytes(new byte[16]);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, r0)});
    }

    final String m16150z() {
        m11975L();
        return this.f18120a;
    }
}
