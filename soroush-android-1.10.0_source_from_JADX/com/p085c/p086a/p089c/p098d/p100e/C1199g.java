package com.p085c.p086a.p089c.p098d.p100e;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.C5284j;
import com.p085c.p086a.p088b.C1087a;
import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p089c.C5255m;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p089c.p092b.p093a.C1106e;
import com.p085c.p086a.p105g.C1248f;
import com.p085c.p086a.p105g.p106a.C7038f;
import com.p085c.p086a.p105g.p107b.C1242b;
import com.p085c.p086a.p109i.C1271h;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

final class C1199g {
    final C1087a f3793a;
    final Handler f3794b;
    final List<C1197b> f3795c;
    final C5284j f3796d;
    boolean f3797e;
    boolean f3798f;
    C7257a f3799g;
    boolean f3800h;
    C7257a f3801i;
    Bitmap f3802j;
    private final C1106e f3803k;
    private boolean f3804l;
    private C1274i<Bitmap> f3805m;
    private C5255m<Bitmap> f3806n;

    public interface C1197b {
        void mo1221c();
    }

    private class C1198c implements Callback {
        final /* synthetic */ C1199g f3792a;

        C1198c(C1199g c1199g) {
            this.f3792a = c1199g;
        }

        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                C7257a c7257a = (C7257a) message.obj;
                C1199g c1199g = this.f3792a;
                if (c1199g.f3800h) {
                    c1199g.f3794b.obtainMessage(2, c7257a).sendToTarget();
                    return true;
                }
                if (c7257a.f20953b != null) {
                    c1199g.m2852d();
                    C7257a c7257a2 = c1199g.f3799g;
                    c1199g.f3799g = c7257a;
                    for (int size = c1199g.f3795c.size() - 1; size >= 0; size--) {
                        ((C1197b) c1199g.f3795c.get(size)).mo1221c();
                    }
                    if (c7257a2 != null) {
                        c1199g.f3794b.obtainMessage(2, c7257a2).sendToTarget();
                    }
                }
                c1199g.f3798f = false;
                c1199g.m2851c();
                return true;
            }
            if (message.what == 2) {
                this.f3792a.f3796d.m10954a((C7257a) message.obj);
            }
            return false;
        }
    }

    static class C5245d implements C1208h {
        private final UUID f14590b;

        public C5245d() {
            this(UUID.randomUUID());
        }

        private C5245d(UUID uuid) {
            this.f14590b = uuid;
        }

        public final void mo1158a(MessageDigest messageDigest) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public final boolean equals(Object obj) {
            return obj instanceof C5245d ? ((C5245d) obj).f14590b.equals(this.f14590b) : false;
        }

        public final int hashCode() {
            return this.f14590b.hashCode();
        }
    }

    static class C7257a extends C7038f<Bitmap> {
        final int f20952a;
        Bitmap f20953b;
        private final Handler f20954c;
        private final long f20955d;

        C7257a(Handler handler, int i, long j) {
            this.f20954c = handler;
            this.f20952a = i;
            this.f20955d = j;
        }

        public final /* synthetic */ void mo3320a(Object obj, C1242b c1242b) {
            this.f20953b = (Bitmap) obj;
            this.f20954c.sendMessageAtTime(this.f20954c.obtainMessage(1, this), this.f20955d);
        }
    }

    private C1199g(C1106e c1106e, C5284j c5284j, C1087a c1087a, C1274i<Bitmap> c1274i, C5255m<Bitmap> c5255m, Bitmap bitmap) {
        this.f3795c = new ArrayList();
        this.f3797e = false;
        this.f3798f = false;
        this.f3804l = false;
        this.f3796d = c5284j;
        Handler handler = new Handler(Looper.getMainLooper(), new C1198c(this));
        this.f3803k = c1106e;
        this.f3794b = handler;
        this.f3805m = c1274i;
        this.f3793a = c1087a;
        m2849a(c5255m, bitmap);
    }

    public C1199g(C1212c c1212c, C1087a c1087a, int i, int i2, C5255m<Bitmap> c5255m, Bitmap bitmap) {
        this(c1212c.f3830a, C1212c.m2875b(c1212c.f3832c.getBaseContext()), c1087a, C1212c.m2875b(c1212c.f3832c.getBaseContext()).m10958e().m3034a(C1248f.m2938a(C1144h.f3690b).m2956c().m2954b(i, i2)), (C5255m) c5255m, bitmap);
    }

    final int m2848a() {
        return this.f3793a.mo1101d();
    }

    final void m2849a(C5255m<Bitmap> c5255m, Bitmap bitmap) {
        this.f3806n = (C5255m) C1271h.m3012a((Object) c5255m, "Argument must not be null");
        this.f3802j = (Bitmap) C1271h.m3012a((Object) bitmap, "Argument must not be null");
        this.f3805m = this.f3805m.m3034a(new C1248f().m2951a((C5255m) c5255m));
    }

    final Bitmap m2850b() {
        return this.f3799g != null ? this.f3799g.f20953b : this.f3802j;
    }

    final void m2851c() {
        if (this.f3797e && !this.f3798f) {
            if (this.f3804l) {
                this.f3793a.mo1103f();
                this.f3804l = false;
            }
            this.f3798f = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f3793a.mo1100c());
            this.f3793a.mo1099b();
            this.f3801i = new C7257a(this.f3794b, this.f3793a.mo1102e(), uptimeMillis);
            this.f3805m.m3038b().m3034a(C1248f.m2940a(new C5245d())).m3037a(this.f3793a).m3032a(this.f3801i);
        }
    }

    final void m2852d() {
        if (this.f3802j != null) {
            this.f3803k.mo1138a(this.f3802j);
            this.f3802j = null;
        }
    }
}
