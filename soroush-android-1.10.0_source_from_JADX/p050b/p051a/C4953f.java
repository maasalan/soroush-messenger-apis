package p050b.p051a;

import java.io.DataInputStream;
import java.util.Map;

public final class C4953f extends C0814d {

    public static class C0816a {
        public int f2444a;
        public int[] f2445b;

        public C0816a(int i, int[] iArr) {
            this.f2444a = i;
            this.f2445b = iArr;
        }
    }

    C4953f(C0827p c0827p, int i, DataInputStream dataInputStream) {
        super(c0827p, i, dataInputStream);
    }

    private C4953f(C0827p c0827p, C0816a[] c0816aArr) {
        super(c0827p, "BootstrapMethods");
        int i = 2;
        for (C0816a c0816a : c0816aArr) {
            i += 4 + (c0816a.f2445b.length * 2);
        }
        byte[] bArr = new byte[i];
        C0817g.m1833a(c0816aArr.length, bArr, 0);
        i = 2;
        int i2 = 0;
        while (i2 < c0816aArr.length) {
            C0817g.m1833a(c0816aArr[i2].f2444a, bArr, i);
            C0817g.m1833a(c0816aArr[i2].f2445b.length, bArr, i + 2);
            int[] iArr = c0816aArr[i2].f2445b;
            int i3 = i + 4;
            for (int a : iArr) {
                C0817g.m1833a(a, bArr, i3);
                i3 += 2;
            }
            i2++;
            i = i3;
        }
        mo875a(bArr);
    }

    public final C0814d mo834a(C0827p c0827p, Map map) {
        byte[] d = mo877d();
        int a = C0817g.m1832a(d, 0);
        C0816a[] c0816aArr = new C0816a[a];
        int i = 2;
        int i2 = 0;
        while (i2 < a) {
            int a2 = C0817g.m1832a(d, i);
            int a3 = C0817g.m1832a(d, i + 2);
            int[] iArr = new int[a3];
            int i3 = i + 4;
            for (i = 0; i < a3; i++) {
                iArr[i] = C0817g.m1832a(d, i3);
                i3 += 2;
            }
            c0816aArr[i2] = new C0816a(a2, iArr);
            i2++;
            i = i3;
        }
        C0827p b = m1829b();
        for (C0816a c0816a : c0816aArr) {
            c0816a.f2444a = b.m1868a(c0816a.f2444a, c0827p, map);
            for (i = 0; i < c0816a.f2445b.length; i++) {
                c0816a.f2445b[i] = b.m1868a(c0816a.f2445b[i], c0827p, map);
            }
        }
        return new C4953f(c0827p, c0816aArr);
    }
}
