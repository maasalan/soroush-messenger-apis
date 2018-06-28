package android.support.v4.p029a;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.os.C0509c;
import android.support.v4.p029a.C0358f.C03534;
import android.support.v4.p029a.C0358f.C0356c;
import android.support.v4.p038g.C0484o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public abstract class C4764a<D> extends C0350e<D> {
    volatile C4761a f13163a;
    volatile C4761a f13164b;
    long f13165c;
    long f13166d;
    Handler f13167e;
    private final Executor f13168f;

    final class C4761a extends C0358f<Void, Void, D> implements Runnable {
        boolean f13156a;
        final /* synthetic */ C4764a f13157b;
        private final CountDownLatch f13158h = new CountDownLatch(1);

        C4761a(C4764a c4764a) {
            this.f13157b = c4764a;
        }

        private D m8836c() {
            try {
                return this.f13157b.mo2523d();
            } catch (C0509c e) {
                if (this.f1328g.get()) {
                    return null;
                }
                throw e;
            }
        }

        protected final /* synthetic */ Object mo215a() {
            return m8836c();
        }

        protected final void mo216a(D d) {
            try {
                C0350e c0350e = this.f13157b;
                if (c0350e.f13163a != this) {
                    c0350e.m8840a(this, d);
                } else if (c0350e.f1306s) {
                    c0350e.mo2521a(d);
                } else {
                    c0350e.f1309v = false;
                    c0350e.f13166d = SystemClock.uptimeMillis();
                    c0350e.f13163a = null;
                    c0350e.mo2522b(d);
                }
                this.f13158h.countDown();
            } catch (Throwable th) {
                this.f13158h.countDown();
            }
        }

        protected final void mo217b(D d) {
            try {
                this.f13157b.m8840a(this, d);
            } finally {
                this.f13158h.countDown();
            }
        }

        public final void run() {
            this.f13156a = false;
            this.f13157b.m8844c();
        }
    }

    public C4764a(Context context) {
        this(context, C0358f.f1322c);
    }

    private C4764a(Context context, Executor executor) {
        super(context);
        this.f13166d = -10000;
        this.f13168f = executor;
    }

    final void m8840a(C4761a c4761a, D d) {
        mo2521a(d);
        if (this.f13164b == c4761a) {
            m704n();
            this.f13166d = SystemClock.uptimeMillis();
            this.f13164b = null;
            m699i();
            m8844c();
        }
    }

    public void mo2521a(D d) {
    }

    public void mo218a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo218a(str, fileDescriptor, printWriter, strArr);
        if (this.f13163a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f13163a);
            printWriter.print(" waiting=");
            printWriter.println(this.f13163a.f13156a);
        }
        if (this.f13164b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f13164b);
            printWriter.print(" waiting=");
            printWriter.println(this.f13164b.f13156a);
        }
        if (this.f13165c != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C0484o.m1036a(this.f13165c, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C0484o.m1035a(this.f13166d, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    protected final boolean mo219b() {
        if (this.f13163a == null) {
            return false;
        }
        if (!this.r) {
            this.u = true;
        }
        if (this.f13164b != null) {
            if (this.f13163a.f13156a) {
                this.f13163a.f13156a = false;
                this.f13167e.removeCallbacks(this.f13163a);
            }
            this.f13163a = null;
            return false;
        } else if (this.f13163a.f13156a) {
            this.f13163a.f13156a = false;
            this.f13167e.removeCallbacks(this.f13163a);
            this.f13163a = null;
            return false;
        } else {
            C0358f c0358f = this.f13163a;
            c0358f.f1328g.set(true);
            boolean cancel = c0358f.f1326e.cancel(false);
            if (cancel) {
                this.f13164b = this.f13163a;
                mo2524e();
            }
            this.f13163a = null;
            return cancel;
        }
    }

    final void m8844c() {
        if (this.f13164b == null && this.f13163a != null) {
            if (this.f13163a.f13156a) {
                this.f13163a.f13156a = false;
                this.f13167e.removeCallbacks(this.f13163a);
            }
            if (this.f13165c <= 0 || SystemClock.uptimeMillis() >= this.f13166d + this.f13165c) {
                C0358f c0358f = this.f13163a;
                Executor executor = this.f13168f;
                if (c0358f.f1327f != C0356c.f1315a) {
                    switch (C03534.f1312a[c0358f.f1327f - 1]) {
                        case 1:
                            throw new IllegalStateException("Cannot execute task: the task is already running.");
                        case 2:
                            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                        default:
                            throw new IllegalStateException("We should never reach this state");
                    }
                }
                c0358f.f1327f = C0356c.f1316b;
                c0358f.f1325d.f1319b = null;
                executor.execute(c0358f.f1326e);
            } else {
                this.f13163a.f13156a = true;
                this.f13167e.postAtTime(this.f13163a, this.f13166d + this.f13165c);
            }
        }
    }

    public abstract D mo2523d();

    public void mo2524e() {
    }

    protected final void j_() {
        super.j_();
        mo219b();
        this.f13163a = new C4761a(this);
        m8844c();
    }
}
