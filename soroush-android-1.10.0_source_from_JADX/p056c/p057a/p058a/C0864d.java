package p056c.p057a.p058a;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import p056c.p057a.p062f.C0905a;
import p206d.C5682d;

public final class C0864d implements Closeable, Flushable {
    static final Pattern f2575a = Pattern.compile("[a-z0-9_-]{1,120}");
    static final /* synthetic */ boolean f2576j = true;
    final C0905a f2577b;
    final int f2578c;
    C5682d f2579d;
    final LinkedHashMap<String, C0863b> f2580e;
    int f2581f;
    boolean f2582g;
    boolean f2583h;
    boolean f2584i;
    private long f2585k;
    private long f2586l;
    private final Executor f2587m;
    private final Runnable f2588n;

    public final class C0862a {
        final C0863b f2566a;
        boolean f2567b;
        final /* synthetic */ C0864d f2568c;
    }

    private final class C0863b {
        final String f2569a;
        final long[] f2570b;
        final File[] f2571c;
        final File[] f2572d;
        boolean f2573e;
        C0862a f2574f;

        final void m2021a(C5682d c5682d) {
            for (long l : this.f2570b) {
                c5682d.mo3141h(32).mo3147l(l);
            }
        }
    }

    private synchronized void m2022a(C0862a c0862a) {
        C0863b c0863b = c0862a.f2566a;
        if (c0863b.f2574f != c0862a) {
            throw new IllegalStateException();
        }
        C5682d c5682d;
        for (int i = 0; i < this.f2578c; i++) {
            this.f2577b.mo984a(c0863b.f2572d[i]);
        }
        this.f2581f++;
        c0863b.f2574f = null;
        if ((0 | c0863b.f2573e) != 0) {
            c0863b.f2573e = true;
            this.f2579d.mo3125b("CLEAN").mo3141h(32);
            this.f2579d.mo3125b(c0863b.f2569a);
            c0863b.m2021a(this.f2579d);
            c5682d = this.f2579d;
        } else {
            this.f2580e.remove(c0863b.f2569a);
            this.f2579d.mo3125b("REMOVE").mo3141h(32);
            this.f2579d.mo3125b(c0863b.f2569a);
            c5682d = this.f2579d;
        }
        c5682d.mo3141h(10);
        this.f2579d.flush();
        if (this.f2586l > this.f2585k || m2023a()) {
            this.f2587m.execute(this.f2588n);
        }
    }

    private boolean m2023a() {
        return this.f2581f >= 2000 && this.f2581f >= this.f2580e.size();
    }

    private boolean m2024a(p056c.p057a.p058a.C0864d.C0863b r9) {
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
        r8 = this;
        r0 = r9.f2574f;
        r1 = 0;
        if (r0 == 0) goto L_0x0029;
    L_0x0005:
        r0 = r9.f2574f;
        r2 = r0.f2566a;
        r2 = r2.f2574f;
        if (r2 != r0) goto L_0x0029;
    L_0x000d:
        r2 = r1;
    L_0x000e:
        r3 = r0.f2568c;
        r3 = r3.f2578c;
        if (r2 >= r3) goto L_0x0024;
    L_0x0014:
        r3 = r0.f2568c;	 Catch:{ IOException -> 0x0021 }
        r3 = r3.f2577b;	 Catch:{ IOException -> 0x0021 }
        r4 = r0.f2566a;	 Catch:{ IOException -> 0x0021 }
        r4 = r4.f2572d;	 Catch:{ IOException -> 0x0021 }
        r4 = r4[r2];	 Catch:{ IOException -> 0x0021 }
        r3.mo984a(r4);	 Catch:{ IOException -> 0x0021 }
    L_0x0021:
        r2 = r2 + 1;
        goto L_0x000e;
    L_0x0024:
        r0 = r0.f2566a;
        r2 = 0;
        r0.f2574f = r2;
    L_0x0029:
        r0 = r8.f2578c;
        if (r1 >= r0) goto L_0x0049;
    L_0x002d:
        r0 = r8.f2577b;
        r2 = r9.f2571c;
        r2 = r2[r1];
        r0.mo984a(r2);
        r2 = r8.f2586l;
        r0 = r9.f2570b;
        r4 = r0[r1];
        r6 = r2 - r4;
        r8.f2586l = r6;
        r0 = r9.f2570b;
        r2 = 0;
        r0[r1] = r2;
        r1 = r1 + 1;
        goto L_0x0029;
    L_0x0049:
        r0 = r8.f2581f;
        r1 = 1;
        r0 = r0 + r1;
        r8.f2581f = r0;
        r0 = r8.f2579d;
        r2 = "REMOVE";
        r0 = r0.mo3125b(r2);
        r2 = 32;
        r0 = r0.mo3141h(r2);
        r2 = r9.f2569a;
        r0 = r0.mo3125b(r2);
        r2 = 10;
        r0.mo3141h(r2);
        r0 = r8.f2580e;
        r9 = r9.f2569a;
        r0.remove(r9);
        r9 = r8.m2023a();
        if (r9 == 0) goto L_0x007c;
    L_0x0075:
        r9 = r8.f2587m;
        r0 = r8.f2588n;
        r9.execute(r0);
    L_0x007c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.d.a(c.a.a.d$b):boolean");
    }

    private synchronized boolean m2025b() {
        return this.f2583h;
    }

    private synchronized void m2026c() {
        if (m2025b()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private void m2027d() {
        while (this.f2586l > this.f2585k) {
            m2024a((C0863b) this.f2580e.values().iterator().next());
        }
        this.f2584i = false;
    }

    public final synchronized void close() {
        if (this.f2582g) {
            if (!this.f2583h) {
                for (C0863b c0863b : (C0863b[]) this.f2580e.values().toArray(new C0863b[this.f2580e.size()])) {
                    if (c0863b.f2574f != null) {
                        C0862a c0862a = c0863b.f2574f;
                        synchronized (c0862a.f2568c) {
                            if (c0862a.f2567b) {
                                throw new IllegalStateException();
                            }
                            if (c0862a.f2566a.f2574f == c0862a) {
                                c0862a.f2568c.m2022a(c0862a);
                            }
                            c0862a.f2567b = true;
                        }
                    }
                }
                m2027d();
                this.f2579d.close();
                this.f2579d = null;
                this.f2583h = true;
                return;
            }
        }
        this.f2583h = true;
    }

    public final synchronized void flush() {
        if (this.f2582g) {
            m2026c();
            m2027d();
            this.f2579d.flush();
        }
    }
}
