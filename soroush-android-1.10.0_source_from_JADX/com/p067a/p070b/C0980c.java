package com.p067a.p070b;

import java.util.concurrent.BlockingQueue;

public final class C0980c extends Thread {
    private static final boolean f3152b = C1000v.f3207b;
    volatile boolean f3153a = false;
    private final BlockingQueue<C0989n<?>> f3154c;
    private final BlockingQueue<C0989n<?>> f3155d;
    private final C0978b f3156e;
    private final C0995q f3157f;

    public C0980c(BlockingQueue<C0989n<?>> blockingQueue, BlockingQueue<C0989n<?>> blockingQueue2, C0978b c0978b, C0995q c0995q) {
        this.f3154c = blockingQueue;
        this.f3155d = blockingQueue2;
        this.f3156e = c0978b;
        this.f3157f = c0995q;
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
        r10 = this;
        r0 = f3152b;
        r1 = 0;
        if (r0 == 0) goto L_0x000c;
    L_0x0005:
        r0 = "start new dispatcher";
        r2 = new java.lang.Object[r1];
        com.p067a.p070b.C1000v.m2454a(r0, r2);
    L_0x000c:
        r0 = 10;
        android.os.Process.setThreadPriority(r0);
        r0 = r10.f3156e;
        r0.mo1033a();
    L_0x0016:
        r0 = r10.f3154c;	 Catch:{ InterruptedException -> 0x00b3 }
        r0 = r0.take();	 Catch:{ InterruptedException -> 0x00b3 }
        r0 = (com.p067a.p070b.C0989n) r0;	 Catch:{ InterruptedException -> 0x00b3 }
        r2 = 1;
        r3 = "cache-queue-take";	 Catch:{ Exception -> 0x00a3 }
        r0.addMarker(r3);	 Catch:{ Exception -> 0x00a3 }
        r3 = r0.isCanceled();	 Catch:{ Exception -> 0x00a3 }
        if (r3 == 0) goto L_0x0030;	 Catch:{ Exception -> 0x00a3 }
    L_0x002a:
        r3 = "cache-discard-canceled";	 Catch:{ Exception -> 0x00a3 }
        r0.finish(r3);	 Catch:{ Exception -> 0x00a3 }
        goto L_0x0016;	 Catch:{ Exception -> 0x00a3 }
    L_0x0030:
        r3 = r10.f3156e;	 Catch:{ Exception -> 0x00a3 }
        r4 = r0.getCacheKey();	 Catch:{ Exception -> 0x00a3 }
        r3 = r3.mo1032a(r4);	 Catch:{ Exception -> 0x00a3 }
        if (r3 != 0) goto L_0x0047;	 Catch:{ Exception -> 0x00a3 }
    L_0x003c:
        r3 = "cache-miss";	 Catch:{ Exception -> 0x00a3 }
        r0.addMarker(r3);	 Catch:{ Exception -> 0x00a3 }
        r3 = r10.f3155d;	 Catch:{ Exception -> 0x00a3 }
    L_0x0043:
        r3.put(r0);	 Catch:{ Exception -> 0x00a3 }
        goto L_0x0016;	 Catch:{ Exception -> 0x00a3 }
    L_0x0047:
        r4 = r3.f3147e;	 Catch:{ Exception -> 0x00a3 }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x00a3 }
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ Exception -> 0x00a3 }
        if (r8 >= 0) goto L_0x0053;	 Catch:{ Exception -> 0x00a3 }
    L_0x0051:
        r4 = r2;	 Catch:{ Exception -> 0x00a3 }
        goto L_0x0054;	 Catch:{ Exception -> 0x00a3 }
    L_0x0053:
        r4 = r1;	 Catch:{ Exception -> 0x00a3 }
    L_0x0054:
        if (r4 == 0) goto L_0x0061;	 Catch:{ Exception -> 0x00a3 }
    L_0x0056:
        r4 = "cache-hit-expired";	 Catch:{ Exception -> 0x00a3 }
        r0.addMarker(r4);	 Catch:{ Exception -> 0x00a3 }
        r0.setCacheEntry(r3);	 Catch:{ Exception -> 0x00a3 }
        r3 = r10.f3155d;	 Catch:{ Exception -> 0x00a3 }
        goto L_0x0043;	 Catch:{ Exception -> 0x00a3 }
    L_0x0061:
        r4 = "cache-hit";	 Catch:{ Exception -> 0x00a3 }
        r0.addMarker(r4);	 Catch:{ Exception -> 0x00a3 }
        r4 = new com.a.b.j;	 Catch:{ Exception -> 0x00a3 }
        r5 = r3.f3143a;	 Catch:{ Exception -> 0x00a3 }
        r6 = r3.f3149g;	 Catch:{ Exception -> 0x00a3 }
        r4.<init>(r5, r6);	 Catch:{ Exception -> 0x00a3 }
        r4 = r0.parseNetworkResponse(r4);	 Catch:{ Exception -> 0x00a3 }
        r5 = "cache-hit-parsed";	 Catch:{ Exception -> 0x00a3 }
        r0.addMarker(r5);	 Catch:{ Exception -> 0x00a3 }
        r5 = r3.f3148f;	 Catch:{ Exception -> 0x00a3 }
        r7 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x00a3 }
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));	 Catch:{ Exception -> 0x00a3 }
        if (r9 >= 0) goto L_0x0084;	 Catch:{ Exception -> 0x00a3 }
    L_0x0082:
        r5 = r2;	 Catch:{ Exception -> 0x00a3 }
        goto L_0x0085;	 Catch:{ Exception -> 0x00a3 }
    L_0x0084:
        r5 = r1;	 Catch:{ Exception -> 0x00a3 }
    L_0x0085:
        if (r5 != 0) goto L_0x008d;	 Catch:{ Exception -> 0x00a3 }
    L_0x0087:
        r3 = r10.f3157f;	 Catch:{ Exception -> 0x00a3 }
        r3.mo1046a(r0, r4);	 Catch:{ Exception -> 0x00a3 }
        goto L_0x0016;	 Catch:{ Exception -> 0x00a3 }
    L_0x008d:
        r5 = "cache-hit-refresh-needed";	 Catch:{ Exception -> 0x00a3 }
        r0.addMarker(r5);	 Catch:{ Exception -> 0x00a3 }
        r0.setCacheEntry(r3);	 Catch:{ Exception -> 0x00a3 }
        r4.f3197d = r2;	 Catch:{ Exception -> 0x00a3 }
        r3 = r10.f3157f;	 Catch:{ Exception -> 0x00a3 }
        r5 = new com.a.b.c$1;	 Catch:{ Exception -> 0x00a3 }
        r5.<init>(r10, r0);	 Catch:{ Exception -> 0x00a3 }
        r3.mo1047a(r0, r4, r5);	 Catch:{ Exception -> 0x00a3 }
        goto L_0x0016;
    L_0x00a3:
        r0 = move-exception;
        r3 = "Unhandled exception %s";
        r2 = new java.lang.Object[r2];
        r4 = r0.toString();
        r2[r1] = r4;
        com.p067a.p070b.C1000v.m2455a(r0, r3, r2);
        goto L_0x0016;
    L_0x00b3:
        r0 = r10.f3153a;
        if (r0 == 0) goto L_0x0016;
    L_0x00b7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.b.c.run():void");
    }
}
