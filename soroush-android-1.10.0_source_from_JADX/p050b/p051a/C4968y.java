package p050b.p051a;

import java.io.DataInputStream;
import java.util.Map;

public final class C4968y extends C0814d {
    public C4968y(C0827p c0827p) {
        super(c0827p, "Exceptions");
        this.c = new byte[]{(byte) 0, (byte) 0};
    }

    C4968y(C0827p c0827p, int i, DataInputStream dataInputStream) {
        super(c0827p, i, dataInputStream);
    }

    private C4968y(C0827p c0827p, C4968y c4968y, Map map) {
        super(c0827p, "Exceptions");
        c0827p = c4968y.a;
        C0827p c0827p2 = this.a;
        byte[] bArr = c4968y.c;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        bArr2[0] = bArr[0];
        bArr2[1] = bArr[1];
        for (int i = 2; i < length; i += 2) {
            C0817g.m1833a(c0827p.m1868a(C0817g.m1832a(bArr, i), c0827p2, map), bArr2, i);
        }
        this.c = bArr2;
    }

    public final C0814d mo834a(C0827p c0827p, Map map) {
        return new C4968y(c0827p, this, map);
    }

    public final void m9812a(String[] strArr) {
        int i = 0;
        int length = strArr.length;
        byte[] bArr = new byte[((length * 2) + 2)];
        C0817g.m1833a(length, bArr, 0);
        while (i < length) {
            C0817g.m1833a(this.a.m1873a(strArr[i]), bArr, (i * 2) + 2);
            i++;
        }
        this.c = bArr;
    }

    public final String[] m9813e() {
        byte[] bArr = this.c;
        int i = 2;
        int length = bArr.length;
        if (length <= 2) {
            return null;
        }
        String[] strArr = new String[((length / 2) - 1)];
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            strArr[i2] = this.a.m1884c(((bArr[i] & 255) << 8) | (bArr[i + 1] & 255));
            i += 2;
            i2 = i3;
        }
        return strArr;
    }
}
