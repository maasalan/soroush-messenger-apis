package p050b.p051a;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import p050b.p051a.p052a.C0795a;
import p050b.p051a.p052a.C0795a.C0794a;
import p050b.p051a.p052a.C0796c;
import p050b.p051a.p052a.C0797n;
import p050b.p051a.p052a.C4921b;
import p050b.p051a.p052a.C4922d;
import p050b.p051a.p052a.C4923e;
import p050b.p051a.p052a.C4924f;
import p050b.p051a.p052a.C4925g;
import p050b.p051a.p052a.C4926h;
import p050b.p051a.p052a.C4927i;
import p050b.p051a.p052a.C4928j;
import p050b.p051a.p052a.C4929k;
import p050b.p051a.p052a.C4930l;
import p050b.p051a.p052a.C4931m;
import p050b.p051a.p052a.C4932o;
import p050b.p051a.p052a.C4933p;

public final class C4952c extends C0814d {

    static class C0813c {
        byte[] f2440f;

        C0813c(byte[] bArr) {
            this.f2440f = bArr;
        }

        int mo860a(int i) {
            return m1814c(i);
        }

        int mo861a(int i, int i2, int i3) {
            for (i2 = 0; i2 < i3; i2++) {
                i = mo865c(i + 2, C0817g.m1832a(this.f2440f, i));
            }
            return i;
        }

        void mo862a(int i, int i2) {
            for (int i3 = 0; i3 < i; i3++) {
                i2 = m1810b(i2);
            }
        }

        final int m1810b(int i) {
            return mo863b(i + 2, C0817g.m1832a(this.f2440f, i));
        }

        int mo863b(int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                i = m1814c(i);
            }
            return i;
        }

        final void m1812b() {
            mo862a(this.f2440f[0] & 255, 1);
        }

        void mo864b(int i, int i2, int i3) {
        }

        final int m1814c(int i) {
            return mo861a(i + 4, C0817g.m1832a(this.f2440f, i), C0817g.m1832a(this.f2440f, i + 2));
        }

        int mo865c(int i, int i2) {
            return m1816d(i);
        }

        final int m1816d(int i) {
            int i2 = this.f2440f[i] & 255;
            if (i2 == 101) {
                mo864b(i, C0817g.m1832a(this.f2440f, i + 1), C0817g.m1832a(this.f2440f, i + 3));
                return i + 5;
            } else if (i2 == 99) {
                mo867e(i, C0817g.m1832a(this.f2440f, i + 1));
                return i + 3;
            } else if (i2 == 64) {
                return mo860a(i + 1);
            } else {
                if (i2 == 91) {
                    return mo868f(i + 3, C0817g.m1832a(this.f2440f, i + 1));
                }
                mo866d(i2, C0817g.m1832a(this.f2440f, i + 1));
                return i + 3;
            }
        }

        void mo866d(int i, int i2) {
        }

        void mo867e(int i, int i2) {
        }

