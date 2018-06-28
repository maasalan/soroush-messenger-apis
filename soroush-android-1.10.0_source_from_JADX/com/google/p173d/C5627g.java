package com.google.p173d;

public final class C5627g extends C2044h {
    private final C2044h f15480c;

    public C5627g(C2044h c2044h) {
        super(c2044h.f6868a, c2044h.f6869b);
        this.f15480c = c2044h;
    }

    public final byte[] mo1767a() {
        byte[] a = this.f15480c.mo1767a();
        int i = this.f6868a * this.f6869b;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (255 - (a[i2] & 255));
        }
        return bArr;
    }

    public final byte[] mo1768a(int i, byte[] bArr) {
        byte[] a = this.f15480c.mo1768a(i, bArr);
        int i2 = this.f6868a;
        for (int i3 = 0; i3 < i2; i3++) {
            a[i3] = (byte) (255 - (a[i3] & 255));
        }
        return a;
    }

    public final boolean mo1769b() {
        return this.f15480c.mo1769b();
    }

    public final C2044h mo1770c() {
        return this.f15480c;
    }

    public final C2044h mo1771d() {
        return new C5627g(this.f15480c.mo1771d());
    }
}
