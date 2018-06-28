package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.C1802d;

final class C5479b implements C1802d {
    C5479b() {
    }

    public final C1805j mo1580a(Context context, String str, C1804i c1804i) {
        C1805j c1805j = new C1805j();
        c1805j.f5490b = c1804i.mo1579a(context, str, true);
        if (c1805j.f5490b != 0) {
            c1805j.f5491c = 1;
            return c1805j;
        }
        c1805j.f5489a = c1804i.mo1578a(context, str);
        if (c1805j.f5489a != 0) {
            c1805j.f5491c = -1;
        }
        return c1805j;
    }
}
