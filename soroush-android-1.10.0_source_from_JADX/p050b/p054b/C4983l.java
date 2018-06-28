package p050b.p054b;

import p050b.p054b.p055a.C0833b;
import p050b.p054b.p055a.C4969a;
import p050b.p054b.p055a.C4970j;
import p050b.p054b.p055a.C4971m;
import p050b.p054b.p055a.C4972n;
import p050b.p054b.p055a.C4973q;
import p050b.p054b.p055a.C4974s;
import p050b.p054b.p055a.C4975t;
import p050b.p054b.p055a.C6419c;
import p050b.p054b.p055a.C6420g;
import p050b.p054b.p055a.C6421h;
import p050b.p054b.p055a.C6422i;
import p050b.p054b.p055a.C6423k;
import p050b.p054b.p055a.C6424o;
import p050b.p054b.p055a.C6425p;
import p050b.p054b.p055a.C6426r;
import p050b.p054b.p055a.C6427u;
import p050b.p054b.p055a.C7029d;
import p050b.p054b.p055a.C7030e;
import p050b.p054b.p055a.C7031f;
import p050b.p054b.p055a.C7032l;

public final class C4983l implements C0844q {
    private static final int[] f13866b = new int[]{0, 0, 0, 0, 1, 6, 0, 0, 0, 1, 2, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 4, 0};
    C4978h f13867a;

    public C4983l(C4978h c4978h) {
        this.f13867a = c4978h;
    }

