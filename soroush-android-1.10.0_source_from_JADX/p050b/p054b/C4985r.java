package p050b.p054b;

import p050b.C0848e;
import p050b.C0851i;
import p050b.C4990l;
import p050b.p051a.an;
import p050b.p051a.ar;
import p050b.p054b.C4981j.C0840a;
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
import p050b.p054b.p055a.C6424o;
import p050b.p054b.p055a.C6425p;
import p050b.p054b.p055a.C6427u;
import p050b.p054b.p055a.C7029d;
import p050b.p054b.p055a.C7030e;
import p050b.p054b.p055a.C7031f;
import p050b.p054b.p055a.C7032l;

public class C4985r extends C0834v implements ar, C0844q {
    protected int f13868a;
    protected int f13869b;
    protected String f13870c;
    protected C4981j f13871d;
    protected C0851i f13872e;
    protected an f13873f = null;

    public C4985r(C0851i c0851i, C0848e c0848e) {
        this.f13871d = new C4981j(c0848e);
        this.f13872e = c0851i;
    }

    static C0833b m9971a(C0833b c0833b) {
        if (c0833b instanceof C7030e) {
            C7030e c7030e = (C7030e) c0833b;
            if (c7030e.m15278d() == 43 && c7030e.mo886b().mo883a() == null) {
                return c7030e.mo883a();
            }
        } else if (c0833b instanceof C6423k) {
            C6423k c6423k = (C6423k) c0833b;
            int d = c6423k.m15278d();
            if (d == 35) {
                r0 = C4985r.m9972a(((C6424o) c6423k.mo886b().mo883a()).f17580a);
                if (r0 != null) {
                    return r0;
                }
            } else if (d == 43 && c6423k.mo886b() == null) {
                return c6423k.mo883a();
            }
        } else if (c0833b instanceof C6424o) {
            r0 = C4985r.m9972a(((C6424o) c0833b).f17580a);
            if (r0 != null) {
                return r0;
            }
        }
        return c0833b;
    }

    public static C0833b m9972a(C4990l c4990l) {
        C0833b c0833b = null;
        if (c4990l == null) {
            return null;
        }
        Object f = c4990l.m10066f();
        if (f == null) {
            return null;
        }
        if (f instanceof String) {
            return new C4974s((String) f);
        }
        boolean z = f instanceof Double;
        if (!z) {
            if (!(f instanceof Float)) {
                if (f instanceof Number) {
                    return new C4971m(((Number) f).longValue(), f instanceof Long ? 403 : 402);
                }
                if (f instanceof Boolean) {
                    c0833b = new C4972n(((Boolean) f).booleanValue() ? 410 : 411);
                }
                return c0833b;
            }
        }
        return new C4970j(((Number) f).doubleValue(), z ? 405 : 404);
    }

    private static C6423k m9973a(C0833b c0833b, C0833b c0833b2) {
        return C7031f.m18156a(C6423k.m15274b(46, c0833b, new C6424o("append")), new C4969a(c0833b2));
    }

