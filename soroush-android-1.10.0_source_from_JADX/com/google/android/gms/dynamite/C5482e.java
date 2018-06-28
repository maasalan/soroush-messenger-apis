package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.C1802d;

final class C5482e implements C1802d {
    C5482e() {
    }

    public final C1805j mo1580a(Context context, String str, C1804i c1804i) {
        C1805j c1805j = new C1805j();
        c1805j.f5489a = c1804i.mo1578a(context, str);
        c1805j.f5490b = c1805j.f5489a != 0 ? c1804i.mo1579a(context, str, false) : c1804i.mo1579a(context, str, true);
        if (c1805j.f5489a == 0 && c1805j.f5490b == 0) {
            c1805j.f5491c = 0;
            return c1805j;
        } else if (c1805j.f5489a >= c1805j.f5490b) {
            c1805j.f5491c = -1;
            return c1805j;
        } else {
            c1805j.f5491c = 1;
            return c1805j;
        }
    }
}
