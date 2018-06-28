package com.google.android.gms.internal;

import android.content.Context;
import android.util.Log;

public final class nl {
    public static int m5039a(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (i < 4 && i < bArr.length) {
            i2 |= (bArr[i] & 255) << (i << 3);
            i++;
        }
        return i2;
    }

    public static java.lang.String m5040a(java.lang.String r3) {
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
        r0 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x002d }
        r0.<init>(r3);	 Catch:{ MalformedURLException -> 0x002d }
        r1 = r0.getQuery();
        if (r1 == 0) goto L_0x0016;
    L_0x000b:
        r1 = r3.indexOf(r1);
        r2 = 0;
        r1 = r1 + -1;
        r3 = r3.substring(r2, r1);
    L_0x0016:
        r0 = r0.getUserInfo();
        if (r0 != 0) goto L_0x001d;
    L_0x001c:
        return r3;
    L_0x001d:
        r0 = java.lang.String.valueOf(r0);
        r1 = "@";
        r0 = r0.concat(r1);
        r1 = "";
        r3 = r3.replace(r0, r1);
    L_0x002d:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nl.a(java.lang.String):java.lang.String");
    }

    public static boolean m5041a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false);
        } catch (Exception e) {
            String str = "isEnabled";
            String str2 = "No perf logcat meta data found ";
            String valueOf = String.valueOf(e.getMessage());
            Log.d(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
            return false;
        }
    }

    public static java.lang.String m5042b(java.lang.String r4) {
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
        r0 = r4.length();
        r1 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        if (r0 > r1) goto L_0x0009;
    L_0x0008:
        return r4;
    L_0x0009:
        r0 = r4.charAt(r1);
        r2 = 47;
        r3 = 0;
        if (r0 != r2) goto L_0x0017;
    L_0x0012:
        r4 = r4.substring(r3, r1);
        return r4;
    L_0x0017:
        r0 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x0038 }
        r0.<init>(r4);	 Catch:{ MalformedURLException -> 0x0038 }
        r0 = r0.getPath();
        r0 = r0.lastIndexOf(r2);
        if (r0 < 0) goto L_0x0033;
    L_0x0026:
        r0 = 1999; // 0x7cf float:2.801E-42 double:9.876E-321;
        r0 = r4.lastIndexOf(r2, r0);
        if (r0 < 0) goto L_0x0033;
    L_0x002e:
        r4 = r4.substring(r3, r0);
        return r4;
    L_0x0033:
        r4 = r4.substring(r3, r1);
        return r4;
    L_0x0038:
        r4 = r4.substring(r3, r1);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nl.b(java.lang.String):java.lang.String");
    }
}