    private C0840a m9974a(C0851i c0851i, String str, C4969a c4969a) {
        int a = mo2673a(c4969a);
        int[] iArr = new int[a];
        int[] iArr2 = new int[a];
        String[] strArr = new String[a];
        mo2674a(c4969a, iArr, iArr2, strArr);
        C0840a a2 = this.f13871d.m9938a(c0851i, this.f13872e, this.f13873f, str, iArr, iArr2, strArr);
        if (a2 == null) {
            String m = c0851i.m1999m();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('(');
            int length = iArr.length;
            if (length > 0) {
                int i = 0;
                while (true) {
                    C4985r.m9976a(stringBuffer, iArr[i], iArr2[i], strArr[i]);
                    i++;
                    if (i >= length) {
                        break;
                    }
                    stringBuffer.append(',');
                }
            }
            stringBuffer.append(')');
            String stringBuffer2 = stringBuffer.toString();
            if (str.equals("<init>")) {
                StringBuilder stringBuilder = new StringBuilder("cannot find constructor ");
                stringBuilder.append(m);
                stringBuilder.append(stringBuffer2);
                m = stringBuilder.toString();
            } else {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str);
                stringBuilder2.append(stringBuffer2);
                stringBuilder2.append(" not found in ");
                stringBuilder2.append(m);
                m = stringBuilder2.toString();
            }
            throw new C0837c(m);
        }
        m9979a(a2.f2508b.m1750d());
        return a2;
    }

    private C4990l m9975a(C6423k c6423k, String str) {
        C4975t c4975t = (C6424o) c6423k.mo886b().mo883a();
        C4990l a = this.f13871d.m9944a(str, c4975t, (C0833b) c6423k);
        c6423k.m15275a(35);
        c6423k.mo884a(new C4975t(C4981j.m9936c(str)));
        c4975t.f17580a = a;
        return a;
    }

    private static java.lang.StringBuffer m9976a(java.lang.StringBuffer r1, int r2, int r3, java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 307; // 0x133 float:4.3E-43 double:1.517E-321;
        if (r2 != r0) goto L_0x0009;
    L_0x0004:
        r2 = p050b.p054b.C4981j.m9936c(r4);
        goto L_0x0017;
    L_0x0009:
        r4 = 412; // 0x19c float:5.77E-43 double:2.036E-321;
        if (r2 != r4) goto L_0x0010;
    L_0x000d:
        r2 = "Object";
        goto L_0x0017;
    L_0x0010:
        r2 = p050b.p054b.C4981j.m9931a(r2);	 Catch:{ c -> 0x0015 }
        goto L_0x0017;
    L_0x0015:
        r2 = "?";
    L_0x0017:
        r1.append(r2);
    L_0x001a:
        r2 = r3 + -1;
        if (r3 <= 0) goto L_0x0025;
    L_0x001e:
        r3 = "[]";
        r1.append(r3);
        r3 = r2;
        goto L_0x001a;
    L_0x0025:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.r.a(java.lang.StringBuffer, int, int, java.lang.String):java.lang.StringBuffer");
    }

    private static void m9977a() {
        throw new C0837c("fatal");
    }

    private void m9978a(C7030e c7030e, int i, int i2) {
        int i3 = this.f13868a;
        if (!(i == 364 || i == 366)) {
            if (i != 370) {
                m9986b(c7030e, i2, i3);
                if (C4977b.m9872e(this.f13868a)) {
                    this.f13868a = 324;
                }
            }
        }
        this.f13868a = i2;
        if (C4977b.m9872e(this.f13868a)) {
            this.f13868a = 324;
        }
    }

    private void m9979a(String str) {
        int indexOf = str.indexOf(41);
        if (indexOf < 0) {
            C4985r.m9983b();
        }
        indexOf++;
        char charAt = str.charAt(indexOf);
        int i = 0;
        while (charAt == '[') {
            i++;
            indexOf++;
            charAt = str.charAt(indexOf);
        }
        this.f13869b = i;
        if (charAt == 'L') {
            indexOf++;
            int indexOf2 = str.indexOf(59, indexOf);
            if (indexOf2 < 0) {
                C4985r.m9983b();
            }
            this.f13868a = 307;
            str = str.substring(indexOf, indexOf2);
        } else {
            this.f13868a = C4981j.m9927a(charAt);
            str = null;
        }
        this.f13870c = str;
    }

    private boolean m9980a(C7030e c7030e, int i, C0833b c0833b, C0833b c0833b2) {
        C0833b c4974s;
        c0833b = C4985r.m9971a(c0833b);
        c0833b2 = C4985r.m9971a(c0833b2);
        C0833b c0833b3 = null;
        if ((c0833b instanceof C4974s) && (c0833b2 instanceof C4974s) && i == 43) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(((C4974s) c0833b).m9842d());
            stringBuilder.append(((C4974s) c0833b2).m9842d());
            c4974s = new C4974s(stringBuilder.toString());
        } else if (c0833b instanceof C4971m) {
            C4971m c4971m = (C4971m) c0833b;
            if (c0833b2 instanceof C4971m) {
                c4974s = c4971m.m9830a(i, (C4971m) c0833b2);
            } else {
                if (c0833b2 instanceof C4970j) {
                    c4974s = c4971m.m9829a(i, (C4970j) c0833b2);
                }
                if (c0833b3 != null) {
                    return false;
                }
                c7030e.m15275a(43);
                c7030e.mo884a(c0833b3);
                c7030e.m15279e();
                c0833b3.mo885a((C0834v) this);
                return true;
            }
        } else {
            if (c0833b instanceof C4970j) {
                C4970j c4970j = (C4970j) c0833b;
                if (c0833b2 instanceof C4971m) {
                    c4974s = c4970j.m9824a(i, (C4971m) c0833b2);
                } else if (c0833b2 instanceof C4970j) {
                    c4974s = c4970j.m9823a(i, (C4970j) c0833b2);
                }
            }
            if (c0833b3 != null) {
                return false;
            }
            c7030e.m15275a(43);
            c7030e.mo884a(c0833b3);
            c7030e.m15279e();
            c0833b3.mo885a((C0834v) this);
            return true;
        }
        c0833b3 = c4974s;
        if (c0833b3 != null) {
            return false;
        }
        c7030e.m15275a(43);
        c7030e.mo884a(c0833b3);
        c7030e.m15279e();
        c0833b3.mo885a((C0834v) this);
        return true;
    }

    private C6423k m9981b(C7030e c7030e) {
        C0833b a = c7030e.mo883a();
        C0833b a2 = c7030e.mo886b().mo883a();
        if (a2 == null) {
            a.mo885a((C0834v) this);
            return null;
        }
        C0833b b;
        int i = ((a instanceof C7030e) && ((C7030e) a).m15278d() == 43) ? 1 : 0;
        if (i != 0) {
            b = m9981b((C7030e) a);
            if (b != null) {
                a2.mo885a((C0834v) this);
                this.f13868a = 307;
                this.f13869b = 0;
                this.f13870c = "java/lang/StringBuffer";
                return C4985r.m9973a(b, a2);
            }
        }
        a.mo885a((C0834v) this);
        i = this.f13868a;
        int i2 = this.f13869b;
        String str = this.f13870c;
        a2.mo885a((C0834v) this);
        if (m9980a(c7030e, 43, a, a2)) {
            return null;
        }
        if ((i == 307 && i2 == 0 && "java/lang/String".equals(str)) || (this.f13868a == 307 && this.f13869b == 0 && "java/lang/String".equals(this.f13870c))) {
            b = new C6425p(C4969a.m9817a(new C4975t("java"), new C4975t("lang"), new C4975t("StringBuffer")), null);
            this.f13868a = 307;
            this.f13869b = 0;
            this.f13870c = "java/lang/StringBuffer";
            return C4985r.m9973a(C4985r.m9973a(b, a), a2);
        }
        m9978a(c7030e, 43, i);
        return null;
    }

    private String m9982b(C4969a c4969a) {
        return this.f13871d.m9946b(c4969a);
    }

    private static void m9983b() {
        throw new C0837c("bad method");
    }

    private void m9984b(C0833b c0833b) {
        int c = C4977b.m9864c(c0833b);
        C7030e c7030e;
        if (c == 358) {
            c7030e = (C7030e) c0833b;
            c7030e.mo883a().mo885a((C0834v) this);
            c = this.f13868a;
            int i = this.f13869b;
            c7030e.mo886b().mo883a().mo885a((C0834v) this);
            if (i == 0 && this.f13869b == 0) {
                m9986b(c7030e, c, this.f13868a);
            }
        } else {
            if (c == 33) {
                c0833b = ((C6423k) c0833b).mo883a();
            } else if (c == 369 || c == 368) {
                c7030e = (C7030e) c0833b;
                c7030e.mo883a().mo885a((C0834v) this);
                c0833b = c7030e.mo886b().mo883a();
            }
            c0833b.mo885a((C0834v) this);
        }
        this.f13868a = 301;
        this.f13869b = 0;
    }

    private void m9985b(C0833b c0833b, C0833b c0833b2) {
        c0833b.mo885a((C0834v) this);
        int i = this.f13868a;
        int i2 = this.f13869b;
        String str = this.f13870c;
        c0833b2.mo885a((C0834v) this);
        this.f13868a = i;
        this.f13869b = i2 - 1;
        this.f13870c = str;
    }

    private void m9986b(C7030e c7030e, int i, int i2) {
        if (C4977b.m9866c(i, i2)) {
            c7030e.mo884a(new C6420g(i2, 0, c7030e.mo883a()));
        } else {
            this.f13868a = i;
        }
    }

    private void m9987b(C4990l c4990l) {
        String b = c4990l.m10060a().m1914b();
        int i = 0;
        char charAt = b.charAt(0);
        int i2 = 0;
        while (charAt == '[') {
            i++;
            i2++;
            charAt = b.charAt(i2);
        }
        this.f13869b = i;
        this.f13868a = C4981j.m9927a(charAt);
        if (charAt == 'L') {
            i2++;
            b = b.substring(i2, b.indexOf(59, i2));
        } else {
            b = null;
        }
        this.f13870c = b;
    }

    private void m9988c() {
        this.f13868a = 307;
        this.f13869b = 0;
        this.f13870c = "java/lang/Class";
    }

    private void m9989c(C0833b c0833b) {
        m9987b(m9990d(c0833b));
    }

    private p050b.C4990l m9990d(p050b.p054b.p055a.C0833b r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r5 instanceof p050b.p054b.p055a.C6424o;
        if (r0 == 0) goto L_0x0024;
    L_0x0004:
        r0 = r5;
        r0 = (p050b.p054b.p055a.C6424o) r0;
        r1 = r0.m9844d();
        r2 = r4.f13872e;	 Catch:{ w -> 0x001e }
        r2 = r2.mo921a(r1);	 Catch:{ w -> 0x001e }
        r3 = r2.mo919b();	 Catch:{ w -> 0x001e }
        r3 = p050b.C0857v.m2017a(r3);	 Catch:{ w -> 0x001e }
        if (r3 == 0) goto L_0x001d;	 Catch:{ w -> 0x001e }
    L_0x001b:
        r0.f17580a = r2;	 Catch:{ w -> 0x001e }
    L_0x001d:
        return r2;
    L_0x001e:
        r0 = new b.b.k;
        r0.<init>(r1, r5);
        throw r0;
    L_0x0024:
        r0 = r5 instanceof p050b.p054b.p055a.C6423k;
        if (r0 == 0) goto L_0x00a0;
    L_0x0028:
        r5 = (p050b.p054b.p055a.C6423k) r5;
        r0 = r5.m15278d();
        r1 = 35;
        if (r0 != r1) goto L_0x004f;
    L_0x0032:
        r0 = r5.mo886b();
        r0 = r0.mo883a();
        r0 = (p050b.p054b.p055a.C6424o) r0;
        r1 = r4.f13871d;
        r5 = r5.mo883a();
        r5 = (p050b.p054b.p055a.C4975t) r5;
        r5 = r5.m9844d();
        r5 = r1.m9945b(r5, r0);
        r0.f17580a = r5;
        return r5;
    L_0x004f:
        r1 = 46;
        if (r0 != r1) goto L_0x00a0;
    L_0x0053:
        r0 = r5.mo883a();	 Catch:{ k -> 0x008f }
        r0.mo885a(r4);	 Catch:{ k -> 0x008f }
        r0 = 0;
        r1 = r4.f13868a;	 Catch:{ c -> 0x0078 }
        r2 = 307; // 0x133 float:4.3E-43 double:1.517E-321;	 Catch:{ c -> 0x0078 }
        if (r1 != r2) goto L_0x0079;	 Catch:{ c -> 0x0078 }
    L_0x0061:
        r1 = r4.f13869b;	 Catch:{ c -> 0x0078 }
        if (r1 != 0) goto L_0x0079;	 Catch:{ c -> 0x0078 }
    L_0x0065:
        r0 = r4.f13871d;	 Catch:{ c -> 0x0078 }
        r1 = r4.f13870c;	 Catch:{ c -> 0x0078 }
        r2 = r5.mo886b();	 Catch:{ c -> 0x0078 }
        r2 = r2.mo883a();	 Catch:{ c -> 0x0078 }
        r2 = (p050b.p054b.p055a.C4975t) r2;	 Catch:{ c -> 0x0078 }
        r0 = r0.m9943a(r1, r2);	 Catch:{ c -> 0x0078 }
        return r0;
    L_0x0078:
        r0 = move-exception;
    L_0x0079:
        r1 = r5.mo883a();
        r2 = r1 instanceof p050b.p054b.p055a.C4975t;
        if (r2 == 0) goto L_0x008c;
    L_0x0081:
        r1 = (p050b.p054b.p055a.C4975t) r1;
        r0 = r1.m9844d();
        r5 = r4.m9975a(r5, r0);
        return r5;
    L_0x008c:
        if (r0 == 0) goto L_0x00a0;
    L_0x008e:
        throw r0;
    L_0x008f:
        r0 = move-exception;
        r1 = r0.f13865b;
        r2 = r5.mo883a();
        if (r1 == r2) goto L_0x0099;
    L_0x0098:
        throw r0;
    L_0x0099:
        r0 = r0.f13864a;
        r5 = r4.m9975a(r5, r0);
        return r5;
    L_0x00a0:
        r5 = new b.b.c;
        r0 = "bad filed access";
        r5.<init>(r0);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.r.d(b.b.a.b):b.l");
    }

    public int mo2673a(C4969a c4969a) {
        return C4969a.m9814a(c4969a);
    }

    public final void m9992a(an anVar) {
        this.f13873f = anVar;
    }

    public void mo2674a(C4969a c4969a, int[] iArr, int[] iArr2, String[] strArr) {
        int i = 0;
        while (c4969a != null) {
            c4969a.f13818a.mo885a((C0834v) this);
            iArr[i] = this.f13868a;
            iArr2[i] = this.f13869b;
            strArr[i] = this.f13870c;
            i++;
            c4969a = c4969a.f13819b;
        }
    }

    public final void mo905a(C6419c c6419c) {
        C4969a c4969a;
        while (c4969a != null) {
            C0833b c0833b = c4969a.f13818a;
            c4969a = c4969a.f13819b;
            if (c0833b != null) {
                c0833b.mo885a((C0834v) this);
            }
        }
    }

    public final void mo889a(C7029d c7029d) {
        int d = c7029d.m15278d();
        C0833b a = c7029d.mo883a();
        C0833b a2 = c7029d.mo886b().mo883a();
        if (a instanceof C6427u) {
            C6427u c6427u = (C6427u) a;
            C6422i e = c6427u.m15295e();
            int d2 = e.m15269d();
            int e2 = e.m15270e();
            String f = e.m15271f();
            if (d != 61) {
                mo901a(c6427u);
            }
            a2.mo885a((C0834v) this);
            this.f13868a = d2;
            this.f13869b = e2;
            this.f13870c = f;
            return;
        }
        if (a instanceof C6423k) {
            C6423k c6423k = (C6423k) a;
            if (c6423k.m15278d() == 65) {
                m9985b(c6423k.mo883a(), c6423k.mo886b().mo883a());
                int i = this.f13868a;
                d = this.f13869b;
                String str = this.f13870c;
                a2.mo885a((C0834v) this);
                this.f13868a = i;
                this.f13869b = d;
                this.f13870c = str;
                return;
            }
        }
        mo2675a((C6423k) c7029d, d, a, a2);
    }

    public final void mo890a(C7030e c7030e) {
        int d = c7030e.m15278d();
        if (C4977b.m9863c(d) < 0) {
            m9984b((C0833b) c7030e);
        } else if (d == 43) {
            C0833b b = m9981b(c7030e);
            if (b != null) {
                c7030e.mo884a(C7031f.m18156a(C6423k.m15274b(46, b, new C6424o("toString")), null));
                c7030e.m15279e();
                this.f13870c = "java/lang/String";
            }
        } else {
            C0833b a = c7030e.mo883a();
            C0833b a2 = c7030e.mo886b().mo883a();
            a.mo885a((C0834v) this);
            int i = this.f13868a;
            a2.mo885a((C0834v) this);
            if (!m9980a(c7030e, d, a, a2)) {
                m9978a(c7030e, d, i);
            }
        }
    }

    public void mo906a(C7031f c7031f) {
        String d;
        C0851i a;
        String str;
        C0833b a2 = c7031f.mo883a();
        C4969a c4969a = (C4969a) c7031f.mo886b().mo883a();
        C0851i c0851i = null;
        if (a2 instanceof C6424o) {
            d = ((C6424o) a2).m9844d();
        } else if (a2 instanceof C4972n) {
            d = "<init>";
            if (((C4972n) a2).m9836d() == 336) {
                a = C4981j.m9930a(this.f13872e);
                str = d;
                c0851i = a;
                c7031f.f20043c = m9974a(c0851i, str, c4969a);
            }
        } else {
            if (a2 instanceof C6423k) {
                C6423k c6423k = (C6423k) a2;
                str = ((C4975t) c6423k.mo886b().mo883a()).m9844d();
                int d2 = c6423k.m15278d();
                if (d2 == 35) {
                    c0851i = this.f13871d.m9942a(((C4975t) c6423k.mo883a()).m9844d(), false);
                } else {
                    if (d2 == 46) {
                        C0833b a3 = c6423k.mo883a();
                        try {
                            a3.mo885a((C0834v) this);
                        } catch (C4982k e) {
                            if (e.f13865b != a3) {
                                throw e;
                            }
                            this.f13868a = 307;
                            this.f13869b = 0;
                            this.f13870c = e.f13864a;
                            c6423k.m15275a(35);
                            c6423k.mo884a(new C4975t(C4981j.m9936c(this.f13870c)));
                        }
                        if (this.f13869b > 0) {
                            c0851i = this.f13871d.m9942a("java.lang.Object", true);
                        } else if (this.f13868a == 307) {
                            c0851i = this.f13871d.m9941a(this.f13870c);
                        }
                    }
                    C4985r.m9983b();
                }
            } else {
                C4985r.m9977a();
                str = null;
            }
            c7031f.f20043c = m9974a(c0851i, str, c4969a);
        }
        a = this.f13872e;
        str = d;
        c0851i = a;
        c7031f.f20043c = m9974a(c0851i, str, c4969a);
    }

    public void mo891a(C6420g c6420g) {
        String b = m9982b((C4969a) c6420g.mo883a());
        c6420g.mo886b().mo883a().mo885a((C0834v) this);
        this.f13868a = c6420g.m15256d();
        this.f13869b = c6420g.m15257e();
        this.f13870c = b;
    }

    public final void mo892a(C6421h c6421h) {
        m9984b(c6421h.f13818a);
        c6421h.f13819b.f13818a.mo885a((C0834v) this);
        int i = this.f13868a;
        int i2 = this.f13869b;
        c6421h.m15260d().mo885a((C0834v) this);
        if (i2 == 0 && i2 == this.f13869b) {
            if (C4977b.m9866c(i, this.f13868a)) {
                c6421h.f13819b.f13818a = new C6420g(this.f13868a, 0, c6421h.f13819b.f13818a);
            } else if (C4977b.m9866c(this.f13868a, i)) {
                c6421h.f13819b.f13819b.f13818a = new C6420g(i, 0, c6421h.m15260d());
                this.f13868a = i;
            }
        }
    }

    public final void mo894a(C4970j c4970j) {
        this.f13869b = 0;
        this.f13868a = c4970j.m9828e() == 405 ? 312 : 317;
    }

    public final void mo895a(p050b.p054b.p055a.C6423k r15) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r14 = this;
        r0 = r15.m15278d();
        r1 = r15.mo883a();
        r2 = 0;
        r3 = 324; // 0x144 float:4.54E-43 double:1.6E-321;
        r4 = 46;
        if (r0 != r4) goto L_0x004d;
    L_0x000f:
        r0 = r15.mo886b();
        r0 = r0.mo883a();
        r0 = (p050b.p054b.p055a.C4975t) r0;
        r0 = r0.m9844d();
        r1 = "length";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x003d;
    L_0x0025:
        r0 = r15.mo883a();	 Catch:{ k -> 0x0049 }
        r0.mo885a(r14);	 Catch:{ k -> 0x0049 }
        r0 = r14.f13869b;	 Catch:{ k -> 0x0049 }
        if (r0 != 0) goto L_0x0038;	 Catch:{ k -> 0x0049 }
    L_0x0030:
        r0 = new b.b.k;	 Catch:{ k -> 0x0049 }
        r1 = "length";	 Catch:{ k -> 0x0049 }
        r0.<init>(r1, r15);	 Catch:{ k -> 0x0049 }
        throw r0;	 Catch:{ k -> 0x0049 }
    L_0x0038:
        r14.f13868a = r3;	 Catch:{ k -> 0x0049 }
        r14.f13869b = r2;	 Catch:{ k -> 0x0049 }
        return;
    L_0x003d:
        r1 = "class";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0049;
    L_0x0045:
        r14.m9988c();
        return;
    L_0x0049:
        r14.m9989c(r15);
        return;
    L_0x004d:
        r4 = 35;
        if (r0 != r4) goto L_0x006f;
    L_0x0051:
        r0 = r15.mo886b();
        r0 = r0.mo883a();
        r0 = (p050b.p054b.p055a.C4975t) r0;
        r0 = r0.m9844d();
        r1 = "class";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x006b;
    L_0x0067:
        r14.m9988c();
        return;
    L_0x006b:
        r14.m9989c(r15);
        return;
    L_0x006f:
        r4 = 65;
        if (r0 != r4) goto L_0x007f;
    L_0x0073:
        r15 = r15.mo886b();
        r15 = r15.mo883a();
        r14.m9985b(r1, r15);
        return;
    L_0x007f:
        r5 = 362; // 0x16a float:5.07E-43 double:1.79E-321;
        r6 = 1;
        if (r0 == r5) goto L_0x00e4;
    L_0x0084:
        r5 = 363; // 0x16b float:5.09E-43 double:1.793E-321;
        if (r0 != r5) goto L_0x0089;
    L_0x0088:
        goto L_0x00e4;
    L_0x0089:
        r4 = 33;
        if (r0 != r4) goto L_0x0091;
    L_0x008d:
        r14.m9984b(r15);
        return;
    L_0x0091:
        r4 = 67;
        if (r0 != r4) goto L_0x0099;
    L_0x0095:
        p050b.p054b.C4985r.m9977a();
        return;
    L_0x0099:
        r1.mo885a(r14);
        r1 = p050b.p054b.C4985r.m9971a(r1);
        r4 = r1 instanceof p050b.p054b.p055a.C4971m;
        r5 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r7 = 45;
        if (r4 == 0) goto L_0x00bd;
    L_0x00a8:
        r1 = (p050b.p054b.p055a.C4971m) r1;
        r8 = r1.m9833d();
        if (r0 != r7) goto L_0x00b3;
    L_0x00b0:
        r8 = -r8;
        r12 = r8;
        goto L_0x00b9;
    L_0x00b3:
        if (r0 != r5) goto L_0x00d3;
    L_0x00b5:
        r10 = -1;
        r12 = r8 ^ r10;
    L_0x00b9:
        r1.m9831a(r12);
        goto L_0x00cd;
    L_0x00bd:
        r4 = r1 instanceof p050b.p054b.p055a.C4970j;
        if (r4 == 0) goto L_0x00d3;
    L_0x00c1:
        r1 = (p050b.p054b.p055a.C4970j) r1;
        if (r0 != r7) goto L_0x00d3;
    L_0x00c5:
        r8 = r1.m9827d();
        r8 = -r8;
        r1.m9825a(r8);
    L_0x00cd:
        r1 = 43;
        r15.m15275a(r1);
        r2 = r6;
    L_0x00d3:
        if (r2 != 0) goto L_0x00e3;
    L_0x00d5:
        if (r0 == r7) goto L_0x00d9;
    L_0x00d7:
        if (r0 != r5) goto L_0x00e3;
    L_0x00d9:
        r15 = r14.f13868a;
        r15 = p050b.p054b.C4977b.m9872e(r15);
        if (r15 == 0) goto L_0x00e3;
    L_0x00e1:
        r14.f13868a = r3;
    L_0x00e3:
        return;
    L_0x00e4:
        if (r1 != 0) goto L_0x00e7;
    L_0x00e6:
        r2 = r6;
    L_0x00e7:
        if (r2 == 0) goto L_0x00f1;
    L_0x00e9:
        r15 = r15.mo886b();
        r1 = r15.mo883a();
    L_0x00f1:
        r15 = r1 instanceof p050b.p054b.p055a.C6427u;
        if (r15 == 0) goto L_0x0108;
    L_0x00f5:
        r1 = (p050b.p054b.p055a.C6427u) r1;
        r15 = r1.m15295e();
        r0 = r15.m15269d();
        r14.f13868a = r0;
        r15 = r15.m15270e();
        r14.f13869b = r15;
        return;
    L_0x0108:
        r15 = r1 instanceof p050b.p054b.p055a.C6423k;
        r0 = 334; // 0x14e float:4.68E-43 double:1.65E-321;
        r2 = 306; // 0x132 float:4.29E-43 double:1.51E-321;
        r5 = 303; // 0x12f float:4.25E-43 double:1.497E-321;
        if (r15 == 0) goto L_0x0137;
    L_0x0112:
        r15 = r1;
        r15 = (p050b.p054b.p055a.C6423k) r15;
        r6 = r15.m15278d();
        if (r6 != r4) goto L_0x0137;
    L_0x011b:
        r1 = r15.mo883a();
        r15 = r15.mo886b();
        r15 = r15.mo883a();
        r14.m9985b(r1, r15);
        r15 = r14.f13868a;
        if (r15 == r3) goto L_0x0134;
    L_0x012e:
        if (r15 == r5) goto L_0x0134;
    L_0x0130:
        if (r15 == r2) goto L_0x0134;
    L_0x0132:
        if (r15 != r0) goto L_0x0136;
    L_0x0134:
        r14.f13868a = r3;
    L_0x0136:
        return;
    L_0x0137:
        r15 = r14.m9990d(r1);
        r14.m9987b(r15);
        r15 = r14.f13868a;
        if (r15 == r3) goto L_0x0148;
    L_0x0142:
        if (r15 == r5) goto L_0x0148;
    L_0x0144:
        if (r15 == r2) goto L_0x0148;
    L_0x0146:
        if (r15 != r0) goto L_0x014a;
    L_0x0148:
        r14.f13868a = r3;
    L_0x014a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.r.a(b.b.a.k):void");
    }

    protected void mo2675a(C6423k c6423k, int i, C0833b c0833b, C0833b c0833b2) {
        m9987b(m9990d(c0833b));
        int i2 = this.f13868a;
        i = this.f13869b;
        String str = this.f13870c;
        c0833b2.mo885a((C0834v) this);
        this.f13868a = i2;
        this.f13869b = i;
        this.f13870c = str;
    }

    public final void mo896a(C7032l c7032l) {
        c7032l.mo886b().mo883a().mo885a((C0834v) this);
        this.f13868a = 301;
        this.f13869b = 0;
    }

    public final void mo897a(C4971m c4971m) {
        this.f13869b = 0;
        int e = c4971m.m9834e();
        if (e != 402) {
            if (e != 401) {
                this.f13868a = 326;
                return;
            }
        }
        this.f13868a = e == 402 ? 324 : 306;
    }

    public final void mo898a(C4972n c4972n) {
        this.f13869b = 0;
        int d = c4972n.m9836d();
        if (d == 336 || d == 339) {
            this.f13868a = 307;
            if (d == 339) {
                this.f13870c = C4981j.m9934b(this.f13872e.m1999m());
                return;
            } else {
                this.f13870c = C4981j.m9934b(C4981j.m9930a(this.f13872e).m1999m());
                return;
            }
        }
        switch (d) {
            case 410:
            case 411:
                this.f13868a = 301;
                return;
            case 412:
                this.f13868a = 412;
                return;
            default:
                C4985r.m9977a();
                return;
        }
    }

    public void mo907a(C6424o c6424o) {
        m9989c(c6424o);
    }

    public final void mo908a(C6425p c6425p) {
        String b;
        if (c6425p.m15285d()) {
            int e = c6425p.m15286e();
            C4969a f = c6425p.m15287f();
            C4969a c4969a = (C4969a) c6425p.mo883a();
            C0833b g = c6425p.m15288g();
            if (g != null) {
                g.mo885a((C0834v) this);
            }
            if (C4969a.m9814a(f) > 1) {
                int a = C4969a.m9814a(f);
                while (f != null) {
                    C0833b c0833b = f.f13818a;
                    if (c0833b == null) {
                        break;
                    }
                    c0833b.mo885a((C0834v) this);
                    f = f.f13819b;
                }
                this.f13868a = e;
                this.f13869b = a;
                if (e != 307) {
                    this.f13870c = null;
                    return;
                }
            }
            g = f.f13818a;
            if (g != null) {
                g.mo885a((C0834v) this);
            }
            this.f13868a = e;
            this.f13869b = 1;
            if (e != 307) {
                this.f13870c = null;
                return;
            }
            b = m9982b(c4969a);
        } else {
            C0851i a2 = this.f13871d.m9940a((C4969a) c6425p.mo883a());
            String m = a2.m1999m();
            m9974a(a2, "<init>", c6425p.m15287f());
            this.f13868a = 307;
            this.f13869b = 0;
            b = C4981j.m9934b(m);
        }
        this.f13870c = b;
    }

    public final void mo900a(C4974s c4974s) {
        this.f13868a = 307;
        this.f13869b = 0;
        this.f13870c = "java/lang/String";
    }

    public final void mo901a(C6427u c6427u) {
        C6422i e = c6427u.m15295e();
        this.f13868a = e.m15269d();
        this.f13869b = e.m15270e();
        this.f13870c = e.m15271f();
    }
}
