package com.p085c.p086a.p089c.p098d.p099a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p089c.C5255m;
import com.p085c.p086a.p089c.p092b.C1159s;
import com.p085c.p086a.p109i.C1271h;
import java.security.MessageDigest;

public final class C6450c implements C5255m<BitmapDrawable> {
    private final C5255m<Bitmap> f17608b;

    public C6450c(C5255m<Bitmap> c5255m) {
        this.f17608b = (C5255m) C1271h.m3012a((Object) c5255m, "Argument must not be null");
    }

    public final C1159s<BitmapDrawable> mo2695a(Context context, C1159s<BitmapDrawable> c1159s, int i, int i2) {
        C1159s a = C5217e.m10772a(((BitmapDrawable) c1159s.mo1180b()).getBitmap(), C1212c.m2871a(context).f3830a);
        C1159s a2 = this.f17608b.mo2695a(context, a, i, i2);
        if (a2.equals(a)) {
            return c1159s;
        }
        return C5229o.m10812a(context.getResources(), C1212c.m2871a(context).f3830a, (Bitmap) a2.mo1180b());
    }

    public final void mo1158a(MessageDigest messageDigest) {
        this.f17608b.mo1158a(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6450c)) {
            return false;
        }
        return this.f17608b.equals(((C6450c) obj).f17608b);
    }

    public final int hashCode() {
        return this.f17608b.hashCode();
    }
}
