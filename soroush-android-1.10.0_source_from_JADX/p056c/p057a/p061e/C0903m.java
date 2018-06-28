package p056c.p057a.p061e;

import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C0903m {
    int f2761a;
    final int[] f2762b = new int[10];

    final int m2200a() {
        return (this.f2761a & 2) != 0 ? this.f2762b[1] : -1;
    }

    final C0903m m2201a(int i, int i2) {
        if (i < 0 || i >= this.f2762b.length) {
            return this;
        }
        this.f2761a = (1 << i) | this.f2761a;
        this.f2762b[i] = i2;
        return this;
    }

    final boolean m2202a(int i) {
        return ((1 << i) & this.f2761a) != 0;
    }

    public final int m2203b() {
        return (this.f2761a & 128) != 0 ? this.f2762b[7] : InBandBytestreamManager.MAXIMUM_BLOCK_SIZE;
    }
}
