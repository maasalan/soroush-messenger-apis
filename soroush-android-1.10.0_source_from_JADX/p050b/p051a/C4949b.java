package p050b.p051a;

import java.io.DataInputStream;
import java.util.Map;
import p050b.p051a.C4952c.C4950a;
import p050b.p051a.C4952c.C4951b;
import p050b.p051a.p052a.C0797n;

public final class C4949b extends C0814d {
    C4949b(C0827p c0827p, int i, DataInputStream dataInputStream) {
        super(c0827p, i, dataInputStream);
    }

    private C4949b(C0827p c0827p, byte[] bArr) {
        super(c0827p, "AnnotationDefault", bArr);
    }

    private C0797n m9666e() {
        try {
            C4951b c4951b = new C4951b(this.c, this.a);
            c4951b.m1816d(0);
            return c4951b.f13790e;
        } catch (Exception e) {
            throw new RuntimeException(e.toString());
        }
    }

    public final C0814d mo834a(C0827p c0827p, Map map) {
        C4950a c4950a = new C4950a(this.c, this.a, c0827p, map);
        try {
            c4950a.m1816d(0);
            return new C4949b(c0827p, c4950a.m9673a());
        } catch (Exception e) {
            throw new RuntimeException(e.toString());
        }
    }

    public final String toString() {
        return m9666e().toString();
    }
}
