package com.p072b.p073a.p074a.p081h.p082a;

import android.support.v4.p038g.C0469g;
import com.p072b.p073a.p074a.C1029e;

final class C1058f {
    final C0469g<Long, C1057e> f3440a = new C50931(this);
    private final String f3441b;

    class C50931 extends C0469g<Long, C1057e> {
        final /* synthetic */ C1058f f14222a;

        C50931(C1058f c1058f) {
            this.f14222a = c1058f;
            super(15);
        }

        protected final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
            C1057e c1057e = (C1057e) obj2;
            if (c1057e.f3436d != null) {
                c1057e.f3436d.close();
                c1057e.f3436d = null;
            }
            if (c1057e.f3438f != null) {
                c1057e.f3438f.close();
                c1057e.f3438f = null;
            }
        }
    }

    public C1058f(long j) {
        this.f3441b = Long.toString(j);
    }

    final void m2548a(C1029e c1029e, C1057e c1057e) {
        int i;
        c1057e.f3435c[0] = Long.toString(c1029e.f3325h);
        c1057e.f3435c[1] = Integer.toString(c1029e.f3318a);
        int i2 = 2;
        if (c1029e.f3324g != null) {
            c1057e.f3435c[2] = Long.toString(c1029e.f3324g.longValue());
            i2 = 3;
        }
        if (c1029e.f3319b != null) {
            for (String str : c1029e.f3320c) {
                int i3 = i2 + 1;
                c1057e.f3435c[i2] = str;
                i2 = i3;
            }
        }
        for (String str2 : c1029e.f3321d) {
            i3 = i2 + 1;
            c1057e.f3435c[i2] = str2;
            i2 = i3;
        }
        for (String str22 : c1029e.f3322e) {
            i3 = i2 + 1;
            c1057e.f3435c[i2] = str22;
            i2 = i3;
        }
        if (c1029e.f3323f) {
            i = i2 + 1;
            c1057e.f3435c[i2] = this.f3441b;
        } else {
            i = i2;
        }
        if (i != c1057e.f3435c.length) {
            StringBuilder stringBuilder = new StringBuilder("something is wrong with where query cache for ");
            stringBuilder.append(c1057e.f3434b);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
