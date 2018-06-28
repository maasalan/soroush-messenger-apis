package p050b.p054b;

import java.util.ArrayList;
import p050b.C0848e;
import p050b.C0851i;
import p050b.C4990l;
import p050b.C6431n;
import p050b.p051a.C0798a;
import p050b.p051a.C0818h;
import p050b.p051a.C0819j;
import p050b.p051a.C0827p;
import p050b.p051a.C0831z;
import p050b.p051a.C4954i;
import p050b.p051a.an;
import p050b.p054b.C4977b.C0836a;
import p050b.p054b.C4981j.C0840a;
import p050b.p054b.p055a.C0833b;
import p050b.p054b.p055a.C0834v;
import p050b.p054b.p055a.C4969a;
import p050b.p054b.p055a.C4972n;
import p050b.p054b.p055a.C4973q;
import p050b.p054b.p055a.C4975t;
import p050b.p054b.p055a.C6419c;
import p050b.p054b.p055a.C6422i;
import p050b.p054b.p055a.C6423k;
import p050b.p054b.p055a.C6424o;
import p050b.p054b.p055a.C6425p;
import p050b.p054b.p055a.C6426r;
import p050b.p054b.p055a.C7031f;

public class C6429i extends C4977b {
    protected C4981j f17586v;
    protected C0851i f17587w;
    protected an f17588x = null;
    protected boolean f17589y;

    static class C4979a extends C0836a {
        ArrayList f13856a = new ArrayList();
        C4977b f13857b;
        int f13858d;

        C4979a(C4977b c4977b) {
            super(c4977b);
            this.f13857b = c4977b;
            this.f13858d = -1;
        }

        private int m9923a(int i) {
            if (this.f13858d < 0) {
                this.f13858d = this.f13857b.m9900b();
                this.f13857b.m9901b(i);
            }
            return this.f13858d;
        }

        private void m9924a(C4954i c4954i) {
            c4954i.m9728e(167);
            this.f13856a.add(new int[]{c4954i.f2447b, this.f13858d});
            c4954i.m9733g(0);
        }

        protected final boolean mo888a(C4954i c4954i, int i) {
            switch (i) {
                case 172:
                    c4954i.m9739l(m9923a(1));
                    m9924a(c4954i);
                    c4954i.m9738k(this.f13858d);
                    break;
                case 173:
                    c4954i.m9741n(m9923a(2));
                    m9924a(c4954i);
                    c4954i.m9740m(this.f13858d);
                    break;
                case 174:
                    c4954i.m9745r(m9923a(1));
                    m9924a(c4954i);
                    c4954i.m9744q(this.f13858d);
                    break;
                case 175:
                    c4954i.m9743p(m9923a(2));
                    m9924a(c4954i);
                    c4954i.m9742o(this.f13858d);
                    break;
                case 176:
                    c4954i.m9736i(m9923a(1));
                    m9924a(c4954i);
                    c4954i.m9735h(this.f13858d);
                    break;
                case 177:
                    m9924a(c4954i);
                    break;
                default:
                    throw new RuntimeException("fatal");
            }
            return false;
        }
    }

    static class C4980b extends C0836a {
        int f13859a;
        int f13860b;

        C4980b(C4977b c4977b, int[] iArr) {
            super(c4977b);
            this.f13860b = iArr[0];
            this.f13859a = iArr[1];
        }

        protected final boolean mo888a(C4954i c4954i, int i) {
            switch (i) {
                case 172:
                    c4954i.m9739l(this.f13859a);
                    break;
                case 173:
                    c4954i.m9741n(this.f13859a);
                    break;
                case 174:
                    c4954i.m9745r(this.f13859a);
                    break;
                case 175:
                    c4954i.m9743p(this.f13859a);
                    break;
                case 176:
                    c4954i.m9736i(this.f13859a);
                    break;
                case 177:
                    break;
                default:
                    throw new RuntimeException("fatal");
            }
            c4954i.m9728e(167);
            c4954i.m9733g((this.f13860b - c4954i.f2447b) + 3);
            return true;
        }
    }

    public C6429i(C4954i c4954i, C0851i c0851i, C0848e c0848e) {
        super(c4954i);
        this.f17586v = new C4981j(c0848e);
        this.f17587w = c0851i;
    }