    private C0833b m9947a(C0833b c0833b, int i) {
        String a = m9952a(c0833b);
        if (i > 0) {
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                int i2 = i - 1;
                if (i <= 0) {
                    break;
                }
                stringBuffer.append('[');
                i = i2;
            }
            stringBuffer.append('L');
            stringBuffer.append(a.replace('.', '/'));
            stringBuffer.append(';');
            a = stringBuffer.toString();
        }
        return C6423k.m15274b(46, new C4975t(a), new C6424o("class"));
    }

    private C0833b m9948a(C0842n c0842n, C0833b c0833b, int i) {
        int a = this.f13867a.m9920a();
        if (a == 323) {
            int a2 = this.f13867a.m9921a(0);
            if (!C4983l.m9954a(a2)) {
                return new C7032l(m9959c(), m9955b(), c0833b);
            }
            this.f13867a.m9920a();
            return new C7032l(a2, m9955b(), c0833b);
        }
        C0833b h = m9965h(c0842n);
        while (true) {
            int b = C4983l.m9956b(this.f13867a.m9921a(0));
            if (b != 0 && i > b) {
                h = m9948a(c0842n, h, b);
            }
        }
        return C7030e.m18154a(a, c0833b, h);
    }

    private C6426r m9949a() {
        C6426r c6426r = new C6426r(this.f13867a.m9920a());
        int a = this.f13867a.m9920a();
        if (a == 400) {
            c6426r.mo884a(new C4975t(this.f13867a.f13848a.f2515e));
            a = this.f13867a.m9920a();
        }
        if (a == 59) {
            return c6426r;
        }
        throw new C0837c("; is missing", this.f13867a);
    }

    private C6426r m9950a(C0842n c0842n, C6422i c6422i) {
        C4969a c4969a = null;
        while (this.f13867a.m9920a() == 400) {
            if (c6422i.m15269d() == 344) {
                break;
            }
            C0833b e;
            String str = this.f13867a.f13848a.f2515e;
            C4975t c4975t = new C4975t(str);
            int b = m9955b();
            if (this.f13867a.m9922b() == 61) {
                this.f13867a.m9920a();
                e = this.f13867a.m9922b() == 123 ? m9962e(c0842n) : m9964g(c0842n);
            } else {
                e = null;
            }
            C0833b a = c6422i.m15263a(c4975t, b, e);
            c0842n.put(str, a);
            C6426r c6426r = (C6426r) C4969a.m9815a(c4969a, new C6426r(68, a));
            int a2 = this.f13867a.m9920a();
            if (a2 == 59) {
                return c6426r;
            }
            if (a2 != 44) {
                throw new C0837c("; is missing", this.f13867a);
            }
        }
        throw new C4984o(this.f13867a);
    }

    private C6426r m9951a(C0842n c0842n, boolean z) {
        C6422i c6422i;
        C4978h c4978h = this.f13867a;
        while (true) {
            int a = c4978h.m9921a(0);
            if (a != 315) {
                break;
            }
            this.f13867a.m9920a();
            c4978h = this.f13867a;
        }
        if (C4983l.m9954a(a)) {
            c6422i = new C6422i(this.f13867a.m9920a(), m9955b());
        } else {
            if (a == 400) {
                a = m9958c(0);
                if (a >= 0 && this.f13867a.m9921a(a) == 400) {
                    c6422i = new C6422i(m9959c(), m9955b());
                }
            }
            C6426r d = z ? m9961d(c0842n) : new C6426r(69, m9964g(c0842n));
            if (this.f13867a.m9920a() == 59) {
                return d;
            }
            throw new C0837c("; is missing", this.f13867a);
        }
        return m9950a(c0842n, c6422i);
    }

    private String m9952a(C0833b c0833b) {
        StringBuffer stringBuffer = new StringBuffer();
        m9953a(c0833b, stringBuffer);
        return stringBuffer.toString();
    }

    private void m9953a(C0833b c0833b, StringBuffer stringBuffer) {
        while (!(c0833b instanceof C4975t)) {
            if (c0833b instanceof C6423k) {
                C6423k c6423k = (C6423k) c0833b;
                if (c6423k.m15278d() == 46) {
                    m9953a(c6423k.mo883a(), stringBuffer);
                    stringBuffer.append('.');
                    c0833b = c6423k.mo886b().mo883a();
                }
            }
            throw new C0837c("bad static member access", this.f13867a);
        }
        stringBuffer.append(((C4975t) c0833b).m9844d());
    }

    private static boolean m9954a(int i) {
        if (!(i == 301 || i == 303 || i == 306 || i == 334 || i == 324 || i == 326 || i == 317)) {
            if (i != 312) {
                return false;
            }
        }
        return true;
    }

    private int m9955b() {
        int i = 0;
        while (this.f13867a.m9921a(0) == 91) {
            i++;
            this.f13867a.m9920a();
            if (this.f13867a.m9920a() != 93) {
                throw new C0837c("] is missing", this.f13867a);
            }
        }
        return i;
    }

    private static int m9956b(int i) {
        if (33 <= i && i <= 63) {
            return f13866b[i - 33];
        }
        if (i == 94) {
            return 7;
        }
        if (i == 124) {
            return 8;
        }
        if (i == 369) {
            return 9;
        }
        if (i == 368) {
            return 10;
        }
        if (i != 358) {
            if (i != 350) {
                if (!(i == 357 || i == 359)) {
                    if (i != 323) {
                        if (!(i == 364 || i == 366)) {
                            if (i != 370) {
                                return 0;
                            }
                        }
                        return 3;
                    }
                }
                return 4;
            }
        }
        return 5;
    }

    private C6426r m9957b(C0842n c0842n) {
        if (this.f13867a.m9920a() != 123) {
            throw new C4984o(this.f13867a);
        }
        C4969a c4969a = null;
        C0842n c0842n2 = new C0842n(c0842n);
        while (this.f13867a.m9921a(0) != 125) {
            C0833b a = m9970a(c0842n2);
            if (a != null) {
                c4969a = (C6426r) C4969a.m9815a(c4969a, new C6426r(66, a));
            }
        }
        this.f13867a.m9920a();
        return c4969a == null ? new C6426r(66) : c4969a;
    }

    private int m9958c(int i) {
        do {
            i++;
            if (this.f13867a.m9921a(i) == 46) {
                i++;
            } else {
                while (true) {
                    int i2 = i + 1;
                    if (this.f13867a.m9921a(i) != 91) {
                        return i2 - 1;
                    }
                    int i3 = i2 + 1;
                    if (this.f13867a.m9921a(i2) != 93) {
                        return -1;
                    }
                    i = i3;
                }
            }
        } while (this.f13867a.m9921a(i) == 400);
        return -1;
    }

    private C4969a m9959c() {
        C4969a c4969a = null;
        while (this.f13867a.m9920a() == 400) {
            c4969a = C4969a.m9816a(c4969a, new C4975t(this.f13867a.f13848a.f2515e));
            if (this.f13867a.m9921a(0) != 46) {
                return c4969a;
            }
            this.f13867a.m9920a();
        }
        throw new C4984o(this.f13867a);
    }

    private C6426r m9960c(C0842n c0842n) {
        int a = this.f13867a.m9921a(0);
        if (a != 304 && a != 310) {
            return m9970a(c0842n);
        }
        this.f13867a.m9920a();
        C6426r c6426r = a == 304 ? new C6426r(a, m9964g(c0842n)) : new C6426r(310);
        if (this.f13867a.m9920a() == 58) {
            return c6426r;
        }
        throw new C0837c(": is missing", this.f13867a);
    }

    private C6426r m9961d(C0842n c0842n) {
        C4969a c4969a = null;
        while (true) {
            C6426r c6426r = (C6426r) C4969a.m9815a(c4969a, new C6426r(66, new C6426r(69, m9964g(c0842n))));
            if (this.f13867a.m9921a(0) != 44) {
                return c6426r;
            }
            this.f13867a.m9920a();
        }
    }

    private C6419c m9962e(C0842n c0842n) {
        this.f13867a.m9920a();
        C4969a c6419c = new C6419c(m9964g(c0842n));
        while (this.f13867a.m9921a(0) == 44) {
            this.f13867a.m9920a();
            C4969a.m9816a(c6419c, m9964g(c0842n));
        }
        if (this.f13867a.m9920a() == 125) {
            return c6419c;
        }
        throw new C4984o(this.f13867a);
    }

    private C0833b m9963f(C0842n c0842n) {
        if (this.f13867a.m9920a() != 40) {
            throw new C4984o(this.f13867a);
        }
        C0833b g = m9964g(c0842n);
        if (this.f13867a.m9920a() == 41) {
            return g;
        }
        throw new C4984o(this.f13867a);
    }

    private C0833b m9964g(C0842n c0842n) {
        int i;
        int b;
        C0833b h = m9965h(c0842n);
        while (true) {
            i = 0;
            b = C4983l.m9956b(this.f13867a.m9921a(0));
            if (b == 0) {
                break;
            }
            h = m9948a(c0842n, h, b);
        }
        if (this.f13867a.m9921a(0) == 63) {
            this.f13867a.m9920a();
            C0833b g = m9964g(c0842n);
            if (this.f13867a.m9920a() != 58) {
                throw new C0837c(": is missing", this.f13867a);
            }
            h = new C6421h(h, g, m9964g(c0842n));
        }
        b = this.f13867a.m9921a(0);
        if (b == 61 || b == 351 || b == 352 || b == 353 || b == 354 || b == 355 || b == 356 || b == 360 || b == 361 || b == 365 || b == 367 || b == 371) {
            i = 1;
        }
        return i == 0 ? h : C7029d.m18152a(this.f13867a.m9920a(), h, m9964g(c0842n));
    }

    private C0833b m9965h(C0842n c0842n) {
        int i = 0;
        int a = this.f13867a.m9921a(0);
        if (a != 33) {
            if (a == 40) {
                a = this.f13867a.m9921a(1);
                if (C4983l.m9954a(a)) {
                    int i2;
                    int i3 = 2;
                    while (true) {
                        i2 = i3 + 1;
                        if (this.f13867a.m9921a(i3) != 91) {
                            break;
                        }
                        int i4 = i2 + 1;
                        if (this.f13867a.m9921a(i2) != 93) {
                            break;
                        }
                        i3 = i4;
                        i3 = 0;
                        if (i3 != 0) {
                            this.f13867a.m9920a();
                            this.f13867a.m9920a();
                            i = m9955b();
                            if (this.f13867a.m9920a() != 41) {
                                return new C6420g(a, i, m9965h(c0842n));
                            }
                            throw new C0837c(") is missing", this.f13867a);
                        }
                    }
                    if (this.f13867a.m9921a(i2 - 1) == 41) {
                        i3 = 1;
                        if (i3 != 0) {
                            this.f13867a.m9920a();
                            this.f13867a.m9920a();
                            i = m9955b();
                            if (this.f13867a.m9920a() != 41) {
                                return new C6420g(a, i, m9965h(c0842n));
                            }
                            throw new C0837c(") is missing", this.f13867a);
                        }
                    }
                    i3 = 0;
                    if (i3 != 0) {
                        this.f13867a.m9920a();
                        this.f13867a.m9920a();
                        i = m9955b();
                        if (this.f13867a.m9920a() != 41) {
                            return new C6420g(a, i, m9965h(c0842n));
                        }
                        throw new C0837c(") is missing", this.f13867a);
                    }
                }
                if (a == 400) {
                    a = m9958c(1);
                    if (a >= 0 && this.f13867a.m9921a(a) == 41) {
                        a = this.f13867a.m9921a(a + 1);
                        if (a == 40 || a == 412 || a == 406 || a == 400 || a == 339 || a == 336 || a == 328 || a == 410 || a == 411 || a == 403 || a == 402 || a == 401 || a == 405 || a == 404) {
                            i = 1;
                        }
                    }
                    if (i != 0) {
                        this.f13867a.m9920a();
                        C4969a c = m9959c();
                        i = m9955b();
                        if (this.f13867a.m9920a() == 41) {
                            return new C6420g(c, i, m9965h(c0842n));
                        }
                        throw new C0837c(") is missing", this.f13867a);
                    }
                }
                return m9966i(c0842n);
            } else if (!(a == 43 || a == 45 || a == 126)) {
                switch (a) {
                    case 362:
                    case 363:
                        break;
                    default:
                        return m9966i(c0842n);
                }
            }
        }
        a = this.f13867a.m9920a();
        if (a == 45) {
            i = this.f13867a.m9921a(0);
            switch (i) {
                case 401:
                case 402:
                case 403:
                    this.f13867a.m9920a();
                    return new C4971m(-this.f13867a.f13848a.f2513c, i);
                case 404:
                case 405:
                    this.f13867a.m9920a();
                    return new C4970j(-this.f13867a.f13848a.f2514d, i);
                default:
                    break;
            }
        }
        return C6423k.m15273a(a, m9965h(c0842n));
    }

    private C0833b m9966i(C0842n c0842n) {
        int a = this.f13867a.m9921a(0);
        switch (a) {
            case 401:
            case 402:
            case 403:
                this.f13867a.m9920a();
                return new C4971m(this.f13867a.f13848a.f2513c, a);
            case 404:
            case 405:
                this.f13867a.m9920a();
                return new C4970j(this.f13867a.f13848a.f2514d, a);
            default:
                C0833b g;
                C0833b c6424o;
                int b;
                a = this.f13867a.m9920a();
                if (a == 40) {
                    g = m9964g(c0842n);
                    if (this.f13867a.m9920a() != 41) {
                        throw new C0837c(") is missing", this.f13867a);
                    }
                } else if (a != 328) {
                    if (!(a == 336 || a == 339)) {
                        String str;
                        if (a == 400) {
                            str = this.f13867a.f13848a.f2515e;
                            C0842n c0842n2 = c0842n;
                            while (true) {
                                C6422i c6422i = (C6422i) c0842n2.get(str);
                                if (c6422i != null || c0842n2.f2510a == null) {
                                    c6424o = c6422i == null ? new C6424o(str) : new C6427u(str, c6422i);
                                    g = c6424o;
                                } else {
                                    c0842n2 = c0842n2.f2510a;
                                }
                            }
                        } else if (a != 406) {
                            switch (a) {
                                case 410:
                                case 411:
                                case 412:
                                    break;
                                default:
                                    if (C4983l.m9954a(a) || a == 344) {
                                        b = m9955b();
                                        if (this.f13867a.m9920a() == 46 && this.f13867a.m9920a() == 307) {
                                            if (b <= 0) {
                                                if (a == 301) {
                                                    str = "java.lang.Boolean";
                                                } else if (a == 303) {
                                                    str = "java.lang.Byte";
                                                } else if (a == 306) {
                                                    str = "java.lang.Character";
                                                } else if (a == 312) {
                                                    str = "java.lang.Double";
                                                } else if (a == 317) {
                                                    str = "java.lang.Float";
                                                } else if (a == 324) {
                                                    str = "java.lang.Integer";
                                                } else if (a == 326) {
                                                    str = "java.lang.Long";
                                                } else if (a == 334) {
                                                    str = "java.lang.Short";
                                                } else if (a != 344) {
                                                    StringBuilder stringBuilder = new StringBuilder("invalid builtin type: ");
                                                    stringBuilder.append(a);
                                                    throw new C0837c(stringBuilder.toString());
                                                } else {
                                                    str = "java.lang.Void";
                                                }
                                                g = C6423k.m15274b(35, new C4975t(str), new C6424o("TYPE"));
                                                break;
                                            }
                                            g = C6423k.m15274b(46, new C4975t(C4977b.m9860b(a, b)), new C6424o("class"));
                                            break;
                                        }
                                    }
                                    throw new C4984o(this.f13867a);
                            }
                        } else {
                            g = new C4974s(this.f13867a.f13848a.f2515e);
                        }
                    }
                    c6424o = new C4972n(a);
                    g = c6424o;
                } else {
                    a = this.f13867a.m9921a(0);
                    if (C4983l.m9954a(a)) {
                        this.f13867a.m9920a();
                        g = new C6425p(a, m9967j(c0842n), this.f13867a.m9921a(0) == 123 ? m9962e(c0842n) : null);
                    } else {
                        if (a == 400) {
                            C4969a c = m9959c();
                            b = this.f13867a.m9921a(0);
                            if (b == 40) {
                                g = new C6425p(c, m9969l(c0842n));
                            } else if (b == 91) {
                                g = C6425p.m15282a(c, m9967j(c0842n), this.f13867a.m9921a(0) == 123 ? m9962e(c0842n) : null);
                            }
                        }
                        throw new C4984o(this.f13867a);
                    }
                }
                while (true) {
                    b = this.f13867a.m9922b();
                    if (b == 35) {
                        this.f13867a.m9920a();
                        if (this.f13867a.m9920a() != 400) {
                            throw new C0837c("missing static member name", this.f13867a);
                        }
                        g = C6423k.m15274b(35, new C4975t(m9952a(g)), new C6424o(this.f13867a.f13848a.f2515e));
                    } else if (b == 40) {
                        if (g instanceof C4972n) {
                            b = ((C4972n) g).m9836d();
                            if (!(b == 339 || b == 336)) {
                                throw new C4984o(this.f13867a);
                            }
                        } else if (!(g instanceof C4975t) && (g instanceof C6423k)) {
                            b = ((C6423k) g).m15278d();
                            if (!(b == 46 || b == 35)) {
                                throw new C4984o(this.f13867a);
                            }
                        }
                        g = C7031f.m18156a(g, m9969l(c0842n));
                    } else if (b == 46) {
                        this.f13867a.m9920a();
                        b = this.f13867a.m9920a();
                        if (b == 307) {
                            g = m9947a(g, 0);
                        } else if (b == 400) {
                            g = C6423k.m15274b(46, g, new C6424o(this.f13867a.f13848a.f2515e));
                        } else {
                            throw new C0837c("missing member name", this.f13867a);
                        }
                    } else if (b != 91) {
                        switch (b) {
                            case 362:
                            case 363:
                                g = C6423k.m15274b(this.f13867a.m9920a(), null, g);
                                break;
                            default:
                                return g;
                        }
                    } else if (this.f13867a.m9921a(1) == 93) {
                        b = m9955b();
                        if (this.f13867a.m9920a() == 46) {
                            if (this.f13867a.m9920a() == 307) {
                                g = m9947a(g, b);
                            }
                        }
                        throw new C4984o(this.f13867a);
                    } else {
                        c6424o = m9968k(c0842n);
                        if (c6424o == null) {
                            throw new C4984o(this.f13867a);
                        }
                        g = C6423k.m15274b(65, g, c6424o);
                    }
                }
                break;
        }
    }

    private C4969a m9967j(C0842n c0842n) {
        C4969a c4969a = null;
        while (this.f13867a.m9921a(0) == 91) {
            c4969a = C4969a.m9816a(c4969a, m9968k(c0842n));
        }
        return c4969a;
    }

    private C0833b m9968k(C0842n c0842n) {
        this.f13867a.m9920a();
        if (this.f13867a.m9921a(0) == 93) {
            this.f13867a.m9920a();
            return null;
        }
        C0833b g = m9964g(c0842n);
        if (this.f13867a.m9920a() == 93) {
            return g;
        }
        throw new C0837c("] is missing", this.f13867a);
    }

    private C4969a m9969l(C0842n c0842n) {
        if (this.f13867a.m9920a() != 40) {
            throw new C0837c("( is missing", this.f13867a);
        }
        C4969a c4969a = null;
        if (this.f13867a.m9921a(0) != 41) {
            while (true) {
                c4969a = C4969a.m9816a(c4969a, m9964g(c0842n));
                if (this.f13867a.m9921a(0) != 44) {
                    break;
                }
                this.f13867a.m9920a();
            }
        }
        if (this.f13867a.m9920a() == 41) {
            return c4969a;
        }
        throw new C0837c(") is missing", this.f13867a);
    }

    public final C6426r m9970a(C0842n c0842n) {
        int a = this.f13867a.m9921a(0);
        if (a == 123) {
            return m9957b(c0842n);
        }
        if (a == 59) {
            this.f13867a.m9920a();
            return new C6426r(66);
        } else if (a == 400 && this.f13867a.m9921a(1) == 58) {
            this.f13867a.m9920a();
            String str = this.f13867a.f13848a.f2515e;
            this.f13867a.m9920a();
            return C6426r.m15289a(new C4975t(str), m9970a(c0842n));
        } else {
            C0833b c0833b = null;
            C0833b a2;
            if (a == 320) {
                a = this.f13867a.m9920a();
                C0833b f = m9963f(c0842n);
                a2 = m9970a(c0842n);
                if (this.f13867a.m9921a(0) == 313) {
                    this.f13867a.m9920a();
                    c0833b = m9970a(c0842n);
                }
                return new C6426r(a, f, new C4969a(a2, new C4969a(c0833b)));
            } else if (a == 346) {
                return new C6426r(this.f13867a.m9920a(), m9963f(c0842n), m9970a(c0842n));
            } else {
                C0833b g;
                if (a == 311) {
                    a = this.f13867a.m9920a();
                    C4969a a3 = m9970a(c0842n);
                    if (this.f13867a.m9920a() == 346) {
                        if (this.f13867a.m9920a() == 40) {
                            g = m9964g(c0842n);
                            if (this.f13867a.m9920a() == 41) {
                                if (this.f13867a.m9920a() == 59) {
                                    return new C6426r(a, g, a3);
                                }
                            }
                            throw new C4984o(this.f13867a);
                        }
                    }
                    throw new C4984o(this.f13867a);
                } else if (a == 318) {
                    a = this.f13867a.m9920a();
                    r2 = new C0842n(c0842n);
                    if (this.f13867a.m9920a() != 40) {
                        throw new C4984o(this.f13867a);
                    }
                    if (this.f13867a.m9921a(0) == 59) {
                        this.f13867a.m9920a();
                        g = null;
                    } else {
                        g = m9951a(r2, true);
                    }
                    a2 = this.f13867a.m9921a(0) == 59 ? null : m9964g(r2);
                    if (this.f13867a.m9920a() != 59) {
                        throw new C0837c("; is missing", this.f13867a);
                    }
                    if (this.f13867a.m9921a(0) != 41) {
                        c0833b = m9961d(r2);
                    }
                    if (this.f13867a.m9920a() == 41) {
                        return new C6426r(a, g, new C4969a(a2, new C4969a(c0833b, m9970a(r2))));
                    }
                    throw new C0837c(") is missing", this.f13867a);
                } else if (a == 343) {
                    this.f13867a.m9920a();
                    C0833b b = m9957b(c0842n);
                    C4969a c4969a = null;
                    while (this.f13867a.m9921a(0) == 305) {
                        this.f13867a.m9920a();
                        if (this.f13867a.m9920a() != 40) {
                            throw new C4984o(this.f13867a);
                        }
                        C0833b c6422i;
                        String str2;
                        C0842n c0842n2 = new C0842n(c0842n);
                        int a4 = this.f13867a.m9921a(0);
                        if (!C4983l.m9954a(a4)) {
                            if (a4 != 344) {
                                c6422i = new C6422i(m9959c(), m9955b());
                                if (this.f13867a.m9920a() == 400) {
                                    throw new C4984o(this.f13867a);
                                }
                                str2 = this.f13867a.f13848a.f2515e;
                                c6422i.mo884a(new C4975t(str2));
                                c6422i.m15264a(m9955b());
                                c0842n2.put(str2, c6422i);
                                if (c6422i.m15270e() > 0) {
                                    if (c6422i.m15269d() != 307) {
                                        if (this.f13867a.m9920a() == 41) {
                                            throw new C4984o(this.f13867a);
                                        }
                                        c4969a = C4969a.m9816a(c4969a, new C4973q(c6422i, m9957b(c0842n2)));
                                    }
                                }
                                throw new C4984o(this.f13867a);
                            }
                        }
                        this.f13867a.m9920a();
                        c6422i = new C6422i(a4, m9955b());
                        if (this.f13867a.m9920a() == 400) {
                            str2 = this.f13867a.f13848a.f2515e;
                            c6422i.mo884a(new C4975t(str2));
                            c6422i.m15264a(m9955b());
                            c0842n2.put(str2, c6422i);
                            if (c6422i.m15270e() > 0) {
                                if (c6422i.m15269d() != 307) {
                                    if (this.f13867a.m9920a() == 41) {
                                        c4969a = C4969a.m9816a(c4969a, new C4973q(c6422i, m9957b(c0842n2)));
                                    } else {
                                        throw new C4984o(this.f13867a);
                                    }
                                }
                            }
                            throw new C4984o(this.f13867a);
                        }
                        throw new C4984o(this.f13867a);
                    }
                    if (this.f13867a.m9921a(0) == 316) {
                        this.f13867a.m9920a();
                        c0833b = m9957b(c0842n);
                    }
                    return C6426r.m15290b(b, c4969a, c0833b);
                } else if (a == 337) {
                    a = this.f13867a.m9920a();
                    C0833b f2 = m9963f(c0842n);
                    if (this.f13867a.m9920a() != 123) {
                        throw new C4984o(this.f13867a);
                    }
                    r2 = new C0842n(c0842n);
                    C4969a c = m9960c(r2);
                    if (c == null) {
                        throw new C0837c("empty switch block", this.f13867a);
                    }
                    int d = c.m15293d();
                    if (d == 304 || d == 310) {
                        C4969a c6426r = new C6426r(66, c);
                        while (this.f13867a.m9921a(0) != 125) {
                            c0833b = m9960c(r2);
                            if (c0833b != null) {
                                int d2 = c0833b.m15293d();
                                if (d2 != 304) {
                                    if (d2 != 310) {
                                        c = (C6426r) C4969a.m9815a(c, new C6426r(66, c0833b));
                                    }
                                }
                                c6426r = (C6426r) C4969a.m9815a(c6426r, new C6426r(66, c0833b));
                                c = c0833b;
                            }
                        }
                        this.f13867a.m9920a();
                        return new C6426r(a, f2, c6426r);
                    }
                    throw new C0837c("no case or default in a switch block", this.f13867a);
                } else if (a == 338) {
                    a = this.f13867a.m9920a();
                    if (this.f13867a.m9920a() != 40) {
                        throw new C4984o(this.f13867a);
                    }
                    C0833b g2 = m9964g(c0842n);
                    if (this.f13867a.m9920a() == 41) {
                        return new C6426r(a, g2, m9957b(c0842n));
                    }
                    throw new C4984o(this.f13867a);
                } else if (a == 333) {
                    C6426r c6426r2 = new C6426r(this.f13867a.m9920a());
                    if (this.f13867a.m9921a(0) != 59) {
                        c6426r2.mo884a(m9964g(c0842n));
                    }
                    if (this.f13867a.m9920a() == 59) {
                        return c6426r2;
                    }
                    throw new C0837c("; is missing", this.f13867a);
                } else if (a != 340) {
                    return a == 302 ? m9949a() : a == 309 ? m9949a() : m9951a(c0842n, false);
                } else {
                    a = this.f13867a.m9920a();
                    g = m9964g(c0842n);
                    if (this.f13867a.m9920a() == 59) {
                        return new C6426r(a, g);
                    }
                    throw new C0837c("; is missing", this.f13867a);
                }
            }
        }
    }
}
