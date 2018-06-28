package p050b.p051a;

import java.io.DataInputStream;
import java.util.Map;

public final class C4967v extends C0814d {
    C4967v(C0827p c0827p, int i, DataInputStream dataInputStream) {
        super(c0827p, i, dataInputStream);
    }

    private C4967v(C0827p c0827p, String str) {
        super(c0827p, "EnclosingMethod");
        int a = c0827p.m1873a(str);
        mo875a(new byte[]{(byte) (a >>> 8), (byte) a, (byte) 0, (byte) 0});
    }

    private C4967v(C0827p c0827p, String str, String str2, String str3) {
        super(c0827p, "EnclosingMethod");
        int a = c0827p.m1873a(str);
        int a2 = c0827p.m1874a(str2, str3);
        mo875a(new byte[]{(byte) (a >>> 8), (byte) a, (byte) (a2 >>> 8), (byte) a2});
    }

    private int m9808f() {
        return C0817g.m1832a(mo877d(), 2);
    }

    public final C0814d mo834a(C0827p c0827p, Map map) {
        if (m9808f() == 0) {
            return new C4967v(c0827p, m9810e());
        }
        String e = m9810e();
        C0827p b = m1829b();
        String j = b.m1892j(((aq) b.m1875a(m9808f())).f13745a);
        C0827p b2 = m1829b();
        return new C4967v(c0827p, e, j, b2.m1892j(((aq) b2.m1875a(m9808f())).f13746c));
    }

    public final String m9810e() {
        return m1829b().m1884c(C0817g.m1832a(mo877d(), 0));
    }
}
