package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.C1761j;
import com.google.android.gms.common.util.C1787g;

public class C1771k {
    private static final C1771k f5417a = new C1771k();
    public static final int f5418b = C1780t.f5443b;

    C1771k() {
    }

    public static PendingIntent m4470a(Context context, int i, int i2, String str) {
        Intent a = C1771k.m4471a(context, i, str);
        return a == null ? null : PendingIntent.getActivity(context, i2, a, 268435456);
    }

    public static Intent m4471a(Context context, int i, String str) {
        switch (i) {
            case 1:
            case 2:
                return (context == null || !C1787g.m4524a(context)) ? C1761j.m4459a("com.google.android.gms", C1771k.m4472a(context, str)) : C1761j.m4457a();
            case 3:
                return C1761j.m4458a("com.google.android.gms");
            default:
                return null;
        }
    }

    private static java.lang.String m4472a(android.content.Context r2, java.lang.String r3) {
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
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "gcore_";
        r0.append(r1);
        r1 = f5418b;
        r0.append(r1);
        r1 = "-";
        r0.append(r1);
        r1 = android.text.TextUtils.isEmpty(r3);
        if (r1 != 0) goto L_0x001d;
    L_0x001a:
        r0.append(r3);
    L_0x001d:
        r3 = "-";
        r0.append(r3);
        if (r2 == 0) goto L_0x002b;
    L_0x0024:
        r3 = r2.getPackageName();
        r0.append(r3);
    L_0x002b:
        r3 = "-";
        r0.append(r3);
        if (r2 == 0) goto L_0x0044;
    L_0x0032:
        r3 = com.google.android.gms.internal.dz.m4762a(r2);	 Catch:{ NameNotFoundException -> 0x0044 }
        r2 = r2.getPackageName();	 Catch:{ NameNotFoundException -> 0x0044 }
        r1 = 0;	 Catch:{ NameNotFoundException -> 0x0044 }
        r2 = r3.m4760b(r2, r1);	 Catch:{ NameNotFoundException -> 0x0044 }
        r2 = r2.versionCode;	 Catch:{ NameNotFoundException -> 0x0044 }
        r0.append(r2);	 Catch:{ NameNotFoundException -> 0x0044 }
    L_0x0044:
        r2 = r0.toString();
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.k.a(android.content.Context, java.lang.String):java.lang.String");
    }

    public static C1771k m4473b() {
        return f5417a;
    }

    public static void m4474b(Context context) {
        C1780t.m4498e(context);
    }

    public static int m4475c(Context context) {
        return C1780t.m4502i(context);
    }

    public int mo1557a(Context context) {
        int d = C1780t.m4497d(context);
        return C1780t.m4493a(context, d) ? 18 : d;
    }

    public PendingIntent mo1558a(Context context, int i, int i2) {
        return C1771k.m4470a(context, i, i2, null);
    }

    public boolean mo1559a(int i) {
        return C1780t.m4496b(i);
    }

    public String mo1560b(int i) {
        return C1780t.m4492a(i);
    }
}
