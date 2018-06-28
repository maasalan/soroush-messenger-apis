package p050b.p054b;

import java.util.HashMap;
import p050b.C0832a;
import p050b.C0848e;
import p050b.C0851i;
import p050b.C0858w;
import p050b.p051a.C0819j;
import p050b.p051a.C0827p;
import p050b.p051a.C0828s;
import p050b.p051a.C0831z;
import p050b.p051a.C4954i;
import p050b.p051a.C4968y;
import p050b.p051a.an;
import p050b.p051a.ay;

public final class C0835a {
    private C0851i f2498a;
    private int f2499b = 1;
    private HashMap f2500c = new HashMap();

    public C0835a(C0851i c0851i) {
        this.f2498a = c0851i;
    }

    private String m1941a(C0819j c0819j) {
        String stringBuilder;
        do {
            StringBuilder stringBuilder2 = new StringBuilder("access$");
            int i = this.f2499b;
            this.f2499b = i + 1;
            stringBuilder2.append(i);
            stringBuilder = stringBuilder2.toString();
        } while (c0819j.m1843a(stringBuilder) != null);
        return stringBuilder;
    }

    public final an m1942a(C0831z c0831z, boolean z) {
        String a = c0831z.m1913a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a);
        stringBuilder.append(":getter");
        String stringBuilder2 = stringBuilder.toString();
        Object obj = this.f2500c.get(stringBuilder2);
        if (obj != null) {
            return (an) obj;
        }
        C0819j g = this.f2498a.m1993g();
        String a2 = m1941a(g);
        try {
            StringBuilder stringBuilder3;
            C0827p c0827p = g.f2451c;
            C0848e a3 = this.f2498a.mo911a();
            String b = c0831z.m1914b();
            if (z) {
                stringBuilder3 = new StringBuilder("()");
                stringBuilder3.append(b);
            } else {
                stringBuilder3 = new StringBuilder("(");
                stringBuilder3.append(C0828s.m1902b(this.f2498a));
                stringBuilder3.append(")");
                stringBuilder3.append(b);
            }
            an anVar = new an(c0827p, a2, stringBuilder3.toString());
            anVar.f2405b = 8;
            anVar.m1745a(new ay(c0827p));
            C4954i c4954i = new C4954i(c0827p);
            if (z) {
                c4954i.m9714b(C4954i.f13791c, a, b);
            } else {
                c4954i.m9735h(0);
                c4954i.m9705a(C4954i.f13791c, a, b);
                c4954i.f13794f = 1;
            }
            c4954i.m9713b(C0828s.m1905c(b, a3));
            anVar.m1746a(c4954i.m9696a());
            g.m1845a(anVar);
            this.f2500c.put(stringBuilder2, anVar);
            return anVar;
        } catch (C0832a e) {
            throw new C0837c(e);
        } catch (C0858w e2) {
            throw new C0837c(e2);
        }
    }

    public final String m1943a(String str, an anVar) {
        StringBuilder stringBuilder = new StringBuilder("<init>:");
        stringBuilder.append(str);
        String stringBuilder2 = stringBuilder.toString();
        String str2 = (String) this.f2500c.get(stringBuilder2);
        if (str2 != null) {
            return str2;
        }
        str2 = "javassist.runtime.Inner";
        int indexOf = str.indexOf(41);
        int i = 0;
        if (indexOf < 0) {
            str2 = str;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str.substring(0, indexOf));
            stringBuffer.append('L');
            stringBuffer.append(str2.replace('.', '/'));
            stringBuffer.append(';');
            stringBuffer.append(str.substring(indexOf));
            str2 = stringBuffer.toString();
        }
        C0819j g = this.f2498a.m1993g();
        try {
            C0827p c0827p = g.f2451c;
            C0848e a = this.f2498a.mo911a();
            an anVar2 = new an(c0827p, "<init>", str2);
            anVar2.f2405b = 0;
            anVar2.m1745a(new ay(c0827p));
            C4968y e = anVar.m1751e();
            if (e != null) {
                anVar2.m1745a(e.mo834a(c0827p, null));
            }
            C0851i[] a2 = C0828s.m1900a(str, a);
            C4954i c4954i = new C4954i(c0827p);
            c4954i.m9735h(0);
            int i2 = 1;
            while (i < a2.length) {
                i2 += c4954i.m9694a(i2, a2[i]);
                i++;
            }
            c4954i.f13794f = i2 + 1;
            c4954i.m9720c(this.f2498a, "<init>", str);
            c4954i.m9713b(null);
            anVar2.m1746a(c4954i.m9696a());
            g.m1845a(anVar2);
            this.f2500c.put(stringBuilder2, str2);
            return str2;
        } catch (C0832a e2) {
            throw new C0837c(e2);
        } catch (C0858w e3) {
            throw new C0837c(e3);
        }
    }

    public final String m1944a(String str, String str2, String str3, an anVar) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(str2);
        String stringBuilder2 = stringBuilder.toString();
        String str4 = (String) this.f2500c.get(stringBuilder2);
        if (str4 != null) {
            return str4;
        }
        C0819j g = this.f2498a.m1993g();
        String a = m1941a(g);
        try {
            C0827p c0827p = g.f2451c;
            C0848e a2 = this.f2498a.mo911a();
            an anVar2 = new an(c0827p, a, str3);
            anVar2.f2405b = 8;
            anVar2.m1745a(new ay(c0827p));
            C4968y e = anVar.m1751e();
            if (e != null) {
                anVar2.m1745a(e.mo834a(c0827p, null));
            }
            C0851i[] a3 = C0828s.m1900a(str3, a2);
            C4954i c4954i = new C4954i(c0827p);
            int i = 0;
            int i2 = 0;
            while (i < a3.length) {
                i2 += c4954i.m9694a(i2, a3[i]);
                i++;
            }
            c4954i.f13794f = i2;
            if (str2 == str3) {
                c4954i.m9725d(this.f2498a, str, str2);
            } else {
                c4954i.m9729e(this.f2498a, str, str2);
            }
            c4954i.m9713b(C0828s.m1901b(str2, a2));
            anVar2.m1746a(c4954i.m9696a());
            g.m1845a(anVar2);
            this.f2500c.put(stringBuilder2, a);
            return a;
        } catch (C0832a e2) {
            throw new C0837c(e2);
        } catch (C0858w e3) {
            throw new C0837c(e3);
        }
    }

    public final an m1945b(C0831z c0831z, boolean z) {
        String a = c0831z.m1913a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a);
        stringBuilder.append(":setter");
        String stringBuilder2 = stringBuilder.toString();
        Object obj = this.f2500c.get(stringBuilder2);
        if (obj != null) {
            return (an) obj;
        }
        C0819j g = this.f2498a.m1993g();
        String a2 = m1941a(g);
        try {
            StringBuilder stringBuilder3;
            int a3;
            C0827p c0827p = g.f2451c;
            C0848e a4 = this.f2498a.mo911a();
            String b = c0831z.m1914b();
            if (z) {
                stringBuilder3 = new StringBuilder("(");
                stringBuilder3.append(b);
                stringBuilder3.append(")V");
            } else {
                stringBuilder3 = new StringBuilder("(");
                stringBuilder3.append(C0828s.m1902b(this.f2498a));
                stringBuilder3.append(b);
                stringBuilder3.append(")V");
            }
            an anVar = new an(c0827p, a2, stringBuilder3.toString());
            anVar.f2405b = 8;
            anVar.m1745a(new ay(c0827p));
            C4954i c4954i = new C4954i(c0827p);
            if (z) {
                a3 = c4954i.m9694a(0, C0828s.m1905c(b, a4));
                c4954i.m9734g(C4954i.f13791c, a, b);
            } else {
                c4954i.m9735h(0);
                a3 = c4954i.m9694a(1, C0828s.m1905c(b, a4)) + 1;
                c4954i.m9732f(C4954i.f13791c, a, b);
            }
            c4954i.m9713b(null);
            c4954i.f13794f = a3;
            anVar.m1746a(c4954i.m9696a());
            g.m1845a(anVar);
            this.f2500c.put(stringBuilder2, anVar);
            return anVar;
        } catch (C0832a e) {
            throw new C0837c(e);
        } catch (C0858w e2) {
            throw new C0837c(e2);
        }
    }
}