        int mo868f(int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                i = m1816d(i);
            }
            return i;
        }
    }

    static class C4950a extends C0813c {
        ByteArrayOutputStream f13781a = new ByteArrayOutputStream();
        C0796c f13782b;
        C0827p f13783c;
        C0827p f13784d;
        Map f13785e;

        C4950a(byte[] bArr, C0827p c0827p, C0827p c0827p2, Map map) {
            super(bArr);
            this.f13782b = new C0796c(this.f13781a, c0827p2);
            this.f13783c = c0827p;
            this.f13784d = c0827p2;
            this.f13785e = map;
        }

        private int m9668e(int i) {
            return this.f13783c.m1868a(i, this.f13784d, this.f13785e);
        }

        private int m9669f(int i) {
            return this.f13784d.m1883c(C0828s.m1898a(this.f13783c.m1892j(i), this.f13785e));
        }

        final int mo860a(int i) {
            this.f13782b.f2397a.write(64);
            return super.mo860a(i);
        }

        final int mo861a(int i, int i2, int i3) {
            C0796c c0796c = this.f13782b;
            c0796c.m1739a(m9669f(i2));
            c0796c.m1739a(i3);
            return super.mo861a(i, i2, i3);
        }

        final void mo862a(int i, int i2) {
            this.f13782b.f2397a.write(i);
            super.mo862a(i, i2);
        }

        final byte[] m9673a() {
            this.f13782b.f2397a.close();
            return this.f13781a.toByteArray();
        }

        final int mo863b(int i, int i2) {
            this.f13782b.m1739a(i2);
            return super.mo863b(i, i2);
        }

        final void mo864b(int i, int i2, int i3) {
            C0796c c0796c = this.f13782b;
            int f = m9669f(i2);
            int e = m9668e(i3);
            c0796c.f2397a.write(101);
            c0796c.m1739a(f);
            c0796c.m1739a(e);
            super.mo864b(i, i2, i3);
        }

        final int mo865c(int i, int i2) {
            this.f13782b.m1739a(m9668e(i2));
            return super.mo865c(i, i2);
        }

        final void mo866d(int i, int i2) {
            C0796c c0796c = this.f13782b;
            int e = m9668e(i2);
            c0796c.f2397a.write(i);
            c0796c.m1739a(e);
            super.mo866d(i, i2);
        }

        final void mo867e(int i, int i2) {
            C0796c c0796c = this.f13782b;
            int f = m9669f(i2);
            c0796c.f2397a.write(99);
            c0796c.m1739a(f);
            super.mo867e(i, i2);
        }

        final int mo868f(int i, int i2) {
            C0796c c0796c = this.f13782b;
            c0796c.f2397a.write(91);
            c0796c.m1739a(i2);
            return super.mo868f(i, i2);
        }
    }

    static class C4951b extends C0813c {
        C0827p f13786a;
        C0795a[][] f13787b;
        C0795a[] f13788c;
        C0795a f13789d;
        C0797n f13790e;

        C4951b(byte[] bArr, C0827p c0827p) {
            super(bArr);
            this.f13786a = c0827p;
        }

        final int mo860a(int i) {
            C0795a c0795a = this.f13789d;
            i = super.mo860a(i);
            this.f13790e = new C4921b(this.f13789d, this.f13786a);
            this.f13789d = c0795a;
            return i;
        }

        final int mo861a(int i, int i2, int i3) {
            this.f13789d = new C0795a(i2, this.f13786a);
            return super.mo861a(i, i2, i3);
        }

        final void mo862a(int i, int i2) {
            C0795a[][] c0795aArr = new C0795a[i][];
            for (int i3 = 0; i3 < i; i3++) {
                i2 = m1810b(i2);
                c0795aArr[i3] = this.f13788c;
            }
            this.f13787b = c0795aArr;
        }

        final int mo863b(int i, int i2) {
            C0795a[] c0795aArr = new C0795a[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                i = m1814c(i);
                c0795aArr[i3] = this.f13789d;
            }
            this.f13788c = c0795aArr;
            return i;
        }

        final void mo864b(int i, int i2, int i3) {
            this.f13790e = new C4928j(i2, i3, this.f13786a);
            super.mo864b(i, i2, i3);
        }

        final int mo865c(int i, int i2) {
            i = super.mo865c(i, i2);
            C0795a c0795a = this.f13789d;
            C0797n c0797n = this.f13790e;
            C0794a c0794a = new C0794a();
            c0794a.f2392a = i2;
            c0794a.f2393b = c0797n;
            String j = c0795a.f2394a.m1892j(c0794a.f2392a);
            if (c0795a.f2396c == null) {
                c0795a.f2396c = new LinkedHashMap();
            }
            c0795a.f2396c.put(j, c0794a);
            return i;
        }

        final void mo866d(int i, int i2) {
            C0797n c4929k;
            C0827p c0827p = this.f13786a;
            if (i == 70) {
                c4929k = new C4929k(i2, c0827p);
            } else if (i == 83) {
                c4929k = new C4932o(i2, c0827p);
            } else if (i == 90) {
                c4929k = new C4923e(i2, c0827p);
            } else if (i != 115) {
                switch (i) {
                    case 66:
                        c4929k = new C4924f(i2, c0827p);
                        break;
                    case 67:
                        c4929k = new C4925g(i2, c0827p);
                        break;
                    case 68:
                        c4929k = new C4927i(i2, c0827p);
                        break;
                    default:
                        switch (i) {
                            case 73:
                                c4929k = new C4930l(i2, c0827p);
                                break;
                            case 74:
                                c4929k = new C4931m(i2, c0827p);
                                break;
                            default:
                                StringBuilder stringBuilder = new StringBuilder("unknown tag:");
                                stringBuilder.append(i);
                                throw new RuntimeException(stringBuilder.toString());
                        }
                }
            } else {
                c4929k = new C4933p(i2, c0827p);
            }
            this.f13790e = c4929k;
            super.mo866d(i, i2);
        }

        final void mo867e(int i, int i2) {
            this.f13790e = new C4926h(i2, this.f13786a);
            super.mo867e(i, i2);
        }

        final int mo868f(int i, int i2) {
            C0797n c4922d = new C4922d(this.f13786a);
            C0797n[] c0797nArr = new C0797n[i2];
            int i3 = i;
            for (i = 0; i < i2; i++) {
                i3 = m1816d(i3);
                c0797nArr[i] = this.f13790e;
            }
            c4922d.f13722b = c0797nArr;
            if (c0797nArr.length > 0) {
                c4922d.f13721a = c0797nArr[0];
            }
            this.f13790e = c4922d;
            return i3;
        }
    }

    C4952c(C0827p c0827p, int i, DataInputStream dataInputStream) {
        super(c0827p, i, dataInputStream);
    }

    private C4952c(C0827p c0827p, String str, byte[] bArr) {
        super(c0827p, str, bArr);
    }

    private C0795a[] m9689e() {
        try {
            C0813c c4951b = new C4951b(this.c, this.a);
            c4951b.m1810b(0);
            return c4951b.f13788c;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final C0814d mo834a(C0827p c0827p, Map map) {
        C0813c c4950a = new C4950a(this.c, this.a, c0827p, map);
        try {
            c4950a.m1810b(0);
            return new C4952c(c0827p, m1826a(), c4950a.m9673a());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final String toString() {
        C0795a[] e = m9689e();
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < e.length) {
            int i2 = i + 1;
            stringBuilder.append(e[i].toString());
            if (i2 != e.length) {
                stringBuilder.append(", ");
            }
            i = i2;
        }
        return stringBuilder.toString();
    }
}
