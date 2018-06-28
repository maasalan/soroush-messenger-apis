package com.p072b.p073a.p074a.p079f;

import com.p072b.p073a.p074a.p078e.C1028b;
import com.p072b.p073a.p074a.p084j.C1065b;
import java.util.concurrent.atomic.AtomicBoolean;

public final class C5088h extends C1039j implements C1036e {
    public final Object f14206a = new Object();
    public final C1065b f14207b;
    public final C1032a f14208c;
    public boolean f14209d = false;
    private final AtomicBoolean f14210i = new AtomicBoolean(false);
    private final C1034c f14211j;

    public C5088h(C1065b c1065b, C1034c c1034c, String str) {
        super(c1034c, str);
        this.f14211j = c1034c;
        this.f14207b = c1065b;
        this.f14208c = new C1032a(c1034c);
    }

    private com.p072b.p073a.p074a.p079f.C1033b m10372b(com.p072b.p073a.p074a.p079f.C1037f r11) {
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
        r2 = r10.f14210i;
        r2 = r2.get();
        if (r2 == 0) goto L_0x0081;
    L_0x000a:
        r2 = r10.f14206a;
        monitor-enter(r2);
        r3 = r10.f14207b;	 Catch:{ all -> 0x007e }
        r3 = r3.mo1091a();	 Catch:{ all -> 0x007e }
        r5 = r10.f14208c;	 Catch:{ all -> 0x007e }
        r5 = r5.m2515a(r3, r10);	 Catch:{ all -> 0x007e }
        r6 = super.m2526c();	 Catch:{ all -> 0x007e }
        if (r6 == 0) goto L_0x0021;	 Catch:{ all -> 0x007e }
    L_0x001f:
        monitor-exit(r2);	 Catch:{ all -> 0x007e }
        return r6;	 Catch:{ all -> 0x007e }
    L_0x0021:
        r10.f14209d = r0;	 Catch:{ all -> 0x007e }
        monitor-exit(r2);	 Catch:{ all -> 0x007e }
        r2 = 1;
        if (r1 != 0) goto L_0x002b;
    L_0x0027:
        r11.mo1074a();
        r1 = r2;
    L_0x002b:
        r6 = r10.f14206a;
        monitor-enter(r6);
        r7 = r10.f14209d;	 Catch:{ all -> 0x007b }
        if (r7 == 0) goto L_0x0034;	 Catch:{ all -> 0x007b }
    L_0x0032:
        monitor-exit(r6);	 Catch:{ all -> 0x007b }
        goto L_0x0002;	 Catch:{ all -> 0x007b }
    L_0x0034:
        if (r5 == 0) goto L_0x0048;	 Catch:{ all -> 0x007b }
    L_0x0036:
        r7 = r5.longValue();	 Catch:{ all -> 0x007b }
        r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));	 Catch:{ all -> 0x007b }
        if (r9 > 0) goto L_0x0048;	 Catch:{ all -> 0x007b }
    L_0x003e:
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x007b }
        r3 = r10.g;	 Catch:{ all -> 0x007b }
        r2[r0] = r3;	 Catch:{ all -> 0x007b }
        com.p072b.p073a.p074a.p078e.C1028b.m2507b();	 Catch:{ all -> 0x007b }
        goto L_0x0032;	 Catch:{ all -> 0x007b }
    L_0x0048:
        r3 = r10.f14210i;	 Catch:{ all -> 0x007b }
        r3 = r3.get();	 Catch:{ all -> 0x007b }
        if (r3 == 0) goto L_0x0032;
    L_0x0050:
        if (r5 != 0) goto L_0x0063;
    L_0x0052:
        r2 = new java.lang.Object[r2];	 Catch:{ InterruptedException -> 0x0032 }
        r3 = r10.g;	 Catch:{ InterruptedException -> 0x0032 }
        r2[r0] = r3;	 Catch:{ InterruptedException -> 0x0032 }
        com.p072b.p073a.p074a.p078e.C1028b.m2507b();	 Catch:{ InterruptedException -> 0x0032 }
        r2 = r10.f14207b;	 Catch:{ InterruptedException -> 0x0032 }
        r3 = r10.f14206a;	 Catch:{ InterruptedException -> 0x0032 }
        r2.mo1092a(r3);	 Catch:{ InterruptedException -> 0x0032 }
        goto L_0x0032;	 Catch:{ InterruptedException -> 0x0032 }
    L_0x0063:
        r3 = 2;	 Catch:{ InterruptedException -> 0x0032 }
        r3 = new java.lang.Object[r3];	 Catch:{ InterruptedException -> 0x0032 }
        r4 = r10.g;	 Catch:{ InterruptedException -> 0x0032 }
        r3[r0] = r4;	 Catch:{ InterruptedException -> 0x0032 }
        r3[r2] = r5;	 Catch:{ InterruptedException -> 0x0032 }
        com.p072b.p073a.p074a.p078e.C1028b.m2507b();	 Catch:{ InterruptedException -> 0x0032 }
        r2 = r10.f14207b;	 Catch:{ InterruptedException -> 0x0032 }
        r3 = r10.f14206a;	 Catch:{ InterruptedException -> 0x0032 }
        r4 = r5.longValue();	 Catch:{ InterruptedException -> 0x0032 }
        r2.mo1093a(r3, r4);	 Catch:{ InterruptedException -> 0x0032 }
        goto L_0x0032;
    L_0x007b:
        r11 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x007b }
        throw r11;
    L_0x007e:
        r11 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x007e }
        throw r11;
    L_0x0081:
        r11 = 0;
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.a.f.h.b(com.b.a.a.f.f):com.b.a.a.f.b");
    }

    public final void m10373a() {
        this.f14210i.set(false);
        synchronized (this.f14206a) {
            this.f14207b.mo1094b(this.f14206a);
        }
    }

    public final void mo1082a(C1033b c1033b) {
        synchronized (this.f14206a) {
            this.f14209d = true;
            super.mo1082a(c1033b);
            this.f14207b.mo1094b(this.f14206a);
        }
    }

    public final void m10375a(C1037f c1037f) {
        if (this.f14210i.getAndSet(true)) {
            throw new IllegalStateException("only 1 consumer per MQ");
        }
        while (this.f14210i.get()) {
            C1033b b = m10372b(c1037f);
            if (b != null) {
                c1037f.mo1075a(b);
                this.f14211j.m2519a(b);
            }
        }
        new Object[1][0] = this.g;
        C1028b.m2507b();
    }

    public final void mo1083b() {
        synchronized (this.f14206a) {
            super.mo1083b();
        }
    }
}
