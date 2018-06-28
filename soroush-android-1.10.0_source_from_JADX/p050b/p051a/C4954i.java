package p050b.p051a;

import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import p050b.C0851i;
import p050b.C4993s;

public final class C4954i extends C0818h implements ar, Cloneable {
    public static final C0851i f13791c = C0827p.f2479e;
    public C0827p f13792d;
    public int f13793e;
    public int f13794f;
    public C0829w f13795g;
    public int f13796h;

    public C4954i(C0827p c0827p) {
        this(c0827p, 0);
    }

    public C4954i(C0827p c0827p, int i) {
        this.f13792d = c0827p;
        this.f13793e = 0;
        this.f13794f = i;
        this.f13795g = new C0829w(c0827p);
        this.f13796h = 0;
    }

    private void m9692b(int i, String str, String str2) {
        super.mo869a(184);
        m9733g(this.f13792d.m1880b(i, str, str2));
        m9731f(C0828s.m1906d(str2));
    }

    private void m9693c(int i, String str, String str2) {
        super.mo869a(182);
        m9733g(this.f13792d.m1880b(i, str, str2));
        m9731f(C0828s.m1906d(str2) - 1);
    }

    public final int m9694a(int i, C0851i c0851i) {
        if (c0851i.mo943l()) {
            if (!(c0851i == C0851i.f2536d || c0851i == C0851i.f2537e || c0851i == C0851i.f2538f || c0851i == C0851i.f2539g)) {
                if (c0851i != C0851i.f2540h) {
                    if (c0851i == C0851i.f2541i) {
                        m9740m(i);
                        return 2;
                    } else if (c0851i == C0851i.f2542j) {
                        m9744q(i);
                    } else if (c0851i == C0851i.f2543k) {
                        m9742o(i);
                        return 2;
                    } else {
                        throw new RuntimeException("void type?");
                    }
                }
            }
            m9738k(i);
        } else {
            m9735h(i);
        }
        return 1;
    }

    public final int m9695a(String str, int i) {
        super.mo869a(197);
        m9733g(this.f13792d.m1873a(str));
        super.mo869a(i);
        m9731f(1 - i);
        return i;
    }

    public final C4956l m9696a() {
        return new C4956l(this.f13792d, this.f13793e, this.f13794f, m9717b(), this.f13795g);
    }

    public final void m9697a(double d) {
        if (d != 0.0d) {
            if (d != 1.0d) {
                m9728e(20);
                m9733g(this.f13792d.m1865a(d));
                return;
            }
        }
        m9728e(14 + ((int) d));
    }

    public final void m9698a(float f) {
        if (!(f == 0.0f || f == BallPulseIndicator.SCALE)) {
            if (f != 2.0f) {
                m9746s(this.f13792d.m1866a(f));
                return;
            }
        }
        m9728e(11 + ((int) f));
    }

    public final void mo869a(int i) {
        super.mo869a(i);
    }

    public final void mo870a(int i, int i2) {
        super.mo870a(i, i2);
    }

    public final void m9702a(int i, String str, String str2) {
        super.mo869a(183);
        m9733g(this.f13792d.m1880b(i, str, str2));
        m9731f(C0828s.m1906d(str2) - 1);
    }

    public final void m9703a(long j) {
        if (j != 0) {
            if (j != 1) {
                m9728e(20);
                m9733g(this.f13792d.m1870a(j));
                return;
            }
        }
        m9728e(9 + ((int) j));
    }

    public final void m9704a(C0851i c0851i) {
        m9728e(192);
        m9733g(this.f13792d.m1872a(c0851i));
    }

    public final void m9705a(C0851i c0851i, String str, String str2) {
        super.mo869a(180);
        m9733g(this.f13792d.m1869a(this.f13792d.m1872a(c0851i), str, str2));
        m9731f(C0828s.m1906d(str2) - 1);
    }

    public final void m9706a(C0851i c0851i, String str, String str2, int i) {
        int a = this.f13792d.m1872a(c0851i);
        super.mo869a(185);
        C0827p c0827p = this.f13792d;
        m9733g(c0827p.m1885d(a, c0827p.m1874a(str, str2)));
        super.mo869a(i);
        super.mo869a(0);
        m9731f(C0828s.m1906d(str2) - 1);
    }