    private int m15304a(C4990l c4990l, boolean z) {
        C0831z a = c4990l.m10060a();
        boolean a2 = m15312a(a);
        C0835a a3 = m15305a(c4990l, a);
        if (a3 != null) {
            an a4 = a3.m1942a(a, z);
            this.a.m9725d(c4990l.mo940c(), a4.m1744a(), a4.m1750d());
            return 0;
        }
        int b = m15314b(c4990l, a);
        if (z) {
            this.a.mo869a(178);
            this.a.m9731f(a2 ? 2 : 1);
        } else {
            this.a.mo869a(180);
            this.a.m9731f(a2);
        }
        this.a.m9733g(b);
        return b;
    }

    private C0835a m15305a(C4990l c4990l, C0831z c0831z) {
        if (!C0798a.m1740a(c0831z.f2491b) || c4990l.mo940c() == this.f17587w) {
            return null;
        }
        C0851i c = c4990l.mo940c();
        if (C6429i.m15313a(c, this.f17587w)) {
            C0835a i = c.mo931i();
            if (i != null) {
                return i;
            }
            throw new C0837c("fatal error.  bug?");
        }
        StringBuilder stringBuilder = new StringBuilder("Field ");
        stringBuilder.append(c4990l.mo941i());
        stringBuilder.append(" in ");
        stringBuilder.append(c.m1999m());
        stringBuilder.append(" is private.");
        throw new C0837c(stringBuilder.toString());
    }

    private p050b.C4990l m15306a(p050b.p054b.p055a.C0833b r7, boolean r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = r7 instanceof p050b.p054b.p055a.C6424o;
        r1 = 0;
        if (r0 == 0) goto L_0x0042;
    L_0x0005:
        r8 = r7;
        r8 = (p050b.p054b.p055a.C6424o) r8;
        r8 = r8.m9844d();
        r0 = r6.f17587w;	 Catch:{ w -> 0x003c }
        r0 = r0.mo921a(r8);	 Catch:{ w -> 0x003c }
        r7 = r0.mo919b();
        r7 = p050b.C0857v.m2017a(r7);
        if (r7 != 0) goto L_0x0039;
    L_0x001c:
        r2 = r6.d;
        if (r2 == 0) goto L_0x0034;
    L_0x0020:
        r7 = new b.b.c;
        r0 = new java.lang.StringBuilder;
        r1 = "not available in a static method: ";
        r0.<init>(r1);
        r0.append(r8);
        r8 = r0.toString();
        r7.<init>(r8);
        throw r7;
    L_0x0034:
        r8 = r6.a;
        r8.m9735h(r1);
    L_0x0039:
        r6.f17589y = r7;
        return r0;
    L_0x003c:
        r0 = new b.b.k;
        r0.<init>(r8, r7);
        throw r0;
    L_0x0042:
        r0 = r7 instanceof p050b.p054b.p055a.C6423k;
        r2 = 0;
        if (r0 == 0) goto L_0x00e9;
    L_0x0047:
        r0 = r7;
        r0 = (p050b.p054b.p055a.C6423k) r0;
        r3 = r0.m15278d();
        r4 = 35;
        r5 = 1;
        if (r3 != r4) goto L_0x0070;
    L_0x0053:
        r7 = r6.f17586v;
        r8 = r0.mo883a();
        r8 = (p050b.p054b.p055a.C4975t) r8;
        r8 = r8.m9844d();
        r0 = r0.mo886b();
        r0 = r0.mo883a();
        r0 = (p050b.p054b.p055a.C4975t) r0;
        r7 = r7.m9945b(r8, r0);
    L_0x006d:
        r6.f17589y = r5;
        return r7;
    L_0x0070:
        r4 = 46;
        if (r3 != r4) goto L_0x00e9;
    L_0x0074:
        r1 = r0.mo883a();	 Catch:{ k -> 0x00cc }
        r1.mo885a(r6);	 Catch:{ k -> 0x00cc }
        r1 = r6.h;	 Catch:{ k -> 0x00cc }
        r3 = 307; // 0x133 float:4.3E-43 double:1.517E-321;	 Catch:{ k -> 0x00cc }
        if (r1 != r3) goto L_0x0098;	 Catch:{ k -> 0x00cc }
    L_0x0081:
        r1 = r6.j;	 Catch:{ k -> 0x00cc }
        if (r1 != 0) goto L_0x0098;	 Catch:{ k -> 0x00cc }
    L_0x0085:
        r8 = r6.f17586v;	 Catch:{ k -> 0x00cc }
        r1 = r6.k;	 Catch:{ k -> 0x00cc }
        r2 = r0.mo886b();	 Catch:{ k -> 0x00cc }
        r2 = r2.mo883a();	 Catch:{ k -> 0x00cc }
        r2 = (p050b.p054b.p055a.C4975t) r2;	 Catch:{ k -> 0x00cc }
        r2 = r8.m9943a(r1, r2);	 Catch:{ k -> 0x00cc }
        goto L_0x00b8;	 Catch:{ k -> 0x00cc }
    L_0x0098:
        if (r8 == 0) goto L_0x00b5;	 Catch:{ k -> 0x00cc }
    L_0x009a:
        r8 = r6.j;	 Catch:{ k -> 0x00cc }
        if (r8 <= 0) goto L_0x00b5;	 Catch:{ k -> 0x00cc }
    L_0x009e:
        r8 = r0.mo886b();	 Catch:{ k -> 0x00cc }
        r8 = r8.mo883a();	 Catch:{ k -> 0x00cc }
        r8 = (p050b.p054b.p055a.C4975t) r8;	 Catch:{ k -> 0x00cc }
        r8 = r8.m9844d();	 Catch:{ k -> 0x00cc }
        r1 = "length";	 Catch:{ k -> 0x00cc }
        r8 = r8.equals(r1);	 Catch:{ k -> 0x00cc }
        if (r8 == 0) goto L_0x00b5;	 Catch:{ k -> 0x00cc }
    L_0x00b4:
        return r2;	 Catch:{ k -> 0x00cc }
    L_0x00b5:
        p050b.p054b.C6429i.m15316j();	 Catch:{ k -> 0x00cc }
    L_0x00b8:
        r8 = r2.mo919b();	 Catch:{ k -> 0x00cc }
        r8 = p050b.C0857v.m2017a(r8);	 Catch:{ k -> 0x00cc }
        if (r8 == 0) goto L_0x00c9;	 Catch:{ k -> 0x00cc }
    L_0x00c2:
        r1 = r6.a;	 Catch:{ k -> 0x00cc }
        r3 = 87;	 Catch:{ k -> 0x00cc }
        r1.m9728e(r3);	 Catch:{ k -> 0x00cc }
    L_0x00c9:
        r6.f17589y = r8;	 Catch:{ k -> 0x00cc }
        return r2;
    L_0x00cc:
        r8 = move-exception;
        r1 = r8.f13865b;
        r2 = r0.mo883a();
        if (r1 == r2) goto L_0x00d6;
    L_0x00d5:
        throw r8;
    L_0x00d6:
        r0 = r0.mo886b();
        r0 = r0.mo883a();
        r0 = (p050b.p054b.p055a.C4975t) r0;
        r8 = r8.f13864a;
        r1 = r6.f17586v;
        r7 = r1.m9944a(r8, r0, r7);
        goto L_0x006d;
    L_0x00e9:
        p050b.p054b.C6429i.m15316j();
        r6.f17589y = r1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.i.a(b.b.a.b, boolean):b.l");
    }

