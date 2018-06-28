package p050b.p051a.p052a;

import p050b.p051a.C0827p;
import p050b.p051a.at;

public final class C4926h extends C0797n {
    int f13726a;

    public C4926h(int i, C0827p c0827p) {
        super('c', c0827p);
        this.f13726a = i;
    }

    private String m9532a() {
        try {
            return at.m9579a(this.c.m1892j(this.f13726a)).toString();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m9532a());
        stringBuilder.append(".class");
        return stringBuilder.toString();
    }
}
