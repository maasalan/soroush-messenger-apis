package p050b.p051a.p052a;

import p050b.p051a.C0827p;

public final class C4922d extends C0797n {
    public C0797n f13721a = null;
    public C0797n[] f13722b = null;

    public C4922d(C0827p c0827p) {
        super('[', c0827p);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        if (this.f13722b != null) {
            int i = 0;
            while (i < this.f13722b.length) {
                stringBuffer.append(this.f13722b[i].toString());
                i++;
                if (i < this.f13722b.length) {
                    stringBuffer.append(", ");
                }
            }
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
