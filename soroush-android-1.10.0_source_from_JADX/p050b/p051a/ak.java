package p050b.p051a;

final class ak {
    private C0826n[][] f2401a;
    private int f2402b;

    public ak() {
        this.f2401a = new C0826n[8][];
        this.f2402b = 0;
    }

    public ak(int i) {
        this.f2401a = new C0826n[(((i >> 7) & -8) + 8)][];
        this.f2402b = 0;
    }

    public final C0826n m1741a(int i) {
        if (i >= 0) {
            if (this.f2402b > i) {
                return this.f2401a[i >> 7][i & 127];
            }
        }
        return null;
    }

    public final void m1742a(C0826n c0826n) {
        int i = this.f2402b >> 7;
        int i2 = this.f2402b & 127;
        int length = this.f2401a.length;
        if (i >= length) {
            Object obj = new C0826n[(length + 8)][];
            System.arraycopy(this.f2401a, 0, obj, 0, length);
            this.f2401a = obj;
        }
        if (this.f2401a[i] == null) {
            this.f2401a[i] = new C0826n[128];
        }
        this.f2401a[i][i2] = c0826n;
        this.f2402b++;
    }
}
