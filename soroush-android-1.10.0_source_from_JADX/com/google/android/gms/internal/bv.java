package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.ac;

public final class bv {
    static Object f5612a = new Object();
    static ly f5613b;
    private static Boolean f5614c;

    public static void m4632a(android.content.Context r13, android.content.Intent r14) {
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
        r0 = com.google.android.gms.internal.C1827x.m5158a(r13);
        r0 = r0.m5160a();
        if (r14 != 0) goto L_0x0010;
    L_0x000a:
        r13 = "AnalyticsReceiver called with null intent";
        r0.m5153e(r13);
        return;
    L_0x0010:
        r14 = r14.getAction();
        r1 = "Local AnalyticsReceiver got";
        r0.m5140a(r1, r14);
        r1 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH";
        r14 = r1.equals(r14);
        if (r14 == 0) goto L_0x00e7;
    L_0x0021:
        r14 = com.google.android.gms.internal.bw.m4634a(r13);
        r1 = new android.content.Intent;
        r2 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH";
        r1.<init>(r2);
        r2 = new android.content.ComponentName;
        r3 = "com.google.android.gms.analytics.AnalyticsService";
        r2.<init>(r13, r3);
        r1.setComponent(r2);
        r2 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH";
        r1.setAction(r2);
        r2 = f5612a;
        monitor-enter(r2);
        r13.startService(r1);	 Catch:{ all -> 0x00e4 }
        if (r14 != 0) goto L_0x0045;	 Catch:{ all -> 0x00e4 }
    L_0x0043:
        monitor-exit(r2);	 Catch:{ all -> 0x00e4 }
        return;
    L_0x0045:
        r14 = f5613b;	 Catch:{ SecurityException -> 0x00dd }
        r1 = 0;	 Catch:{ SecurityException -> 0x00dd }
        if (r14 != 0) goto L_0x005a;	 Catch:{ SecurityException -> 0x00dd }
    L_0x004a:
        r14 = new com.google.android.gms.internal.ly;	 Catch:{ SecurityException -> 0x00dd }
        r3 = "Analytics WakeLock";	 Catch:{ SecurityException -> 0x00dd }
        r14.<init>(r13, r3);	 Catch:{ SecurityException -> 0x00dd }
        f5613b = r14;	 Catch:{ SecurityException -> 0x00dd }
        r13 = r14.f6111a;	 Catch:{ SecurityException -> 0x00dd }
        r13.setReferenceCounted(r1);	 Catch:{ SecurityException -> 0x00dd }
        r14.f6116f = r1;	 Catch:{ SecurityException -> 0x00dd }
    L_0x005a:
        r13 = f5613b;	 Catch:{ SecurityException -> 0x00dd }
        r7 = r13.m4976a();	 Catch:{ SecurityException -> 0x00dd }
        monitor-enter(r13);	 Catch:{ SecurityException -> 0x00dd }
        r14 = r13.f6117g;	 Catch:{ all -> 0x00da }
        r14 = r14.isEmpty();	 Catch:{ all -> 0x00da }
        if (r14 == 0) goto L_0x006d;	 Catch:{ all -> 0x00da }
    L_0x0069:
        r14 = r13.f6118h;	 Catch:{ all -> 0x00da }
        if (r14 <= 0) goto L_0x007c;	 Catch:{ all -> 0x00da }
    L_0x006d:
        r14 = r13.f6111a;	 Catch:{ all -> 0x00da }
        r14 = r14.isHeld();	 Catch:{ all -> 0x00da }
        if (r14 != 0) goto L_0x007c;	 Catch:{ all -> 0x00da }
    L_0x0075:
        r14 = r13.f6117g;	 Catch:{ all -> 0x00da }
        r14.clear();	 Catch:{ all -> 0x00da }
        r13.f6118h = r1;	 Catch:{ all -> 0x00da }
    L_0x007c:
        r14 = r13.f6116f;	 Catch:{ all -> 0x00da }
        r12 = 1;	 Catch:{ all -> 0x00da }
        if (r14 == 0) goto L_0x00a9;	 Catch:{ all -> 0x00da }
    L_0x0081:
        r14 = r13.f6117g;	 Catch:{ all -> 0x00da }
        r14 = r14.get(r7);	 Catch:{ all -> 0x00da }
        r14 = (java.lang.Integer[]) r14;	 Catch:{ all -> 0x00da }
        if (r14 != 0) goto L_0x009a;	 Catch:{ all -> 0x00da }
    L_0x008b:
        r14 = r13.f6117g;	 Catch:{ all -> 0x00da }
        r3 = new java.lang.Integer[r12];	 Catch:{ all -> 0x00da }
        r4 = java.lang.Integer.valueOf(r12);	 Catch:{ all -> 0x00da }
        r3[r1] = r4;	 Catch:{ all -> 0x00da }
        r14.put(r7, r3);	 Catch:{ all -> 0x00da }
        r1 = r12;	 Catch:{ all -> 0x00da }
        goto L_0x00a7;	 Catch:{ all -> 0x00da }
    L_0x009a:
        r3 = r14[r1];	 Catch:{ all -> 0x00da }
        r3 = r3.intValue();	 Catch:{ all -> 0x00da }
        r3 = r3 + r12;	 Catch:{ all -> 0x00da }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x00da }
        r14[r1] = r3;	 Catch:{ all -> 0x00da }
    L_0x00a7:
        if (r1 != 0) goto L_0x00b1;	 Catch:{ all -> 0x00da }
    L_0x00a9:
        r14 = r13.f6116f;	 Catch:{ all -> 0x00da }
        if (r14 != 0) goto L_0x00d1;	 Catch:{ all -> 0x00da }
    L_0x00ad:
        r14 = r13.f6118h;	 Catch:{ all -> 0x00da }
        if (r14 != 0) goto L_0x00d1;	 Catch:{ all -> 0x00da }
    L_0x00b1:
        com.google.android.gms.common.stats.C1779e.m4489a();	 Catch:{ all -> 0x00da }
        r3 = r13.f6115e;	 Catch:{ all -> 0x00da }
        r14 = r13.f6111a;	 Catch:{ all -> 0x00da }
        r4 = com.google.android.gms.common.stats.C1777c.m4488a(r14, r7);	 Catch:{ all -> 0x00da }
        r5 = 7;	 Catch:{ all -> 0x00da }
        r6 = r13.f6114d;	 Catch:{ all -> 0x00da }
        r8 = r13.f6113c;	 Catch:{ all -> 0x00da }
        r14 = r13.f6112b;	 Catch:{ all -> 0x00da }
        r9 = com.google.android.gms.common.util.C1799s.m4547a(r14);	 Catch:{ all -> 0x00da }
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ all -> 0x00da }
        com.google.android.gms.common.stats.C1779e.m4490a(r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ all -> 0x00da }
        r14 = r13.f6118h;	 Catch:{ all -> 0x00da }
        r14 = r14 + r12;	 Catch:{ all -> 0x00da }
        r13.f6118h = r14;	 Catch:{ all -> 0x00da }
    L_0x00d1:
        monitor-exit(r13);	 Catch:{ all -> 0x00da }
        r13 = r13.f6111a;	 Catch:{ SecurityException -> 0x00dd }
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ SecurityException -> 0x00dd }
        r13.acquire(r3);	 Catch:{ SecurityException -> 0x00dd }
        goto L_0x00e2;
    L_0x00da:
        r14 = move-exception;
        monitor-exit(r13);	 Catch:{ all -> 0x00da }
        throw r14;	 Catch:{ SecurityException -> 0x00dd }
    L_0x00dd:
        r13 = "Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.";	 Catch:{ all -> 0x00e4 }
        r0.m5153e(r13);	 Catch:{ all -> 0x00e4 }
    L_0x00e2:
        monitor-exit(r2);	 Catch:{ all -> 0x00e4 }
        return;	 Catch:{ all -> 0x00e4 }
    L_0x00e4:
        r13 = move-exception;	 Catch:{ all -> 0x00e4 }
        monitor-exit(r2);	 Catch:{ all -> 0x00e4 }
        throw r13;
    L_0x00e7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bv.a(android.content.Context, android.content.Intent):void");
    }

    public static boolean m4633a(Context context) {
        ac.m4376a((Object) context);
        if (f5614c != null) {
            return f5614c.booleanValue();
        }
        boolean a = ce.m4652a(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        f5614c = Boolean.valueOf(a);
        return a;
    }
}
