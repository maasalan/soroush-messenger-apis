package p050b.p051a;

import java.io.DataInputStream;
import java.util.Map;

public final class C4963q extends C0814d {
    public C4963q(C0827p c0827p, int i) {
        super(c0827p, "ConstantValue");
        mo875a(new byte[]{(byte) (i >>> 8), (byte) i});
    }

    C4963q(C0827p c0827p, int i, DataInputStream dataInputStream) {
        super(c0827p, i, dataInputStream);
    }

    public final C0814d mo834a(C0827p c0827p, Map map) {
        return new C4963q(c0827p, m1829b().m1868a(m9802e(), c0827p, map));
    }

    public final int m9802e() {
        return C0817g.m1832a(mo877d(), 0);
    }
}
