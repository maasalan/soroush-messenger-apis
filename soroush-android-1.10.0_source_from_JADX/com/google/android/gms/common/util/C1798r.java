package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.internal.dz;

public final class C1798r {
    public static boolean m4541a(android.content.Context r3, int r4) {
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
        r0 = "com.google.android.gms";
        r4 = com.google.android.gms.common.util.C1798r.m4542a(r3, r4, r0);
        r0 = 0;
        if (r4 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r4 = r3.getPackageManager();
        r1 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x003b }
        r2 = 64;	 Catch:{ NameNotFoundException -> 0x003b }
        r4 = r4.getPackageInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x003b }
        r3 = com.google.android.gms.common.C1781u.m4504a(r3);
        if (r4 == 0) goto L_0x003a;
    L_0x001c:
        r1 = com.google.android.gms.common.C1781u.m4505a(r4, r0);
        r2 = 1;
        if (r1 == 0) goto L_0x0024;
    L_0x0023:
        return r2;
    L_0x0024:
        r4 = com.google.android.gms.common.C1781u.m4505a(r4, r2);
        if (r4 == 0) goto L_0x003a;
    L_0x002a:
        r3 = r3.f5450a;
        r3 = com.google.android.gms.common.C1780t.m4499f(r3);
        if (r3 == 0) goto L_0x0033;
    L_0x0032:
        return r2;
    L_0x0033:
        r3 = "GoogleSignatureVerifier";
        r4 = "Test-keys aren't accepted on this build.";
        android.util.Log.w(r3, r4);
    L_0x003a:
        return r0;
    L_0x003b:
        r3 = "UidVerifier";
        r4 = 3;
        r3 = android.util.Log.isLoggable(r3, r4);
        if (r3 == 0) goto L_0x004b;
    L_0x0044:
        r3 = "UidVerifier";
        r4 = "Package manager can't find google play services package, defaulting to false";
        android.util.Log.d(r3, r4);
    L_0x004b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.r.a(android.content.Context, int):boolean");
    }

    @TargetApi(19)
    public static boolean m4542a(Context context, int i, String str) {
        return dz.m4762a(context).m4759a(i, str);
    }
}
