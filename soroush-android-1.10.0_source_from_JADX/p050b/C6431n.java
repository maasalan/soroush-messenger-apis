package p050b;

import p050b.p051a.C0828s;
import p050b.p051a.an;

public final class C6431n extends C4988h {
    protected String f17590d;

    C6431n(an anVar, C0851i c0851i) {
        super(c0851i, anVar);
        this.f17590d = null;
    }

    public C6431n(C0851i c0851i, String str, C0851i[] c0851iArr, C0851i c0851i2) {
        this(null, c0851i2);
        this.a = new an(c0851i2.mo930h().f2451c, str, C0828s.m1896a(c0851i, c0851iArr));
        m10020a(1025);
    }

    private String m15339g() {
        if (this.f17590d == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a.m1744a());
            String d = this.a.m1750d();
            stringBuilder.append(d.substring(0, d.indexOf(41) + 1));
            this.f17590d = stringBuilder.toString();
        }
        return this.f17590d;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof C6431n) && ((C6431n) obj).m15339g().equals(m15339g());
    }

    public final int hashCode() {
        return m15339g().hashCode();
    }

    public final String mo941i() {
        return this.a.m1744a();
    }
}
