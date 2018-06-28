package p056c;

import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p056c.p057a.C0885c;
import p056c.p057a.p059b.C0868d;
import p056c.p057a.p059b.C0873g.C0872a;
import p056c.p057a.p059b.C4998c;
import p056c.p057a.p063g.C0909f;

public final class C0934j {
    static final Executor f2940a = new ThreadPoolExecutor(0, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), C0885c.m2096a("OkHttp ConnectionPool", true));
    static final /* synthetic */ boolean f2941g = true;
    final int f2942b;
    final Runnable f2943c;
    final Deque<C4998c> f2944d;
    final C0868d f2945e;
    boolean f2946f;
    private final long f2947h;

    class C09331 implements Runnable {
        final /* synthetic */ C0934j f2939a;

        C09331(C0934j c0934j) {
            this.f2939a = c0934j;
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
            r8 = this;
        L_0x0000:
            r0 = r8.f2939a;
            r1 = java.lang.System.nanoTime();
            r0 = r0.m2292a(r1);
            r2 = -1;
            r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
            if (r4 != 0) goto L_0x0011;
        L_0x0010:
            return;
        L_0x0011:
            r2 = 0;
            r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
            if (r4 <= 0) goto L_0x0000;
        L_0x0017:
            r2 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
            r4 = r0 / r2;
            r2 = r2 * r4;
            r6 = r0 - r2;
            r0 = r8.f2939a;
            monitor-enter(r0);
            r1 = r8.f2939a;	 Catch:{ InterruptedException -> 0x002b }
            r2 = (int) r6;	 Catch:{ InterruptedException -> 0x002b }
            r1.wait(r4, r2);	 Catch:{ InterruptedException -> 0x002b }
            goto L_0x002b;
        L_0x0029:
            r1 = move-exception;
            goto L_0x002d;
        L_0x002b:
            monitor-exit(r0);	 Catch:{ all -> 0x0029 }
            goto L_0x0000;	 Catch:{ all -> 0x0029 }
        L_0x002d:
            monitor-exit(r0);	 Catch:{ all -> 0x0029 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: c.j.1.run():void");
        }
    }

    public C0934j() {
        this(TimeUnit.MINUTES);
    }

    private C0934j(TimeUnit timeUnit) {
        this.f2943c = new C09331(this);
        this.f2944d = new ArrayDeque();
        this.f2945e = new C0868d();
        this.f2942b = 5;
        this.f2947h = timeUnit.toNanos(5);
    }

    final long m2292a(long j) {
        synchronized (this) {
            long j2 = Long.MIN_VALUE;
            int i = 0;
            C4998c c4998c = null;
            int i2 = i;
            for (C4998c c4998c2 : this.f2944d) {
                int i3;
                List list = c4998c2.f13921k;
                int i4 = 0;
                while (i4 < list.size()) {
                    Reference reference = (Reference) list.get(i4);
                    if (reference.get() != null) {
                        i4++;
                    } else {
                        C0872a c0872a = (C0872a) reference;
                        StringBuilder stringBuilder = new StringBuilder("A connection to ");
                        stringBuilder.append(c4998c2.f13911a.f2837a.f2785a);
                        stringBuilder.append(" was leaked. Did you forget to close a response body?");
                        C0909f.m2216c().mo991a(stringBuilder.toString(), c0872a.f2607a);
                        list.remove(i4);
                        c4998c2.f13918h = true;
                        if (list.isEmpty()) {
                            c4998c2.f13922l = j - this.f2947h;
                            i3 = 0;
                            break;
                        }
                    }
                }
                i3 = list.size();
                if (i3 > 0) {
                    i++;
                } else {
                    i2++;
                    long j3 = j - c4998c2.f13922l;
                    if (j3 > j2) {
                        c4998c = c4998c2;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.f2947h) {
                if (i2 <= this.f2942b) {
                    if (i2 > 0) {
                        long j4 = this.f2947h - j2;
                        return j4;
                    } else if (i > 0) {
                        j = this.f2947h;
                        return j;
                    } else {
                        this.f2946f = false;
                        return -1;
                    }
                }
            }
            this.f2944d.remove(c4998c);
            C0885c.m2099a(c4998c.f13913c);
            return 0;
        }
    }
}
