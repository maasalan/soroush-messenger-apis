package p050b.p051a.p052a;

import org.msgpack.util.TemplatePrecompiler;
import p050b.p051a.C0827p;
import p050b.p051a.C0828s;

public final class C4928j extends C0797n {
    int f13728a;
    int f13729b;

    public C4928j(int i, int i2, C0827p c0827p) {
        super('e', c0827p);
        this.f13728a = i;
        this.f13729b = i2;
    }

    private String m9533a() {
        return C0828s.m1903b(this.c.m1892j(this.f13728a));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m9533a());
        stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
        stringBuilder.append(this.c.m1892j(this.f13729b));
        return stringBuilder.toString();
    }
}
