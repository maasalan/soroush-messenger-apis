package com.p085c.p086a.p089c.p098d.p100e;

import android.content.Context;
import android.graphics.Bitmap;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p089c.C5255m;
import com.p085c.p086a.p089c.p092b.C1159s;
import com.p085c.p086a.p089c.p098d.p099a.C5217e;
import com.p085c.p086a.p109i.C1271h;
import java.security.MessageDigest;

public final class C6457f implements C5255m<C5244c> {
    private final C5255m<Bitmap> f17612b;

    public C6457f(C5255m<Bitmap> c5255m) {
        this.f17612b = (C5255m) C1271h.m3012a((Object) c5255m, "Argument must not be null");
    }

    public final C1159s<C5244c> mo2695a(Context context, C1159s<C5244c> c1159s, int i, int i2) {
        C5244c c5244c = (C5244c) c1159s.mo1180b();
        C1159s c5217e = new C5217e(c5244c.m10858a(), C1212c.m2871a(context).f3830a);
        C1159s a = this.f17612b.mo2695a(context, c5217e, i, i2);
        if (!c5217e.equals(a)) {
            c5217e.mo1182d();
        }
        Bitmap bitmap = (Bitmap) a.mo1180b();
        c5244c.f14580a.f3791b.m2849a(this.f17612b, bitmap);
        return c1159s;
    }

    public final void mo1158a(MessageDigest messageDigest) {
        this.f17612b.mo1158a(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6457f)) {
            return false;
        }
        return this.f17612b.equals(((C6457f) obj).f17612b);
    }

    public final int hashCode() {
        return this.f17612b.hashCode();
    }
}
