package p050b.p054b;

import java.util.Hashtable;
import p050b.C0848e;
import p050b.C0851i;
import p050b.C4993s;
import p050b.p051a.C0828s;
import p050b.p051a.C4954i;
import p050b.p054b.p055a.C0833b;
import p050b.p054b.p055a.C0834v;
import p050b.p054b.p055a.C4969a;
import p050b.p054b.p055a.C4975t;
import p050b.p054b.p055a.C6420g;
import p050b.p054b.p055a.C6422i;
import p050b.p054b.p055a.C6423k;
import p050b.p054b.p055a.C6424o;
import p050b.p054b.p055a.C6426r;
import p050b.p054b.p055a.C7031f;

public final class C7033e extends C6429i {
    private int f20044A = 0;
    private boolean f20045B = false;
    private String f20046C = null;
    String f20047m = null;
    String f20048n = null;
    C0851i[] f20049o = null;
    C0851i f20050p = null;
    C0851i f20051q = null;
    String f20052r = null;
    String f20053s = null;
    String f20054t = null;
    C0841m f20055u = null;

    public C7033e(C4954i c4954i, C0851i c0851i, C0848e c0848e) {
        super(c4954i, c0851i, c0848e);
        this.f13836b = new C6428f(c0851i, c0848e, this);
    }

    private void m18160a(p050b.C0851i r3, int r4) {
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
        r2.h = r3;
        r2.j = r4;
        r3 = 0;
    L_0x0013:
        r2.k = r3;
        return;
    L_0x0016:
        r0 = r3.mo913b();
        if (r0 == 0) goto L_0x003e;
    L_0x001c:
        r0 = r3.mo916e();	 Catch:{ w -> 0x0026 }
        r4 = r4 + 1;	 Catch:{ w -> 0x0026 }
        r2.m18160a(r0, r4);	 Catch:{ w -> 0x0026 }
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
        r2.h = r0;
        r2.j = r4;
        r3 = r3.m1999m();
        r3 = p050b.p054b.C4981j.m9934b(r3);
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.e.a(b.i, int):void");
    }

    private void m18161a(C0851i c0851i, C4954i c4954i) {
        if (c0851i == C0851i.f2544l) {
            if (this.h == 344) {
                this.a.m9728e(1);
                this.h = 307;
                this.j = 0;
                this.k = "java/lang/Object";
            }
        } else if (this.h == 344) {
            StringBuilder stringBuilder = new StringBuilder("invalid type for ");
            stringBuilder.append(this.f20052r);
            throw new C0837c(stringBuilder.toString());
        } else {
            if (c0851i instanceof C4993s) {
                C4993s c4993s = (C4993s) c0851i;
                String str = c4993s.f13897n;
                c4954i.m9707a(str);
                c4954i.m9727d(str, c4993s.f13898o, c4993s.f13899p);
            } else {
                c4954i.m9704a(c0851i);
            }
            m18160a(c0851i, 0);
        }
    }

    private static void m18162a(StringBuffer stringBuffer, C0833b c0833b) {
        while (!(c0833b instanceof C4975t)) {
            if (c0833b instanceof C6423k) {
                C6423k c6423k = (C6423k) c0833b;
                if (c6423k.m15278d() == 46) {
                    C7033e.m18162a(stringBuffer, c6423k.mo883a());
                    stringBuffer.append('.');
                    c0833b = c6423k.mo886b().mo883a();
                }
            }
            throw new C0837c("bad $cflow");
        }
        stringBuffer.append(((C4975t) c0833b).m9844d());
    }

