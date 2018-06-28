package p056c.p057a.p061e;

import java.io.EOFException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import p206d.C2277r;
import p206d.C2278s;
import p206d.C2279t;
import p206d.C5681a;
import p206d.C5683e;
import p206d.C6623c;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C0898i {
    static final /* synthetic */ boolean f2733l = true;
    long f2734a = 0;
    long f2735b;
    final int f2736c;
    final C0895g f2737d;
    List<C0888c> f2738e;
    boolean f2739f;
    final C5023b f2740g;
    final C5022a f2741h;
    final C6438c f2742i = new C6438c(this);
    final C6438c f2743j = new C6438c(this);
    C0887b f2744k = null;
    private final List<C0888c> f2745m;

    final class C5022a implements C2277r {
        static final /* synthetic */ boolean f14017c = true;
        boolean f14018a;
        boolean f14019b;
        final /* synthetic */ C0898i f14020d;
        private final C6623c f14021e = new C6623c();

        static {
            Class cls = C0898i.class;
        }

        C5022a(C0898i c0898i) {
            this.f14020d = c0898i;
        }

        private void m10160a(boolean z) {
            synchronized (this.f14020d) {
                this.f14020d.f2743j.o_();
                while (this.f14020d.f2735b <= 0 && !this.f14019b && !this.f14018a && this.f14020d.f2744k == null) {
                    try {
                        this.f14020d.m2179h();
                    } finally {
                        this.f14020d.f2743j.m15351b();
                    }
                }
                this.f14020d.m2178g();
                long min = Math.min(this.f14020d.f2735b, this.f14021e.f18884b);
                C0898i c0898i = this.f14020d;
                c0898i.f2735b -= min;
            }
            this.f14020d.f2743j.o_();
            try {
                C0895g c0895g = this.f14020d.f2737d;
                int i = this.f14020d.f2736c;
                z = z && min == this.f14021e.f18884b;
                c0895g.m2148a(i, z, this.f14021e, min);
            } finally {
                this.f14020d.f2743j.m15351b();
            }
        }

        public final C2279t mo960a() {
            return this.f14020d.f2743j;
        }

        public final void a_(C6623c c6623c, long j) {
            if (f14017c || !Thread.holdsLock(this.f14020d)) {
                this.f14021e.a_(c6623c, j);
                while (this.f14021e.f18884b >= IjkMediaMeta.AV_CH_TOP_FRONT_RIGHT) {
                    m10160a(false);
                }
                return;
            }
            throw new AssertionError();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() {
            /*
            r8 = this;
            r0 = f14017c;
            if (r0 != 0) goto L_0x0012;
        L_0x0004:
            r0 = r8.f14020d;
            r0 = java.lang.Thread.holdsLock(r0);
            if (r0 == 0) goto L_0x0012;
        L_0x000c:
            r0 = new java.lang.AssertionError;
            r0.<init>();
            throw r0;
        L_0x0012:
            r0 = r8.f14020d;
            monitor-enter(r0);
            r1 = r8.f14018a;	 Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x001b;
        L_0x0019:
            monitor-exit(r0);	 Catch:{ all -> 0x0062 }
            return;
        L_0x001b:
            monitor-exit(r0);	 Catch:{ all -> 0x0062 }
            r0 = r8.f14020d;
            r0 = r0.f2741h;
            r0 = r0.f14019b;
            r1 = 1;
            if (r0 != 0) goto L_0x004a;
        L_0x0025:
            r0 = r8.f14021e;
            r2 = r0.f18884b;
            r4 = 0;
            r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r0 <= 0) goto L_0x003b;
        L_0x002f:
            r0 = r8.f14021e;
            r2 = r0.f18884b;
            r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r0 <= 0) goto L_0x004a;
        L_0x0037:
            r8.m10160a(r1);
            goto L_0x002f;
        L_0x003b:
            r0 = r8.f14020d;
            r2 = r0.f2737d;
            r0 = r8.f14020d;
            r3 = r0.f2736c;
            r4 = 1;
            r5 = 0;
            r6 = 0;
            r2.m2148a(r3, r4, r5, r6);
        L_0x004a:
            r2 = r8.f14020d;
            monitor-enter(r2);
            r8.f14018a = r1;	 Catch:{ all -> 0x005f }
            monitor-exit(r2);	 Catch:{ all -> 0x005f }
            r0 = r8.f14020d;
            r0 = r0.f2737d;
            r0 = r0.f2724q;
            r0.m2190b();
            r0 = r8.f14020d;
            r0.m2177f();
            return;
        L_0x005f:
            r0 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x005f }
            throw r0;
        L_0x0062:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0062 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: c.a.e.i.a.close():void");
        }

        public final void flush() {
            if (f14017c || !Thread.holdsLock(this.f14020d)) {
                synchronized (this.f14020d) {
                    this.f14020d.m2178g();
                }
                while (this.f14021e.f18884b > 0) {
                    m10160a(false);
                    this.f14020d.f2737d.f2724q.m2190b();
                }
                return;
            }
            throw new AssertionError();
        }
    }

    private final class C5023b implements C2278s {
        static final /* synthetic */ boolean f14022c = true;
        boolean f14023a;
        boolean f14024b;
        final /* synthetic */ C0898i f14025d;
        private final C6623c f14026e = new C6623c();
        private final C6623c f14027f = new C6623c();
        private final long f14028g;

        static {
            Class cls = C0898i.class;
        }

        C5023b(C0898i c0898i, long j) {
            this.f14025d = c0898i;
            this.f14028g = j;
        }

        private void m10162b() {
            this.f14025d.f2742i.o_();
            while (this.f14027f.f18884b == 0 && !this.f14024b && !this.f14023a && this.f14025d.f2744k == null) {
                try {
                    this.f14025d.m2179h();
                } catch (Throwable th) {
                    this.f14025d.f2742i.m15351b();
                }
            }
            this.f14025d.f2742i.m15351b();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long mo944a(p206d.C6623c r8, long r9) {
            /*
            r7 = this;
            r0 = 0;
            r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
            if (r2 >= 0) goto L_0x001a;
        L_0x0006:
            r8 = new java.lang.IllegalArgumentException;
            r0 = new java.lang.StringBuilder;
            r1 = "byteCount < 0: ";
            r0.<init>(r1);
            r0.append(r9);
            r9 = r0.toString();
            r8.<init>(r9);
            throw r8;
        L_0x001a:
            r2 = r7.f14025d;
            monitor-enter(r2);
            r7.m10162b();	 Catch:{ all -> 0x00c6 }
            r3 = r7.f14023a;	 Catch:{ all -> 0x00c6 }
            if (r3 == 0) goto L_0x002c;
        L_0x0024:
            r8 = new java.io.IOException;	 Catch:{ all -> 0x00c6 }
            r9 = "stream closed";
            r8.<init>(r9);	 Catch:{ all -> 0x00c6 }
            throw r8;	 Catch:{ all -> 0x00c6 }
        L_0x002c:
            r3 = r7.f14025d;	 Catch:{ all -> 0x00c6 }
            r3 = r3.f2744k;	 Catch:{ all -> 0x00c6 }
            if (r3 == 0) goto L_0x003c;
        L_0x0032:
            r8 = new c.a.e.n;	 Catch:{ all -> 0x00c6 }
            r9 = r7.f14025d;	 Catch:{ all -> 0x00c6 }
            r9 = r9.f2744k;	 Catch:{ all -> 0x00c6 }
            r8.<init>(r9);	 Catch:{ all -> 0x00c6 }
            throw r8;	 Catch:{ all -> 0x00c6 }
        L_0x003c:
            r3 = r7.f14027f;	 Catch:{ all -> 0x00c6 }
            r3 = r3.f18884b;	 Catch:{ all -> 0x00c6 }
            r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));
            if (r5 != 0) goto L_0x0048;
        L_0x0044:
            r8 = -1;
            monitor-exit(r2);	 Catch:{ all -> 0x00c6 }
            return r8;
        L_0x0048:
            r3 = r7.f14027f;	 Catch:{ all -> 0x00c6 }
            r4 = r7.f14027f;	 Catch:{ all -> 0x00c6 }
            r4 = r4.f18884b;	 Catch:{ all -> 0x00c6 }
            r9 = java.lang.Math.min(r9, r4);	 Catch:{ all -> 0x00c6 }
            r8 = r3.mo944a(r8, r9);	 Catch:{ all -> 0x00c6 }
            r10 = r7.f14025d;	 Catch:{ all -> 0x00c6 }
            r3 = r10.f2734a;	 Catch:{ all -> 0x00c6 }
            r5 = r3 + r8;
            r10.f2734a = r5;	 Catch:{ all -> 0x00c6 }
            r10 = r7.f14025d;	 Catch:{ all -> 0x00c6 }
            r3 = r10.f2734a;	 Catch:{ all -> 0x00c6 }
            r10 = r7.f14025d;	 Catch:{ all -> 0x00c6 }
            r10 = r10.f2737d;	 Catch:{ all -> 0x00c6 }
            r10 = r10.f2720m;	 Catch:{ all -> 0x00c6 }
            r10 = r10.m2203b();	 Catch:{ all -> 0x00c6 }
            r10 = r10 / 2;
            r5 = (long) r10;	 Catch:{ all -> 0x00c6 }
            r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
            if (r10 < 0) goto L_0x0086;
        L_0x0073:
            r10 = r7.f14025d;	 Catch:{ all -> 0x00c6 }
            r10 = r10.f2737d;	 Catch:{ all -> 0x00c6 }
            r3 = r7.f14025d;	 Catch:{ all -> 0x00c6 }
            r3 = r3.f2736c;	 Catch:{ all -> 0x00c6 }
            r4 = r7.f14025d;	 Catch:{ all -> 0x00c6 }
            r4 = r4.f2734a;	 Catch:{ all -> 0x00c6 }
            r10.m2146a(r3, r4);	 Catch:{ all -> 0x00c6 }
            r10 = r7.f14025d;	 Catch:{ all -> 0x00c6 }
            r10.f2734a = r0;	 Catch:{ all -> 0x00c6 }
        L_0x0086:
            monitor-exit(r2);	 Catch:{ all -> 0x00c6 }
            r10 = r7.f14025d;
            r10 = r10.f2737d;
            monitor-enter(r10);
            r2 = r7.f14025d;	 Catch:{ all -> 0x00c3 }
            r2 = r2.f2737d;	 Catch:{ all -> 0x00c3 }
            r3 = r2.f2718k;	 Catch:{ all -> 0x00c3 }
            r5 = r3 + r8;
            r2.f2718k = r5;	 Catch:{ all -> 0x00c3 }
            r2 = r7.f14025d;	 Catch:{ all -> 0x00c3 }
            r2 = r2.f2737d;	 Catch:{ all -> 0x00c3 }
            r2 = r2.f2718k;	 Catch:{ all -> 0x00c3 }
            r4 = r7.f14025d;	 Catch:{ all -> 0x00c3 }
            r4 = r4.f2737d;	 Catch:{ all -> 0x00c3 }
            r4 = r4.f2720m;	 Catch:{ all -> 0x00c3 }
            r4 = r4.m2203b();	 Catch:{ all -> 0x00c3 }
            r4 = r4 / 2;
            r4 = (long) r4;	 Catch:{ all -> 0x00c3 }
            r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r6 < 0) goto L_0x00c1;
        L_0x00ad:
            r2 = r7.f14025d;	 Catch:{ all -> 0x00c3 }
            r2 = r2.f2737d;	 Catch:{ all -> 0x00c3 }
            r3 = 0;
            r4 = r7.f14025d;	 Catch:{ all -> 0x00c3 }
            r4 = r4.f2737d;	 Catch:{ all -> 0x00c3 }
            r4 = r4.f2718k;	 Catch:{ all -> 0x00c3 }
            r2.m2146a(r3, r4);	 Catch:{ all -> 0x00c3 }
            r2 = r7.f14025d;	 Catch:{ all -> 0x00c3 }
            r2 = r2.f2737d;	 Catch:{ all -> 0x00c3 }
            r2.f2718k = r0;	 Catch:{ all -> 0x00c3 }
        L_0x00c1:
            monitor-exit(r10);	 Catch:{ all -> 0x00c3 }
            return r8;
        L_0x00c3:
            r8 = move-exception;
            monitor-exit(r10);	 Catch:{ all -> 0x00c3 }
            throw r8;
        L_0x00c6:
            r8 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x00c6 }
            throw r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: c.a.e.i.b.a(d.c, long):long");
        }

        public final C2279t mo945a() {
            return this.f14025d.f2742i;
        }

        final void m10165a(C5683e c5683e, long j) {
            if (f14022c || !Thread.holdsLock(this.f14025d)) {
                while (j > 0) {
                    boolean z;
                    Object obj;
                    Object obj2;
                    synchronized (this.f14025d) {
                        z = this.f14024b;
                        obj = null;
                        obj2 = j + this.f14027f.f18884b > this.f14028g ? 1 : null;
                    }
                    if (obj2 != null) {
                        c5683e.mo3142h(j);
                        this.f14025d.m2171b(C0887b.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        c5683e.mo3142h(j);
                        return;
                    } else {
                        long a = c5683e.mo944a(this.f14026e, j);
                        if (a == -1) {
                            throw new EOFException();
                        }
                        long j2 = j - a;
                        synchronized (this.f14025d) {
                            if (this.f14027f.f18884b == 0) {
                                obj = 1;
                            }
                            this.f14027f.m17022a(this.f14026e);
                            if (obj != null) {
                                this.f14025d.notifyAll();
                            }
                        }
                        j = j2;
                    }
                }
                return;
            }
            throw new AssertionError();
        }

        public final void close() {
            synchronized (this.f14025d) {
                this.f14023a = true;
                this.f14027f.m17071p();
                this.f14025d.notifyAll();
            }
            this.f14025d.m2177f();
        }
    }

    class C6438c extends C5681a {
        final /* synthetic */ C0898i f17604a;

        C6438c(C0898i c0898i) {
            this.f17604a = c0898i;
        }

        protected final IOException mo2688a(IOException iOException) {
            IOException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        protected final void mo2689a() {
            this.f17604a.m2171b(C0887b.CANCEL);
        }

        public final void m15351b() {
            if (p_()) {
                throw mo2688a(null);
            }
        }
    }

    C0898i(int i, C0895g c0895g, boolean z, boolean z2, List<C0888c> list) {
        if (c0895g == null) {
            throw new NullPointerException("connection == null");
        } else if (list == null) {
            throw new NullPointerException("requestHeaders == null");
        } else {
            this.f2736c = i;
            this.f2737d = c0895g;
            this.f2735b = (long) c0895g.f2721n.m2203b();
            this.f2740g = new C5023b(this, (long) c0895g.f2720m.m2203b());
            this.f2741h = new C5022a(this);
            this.f2740g.f14024b = z2;
            this.f2741h.f14019b = z;
            this.f2745m = list;
        }
    }

    private boolean m2167d(C0887b c0887b) {
        if (f2733l || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f2744k != null) {
                    return false;
                } else if (this.f2740g.f14024b && this.f2741h.f14019b) {
                    return false;
                } else {
                    this.f2744k = c0887b;
                    notifyAll();
                    this.f2737d.m2150b(this.f2736c);
                    return true;
                }
            }
        }
        throw new AssertionError();
    }

    final void m2168a(long j) {
        this.f2735b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void m2169a(C0887b c0887b) {
        if (m2167d(c0887b)) {
            this.f2737d.m2152b(this.f2736c, c0887b);
        }
    }

    public final synchronized boolean m2170a() {
        return this.f2744k != null ? false : ((this.f2740g.f14024b || this.f2740g.f14023a) && ((this.f2741h.f14019b || this.f2741h.f14018a) && this.f2739f)) ? false : true;
    }

    public final void m2171b(C0887b c0887b) {
        if (m2167d(c0887b)) {
            this.f2737d.m2147a(this.f2736c, c0887b);
        }
    }

    public final boolean m2172b() {
        return this.f2737d.f2708a == ((this.f2736c & 1) == 1);
    }

    public final synchronized List<C0888c> m2173c() {
        List<C0888c> list;
        if (m2172b()) {
            this.f2742i.o_();
            while (this.f2738e == null && this.f2744k == null) {
                try {
                    m2179h();
                } finally {
                    this.f2742i.m15351b();
                }
            }
            list = this.f2738e;
            if (list != null) {
                this.f2738e = null;
            } else {
                throw new C0904n(this.f2744k);
            }
        }
        throw new IllegalStateException("servers cannot read response headers");
        return list;
    }

    final synchronized void m2174c(C0887b c0887b) {
        if (this.f2744k == null) {
            this.f2744k = c0887b;
            notifyAll();
        }
    }

    public final C2277r m2175d() {
        synchronized (this) {
            if (this.f2739f || m2172b()) {
            } else {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f2741h;
    }

    final void m2176e() {
        if (f2733l || !Thread.holdsLock(this)) {
            boolean a;
            synchronized (this) {
                this.f2740g.f14024b = true;
                a = m2170a();
                notifyAll();
            }
            if (!a) {
                this.f2737d.m2150b(this.f2736c);
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    final void m2177f() {
        if (f2733l || !Thread.holdsLock(this)) {
            Object obj;
            boolean a;
            synchronized (this) {
                obj = (!this.f2740g.f14024b && this.f2740g.f14023a && (this.f2741h.f14019b || this.f2741h.f14018a)) ? 1 : null;
                a = m2170a();
            }
            if (obj != null) {
                m2169a(C0887b.CANCEL);
                return;
            }
            if (!a) {
                this.f2737d.m2150b(this.f2736c);
            }
            return;
        }
        throw new AssertionError();
    }

    final void m2178g() {
        if (this.f2741h.f14018a) {
            throw new IOException("stream closed");
        } else if (this.f2741h.f14019b) {
            throw new IOException("stream finished");
        } else if (this.f2744k != null) {
            throw new C0904n(this.f2744k);
        }
    }

    final void m2179h() {
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
        r1 = this;
        r1.wait();	 Catch:{ InterruptedException -> 0x0004 }
        return;
    L_0x0004:
        r0 = new java.io.InterruptedIOException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.e.i.h():void");
    }
}
