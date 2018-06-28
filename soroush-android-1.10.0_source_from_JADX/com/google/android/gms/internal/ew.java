package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1785d;
import com.google.android.gms.common.util.C1794n;
import java.lang.reflect.InvocationTargetException;

public final class ew extends hp {
    private Boolean f15224a;

    ew(gr grVar) {
        super(grVar);
    }

    public static boolean m11914B() {
        return ((Boolean) fj.f5760a.f5786a).booleanValue();
    }

    public static long m11915y() {
        return ((Long) fj.f5750F.f5786a).longValue();
    }

    public static long m11916z() {
        return ((Long) fj.f5765f.f5786a).longValue();
    }

    public final String m11917A() {
        Object e;
        fv fvVar;
        String str;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{"debug.firebase.analytics.app", ""});
        } catch (ClassNotFoundException e2) {
            e = e2;
            fvVar = mo1623t().f18134a;
            str = "Could not find SystemProperties class";
            fvVar.m4847a(str, e);
            return "";
        } catch (NoSuchMethodException e3) {
            e = e3;
            fvVar = mo1623t().f18134a;
            str = "Could not find SystemProperties.get() method";
            fvVar.m4847a(str, e);
            return "";
        } catch (IllegalAccessException e4) {
            e = e4;
            fvVar = mo1623t().f18134a;
            str = "Could not access SystemProperties.get()";
            fvVar.m4847a(str, e);
            return "";
        } catch (InvocationTargetException e5) {
            e = e5;
            fvVar = mo1623t().f18134a;
            str = "SystemProperties.get() threw an exception";
            fvVar.m4847a(str, e);
            return "";
        }
    }

    public final int m11918a(String str) {
        return m11921b(str, fj.f5776q);
    }

    public final long m11919a(java.lang.String r3, com.google.android.gms.internal.fk<java.lang.Long> r4) {
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
        if (r3 != 0) goto L_0x000b;
    L_0x0002:
        r3 = r4.f5786a;
        r3 = (java.lang.Long) r3;
        r3 = r3.longValue();
        return r3;
    L_0x000b:
        r0 = r2.mo1620q();
        r1 = r4.f5787b;
        r3 = r0.m16295a(r3, r1);
        r0 = android.text.TextUtils.isEmpty(r3);
        if (r0 == 0) goto L_0x001c;
    L_0x001b:
        goto L_0x0002;
    L_0x001c:
        r3 = java.lang.Long.valueOf(r3);	 Catch:{ NumberFormatException -> 0x0002 }
        r0 = r3.longValue();	 Catch:{ NumberFormatException -> 0x0002 }
        r3 = java.lang.Long.valueOf(r0);	 Catch:{ NumberFormatException -> 0x0002 }
        r3 = r4.m4829a(r3);	 Catch:{ NumberFormatException -> 0x0002 }
        r3 = (java.lang.Long) r3;	 Catch:{ NumberFormatException -> 0x0002 }
        r0 = r3.longValue();	 Catch:{ NumberFormatException -> 0x0002 }
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ew.a(java.lang.String, com.google.android.gms.internal.fk):long");
    }

    public final /* bridge */ /* synthetic */ void mo1604a() {
        super.mo1604a();
    }

    public final int m11921b(java.lang.String r3, com.google.android.gms.internal.fk<java.lang.Integer> r4) {
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
        if (r3 != 0) goto L_0x000b;
    L_0x0002:
        r3 = r4.f5786a;
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        return r3;
    L_0x000b:
        r0 = r2.mo1620q();
        r1 = r4.f5787b;
        r3 = r0.m16295a(r3, r1);
        r0 = android.text.TextUtils.isEmpty(r3);
        if (r0 == 0) goto L_0x001c;
    L_0x001b:
        goto L_0x0002;
    L_0x001c:
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ NumberFormatException -> 0x0002 }
        r3 = r3.intValue();	 Catch:{ NumberFormatException -> 0x0002 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ NumberFormatException -> 0x0002 }
        r3 = r4.m4829a(r3);	 Catch:{ NumberFormatException -> 0x0002 }
        r3 = (java.lang.Integer) r3;	 Catch:{ NumberFormatException -> 0x0002 }
        r3 = r3.intValue();	 Catch:{ NumberFormatException -> 0x0002 }
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ew.b(java.lang.String, com.google.android.gms.internal.fk):int");
    }

    final Boolean m11922b(String str) {
        ac.m4378a(str);
        try {
            if (mo1615l().getPackageManager() == null) {
                mo1623t().f18134a.m4846a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = dz.m4762a(mo1615l()).m4757a(mo1615l().getPackageName(), 128);
            if (a == null) {
                mo1623t().f18134a.m4846a("Failed to load metadata: ApplicationInfo is null");
                return null;
            } else if (a.metaData != null) {
                return !a.metaData.containsKey(str) ? null : Boolean.valueOf(a.metaData.getBoolean(str));
            } else {
                mo1623t().f18134a.m4846a("Failed to load metadata: Metadata bundle is null");
                return null;
            }
        } catch (NameNotFoundException e) {
            mo1623t().f18134a.m4847a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ void mo1605b() {
        super.mo1605b();
    }

    public final /* bridge */ /* synthetic */ void mo1606c() {
        super.mo1606c();
    }

    public final boolean m11925c(String str) {
        return "1".equals(mo1620q().m16295a(str, "gaia_collection_enabled"));
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

    public final boolean m11945w() {
        if (this.f15224a == null) {
            synchronized (this) {
                if (this.f15224a == null) {
                    ApplicationInfo applicationInfo = mo1615l().getApplicationInfo();
                    String a = C1794n.m4536a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = str != null && str.equals(a);
                        this.f15224a = Boolean.valueOf(z);
                    }
                    if (this.f15224a == null) {
                        this.f15224a = Boolean.TRUE;
                        mo1623t().f18134a.m4846a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f15224a.booleanValue();
    }

    public final boolean m11946x() {
        Boolean b = m11922b("firebase_analytics_collection_deactivated");
        return b != null && b.booleanValue();
    }
}
