package p050b.p051a;

import java.io.DataInputStream;
import java.util.Map;

public final class au extends C0814d {
    au(C0827p c0827p, int i, DataInputStream dataInputStream) {
        super(c0827p, i, dataInputStream);
    }

    public au(C0827p c0827p, String str) {
        super(c0827p, "SourceFile");
        int c = c0827p.m1883c(str);
        mo875a(new byte[]{(byte) (c >>> 8), (byte) c});
    }

    public final C0814d mo834a(C0827p c0827p, Map map) {
        return new au(c0827p, m1829b().m1892j(C0817g.m1832a(mo877d(), 0)));
    }
}
