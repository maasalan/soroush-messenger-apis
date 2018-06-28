package p050b.p051a;

import java.io.DataInputStream;
import java.util.Map;

public final class ag extends C0814d {
    ag(C0827p c0827p, int i, DataInputStream dataInputStream) {
        super(c0827p, i, dataInputStream);
    }

    private ag(C0827p c0827p, byte[] bArr) {
        super(c0827p, "LineNumberTable", bArr);
    }

    public final C0814d mo834a(C0827p c0827p, Map map) {
        byte[] bArr = this.c;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = bArr[i];
        }
        return new ag(c0827p, bArr2);
    }

    final void m9551a(int i, int i2, boolean z) {
        int i3 = 0;
        int a = C0817g.m1832a(this.c, 0);
        while (i3 < a) {
            int i4 = (i3 * 4) + 2;
            int a2 = C0817g.m1832a(this.c, i4);
            if (a2 > i || (z && a2 == i)) {
                C0817g.m1833a(a2 + i2, this.c, i4);
            }
            i3++;
        }
    }
}