    private void m15307a(int i, C0833b c0833b, String str, C6419c c6419c) {
        String a;
        int i2;
        if (c6419c == null) {
            if (c0833b == null) {
                throw new C0837c("no array size");
            }
            c0833b.mo885a((C0834v) this);
        } else if (c0833b == null) {
            this.a.m9737j(C4969a.m9814a((C4969a) c6419c));
        } else {
            throw new C0837c("unnecessary array size specified for new");
        }
        if (i == 307) {
            a = mo2677a(str);
            this.a.m9730e(C4981j.m9936c(a));
        } else {
            a = null;
            if (i == 301) {
                i2 = 4;
            } else if (i == 303) {
                i2 = 8;
            } else if (i == 306) {
                i2 = 5;
            } else if (i == 312) {
                i2 = 7;
            } else if (i == 317) {
                i2 = 6;
            } else if (i == 324) {
                i2 = 10;
            } else if (i == 326) {
                i2 = 11;
            } else if (i != 334) {
                throw new C0837c("bad new expression");
            } else {
                i2 = 9;
            }
            this.a.m9728e(188);
            this.a.mo869a(i2);
        }
        if (c6419c != null) {
            i2 = C4969a.m9814a((C4969a) c6419c);
            C4969a c4969a = c6419c;
            for (int i3 = 0; i3 < i2; i3++) {
                this.a.m9728e(89);
                this.a.m9737j(i3);
                c4969a.f13818a.mo885a((C0834v) this);
                if (!C4977b.m9869d(i)) {
                    m9908d(this.h, i);
                }
                this.a.m9728e(C4977b.m9870e(i, 0));
                c4969a = c4969a.f13819b;
            }
        }
        this.h = i;
        this.j = 1;
        this.k = a;
    }

