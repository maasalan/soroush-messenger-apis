package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.C1708a;
import com.google.android.gms.common.api.C1708a.C5445b;
import com.google.android.gms.common.api.C1708a.C5447g;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1785d;

public final class cg {
    @Deprecated
    public static final C1708a<Object> f5622a = new C1708a("ClearcutLogger.API", f5624c, f5623b);
    private static C5447g<ct> f5623b = new C5447g();
    private static C5445b<ct, Object> f5624c = new ch();
    private static final zzcsv[] f5625d = new zzcsv[0];
    private static final String[] f5626e = new String[0];
    private static final byte[][] f5627f = new byte[0][];
    private final String f5628g;
    private final int f5629h;
    private String f5630i;
    private int f5631j = -1;
    private String f5632k;
    private String f5633l;
    private final boolean f5634m;
    private int f5635n = 0;
    private final cm f5636o;
    private final C1785d f5637p;
    private cl f5638q;
    private final cj f5639r;

    public cg(Context context, String str, cm cmVar, C1785d c1785d, cj cjVar) {
        this.f5628g = context.getPackageName();
        this.f5629h = m4658a(context);
        this.f5631j = -1;
        this.f5630i = str;
        this.f5632k = null;
        this.f5633l = null;
        this.f5634m = true;
        this.f5636o = cmVar;
        this.f5637p = c1785d;
        this.f5638q = new cl();
        this.f5635n = 0;
        this.f5639r = cjVar;
        ac.m4386b(true, "can't be anonymous with an upload account");
    }

    private static int m4658a(android.content.Context r2) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = 0;
        r1 = r2.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0010 }
        r2 = r2.getPackageName();	 Catch:{ NameNotFoundException -> 0x0010 }
        r2 = r1.getPackageInfo(r2, r0);	 Catch:{ NameNotFoundException -> 0x0010 }
        r2 = r2.versionCode;	 Catch:{ NameNotFoundException -> 0x0010 }
        return r2;
    L_0x0010:
        r2 = "ClearcutLogger";
        r1 = "This can't happen.";
        android.util.Log.wtf(r2, r1);
        r2 = r0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cg.a(android.content.Context):int");
    }
}
