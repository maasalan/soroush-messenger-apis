package p056c.p057a.p061e;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import p056c.p057a.C0874b;
import p056c.p057a.C0885c;
import p056c.p057a.p061e.C0897h.C0896b;
import p206d.C2272f;
import p206d.C5682d;
import p206d.C5683e;
import p206d.C6623c;

public final class C0895g implements Closeable {
    static final /* synthetic */ boolean f2706t = true;
    private static final ExecutorService f2707u = new ThreadPoolExecutor(0, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), C0885c.m2096a("OkHttp Http2Connection", true));
    final boolean f2708a;
    final C0894b f2709b;
    final Map<Integer, C0898i> f2710c = new LinkedHashMap();
    final String f2711d;
    int f2712e;
    int f2713f;
    boolean f2714g;
    final ExecutorService f2715h;
    final C0902l f2716i;
    boolean f2717j;
    long f2718k = 0;
    long f2719l;
    public C0903m f2720m = new C0903m();
    final C0903m f2721n = new C0903m();
    boolean f2722o = false;
    final Socket f2723p;
    public final C0899j f2724q;
    public final C5020d f2725r;
    final Set<Integer> f2726s = new LinkedHashSet();
    private final ScheduledExecutorService f2727v;

    public static class C0893a {
        public Socket f2697a;
        public String f2698b;
        public C5683e f2699c;
        public C5682d f2700d;
        public C0894b f2701e = C0894b.f2705m;
        C0902l f2702f = C0902l.f2760a;
        boolean f2703g = true;
        public int f2704h;
    }

    public static abstract class C0894b {
        public static final C0894b f2705m = new C50151();

        class C50151 extends C0894b {
            C50151() {
            }

            public final void mo950a(C0898i c0898i) {
                c0898i.m2169a(C0887b.REFUSED_STREAM);
            }
        }

        public void mo949a(C0895g c0895g) {
        }

        public abstract void mo950a(C0898i c0898i);
    }

    class C50113 extends C0874b {
        final /* synthetic */ int f13985a;
        final /* synthetic */ List f13986c;
        final /* synthetic */ C0895g f13987d;

        C50113(C0895g c0895g, String str, Object[] objArr, int i, List list) {
            this.f13987d = c0895g;
            this.f13985a = i;
            this.f13986c = list;
            super(str, objArr);
        }

        public final void mo971b() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r3 = this;
            r0 = r3.f13987d;
            r0 = r0.f2716i;
            r0.mo980a();
            r0 = r3.f13987d;	 Catch:{ IOException -> 0x0027 }
            r0 = r0.f2724q;	 Catch:{ IOException -> 0x0027 }
            r1 = r3.f13985a;	 Catch:{ IOException -> 0x0027 }
            r2 = p056c.p057a.p061e.C0887b.CANCEL;	 Catch:{ IOException -> 0x0027 }
            r0.m2184a(r1, r2);	 Catch:{ IOException -> 0x0027 }
            r0 = r3.f13987d;	 Catch:{ IOException -> 0x0027 }
            monitor-enter(r0);	 Catch:{ IOException -> 0x0027 }
            r1 = r3.f13987d;	 Catch:{ all -> 0x0024 }
            r1 = r1.f2726s;	 Catch:{ all -> 0x0024 }
            r2 = r3.f13985a;	 Catch:{ all -> 0x0024 }
            r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x0024 }
            r1.remove(r2);	 Catch:{ all -> 0x0024 }
            monitor-exit(r0);	 Catch:{ all -> 0x0024 }
            return;	 Catch:{ all -> 0x0024 }
        L_0x0024:
            r1 = move-exception;	 Catch:{ all -> 0x0024 }
            monitor-exit(r0);	 Catch:{ all -> 0x0024 }
            throw r1;	 Catch:{ IOException -> 0x0027 }
        L_0x0027:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: c.a.e.g.3.b():void");
        }
    }

    class C50124 extends C0874b {
        final /* synthetic */ int f13988a;
        final /* synthetic */ List f13989c;
        final /* synthetic */ boolean f13990d;
        final /* synthetic */ C0895g f13991e;

        C50124(C0895g c0895g, String str, Object[] objArr, int i, List list, boolean z) {
            this.f13991e = c0895g;
            this.f13988a = i;
            this.f13989c = list;
            this.f13990d = z;
            super(str, objArr);
        }

        public final void mo971b() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r3 = this;
            r0 = r3.f13991e;
            r0 = r0.f2716i;
            r0.mo982b();
            r0 = r3.f13991e;	 Catch:{ IOException -> 0x0027 }
            r0 = r0.f2724q;	 Catch:{ IOException -> 0x0027 }
            r1 = r3.f13988a;	 Catch:{ IOException -> 0x0027 }
            r2 = p056c.p057a.p061e.C0887b.CANCEL;	 Catch:{ IOException -> 0x0027 }
            r0.m2184a(r1, r2);	 Catch:{ IOException -> 0x0027 }
            r0 = r3.f13991e;	 Catch:{ IOException -> 0x0027 }
            monitor-enter(r0);	 Catch:{ IOException -> 0x0027 }
            r1 = r3.f13991e;	 Catch:{ all -> 0x0024 }
            r1 = r1.f2726s;	 Catch:{ all -> 0x0024 }
            r2 = r3.f13988a;	 Catch:{ all -> 0x0024 }
            r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x0024 }
            r1.remove(r2);	 Catch:{ all -> 0x0024 }
            monitor-exit(r0);	 Catch:{ all -> 0x0024 }
            return;	 Catch:{ all -> 0x0024 }
        L_0x0024:
            r1 = move-exception;	 Catch:{ all -> 0x0024 }
            monitor-exit(r0);	 Catch:{ all -> 0x0024 }
            throw r1;	 Catch:{ IOException -> 0x0027 }
        L_0x0027:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: c.a.e.g.4.b():void");
        }
    }

    class C50135 extends C0874b {
        final /* synthetic */ int f13992a;
        final /* synthetic */ C6623c f13993c;
        final /* synthetic */ int f13994d;
        final /* synthetic */ boolean f13995e;
        final /* synthetic */ C0895g f13996f;

        C50135(C0895g c0895g, String str, Object[] objArr, int i, C6623c c6623c, int i2, boolean z) {
            this.f13996f = c0895g;
            this.f13992a = i;
            this.f13993c = c6623c;
            this.f13994d = i2;
            this.f13995e = z;
            super(str, objArr);
        }

        public final void mo971b() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r3 = this;
            r0 = r3.f13996f;	 Catch:{ IOException -> 0x002b }
            r0 = r0.f2716i;	 Catch:{ IOException -> 0x002b }
            r1 = r3.f13993c;	 Catch:{ IOException -> 0x002b }
            r2 = r3.f13994d;	 Catch:{ IOException -> 0x002b }
            r0.mo981a(r1, r2);	 Catch:{ IOException -> 0x002b }
            r0 = r3.f13996f;	 Catch:{ IOException -> 0x002b }
            r0 = r0.f2724q;	 Catch:{ IOException -> 0x002b }
            r1 = r3.f13992a;	 Catch:{ IOException -> 0x002b }
            r2 = p056c.p057a.p061e.C0887b.CANCEL;	 Catch:{ IOException -> 0x002b }
            r0.m2184a(r1, r2);	 Catch:{ IOException -> 0x002b }
            r0 = r3.f13996f;	 Catch:{ IOException -> 0x002b }
            monitor-enter(r0);	 Catch:{ IOException -> 0x002b }
            r1 = r3.f13996f;	 Catch:{ all -> 0x0028 }
            r1 = r1.f2726s;	 Catch:{ all -> 0x0028 }
            r2 = r3.f13992a;	 Catch:{ all -> 0x0028 }
            r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x0028 }
            r1.remove(r2);	 Catch:{ all -> 0x0028 }
            monitor-exit(r0);	 Catch:{ all -> 0x0028 }
            return;	 Catch:{ all -> 0x0028 }
        L_0x0028:
            r1 = move-exception;	 Catch:{ all -> 0x0028 }
            monitor-exit(r0);	 Catch:{ all -> 0x0028 }
            throw r1;	 Catch:{ IOException -> 0x002b }
        L_0x002b:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: c.a.e.g.5.b():void");
        }
    }

    class C50146 extends C0874b {
        final /* synthetic */ int f13997a;
        final /* synthetic */ C0887b f13998c;
        final /* synthetic */ C0895g f13999d;

        C50146(C0895g c0895g, String str, Object[] objArr, int i, C0887b c0887b) {
            this.f13999d = c0895g;
            this.f13997a = i;
            this.f13998c = c0887b;
            super(str, objArr);
        }

        public final void mo971b() {
            this.f13999d.f2716i.mo983c();
            synchronized (this.f13999d) {
                this.f13999d.f2726s.remove(Integer.valueOf(this.f13997a));
            }
        }
    }

    final class C5016c extends C0874b {
        final boolean f14000a;
        final int f14001c;
        final int f14002d;
        final /* synthetic */ C0895g f14003e;

        C5016c(C0895g c0895g, boolean z, int i, int i2) {
            this.f14003e = c0895g;
            super("OkHttp %s ping %08x%08x", c0895g.f2711d, Integer.valueOf(i), Integer.valueOf(i2));
            this.f14000a = z;
            this.f14001c = i;
            this.f14002d = i2;
        }

        public final void mo971b() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r6 = this;
            r0 = r6.f14003e;
            r1 = r6.f14000a;
            r2 = r6.f14001c;
            r3 = r6.f14002d;
            if (r1 != 0) goto L_0x001a;
        L_0x000a:
            monitor-enter(r0);
            r4 = r0.f2717j;	 Catch:{ all -> 0x0017 }
            r5 = 1;	 Catch:{ all -> 0x0017 }
            r0.f2717j = r5;	 Catch:{ all -> 0x0017 }
            monitor-exit(r0);	 Catch:{ all -> 0x0017 }
            if (r4 == 0) goto L_0x001a;
        L_0x0013:
            r0.m2151b();
            return;
        L_0x0017:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0017 }
            throw r1;
        L_0x001a:
            r4 = r0.f2724q;	 Catch:{ IOException -> 0x0020 }
            r4.m2187a(r1, r2, r3);	 Catch:{ IOException -> 0x0020 }
            return;
        L_0x0020:
            r0.m2151b();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: c.a.e.g.c.b():void");
        }
    }

    class C5020d extends C0874b implements C0896b {
        final C0897h f14009a;
        final /* synthetic */ C0895g f14010c;

        C5020d(C0895g c0895g, C0897h c0897h) {
            this.f14010c = c0895g;
            super("OkHttp %s", c0895g.f2711d);
            this.f14009a = c0897h;
        }

        public final void mo972a(int i, long j) {
            if (i == 0) {
                synchronized (this.f14010c) {
                    C0895g c0895g = this.f14010c;
                    c0895g.f2719l += j;
                    this.f14010c.notifyAll();
                }
                return;
            }
            C0898i a = this.f14010c.m2144a(i);
            if (a != null) {
                synchronized (a) {
                    a.m2168a(j);
                }
            }
        }

        public final void mo973a(int i, C0887b c0887b) {
            if (C0895g.m2140c(i)) {
                C0895g c0895g = this.f14010c;
                c0895g.f2715h.execute(new C50146(c0895g, "OkHttp %s Push Reset[%s]", new Object[]{c0895g.f2711d, Integer.valueOf(i)}, i, c0887b));
                return;
            }
            C0898i b = this.f14010c.m2150b(i);
            if (b != null) {
                b.m2174c(c0887b);
            }
        }

        public final void mo974a(int i, C2272f c2272f) {
            c2272f.mo2050g();
            synchronized (this.f14010c) {
                C0898i[] c0898iArr = (C0898i[]) this.f14010c.f2710c.values().toArray(new C0898i[this.f14010c.f2710c.size()]);
                this.f14010c.f2714g = true;
            }
            for (C0898i c0898i : c0898iArr) {
                if (c0898i.f2736c > i && c0898i.m2172b()) {
                    c0898i.m2174c(C0887b.REFUSED_STREAM);
                    this.f14010c.m2150b(c0898i.f2736c);
                }
            }
        }

        public final void mo975a(int r9, java.util.List<p056c.p057a.p061e.C0888c> r10) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r8 = this;
            r1 = r8.f14010c;
            monitor-enter(r1);
            r0 = r1.f2726s;	 Catch:{ all -> 0x003f }
            r2 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x003f }
            r0 = r0.contains(r2);	 Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0016;	 Catch:{ all -> 0x003f }
        L_0x000f:
            r10 = p056c.p057a.p061e.C0887b.PROTOCOL_ERROR;	 Catch:{ all -> 0x003f }
            r1.m2147a(r9, r10);	 Catch:{ all -> 0x003f }
            monitor-exit(r1);	 Catch:{ all -> 0x003f }
            return;	 Catch:{ all -> 0x003f }
        L_0x0016:
            r0 = r1.f2726s;	 Catch:{ all -> 0x003f }
            r2 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x003f }
            r0.add(r2);	 Catch:{ all -> 0x003f }
            monitor-exit(r1);	 Catch:{ all -> 0x003f }
            r6 = r1.f2715h;	 Catch:{ RejectedExecutionException -> 0x003e }
            r7 = new c.a.e.g$3;	 Catch:{ RejectedExecutionException -> 0x003e }
            r2 = "OkHttp %s Push Request[%s]";	 Catch:{ RejectedExecutionException -> 0x003e }
            r0 = 2;	 Catch:{ RejectedExecutionException -> 0x003e }
            r3 = new java.lang.Object[r0];	 Catch:{ RejectedExecutionException -> 0x003e }
            r0 = 0;	 Catch:{ RejectedExecutionException -> 0x003e }
            r4 = r1.f2711d;	 Catch:{ RejectedExecutionException -> 0x003e }
            r3[r0] = r4;	 Catch:{ RejectedExecutionException -> 0x003e }
            r0 = 1;	 Catch:{ RejectedExecutionException -> 0x003e }
            r4 = java.lang.Integer.valueOf(r9);	 Catch:{ RejectedExecutionException -> 0x003e }
            r3[r0] = r4;	 Catch:{ RejectedExecutionException -> 0x003e }
            r0 = r7;	 Catch:{ RejectedExecutionException -> 0x003e }
            r4 = r9;	 Catch:{ RejectedExecutionException -> 0x003e }
            r5 = r10;	 Catch:{ RejectedExecutionException -> 0x003e }
            r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ RejectedExecutionException -> 0x003e }
            r6.execute(r7);	 Catch:{ RejectedExecutionException -> 0x003e }
        L_0x003e:
            return;
        L_0x003f:
            r9 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x003f }
            throw r9;
            */
            throw new UnsupportedOperationException("Method not decompiled: c.a.e.g.d.a(int, java.util.List):void");
        }

        public final void mo976a(final p056c.p057a.p061e.C0903m r15) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r14 = this;
            r0 = r14.f14010c;
            monitor-enter(r0);
            r1 = r14.f14010c;	 Catch:{ all -> 0x00bc }
            r1 = r1.f2721n;	 Catch:{ all -> 0x00bc }
            r1 = r1.m2203b();	 Catch:{ all -> 0x00bc }
            r2 = r14.f14010c;	 Catch:{ all -> 0x00bc }
            r2 = r2.f2721n;	 Catch:{ all -> 0x00bc }
            r3 = 0;	 Catch:{ all -> 0x00bc }
            r4 = r3;	 Catch:{ all -> 0x00bc }
        L_0x0011:
            r5 = 10;	 Catch:{ all -> 0x00bc }
            if (r4 >= r5) goto L_0x0025;	 Catch:{ all -> 0x00bc }
        L_0x0015:
            r5 = r15.m2202a(r4);	 Catch:{ all -> 0x00bc }
            if (r5 == 0) goto L_0x0022;	 Catch:{ all -> 0x00bc }
        L_0x001b:
            r5 = r15.f2762b;	 Catch:{ all -> 0x00bc }
            r5 = r5[r4];	 Catch:{ all -> 0x00bc }
            r2.m2201a(r4, r5);	 Catch:{ all -> 0x00bc }
        L_0x0022:
            r4 = r4 + 1;
            goto L_0x0011;
        L_0x0025:
            r2 = 1;
            r4 = r14.f14010c;	 Catch:{ RejectedExecutionException -> 0x003e }
            r4 = r4.f2727v;	 Catch:{ RejectedExecutionException -> 0x003e }
            r5 = new c.a.e.g$d$3;	 Catch:{ RejectedExecutionException -> 0x003e }
            r6 = "OkHttp %s ACK Settings";	 Catch:{ RejectedExecutionException -> 0x003e }
            r7 = new java.lang.Object[r2];	 Catch:{ RejectedExecutionException -> 0x003e }
            r8 = r14.f14010c;	 Catch:{ RejectedExecutionException -> 0x003e }
            r8 = r8.f2711d;	 Catch:{ RejectedExecutionException -> 0x003e }
            r7[r3] = r8;	 Catch:{ RejectedExecutionException -> 0x003e }
            r5.<init>(r14, r6, r7, r15);	 Catch:{ RejectedExecutionException -> 0x003e }
            r4.execute(r5);	 Catch:{ RejectedExecutionException -> 0x003e }
        L_0x003e:
            r15 = r14.f14010c;	 Catch:{ all -> 0x00bc }
            r15 = r15.f2721n;	 Catch:{ all -> 0x00bc }
            r15 = r15.m2203b();	 Catch:{ all -> 0x00bc }
            r4 = -1;	 Catch:{ all -> 0x00bc }
            r5 = 0;	 Catch:{ all -> 0x00bc }
            r7 = 0;	 Catch:{ all -> 0x00bc }
            if (r15 == r4) goto L_0x008d;	 Catch:{ all -> 0x00bc }
        L_0x004c:
            if (r15 == r1) goto L_0x008d;	 Catch:{ all -> 0x00bc }
        L_0x004e:
            r15 = r15 - r1;	 Catch:{ all -> 0x00bc }
            r8 = (long) r15;	 Catch:{ all -> 0x00bc }
            r15 = r14.f14010c;	 Catch:{ all -> 0x00bc }
            r15 = r15.f2722o;	 Catch:{ all -> 0x00bc }
            if (r15 != 0) goto L_0x0069;	 Catch:{ all -> 0x00bc }
        L_0x0056:
            r15 = r14.f14010c;	 Catch:{ all -> 0x00bc }
            r10 = r15.f2719l;	 Catch:{ all -> 0x00bc }
            r12 = r10 + r8;	 Catch:{ all -> 0x00bc }
            r15.f2719l = r12;	 Catch:{ all -> 0x00bc }
            r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1));	 Catch:{ all -> 0x00bc }
            if (r1 <= 0) goto L_0x0065;	 Catch:{ all -> 0x00bc }
        L_0x0062:
            r15.notifyAll();	 Catch:{ all -> 0x00bc }
        L_0x0065:
            r15 = r14.f14010c;	 Catch:{ all -> 0x00bc }
            r15.f2722o = r2;	 Catch:{ all -> 0x00bc }
        L_0x0069:
            r15 = r14.f14010c;	 Catch:{ all -> 0x00bc }
            r15 = r15.f2710c;	 Catch:{ all -> 0x00bc }
            r15 = r15.isEmpty();	 Catch:{ all -> 0x00bc }
            if (r15 != 0) goto L_0x008e;	 Catch:{ all -> 0x00bc }
        L_0x0073:
            r15 = r14.f14010c;	 Catch:{ all -> 0x00bc }
            r15 = r15.f2710c;	 Catch:{ all -> 0x00bc }
            r15 = r15.values();	 Catch:{ all -> 0x00bc }
            r1 = r14.f14010c;	 Catch:{ all -> 0x00bc }
            r1 = r1.f2710c;	 Catch:{ all -> 0x00bc }
            r1 = r1.size();	 Catch:{ all -> 0x00bc }
            r1 = new p056c.p057a.p061e.C0898i[r1];	 Catch:{ all -> 0x00bc }
            r15 = r15.toArray(r1);	 Catch:{ all -> 0x00bc }
            r7 = r15;	 Catch:{ all -> 0x00bc }
            r7 = (p056c.p057a.p061e.C0898i[]) r7;	 Catch:{ all -> 0x00bc }
            goto L_0x008e;	 Catch:{ all -> 0x00bc }
        L_0x008d:
            r8 = r5;	 Catch:{ all -> 0x00bc }
        L_0x008e:
            r15 = p056c.p057a.p061e.C0895g.f2707u;	 Catch:{ all -> 0x00bc }
            r1 = new c.a.e.g$d$2;	 Catch:{ all -> 0x00bc }
            r4 = "OkHttp %s settings";	 Catch:{ all -> 0x00bc }
            r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x00bc }
            r10 = r14.f14010c;	 Catch:{ all -> 0x00bc }
            r10 = r10.f2711d;	 Catch:{ all -> 0x00bc }
            r2[r3] = r10;	 Catch:{ all -> 0x00bc }
            r1.<init>(r14, r4, r2);	 Catch:{ all -> 0x00bc }
            r15.execute(r1);	 Catch:{ all -> 0x00bc }
            monitor-exit(r0);	 Catch:{ all -> 0x00bc }
            if (r7 == 0) goto L_0x00bb;
        L_0x00a7:
            r15 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1));
            if (r15 == 0) goto L_0x00bb;
        L_0x00ab:
            r15 = r7.length;
        L_0x00ac:
            if (r3 >= r15) goto L_0x00bb;
        L_0x00ae:
            r0 = r7[r3];
            monitor-enter(r0);
            r0.m2168a(r8);	 Catch:{ all -> 0x00b8 }
            monitor-exit(r0);	 Catch:{ all -> 0x00b8 }
            r3 = r3 + 1;	 Catch:{ all -> 0x00b8 }
            goto L_0x00ac;	 Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r15 = move-exception;	 Catch:{ all -> 0x00b8 }
            monitor-exit(r0);	 Catch:{ all -> 0x00b8 }
            throw r15;
        L_0x00bb:
            return;
        L_0x00bc:
            r15 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x00bc }
            throw r15;
            */
            throw new UnsupportedOperationException("Method not decompiled: c.a.e.g.d.a(c.a.e.m):void");
        }

        public final void mo977a(boolean r4, int r5, int r6) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r3 = this;
            if (r4 == 0) goto L_0x0014;
        L_0x0002:
            r4 = r3.f14010c;
            monitor-enter(r4);
            r5 = r3.f14010c;	 Catch:{ all -> 0x0011 }
            r5.f2717j = false;	 Catch:{ all -> 0x0011 }
            r5 = r3.f14010c;	 Catch:{ all -> 0x0011 }
            r5.notifyAll();	 Catch:{ all -> 0x0011 }
            monitor-exit(r4);	 Catch:{ all -> 0x0011 }
            return;	 Catch:{ all -> 0x0011 }
        L_0x0011:
            r5 = move-exception;	 Catch:{ all -> 0x0011 }
            monitor-exit(r4);	 Catch:{ all -> 0x0011 }
            throw r5;
        L_0x0014:
            r4 = r3.f14010c;	 Catch:{ RejectedExecutionException -> 0x0025 }
            r4 = r4.f2727v;	 Catch:{ RejectedExecutionException -> 0x0025 }
            r0 = new c.a.e.g$c;	 Catch:{ RejectedExecutionException -> 0x0025 }
            r1 = r3.f14010c;	 Catch:{ RejectedExecutionException -> 0x0025 }
            r2 = 1;	 Catch:{ RejectedExecutionException -> 0x0025 }
            r0.<init>(r1, r2, r5, r6);	 Catch:{ RejectedExecutionException -> 0x0025 }
            r4.execute(r0);	 Catch:{ RejectedExecutionException -> 0x0025 }
        L_0x0025:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: c.a.e.g.d.a(boolean, int, int):void");
        }

        public final void mo978a(boolean z, int i, C5683e c5683e, int i2) {
            if (C0895g.m2140c(i)) {
                C0895g c0895g = this.f14010c;
                C6623c c6623c = new C6623c();
                long j = (long) i2;
                c5683e.mo3122a(j);
                c5683e.mo944a(c6623c, j);
                if (c6623c.f18884b != j) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(c6623c.f18884b);
                    stringBuilder.append(" != ");
                    stringBuilder.append(i2);
                    throw new IOException(stringBuilder.toString());
                }
                c0895g.f2715h.execute(new C50135(c0895g, "OkHttp %s Push Data[%s]", new Object[]{c0895g.f2711d, Integer.valueOf(i)}, i, c6623c, i2, z));
                return;
            }
            C0898i a = this.f14010c.m2144a(i);
            if (a == null) {
                this.f14010c.m2147a(i, C0887b.PROTOCOL_ERROR);
                c5683e.mo3142h((long) i2);
            } else if (C0898i.f2733l || !Thread.holdsLock(a)) {
                a.f2740g.m10165a(c5683e, (long) i2);
                if (z) {
                    a.m2176e();
                }
            } else {
                throw new AssertionError();
            }
        }

        public final void mo979a(boolean r13, int r14, java.util.List<p056c.p057a.p061e.C0888c> r15) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r12 = this;
            r0 = p056c.p057a.p061e.C0895g.m2140c(r14);
            r1 = 0;
            r2 = 1;
            r3 = 2;
            if (r0 == 0) goto L_0x0028;
        L_0x0009:
            r5 = r12.f14010c;
            r0 = r5.f2715h;	 Catch:{ RejectedExecutionException -> 0x0027 }
            r11 = new c.a.e.g$4;	 Catch:{ RejectedExecutionException -> 0x0027 }
            r6 = "OkHttp %s Push Headers[%s]";	 Catch:{ RejectedExecutionException -> 0x0027 }
            r7 = new java.lang.Object[r3];	 Catch:{ RejectedExecutionException -> 0x0027 }
            r3 = r5.f2711d;	 Catch:{ RejectedExecutionException -> 0x0027 }
            r7[r1] = r3;	 Catch:{ RejectedExecutionException -> 0x0027 }
            r1 = java.lang.Integer.valueOf(r14);	 Catch:{ RejectedExecutionException -> 0x0027 }
            r7[r2] = r1;	 Catch:{ RejectedExecutionException -> 0x0027 }
            r4 = r11;	 Catch:{ RejectedExecutionException -> 0x0027 }
            r8 = r14;	 Catch:{ RejectedExecutionException -> 0x0027 }
            r9 = r15;	 Catch:{ RejectedExecutionException -> 0x0027 }
            r10 = r13;	 Catch:{ RejectedExecutionException -> 0x0027 }
            r4.<init>(r5, r6, r7, r8, r9, r10);	 Catch:{ RejectedExecutionException -> 0x0027 }
            r0.execute(r11);	 Catch:{ RejectedExecutionException -> 0x0027 }
        L_0x0027:
            return;
        L_0x0028:
            r0 = r12.f14010c;
            monitor-enter(r0);
            r4 = r12.f14010c;	 Catch:{ all -> 0x00cf }
            r4 = r4.m2144a(r14);	 Catch:{ all -> 0x00cf }
            if (r4 != 0) goto L_0x0087;	 Catch:{ all -> 0x00cf }
        L_0x0033:
            r4 = r12.f14010c;	 Catch:{ all -> 0x00cf }
            r4 = r4.f2714g;	 Catch:{ all -> 0x00cf }
            if (r4 == 0) goto L_0x003b;	 Catch:{ all -> 0x00cf }
        L_0x0039:
            monitor-exit(r0);	 Catch:{ all -> 0x00cf }
            return;	 Catch:{ all -> 0x00cf }
        L_0x003b:
            r4 = r12.f14010c;	 Catch:{ all -> 0x00cf }
            r4 = r4.f2712e;	 Catch:{ all -> 0x00cf }
            if (r14 > r4) goto L_0x0043;	 Catch:{ all -> 0x00cf }
        L_0x0041:
            monitor-exit(r0);	 Catch:{ all -> 0x00cf }
            return;	 Catch:{ all -> 0x00cf }
        L_0x0043:
            r4 = r14 % 2;	 Catch:{ all -> 0x00cf }
            r5 = r12.f14010c;	 Catch:{ all -> 0x00cf }
            r5 = r5.f2713f;	 Catch:{ all -> 0x00cf }
            r5 = r5 % r3;	 Catch:{ all -> 0x00cf }
            if (r4 != r5) goto L_0x004e;	 Catch:{ all -> 0x00cf }
        L_0x004c:
            monitor-exit(r0);	 Catch:{ all -> 0x00cf }
            return;	 Catch:{ all -> 0x00cf }
        L_0x004e:
            r10 = new c.a.e.i;	 Catch:{ all -> 0x00cf }
            r6 = r12.f14010c;	 Catch:{ all -> 0x00cf }
            r7 = 0;	 Catch:{ all -> 0x00cf }
            r4 = r10;	 Catch:{ all -> 0x00cf }
            r5 = r14;	 Catch:{ all -> 0x00cf }
            r8 = r13;	 Catch:{ all -> 0x00cf }
            r9 = r15;	 Catch:{ all -> 0x00cf }
            r4.<init>(r5, r6, r7, r8, r9);	 Catch:{ all -> 0x00cf }
            r13 = r12.f14010c;	 Catch:{ all -> 0x00cf }
            r13.f2712e = r14;	 Catch:{ all -> 0x00cf }
            r13 = r12.f14010c;	 Catch:{ all -> 0x00cf }
            r13 = r13.f2710c;	 Catch:{ all -> 0x00cf }
            r15 = java.lang.Integer.valueOf(r14);	 Catch:{ all -> 0x00cf }
            r13.put(r15, r10);	 Catch:{ all -> 0x00cf }
            r13 = p056c.p057a.p061e.C0895g.f2707u;	 Catch:{ all -> 0x00cf }
            r15 = new c.a.e.g$d$1;	 Catch:{ all -> 0x00cf }
            r4 = "OkHttp %s stream %d";	 Catch:{ all -> 0x00cf }
            r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x00cf }
            r5 = r12.f14010c;	 Catch:{ all -> 0x00cf }
            r5 = r5.f2711d;	 Catch:{ all -> 0x00cf }
            r3[r1] = r5;	 Catch:{ all -> 0x00cf }
            r14 = java.lang.Integer.valueOf(r14);	 Catch:{ all -> 0x00cf }
            r3[r2] = r14;	 Catch:{ all -> 0x00cf }
            r15.<init>(r12, r4, r3, r10);	 Catch:{ all -> 0x00cf }
            r13.execute(r15);	 Catch:{ all -> 0x00cf }
            monitor-exit(r0);	 Catch:{ all -> 0x00cf }
            return;	 Catch:{ all -> 0x00cf }
        L_0x0087:
            monitor-exit(r0);	 Catch:{ all -> 0x00cf }
            r14 = p056c.p057a.p061e.C0898i.f2733l;
            if (r14 != 0) goto L_0x0098;
        L_0x008c:
            r14 = java.lang.Thread.holdsLock(r4);
            if (r14 == 0) goto L_0x0098;
        L_0x0092:
            r13 = new java.lang.AssertionError;
            r13.<init>();
            throw r13;
        L_0x0098:
            monitor-enter(r4);
            r4.f2739f = r2;	 Catch:{ all -> 0x00cc }
            r14 = r4.f2738e;	 Catch:{ all -> 0x00cc }
            if (r14 != 0) goto L_0x00a9;	 Catch:{ all -> 0x00cc }
        L_0x009f:
            r4.f2738e = r15;	 Catch:{ all -> 0x00cc }
            r2 = r4.m2170a();	 Catch:{ all -> 0x00cc }
            r4.notifyAll();	 Catch:{ all -> 0x00cc }
            goto L_0x00bc;	 Catch:{ all -> 0x00cc }
        L_0x00a9:
            r14 = new java.util.ArrayList;	 Catch:{ all -> 0x00cc }
            r14.<init>();	 Catch:{ all -> 0x00cc }
            r0 = r4.f2738e;	 Catch:{ all -> 0x00cc }
            r14.addAll(r0);	 Catch:{ all -> 0x00cc }
            r0 = 0;	 Catch:{ all -> 0x00cc }
            r14.add(r0);	 Catch:{ all -> 0x00cc }
            r14.addAll(r15);	 Catch:{ all -> 0x00cc }
            r4.f2738e = r14;	 Catch:{ all -> 0x00cc }
        L_0x00bc:
            monitor-exit(r4);	 Catch:{ all -> 0x00cc }
            if (r2 != 0) goto L_0x00c6;
        L_0x00bf:
            r14 = r4.f2737d;
            r15 = r4.f2736c;
            r14.m2150b(r15);
        L_0x00c6:
            if (r13 == 0) goto L_0x00cb;
        L_0x00c8:
            r4.m2176e();
        L_0x00cb:
            return;
        L_0x00cc:
            r13 = move-exception;
            monitor-exit(r4);	 Catch:{ all -> 0x00cc }
            throw r13;
        L_0x00cf:
            r13 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x00cf }
            throw r13;
            */
            throw new UnsupportedOperationException("Method not decompiled: c.a.e.g.d.a(boolean, int, java.util.List):void");
        }

        protected final void mo971b() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r10 = this;
            r0 = p056c.p057a.p061e.C0887b.INTERNAL_ERROR;
            r1 = p056c.p057a.p061e.C0887b.INTERNAL_ERROR;
            r2 = r10.f14009a;	 Catch:{ IOException -> 0x0077 }
            r3 = r2.f2730c;	 Catch:{ IOException -> 0x0077 }
            r4 = 1;	 Catch:{ IOException -> 0x0077 }
            r5 = 0;	 Catch:{ IOException -> 0x0077 }
            if (r3 == 0) goto L_0x001b;	 Catch:{ IOException -> 0x0077 }
        L_0x000c:
            r2 = r2.m2166a(r4, r10);	 Catch:{ IOException -> 0x0077 }
            if (r2 != 0) goto L_0x005c;	 Catch:{ IOException -> 0x0077 }
        L_0x0012:
            r2 = "Required SETTINGS preface not received";	 Catch:{ IOException -> 0x0077 }
            r3 = new java.lang.Object[r5];	 Catch:{ IOException -> 0x0077 }
            r2 = p056c.p057a.p061e.C0892e.m2134b(r2, r3);	 Catch:{ IOException -> 0x0077 }
            throw r2;	 Catch:{ IOException -> 0x0077 }
        L_0x001b:
            r2 = r2.f2729b;	 Catch:{ IOException -> 0x0077 }
            r3 = p056c.p057a.p061e.C0892e.f2693a;	 Catch:{ IOException -> 0x0077 }
            r3 = r3.mo2050g();	 Catch:{ IOException -> 0x0077 }
            r6 = (long) r3;	 Catch:{ IOException -> 0x0077 }
            r2 = r2.mo3132d(r6);	 Catch:{ IOException -> 0x0077 }
            r3 = p056c.p057a.p061e.C0897h.f2728a;	 Catch:{ IOException -> 0x0077 }
            r6 = java.util.logging.Level.FINE;	 Catch:{ IOException -> 0x0077 }
            r3 = r3.isLoggable(r6);	 Catch:{ IOException -> 0x0077 }
            if (r3 == 0) goto L_0x0045;	 Catch:{ IOException -> 0x0077 }
        L_0x0032:
            r3 = p056c.p057a.p061e.C0897h.f2728a;	 Catch:{ IOException -> 0x0077 }
            r6 = "<< CONNECTION %s";	 Catch:{ IOException -> 0x0077 }
            r7 = new java.lang.Object[r4];	 Catch:{ IOException -> 0x0077 }
            r8 = r2.mo2047e();	 Catch:{ IOException -> 0x0077 }
            r7[r5] = r8;	 Catch:{ IOException -> 0x0077 }
            r6 = p056c.p057a.C0885c.m2092a(r6, r7);	 Catch:{ IOException -> 0x0077 }
            r3.fine(r6);	 Catch:{ IOException -> 0x0077 }
        L_0x0045:
            r3 = p056c.p057a.p061e.C0892e.f2693a;	 Catch:{ IOException -> 0x0077 }
            r3 = r3.equals(r2);	 Catch:{ IOException -> 0x0077 }
            if (r3 != 0) goto L_0x005c;	 Catch:{ IOException -> 0x0077 }
        L_0x004d:
            r3 = "Expected a connection header but was %s";	 Catch:{ IOException -> 0x0077 }
            r4 = new java.lang.Object[r4];	 Catch:{ IOException -> 0x0077 }
            r2 = r2.mo2040a();	 Catch:{ IOException -> 0x0077 }
            r4[r5] = r2;	 Catch:{ IOException -> 0x0077 }
            r2 = p056c.p057a.p061e.C0892e.m2134b(r3, r4);	 Catch:{ IOException -> 0x0077 }
            throw r2;	 Catch:{ IOException -> 0x0077 }
        L_0x005c:
            r2 = r10.f14009a;	 Catch:{ IOException -> 0x0077 }
            r2 = r2.m2166a(r5, r10);	 Catch:{ IOException -> 0x0077 }
            if (r2 != 0) goto L_0x005c;	 Catch:{ IOException -> 0x0077 }
        L_0x0064:
            r2 = p056c.p057a.p061e.C0887b.NO_ERROR;	 Catch:{ IOException -> 0x0077 }
            r0 = p056c.p057a.p061e.C0887b.CANCEL;	 Catch:{ IOException -> 0x0073 }
            r1 = r10.f14010c;	 Catch:{ IOException -> 0x006d }
        L_0x006a:
            r1.m2149a(r2, r0);	 Catch:{ IOException -> 0x006d }
        L_0x006d:
            r0 = r10.f14009a;
            p056c.p057a.C0885c.m2098a(r0);
            return;
        L_0x0073:
            r0 = r2;
            goto L_0x0077;
        L_0x0075:
            r2 = move-exception;
            goto L_0x0082;
        L_0x0077:
            r2 = p056c.p057a.p061e.C0887b.PROTOCOL_ERROR;	 Catch:{ all -> 0x0075 }
            r0 = p056c.p057a.p061e.C0887b.PROTOCOL_ERROR;	 Catch:{ all -> 0x007e }
            r1 = r10.f14010c;	 Catch:{ IOException -> 0x006d }
            goto L_0x006a;
        L_0x007e:
            r0 = move-exception;
            r9 = r2;
            r2 = r0;
            r0 = r9;
        L_0x0082:
            r3 = r10.f14010c;	 Catch:{ IOException -> 0x0087 }
            r3.m2149a(r0, r1);	 Catch:{ IOException -> 0x0087 }
        L_0x0087:
            r0 = r10.f14009a;
            p056c.p057a.C0885c.m2098a(r0);
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: c.a.e.g.d.b():void");
        }
    }

    public C0895g(C0893a c0893a) {
        C0893a c0893a2 = c0893a;
        this.f2716i = c0893a2.f2702f;
        this.f2708a = c0893a2.f2703g;
        this.f2709b = c0893a2.f2701e;
        r0.f2713f = c0893a2.f2703g ? 1 : 2;
        if (c0893a2.f2703g) {
            r0.f2713f += 2;
        }
        if (c0893a2.f2703g) {
            r0.f2720m.m2201a(7, 16777216);
        }
        r0.f2711d = c0893a2.f2698b;
        r0.f2727v = new ScheduledThreadPoolExecutor(1, C0885c.m2096a(C0885c.m2092a("OkHttp %s Writer", r0.f2711d), false));
        if (c0893a2.f2704h != 0) {
            r0.f2727v.scheduleAtFixedRate(new C5016c(r0, false, 0, 0), (long) c0893a2.f2704h, (long) c0893a2.f2704h, TimeUnit.MILLISECONDS);
        }
        r0.f2715h = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C0885c.m2096a(C0885c.m2092a("OkHttp %s Push Observer", r0.f2711d), true));
        r0.f2721n.m2201a(7, InBandBytestreamManager.MAXIMUM_BLOCK_SIZE);
        r0.f2721n.m2201a(5, 16384);
        r0.f2719l = (long) r0.f2721n.m2203b();
        r0.f2723p = c0893a2.f2697a;
        r0.f2724q = new C0899j(c0893a2.f2700d, r0.f2708a);
        r0.f2725r = new C5020d(r0, new C0897h(c0893a2.f2699c, r0.f2708a));
    }

    private void m2137a(C0887b c0887b) {
        synchronized (this.f2724q) {
            synchronized (this) {
                if (this.f2714g) {
                    return;
                }
                this.f2714g = true;
                int i = this.f2712e;
                this.f2724q.m2185a(i, c0887b, C0885c.f2633a);
            }
        }
    }

    static boolean m2140c(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public final synchronized int m2143a() {
        C0903m c0903m = this.f2721n;
        if ((16 & c0903m.f2761a) == 0) {
            return ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        return c0903m.f2762b[4];
    }

    final synchronized C0898i m2144a(int i) {
        return (C0898i) this.f2710c.get(Integer.valueOf(i));
    }

    final C0898i m2145a(List<C0888c> list, boolean z) {
        C0898i c0898i;
        Object obj;
        boolean z2 = z ^ 1;
        synchronized (this.f2724q) {
            int i;
            synchronized (this) {
                if (this.f2713f > 1073741823) {
                    m2137a(C0887b.REFUSED_STREAM);
                }
                if (this.f2714g) {
                    throw new C0886a();
                }
                i = this.f2713f;
                this.f2713f += 2;
                c0898i = new C0898i(i, this, z2, false, list);
                if (z && this.f2719l != 0) {
                    if (c0898i.f2735b != 0) {
                        obj = null;
                        if (c0898i.m2170a()) {
                            this.f2710c.put(Integer.valueOf(i), c0898i);
                        }
                    }
                }
                obj = 1;
                if (c0898i.m2170a()) {
                    this.f2710c.put(Integer.valueOf(i), c0898i);
                }
            }
            this.f2724q.m2189a(z2, i, (List) list);
        }
        if (obj != null) {
            this.f2724q.m2190b();
        }
        return c0898i;
    }

    final void m2146a(int r10, long r11) {
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
        r9 = this;
        r0 = r9.f2727v;	 Catch:{ RejectedExecutionException -> 0x001f }
        r8 = new c.a.e.g$2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r3 = "OkHttp Window Update %s stream %d";	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r4 = new java.lang.Object[r1];	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 0;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = r9.f2711d;	 Catch:{ RejectedExecutionException -> 0x001f }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 1;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = java.lang.Integer.valueOf(r10);	 Catch:{ RejectedExecutionException -> 0x001f }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = r8;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = r9;	 Catch:{ RejectedExecutionException -> 0x001f }
        r5 = r10;	 Catch:{ RejectedExecutionException -> 0x001f }
        r6 = r11;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1.<init>(r2, r3, r4, r5, r6);	 Catch:{ RejectedExecutionException -> 0x001f }
        r0.execute(r8);	 Catch:{ RejectedExecutionException -> 0x001f }
    L_0x001f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.e.g.a(int, long):void");
    }

    final void m2147a(int r9, p056c.p057a.p061e.C0887b r10) {
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
        r8 = this;
        r0 = r8.f2727v;	 Catch:{ RejectedExecutionException -> 0x001f }
        r7 = new c.a.e.g$1;	 Catch:{ RejectedExecutionException -> 0x001f }
        r3 = "OkHttp %s stream %d";	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r4 = new java.lang.Object[r1];	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 0;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = r8.f2711d;	 Catch:{ RejectedExecutionException -> 0x001f }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 1;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = java.lang.Integer.valueOf(r9);	 Catch:{ RejectedExecutionException -> 0x001f }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = r7;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = r8;	 Catch:{ RejectedExecutionException -> 0x001f }
        r5 = r9;	 Catch:{ RejectedExecutionException -> 0x001f }
        r6 = r10;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1.<init>(r2, r3, r4, r5, r6);	 Catch:{ RejectedExecutionException -> 0x001f }
        r0.execute(r7);	 Catch:{ RejectedExecutionException -> 0x001f }
    L_0x001f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.e.g.a(int, c.a.e.b):void");
    }

    public final void m2148a(int r11, boolean r12, p206d.C6623c r13, long r14) {
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
        r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1));
        r3 = 0;
        if (r2 != 0) goto L_0x000d;
    L_0x0007:
        r14 = r10.f2724q;
        r14.m2188a(r12, r11, r13, r3);
        return;
    L_0x000d:
        r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x0063;
    L_0x0011:
        monitor-enter(r10);
    L_0x0012:
        r4 = r10.f2719l;	 Catch:{ InterruptedException -> 0x005b }
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));	 Catch:{ InterruptedException -> 0x005b }
        if (r2 > 0) goto L_0x0030;	 Catch:{ InterruptedException -> 0x005b }
    L_0x0018:
        r2 = r10.f2710c;	 Catch:{ InterruptedException -> 0x005b }
        r4 = java.lang.Integer.valueOf(r11);	 Catch:{ InterruptedException -> 0x005b }
        r2 = r2.containsKey(r4);	 Catch:{ InterruptedException -> 0x005b }
        if (r2 != 0) goto L_0x002c;	 Catch:{ InterruptedException -> 0x005b }
    L_0x0024:
        r11 = new java.io.IOException;	 Catch:{ InterruptedException -> 0x005b }
        r12 = "stream closed";	 Catch:{ InterruptedException -> 0x005b }
        r11.<init>(r12);	 Catch:{ InterruptedException -> 0x005b }
        throw r11;	 Catch:{ InterruptedException -> 0x005b }
    L_0x002c:
        r10.wait();	 Catch:{ InterruptedException -> 0x005b }
        goto L_0x0012;
    L_0x0030:
        r4 = r10.f2719l;	 Catch:{ all -> 0x0059 }
        r4 = java.lang.Math.min(r14, r4);	 Catch:{ all -> 0x0059 }
        r2 = (int) r4;	 Catch:{ all -> 0x0059 }
        r4 = r10.f2724q;	 Catch:{ all -> 0x0059 }
        r4 = r4.f2747a;	 Catch:{ all -> 0x0059 }
        r2 = java.lang.Math.min(r2, r4);	 Catch:{ all -> 0x0059 }
        r4 = r10.f2719l;	 Catch:{ all -> 0x0059 }
        r6 = (long) r2;	 Catch:{ all -> 0x0059 }
        r8 = r4 - r6;	 Catch:{ all -> 0x0059 }
        r10.f2719l = r8;	 Catch:{ all -> 0x0059 }
        monitor-exit(r10);	 Catch:{ all -> 0x0059 }
        r4 = r14 - r6;
        r14 = r10.f2724q;
        if (r12 == 0) goto L_0x0053;
    L_0x004d:
        r15 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r15 != 0) goto L_0x0053;
    L_0x0051:
        r15 = 1;
        goto L_0x0054;
    L_0x0053:
        r15 = r3;
    L_0x0054:
        r14.m2188a(r15, r11, r13, r2);
        r14 = r4;
        goto L_0x000d;
    L_0x0059:
        r11 = move-exception;
        goto L_0x0061;
    L_0x005b:
        r11 = new java.io.InterruptedIOException;	 Catch:{ all -> 0x0059 }
        r11.<init>();	 Catch:{ all -> 0x0059 }
        throw r11;	 Catch:{ all -> 0x0059 }
    L_0x0061:
        monitor-exit(r10);	 Catch:{ all -> 0x0059 }
        throw r11;
    L_0x0063:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.e.g.a(int, boolean, d.c, long):void");
    }

    final void m2149a(C0887b c0887b, C0887b c0887b2) {
        IOException iOException;
        if (f2706t || !Thread.holdsLock(this)) {
            C0898i[] c0898iArr = null;
            try {
                m2137a(c0887b);
                iOException = null;
            } catch (IOException e) {
                iOException = e;
            }
            synchronized (this) {
                if (!this.f2710c.isEmpty()) {
                    c0898iArr = (C0898i[]) this.f2710c.values().toArray(new C0898i[this.f2710c.size()]);
                    this.f2710c.clear();
                }
            }
            if (c0898iArr != null) {
                for (C0898i a : c0898iArr) {
                    try {
                        a.m2169a(c0887b2);
                    } catch (IOException e2) {
                        if (iOException != null) {
                            iOException = e2;
                        }
                    }
                }
            }
            try {
                this.f2724q.close();
            } catch (IOException e3) {
                if (iOException == null) {
                    iOException = e3;
                }
            }
            try {
                this.f2723p.close();
            } catch (IOException e4) {
                iOException = e4;
            }
            this.f2727v.shutdown();
            this.f2715h.shutdown();
            if (iOException != null) {
                throw iOException;
            }
            return;
        }
        throw new AssertionError();
    }

    final synchronized C0898i m2150b(int i) {
        C0898i c0898i;
        c0898i = (C0898i) this.f2710c.remove(Integer.valueOf(i));
        notifyAll();
        return c0898i;
    }

    final void m2151b() {
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
        r2 = this;
        r0 = p056c.p057a.p061e.C0887b.PROTOCOL_ERROR;	 Catch:{ IOException -> 0x0007 }
        r1 = p056c.p057a.p061e.C0887b.PROTOCOL_ERROR;	 Catch:{ IOException -> 0x0007 }
        r2.m2149a(r0, r1);	 Catch:{ IOException -> 0x0007 }
    L_0x0007:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.e.g.b():void");
    }

    final void m2152b(int i, C0887b c0887b) {
        this.f2724q.m2184a(i, c0887b);
    }

    public final synchronized boolean m2153c() {
        return this.f2714g;
    }

    public final void close() {
        m2149a(C0887b.NO_ERROR, C0887b.CANCEL);
    }
}
