package com.google.android.gms.internal;

import android.util.DisplayMetrics;
import java.util.Locale;

public final class bb extends C5506v {
    bb(C1827x c1827x) {
        super(c1827x);
    }

    public final C5497f m15983b() {
        m12037k();
        DisplayMetrics displayMetrics = this.f6279f.m5161b().f5164a.getResources().getDisplayMetrics();
        C5497f c5497f = new C5497f();
        c5497f.f15225a = ce.m4646a(Locale.getDefault());
        c5497f.f15227c = displayMetrics.widthPixels;
        c5497f.f15228d = displayMetrics.heightPixels;
        return c5497f;
    }

    public final String m15984c() {
        m12037k();
        C5497f b = m15983b();
        int i = b.f15227c;
        int i2 = b.f15228d;
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append(i);
        stringBuilder.append("x");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    protected final void c_() {
    }
}
