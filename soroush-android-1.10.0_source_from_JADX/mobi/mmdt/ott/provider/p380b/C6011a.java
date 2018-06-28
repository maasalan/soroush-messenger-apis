package mobi.mmdt.ott.provider.p380b;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.os.C0509c;
import android.support.v4.p029a.C0350e;
import android.support.v4.p038g.C0484o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.provider.p380b.C2951b.C29464;
import mobi.mmdt.ott.provider.p380b.C2951b.C2949c;

public abstract class C6011a<D> extends C0350e<D> {
    private final Executor f16178a;
    volatile C6010a f16179b;
    volatile C6010a f16180c;
    long f16181d;
    long f16182e;
    Handler f16183f;

    final class C6010a extends C2951b<Void, Void, D> implements Runnable {
        boolean f16175a;
        final /* synthetic */ C6011a f16176b;
        private final CountDownLatch f16177g = new CountDownLatch(1);

        C6010a(C6011a c6011a) {
            this.f16176b = c6011a;
        }

        private D m13290c() {
            try {
                return this.f16176b.mo3179e();
            } catch (C0509c e) {
                if (this.f9175e.isCancelled()) {
                    return null;
                }
                throw e;
            }
        }

        protected final /* synthetic */ Object mo2220a() {
            return m13290c();
        }

        protected final void mo2221a(D d) {
            try {
                C0350e c0350e = this.f16176b;
                if (c0350e.f16179b != this) {
                    c0350e.m13297a(this, d);
                } else if (c0350e.f1306s) {
                    c0350e.mo3177a((Object) d);
                } else {
                    c0350e.f1309v = false;
                    c0350e.f16182e = SystemClock.uptimeMillis();
                    c0350e.f16179b = null;
                    c0350e.mo2522b(d);
                }
                this.f16177g.countDown();
            } catch (Throwable th) {
                this.f16177g.countDown();
            }
        }

        protected final void mo2222b(D d) {
            try {
                this.f16176b.m13297a(this, d);
            } finally {
                this.f16177g.countDown();
            }
        }

        public final void run() {
            this.f16175a = false;
            this.f16176b.m13301p();
        }
    }

    public C6011a(Context context) {
        this(context, C2951b.f9171c);
    }

    private C6011a(Context context, Executor executor) {
        super(context);
        this.f16182e = -10000;
        this.f16178a = executor;
    }

    public final void m13294a(long j) {
        this.f16181d = j;
        if (j != 0) {
            this.f16183f = new Handler();
        }
    }

    public void mo3177a(D d) {
    }

    public final void mo218a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo218a(str, fileDescriptor, printWriter, strArr);
        if (this.f16179b != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f16179b);
            printWriter.print(" waiting=");
            printWriter.println(this.f16179b.f16175a);
        }
        if (this.f16180c != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f16180c);
            printWriter.print(" waiting=");
            printWriter.println(this.f16180c.f16175a);
        }
        if (this.f16181d != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C0484o.m1036a(this.f16181d, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C0484o.m1035a(this.f16182e, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    final void m13297a(C6010a c6010a, D d) {
        mo3177a((Object) d);
        if (this.f16180c == c6010a) {
            m704n();
            this.f16182e = SystemClock.uptimeMillis();
            this.f16180c = null;
            m699i();
            m13301p();
        }
    }

    protected final boolean mo219b() {
        if (this.f16179b == null) {
            return false;
        }
        if (this.f16180c != null) {
            if (this.f16179b.f16175a) {
                this.f16179b.f16175a = false;
                this.f16183f.removeCallbacks(this.f16179b);
            }
            this.f16179b = null;
            return false;
        } else if (this.f16179b.f16175a) {
            this.f16179b.f16175a = false;
            this.f16183f.removeCallbacks(this.f16179b);
            this.f16179b = null;
            return false;
        } else {
            boolean cancel = this.f16179b.f9175e.cancel(false);
            if (cancel) {
                this.f16180c = this.f16179b;
                mo3178d();
            }
            this.f16179b = null;
            return cancel;
        }
    }

    public void mo3178d() {
    }

    public abstract D mo3179e();

    protected final void j_() {
        super.j_();
        try {
            mo219b();
        } catch (Throwable e) {
            C2480b.m6737b("Problem in cancel loader", e);
        }
        this.f16179b = new C6010a(this);
        m13301p();
    }

    final void m13301p() {
        if (this.f16180c == null && this.f16179b != null) {
            if (this.f16179b.f16175a) {
                this.f16179b.f16175a = false;
                this.f16183f.removeCallbacks(this.f16179b);
            }
            if (this.f16181d > 0 && SystemClock.uptimeMillis() < this.f16182e + this.f16181d) {
                this.f16179b.f16175a = true;
                this.f16183f.postAtTime(this.f16179b, this.f16182e + this.f16181d);
            } else if (this.f16179b != null) {
                C2951b c2951b = this.f16179b;
                Executor executor = this.f16178a;
                if (c2951b.f9176f != C2949c.f9164a) {
                    int[] iArr = C29464.f9161a;
                    int i = c2951b.f9176f;
                }
                c2951b.f9176f = C2949c.f9165b;
                c2951b.f9174d.f9168b = null;
                executor.execute(c2951b.f9175e);
            }
        }
    }
}
