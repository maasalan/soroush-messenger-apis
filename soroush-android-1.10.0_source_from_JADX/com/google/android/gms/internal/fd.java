package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.util.C1785d;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class fd extends hq {
    private long f18117a;
    private String f18118b;
    private Boolean f18119c;

    fd(gr grVar) {
        super(grVar);
    }

    public final /* bridge */ /* synthetic */ void mo1604a() {
        super.mo1604a();
    }

    public final boolean m16096a(android.content.Context r3) {
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
        r0 = r2.f18119c;
        if (r0 != 0) goto L_0x001f;
    L_0x0004:
        r0 = 0;
        r0 = java.lang.Boolean.valueOf(r0);
        r2.f18119c = r0;
        r3 = r3.getPackageManager();	 Catch:{ NameNotFoundException -> 0x001f }
        if (r3 == 0) goto L_0x001f;	 Catch:{ NameNotFoundException -> 0x001f }
    L_0x0011:
        r0 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x001f }
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x001f }
        r3.getPackageInfo(r0, r1);	 Catch:{ NameNotFoundException -> 0x001f }
        r3 = 1;	 Catch:{ NameNotFoundException -> 0x001f }
        r3 = java.lang.Boolean.valueOf(r3);	 Catch:{ NameNotFoundException -> 0x001f }
        r2.f18119c = r3;	 Catch:{ NameNotFoundException -> 0x001f }
    L_0x001f:
        r3 = r2.f18119c;
        r3 = r3.booleanValue();
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fd.a(android.content.Context):boolean");
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
        Calendar instance = Calendar.getInstance();
        this.f18117a = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String toLowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String toLowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder stringBuilder = new StringBuilder((1 + String.valueOf(toLowerCase).length()) + String.valueOf(toLowerCase2).length());
        stringBuilder.append(toLowerCase);
        stringBuilder.append("-");
        stringBuilder.append(toLowerCase2);
        this.f18118b = stringBuilder.toString();
        return false;
    }

    public final long m16119x() {
        m11975L();
        return this.f18117a;
    }

    public final String m16120y() {
        m11975L();
        return this.f18118b;
    }
}
