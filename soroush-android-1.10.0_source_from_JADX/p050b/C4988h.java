package p050b;

import java.util.ArrayList;
import p050b.p051a.C0828s;
import p050b.p051a.C4968y;
import p050b.p051a.an;
import p050b.p054b.C0837c;
import p050b.p054b.C0838d;

public abstract class C4988h extends C0853m {
    protected an f13877a;

    protected C4988h(C0851i c0851i, an anVar) {
        super(c0851i);
        this.f13877a = anVar;
    }

    public final an m10019a() {
        return this.f13877a;
    }

    public final void m10020a(int i) {
        this.c.mo933k();
        this.f13877a.f2405b = i;
    }

    public void mo2687a(String str) {
        C0851i c0851i = this.c;
        c0851i.mo933k();
        try {
            this.f13877a.m1746a(new C0838d(c0851i).m1949a(this, str).m9696a());
            this.f13877a.f2405b &= -1025;
            this.f13877a.m1747a(c0851i.mo911a(), c0851i.mo930h());
            this.c.mo938t();
        } catch (C0837c e) {
            throw new C0832a(e);
        } catch (Throwable e2) {
            throw new C0832a(e2);
        }
    }

    protected final void mo918a(StringBuffer stringBuffer) {
        stringBuffer.append(' ');
        stringBuffer.append(mo941i());
        stringBuffer.append(' ');
        stringBuffer.append(this.f13877a.m1750d());
    }

    public final void m10023a(C0851i[] c0851iArr) {
        this.c.mo933k();
        if (c0851iArr != null) {
            if (c0851iArr.length != 0) {
                String[] strArr = new String[c0851iArr.length];
                for (int i = 0; i < c0851iArr.length; i++) {
                    strArr[i] = c0851iArr[i].m1999m();
                }
                C4968y e = this.f13877a.m1751e();
                if (e == null) {
                    e = new C4968y(this.f13877a.f2404a);
                    an anVar = this.f13877a;
                    anVar.m1753g();
                    if (anVar.f2409f == null) {
                        anVar.f2409f = new ArrayList();
                    }
                    anVar.f2409f.add(e);
                }
                e.m9812a(strArr);
                return;
            }
        }
        this.f13877a.m1753g();
    }

    public final int mo919b() {
        return this.f13877a.f2405b;
    }

    public final C0851i m10025d() {
        return C0828s.m1901b(this.f13877a.m1750d(), this.c.mo911a());
    }

    public final String mo920e() {
        return this.f13877a.m1750d();
    }

    public final C0851i[] m10027f() {
        C4968y e = this.f13877a.m1751e();
        String[] e2 = e == null ? null : e.m9813e();
        C0848e a = this.c.mo911a();
        int i = 0;
        if (e2 == null) {
            return new C0851i[0];
        }
        int length = e2.length;
        C0851i[] c0851iArr = new C0851i[length];
        while (i < length) {
            c0851iArr[i] = a.m1965a(e2[i]);
            i++;
        }
        return c0851iArr;
    }

    public final C0851i[] h_() {
        return C0828s.m1900a(this.f13877a.m1750d(), this.c.mo911a());
    }
}
