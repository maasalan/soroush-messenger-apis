package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.C1802d;

final class C5481d implements C1802d {
    C5481d() {
    }

    public final C1805j mo1580a(Context context, String str, C1804i c1804i) {
        int i;
        C1805j c1805j = new C1805j();
        c1805j.f5489a = c1804i.mo1578a(context, str);
        c1805j.f5490b = c1804i.mo1579a(context, str, true);
        if (c1805j.f5489a == 0 && c1805j.f5490b == 0) {
            i = 0;
        } else if (c1805j.f5489a >= c1805j.f5490b) {
            i = -1;
        } else {
            c1805j.f5491c = 1;
            return c1805j;
        }
        c1805j.f5491c = i;
        return c1805j;
    }
}
