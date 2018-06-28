package p050b.p051a;

import java.io.DataInputStream;
import java.util.ArrayList;

public final class C0831z {
    public C0827p f2490a;
    public int f2491b;
    int f2492c;
    String f2493d;
    int f2494e;
    ArrayList f2495f;

    private C0831z(C0827p c0827p) {
        this.f2490a = c0827p;
        this.f2491b = 0;
        this.f2495f = null;
    }

    C0831z(C0827p c0827p, DataInputStream dataInputStream) {
        this(c0827p);
        this.f2491b = dataInputStream.readUnsignedShort();
        this.f2492c = dataInputStream.readUnsignedShort();
        this.f2494e = dataInputStream.readUnsignedShort();
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        this.f2495f = new ArrayList();
        for (int i = 0; i < readUnsignedShort; i++) {
            this.f2495f.add(C0814d.m1820a(this.f2490a, dataInputStream));
        }
    }

    public final C0814d m1912a(String str) {
        return C0814d.m1821a(this.f2495f, str);
    }

    public final String m1913a() {
        if (this.f2493d == null) {
            this.f2493d = this.f2490a.m1892j(this.f2492c);
        }
        return this.f2493d;
    }

    public final String m1914b() {
        return this.f2490a.m1892j(this.f2494e);
    }

    public final int m1915c() {
        if ((this.f2491b & 8) == 0) {
            return 0;
        }
        C4963q c4963q = (C4963q) m1912a("ConstantValue");
        return c4963q == null ? 0 : c4963q.m9802e();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m1913a());
        stringBuilder.append(" ");
        stringBuilder.append(m1914b());
        return stringBuilder.toString();
    }
}
