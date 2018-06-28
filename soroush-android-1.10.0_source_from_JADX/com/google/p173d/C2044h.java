package com.google.p173d;

public abstract class C2044h {
    public final int f6868a;
    public final int f6869b;

    protected C2044h(int i, int i2) {
        this.f6868a = i;
        this.f6869b = i2;
    }

    public abstract byte[] mo1767a();

    public abstract byte[] mo1768a(int i, byte[] bArr);

    public boolean mo1769b() {
        return false;
    }

    public C2044h mo1770c() {
        return new C5627g(this);
    }

    public C2044h mo1771d() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        byte[] bArr = new byte[this.f6868a];
        StringBuilder stringBuilder = new StringBuilder(this.f6869b * (this.f6868a + 1));
        byte[] bArr2 = bArr;
        for (int i = 0; i < this.f6869b; i++) {
            bArr2 = mo1768a(i, bArr2);
            for (int i2 = 0; i2 < this.f6868a; i2++) {
                int i3 = bArr2[i2] & 255;
                char c = i3 < 64 ? '#' : i3 < 128 ? '+' : i3 < 192 ? '.' : ' ';
                stringBuilder.append(c);
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}
