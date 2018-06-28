package ir.pec.mpl.pecpayment.p209a.p210a;

import android.os.Build;
import java.io.File;

public class C2341c {
    public static boolean m6344a() {
        if (!(C2341c.m6345b() || C2341c.m6346c())) {
            if (!C2341c.m6347d()) {
                return false;
            }
        }
        return true;
    }

    private static boolean m6345b() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    private static boolean m6346c() {
        String[] strArr = new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i = 0; i < 10; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    private static boolean m6347d() {
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
        r1 = 0;
        r2 = java.lang.Runtime.getRuntime();	 Catch:{ Throwable -> 0x0042, all -> 0x003b }
        r3 = 2;	 Catch:{ Throwable -> 0x0042, all -> 0x003b }
        r3 = new java.lang.String[r3];	 Catch:{ Throwable -> 0x0042, all -> 0x003b }
        r4 = "/system/xbin/which";	 Catch:{ Throwable -> 0x0042, all -> 0x003b }
        r3[r0] = r4;	 Catch:{ Throwable -> 0x0042, all -> 0x003b }
        r4 = "su";	 Catch:{ Throwable -> 0x0042, all -> 0x003b }
        r5 = 1;	 Catch:{ Throwable -> 0x0042, all -> 0x003b }
        r3[r5] = r4;	 Catch:{ Throwable -> 0x0042, all -> 0x003b }
        r2 = r2.exec(r3);	 Catch:{ Throwable -> 0x0042, all -> 0x003b }
        r1 = new java.io.BufferedReader;	 Catch:{ Throwable -> 0x0039, all -> 0x0036 }
        r3 = new java.io.InputStreamReader;	 Catch:{ Throwable -> 0x0039, all -> 0x0036 }
        r4 = r2.getInputStream();	 Catch:{ Throwable -> 0x0039, all -> 0x0036 }
        r3.<init>(r4);	 Catch:{ Throwable -> 0x0039, all -> 0x0036 }
        r1.<init>(r3);	 Catch:{ Throwable -> 0x0039, all -> 0x0036 }
        r1 = r1.readLine();	 Catch:{ Throwable -> 0x0039, all -> 0x0036 }
        if (r1 == 0) goto L_0x0030;
    L_0x002a:
        if (r2 == 0) goto L_0x002f;
    L_0x002c:
        r2.destroy();
    L_0x002f:
        return r5;
    L_0x0030:
        if (r2 == 0) goto L_0x0035;
    L_0x0032:
        r2.destroy();
    L_0x0035:
        return r0;
    L_0x0036:
        r0 = move-exception;
        r1 = r2;
        goto L_0x003c;
    L_0x0039:
        r1 = r2;
        goto L_0x0042;
    L_0x003b:
        r0 = move-exception;
    L_0x003c:
        if (r1 == 0) goto L_0x0041;
    L_0x003e:
        r1.destroy();
    L_0x0041:
        throw r0;
    L_0x0042:
        if (r1 == 0) goto L_0x0047;
    L_0x0044:
        r1.destroy();
    L_0x0047:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.pec.mpl.pecpayment.a.a.c.d():boolean");
    }
}
