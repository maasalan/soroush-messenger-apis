package com.google.p164b;

import com.google.p164b.p166b.p167a.C5539f;
import com.google.p164b.p170d.C1935a;
import com.google.p164b.p170d.C1936b;
import com.google.p164b.p170d.C1937c;

public abstract class C1948t<T> {

    class C55981 extends C1948t<T> {
        final /* synthetic */ C1948t f15453a;

        C55981(C1948t c1948t) {
            this.f15453a = c1948t;
        }

        public final T mo1711a(C1935a c1935a) {
            if (c1935a.mo1720f() != C1936b.NULL) {
                return this.f15453a.mo1711a(c1935a);
            }
            c1935a.mo1725k();
            return null;
        }

        public final void mo1712a(C1937c c1937c, T t) {
            if (t == null) {
                c1937c.mo1743e();
            } else {
                this.f15453a.mo1712a(c1937c, t);
            }
        }
    }

    public final C1944k m5362a(T t) {
        try {
            C1937c c5539f = new C5539f();
            mo1712a(c5539f, t);
            if (c5539f.f15340a.isEmpty()) {
                return c5539f.f15341b;
            }
            StringBuilder stringBuilder = new StringBuilder("Expected one JSON element but was ");
            stringBuilder.append(c5539f.f15340a);
            throw new IllegalStateException(stringBuilder.toString());
        } catch (Throwable e) {
            throw new C5591l(e);
        }
    }

    public final C1948t<T> m5363a() {
        return new C55981(this);
    }

    public abstract T mo1711a(C1935a c1935a);

    public abstract void mo1712a(C1937c c1937c, T t);
}
