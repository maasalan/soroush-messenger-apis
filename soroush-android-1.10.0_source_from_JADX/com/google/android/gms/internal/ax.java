package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1794n;
import java.util.Set;

public final class ax {
    private final C1827x f5533a;
    private volatile Boolean f5534b;
    private String f5535c;
    private Set<Integer> f5536d;

    protected ax(C1827x c1827x) {
        ac.m4376a((Object) c1827x);
        this.f5533a = c1827x;
    }

    public static boolean m4586b() {
        return ((Boolean) bf.f5559a.f5585a).booleanValue();
    }

    public static int m4587c() {
        return ((Integer) bf.f5576r.f5585a).intValue();
    }

    public static long m4588d() {
        return ((Long) bf.f5564f.f5585a).longValue();
    }

    public static long m4589e() {
        return ((Long) bf.f5565g.f5585a).longValue();
    }

    public static int m4590f() {
        return ((Integer) bf.f5567i.f5585a).intValue();
    }

    public static int m4591g() {
        return ((Integer) bf.f5568j.f5585a).intValue();
    }

    public static String m4592h() {
        return (String) bf.f5570l.f5585a;
    }

    public static String m4593i() {
        return (String) bf.f5569k.f5585a;
    }

    public static String m4594j() {
        return (String) bf.f5571m.f5585a;
    }

    public static long m4595l() {
        return ((Long) bf.f5583y.f5585a).longValue();
    }

    public final boolean m4596a() {
        if (this.f5534b == null) {
            synchronized (this) {
                if (this.f5534b == null) {
                    ApplicationInfo applicationInfo = this.f5533a.f6283a.getApplicationInfo();
                    String a = C1794n.m4536a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = str != null && str.equals(a);
                        this.f5534b = Boolean.valueOf(z);
                    }
                    if ((this.f5534b == null || !this.f5534b.booleanValue()) && "com.google.android.gms.analytics".equals(a)) {
                        this.f5534b = Boolean.TRUE;
                    }
                    if (this.f5534b == null) {
                        this.f5534b = Boolean.TRUE;
                        this.f5533a.m5160a().m5155f("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f5534b.booleanValue();
    }

    public final java.util.Set<java.lang.Integer> m4597k() {
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
        r6 = this;
        r0 = com.google.android.gms.internal.bf.f5579u;
        r0 = r0.f5585a;
        r0 = (java.lang.String) r0;
        r1 = r6.f5536d;
        if (r1 == 0) goto L_0x0016;
    L_0x000a:
        r1 = r6.f5535c;
        if (r1 == 0) goto L_0x0016;
    L_0x000e:
        r1 = r6.f5535c;
        r1 = r1.equals(r0);
        if (r1 != 0) goto L_0x0039;
    L_0x0016:
        r1 = ",";
        r1 = android.text.TextUtils.split(r0, r1);
        r2 = new java.util.HashSet;
        r2.<init>();
        r3 = r1.length;
        r4 = 0;
    L_0x0023:
        if (r4 >= r3) goto L_0x0035;
    L_0x0025:
        r5 = r1[r4];
        r5 = java.lang.Integer.parseInt(r5);	 Catch:{ NumberFormatException -> 0x0032 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ NumberFormatException -> 0x0032 }
        r2.add(r5);	 Catch:{ NumberFormatException -> 0x0032 }
    L_0x0032:
        r4 = r4 + 1;
        goto L_0x0023;
    L_0x0035:
        r6.f5535c = r0;
        r6.f5536d = r2;
    L_0x0039:
        r0 = r6.f5536d;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ax.k():java.util.Set<java.lang.Integer>");
    }
}
