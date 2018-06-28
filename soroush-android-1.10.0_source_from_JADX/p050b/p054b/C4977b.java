package p050b.p054b;

import java.util.ArrayList;
import java.util.Arrays;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import p050b.p051a.C0818h;
import p050b.p051a.C4954i;
import p050b.p051a.ar;
import p050b.p054b.p055a.C0833b;
import p050b.p054b.p055a.C0834v;
import p050b.p054b.p055a.C4969a;
import p050b.p054b.p055a.C4970j;
import p050b.p054b.p055a.C4971m;
import p050b.p054b.p055a.C4972n;
import p050b.p054b.p055a.C4974s;
import p050b.p054b.p055a.C4975t;
import p050b.p054b.p055a.C6419c;
import p050b.p054b.p055a.C6420g;
import p050b.p054b.p055a.C6421h;
import p050b.p054b.p055a.C6422i;
import p050b.p054b.p055a.C6423k;
import p050b.p054b.p055a.C6426r;
import p050b.p054b.p055a.C6427u;
import p050b.p054b.p055a.C7029d;
import p050b.p054b.p055a.C7030e;
import p050b.p054b.p055a.C7032l;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public abstract class C4977b extends C0834v implements ar, C0844q {
    static final int[] f13831l = new int[]{43, 99, 98, 97, 96, 45, 103, 102, 101, 100, 42, 107, 106, 105, 104, 47, 111, 110, 109, 108, 37, 115, 114, 113, 112, 124, 0, 0, 129, 128, 94, 0, 0, 131, 130, 38, 0, 0, 127, 126, 364, 0, 0, 121, 120, 366, 0, 0, 123, IjkMediaMeta.FF_PROFILE_H264_HIGH_422, 370, 0, 0, 125, 124};
    private static final int[] f13832n = new int[]{358, 159, 160, 350, 160, 159, 357, 164, 163, 359, 162, 161, 60, 161, 162, 62, 163, 164};
    private static final int[] f13833o = new int[]{358, 153, 154, 350, 154, 153, 357, 158, 157, 359, 156, 155, 60, 155, 156, 62, 157, 158};
    private static final int[] f13834p = new int[]{0, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 143, 142, 141, 0, 140, 139, 138, 137, 0, 136, 135, 134, 133, 0};
    protected C4954i f13835a;
    C4985r f13836b = null;
    protected boolean f13837c = false;
    public boolean f13838d = false;
    protected ArrayList f13839e = null;
    protected ArrayList f13840f = null;
    protected C0836a f13841g = null;
    protected int f13842h;
    protected int f13843j;
    protected String f13844k;
    private int f13845m = -1;

    protected static abstract class C0836a {
        C0836a f2501c;

        protected C0836a(C4977b c4977b) {
            this.f2501c = c4977b.f13841g;
        }

        protected final void m1946a(C4977b c4977b) {
            c4977b.f13841g = this.f2501c;
        }

        protected abstract boolean mo888a(C4954i c4954i, int i);
    }

    public C4977b(C4954i c4954i) {
        this.f13835a = c4954i;
    }

    private static int m9846a(ArrayList arrayList) {
        return arrayList == null ? 0 : arrayList.size();
    }

    private String m9847a(C6420g c6420g, String str) {
        C0833b a = c6420g.mo886b().mo883a();
        int e = c6420g.m15257e();
        int d = c6420g.m15256d();
        a.mo885a((C0834v) this);
        int i = this.f13842h;
        if (!(C4977b.m9857a(i, this.f13843j, this.f13844k, d, e, str, true) || i == 344)) {
            if (d != 344) {
                if (d != 307) {
                    return e > 0 ? C4977b.m9860b(d, e) : null;
                } else {
                    if (C4977b.m9869d(i)) {
                        return C4977b.m9848a(str, e);
                    }
                    throw new C0837c("invalid cast");
                }
            }
        }
        throw new C0837c("invalid cast");
    }

    protected static String m9848a(String str, int i) {
        if (str == null) {
            return null;
        }
        if (i == 0) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                stringBuffer.append('[');
                i = i2;
            } else {
                stringBuffer.append('L');
                stringBuffer.append(str);
                stringBuffer.append(';');
                return stringBuffer.toString();
            }
        }
    }

    protected static void m9849a() {
        throw new C0837c("fatal");
    }

    private void m9850a(int i, int i2, C6423k c6423k) {
        int f = C4977b.m9873f(i);
        i2 = C4977b.m9873f(i2);
        if (i2 >= 0 || f >= 0) {
            Object obj;
            if (i2 < 0 || f < 0) {
                C4977b.m9865c(c6423k);
            }
            if (f <= i2) {
                obj = null;
                this.f13842h = i;
                i = f13834p[(i2 * 4) + f];
            } else {
                i = f13834p[(f * 4) + i2];
                obj = 1;
            }
            if (obj != null) {
                if (i2 != 0) {
                    if (i2 != 2) {
                        if (i2 == 1) {
                            if (f == 2) {
                                this.f13835a.m9728e(91);
                                this.f13835a.m9728e(87);
                            } else {
                                this.f13835a.m9728e(95);
                            }
                            this.f13835a.m9728e(i);
                            this.f13835a.m9728e(95);
                            return;
                        }
                        C4977b.m9849a();
                        return;
                    }
                }
                if (f != 0) {
                    if (f != 2) {
                        this.f13835a.m9728e(93);
                        this.f13835a.m9728e(88);
                        this.f13835a.m9728e(i);
                        this.f13835a.m9728e(94);
                        this.f13835a.m9728e(88);
                        return;
                    }
                }
                this.f13835a.m9728e(94);
                this.f13835a.m9728e(88);
                this.f13835a.m9728e(i);
                this.f13835a.m9728e(94);
                this.f13835a.m9728e(88);
                return;
            }
            if (i != 0) {
                this.f13835a.m9728e(i);
            }
        }
    }

    private void m9851a(int i, C0833b c0833b, C6423k c6423k, boolean z) {
        int i2 = 1;
        boolean z2 = c0833b == null;
        if (z2) {
            c0833b = c6423k.mo886b().mo883a();
        }
        C0833b c0833b2 = c0833b;
        int b;
        if (c0833b2 instanceof C6427u) {
            C6422i e = ((C6427u) c0833b2).m15295e();
            int d = e.m15269d();
            this.f13842h = d;
            this.f13843j = e.m15270e();
            b = m9859b(e);
            if (this.f13843j > 0) {
                C4977b.m9867d(c6423k);
            }
            if (d == 312) {
                this.f13835a.m9742o(b);
                if (z && z2) {
                    this.f13835a.m9728e(92);
                }
                this.f13835a.m9697a(1.0d);
                this.f13835a.m9728e(i == 362 ? 99 : 103);
                if (z && !z2) {
                    this.f13835a.m9728e(92);
                }
                this.f13835a.m9743p(b);
                return;
            } else if (d == 326) {
                this.f13835a.m9740m(b);
                if (z && z2) {
                    this.f13835a.m9728e(92);
                }
                this.f13835a.m9703a(1);
                this.f13835a.m9728e(i == 362 ? 97 : 101);
                if (z && !z2) {
                    this.f13835a.m9728e(92);
                }
                this.f13835a.m9741n(b);
                return;
            } else if (d == 317) {
                this.f13835a.m9744q(b);
                if (z && z2) {
                    this.f13835a.m9728e(89);
                }
                this.f13835a.m9698a((float) BallPulseIndicator.SCALE);
                this.f13835a.m9728e(i == 362 ? 98 : 102);
                if (z && !z2) {
                    this.f13835a.m9728e(89);
                }
                this.f13835a.m9745r(b);
                return;
            } else {
                if (!(d == 303 || d == 306 || d == 334)) {
                    if (d != 324) {
                        C4977b.m9867d(c6423k);
                        return;
                    }
                }
                if (z && z2) {
                    this.f13835a.m9738k(b);
                }
                if (i != 362) {
                    i2 = -1;
                }
                if (b > 255) {
                    this.f13835a.m9728e(196);
                    this.f13835a.m9728e(132);
                    this.f13835a.m9733g(b);
                    this.f13835a.m9733g(i2);
                } else {
                    this.f13835a.m9728e(132);
                    this.f13835a.mo869a(b);
                    this.f13835a.mo869a(i2);
                }
                if (z && !z2) {
                    this.f13835a.m9738k(b);
                }
                return;
            }
        }
        if (c0833b2 instanceof C6423k) {
            C6423k c6423k2 = (C6423k) c0833b2;
            if (c6423k2.m15278d() == 65) {
                m9852a(c6423k2.mo883a(), c6423k2.mo886b().mo883a());
                b = this.f13842h;
                int i3 = this.f13843j;
                if (i3 > 0) {
                    C4977b.m9867d(c6423k2);
                }
                this.f13835a.m9728e(92);
                this.f13835a.m9728e(C4977b.m9875g(b, this.f13843j));
                m9879a(C4977b.m9856a(b, i3) ? 94 : 91, z, i, z2, c6423k2);
                this.f13835a.m9728e(C4977b.m9870e(b, i3));
                return;
            }
        }
        mo2678a(i, z2, c0833b2, c6423k, z);
    }

    private void m9852a(C0833b c0833b, C0833b c0833b2) {
        c0833b.mo885a((C0834v) this);
        int i = this.f13842h;
        int i2 = this.f13843j;
        if (i2 == 0) {
            throw new C0837c("bad array access");
        }
        String str = this.f13844k;
        c0833b2.mo885a((C0834v) this);
        if (C4977b.m9873f(this.f13842h) == 3) {
            if (this.f13843j <= 0) {
                this.f13842h = i;
                this.f13843j = i2 - 1;
                this.f13844k = str;
                return;
            }
        }
        throw new C0837c("bad array index");
    }

    private void m9853a(C7029d c7029d, boolean z) {
        int d = c7029d.m15278d();
        C0833b a = c7029d.mo883a();
        C0833b a2 = c7029d.mo886b().mo883a();
        if (a instanceof C6427u) {
            C6427u c6427u = (C6427u) a;
            m9855a((C6423k) c7029d, d, c6427u, c6427u.m15295e(), a2, z);
            return;
        }
        if (a instanceof C6423k) {
            C6423k c6423k = (C6423k) a;
            if (c6423k.m15278d() == 65) {
                m9852a(c6423k.mo883a(), c6423k.mo886b().mo883a());
                if (d != 61) {
                    this.f13835a.m9728e(92);
                    this.f13835a.m9728e(C4977b.m9875g(this.f13842h, this.f13843j));
                }
                int i = this.f13842h;
                int i2 = this.f13843j;
                String str = this.f13844k;
                m9890a((C6423k) c7029d, d, a2, i, i2, str);
                if (z) {
                    C4954i c4954i;
                    int i3;
                    if (C4977b.m9856a(i, i2)) {
                        c4954i = this.f13835a;
                        i3 = 94;
                    } else {
                        c4954i = this.f13835a;
                        i3 = 91;
                    }
                    c4954i.m9728e(i3);
                }
                this.f13835a.m9728e(C4977b.m9870e(i, i2));
                this.f13842h = i;
                this.f13843j = i2;
                this.f13844k = str;
                return;
            }
        }
        mo2680a((C6423k) c7029d, d, a, a2, z);
    }

    private void m9854a(C6423k c6423k, int i, int i2, int i3) {
        if (this.f13843j != 0) {
            C4977b.m9865c(c6423k);
        }
        int i4 = this.f13842h;
        if (!(i == 364 || i == 366)) {
            if (i != 370) {
                m9850a(i3, i4, c6423k);
                i = C4977b.m9873f(this.f13842h);
                if (i >= 0) {
                    i2 = f13831l[(i2 + i) + 1];
                    if (i2 != 0) {
                        if (i == 3 && this.f13842h != 301) {
                            this.f13842h = 324;
                        }
                        this.f13835a.m9728e(i2);
                        return;
                    }
                }
                C4977b.m9865c(c6423k);
            }
        }
        if (!(i4 == 324 || i4 == 334 || i4 == 306)) {
            if (i4 != 303) {
                C4977b.m9865c(c6423k);
                i = C4977b.m9873f(this.f13842h);
                if (i >= 0) {
                    i2 = f13831l[(i2 + i) + 1];
                    if (i2 != 0) {
                        this.f13842h = 324;
                        this.f13835a.m9728e(i2);
                        return;
                    }
                }
                C4977b.m9865c(c6423k);
            }
        }
        this.f13842h = i3;
        i = C4977b.m9873f(this.f13842h);
        if (i >= 0) {
            i2 = f13831l[(i2 + i) + 1];
            if (i2 != 0) {
                this.f13842h = 324;
                this.f13835a.m9728e(i2);
                return;
            }
        }
        C4977b.m9865c(c6423k);
    }

    private void m9855a(C6423k c6423k, int i, C6427u c6427u, C6422i c6422i, C0833b c0833b, boolean z) {
        C0833b c0833b2 = c0833b;
        int d = c6422i.m15269d();
        int e = c6422i.m15270e();
        String f = c6422i.m15271f();
        int b = m9859b(c6422i);
        int i2 = i;
        if (i2 != 61) {
            mo901a(c6427u);
        }
        if (c6423k == null && (c0833b2 instanceof C6419c)) {
            mo2679a((C6419c) c0833b2, d, f);
        } else {
            m9890a(c6423k, i2, c0833b2, d, e, f);
        }
        if (z) {
            C4954i c4954i;
            int i3;
            if (C4977b.m9856a(d, e)) {
                c4954i = r7.f13835a;
                i3 = 92;
            } else {
                c4954i = r7.f13835a;
                i3 = 89;
            }
            c4954i.m9728e(i3);
        }
        if (e <= 0) {
            if (d == 312) {
                r7.f13835a.m9743p(b);
            } else if (d == 317) {
                r7.f13835a.m9745r(b);
            } else if (d == 326) {
                r7.f13835a.m9741n(b);
            } else if (!C4977b.m9869d(d)) {
                r7.f13835a.m9739l(b);
            }
            r7.f13842h = d;
            r7.f13843j = e;
            r7.f13844k = f;
        }
        r7.f13835a.m9736i(b);
        r7.f13842h = d;
        r7.f13843j = e;
        r7.f13844k = f;
    }

    public static boolean m9856a(int i, int i2) {
        return i2 == 0 && (i == 312 || i == 326);
    }

    private static boolean m9857a(int i, int i2, String str, int i3, int i4, String str2, boolean z) {
        return (i2 == i4 || i == 412) ? false : (i4 == 0 && i3 == 307 && "java/lang/Object".equals(str2)) ? false : (z && i2 == 0 && i == 307 && "java/lang/Object".equals(str)) ? false : true;
    }

    private boolean m9858a(boolean z, C0833b c0833b) {
        m9871e(c0833b);
        return m9862b(z, c0833b);
    }

    private int m9859b(C6422i c6422i) {
        int g = c6422i.m15272g();
        if (g >= 0) {
            return g;
        }
        g = this.f13835a.f13794f;
        c6422i.m15267b(g);
        m9901b(1);
        return g;
    }

    protected static String m9860b(int i, int i2) {
        char c = 'I';
        if (i == 301) {
            c = 'Z';
        } else if (i == 303) {
            c = 'B';
        } else if (i == 306) {
            c = 'C';
        } else if (i == 312) {
            c = 'D';
        } else if (i == 317) {
            c = 'F';
        } else if (i != 324) {
            if (i == 326) {
                c = 'J';
            } else if (i == 334) {
                c = 'S';
            } else if (i == 344) {
                c = 'V';
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                stringBuffer.append('[');
                i2 = i3;
            } else {
                stringBuffer.append(c);
                return stringBuffer.toString();
            }
        }
    }

    private static void m9861b(C6423k c6423k) {
        String str;
        if (c6423k == null) {
            str = "incompatible type for assignment";
        } else {
            StringBuilder stringBuilder = new StringBuilder("incompatible type for ");
            stringBuilder.append(c6423k.m15280f());
            str = stringBuilder.toString();
        }
        throw new C0837c(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m9862b(boolean r10, p050b.p054b.p055a.C0833b r11) {
        /*
        r9 = this;
        r0 = p050b.p054b.C4977b.m9864c(r11);
        r1 = 301; // 0x12d float:4.22E-43 double:1.487E-321;
        r2 = 358; // 0x166 float:5.02E-43 double:1.77E-321;
        r3 = 3;
        r4 = 1;
        r5 = 0;
        if (r0 != r2) goto L_0x00e1;
    L_0x000d:
        r11 = (p050b.p054b.p055a.C7030e) r11;
        r0 = r11.mo883a();
        r0.mo885a(r9);
        r0 = r9.f13842h;
        r6 = r9.f13843j;
        r7 = r11.mo886b();
        r7 = r7.mo883a();
        r7.mo885a(r9);
        r7 = r9.f13843j;
        r8 = 412; // 0x19c float:5.77E-43 double:2.036E-321;
        if (r6 == r7) goto L_0x003f;
    L_0x002b:
        if (r0 == r8) goto L_0x0039;
    L_0x002d:
        r7 = r9.f13842h;
        if (r7 == r8) goto L_0x0039;
    L_0x0031:
        r10 = new b.b.c;
        r11 = "incompatible array types";
        r10.<init>(r11);
        throw r10;
    L_0x0039:
        r7 = r9.f13842h;
        if (r7 != r8) goto L_0x003f;
    L_0x003d:
        r9.f13843j = r6;
    L_0x003f:
        if (r0 != r8) goto L_0x0043;
    L_0x0041:
        r0 = r9.f13842h;
    L_0x0043:
        r6 = r11.m15278d();
        r7 = r9.f13843j;
        if (r7 != 0) goto L_0x0050;
    L_0x004b:
        r7 = r9.f13842h;
        r9.m9850a(r0, r7, r11);
    L_0x0050:
        r0 = r9.f13842h;
        r0 = p050b.p054b.C4977b.m9873f(r0);
        r7 = -1;
        if (r0 == r7) goto L_0x00c3;
    L_0x0059:
        r7 = r9.f13843j;
        if (r7 <= 0) goto L_0x005f;
    L_0x005d:
        goto L_0x00c3;
    L_0x005f:
        r2 = 2;
        if (r0 != r3) goto L_0x0079;
    L_0x0062:
        r0 = f13832n;
        r3 = r5;
    L_0x0065:
        r7 = r0.length;
        if (r3 >= r7) goto L_0x00dc;
    L_0x0068:
        r7 = r0[r3];
        if (r7 != r6) goto L_0x0076;
    L_0x006c:
        r11 = r9.f13835a;
        if (r10 == 0) goto L_0x0071;
    L_0x0070:
        r2 = r4;
    L_0x0071:
        r3 = r3 + r2;
        r10 = r0[r3];
        goto L_0x0137;
    L_0x0076:
        r3 = r3 + 3;
        goto L_0x0065;
    L_0x0079:
        r3 = 357; // 0x165 float:5.0E-43 double:1.764E-321;
        r7 = 60;
        if (r0 != 0) goto L_0x0091;
    L_0x007f:
        if (r6 == r7) goto L_0x0089;
    L_0x0081:
        if (r6 != r3) goto L_0x0084;
    L_0x0083:
        goto L_0x0089;
    L_0x0084:
        r0 = r9.f13835a;
        r3 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        goto L_0x008d;
    L_0x0089:
        r0 = r9.f13835a;
        r3 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
    L_0x008d:
        r0.m9728e(r3);
        goto L_0x00ac;
    L_0x0091:
        if (r0 != r4) goto L_0x00a2;
    L_0x0093:
        if (r6 == r7) goto L_0x009d;
    L_0x0095:
        if (r6 != r3) goto L_0x0098;
    L_0x0097:
        goto L_0x009d;
    L_0x0098:
        r0 = r9.f13835a;
        r3 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        goto L_0x008d;
    L_0x009d:
        r0 = r9.f13835a;
        r3 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        goto L_0x008d;
    L_0x00a2:
        if (r0 != r2) goto L_0x00a9;
    L_0x00a4:
        r0 = r9.f13835a;
        r3 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        goto L_0x008d;
    L_0x00a9:
        p050b.p054b.C4977b.m9849a();
    L_0x00ac:
        r0 = f13833o;
        r3 = r5;
    L_0x00af:
        r7 = r0.length;
        if (r3 >= r7) goto L_0x00dc;
    L_0x00b2:
        r7 = r0[r3];
        if (r7 != r6) goto L_0x00c0;
    L_0x00b6:
        r11 = r9.f13835a;
        if (r10 == 0) goto L_0x00bb;
    L_0x00ba:
        r2 = r4;
    L_0x00bb:
        r3 = r3 + r2;
        r10 = r0[r3];
        goto L_0x0137;
    L_0x00c0:
        r3 = r3 + 3;
        goto L_0x00af;
    L_0x00c3:
        r0 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        r3 = 165; // 0xa5 float:2.31E-43 double:8.15E-322;
        if (r6 != r2) goto L_0x00d3;
    L_0x00c9:
        r11 = r9.f13835a;
        if (r10 == 0) goto L_0x00ce;
    L_0x00cd:
        r0 = r3;
    L_0x00ce:
        r11.m9728e(r0);
        goto L_0x017a;
    L_0x00d3:
        r2 = 350; // 0x15e float:4.9E-43 double:1.73E-321;
        if (r6 != r2) goto L_0x00dc;
    L_0x00d7:
        r11 = r9.f13835a;
        if (r10 == 0) goto L_0x00cd;
    L_0x00db:
        goto L_0x00ce;
    L_0x00dc:
        p050b.p054b.C4977b.m9865c(r11);
        goto L_0x017a;
    L_0x00e1:
        r2 = 33;
        if (r0 != r2) goto L_0x00f1;
    L_0x00e5:
        r10 = r10 ^ r4;
        r11 = (p050b.p054b.p055a.C6423k) r11;
        r11 = r11.mo883a();
        r9.m9862b(r10, r11);
        goto L_0x017a;
    L_0x00f1:
        r2 = 369; // 0x171 float:5.17E-43 double:1.823E-321;
        if (r0 != r2) goto L_0x00f7;
    L_0x00f5:
        r2 = r4;
        goto L_0x00f8;
    L_0x00f7:
        r2 = r5;
    L_0x00f8:
        r6 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        if (r2 != 0) goto L_0x0143;
    L_0x00fc:
        r7 = 368; // 0x170 float:5.16E-43 double:1.82E-321;
        if (r0 != r7) goto L_0x0101;
    L_0x0100:
        goto L_0x0143;
    L_0x0101:
        r0 = r11 instanceof p050b.p054b.p055a.C4972n;
        if (r0 == 0) goto L_0x0119;
    L_0x0105:
        r0 = r11;
        r0 = (p050b.p054b.p055a.C4972n) r0;
        r0 = r0.m9836d();
        if (r10 == 0) goto L_0x0114;
    L_0x010e:
        r2 = 410; // 0x19a float:5.75E-43 double:2.026E-321;
        if (r0 != r2) goto L_0x0119;
    L_0x0112:
        r0 = r4;
        goto L_0x011a;
    L_0x0114:
        r2 = 411; // 0x19b float:5.76E-43 double:2.03E-321;
        if (r0 != r2) goto L_0x0119;
    L_0x0118:
        goto L_0x0112;
    L_0x0119:
        r0 = r5;
    L_0x011a:
        if (r0 == 0) goto L_0x0122;
    L_0x011c:
        r10 = r9.f13835a;
        r10.m9728e(r6);
        return r4;
    L_0x0122:
        r11.mo885a(r9);
        r11 = r9.f13842h;
        if (r11 != r1) goto L_0x013b;
    L_0x0129:
        r11 = r9.f13843j;
        if (r11 == 0) goto L_0x012e;
    L_0x012d:
        goto L_0x013b;
    L_0x012e:
        r11 = r9.f13835a;
        if (r10 == 0) goto L_0x0135;
    L_0x0132:
        r10 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        goto L_0x0137;
    L_0x0135:
        r10 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
    L_0x0137:
        r11.m9728e(r10);
        goto L_0x017a;
    L_0x013b:
        r10 = new b.b.c;
        r11 = "boolean expr is required";
        r10.<init>(r11);
        throw r10;
    L_0x0143:
        r11 = (p050b.p054b.p055a.C7030e) r11;
        r0 = r2 ^ 1;
        r4 = r11.mo883a();
        r9.m9862b(r0, r4);
        r0 = r9.f13835a;
        r0 = r0.f2447b;
        r4 = r9.f13835a;
        r4.m9733g(r5);
        r11 = r11.mo886b();
        r11 = r11.mo883a();
        r9.m9862b(r2, r11);
        r11 = r9.f13835a;
        r4 = r9.f13835a;
        r4 = r4.f2447b;
        r4 = r4 - r0;
        r4 = r4 + r3;
        r11.m9719c(r0, r4);
        if (r10 == r2) goto L_0x017a;
    L_0x016f:
        r10 = r9.f13835a;
        r11 = 6;
        r10.m9733g(r11);
        r10 = r9.f13835a;
        r10.m9728e(r6);
    L_0x017a:
        r9.f13842h = r1;
        r9.f13843j = r5;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.b.b(boolean, b.b.a.b):boolean");
    }

    static int m9863c(int i) {
        int[] iArr = f13831l;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2 += 5) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    static int m9864c(C0833b c0833b) {
        if (!(c0833b instanceof C6423k)) {
            return 32;
        }
        C6423k c6423k = (C6423k) c0833b;
        int d = c6423k.m15278d();
        return d == 33 ? 33 : (!(c6423k instanceof C7030e) || d == 368 || d == 369 || d == 38 || d == 124) ? d : 358;
    }

    private static void m9865c(C6423k c6423k) {
        StringBuilder stringBuilder = new StringBuilder("invalid types for ");
        stringBuilder.append(c6423k.m15280f());
        throw new C0837c(stringBuilder.toString());
    }

    static boolean m9866c(int i, int i2) {
        i = C4977b.m9873f(i);
        i2 = C4977b.m9873f(i2);
        return i >= 0 && i2 >= 0 && i > i2;
    }

    private static void m9867d(C6423k c6423k) {
        StringBuilder stringBuilder = new StringBuilder("invalid type for ");
        stringBuilder.append(c6423k.m15280f());
        throw new C0837c(stringBuilder.toString());
    }

    private void m9868d(C6426r c6426r) {
        int i;
        int i2;
        C4969a c4969a = c6426r;
        m9881a(c4969a.f13818a);
        ArrayList arrayList = this.f13839e;
        this.f13839e = new ArrayList();
        int i3 = this.f13835a.f2447b;
        this.f13835a.m9728e(171);
        int i4 = 3 - (i3 & 3);
        while (true) {
            i = i4 - 1;
            boolean z = false;
            if (i4 <= 0) {
                break;
            }
            r0.f13835a.mo869a(0);
            i4 = i;
        }
        c4969a = (C6426r) c4969a.f13819b;
        C4969a c4969a2 = c4969a;
        i = 0;
        while (true) {
            int i5 = 304;
            if (c4969a2 == null) {
                break;
            }
            if (((C6426r) c4969a2.f13818a).m15293d() == 304) {
                i++;
            }
            c4969a2 = c4969a2.f13819b;
        }
        i4 = r0.f13835a.f2447b;
        r0.f13835a.mo872b(4);
        r0.f13835a.m9723d(i);
        r0.f13835a.mo872b(i * 8);
        long[] jArr = new long[i];
        int i6 = -1;
        int i7 = 0;
        while (c4969a != null) {
            C6426r c6426r2 = (C6426r) c4969a.f13818a;
            int d = c6426r2.m15293d();
            if (d == 310) {
                i6 = r0.f13835a.f2447b;
            } else if (d != i5) {
                C4977b.m9849a();
            } else {
                d = i7 + 1;
                C0833b c0833b = c6426r2.f13818a;
                m9871e(c0833b);
                c0833b = C4985r.m9971a(c0833b);
                if (c0833b instanceof C4971m) {
                    jArr[i7] = (((long) ((int) ((C4971m) c0833b).m9833d())) << 32) + (((long) (r0.f13835a.f2447b - i3)) & -1);
                    i7 = d;
                    z = false;
                } else {
                    throw new C0837c("bad case label");
                }
            }
            r0.f13837c = z;
            mo899a((C6426r) c6426r2.f13819b);
            c4969a = c4969a.f13819b;
            z = false;
            i5 = 304;
        }
        Arrays.sort(jArr);
        int i8 = i4 + 8;
        for (i2 = 0; i2 < i; i2++) {
            r0.f13835a.m9724d(i8, (int) (jArr[i2] >>> 32));
            r0.f13835a.m9724d(i8 + 4, (int) jArr[i2]);
            i8 += 8;
        }
        if (i6 < 0 || r0.f13839e.size() > 0) {
            r0.f13837c = false;
        }
        i2 = r0.f13835a.f2447b;
        if (i6 < 0) {
            i6 = i2;
        }
        r0.f13835a.m9724d(i4, i6 - i3);
        m9899a(r0.f13839e, i2);
        r0.f13839e = arrayList;
    }

    protected static boolean m9869d(int i) {
        if (i != 307) {
            if (i != 412) {
                return false;
            }
        }
        return true;
    }

    protected static int m9870e(int i, int i2) {
        return i2 > 0 ? 83 : (i == 301 || i == 303) ? 84 : i != 306 ? i != 312 ? i != 317 ? i != 324 ? i != 326 ? i != 334 ? 83 : 86 : 80 : 79 : 81 : 82 : 85;
    }

    private void m9871e(C0833b c0833b) {
        if (this.f13836b != null) {
            c0833b.mo885a(this.f13836b);
        }
    }

    static boolean m9872e(int i) {
        return C4977b.m9873f(i) == 3;
    }

    private static int m9873f(int i) {
        return i == 312 ? 0 : i == 317 ? 1 : i == 326 ? 2 : (C4977b.m9869d(i) || i == 344) ? -1 : 3;
    }

    private void m9874f(int i, int i2) {
        C4954i c4954i;
        String str;
        String str2;
        String str3;
        if (!C4977b.m9869d(i)) {
            if (i2 <= 0) {
                if (i == 312) {
                    c4954i = this.f13835a;
                    str = "java.lang.String";
                    str2 = "valueOf";
                    str3 = "(D)Ljava/lang/String;";
                } else if (i == 317) {
                    c4954i = this.f13835a;
                    str = "java.lang.String";
                    str2 = "valueOf";
                    str3 = "(F)Ljava/lang/String;";
                } else if (i == 326) {
                    c4954i = this.f13835a;
                    str = "java.lang.String";
                    str2 = "valueOf";
                    str3 = "(J)Ljava/lang/String;";
                } else if (i == 301) {
                    c4954i = this.f13835a;
                    str = "java.lang.String";
                    str2 = "valueOf";
                    str3 = "(Z)Ljava/lang/String;";
                } else if (i == 306) {
                    c4954i = this.f13835a;
                    str = "java.lang.String";
                    str2 = "valueOf";
                    str3 = "(C)Ljava/lang/String;";
                } else if (i == 344) {
                    throw new C0837c("void type expression");
                } else {
                    c4954i = this.f13835a;
                    str = "java.lang.String";
                    str2 = "valueOf";
                    str3 = "(I)Ljava/lang/String;";
                }
                c4954i.m9722c(str, str2, str3);
            }
        }
        c4954i = this.f13835a;
        str = "java.lang.String";
        str2 = "valueOf";
        str3 = "(Ljava/lang/Object;)Ljava/lang/String;";
        c4954i.m9722c(str, str2, str3);
    }

    private static int m9875g(int i, int i2) {
        return i2 > 0 ? 50 : (i == 301 || i == 303) ? 51 : i != 306 ? i != 312 ? i != 317 ? i != 324 ? i != 326 ? i != 334 ? 50 : 53 : 47 : 46 : 48 : 49 : 52;
    }

    protected abstract String mo2676a(C4969a c4969a);

    protected abstract String mo2677a(String str);

    public final void m9878a(int i) {
        this.f13835a.f13794f = i;
    }

    protected final void m9879a(int i, boolean z, int i2, boolean z2, C6423k c6423k) {
        int i3 = this.f13842h;
        if (z && z2) {
            this.f13835a.m9728e(i);
        }
        if (!(i3 == 324 || i3 == 303 || i3 == 306)) {
            if (i3 != 334) {
                C4954i c4954i;
                if (i3 == 326) {
                    this.f13835a.m9703a(1);
                    c4954i = this.f13835a;
                    i2 = i2 == 362 ? 97 : 101;
                } else if (i3 == 317) {
                    this.f13835a.m9698a((float) BallPulseIndicator.SCALE);
                    c4954i = this.f13835a;
                    i2 = i2 == 362 ? 98 : 102;
                } else if (i3 == 312) {
                    this.f13835a.m9697a(1.0d);
                    c4954i = this.f13835a;
                    i2 = i2 == 362 ? 99 : 103;
                } else {
                    C4977b.m9867d(c6423k);
                    if (z && !z2) {
                        this.f13835a.m9728e(i);
                        return;
                    }
                }
                c4954i.m9728e(i2);
                if (z) {
                }
            }
        }
        this.f13835a.m9737j(1);
        this.f13835a.m9728e(i2 == 362 ? 96 : 100);
        this.f13842h = 324;
        if (z) {
        }
    }

    protected abstract void mo2678a(int i, boolean z, C0833b c0833b, C6423k c6423k, boolean z2);

    public final void m9881a(C0833b c0833b) {
        m9871e(c0833b);
        c0833b.mo885a((C0834v) this);
    }

    protected abstract void mo2679a(C6419c c6419c, int i, String str);

    public final void mo889a(C7029d c7029d) {
        m9853a(c7029d, true);
    }

    public final void mo890a(C7030e c7030e) {
        int d = c7030e.m15278d();
        int c = C4977b.m9863c(d);
        boolean z = true;
        if (c >= 0) {
            c7030e.mo883a().mo885a((C0834v) this);
            C0833b a = c7030e.mo886b().mo883a();
            if (a != null) {
                int i = this.f13842h;
                int i2 = this.f13843j;
                a.mo885a((C0834v) this);
                if (i2 != this.f13843j) {
                    throw new C0837c("incompatible array types");
                } else if (d == 43 && i2 == 0 && (i == 307 || this.f13842h == 307)) {
                    int i3 = this.f13842h;
                    d = this.f13843j;
                    boolean a2 = C4977b.m9856a(i3, d);
                    if (i3 != 307 || !"java/lang/String".equals(this.f13844k)) {
                        z = false;
                    }
                    if (a2) {
                        m9874f(i3, d);
                    }
                    if (C4977b.m9856a(i, i2)) {
                        this.f13835a.m9728e(91);
                        this.f13835a.m9728e(87);
                    } else {
                        this.f13835a.m9728e(95);
                    }
                    m9874f(i, i2);
                    this.f13835a.m9728e(95);
                    if (!(a2 || r3)) {
                        m9874f(i3, d);
                    }
                    this.f13835a.m9727d("java.lang.String", "concat", "(Ljava/lang/String;)Ljava/lang/String;");
                    this.f13842h = 307;
                    this.f13843j = 0;
                    this.f13844k = "java/lang/String";
                    return;
                } else {
                    m9854a((C6423k) c7030e, d, c, i);
                    return;
                }
            }
            return;
        }
        m9862b(true, (C0833b) c7030e);
        this.f13835a.m9733g(7);
        this.f13835a.m9737j(0);
        this.f13835a.m9728e(167);
        this.f13835a.m9733g(4);
        this.f13835a.m9737j(1);
    }

    public void mo891a(C6420g c6420g) {
        String a = mo2676a((C4969a) c6420g.mo883a());
        String a2 = m9847a(c6420g, a);
        int i = this.f13842h;
        this.f13842h = c6420g.m15256d();
        this.f13843j = c6420g.m15257e();
        this.f13844k = a;
        if (a2 == null) {
            m9908d(i, this.f13842h);
        } else {
            this.f13835a.m9707a(a2);
        }
    }

    public final void mo892a(C6421h c6421h) {
        m9862b(false, c6421h.f13818a);
        int i = this.f13835a.f2447b;
        this.f13835a.m9733g(0);
        c6421h.f13819b.f13818a.mo885a((C0834v) this);
        int i2 = this.f13843j;
        this.f13835a.m9728e(167);
        int i3 = this.f13835a.f2447b;
        this.f13835a.m9733g(0);
        this.f13835a.m9719c(i, (this.f13835a.f2447b - i) + 1);
        c6421h.m15260d().mo885a((C0834v) this);
        if (i2 != this.f13843j) {
            throw new C0837c("type mismatch in ?:");
        }
        this.f13835a.m9719c(i3, (this.f13835a.f2447b - i3) + 1);
    }

    public final void mo893a(C6422i c6422i) {
        c6422i.m15267b(this.f13835a.f13794f);
        c6422i.m15266a(mo2677a(c6422i.m15271f()));
        m9901b(C4977b.m9856a(c6422i.m15269d(), c6422i.m15270e()) ? 2 : 1);
        C4969a c4969a = c6422i.f13819b;
        C0833b c0833b = c4969a != null ? c4969a.f13818a : null;
        if (c0833b != null) {
            m9871e(c0833b);
            m9855a(null, 61, null, c6422i, c0833b, false);
        }
    }

    public final void mo894a(C4970j c4970j) {
        this.f13843j = 0;
        if (c4970j.m9828e() == 405) {
            this.f13842h = 312;
            this.f13835a.m9697a(c4970j.m9827d());
            return;
        }
        this.f13842h = 317;
        this.f13835a.m9698a((float) c4970j.m9827d());
    }

    public final void mo895a(C6423k c6423k) {
        int d = c6423k.m15278d();
        C0833b a = c6423k.mo883a();
        if (d == 46) {
            if (((C4975t) c6423k.mo886b().mo883a()).m9844d().equals("class")) {
                C0833b a2 = c6423k.mo883a();
                if (a2 instanceof C4975t) {
                    String d2 = ((C4975t) a2).m9844d();
                    if (d2.startsWith("[")) {
                        d = d2.indexOf("[L");
                        if (d >= 0) {
                            String substring = d2.substring(d + 2, d2.length() - 1);
                            String a3 = mo2677a(substring);
                            if (!substring.equals(a3)) {
                                d2 = C4981j.m9936c(a3);
                                StringBuffer stringBuffer = new StringBuffer();
                                while (true) {
                                    int i = d - 1;
                                    if (d < 0) {
                                        break;
                                    }
                                    stringBuffer.append('[');
                                    d = i;
                                }
                                stringBuffer.append('L');
                                stringBuffer.append(d2);
                                stringBuffer.append(';');
                                d2 = stringBuffer.toString();
                            }
                        }
                    } else {
                        d2 = C4981j.m9936c(mo2677a(C4981j.m9934b(d2)));
                    }
                    mo2681b(d2);
                    this.f13842h = 307;
                    this.f13843j = 0;
                    this.f13844k = "java/lang/Class";
                    return;
                }
                throw new C0837c("fatal error: badly parsed .class expr");
            }
            mo2685d((C0833b) c6423k);
        } else if (d == 35) {
            mo2685d((C0833b) c6423k);
        } else if (d == 65) {
            m9852a(a, c6423k.mo886b().mo883a());
            this.f13835a.m9728e(C4977b.m9875g(this.f13842h, this.f13843j));
        } else {
            if (d != 362) {
                if (d != 363) {
                    if (d == 33) {
                        m9862b(false, (C0833b) c6423k);
                        this.f13835a.m9733g(7);
                        this.f13835a.m9737j(1);
                        this.f13835a.m9728e(167);
                        this.f13835a.m9733g(4);
                        this.f13835a.m9737j(0);
                        return;
                    }
                    if (d != 67) {
                        c6423k.mo883a().mo885a((C0834v) this);
                        int f = C4977b.m9873f(this.f13842h);
                        if (this.f13843j > 0) {
                            C4977b.m9867d(c6423k);
                        }
                        if (d == 45) {
                            if (f == 0) {
                                this.f13835a.m9728e(119);
                                return;
                            } else if (f == 1) {
                                this.f13835a.m9728e(118);
                                return;
                            } else if (f == 2) {
                                this.f13835a.m9728e(117);
                                return;
                            } else if (f == 3) {
                                this.f13835a.m9728e(116);
                                this.f13842h = 324;
                                return;
                            } else {
                                C4977b.m9867d(c6423k);
                                return;
                            }
                        } else if (d == 126) {
                            if (f == 3) {
                                this.f13835a.m9737j(-1);
                                this.f13835a.m9728e(130);
                                this.f13842h = 324;
                                return;
                            } else if (f == 2) {
                                this.f13835a.m9703a(-1);
                                this.f13835a.m9728e(131);
                                return;
                            } else {
                                C4977b.m9867d(c6423k);
                                return;
                            }
                        } else if (d == 43) {
                            if (f == -1) {
                                C4977b.m9867d(c6423k);
                                return;
                            }
                            return;
                        }
                    }
                    C4977b.m9849a();
                    return;
                }
            }
            m9851a(d, a, c6423k, true);
        }
    }

    protected final void m9890a(C6423k c6423k, int i, C0833b c0833b, int i2, int i3, String str) {
        if (i == 354 && i3 == 0 && i2 == 307) {
            if (!"java/lang/String".equals(str)) {
                C4977b.m9861b(c6423k);
            }
            m9874f(i2, i3);
            c0833b.mo885a((C0834v) this);
            m9874f(this.f13842h, this.f13843j);
            this.f13835a.m9727d("java.lang.String", "concat", "(Ljava/lang/String;)Ljava/lang/String;");
            this.f13842h = 307;
            this.f13843j = 0;
            this.f13844k = "java/lang/String";
        } else {
            c0833b.mo885a((C0834v) this);
            if (C4977b.m9857a(this.f13842h, this.f13843j, this.f13844k, i2, i3, str, false) || (i != 61 && i3 > 0)) {
                C4977b.m9861b(c6423k);
            }
            if (i != 61) {
                int i4 = z[i - 351];
                int c = C4977b.m9863c(i4);
                if (c < 0) {
                    C4977b.m9849a();
                }
                m9854a(c6423k, i4, c, i2);
            }
        }
        if (i != 61 || (i3 == 0 && !C4977b.m9869d(i2))) {
            m9908d(this.f13842h, i2);
        }
    }

    protected abstract void mo2680a(C6423k c6423k, int i, C0833b c0833b, C0833b c0833b2, boolean z);

    public final void mo896a(C7032l c7032l) {
        this.f13835a.m9715b(m9847a((C6420g) c7032l, mo2676a((C4969a) c7032l.mo883a())));
        this.f13842h = 301;
        this.f13843j = 0;
    }

    public final void mo897a(C4971m c4971m) {
        this.f13843j = 0;
        long d = c4971m.m9833d();
        int e = c4971m.m9834e();
        if (e != 402) {
            if (e != 401) {
                this.f13842h = 326;
                this.f13835a.m9703a(d);
                return;
            }
        }
        this.f13842h = e == 402 ? 324 : 306;
        this.f13835a.m9737j((int) d);
    }

    public final void mo898a(C4972n c4972n) {
        this.f13843j = 0;
        int d = c4972n.m9836d();
        if (d != 336 && d != 339) {
            switch (d) {
                case 410:
                    this.f13835a.m9737j(1);
                    this.f13842h = 301;
                    return;
                case 411:
                    this.f13835a.m9737j(0);
                    this.f13842h = 301;
                    return;
                case 412:
                    this.f13835a.m9728e(1);
                    this.f13842h = 412;
                    return;
                default:
                    C4977b.m9849a();
                    return;
            }
        } else if (this.f13838d) {
            StringBuilder stringBuilder = new StringBuilder("not-available: ");
            stringBuilder.append(d == 339 ? "this" : "super");
            throw new C0837c(stringBuilder.toString());
        } else {
            this.f13835a.m9735h(0);
            this.f13842h = 307;
            if (d == 339) {
                this.f13844k = mo2682c();
            } else {
                this.f13844k = mo2684d();
            }
        }
    }

    public final void mo899a(C6426r c6426r) {
        if (c6426r != null) {
            int d = c6426r.m15293d();
            boolean z = true;
            int i = 0;
            if (d == 69) {
                C0833b a = c6426r.mo883a();
                m9871e(a);
                if (a instanceof C7029d) {
                    m9853a((C7029d) a, false);
                    return;
                }
                C6423k c6423k;
                if (a instanceof C6423k) {
                    d = ((C6423k) a).m15278d();
                    if (d != 362) {
                        if (d == 363) {
                        }
                    }
                    if (z) {
                        a.mo885a((C0834v) this);
                        if (C4977b.m9856a(this.f13842h, this.f13843j)) {
                            if (this.f13842h != 344) {
                                this.f13835a.m9728e(87);
                            }
                            return;
                        }
                        this.f13835a.m9728e(88);
                        return;
                    }
                    c6423k = (C6423k) a;
                    m9851a(c6423k.m15278d(), c6423k.mo883a(), c6423k, false);
                    return;
                }
                z = false;
                if (z) {
                    a.mo885a((C0834v) this);
                    if (C4977b.m9856a(this.f13842h, this.f13843j)) {
                        if (this.f13842h != 344) {
                            this.f13835a.m9728e(87);
                        }
                        return;
                    }
                    this.f13835a.m9728e(88);
                    return;
                }
                c6423k = (C6423k) a;
                m9851a(c6423k.m15278d(), c6423k.mo883a(), c6423k, false);
                return;
            }
            C0833b c0833b;
            C4969a c4969a;
            if (d != 68) {
                if (d != 66) {
                    int i2;
                    if (d == 320) {
                        c0833b = c6426r.f13818a;
                        C6426r c6426r2 = (C6426r) c6426r.f13819b.f13818a;
                        c6426r = (C6426r) c6426r.f13819b.f13819b.f13818a;
                        m9858a(false, c0833b);
                        d = this.f13835a.f2447b;
                        this.f13835a.m9733g(0);
                        this.f13837c = false;
                        if (c6426r2 != null) {
                            mo899a(c6426r2);
                        }
                        boolean z2 = this.f13837c;
                        this.f13837c = false;
                        if (c6426r == null || z2) {
                            i2 = 0;
                        } else {
                            this.f13835a.m9728e(167);
                            i2 = this.f13835a.f2447b;
                            this.f13835a.m9733g(0);
                        }
                        this.f13835a.m9719c(d, (this.f13835a.f2447b - d) + 1);
                        if (c6426r != null) {
                            mo899a(c6426r);
                            if (!z2) {
                                this.f13835a.m9719c(i2, (this.f13835a.f2447b - i2) + 1);
                            }
                            if (!z2 || !this.f13837c) {
                                z = false;
                            }
                            this.f13837c = z;
                        }
                        return;
                    }
                    ArrayList arrayList;
                    C0833b c0833b2;
                    int i3;
                    if (d != 346) {
                        if (d != 311) {
                            if (d == 318) {
                                int i4;
                                ArrayList arrayList2 = this.f13839e;
                                arrayList = this.f13840f;
                                this.f13839e = new ArrayList();
                                this.f13840f = new ArrayList();
                                C6426r c6426r3 = (C6426r) c6426r.f13818a;
                                c4969a = c6426r.f13819b;
                                c0833b2 = c4969a.f13818a;
                                c4969a = c4969a.f13819b;
                                C6426r c6426r4 = (C6426r) c4969a.f13818a;
                                c6426r = (C6426r) c4969a.f13819b;
                                if (c6426r3 != null) {
                                    mo899a(c6426r3);
                                }
                                int i5 = this.f13835a.f2447b;
                                if (c0833b2 != null) {
                                    m9858a(false, c0833b2);
                                    i4 = this.f13835a.f2447b;
                                    this.f13835a.m9733g(0);
                                } else {
                                    i4 = 0;
                                }
                                if (c6426r != null) {
                                    mo899a(c6426r);
                                }
                                i3 = this.f13835a.f2447b;
                                if (c6426r4 != null) {
                                    mo899a(c6426r4);
                                }
                                this.f13835a.m9728e(167);
                                this.f13835a.m9733g((i5 - this.f13835a.f2447b) + 1);
                                i2 = this.f13835a.f2447b;
                                if (c0833b2 != null) {
                                    this.f13835a.m9719c(i4, (i2 - i4) + 1);
                                }
                                m9899a(this.f13839e, i2);
                                m9899a(this.f13840f, i3);
                                this.f13840f = arrayList;
                                this.f13839e = arrayList2;
                                this.f13837c = false;
                                return;
                            }
                            if (d != 302) {
                                if (d != 309) {
                                    if (d == 333) {
                                        mo3316b(c6426r);
                                        return;
                                    } else if (d == 340) {
                                        m9881a(c6426r.mo883a());
                                        if (this.f13842h == 307) {
                                            if (this.f13843j <= 0) {
                                                this.f13835a.m9728e(191);
                                                this.f13837c = true;
                                                return;
                                            }
                                        }
                                        throw new C0837c("bad throw statement");
                                    } else if (d == 343) {
                                        mo2683c(c6426r);
                                        return;
                                    } else if (d == 337) {
                                        m9868d(c6426r);
                                        return;
                                    } else if (d == 338) {
                                        d = C4977b.m9846a(this.f13839e);
                                        int a2 = C4977b.m9846a(this.f13840f);
                                        m9881a(c6426r.f13818a);
                                        if (this.f13842h == 307 || this.f13843j != 0) {
                                            C0818h c0818h = this.f13835a;
                                            final int i6 = c0818h.f13794f;
                                            c0818h.m9718c(1);
                                            c0818h.m9728e(89);
                                            c0818h.m9736i(i6);
                                            c0818h.m9728e(194);
                                            C0836a c49761 = new C0836a(this, this) {
                                                final /* synthetic */ C4977b f13830b;

                                                protected final boolean mo888a(C4954i c4954i, int i) {
                                                    c4954i.m9735h(i6);
                                                    c4954i.m9728e(195);
                                                    return false;
                                                }
                                            };
                                            i6 = c0818h.f2447b;
                                            c6426r = (C6426r) c6426r.f13819b;
                                            if (c6426r != null) {
                                                mo899a(c6426r);
                                            }
                                            i3 = c0818h.f2447b;
                                            if (this.f13837c) {
                                                i2 = 0;
                                            } else {
                                                c49761.mo888a(c0818h, 0);
                                                c0818h.m9728e(167);
                                                i2 = c0818h.f2447b;
                                                c0818h.m9733g(0);
                                            }
                                            if (i6 < i3) {
                                                int i7 = c0818h.f2447b;
                                                c49761.mo888a(c0818h, 0);
                                                c0818h.m9728e(191);
                                                c0818h.m9712b(i6, i3, i7, 0);
                                            }
                                            if (!this.f13837c) {
                                                c0818h.m9719c(i2, (c0818h.f2447b - i2) + 1);
                                            }
                                            c49761.m1946a(this);
                                            if (C4977b.m9846a(this.f13839e) == d) {
                                                if (C4977b.m9846a(this.f13840f) == a2) {
                                                    return;
                                                }
                                            }
                                            throw new C0837c("sorry, cannot break/continue in synchronized block");
                                        }
                                        throw new C0837c("bad type expr for synchronized block");
                                    } else {
                                        this.f13837c = false;
                                        StringBuilder stringBuilder = new StringBuilder("sorry, not supported statement: TokenId ");
                                        stringBuilder.append(d);
                                        throw new C0837c(stringBuilder.toString());
                                    }
                                }
                            }
                            if (d != 302) {
                                z = false;
                            }
                            if (c6426r.f13818a != null) {
                                throw new C0837c("sorry, not support labeled break or continue");
                            }
                            this.f13835a.m9728e(167);
                            Integer num = new Integer(this.f13835a.f2447b);
                            this.f13835a.m9733g(0);
                            if (z) {
                                this.f13839e.add(num);
                                return;
                            } else {
                                this.f13840f.add(num);
                                return;
                            }
                        }
                    }
                    boolean z3 = d == 346;
                    arrayList = this.f13839e;
                    ArrayList arrayList3 = this.f13840f;
                    this.f13839e = new ArrayList();
                    this.f13840f = new ArrayList();
                    c0833b2 = c6426r.f13818a;
                    c6426r = (C6426r) c6426r.f13819b;
                    if (z3) {
                        this.f13835a.m9728e(167);
                        i2 = this.f13835a.f2447b;
                        this.f13835a.m9733g(0);
                        i = i2;
                    }
                    i2 = this.f13835a.f2447b;
                    if (c6426r != null) {
                        mo899a(c6426r);
                    }
                    i3 = this.f13835a.f2447b;
                    if (z3) {
                        this.f13835a.m9719c(i, (i3 - i) + 1);
                    }
                    z3 = m9858a(true, c0833b2);
                    this.f13835a.m9733g((i2 - this.f13835a.f2447b) + 1);
                    m9899a(this.f13839e, this.f13835a.f2447b);
                    m9899a(this.f13840f, i3);
                    this.f13840f = arrayList3;
                    this.f13839e = arrayList;
                    this.f13837c = z3;
                    return;
                }
            }
            while (c4969a != null) {
                c0833b = c4969a.f13818a;
                c4969a = c4969a.f13819b;
                if (c0833b != null) {
                    c0833b.mo885a((C0834v) this);
                }
            }
        }
    }

    public final void m9896a(C6426r c6426r, boolean z, boolean z2) {
        if (c6426r != null) {
            if (z) {
                C4969a c4969a = c6426r.m15293d() == 66 ? (C6426r) c6426r.f13818a : c6426r;
                if (c4969a != null && c4969a.m15293d() == 69) {
                    C0833b c0833b = c4969a.f13818a;
                    if (c0833b != null && (c0833b instanceof C6423k)) {
                        C6423k c6423k = (C6423k) c0833b;
                        if (c6423k.m15278d() == 67) {
                            c0833b = c6423k.f13818a;
                            if (c0833b instanceof C4972n) {
                                int d = ((C4972n) c0833b).m9836d();
                                if (d == 339 || d == 336) {
                                    z = false;
                                    if (z) {
                                        mo2686h();
                                    }
                                }
                            }
                        }
                    }
                }
                z = true;
                if (z) {
                    mo2686h();
                }
            }
            this.f13837c = false;
            mo899a(c6426r);
            if (!this.f13837c) {
                if (z2) {
                    this.f13835a.m9728e(177);
                    this.f13837c = true;
                    return;
                }
                throw new C0837c("no return statement");
            }
        }
    }

    public final void mo900a(C4974s c4974s) {
        this.f13842h = 307;
        this.f13843j = 0;
        this.f13844k = "java/lang/String";
        this.f13835a.m9721c(c4974s.m9842d());
    }

    public final void mo901a(C6427u c6427u) {
        C6422i e = c6427u.m15295e();
        this.f13842h = e.m15269d();
        this.f13843j = e.m15270e();
        this.f13844k = e.m15271f();
        int b = m9859b(e);
        if (this.f13843j > 0) {
            this.f13835a.m9735h(b);
            return;
        }
        int i = this.f13842h;
        if (i == 307) {
            this.f13835a.m9735h(b);
        } else if (i == 312) {
            this.f13835a.m9742o(b);
        } else if (i == 317) {
            this.f13835a.m9744q(b);
        } else if (i != 326) {
            this.f13835a.m9738k(b);
        } else {
            this.f13835a.m9740m(b);
        }
    }

    protected final void m9899a(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            this.f13835a.m9719c(intValue, (i - intValue) + 1);
        }
    }

    public final int m9900b() {
        return this.f13835a.f13794f;
    }

    protected final void m9901b(int i) {
        this.f13835a.m9718c(i);
    }

    protected final void m9902b(C0833b c0833b) {
        int i = 176;
        if (c0833b == null) {
            i = 177;
        } else {
            m9881a(c0833b);
            if (this.f13843j <= 0) {
                int i2 = this.f13842h;
                if (i2 == 312) {
                    i = 175;
                } else if (i2 == 317) {
                    i = 174;
                } else if (i2 == 326) {
                    i = 173;
                } else if (!C4977b.m9869d(i2)) {
                    i = 172;
                }
            }
        }
        for (C0836a c0836a = this.f13841g; c0836a != null; c0836a = c0836a.f2501c) {
            if (c0836a.mo888a(this.f13835a, i)) {
                this.f13837c = true;
                return;
            }
        }
        this.f13835a.m9728e(i);
        this.f13837c = true;
    }

    protected void mo3316b(C6426r c6426r) {
        m9902b(c6426r.mo883a());
    }

    protected void mo2681b(String str) {
        int i = this.f13835a.f2447b;
        this.f13835a.m9721c(str);
        this.f13835a.m9722c("java.lang.Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;");
        int i2 = this.f13835a.f2447b;
        this.f13835a.m9728e(167);
        int i3 = this.f13835a.f2447b;
        this.f13835a.m9733g(0);
        C4954i c4954i = this.f13835a;
        c4954i.m9712b(i, i2, this.f13835a.f2447b, c4954i.f13792d.m1873a("java.lang.ClassNotFoundException"));
        this.f13835a.m9731f(1);
        this.f13835a.m9722c("javassist.runtime.DotClass", "fail", "(Ljava/lang/ClassNotFoundException;)Ljava/lang/NoClassDefFoundError;");
        this.f13835a.m9728e(191);
        this.f13835a.m9719c(i3, (this.f13835a.f2447b - i3) + 1);
    }

    protected abstract String mo2682c();

    protected void mo2683c(C6426r c6426r) {
        this.f13837c = false;
    }

    protected abstract String mo2684d();

    final void m9908d(int i, int i2) {
        if (i != i2) {
            i = C4977b.m9873f(i);
            int i3 = 0;
            i = (i < 0 || i >= 3) ? 0 : f13834p[(i * 4) + C4977b.m9873f(i2)];
            if (i2 == 312) {
                i3 = 135;
            } else if (i2 == 317) {
                i3 = 134;
            } else if (i2 == 326) {
                i3 = 133;
            } else if (i2 == 334) {
                i3 = 147;
            } else if (i2 == 306) {
                i3 = 146;
            } else if (i2 == 303) {
                i3 = 145;
            }
            if (i != 0) {
                this.f13835a.m9728e(i);
            }
            if ((i == 0 || i == 136 || i == 139 || i == 142) && i3 != 0) {
                this.f13835a.m9728e(i3);
            }
        }
    }

    protected abstract void mo2685d(C0833b c0833b);

    public final void mo902e() {
        C4977b.m9849a();
    }

    public final void mo903f() {
        C4977b.m9849a();
    }

    public final void mo904g() {
        C4977b.m9849a();
    }

    protected abstract void mo2686h();
}
