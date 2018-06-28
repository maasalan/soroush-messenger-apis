package p050b.p051a;

import java.io.DataInputStream;
import java.util.ArrayList;

public final class C0829w implements Cloneable {
    C0827p f2484a;
    public ArrayList f2485b;

    public C0829w(C0827p c0827p) {
        this.f2484a = c0827p;
        this.f2485b = new ArrayList();
    }

    C0829w(C0827p c0827p, DataInputStream dataInputStream) {
        this.f2484a = c0827p;
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        ArrayList arrayList = new ArrayList(readUnsignedShort);
        for (int i = 0; i < readUnsignedShort; i++) {
            arrayList.add(new C0830x(dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort()));
        }
        this.f2485b = arrayList;
    }

    private static int m1907a(int i, int i2, int i3, boolean z) {
        return (i > i2 || (z && i == i2)) ? i + i3 : i;
    }

    public final int m1908a(int i) {
        return ((C0830x) this.f2485b.get(i)).f2486a;
    }

    public final void m1909a(int i, int i2, int i3, int i4) {
        if (i < i2) {
            this.f2485b.add(new C0830x(i, i2, i3, i4));
        }
    }

    final void m1910a(int i, int i2, boolean z) {
        int size = this.f2485b.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0830x c0830x = (C0830x) this.f2485b.get(i3);
            c0830x.f2486a = C0829w.m1907a(c0830x.f2486a, i, i2, z);
            c0830x.f2487b = C0829w.m1907a(c0830x.f2487b, i, i2, z);
            c0830x.f2488c = C0829w.m1907a(c0830x.f2488c, i, i2, z);
        }
    }

    public final int m1911b(int i) {
        return ((C0830x) this.f2485b.get(i)).f2488c;
    }

    public final Object clone() {
        C0829w c0829w = (C0829w) super.clone();
        c0829w.f2485b = new ArrayList(this.f2485b);
        return c0829w;
    }
}