    private void m15308a(C0851i c0851i, String str, C4969a c4969a, boolean z, boolean z2, int i, C0840a c0840a) {
        boolean z3;
        C0840a a;
        String str2 = str;
        C4969a c4969a2 = c4969a;
        int i2 = i;
        int b = mo3315b(c4969a2);
        int[] iArr = new int[b];
        int[] iArr2 = new int[b];
        String[] strArr = new String[b];
        int i3 = 1;
        if (z || c0840a == null || !c0840a.m1951a()) {
            z3 = z;
        } else {
            r0.a.m9728e(87);
            z3 = true;
        }
        b = r0.a.f13796h;
        mo3314a(c4969a2, iArr, iArr2, strArr);
        int i4 = (r0.a.f13796h - b) + 1;
        if (c0840a == null) {
            a = r0.f17586v.m9938a(c0851i, r0.f17587w, r0.f17588x, str2, iArr, iArr2, strArr);
        } else {
            a = c0840a;
        }
        if (a == null) {
            String str3;
            if (str2.equals("<init>")) {
                str3 = "constructor not found";
            } else {
                StringBuilder stringBuilder = new StringBuilder("Method ");
                stringBuilder.append(str2);
                stringBuilder.append(" not found in ");
                stringBuilder.append(c0851i.m1999m());
                str3 = stringBuilder.toString();
            }
            throw new C0837c(str3);
        }
        C0851i c0851i2;
        int i5;
        C0851i c0851i3 = a.f2507a;
        an anVar = a.f2508b;
        String d = anVar.m1750d();
        int i6 = anVar.f2405b;
        boolean z4 = false;
        if (str2.equals("<init>")) {
            c0851i2 = c0851i;
            if (c0851i3 != c0851i2) {
                StringBuilder stringBuilder2 = new StringBuilder("no such constructor: ");
                stringBuilder2.append(c0851i.m1999m());
                throw new C0837c(stringBuilder2.toString());
            } else if (c0851i3 != r0.f17587w && C0798a.m1740a(i6)) {
                if (C6429i.m15313a(c0851i3, r0.f17587w)) {
                    C0835a i7 = c0851i3.mo931i();
                    if (i7 != null) {
                        d = i7.m1943a(d, anVar);
                        r0.a.m9728e(1);
                    }
                }
                StringBuilder stringBuilder3 = new StringBuilder("the called constructor is private in ");
                stringBuilder3.append(c0851i3.m1999m());
                throw new C0837c(stringBuilder3.toString());
            }
        }
        c0851i2 = c0851i;
        if (!C0798a.m1740a(i6)) {
            i5 = z2;
        } else if (c0851i3 != r0.f17587w) {
            String m;
            C0835a i8;
            if ((i6 & 8) == 0) {
                m = c0851i3.m1999m();
                if (d.charAt(0) == '(') {
                    StringBuilder stringBuilder4 = new StringBuilder("(L");
                    stringBuilder4.append(m.replace('.', '/'));
                    stringBuilder4.append(';');
                    stringBuilder4.append(d.substring(1));
                    m = stringBuilder4.toString();
                    i6 = (i6 & -8) | 8;
                    if (C6429i.m15313a(c0851i3, r0.f17587w)) {
                        i8 = c0851i3.mo931i();
                        if (i8 != null) {
                            str2 = i8.m1944a(str2, d, m, anVar);
                            i5 = false;
                            d = m;
                            z3 = true;
                        }
                    }
                    stringBuilder2 = new StringBuilder("Method ");
                    stringBuilder2.append(str2);
                    stringBuilder2.append(" is private");
                    throw new C0837c(stringBuilder2.toString());
                }
            }
            m = d;
            i6 = (i6 & -8) | 8;
            if (C6429i.m15313a(c0851i3, r0.f17587w)) {
                i8 = c0851i3.mo931i();
                if (i8 != null) {
                    str2 = i8.m1944a(str2, d, m, anVar);
                    i5 = false;
                    d = m;
                    z3 = true;
                }
            }
            stringBuilder2 = new StringBuilder("Method ");
            stringBuilder2.append(str2);
            stringBuilder2.append(" is private");
            throw new C0837c(stringBuilder2.toString());
        }
        if ((i6 & 8) != 0) {
            if (!z3) {
                if (i2 < 0) {
                    r0.a.mo870a(i2, 0);
                    z3 = true;
                } else {
                    z4 = true;
                    z3 = z4;
                }
            }
            r0.a.m9725d(c0851i3, str2, d);
        } else if (i5 == 0) {
            r0.a.m9720c(c0851i3, str2, d);
        } else {
            if ((c0851i3.mo914c() & 1) != 0) {
                i3 = 0;
            }
            if (i3 == 0 || c0851i3.mo934p() != c0851i.mo934p()) {
                c0851i3 = c0851i2;
            }
            if (c0851i3.mo934p()) {
                r0.a.m9706a(c0851i3, str2, d, i4);
            } else if (z3) {
                r0.a.m9729e(c0851i3, str2, d);
            } else {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str2);
                stringBuilder2.append(" is not static");
                throw new C0837c(stringBuilder2.toString());
            }
        }
        m15310a(d, z3, z4);
        i5 = 1;
        if ((i6 & 8) != 0) {
            if (z3) {
                if (i2 < 0) {
                    z4 = true;
                    z3 = z4;
                } else {
                    r0.a.mo870a(i2, 0);
                    z3 = true;
                }
            }
            r0.a.m9725d(c0851i3, str2, d);
        } else if (i5 == 0) {
            if ((c0851i3.mo914c() & 1) != 0) {
                i3 = 0;
            }
            c0851i3 = c0851i2;
            if (c0851i3.mo934p()) {
                r0.a.m9706a(c0851i3, str2, d, i4);
            } else if (z3) {
                r0.a.m9729e(c0851i3, str2, d);
            } else {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str2);
                stringBuilder2.append(" is not static");
                throw new C0837c(stringBuilder2.toString());
            }
        } else {
            r0.a.m9720c(c0851i3, str2, d);
        }
        m15310a(d, z3, z4);
    }

    private void m15309a(C4990l c4990l, boolean z, int i, boolean z2) {
        if (i != 0) {
            C4954i c4954i;
            int i2 = -2;
            if (z) {
                this.a.mo869a(179);
                c4954i = this.a;
                if (!z2) {
                    i2 = -1;
                }
            } else {
                this.a.mo869a(181);
                c4954i = this.a;
                if (z2) {
                    i2 = -3;
                }
            }
            c4954i.m9731f(i2);
            this.a.m9733g(i);
            return;
        }
        C0851i c = c4990l.mo940c();
        an b = c.mo931i().m1945b(c4990l.m10060a(), z);
        this.a.m9725d(c, b.m1744a(), b.m1750d());
    }

    private void m15310a(String str, boolean z, boolean z2) {
        int indexOf = str.indexOf(41);
        if (indexOf < 0) {
            C6429i.m15315i();
        }
        indexOf++;
        char charAt = str.charAt(indexOf);
        int i = 0;
        while (charAt == '[') {
            i++;
            indexOf++;
            charAt = str.charAt(indexOf);
        }
        this.j = i;
        if (charAt == 'L') {
            indexOf++;
            int indexOf2 = str.indexOf(59, indexOf);
            if (indexOf2 < 0) {
                C6429i.m15315i();
            }
            this.h = 307;
            str = str.substring(indexOf, indexOf2);
        } else {
            this.h = C4981j.m9927a(charAt);
            str = null;
        }
        this.k = str;
        int i2 = this.h;
        if (z && z2) {
            if (C4977b.m9856a(i2, i)) {
                this.a.m9728e(93);
                this.a.m9728e(88);
            } else if (i2 != 344) {
                this.a.m9728e(95);
                this.a.m9728e(87);
            }
            this.a.m9728e(87);
        }
    }

    private void m15311a(ArrayList arrayList, C6426r c6426r) {
        C0818h c0818h = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            int[] iArr = (int[]) arrayList.get(i);
            int i2 = iArr[0];
            c0818h.m9719c(i2, (c0818h.f2447b - i2) + 1);
            C0836a c4980b = new C4980b(this, iArr);
            mo899a(c6426r);
            c4980b.m1946a(this);
            if (!this.c) {
                c0818h.m9728e(167);
                c0818h.m9733g((i2 + 3) - c0818h.f2447b);
            }
        }
    }

    private boolean m15312a(C0831z c0831z) {
        String b = c0831z.m1914b();
        char charAt = b.charAt(0);
        int i = 0;
        int i2 = i;
        while (charAt == '[') {
            i++;
            i2++;
            charAt = b.charAt(i2);
        }
        this.j = i;
        this.h = C4981j.m9927a(charAt);
        if (charAt == 'L') {
            i2++;
            b = b.substring(i2, b.indexOf(59, i2));
        } else {
            b = null;
        }
        this.k = b;
        return i == 0 && (charAt == 'J' || charAt == 'D');
    }

    private static boolean m15313a(p050b.C0851i r0, p050b.C0851i r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
    L_0x0000:
        if (r1 == 0) goto L_0x000a;
    L_0x0002:
        r1 = r1.mo935q();	 Catch:{ w -> 0x000a }
        if (r1 != r0) goto L_0x0000;
    L_0x0008:
        r0 = 1;
        return r0;
    L_0x000a:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.i.a(b.i, b.i):boolean");
    }

    private int m15314b(C4990l c4990l, C0831z c0831z) {
        C0827p c0827p = this.a.f13792d;
        return c0827p.m1869a(c0827p.m1873a(c4990l.mo940c().m1999m()), c0831z.m1913a(), c0831z.m1914b());
    }

    private static void m15315i() {
        throw new C0837c("bad method");
    }

    private static void m15316j() {
        throw new C0837c("bad l-value");
    }

    protected final String mo2676a(C4969a c4969a) {
        return this.f17586v.m9946b(c4969a);
    }

    protected final String mo2677a(String str) {
        return str == null ? null : C4981j.m9934b(this.f17586v.m9941a(str).m1999m());
    }

    protected final void mo2678a(int i, boolean z, C0833b c0833b, C6423k c6423k, boolean z2) {
        C4990l a = m15306a(c0833b, false);
        boolean z3 = this.f17589y;
        int i2 = 89;
        if (!z3) {
            this.a.m9728e(89);
        }
        int a2 = m15304a(a, z3);
        boolean a3 = C4977b.m9856a(this.h, this.j);
        if (!z3) {
            i2 = a3 ? 93 : 90;
        } else if (a3) {
            i2 = 92;
        }
        m9879a(i2, z2, i, z, c6423k);
        m15309a(a, z3, a2, a3);
    }

    public void mo3314a(C4969a c4969a, int[] iArr, int[] iArr2, String[] strArr) {
        int i = 0;
        while (c4969a != null) {
            c4969a.f13818a.mo885a((C0834v) this);
            iArr[i] = this.h;
            iArr2[i] = this.j;
            strArr[i] = this.k;
            i++;
            c4969a = c4969a.f13819b;
        }
    }

    public final void mo905a(C6419c c6419c) {
        throw new C0837c("array initializer is not supported");
    }

    protected final void mo2679a(C6419c c6419c, int i, String str) {
        m15307a(i, null, str, c6419c);
    }

    public void mo906a(C7031f c7031f) {
        String d;
        C0851i c0851i;
        String str;
        int i;
        boolean z;
        boolean z2;
        C0851i c0851i2;
        C0833b a = c7031f.mo883a();
        C4969a c4969a = (C4969a) c7031f.mo886b().mo883a();
        C0840a c0840a = c7031f.f20043c;
        C0851i c0851i3 = null;
        boolean z3 = false;
        if (a instanceof C6424o) {
            d = ((C6424o) a).m9844d();
            c0851i = this.f17587w;
            if (!this.d) {
                if (c0840a == null || !c0840a.m1951a()) {
                    int i2 = this.a.f2447b;
                    this.a.m9735h(0);
                    str = d;
                    i = i2;
                    z = false;
                    z2 = z;
                    c0851i2 = c0851i;
                    m15308a(c0851i2, str, c4969a, z, z2, i, c0840a);
                }
            }
        } else {
            if (a instanceof C4972n) {
                d = "<init>";
                c0851i3 = this.f17587w;
                if (this.d) {
                    throw new C0837c("a constructor cannot be static");
                }
                this.a.m9735h(0);
                if (((C4972n) a).m9836d() == 336) {
                    c0851i = C4981j.m9930a(c0851i3);
                    z2 = true;
                    z = false;
                    i = -1;
                    str = d;
                    c0851i2 = c0851i;
                    m15308a(c0851i2, str, c4969a, z, z2, i, c0840a);
                }
                z2 = true;
                z = false;
            } else if (a instanceof C6423k) {
                C6423k c6423k = (C6423k) a;
                d = ((C4975t) c6423k.mo886b().mo883a()).m9844d();
                int d2 = c6423k.m15278d();
                if (d2 == 35) {
                    c0851i = this.f17586v.m9942a(((C4975t) c6423k.mo883a()).m9844d(), false);
                } else if (d2 == 46) {
                    a = c6423k.mo883a();
                    z = (a instanceof C4972n) && ((C4972n) a).m9836d() == 336;
                    try {
                        a.mo885a((C0834v) this);
                    } catch (C4982k e) {
                        if (e.f13865b != a) {
                            throw e;
                        }
                        this.h = 307;
                        this.j = 0;
                        this.k = e.f13864a;
                        z3 = true;
                    }
                    if (this.j > 0) {
                        c0851i = this.f17586v.m9942a("java.lang.Object", true);
                    } else if (this.h == 307) {
                        c0851i = this.f17586v.m9941a(this.k);
                    } else {
                        C6429i.m15315i();
                        i = -1;
                        z2 = z;
                        str = d;
                        z = z3;
                        c0851i2 = c0851i3;
                        m15308a(c0851i2, str, c4969a, z, z2, i, c0840a);
                    }
                    i = -1;
                    z2 = z;
                    str = d;
                    z = z3;
                    c0851i2 = c0851i;
                    m15308a(c0851i2, str, c4969a, z, z2, i, c0840a);
                } else {
                    C6429i.m15315i();
                    z = false;
                    z2 = z;
                }
            } else {
                C4977b.m9849a();
                z = false;
                z2 = z;
                i = -1;
                c0851i2 = null;
                str = c0851i2;
                m15308a(c0851i2, str, c4969a, z, z2, i, c0840a);
            }
            i = -1;
            str = d;
            c0851i2 = c0851i3;
            m15308a(c0851i2, str, c4969a, z, z2, i, c0840a);
        }
        z = true;
        z2 = false;
        i = -1;
        str = d;
        c0851i2 = c0851i;
        m15308a(c0851i2, str, c4969a, z, z2, i, c0840a);
    }

    protected void mo2680a(C6423k c6423k, int i, C0833b c0833b, C0833b c0833b2, boolean z) {
        int i2 = i;
        boolean z2 = false;
        C4990l a = m15306a(c0833b, false);
        boolean z3 = this.f17589y;
        int i3 = 89;
        if (!(i2 == 61 || z3)) {
            r7.a.m9728e(89);
        }
        if (i2 == 61) {
            C0831z a2 = a.m10060a();
            m15312a(a2);
            if (m15305a(a, a2) == null) {
                z2 = m15314b(a, a2);
            }
        } else {
            z2 = m15304a(a, z3);
        }
        int i4 = z2;
        int i5 = r7.h;
        int i6 = r7.j;
        String str = r7.k;
        m9890a(c6423k, i2, c0833b2, i5, i6, str);
        z2 = C4977b.m9856a(i5, i6);
        if (z) {
            if (!z3) {
                i3 = z2 ? 93 : 90;
            } else if (z2) {
                i3 = 92;
            }
            r7.a.m9728e(i3);
        }
        m15309a(a, z3, i4, z2);
        r7.h = i5;
        r7.j = i6;
        r7.k = str;
    }

    public void mo907a(C6424o c6424o) {
        mo2685d(c6424o);
    }

    public final void mo908a(C6425p c6425p) {
        int i = 0;
        if (c6425p.m15285d()) {
            int e = c6425p.m15286e();
            C4969a f = c6425p.m15287f();
            C4969a c4969a = (C4969a) c6425p.mo883a();
            C6419c g = c6425p.m15288g();
            if (C4969a.m9814a(f) <= 1) {
                m15307a(e, f.f13818a, C6422i.m15261a(c4969a, '/'), g);
                return;
            } else if (g != null) {
                throw new C0837c("sorry, multi-dimensional array initializer for new is not supported");
            } else {
                String a;
                int a2 = C4969a.m9814a(f);
                while (f != null) {
                    C0833b c0833b = f.f13818a;
                    if (c0833b == null) {
                        break;
                    }
                    i++;
                    c0833b.mo885a((C0834v) this);
                    if (this.h != 324) {
                        throw new C0837c("bad type for array size");
                    }
                    f = f.f13819b;
                }
                this.h = e;
                this.j = a2;
                if (e == 307) {
                    this.k = mo2676a(c4969a);
                    a = C4977b.m9848a(this.k, a2);
                } else {
                    a = C4977b.m9860b(e, a2);
                }
                this.a.m9695a(a, i);
                return;
            }
        }
        C0851i a3 = this.f17586v.m9940a((C4969a) c6425p.mo883a());
        String m = a3.m1999m();
        C4969a f2 = c6425p.m15287f();
        this.a.m9726d(m);
        this.a.m9728e(89);
        m15308a(a3, "<init>", f2, false, true, -1, null);
        this.h = 307;
        this.j = 0;
        this.k = C4981j.m9934b(m);
    }

    public final void m15327a(C6431n c6431n) {
        this.f17588x = c6431n.m10019a();
        if (this.b != null) {
            this.b.m9992a(this.f17588x);
        }
    }

    public int mo3315b(C4969a c4969a) {
        return C4969a.m9814a(c4969a);
    }

    protected final void mo2681b(String str) {
        C0819j h = this.f17587w.mo930h();
        if ((h == null ? C0819j.f2448n : h.f2449a) < 49) {
            super.mo2681b(str);
        } else {
            this.a.m9746s(this.a.f13792d.m1873a(str));
        }
    }

    protected final String mo2682c() {
        return C4981j.m9934b(this.f17587w.m1999m());
    }

    protected final void mo2683c(C6426r c6426r) {
        C0818h c0818h = this.a;
        C6426r c6426r2 = (C6426r) c6426r.mo883a();
        if (c6426r2 != null) {
            C4969a c4969a = (C4969a) c6426r.mo886b().mo883a();
            C6426r c6426r3 = (C6426r) c6426r.mo886b().mo886b().mo883a();
            ArrayList arrayList = new ArrayList();
            C4979a c4979a = null;
            if (c6426r3 != null) {
                c4979a = new C4979a(r0);
            }
            int i = c0818h.f2447b;
            mo899a(c6426r2);
            int i2 = c0818h.f2447b;
            if (i == i2) {
                throw new C0837c("empty try block");
            }
            boolean z = true;
            int i3 = r0.c ^ 1;
            if (i3 != 0) {
                c0818h.m9728e(167);
                arrayList.add(new Integer(c0818h.f2447b));
                c0818h.m9733g(0);
            }
            int b = m9900b();
            m9901b(1);
            while (c4969a != null) {
                C4973q c4973q = (C4973q) c4969a.f13818a;
                c4969a = c4969a.f13819b;
                C6422i c6422i = (C6422i) c4973q.mo883a();
                C6426r c6426r4 = (C6426r) c4973q.mo886b();
                c6422i.m15267b(b);
                C0851i a = r0.f17586v.m9941a(c6422i.m15271f());
                c6422i.m15266a(C4981j.m9934b(a.m1999m()));
                c0818h.m9712b(i, i2, c0818h.f2447b, c0818h.f13792d.m1872a(a));
                c0818h.m9731f(1);
                c0818h.m9736i(b);
                r0.c = false;
                if (c6426r4 != null) {
                    mo899a(c6426r4);
                }
                if (!r0.c) {
                    c0818h.m9728e(167);
                    arrayList.add(new Integer(c0818h.f2447b));
                    c0818h.m9733g(0);
                    i3 = 1;
                }
            }
            if (c6426r3 != null) {
                c4979a.m1946a(r0);
                i2 = c0818h.f2447b;
                c0818h.m9712b(i, i2, i2, 0);
                c0818h.m9731f(1);
                c0818h.m9736i(b);
                r0.c = false;
                mo899a(c6426r3);
                if (!r0.c) {
                    c0818h.m9735h(b);
                    c0818h.m9728e(191);
                }
                m15311a(c4979a.f13856a, c6426r3);
            }
            m9899a(arrayList, c0818h.f2447b);
            if (i3 != 0) {
                z = false;
            }
            r0.c = z;
            if (!(c6426r3 == null || i3 == 0)) {
                mo899a(c6426r3);
            }
        }
    }

    protected final String mo2684d() {
        return C4981j.m9934b(C4981j.m9930a(this.f17587w).m1999m());
    }

    protected final void mo2685d(C0833b c0833b) {
        C4990l a = m15306a(c0833b, true);
        if (a != null) {
            boolean z = this.f17589y;
            C0833b a2 = C4985r.m9972a(a);
            if (a2 == null) {
                m15304a(a, z);
                return;
            }
            a2.mo885a((C0834v) this);
            m15312a(a.m10060a());
        } else if (this.j == 0) {
            throw new C0837c(".length applied to a non array");
        } else {
            this.a.m9728e(190);
            this.h = 324;
            this.j = 0;
        }
    }

    protected final void mo2686h() {
        this.a.m9735h(0);
        this.a.m9720c(C4981j.m9930a(this.f17587w), "<init>", "()V");
    }
}