    public final void m9707a(String str) {
        m9728e(192);
        m9733g(this.f13792d.m1873a(str));
    }

    public final void m9708a(String str, String str2, String str3) {
        super.mo869a(178);
        m9733g(this.f13792d.m1869a(this.f13792d.m1873a(str), str2, str3));
        m9731f(C0828s.m1906d(str3));
    }

    public final int m9709b(int i, C0851i c0851i) {
        if (c0851i.mo943l()) {
            if (!(c0851i == C0851i.f2536d || c0851i == C0851i.f2537e || c0851i == C0851i.f2538f || c0851i == C0851i.f2539g)) {
                if (c0851i != C0851i.f2540h) {
                    if (c0851i == C0851i.f2541i) {
                        m9741n(i);
                        return 2;
                    } else if (c0851i == C0851i.f2542j) {
                        m9745r(i);
                    } else if (c0851i == C0851i.f2543k) {
                        m9743p(i);
                        return 2;
                    } else {
                        throw new RuntimeException("void type?");
                    }
                }
            }
            m9739l(i);
        } else {
            m9736i(i);
        }
        return 1;
    }

    public final void mo872b(int i) {
        super.mo872b(i);
    }

    public final void m9712b(int i, int i2, int i3, int i4) {
        this.f13795g.m1909a(i, i2, i3, i4);
    }

    public final void m9713b(C0851i c0851i) {
        int i = c0851i == null ? 177 : c0851i.mo943l() ? ((C4993s) c0851i).f13900q : 176;
        m9728e(i);
    }

    public final void m9714b(C0851i c0851i, String str, String str2) {
        super.mo869a(178);
        m9733g(this.f13792d.m1869a(this.f13792d.m1872a(c0851i), str, str2));
        m9731f(C0828s.m1906d(str2));
    }

    public final void m9715b(String str) {
        m9728e(193);
        m9733g(this.f13792d.m1873a(str));
    }

    public final void m9716b(String str, String str2, String str3) {
        m9702a(this.f13792d.m1873a(str), str2, str3);
    }

    public final byte[] m9717b() {
        Object obj = new byte[this.f2447b];
        System.arraycopy(this.f2446a, 0, obj, 0, this.f2447b);
        return obj;
    }

    public final void m9718c(int i) {
        this.f13794f += i;
    }

    public final void m9719c(int i, int i2) {
        super.mo870a(i, i2 >> 8);
        super.mo870a(i + 1, i2);
    }

    public final void m9720c(C0851i c0851i, String str, String str2) {
        m9702a(this.f13792d.m1872a(c0851i), str, str2);
    }

    public final void m9721c(String str) {
        m9746s(this.f13792d.m1881b(str));
    }

    public final void m9722c(String str, String str2, String str3) {
        m9692b(this.f13792d.m1873a(str), str2, str3);
    }

