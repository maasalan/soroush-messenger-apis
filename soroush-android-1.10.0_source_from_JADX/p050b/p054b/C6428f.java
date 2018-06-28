package p050b.p054b;

import p050b.C0848e;
import p050b.C0851i;
import p050b.C4993s;
import p050b.p054b.p055a.C0833b;
import p050b.p054b.p055a.C0834v;
import p050b.p054b.p055a.C4969a;
import p050b.p054b.p055a.C4975t;
import p050b.p054b.p055a.C6420g;
import p050b.p054b.p055a.C6423k;
import p050b.p054b.p055a.C6424o;
import p050b.p054b.p055a.C7031f;

public final class C6428f extends C4985r {
    private C7033e f17585g;

    public C6428f(C0851i c0851i, C0848e c0848e, C7033e c7033e) {
        super(c0851i, c0848e);
        this.f17585g = c7033e;
    }

    private void m15296a(C0851i c0851i) {
        if (c0851i == C0851i.f2544l) {
            if (this.a == 344) {
                this.a = 307;
                this.b = 0;
                this.c = "java/lang/Object";
            }
            return;
        }
        m15297a(c0851i, 0);
    }

    private void m15297a(p050b.C0851i r3, int r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r3.mo943l();
        if (r0 == 0) goto L_0x0016;
    L_0x0006:
        r3 = (p050b.C4993s) r3;
        r3 = r3.f13896a;
        r3 = p050b.p054b.C4981j.m9927a(r3);
        r2.a = r3;
        r2.b = r4;
        r3 = 0;
    L_0x0013:
        r2.c = r3;
        return;
    L_0x0016:
        r0 = r3.mo913b();
        if (r0 == 0) goto L_0x003e;
    L_0x001c:
        r0 = r3.mo916e();	 Catch:{ w -> 0x0026 }
        r4 = r4 + 1;	 Catch:{ w -> 0x0026 }
        r2.m15297a(r0, r4);	 Catch:{ w -> 0x0026 }
        return;
    L_0x0026:
        r4 = new b.b.c;
        r0 = new java.lang.StringBuilder;
        r1 = "undefined type: ";
        r0.<init>(r1);
        r3 = r3.m1999m();
        r0.append(r3);
        r3 = r0.toString();
        r4.<init>(r3);
        throw r4;
    L_0x003e:
        r0 = 307; // 0x133 float:4.3E-43 double:1.517E-321;
        r2.a = r0;
        r2.b = r4;
        r3 = r3.m1999m();
        r3 = p050b.p054b.C4981j.m9934b(r3);
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.f.a(b.i, int):void");
    }

    public final int mo2673a(C4969a c4969a) {
        String str = this.f17585g.f20048n;
        int i = 0;
        while (c4969a != null) {
            C0833b c0833b = c4969a.f13818a;
            if (!(c0833b instanceof C6424o) || !((C6424o) c0833b).m9844d().equals(str)) {
                i++;
            } else if (this.f17585g.f20049o != null) {
                i += this.f17585g.f20049o.length;
            }
            c4969a = c4969a.f13819b;
        }
        return i;
    }

    public final void mo2674a(C4969a c4969a, int[] iArr, int[] iArr2, String[] strArr) {
        C0851i[] c0851iArr = this.f17585g.f20049o;
        String str = this.f17585g.f20048n;
        int i = 0;
        while (c4969a != null) {
            C0833b c0833b = c4969a.f13818a;
            if (!(c0833b instanceof C6424o) || !((C6424o) c0833b).m9844d().equals(str)) {
                c0833b.mo885a((C0834v) this);
                iArr[i] = this.a;
                iArr2[i] = this.b;
                strArr[i] = this.c;
                i++;
            } else if (c0851iArr != null) {
                int i2 = i;
                for (C0851i a : c0851iArr) {
                    m15297a(a, 0);
                    iArr[i2] = this.a;
                    iArr2[i2] = this.b;
                    strArr[i2] = this.c;
                    i2++;
                }
                i = i2;
            }
            c4969a = c4969a.f13819b;
        }
    }

    public final void mo906a(C7031f c7031f) {
        C0833b a = c7031f.mo883a();
        if (a instanceof C6424o) {
            String d = ((C6424o) a).m9844d();
            if (this.f17585g.f20055u != null && d.equals(this.f17585g.f20054t)) {
                C0841m c0841m = this.f17585g.f20055u;
                return;
            } else if (d.equals("$cflow")) {
                this.a = 324;
                this.b = 0;
                this.c = null;
                return;
            }
        }
        super.mo906a(c7031f);
    }

    public final void mo891a(C6420g c6420g) {
        C4969a c4969a = (C4969a) c6420g.mo883a();
        if (c4969a != null && c6420g.m15257e() == 0) {
            C0833b c0833b = c4969a.f13818a;
            if ((c0833b instanceof C4975t) && c4969a.f13819b == null) {
                String d = ((C4975t) c0833b).m9844d();
                if (d.equals(this.f17585g.f20052r)) {
                    C0851i c0851i = this.f17585g.f20051q;
                    c6420g.mo886b().mo883a().mo885a((C0834v) this);
                    if (!(this.a == 344 || C4977b.m9869d(this.a))) {
                        if (this.b <= 0) {
                            if (c0851i instanceof C4993s) {
                                this.a = C4981j.m9927a(((C4993s) c0851i).f13896a);
                                this.b = 0;
                                this.c = null;
                            }
                            return;
                        }
                    }
                    m15296a(c0851i);
                    return;
                } else if (d.equals("$w")) {
                    c6420g.mo886b().mo883a().mo885a((C0834v) this);
                    if (!C4977b.m9869d(this.a) && this.b <= 0 && (this.d.m9939a(this.a, this.b, this.c) instanceof C4993s)) {
                        this.a = 307;
                        this.b = 0;
                        this.c = "java/lang/Object";
                    }
                    return;
                }
            }
        }
        super.mo891a(c6420g);
    }

    protected final void mo2675a(C6423k c6423k, int i, C0833b c0833b, C0833b c0833b2) {
        if ((c0833b instanceof C6424o) && ((C6424o) c0833b).m9844d().equals(this.f17585g.f20047m)) {
            c0833b2.mo885a((C0834v) this);
            C0851i[] c0851iArr = this.f17585g.f20049o;
            if (c0851iArr != null) {
                for (C0851i a : c0851iArr) {
                    m15296a(a);
                }
                return;
            }
            return;
        }
        super.mo2675a(c6423k, i, c0833b, c0833b2);
    }

    public final void mo907a(C6424o c6424o) {
        String str;
        String d = c6424o.m9844d();
        if (d.equals(this.f17585g.f20047m)) {
            this.a = 307;
            this.b = 1;
            str = "java/lang/Object";
        } else {
            if (d.equals("$sig")) {
                this.a = 307;
                this.b = 1;
            } else {
                if (!d.equals("$type")) {
                    if (!d.equals("$class")) {
                        super.mo907a(c6424o);
                        return;
                    }
                }
                this.a = 307;
                this.b = 0;
            }
            str = "java/lang/Class";
        }
        this.c = str;
    }
}
