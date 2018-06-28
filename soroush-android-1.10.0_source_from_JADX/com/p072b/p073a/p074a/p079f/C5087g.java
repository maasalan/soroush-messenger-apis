package com.p072b.p073a.p074a.p079f;

import com.p072b.p073a.p074a.p084j.C1065b;
import java.util.concurrent.atomic.AtomicBoolean;

public final class C5087g implements C1036e {
    public final Object f14199a = new Object();
    public final C1039j[] f14200b;
    public final C1032a f14201c;
    public final C1065b f14202d;
    public final AtomicBoolean f14203e = new AtomicBoolean(false);
    public boolean f14204f = false;
    public final C1034c f14205g;

    public C5087g(C1065b c1065b, C1034c c1034c) {
        this.f14201c = new C1032a(c1034c);
        this.f14205g = c1034c;
        this.f14200b = new C1039j[(C1038i.f3354o + 1)];
        this.f14202d = c1065b;
    }

    public final com.p072b.p073a.p074a.p079f.C1033b m10370a(com.p072b.p073a.p074a.p079f.C1037f r11) {
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
        r10 = this;
        r0 = 0;
        r1 = r0;
    L_0x0002:
        r2 = r10.f14203e;
        r2 = r2.get();
        if (r2 == 0) goto L_0x009c;
    L_0x000a:
        r2 = r10.f14199a;
        monitor-enter(r2);
        r3 = r10.f14202d;	 Catch:{ all -> 0x0099 }
        r3 = r3.mo1091a();	 Catch:{ all -> 0x0099 }
        r5 = 2;	 Catch:{ all -> 0x0099 }
        r6 = new java.lang.Object[r5];	 Catch:{ all -> 0x0099 }
        r7 = "priority_mq";	 Catch:{ all -> 0x0099 }
        r6[r0] = r7;	 Catch:{ all -> 0x0099 }
        r7 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x0099 }
        r8 = 1;	 Catch:{ all -> 0x0099 }
        r6[r8] = r7;	 Catch:{ all -> 0x0099 }
        com.p072b.p073a.p074a.p078e.C1028b.m2507b();	 Catch:{ all -> 0x0099 }
        r6 = r10.f14201c;	 Catch:{ all -> 0x0099 }
        r6 = r6.m2515a(r3, r10);	 Catch:{ all -> 0x0099 }
        r7 = new java.lang.Object[r5];	 Catch:{ all -> 0x0099 }
        r9 = "priority_mq";	 Catch:{ all -> 0x0099 }
        r7[r0] = r9;	 Catch:{ all -> 0x0099 }
        r7[r8] = r6;	 Catch:{ all -> 0x0099 }
        com.p072b.p073a.p074a.p078e.C1028b.m2507b();	 Catch:{ all -> 0x0099 }
        r7 = com.p072b.p073a.p074a.p079f.C1038i.f3354o;	 Catch:{ all -> 0x0099 }
    L_0x0037:
        if (r7 < 0) goto L_0x004a;	 Catch:{ all -> 0x0099 }
    L_0x0039:
        r9 = r10.f14200b;	 Catch:{ all -> 0x0099 }
        r9 = r9[r7];	 Catch:{ all -> 0x0099 }
        if (r9 == 0) goto L_0x0047;	 Catch:{ all -> 0x0099 }
    L_0x003f:
        r9 = r9.m2526c();	 Catch:{ all -> 0x0099 }
        if (r9 == 0) goto L_0x0047;	 Catch:{ all -> 0x0099 }
    L_0x0045:
        monitor-exit(r2);	 Catch:{ all -> 0x0099 }
        return r9;	 Catch:{ all -> 0x0099 }
    L_0x0047:
        r7 = r7 + -1;	 Catch:{ all -> 0x0099 }
        goto L_0x0037;	 Catch:{ all -> 0x0099 }
    L_0x004a:
        r10.f14204f = r0;	 Catch:{ all -> 0x0099 }
        monitor-exit(r2);	 Catch:{ all -> 0x0099 }
        if (r1 != 0) goto L_0x0053;
    L_0x004f:
        r11.mo1074a();
        r1 = r8;
    L_0x0053:
        r7 = r10.f14199a;
        monitor-enter(r7);
        r2 = new java.lang.Object[r5];	 Catch:{ all -> 0x0096 }
        r5 = "priority_mq";	 Catch:{ all -> 0x0096 }
        r2[r0] = r5;	 Catch:{ all -> 0x0096 }
        r5 = r10.f14204f;	 Catch:{ all -> 0x0096 }
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ all -> 0x0096 }
        r2[r8] = r5;	 Catch:{ all -> 0x0096 }
        com.p072b.p073a.p074a.p078e.C1028b.m2507b();	 Catch:{ all -> 0x0096 }
        r2 = r10.f14204f;	 Catch:{ all -> 0x0096 }
        if (r2 == 0) goto L_0x006d;	 Catch:{ all -> 0x0096 }
    L_0x006b:
        monitor-exit(r7);	 Catch:{ all -> 0x0096 }
        goto L_0x0002;	 Catch:{ all -> 0x0096 }
    L_0x006d:
        if (r6 == 0) goto L_0x0078;	 Catch:{ all -> 0x0096 }
    L_0x006f:
        r8 = r6.longValue();	 Catch:{ all -> 0x0096 }
        r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));	 Catch:{ all -> 0x0096 }
        if (r2 > 0) goto L_0x0078;	 Catch:{ all -> 0x0096 }
    L_0x0077:
        goto L_0x006b;	 Catch:{ all -> 0x0096 }
    L_0x0078:
        r2 = r10.f14203e;	 Catch:{ all -> 0x0096 }
        r2 = r2.get();	 Catch:{ all -> 0x0096 }
        if (r2 == 0) goto L_0x006b;
    L_0x0080:
        if (r6 != 0) goto L_0x008a;
    L_0x0082:
        r2 = r10.f14202d;	 Catch:{ InterruptedException -> 0x006b }
        r3 = r10.f14199a;	 Catch:{ InterruptedException -> 0x006b }
        r2.mo1092a(r3);	 Catch:{ InterruptedException -> 0x006b }
        goto L_0x006b;	 Catch:{ InterruptedException -> 0x006b }
    L_0x008a:
        r2 = r10.f14202d;	 Catch:{ InterruptedException -> 0x006b }
        r3 = r10.f14199a;	 Catch:{ InterruptedException -> 0x006b }
        r4 = r6.longValue();	 Catch:{ InterruptedException -> 0x006b }
        r2.mo1093a(r3, r4);	 Catch:{ InterruptedException -> 0x006b }
        goto L_0x006b;
    L_0x0096:
        r11 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x0096 }
        throw r11;
    L_0x0099:
        r11 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0099 }
        throw r11;
    L_0x009c:
        r11 = 0;
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.a.f.g.a(com.b.a.a.f.f):com.b.a.a.f.b");
    }

    public final void mo1082a(C1033b c1033b) {
        synchronized (this.f14199a) {
            this.f14204f = true;
            int i = c1033b.f3337a.f3357n;
            if (this.f14200b[i] == null) {
                C1039j[] c1039jArr = this.f14200b;
                C1034c c1034c = this.f14205g;
                StringBuilder stringBuilder = new StringBuilder("queue_");
                stringBuilder.append(c1033b.f3337a.name());
                c1039jArr[i] = new C1039j(c1034c, stringBuilder.toString());
            }
            this.f14200b[i].mo1082a(c1033b);
            this.f14202d.mo1094b(this.f14199a);
        }
    }
}
