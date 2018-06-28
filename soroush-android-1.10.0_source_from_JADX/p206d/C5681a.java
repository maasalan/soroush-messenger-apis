package p206d;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class C5681a extends C2279t {
    private static final long f15617a = TimeUnit.SECONDS.toMillis(60);
    static C5681a f15618b;
    private static final long f15619d = TimeUnit.MILLISECONDS.toNanos(f15617a);
    private boolean f15620e;
    private C5681a f15621f;
    private long f15622g;

    private static final class C2268a extends Thread {
        C2268a() {
            super("Okio Watchdog");
            setDaemon(true);
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
        L_0x0000:
            r0 = p206d.C5681a.class;	 Catch:{ InterruptedException -> 0x0000 }
            monitor-enter(r0);	 Catch:{ InterruptedException -> 0x0000 }
            r1 = p206d.C5681a.m12662e();	 Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x000b;	 Catch:{ all -> 0x0019 }
        L_0x0009:
            monitor-exit(r0);	 Catch:{ all -> 0x0019 }
            goto L_0x0000;	 Catch:{ all -> 0x0019 }
        L_0x000b:
            r2 = p206d.C5681a.f15618b;	 Catch:{ all -> 0x0019 }
            if (r1 != r2) goto L_0x0014;	 Catch:{ all -> 0x0019 }
        L_0x000f:
            r1 = 0;	 Catch:{ all -> 0x0019 }
            p206d.C5681a.f15618b = r1;	 Catch:{ all -> 0x0019 }
            monitor-exit(r0);	 Catch:{ all -> 0x0019 }
            return;	 Catch:{ all -> 0x0019 }
        L_0x0014:
            monitor-exit(r0);	 Catch:{ all -> 0x0019 }
            r1.mo2689a();	 Catch:{ InterruptedException -> 0x0000 }
            goto L_0x0000;
        L_0x0019:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0019 }
            throw r1;	 Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: d.a.a.run():void");
        }
    }

    class C56791 implements C2277r {
        final /* synthetic */ C2277r f15613a;
        final /* synthetic */ C5681a f15614b;

        C56791(C5681a c5681a, C2277r c2277r) {
            this.f15614b = c5681a;
            this.f15613a = c2277r;
        }

        public final C2279t mo960a() {
            return this.f15614b;
        }

        public final void a_(C6623c c6623c, long j) {
            C2280u.m6235a(c6623c.f18884b, 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C2275o c2275o = c6623c.f18883a;
                    while (j2 < IjkMediaMeta.AV_CH_TOP_BACK_CENTER) {
                        long j3 = j2 + ((long) (c2275o.f7565c - c2275o.f7564b));
                        if (j3 >= j) {
                            j2 = j;
                            break;
                        } else {
                            c2275o = c2275o.f7568f;
                            j2 = j3;
                        }
                    }
                    this.f15614b.o_();
                    try {
                        this.f15613a.a_(c6623c, j2);
                        long j4 = j - j2;
                        this.f15614b.m12665a(true);
                        j = j4;
                    } catch (IOException e) {
                        throw this.f15614b.m12666b(e);
                    } catch (Throwable th) {
                        this.f15614b.m12665a(false);
                    }
                } else {
                    return;
                }
            }
        }

        public final void close() {
            this.f15614b.o_();
            try {
                this.f15613a.close();
                this.f15614b.m12665a(true);
            } catch (IOException e) {
                throw this.f15614b.m12666b(e);
            } catch (Throwable th) {
                this.f15614b.m12665a(false);
            }
        }

        public final void flush() {
            this.f15614b.o_();
            try {
                this.f15613a.flush();
                this.f15614b.m12665a(true);
            } catch (IOException e) {
                throw this.f15614b.m12666b(e);
            } catch (Throwable th) {
                this.f15614b.m12665a(false);
            }
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("AsyncTimeout.sink(");
            stringBuilder.append(this.f15613a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    class C56802 implements C2278s {
        final /* synthetic */ C2278s f15615a;
        final /* synthetic */ C5681a f15616b;

        C56802(C5681a c5681a, C2278s c2278s) {
            this.f15616b = c5681a;
            this.f15615a = c2278s;
        }

        public final long mo944a(C6623c c6623c, long j) {
            this.f15616b.o_();
            try {
                long a = this.f15615a.mo944a(c6623c, j);
                this.f15616b.m12665a(true);
                return a;
            } catch (IOException e) {
                throw this.f15616b.m12666b(e);
            } catch (Throwable th) {
                this.f15616b.m12665a(false);
            }
        }

        public final C2279t mo945a() {
            return this.f15616b;
        }

        public final void close() {
            try {
                this.f15615a.close();
                this.f15616b.m12665a(true);
            } catch (IOException e) {
                throw this.f15616b.m12666b(e);
            } catch (Throwable th) {
                this.f15616b.m12665a(false);
            }
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("AsyncTimeout.source(");
            stringBuilder.append(this.f15615a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private static synchronized void m12660a(C5681a c5681a, long j, boolean z) {
        synchronized (C5681a.class) {
            long j2;
            C5681a c5681a2;
            if (f15618b == null) {
                f15618b = new C5681a();
                new C2268a().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                j = Math.min(j, c5681a.mo2032c() - nanoTime);
            } else if (j == 0) {
                if (z) {
                    c5681a.f15622g = c5681a.mo2032c();
                    j2 = c5681a.f15622g - nanoTime;
                    c5681a2 = f15618b;
                    while (c5681a2.f15621f != null) {
                        if (j2 < c5681a2.f15621f.f15622g - nanoTime) {
                            break;
                        }
                        c5681a2 = c5681a2.f15621f;
                    }
                    c5681a.f15621f = c5681a2.f15621f;
                    c5681a2.f15621f = c5681a;
                    if (c5681a2 != f15618b) {
                        C5681a.class.notify();
                    }
                    return;
                }
                throw new AssertionError();
            }
            c5681a.f15622g = nanoTime + j;
            j2 = c5681a.f15622g - nanoTime;
            c5681a2 = f15618b;
            while (c5681a2.f15621f != null) {
                if (j2 < c5681a2.f15621f.f15622g - nanoTime) {
                    break;
                }
                c5681a2 = c5681a2.f15621f;
            }
            c5681a.f15621f = c5681a2.f15621f;
            c5681a2.f15621f = c5681a;
            if (c5681a2 != f15618b) {
                return;
            }
            C5681a.class.notify();
        }
    }

    private static synchronized boolean m12661a(C5681a c5681a) {
        boolean z;
        synchronized (C5681a.class) {
            for (C5681a c5681a2 = f15618b; c5681a2 != null; c5681a2 = c5681a2.f15621f) {
                if (c5681a2.f15621f == c5681a) {
                    c5681a2.f15621f = c5681a.f15621f;
                    c5681a.f15621f = null;
                    z = false;
                    break;
                }
            }
            z = true;
        }
        return z;
    }

    static C5681a m12662e() {
        C5681a c5681a = f15618b.f15621f;
        if (c5681a == null) {
            long nanoTime = System.nanoTime();
            C5681a.class.wait(f15617a);
            return (f15618b.f15621f != null || System.nanoTime() - nanoTime < f15619d) ? null : f15618b;
        } else {
            long nanoTime2 = c5681a.f15622g - System.nanoTime();
            if (nanoTime2 > 0) {
                long j = nanoTime2 / 1000000;
                C5681a.class.wait(j, (int) (nanoTime2 - (1000000 * j)));
                return null;
            }
            f15618b.f15621f = c5681a.f15621f;
            c5681a.f15621f = null;
            return c5681a;
        }
    }

    protected IOException mo2688a(IOException iOException) {
        IOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    protected void mo2689a() {
    }

    final void m12665a(boolean z) {
        if (p_() && z) {
            throw mo2688a(null);
        }
    }

    final IOException m12666b(IOException iOException) {
        return !p_() ? iOException : mo2688a(iOException);
    }

    public final void o_() {
        if (this.f15620e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long q_ = q_();
        boolean r_ = r_();
        if (q_ != 0 || r_) {
            this.f15620e = true;
            C5681a.m12660a(this, q_, r_);
        }
    }

    public final boolean p_() {
        if (!this.f15620e) {
            return false;
        }
        this.f15620e = false;
        return C5681a.m12661a(this);
    }
}
