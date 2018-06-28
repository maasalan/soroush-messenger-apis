package android.support.constraint.p026a;

import android.support.constraint.p026a.C0189h.C0188a;
import android.support.constraint.p026a.p027a.C0171c;
import java.util.Arrays;
import java.util.HashMap;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C0184e {
    public static C0185f f677h = null;
    private static int f678i = 1000;
    int f679a;
    public C0183a f680b;
    public C4705b[] f681c;
    public boolean f682d;
    int f683e;
    public int f684f;
    public final C0182c f685g;
    private HashMap<String, C0189h> f686j;
    private int f687k;
    private int f688l;
    private boolean[] f689m;
    private int f690n;
    private C0189h[] f691o;
    private int f692p;
    private C4705b[] f693q;
    private final C0183a f694r;

    interface C0183a {
        C0189h mo63a(boolean[] zArr);

        void mo64a();

        void mo65a(C0183a c0183a);

        C0189h mo66b();

        void mo67b(C0189h c0189h);
    }

    public C0184e() {
        this.f679a = 0;
        this.f686j = null;
        this.f687k = 32;
        this.f688l = this.f687k;
        this.f681c = null;
        this.f682d = false;
        this.f689m = new boolean[this.f687k];
        this.f683e = 1;
        this.f684f = 0;
        this.f690n = this.f687k;
        this.f691o = new C0189h[f678i];
        this.f692p = 0;
        this.f693q = new C4705b[this.f687k];
        this.f681c = new C4705b[this.f687k];
        m356g();
        this.f685g = new C0182c();
        this.f680b = new C6338d(this.f685g);
        this.f694r = new C4705b(this.f685g);
    }

    public static C4705b m348a(C0184e c0184e, C0189h c0189h, C0189h c0189h2, C0189h c0189h3, float f, boolean z) {
        C4705b c = c0184e.m368c();
        if (z) {
            c.m8617a(c0184e, 0);
        }
        c.f12932d.m339a(c0189h, -1.0f);
        c.f12932d.m339a(c0189h2, BallPulseIndicator.SCALE - f);
        c.f12932d.m339a(c0189h3, f);
        return c;
    }

    public static C0185f m349a() {
        return f677h;
    }

    private final int m350b(C0183a c0183a) {
        C0184e c0184e = this;
        long j = 1;
        if (f677h != null) {
            C0185f c0185f = f677h;
            c0185f.f706h++;
        }
        boolean z = false;
        for (int i = 0; i < c0184e.f683e; i++) {
            c0184e.f689m[i] = false;
        }
        boolean z2 = true;
        boolean z3 = false;
        int i2 = z3;
        while (!z3) {
            if (f677h != null) {
                C0185f c0185f2 = f677h;
                c0185f2.f707i += j;
            }
            i2++;
            if (i2 >= 2 * c0184e.f683e) {
                return i2;
            }
            if (c0183a.mo66b() != null) {
                c0184e.f689m[c0183a.mo66b().f736a] = z2;
            }
            C0189h a = c0183a.mo63a(c0184e.f689m);
            if (a != null) {
                if (c0184e.f689m[a.f736a]) {
                    return i2;
                }
                c0184e.f689m[a.f736a] = z2;
            }
            if (a != null) {
                float f = Float.MAX_VALUE;
                int i3 = -1;
                int i4 = z;
                while (i4 < c0184e.f684f) {
                    int i5;
                    C4705b c4705b = c0184e.f681c[i4];
                    if (!(c4705b.f12929a.f741f == C0188a.f725a || c4705b.f12933e)) {
                        Object obj;
                        C0181a c0181a = c4705b.f12932d;
                        if (c0181a.f669g != -1) {
                            int i6 = c0181a.f669g;
                            while (i6 != -1 && i5 < c0181a.f663a) {
                                if (c0181a.f666d[i6] == a.f736a) {
                                    obj = 1;
                                    break;
                                }
                                i6 = c0181a.f667e[i6];
                                i5++;
                            }
                        }
                        obj = null;
                        if (obj != null) {
                            float b = c4705b.f12932d.m342b(a);
                            if (b < 0.0f) {
                                float f2 = (-c4705b.f12930b) / b;
                                if (f2 < f) {
                                    f = f2;
                                    i3 = i4;
                                }
                            }
                        }
                    }
                    i4++;
                    i5 = 0;
                }
                if (i3 >= 0) {
                    long j2;
                    C4705b c4705b2 = c0184e.f681c[i3];
                    c4705b2.f12929a.f737b = -1;
                    if (f677h != null) {
                        C0185f c0185f3 = f677h;
                        j2 = 1;
                        c0185f3.f708j++;
                    } else {
                        j2 = 1;
                    }
                    c4705b2.m8623a(a);
                    c4705b2.f12929a.f737b = i3;
                    c4705b2.f12929a.m379c(c4705b2);
                    j = j2;
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                    j = 1;
                }
            }
            z2 = true;
            z3 = true;
        }
        return i2;
    }

    public static int m351b(Object obj) {
        C0189h c0189h = ((C0171c) obj).f588i;
        return c0189h != null ? (int) (c0189h.f739d + 0.5f) : 0;
    }

    private C0189h m352b(int i) {
        C0189h c0189h = (C0189h) this.f685g.f675b.mo68a();
        if (c0189h == null) {
            c0189h = new C0189h(i);
        } else {
            c0189h.m377b();
        }
        c0189h.f741f = i;
        if (this.f692p >= f678i) {
            f678i *= 2;
            this.f691o = (C0189h[]) Arrays.copyOf(this.f691o, f678i);
        }
        C0189h[] c0189hArr = this.f691o;
        int i2 = this.f692p;
        this.f692p = i2 + 1;
        c0189hArr[i2] = c0189h;
        return c0189h;
    }

    private final void m353b(C4705b c4705b) {
        if (this.f684f > 0) {
            C0181a c0181a = c4705b.f12932d;
            C4705b[] c4705bArr = this.f681c;
            int i = c0181a.f669g;
            loop0:
            while (true) {
                int i2 = 0;
                while (i != -1 && i2 < c0181a.f663a) {
                    C0189h c0189h = c0181a.f665c.f676c[c0181a.f666d[i]];
                    if (c0189h.f737b != -1) {
                        float f = c0181a.f668f[i];
                        c0181a.m335a(c0189h, true);
                        C4705b c4705b2 = c4705bArr[c0189h.f737b];
                        if (!c4705b2.f12933e) {
                            C0181a c0181a2 = c4705b2.f12932d;
                            int i3 = c0181a2.f669g;
                            int i4 = 0;
                            while (i3 != -1 && i4 < c0181a2.f663a) {
                                c0181a.m340a(c0181a.f665c.f676c[c0181a2.f666d[i3]], c0181a2.f668f[i3] * f, true);
                                i3 = c0181a2.f667e[i3];
                                i4++;
                            }
                        }
                        c4705b.f12930b += c4705b2.f12930b * f;
                        c4705b2.f12929a.m378b(c4705b);
                        i = c0181a.f669g;
                    } else {
                        i = c0181a.f667e[i];
                        i2++;
                    }
                }
            }
            if (c4705b.f12932d.f663a == 0) {
                c4705b.f12933e = true;
            }
        }
    }

    private final void m354c(C4705b c4705b) {
        if (this.f681c[this.f684f] != null) {
            this.f685g.f674a.mo70a(this.f681c[this.f684f]);
        }
        this.f681c[this.f684f] = c4705b;
        c4705b.f12929a.f737b = this.f684f;
        this.f684f++;
        c4705b.f12929a.m379c(c4705b);
    }

    private void m355f() {
        this.f687k *= 2;
        this.f681c = (C4705b[]) Arrays.copyOf(this.f681c, this.f687k);
        this.f685g.f676c = (C0189h[]) Arrays.copyOf(this.f685g.f676c, this.f687k);
        this.f689m = new boolean[this.f687k];
        this.f688l = this.f687k;
        this.f690n = this.f687k;
        if (f677h != null) {
            C0185f c0185f = f677h;
            c0185f.f702d++;
            f677h.f714p = Math.max(f677h.f714p, (long) this.f687k);
            f677h.f698D = f677h.f714p;
        }
    }

    private void m356g() {
        for (int i = 0; i < this.f681c.length; i++) {
            Object obj = this.f681c[i];
            if (obj != null) {
                this.f685g.f674a.mo70a(obj);
            }
            this.f681c[i] = null;
        }
    }

    public final C0189h m357a(int i) {
        if (f677h != null) {
            C0185f c0185f = f677h;
            c0185f.f711m++;
        }
        if (this.f683e + 1 >= this.f688l) {
            m355f();
        }
        C0189h b = m352b(C0188a.f728d);
        this.f679a++;
        this.f683e++;
        b.f736a = this.f679a;
        b.f738c = i;
        this.f685g.f676c[this.f679a] = b;
        this.f680b.mo67b(b);
        return b;
    }

    public final C0189h m358a(Object obj) {
        C0189h c0189h = null;
        if (obj == null) {
            return null;
        }
        if (this.f683e + 1 >= this.f688l) {
            m355f();
        }
        if (obj instanceof C0171c) {
            C0171c c0171c = (C0171c) obj;
            c0189h = c0171c.f588i;
            if (c0189h == null) {
                c0171c.m272a();
                c0189h = c0171c.f588i;
            }
            if (c0189h.f736a == -1 || c0189h.f736a > this.f679a || this.f685g.f676c[c0189h.f736a] == null) {
                if (c0189h.f736a != -1) {
                    c0189h.m377b();
                }
                this.f679a++;
                this.f683e++;
                c0189h.f736a = this.f679a;
                c0189h.f741f = C0188a.f725a;
                this.f685g.f676c[this.f679a] = c0189h;
            }
        }
        return c0189h;
    }

    public final void m359a(C4705b c4705b) {
        C0184e c0184e = this;
        C0183a c0183a = c4705b;
        if (c0183a != null) {
            C0185f c0185f;
            boolean z;
            if (f677h != null) {
                c0185f = f677h;
                c0185f.f704f++;
                if (c0183a.f12933e) {
                    c0185f = f677h;
                    c0185f.f705g++;
                }
            }
            if (c0184e.f684f + 1 >= c0184e.f690n || c0184e.f683e + 1 >= c0184e.f688l) {
                m355f();
            }
            if (c0183a.f12933e) {
                z = false;
            } else {
                m353b(c4705b);
                boolean z2 = c0183a.f12929a == null && c0183a.f12930b == 0.0f && c0183a.f12932d.f663a == 0;
                if (!z2) {
                    C0181a c0181a;
                    int i;
                    boolean z3;
                    int i2 = -1;
                    if (c0183a.f12930b < 0.0f) {
                        c0183a.f12930b *= -1.0f;
                        c0181a = c0183a.f12932d;
                        int i3 = c0181a.f669g;
                        i = 0;
                        while (i3 != -1 && i < c0181a.f663a) {
                            float[] fArr = c0181a.f668f;
                            fArr[i3] = fArr[i3] * -1.0f;
                            i3 = c0181a.f667e[i3];
                            i++;
                        }
                    }
                    c0181a = c0183a.f12932d;
                    int i4 = c0181a.f669g;
                    float f = 0.0f;
                    float f2 = f;
                    i = 0;
                    C0189h c0189h = null;
                    C0189h c0189h2 = null;
                    boolean z4 = false;
                    boolean z5 = false;
                    while (i4 != i2 && i < c0181a.f663a) {
                        float f3 = c0181a.f668f[i4];
                        C0189h c0189h3 = c0181a.f665c.f676c[c0181a.f666d[i4]];
                        if (f3 < 0.0f) {
                            if (f3 > -0.001f) {
                                c0181a.f668f[i4] = 0.0f;
                            }
                            if (f3 != 0.0f) {
                                if (c0189h3.f741f == C0188a.f725a) {
                                    if (c0189h != null) {
                                        if (f > f3) {
                                            if (!z4 && C0181a.m334a(c0189h3)) {
                                                z4 = true;
                                                f = f3;
                                                c0189h = c0189h3;
                                            }
                                        }
                                    }
                                    z4 = C0181a.m334a(c0189h3);
                                    f = f3;
                                    c0189h = c0189h3;
                                } else if (c0189h == null && f3 < 0.0f) {
                                    if (c0189h2 != null) {
                                        if (f2 > f3) {
                                            if (!z5 && C0181a.m334a(c0189h3)) {
                                                z5 = true;
                                                f2 = f3;
                                                c0189h2 = c0189h3;
                                            }
                                        }
                                    }
                                    z5 = C0181a.m334a(c0189h3);
                                    f2 = f3;
                                    c0189h2 = c0189h3;
                                }
                            }
                            i4 = c0181a.f667e[i4];
                            i++;
                            i2 = -1;
                        } else {
                            if (f3 < 0.001f) {
                                c0181a.f668f[i4] = 0.0f;
                            }
                            if (f3 != 0.0f) {
                                if (c0189h3.f741f == C0188a.f725a) {
                                    if (c0189h2 != null) {
                                        if (f2 > f3) {
                                            z5 = true;
                                            f2 = f3;
                                            c0189h2 = c0189h3;
                                        }
                                    }
                                    z5 = C0181a.m334a(c0189h3);
                                    f2 = f3;
                                    c0189h2 = c0189h3;
                                } else {
                                    if (c0189h != null) {
                                        if (f > f3) {
                                            z4 = true;
                                            f = f3;
                                            c0189h = c0189h3;
                                        }
                                    }
                                    z4 = C0181a.m334a(c0189h3);
                                    f = f3;
                                    c0189h = c0189h3;
                                }
                            }
                            i4 = c0181a.f667e[i4];
                            i++;
                            i2 = -1;
                        }
                        c0189h3.m378b(c0181a.f664b);
                        f3 = 0.0f;
                        if (f3 != 0.0f) {
                            if (c0189h3.f741f == C0188a.f725a) {
                                if (c0189h != null) {
                                    if (f > f3) {
                                        z4 = true;
                                        f = f3;
                                        c0189h = c0189h3;
                                    }
                                }
                                z4 = C0181a.m334a(c0189h3);
                                f = f3;
                                c0189h = c0189h3;
                            } else {
                                if (c0189h2 != null) {
                                    if (f2 > f3) {
                                        z5 = true;
                                        f2 = f3;
                                        c0189h2 = c0189h3;
                                    }
                                }
                                z5 = C0181a.m334a(c0189h3);
                                f2 = f3;
                                c0189h2 = c0189h3;
                            }
                        }
                        i4 = c0181a.f667e[i4];
                        i++;
                        i2 = -1;
                    }
                    if (c0189h == null) {
                        c0189h = c0189h2;
                    }
                    if (c0189h == null) {
                        z2 = true;
                    } else {
                        c0183a.m8623a(c0189h);
                        z2 = false;
                    }
                    if (c0183a.f12932d.f663a == 0) {
                        c0183a.f12933e = true;
                    }
                    if (z2) {
                        if (f677h != null) {
                            c0185f = f677h;
                            c0185f.f713o++;
                        }
                        if (c0184e.f683e + 1 >= c0184e.f688l) {
                            m355f();
                        }
                        C0189h b = m352b(C0188a.f727c);
                        c0184e.f679a++;
                        c0184e.f683e++;
                        b.f736a = c0184e.f679a;
                        c0184e.f685g.f676c[c0184e.f679a] = b;
                        c0183a.f12929a = b;
                        m354c(c4705b);
                        c0184e.f694r.mo65a(c0183a);
                        m350b(c0184e.f694r);
                        if (b.f737b == -1) {
                            if (c0183a.f12929a == b) {
                                b = c0183a.f12932d.m337a(null, b);
                                if (b != null) {
                                    if (f677h != null) {
                                        C0185f c0185f2 = f677h;
                                        c0185f2.f708j++;
                                    }
                                    c0183a.m8623a(b);
                                }
                            }
                            if (!c0183a.f12933e) {
                                c0183a.f12929a.m379c(c0183a);
                            }
                            c0184e.f684f--;
                        }
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z = c0183a.f12929a != null && (c0183a.f12929a.f741f == C0188a.f725a || c0183a.f12930b >= 0.0f);
                    if (z) {
                        z = z3;
                    } else {
                        return;
                    }
                }
                return;
            }
            if (!z) {
                m354c(c4705b);
            }
        }
    }

    public final void m360a(C4705b c4705b, int i, int i2) {
        c4705b.f12932d.m339a(m357a(i2), (float) i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m361a(android.support.constraint.p026a.C0184e.C0183a r19) {
        /*
        r18 = this;
        r0 = r18;
        r1 = f677h;
        r2 = 1;
        if (r1 == 0) goto L_0x002e;
    L_0x0008:
        r1 = f677h;
        r4 = r1.f718t;
        r6 = r4 + r2;
        r1.f718t = r6;
        r1 = f677h;
        r4 = f677h;
        r4 = r4.f719u;
        r6 = r0.f683e;
        r6 = (long) r6;
        r4 = java.lang.Math.max(r4, r6);
        r1.f719u = r4;
        r1 = f677h;
        r4 = f677h;
        r4 = r4.f720v;
        r6 = r0.f684f;
        r6 = (long) r6;
        r4 = java.lang.Math.max(r4, r6);
        r1.f720v = r4;
    L_0x002e:
        r4 = r19;
        r4 = (android.support.constraint.p026a.C4705b) r4;
        r0.m353b(r4);
        r5 = 0;
    L_0x0036:
        r6 = r0.f684f;
        r7 = 0;
        if (r5 >= r6) goto L_0x0056;
    L_0x003b:
        r6 = r0.f681c;
        r6 = r6[r5];
        r6 = r6.f12929a;
        r6 = r6.f741f;
        r9 = android.support.constraint.p026a.C0189h.C0188a.f725a;
        if (r6 == r9) goto L_0x0053;
    L_0x0047:
        r6 = r0.f681c;
        r6 = r6[r5];
        r6 = r6.f12930b;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 >= 0) goto L_0x0053;
    L_0x0051:
        r5 = 1;
        goto L_0x0057;
    L_0x0053:
        r5 = r5 + 1;
        goto L_0x0036;
    L_0x0056:
        r5 = 0;
    L_0x0057:
        if (r5 == 0) goto L_0x0101;
    L_0x0059:
        r5 = 0;
    L_0x005a:
        if (r5 != 0) goto L_0x0101;
    L_0x005c:
        r6 = f677h;
        if (r6 == 0) goto L_0x0068;
    L_0x0060:
        r6 = f677h;
        r9 = r6.f709k;
        r11 = r9 + r2;
        r6.f709k = r11;
    L_0x0068:
        r6 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        r9 = -1;
        r12 = r6;
        r10 = r9;
        r11 = r10;
        r6 = 0;
        r13 = 0;
    L_0x0071:
        r14 = r0.f684f;
        if (r6 >= r14) goto L_0x00cc;
    L_0x0075:
        r14 = r0.f681c;
        r14 = r14[r6];
        r15 = r14.f12929a;
        r15 = r15.f741f;
        r4 = android.support.constraint.p026a.C0189h.C0188a.f725a;
        if (r15 == r4) goto L_0x00c6;
    L_0x0081:
        r4 = r14.f12933e;
        if (r4 != 0) goto L_0x00c6;
    L_0x0085:
        r4 = r14.f12930b;
        r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r4 >= 0) goto L_0x00c6;
    L_0x008b:
        r4 = 1;
    L_0x008c:
        r15 = r0.f683e;
        if (r4 >= r15) goto L_0x00c6;
    L_0x0090:
        r15 = r0.f685g;
        r15 = r15.f676c;
        r15 = r15[r4];
        r8 = r14.f12932d;
        r8 = r8.m342b(r15);
        r16 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1));
        if (r16 <= 0) goto L_0x00c0;
    L_0x00a0:
        r7 = r13;
        r13 = r12;
        r12 = r11;
        r11 = r10;
        r10 = 0;
    L_0x00a5:
        r2 = 7;
        if (r10 >= r2) goto L_0x00bc;
    L_0x00a8:
        r2 = r15.f740e;
        r2 = r2[r10];
        r2 = r2 / r8;
        r3 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1));
        if (r3 >= 0) goto L_0x00b3;
    L_0x00b1:
        if (r10 == r7) goto L_0x00b5;
    L_0x00b3:
        if (r10 <= r7) goto L_0x00b9;
    L_0x00b5:
        r13 = r2;
        r12 = r4;
        r11 = r6;
        r7 = r10;
    L_0x00b9:
        r10 = r10 + 1;
        goto L_0x00a5;
    L_0x00bc:
        r10 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r7;
    L_0x00c0:
        r4 = r4 + 1;
        r2 = 1;
        r7 = 0;
        goto L_0x008c;
    L_0x00c6:
        r6 = r6 + 1;
        r2 = 1;
        r7 = 0;
        goto L_0x0071;
    L_0x00cc:
        if (r10 == r9) goto L_0x00fb;
    L_0x00ce:
        r2 = r0.f681c;
        r2 = r2[r10];
        r3 = r2.f12929a;
        r3.f737b = r9;
        r3 = f677h;
        if (r3 == 0) goto L_0x00e5;
    L_0x00da:
        r3 = f677h;
        r6 = r3.f708j;
        r8 = 1;
        r12 = r6 + r8;
        r3.f708j = r12;
        goto L_0x00e7;
    L_0x00e5:
        r8 = 1;
    L_0x00e7:
        r3 = r0.f685g;
        r3 = r3.f676c;
        r3 = r3[r11];
        r2.m8623a(r3);
        r3 = r2.f12929a;
        r3.f737b = r10;
        r3 = r2.f12929a;
        r3.m379c(r2);
        r2 = r8;
        goto L_0x00fe;
    L_0x00fb:
        r2 = 1;
        r5 = 1;
    L_0x00fe:
        r7 = 0;
        goto L_0x005a;
    L_0x0101:
        r18.m350b(r19);
        r18.m371e();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.e.a(android.support.constraint.a.e$a):void");
    }

    public final void m362a(C0189h c0189h, int i) {
        int i2 = c0189h.f737b;
        C4705b c4705b;
        if (c0189h.f737b != -1) {
            c4705b = this.f681c[i2];
            if (c4705b.f12933e) {
                c4705b.f12930b = (float) i;
                return;
            } else if (c4705b.f12932d.f663a == 0) {
                c4705b.f12933e = true;
                c4705b.f12930b = (float) i;
                return;
            } else {
                C0181a c0181a;
                float f;
                c4705b = m368c();
                if (i < 0) {
                    c4705b.f12930b = (float) (-1 * i);
                    c0181a = c4705b.f12932d;
                    f = BallPulseIndicator.SCALE;
                } else {
                    c4705b.f12930b = (float) i;
                    c0181a = c4705b.f12932d;
                    f = -1.0f;
                }
                c0181a.m339a(c0189h, f);
                m359a(c4705b);
                return;
            }
        }
        c4705b = m368c();
        c4705b.f12929a = c0189h;
        float f2 = (float) i;
        c0189h.f739d = f2;
        c4705b.f12930b = f2;
        c4705b.f12933e = true;
        m359a(c4705b);
    }

    public final void m363a(C0189h c0189h, C0189h c0189h2, int i, float f, C0189h c0189h3, C0189h c0189h4, int i2, int i3) {
        C4705b c = m368c();
        if (c0189h2 == c0189h3) {
            c.f12932d.m339a(c0189h, (float) BallPulseIndicator.SCALE);
            c.f12932d.m339a(c0189h4, (float) BallPulseIndicator.SCALE);
            c.f12932d.m339a(c0189h2, -2.0f);
        } else {
            float f2;
            if (f == 0.5f) {
                c.f12932d.m339a(c0189h, (float) BallPulseIndicator.SCALE);
                c.f12932d.m339a(c0189h2, -1.0f);
                c.f12932d.m339a(c0189h3, -1.0f);
                c.f12932d.m339a(c0189h4, (float) BallPulseIndicator.SCALE);
                if (i > 0 || i2 > 0) {
                    f2 = (float) ((-i) + i2);
                }
            } else if (f <= 0.0f) {
                c.f12932d.m339a(c0189h, -1.0f);
                c.f12932d.m339a(c0189h2, (float) BallPulseIndicator.SCALE);
                f2 = (float) i;
            } else if (f >= BallPulseIndicator.SCALE) {
                c.f12932d.m339a(c0189h3, -1.0f);
                c.f12932d.m339a(c0189h4, (float) BallPulseIndicator.SCALE);
                f2 = (float) i2;
            } else {
                float f3 = BallPulseIndicator.SCALE - f;
                c.f12932d.m339a(c0189h, BallPulseIndicator.SCALE * f3);
                c.f12932d.m339a(c0189h2, -1.0f * f3);
                c.f12932d.m339a(c0189h3, -1.0f * f);
                c.f12932d.m339a(c0189h4, BallPulseIndicator.SCALE * f);
                if (i > 0 || i2 > 0) {
                    f2 = (((float) (-i)) * f3) + (((float) i2) * f);
                }
            }
            c.f12930b = f2;
        }
        if (i3 != 6) {
            c.m8617a(this, i3);
        }
        m359a(c);
    }

    public final void m364a(C0189h c0189h, C0189h c0189h2, int i, int i2) {
        C4705b c = m368c();
        C0189h d = m370d();
        d.f738c = 0;
        c.m8618a(c0189h, c0189h2, d, i);
        if (i2 != 6) {
            m360a(c, (int) (-1.0f * c.f12932d.m342b(d)), i2);
        }
        m359a(c);
    }

    public final void m365a(C0189h c0189h, C0189h c0189h2, C0189h c0189h3, C0189h c0189h4, float f) {
        C4705b c = m368c();
        c.m8619a(c0189h, c0189h2, c0189h3, c0189h4, f);
        m359a(c);
    }

    public final void m366b() {
        int i;
        for (C0189h c0189h : this.f685g.f676c) {
            if (c0189h != null) {
                c0189h.m377b();
            }
        }
        this.f685g.f675b.mo69a(this.f691o, this.f692p);
        this.f692p = 0;
        Arrays.fill(this.f685g.f676c, null);
        if (this.f686j != null) {
            this.f686j.clear();
        }
        this.f679a = 0;
        this.f680b.mo64a();
        this.f683e = 1;
        for (i = 0; i < this.f684f; i++) {
            this.f681c[i].f12931c = false;
        }
        m356g();
        this.f684f = 0;
    }

    public final void m367b(C0189h c0189h, C0189h c0189h2, int i, int i2) {
        C4705b c = m368c();
        C0189h d = m370d();
        d.f738c = 0;
        c.m8624b(c0189h, c0189h2, d, i);
        if (i2 != 6) {
            m360a(c, (int) (-1.0f * c.f12932d.m342b(d)), i2);
        }
        m359a(c);
    }

    public final C4705b m368c() {
        C4705b c4705b = (C4705b) this.f685g.f674a.mo68a();
        if (c4705b == null) {
            c4705b = new C4705b(this.f685g);
        } else {
            c4705b.f12929a = null;
            c4705b.f12932d.m338a();
            c4705b.f12930b = 0.0f;
            c4705b.f12933e = false;
        }
        C0189h.m375a();
        return c4705b;
    }

    public final C4705b m369c(C0189h c0189h, C0189h c0189h2, int i, int i2) {
        C4705b c = m368c();
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            c.f12930b = (float) i;
        }
        if (obj == null) {
            c.f12932d.m339a(c0189h, -1.0f);
            c.f12932d.m339a(c0189h2, (float) BallPulseIndicator.SCALE);
        } else {
            c.f12932d.m339a(c0189h, (float) BallPulseIndicator.SCALE);
            c.f12932d.m339a(c0189h2, -1.0f);
        }
        if (i2 != 6) {
            c.m8617a(this, i2);
        }
        m359a(c);
        return c;
    }

    public final C0189h m370d() {
        if (f677h != null) {
            C0185f c0185f = f677h;
            c0185f.f712n++;
        }
        if (this.f683e + 1 >= this.f688l) {
            m355f();
        }
        C0189h b = m352b(C0188a.f727c);
        this.f679a++;
        this.f683e++;
        b.f736a = this.f679a;
        this.f685g.f676c[this.f679a] = b;
        return b;
    }

    public final void m371e() {
        for (int i = 0; i < this.f684f; i++) {
            C4705b c4705b = this.f681c[i];
            c4705b.f12929a.f739d = c4705b.f12930b;
        }
    }
}
