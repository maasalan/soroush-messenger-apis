package p050b.p051a;

import java.io.DataInputStream;
import java.util.Map;
import p050b.p051a.C4952c.C4950a;
import p050b.p051a.C4952c.C4951b;
import p050b.p051a.p052a.C0795a;

public final class as extends C0814d {
    as(C0827p c0827p, int i, DataInputStream dataInputStream) {
        super(c0827p, i, dataInputStream);
    }

    private as(C0827p c0827p, String str, byte[] bArr) {
        super(c0827p, str, bArr);
    }

    private C0795a[][] m9576e() {
        try {
            C4951b c4951b = new C4951b(this.c, this.a);
            c4951b.m1812b();
            return c4951b.f13787b;
        } catch (Exception e) {
            throw new RuntimeException(e.toString());
        }
    }

    public final C0814d mo834a(C0827p c0827p, Map map) {
        C4950a c4950a = new C4950a(this.c, this.a, c0827p, map);
        try {
            c4950a.m1812b();
            return new as(c0827p, m1826a(), c4950a.m9673a());
        } catch (Exception e) {
            throw new RuntimeException(e.toString());
        }
    }

    public final String toString() {
        C0795a[][] e = m9576e();
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < e.length) {
            int i2 = i + 1;
            C0795a[] c0795aArr = e[i];
            int i3 = 0;
            while (i3 < c0795aArr.length) {
                int i4 = i3 + 1;
                stringBuilder.append(c0795aArr[i3].toString());
                if (i4 != c0795aArr.length) {
                    stringBuilder.append(" ");
                }
                i3 = i4;
            }
            if (i2 != e.length) {
                stringBuilder.append(", ");
            }
            i = i2;
        }
        return stringBuilder.toString();
    }
}
