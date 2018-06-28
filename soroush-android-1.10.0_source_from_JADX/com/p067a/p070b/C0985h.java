package com.p067a.p070b;

import java.util.concurrent.BlockingQueue;

public final class C0985h extends Thread {
    volatile boolean f3165a = false;
    private final BlockingQueue<C0989n<?>> f3166b;
    private final C0984g f3167c;
    private final C0978b f3168d;
    private final C0995q f3169e;

    public C0985h(BlockingQueue<C0989n<?>> blockingQueue, C0984g c0984g, C0978b c0978b, C0995q c0995q) {
        this.f3166b = blockingQueue;
        this.f3167c = c0984g;
        this.f3168d = c0978b;
        this.f3169e = c0995q;
    }

    public final void run() {
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
        r9 = this;
        r0 = 10;
        android.os.Process.setThreadPriority(r0);
    L_0x0005:
        r0 = android.os.SystemClock.elapsedRealtime();
        r2 = r9.f3166b;	 Catch:{ InterruptedException -> 0x00ab }
        r2 = r2.take();	 Catch:{ InterruptedException -> 0x00ab }
        r2 = (com.p067a.p070b.C0989n) r2;	 Catch:{ InterruptedException -> 0x00ab }
        r3 = "network-queue-take";	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        r2.addMarker(r3);	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        r3 = r2.isCanceled();	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        if (r3 == 0) goto L_0x0022;	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
    L_0x001c:
        r3 = "network-discard-cancelled";	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
    L_0x001e:
        r2.finish(r3);	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        goto L_0x0005;	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
    L_0x0022:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        r4 = 14;	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        if (r3 < r4) goto L_0x002f;	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
    L_0x0028:
        r3 = r2.getTrafficStatsTag();	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        android.net.TrafficStats.setThreadStatsTag(r3);	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
    L_0x002f:
        r3 = r9.f3167c;	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        r3 = r3.mo1031a(r2);	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        r4 = "network-http-complete";	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        r2.addMarker(r4);	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        r4 = r3.f3173d;	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        if (r4 == 0) goto L_0x0047;	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
    L_0x003e:
        r4 = r2.hasHadResponseDelivered();	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        if (r4 == 0) goto L_0x0047;	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
    L_0x0044:
        r3 = "not-modified";	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        goto L_0x001e;	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
    L_0x0047:
        r3 = r2.parseNetworkResponse(r3);	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        r4 = "network-parse-complete";	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        r2.addMarker(r4);	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        r4 = r2.shouldCache();	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        if (r4 == 0) goto L_0x006a;	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
    L_0x0056:
        r4 = r3.f3195b;	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        if (r4 == 0) goto L_0x006a;	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
    L_0x005a:
        r4 = r9.f3168d;	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        r5 = r2.getCacheKey();	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        r6 = r3.f3195b;	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        r4.mo1034a(r5, r6);	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        r4 = "network-cache-written";	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        r2.addMarker(r4);	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
    L_0x006a:
        r2.markDelivered();	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        r4 = r9.f3169e;	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        r4.mo1046a(r2, r3);	 Catch:{ u -> 0x0097, Exception -> 0x0073 }
        goto L_0x0005;
    L_0x0073:
        r3 = move-exception;
        r4 = "Unhandled exception %s";
        r5 = 1;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r7 = r3.toString();
        r5[r6] = r7;
        com.p067a.p070b.C1000v.m2455a(r3, r4, r5);
        r4 = new com.a.b.u;
        r4.<init>(r3);
        r5 = android.os.SystemClock.elapsedRealtime();
        r7 = r5 - r0;
        r4.f3199b = r7;
        r0 = r9.f3169e;
        r0.mo1048a(r2, r4);
        goto L_0x0005;
    L_0x0097:
        r3 = move-exception;
        r4 = android.os.SystemClock.elapsedRealtime();
        r6 = r4 - r0;
        r3.f3199b = r6;
        r0 = r2.parseNetworkError(r3);
        r1 = r9.f3169e;
        r1.mo1048a(r2, r0);
        goto L_0x0005;
    L_0x00ab:
        r0 = r9.f3165a;
        if (r0 == 0) goto L_0x0005;
    L_0x00af:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.b.h.run():void");
    }
}
