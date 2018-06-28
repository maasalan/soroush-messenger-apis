package p050b;

import p050b.p051a.C0828s;
import p050b.p051a.an;

public final class C6430k extends C4988h {
    protected C6430k(an anVar, C0851i c0851i) {
        super(c0851i, anVar);
    }

    public C6430k(C0851i[] c0851iArr, C0851i c0851i) {
        this(null, c0851i);
        this.a = new an(c0851i.mo930h().f2451c, "<init>", C0828s.m1896a(C0851i.f2544l, c0851iArr));
        m10020a(1);
    }

    public final void mo2687a(String str) {
        if (str == null) {
            str = this.a.m1749c() ? ";" : "super();";
        }
        super.mo2687a(str);
    }

    public final boolean m15336g() {
        return this.a.m1748b();
    }

    public final boolean m15337h() {
        return this.a.m1749c();
    }

    public final String mo941i() {
        return this.a.m1749c() ? "<clinit>" : this.c.m2000n();
    }
}
