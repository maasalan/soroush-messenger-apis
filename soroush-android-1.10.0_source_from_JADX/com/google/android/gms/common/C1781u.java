package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.dz;

public class C1781u {
    private static C1781u f5449b;
    public final Context f5450a;

    private C1781u(Context context) {
        this.f5450a = context.getApplicationContext();
    }

    static C6580m m4503a(PackageInfo packageInfo, C6580m... c6580mArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        int i = 0;
        C7139n c7139n = new C7139n(packageInfo.signatures[0].toByteArray());
        while (i < c6580mArr.length) {
            if (c6580mArr[i].equals(c7139n)) {
                return c6580mArr[i];
            }
            i++;
        }
        return null;
    }

    public static C1781u m4504a(Context context) {
        ac.m4376a((Object) context);
        synchronized (C1781u.class) {
            if (f5449b == null) {
                C1772l.m4480a(context);
                f5449b = new C1781u(context);
            }
        }
        return f5449b;
    }

    public static boolean m4505a(PackageInfo packageInfo, boolean z) {
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (C1781u.m4503a(packageInfo, z ? C1773p.f5422a : new C6580m[]{C1773p.f5422a[0]}) != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean m4506a(java.lang.String r4) {
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
        r3 = this;
        r0 = 0;
        r1 = r3.f5450a;	 Catch:{ NameNotFoundException -> 0x0032 }
        r1 = com.google.android.gms.internal.dz.m4762a(r1);	 Catch:{ NameNotFoundException -> 0x0032 }
        r2 = 64;	 Catch:{ NameNotFoundException -> 0x0032 }
        r4 = r1.m4760b(r4, r2);	 Catch:{ NameNotFoundException -> 0x0032 }
        if (r4 != 0) goto L_0x0010;	 Catch:{ NameNotFoundException -> 0x0032 }
    L_0x000f:
        return r0;	 Catch:{ NameNotFoundException -> 0x0032 }
    L_0x0010:
        r1 = r3.f5450a;	 Catch:{ NameNotFoundException -> 0x0032 }
        r1 = com.google.android.gms.common.C1780t.m4499f(r1);	 Catch:{ NameNotFoundException -> 0x0032 }
        r2 = 1;	 Catch:{ NameNotFoundException -> 0x0032 }
        if (r1 == 0) goto L_0x001e;	 Catch:{ NameNotFoundException -> 0x0032 }
    L_0x0019:
        r4 = com.google.android.gms.common.C1781u.m4507b(r4, r2);	 Catch:{ NameNotFoundException -> 0x0032 }
        return r4;	 Catch:{ NameNotFoundException -> 0x0032 }
    L_0x001e:
        r1 = com.google.android.gms.common.C1781u.m4507b(r4, r0);	 Catch:{ NameNotFoundException -> 0x0032 }
        if (r1 != 0) goto L_0x0031;	 Catch:{ NameNotFoundException -> 0x0032 }
    L_0x0024:
        r4 = com.google.android.gms.common.C1781u.m4507b(r4, r2);	 Catch:{ NameNotFoundException -> 0x0032 }
        if (r4 == 0) goto L_0x0031;	 Catch:{ NameNotFoundException -> 0x0032 }
    L_0x002a:
        r4 = "GoogleSignatureVerifier";	 Catch:{ NameNotFoundException -> 0x0032 }
        r2 = "Test-keys aren't accepted on this build.";	 Catch:{ NameNotFoundException -> 0x0032 }
        android.util.Log.w(r4, r2);	 Catch:{ NameNotFoundException -> 0x0032 }
    L_0x0031:
        return r1;
    L_0x0032:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.u.a(java.lang.String):boolean");
    }

    private static boolean m4507b(PackageInfo packageInfo, boolean z) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return false;
        }
        C6580m c7139n = new C7139n(packageInfo.signatures[0].toByteArray());
        String str = packageInfo.packageName;
        boolean b = z ? C1772l.m4484b(str, c7139n) : C1772l.m4482a(str, c7139n);
        if (!b) {
            StringBuilder stringBuilder = new StringBuilder(27);
            stringBuilder.append("Cert not in list. atk=");
            stringBuilder.append(z);
            Log.d("GoogleSignatureVerifier", stringBuilder.toString());
        }
        return b;
    }

    public final boolean m4508a(int i) {
        String[] packagesForUid = dz.m4762a(this.f5450a).f5667a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || packagesForUid.length == 0) {
            return false;
        }
        for (String a : packagesForUid) {
            if (m4506a(a)) {
                return true;
            }
        }
        return false;
    }
}