    public final Object clone() {
        try {
            C4954i c4954i = (C4954i) super.clone();
            c4954i.f13795g = (C0829w) this.f13795g.clone();
            return c4954i;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void m9723d(int i) {
        mo871a(i >> 24, i >> 16, i >> 8, i);
    }

    public final void m9724d(int i, int i2) {
        m9719c(i, i2 >> 16);
        m9719c(i + 2, i2);
    }

    public final void m9725d(C0851i c0851i, String str, String str2) {
        m9692b(this.f13792d.m1872a(c0851i), str, str2);
    }

    public final void m9726d(String str) {
        m9728e(187);
        m9733g(this.f13792d.m1873a(str));
    }

    public final void m9727d(String str, String str2, String str3) {
        m9693c(this.f13792d.m1873a(str), str2, str3);
    }

    public final void m9728e(int i) {
        super.mo869a(i);
        m9731f(i[i]);
    }

    public final void m9729e(C0851i c0851i, String str, String str2) {
        m9693c(this.f13792d.m1872a(c0851i), str, str2);
    }

    public final void m9730e(String str) {
        m9728e(189);
        m9733g(this.f13792d.m1873a(str));
    }

    public final void m9731f(int i) {
        this.f13796h += i;
        if (this.f13796h > this.f13793e) {
            this.f13793e = this.f13796h;
        }
    }

    public final void m9732f(C0851i c0851i, String str, String str2) {
        super.mo869a(181);
        m9733g(this.f13792d.m1869a(this.f13792d.m1872a(c0851i), str, str2));
        m9731f(-1 - C0828s.m1906d(str2));
    }

    public final void m9733g(int i) {
        super.mo873b(i >> 8, i);
    }

    public final void m9734g(C0851i c0851i, String str, String str2) {
        super.mo869a(179);
        m9733g(this.f13792d.m1869a(this.f13792d.m1872a(c0851i), str, str2));
        m9731f(-C0828s.m1906d(str2));
    }

    public final void m9735h(int i) {
        if (i < 4) {
            m9728e(42 + i);
        } else if (i < 256) {
            m9728e(25);
            super.mo869a(i);
        } else {
            m9728e(196);
            m9728e(25);
            m9733g(i);
        }
    }

    public final void m9736i(int i) {
        if (i < 4) {
            m9728e(75 + i);
        } else if (i < 256) {
            m9728e(58);
            super.mo869a(i);
        } else {
            m9728e(196);
            m9728e(58);
            m9733g(i);
        }
    }

    public final void m9737j(int i) {
        if (i < 6 && -2 < i) {
            m9728e(3 + i);
        } else if (i <= 127 && -128 <= i) {
            m9728e(16);
            super.mo869a(i);
        } else if (i > 32767 || -32768 > i) {
            m9746s(this.f13792d.m1893k(i));
        } else {
            m9728e(17);
            super.mo869a(i >> 8);
            super.mo869a(i);
        }
    }

    public final void m9738k(int i) {
        if (i < 4) {
            m9728e(26 + i);
        } else if (i < 256) {
            m9728e(21);
            super.mo869a(i);
        } else {
            m9728e(196);
            m9728e(21);
            m9733g(i);
        }
    }

    public final void m9739l(int i) {
        if (i < 4) {
            m9728e(59 + i);
        } else if (i < 256) {
            m9728e(54);
            super.mo869a(i);
        } else {
            m9728e(196);
            m9728e(54);
            m9733g(i);
        }
    }

    public final void m9740m(int i) {
        if (i < 4) {
            m9728e(30 + i);
        } else if (i < 256) {
            m9728e(22);
            super.mo869a(i);
        } else {
            m9728e(196);
            m9728e(22);
            m9733g(i);
        }
    }

    public final void m9741n(int i) {
        if (i < 4) {
            m9728e(63 + i);
        } else if (i < 256) {
            m9728e(55);
            super.mo869a(i);
        } else {
            m9728e(196);
            m9728e(55);
            m9733g(i);
        }
    }

    public final void m9742o(int i) {
        if (i < 4) {
            m9728e(38 + i);
        } else if (i < 256) {
            m9728e(24);
            super.mo869a(i);
        } else {
            m9728e(196);
            m9728e(24);
            m9733g(i);
        }
    }

    public final void m9743p(int i) {
        if (i < 4) {
            m9728e(71 + i);
        } else if (i < 256) {
            m9728e(57);
            super.mo869a(i);
        } else {
            m9728e(196);
            m9728e(57);
            m9733g(i);
        }
    }

    public final void m9744q(int i) {
        if (i < 4) {
            m9728e(34 + i);
        } else if (i < 256) {
            m9728e(23);
            super.mo869a(i);
        } else {
            m9728e(196);
            m9728e(23);
            m9733g(i);
        }
    }

    public final void m9745r(int i) {
        if (i < 4) {
            m9728e(67 + i);
        } else if (i < 256) {
            m9728e(56);
            super.mo869a(i);
        } else {
            m9728e(196);
            m9728e(56);
            m9733g(i);
        }
    }

    public final void m9746s(int i) {
        if (i > 255) {
            m9728e(19);
            m9733g(i);
            return;
        }
        m9728e(18);
        super.mo869a(i);
    }
}
