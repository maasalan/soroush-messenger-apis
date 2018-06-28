package p050b.p051a;

import java.io.DataInputStream;
import java.util.Map;

public class ah extends C0814d {
    ah(C0827p c0827p, int i, DataInputStream dataInputStream) {
        super(c0827p, i, dataInputStream);
    }

    ah(C0827p c0827p, String str, byte[] bArr) {
        super(c0827p, str, bArr);
    }

    ah mo2659a(C0827p c0827p, byte[] bArr) {
        return new ah(c0827p, "LocalVariableTable", bArr);
    }

    public final C0814d mo834a(C0827p c0827p, Map map) {
        C0827p c0827p2 = c0827p;
        byte[] d = mo877d();
        int i = 2;
        int i2 = 0;
        byte[] bArr = new byte[d.length];
        C0827p b = m1829b();
        C0814d a = mo2659a(c0827p2, bArr);
        int a2 = C0817g.m1832a(d, 0);
        C0817g.m1833a(a2, bArr, 0);
        while (i2 < a2) {
            int a3 = C0817g.m1832a(d, i);
            int i3 = i + 2;
            int a4 = C0817g.m1832a(d, i3);
            int i4 = i + 4;
            int a5 = C0817g.m1832a(d, i4);
            int i5 = i + 6;
            int a6 = C0817g.m1832a(d, i5);
            int i6 = i + 8;
            int i7 = a2;
            a2 = C0817g.m1832a(d, i6);
            C0817g.m1833a(a3, bArr, i);
            C0817g.m1833a(a4, bArr, i3);
            if (a5 != 0) {
                a5 = b.m1868a(a5, c0827p2, null);
            }
            C0817g.m1833a(a5, bArr, i4);
            if (a6 != 0) {
                a6 = c0827p2.m1883c(C0828s.m1898a(b.m1892j(a6), map));
            } else {
                Map map2 = map;
            }
            C0817g.m1833a(a6, bArr, i5);
            C0817g.m1833a(a2, bArr, i6);
            i += 10;
            i2++;
            a2 = i7;
            ah ahVar = this;
        }
        return a;
    }

    final void m9554a(int i, int i2, boolean z) {
        int i3 = 0;
        int a = C0817g.m1832a(this.c, 0);
        while (i3 < a) {
            int i4 = (i3 * 10) + 2;
            int a2 = C0817g.m1832a(this.c, i4);
            int i5 = i4 + 2;
            int a3 = C0817g.m1832a(this.c, i5);
            if (a2 <= i) {
                if (!z || a2 != i || a2 == 0) {
                    a2 += a3;
                    if (a2 > i || (z && a2 == i)) {
                        C0817g.m1833a(a3 + i2, this.c, i5);
                    }
                    i3++;
                }
            }
            C0817g.m1833a(a2 + i2, this.c, i4);
            i3++;
        }
    }
}
