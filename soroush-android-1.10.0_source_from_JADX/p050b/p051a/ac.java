package p050b.p051a;

import java.io.DataInputStream;
import java.util.Map;

public final class ac extends C0814d {
    ac(C0827p c0827p, int i, DataInputStream dataInputStream) {
        super(c0827p, i, dataInputStream);
    }

    private ac(C0827p c0827p, byte[] bArr) {
        super(c0827p, "InnerClasses", bArr);
    }

    public final C0814d mo834a(C0827p c0827p, Map map) {
        C0827p c0827p2 = c0827p;
        Map map2 = map;
        byte[] d = mo877d();
        int i = 2;
        int i2 = 0;
        byte[] bArr = new byte[d.length];
        C0827p b = m1829b();
        C0814d acVar = new ac(c0827p2, bArr);
        int a = C0817g.m1832a(d, 0);
        C0817g.m1833a(a, bArr, 0);
        while (i2 < a) {
            int a2 = C0817g.m1832a(d, i);
            int i3 = i + 2;
            int a3 = C0817g.m1832a(d, i3);
            int i4 = i + 4;
            int a4 = C0817g.m1832a(d, i4);
            int i5 = i + 6;
            int a5 = C0817g.m1832a(d, i5);
            if (a2 != 0) {
                a2 = b.m1868a(a2, c0827p2, map2);
            }
            C0817g.m1833a(a2, bArr, i);
            if (a3 != 0) {
                a3 = b.m1868a(a3, c0827p2, map2);
            }
            C0817g.m1833a(a3, bArr, i3);
            if (a4 != 0) {
                a4 = b.m1868a(a4, c0827p2, map2);
            }
            C0817g.m1833a(a4, bArr, i4);
            C0817g.m1833a(a5, bArr, i5);
            i += 8;
            i2++;
        }
        return acVar;
    }

    public final String m9539a(int i) {
        i = C0817g.m1832a(mo877d(), (i * 8) + 2);
        return i == 0 ? null : this.a.m1884c(i);
    }

    public final String m9540b(int i) {
        i = C0817g.m1832a(mo877d(), (i * 8) + 4);
        return i == 0 ? null : this.a.m1884c(i);
    }

    public final int m9541e() {
        return C0817g.m1832a(mo877d(), 0);
    }
}
