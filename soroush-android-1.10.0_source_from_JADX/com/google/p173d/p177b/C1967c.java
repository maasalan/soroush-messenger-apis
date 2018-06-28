package com.google.p173d.p177b;

public final class C1967c {
    public int f6577a;
    public int f6578b;
    private final byte[] f6579c;

    public C1967c(byte[] bArr) {
        this.f6579c = bArr;
    }

    public final int m5423a() {
        return (8 * (this.f6579c.length - this.f6577a)) - this.f6578b;
    }

    public final int m5424a(int i) {
        if (i > 0 && i <= 32) {
            if (i <= m5423a()) {
                int i2;
                if (this.f6578b > 0) {
                    i2 = 8 - this.f6578b;
                    int i3 = i < i2 ? i : i2;
                    i2 -= i3;
                    i2 = (((255 >> (8 - i3)) << i2) & this.f6579c[this.f6577a]) >> i2;
                    i -= i3;
                    this.f6578b += i3;
                    if (this.f6578b == 8) {
                        this.f6578b = 0;
                        this.f6577a++;
                    }
                } else {
                    i2 = 0;
                }
                if (i <= 0) {
                    return i2;
                }
                while (i >= 8) {
                    i2 = (i2 << 8) | (this.f6579c[this.f6577a] & 255);
                    this.f6577a++;
                    i -= 8;
                }
                if (i <= 0) {
                    return i2;
                }
                int i4 = 8 - i;
                i2 = (i2 << i) | ((((255 >> i4) << i4) & this.f6579c[this.f6577a]) >> i4);
                this.f6578b += i;
                return i2;
            }
        }
        throw new IllegalArgumentException(String.valueOf(i));
    }
}
