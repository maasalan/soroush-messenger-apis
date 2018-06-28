package android.support.design.widget;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

final class C0325p {
    private static C0325p f1256e;
    final Object f1257a = new Object();
    final Handler f1258b = new Handler(Looper.getMainLooper(), new C03221(this));
    C0324b f1259c;
    C0324b f1260d;

    class C03221 implements Callback {
        final /* synthetic */ C0325p f1252a;

        C03221(C0325p c0325p) {
            this.f1252a = c0325p;
        }

        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C0325p c0325p = this.f1252a;
            C0324b c0324b = (C0324b) message.obj;
            synchronized (c0325p.f1257a) {
                if (c0325p.f1259c == c0324b || c0325p.f1260d == c0324b) {
                    c0325p.m643a(c0324b, 2);
                }
            }
            return true;
        }
    }

    interface C0323a {
        void mo180a();

        void mo181a(int i);
    }

    private static class C0324b {
        final WeakReference<C0323a> f1253a;
        int f1254b;
        boolean f1255c;

        C0324b(int i, C0323a c0323a) {
            this.f1253a = new WeakReference(c0323a);
            this.f1254b = i;
        }

        final boolean m639a(C0323a c0323a) {
            return c0323a != null && this.f1253a.get() == c0323a;
        }
    }

    private C0325p() {
    }

    static C0325p m640a() {
        if (f1256e == null) {
            f1256e = new C0325p();
        }
        return f1256e;
    }

    public final void m641a(C0323a c0323a) {
        synchronized (this.f1257a) {
            if (m647d(c0323a) && !this.f1259c.f1255c) {
                this.f1259c.f1255c = true;
                this.f1258b.removeCallbacksAndMessages(this.f1259c);
            }
        }
    }

    final void m642a(C0324b c0324b) {
        if (c0324b.f1254b != -2) {
            int i = 2750;
            if (c0324b.f1254b > 0) {
                i = c0324b.f1254b;
            } else if (c0324b.f1254b == -1) {
                i = 1500;
            }
            this.f1258b.removeCallbacksAndMessages(c0324b);
            this.f1258b.sendMessageDelayed(Message.obtain(this.f1258b, 0, c0324b), (long) i);
        }
    }

    final boolean m643a(C0324b c0324b, int i) {
        C0323a c0323a = (C0323a) c0324b.f1253a.get();
        if (c0323a == null) {
            return false;
        }
        this.f1258b.removeCallbacksAndMessages(c0324b);
        c0323a.mo181a(i);
        return true;
    }

    final void m644b() {
        if (this.f1260d != null) {
            this.f1259c = this.f1260d;
            this.f1260d = null;
            C0323a c0323a = (C0323a) this.f1259c.f1253a.get();
            if (c0323a != null) {
                c0323a.mo180a();
                return;
            }
            this.f1259c = null;
        }
    }

    public final void m645b(C0323a c0323a) {
        synchronized (this.f1257a) {
            if (m647d(c0323a) && this.f1259c.f1255c) {
                this.f1259c.f1255c = false;
                m642a(this.f1259c);
            }
        }
    }

    public final boolean m646c(C0323a c0323a) {
        boolean z;
        synchronized (this.f1257a) {
            if (!m647d(c0323a)) {
                if (!m648e(c0323a)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    final boolean m647d(C0323a c0323a) {
        return this.f1259c != null && this.f1259c.m639a(c0323a);
    }

    final boolean m648e(C0323a c0323a) {
        return this.f1260d != null && this.f1260d.m639a(c0323a);
    }
}