    private void m18163a(C0851i[] c0851iArr, C4954i c4954i) {
        if (c0851iArr != null) {
            int i = m18165i();
            int length = c0851iArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                c4954i.m9728e(89);
                c4954i.m9737j(i2);
                c4954i.m9728e(50);
                m18161a(c0851iArr[i2], c4954i);
                c4954i.m9709b(i, c0851iArr[i2]);
                i += C4977b.m9856a(this.h, this.j) ? 2 : 1;
            }
        }
    }

    private void m18164c(String str) {
        this.a.m9722c("javassist/runtime/Desc", str, "(Ljava/lang/String;)Ljava/lang/Class;");
        this.h = 307;
        this.j = 0;
        this.k = "java/lang/Class";
    }

    private int m18165i() {
        return this.f20044A + this.f20045B;
    }

    public final int m18166a(C0851i[] c0851iArr, boolean z, String str, String str2, String str3, C0842n c0842n) {
        int i;
        boolean z2 = z ^ 1;
        String c = mo2682c();
        this.f20049o = c0851iArr;
        this.f20047m = str2;
        this.f20048n = str3;
        this.f20044A = 0;
        this.f20045B = z2;
        if (c != null) {
            this.f20046C = C4981j.m9936c(c);
        }
        this.d = z;
        if (z2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("0");
            str3 = stringBuilder.toString();
            c0842n.put(str3, new C6422i(307, C4981j.m9934b(c), 0, 0, new C4975t(str3)));
            i = 1;
        } else {
            i = 0;
        }
        int i2 = i;
        i = 0;
        while (i < c0851iArr.length) {
            C0851i c0851i = c0851iArr[i];
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            i++;
            stringBuilder2.append(i);
            String stringBuilder3 = stringBuilder2.toString();
            if (c0851i == C0851i.f2544l) {
                this.h = 307;
                this.j = 0;
                this.k = "java/lang/Object";
            } else {
                m18160a(c0851i, 0);
            }
            c0842n.put(stringBuilder3, new C6422i(this.h, this.k, this.j, i2, new C4975t(stringBuilder3)));
            i2 += C4977b.m9856a(this.h, this.j) ? 2 : 1;
        }
        if (m9900b() < i2) {
            m9878a(i2);
        }
        return i2;
    }

    public final void mo3314a(C4969a c4969a, int[] iArr, int[] iArr2, String[] strArr) {
        C0851i[] c0851iArr = this.f20049o;
        String str = this.f20048n;
        int i = 0;
        while (c4969a != null) {
            C0833b c0833b = c4969a.f13818a;
            if (!(c0833b instanceof C6424o) || !((C6424o) c0833b).m9844d().equals(str)) {
                c0833b.mo885a((C0834v) this);
                iArr[i] = this.h;
                iArr2[i] = this.j;
                strArr[i] = this.k;
                i++;
            } else if (c0851iArr != null) {
                int i2 = m18165i();
                int i3 = i;
                for (C0851i c0851i : c0851iArr) {
                    i2 += this.a.m9694a(i2, c0851i);
                    m18160a(c0851i, 0);
                    iArr[i3] = this.h;
                    iArr2[i3] = this.j;
                    strArr[i3] = this.k;
                    i3++;
                }
                i = i3;
            }
            c4969a = c4969a.f13819b;
        }
    }

    public final void mo906a(C7031f c7031f) {
        C0833b a = c7031f.mo883a();
        if (a instanceof C6424o) {
            String d = ((C6424o) a).m9844d();
            if (this.f20055u != null && d.equals(this.f20054t)) {
                return;
            }
            if (d.equals("$cflow")) {
                C4969a c4969a = (C4969a) c7031f.mo886b().mo883a();
                StringBuffer stringBuffer = new StringBuffer();
                if (c4969a != null) {
                    if (c4969a.f13819b == null) {
                        C7033e.m18162a(stringBuffer, c4969a.f13818a);
                        String stringBuffer2 = stringBuffer.toString();
                        C0848e c0848e = this.v.f13862a;
                        if (c0848e.f2529g == null) {
                            c0848e.f2529g = new Hashtable();
                        }
                        Object[] objArr = (Object[]) c0848e.f2529g.get(stringBuffer2);
                        if (objArr == null) {
                            StringBuilder stringBuilder = new StringBuilder("no such $cflow: ");
                            stringBuilder.append(stringBuffer2);
                            throw new C0837c(stringBuilder.toString());
                        }
                        this.a.m9708a((String) objArr[0], (String) objArr[1], "Ljavassist/runtime/Cflow;");
                        this.a.m9727d("javassist.runtime.Cflow", "value", "()I");
                        this.h = 324;
                        this.j = 0;
                        this.k = null;
                        return;
                    }
                }
                throw new C0837c("bad $cflow");
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
                if (d.equals(this.f20052r)) {
                    c6420g.mo886b().mo883a().mo885a((C0834v) this);
                    if (!(this.h == 344 || C4977b.m9869d(this.h))) {
                        if (this.j <= 0) {
                            if (this.f20051q instanceof C4993s) {
                                int a = C4981j.m9927a(((C4993s) this.f20051q).f13896a);
                                m9908d(this.h, a);
                                this.h = a;
                                this.j = 0;
                                this.k = null;
                                return;
                            }
                            throw new C0837c("invalid cast");
                        }
                    }
                    m18161a(this.f20051q, this.a);
                    return;
                } else if (d.equals("$w")) {
                    c6420g.mo886b().mo883a().mo885a((C0834v) this);
                    if (!C4977b.m9869d(this.h) && this.j <= 0) {
                        C0851i a2 = this.v.m9939a(this.h, this.j, this.k);
                        if (a2 instanceof C4993s) {
                            C4954i c4954i;
                            int i;
                            C4993s c4993s = (C4993s) a2;
                            d = c4993s.f13897n;
                            this.a.m9726d(d);
                            this.a.m9728e(89);
                            if (c4993s.f13901r > 1) {
                                c4954i = this.a;
                                i = 94;
                            } else {
                                c4954i = this.a;
                                i = 93;
                            }
                            c4954i.m9728e(i);
                            this.a.m9728e(88);
                            StringBuilder stringBuilder = new StringBuilder("(");
                            stringBuilder.append(c4993s.f13896a);
                            stringBuilder.append(")V");
                            this.a.m9716b(d, "<init>", stringBuilder.toString());
                            this.h = 307;
                            this.j = 0;
                            this.k = "java/lang/Object";
                        }
                        return;
                    }
                    return;
                }
            }
        }
        super.mo891a(c6420g);
    }

    protected final void mo2680a(C6423k c6423k, int i, C0833b c0833b, C0833b c0833b2, boolean z) {
        if (!(c0833b instanceof C6424o) || !((C6424o) c0833b).m9844d().equals(this.f20047m)) {
            super.mo2680a(c6423k, i, c0833b, c0833b2, z);
        } else if (i != 61) {
            r4 = new StringBuilder("bad operator for ");
            r4.append(this.f20047m);
            throw new C0837c(r4.toString());
        } else {
            c0833b2.mo885a((C0834v) this);
            if (this.j == 1) {
                if (this.h == 307) {
                    m18163a(this.f20049o, this.a);
                    if (!z) {
                        this.a.m9728e(87);
                        return;
                    }
                }
            }
            r4 = new StringBuilder("invalid type for ");
            r4.append(this.f20047m);
            throw new C0837c(r4.toString());
        }
    }

    public final void mo907a(C6424o c6424o) {
        String d = c6424o.m9844d();
        if (d.equals(this.f20047m)) {
            C4954i c4954i = this.a;
            C0851i[] c0851iArr = this.f20049o;
            int i = m18165i();
            if (c0851iArr == null) {
                c4954i.m9737j(0);
                c4954i.m9730e("java.lang.Object");
            } else {
                C0851i[] c0851iArr2 = new C0851i[1];
                int length = c0851iArr.length;
                c4954i.m9737j(length);
                c4954i.m9730e("java.lang.Object");
                int i2 = i;
                for (i = 0; i < length; i++) {
                    c4954i.m9728e(89);
                    c4954i.m9737j(i);
                    if (c0851iArr[i].mo943l()) {
                        C0851i c0851i = (C4993s) c0851iArr[i];
                        String str = c0851i.f13897n;
                        c4954i.m9726d(str);
                        c4954i.m9728e(89);
                        i2 += c4954i.m9694a(i2, c0851i);
                        c0851iArr2[0] = c0851i;
                        c4954i.m9716b(str, "<init>", C0828s.m1896a(C0851i.f2544l, c0851iArr2));
                    } else {
                        c4954i.m9735h(i2);
                        i2++;
                    }
                    c4954i.m9728e(83);
                }
            }
            this.h = 307;
            this.j = 1;
            this.k = "java/lang/Object";
        } else if (d.equals("$sig")) {
            this.a.m9721c(C0828s.m1896a(this.f20051q, this.f20049o));
            this.a.m9722c("javassist/runtime/Desc", "getParams", "(Ljava/lang/String;)[Ljava/lang/Class;");
            this.h = 307;
            this.j = 1;
            this.k = "java/lang/Class";
        } else if (d.equals("$type")) {
            if (this.f20050p == null) {
                throw new C0837c("$type is not available");
            }
            this.a.m9721c(C0828s.m1902b(this.f20050p));
            m18164c("getType");
        } else if (!d.equals("$class")) {
            super.mo907a(c6424o);
        } else if (this.f20046C == null) {
            throw new C0837c("$class is not available");
        } else {
            this.a.m9721c(this.f20046C);
            m18164c("getClazz");
        }
    }

    public final int mo3315b(C4969a c4969a) {
        String str = this.f20048n;
        int i = 0;
        while (c4969a != null) {
            C0833b c0833b = c4969a.f13818a;
            if (!(c0833b instanceof C6424o) || !((C6424o) c0833b).m9844d().equals(str)) {
                i++;
            } else if (this.f20049o != null) {
                i += this.f20049o.length;
            }
            c4969a = c4969a.f13819b;
        }
        return i;
    }

    protected final void mo3316b(C6426r c6426r) {
        C0833b a = c6426r.mo883a();
        if (a != null && this.f20051q == C0851i.f2544l) {
            C4954i c4954i;
            int i;
            m9881a(a);
            if (C4977b.m9856a(this.h, this.j)) {
                c4954i = this.a;
                i = 88;
            } else {
                if (this.h != 344) {
                    c4954i = this.a;
                    i = 87;
                }
                a = null;
            }
            c4954i.m9728e(i);
            a = null;
        }
        m9902b(a);
    }
}
