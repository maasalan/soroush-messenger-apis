package com.google.p173d.p177b;

import java.util.Arrays;

public final class C1966b implements Cloneable {
    public final int f6573a;
    public final int f6574b;
    public final int f6575c;
    public final int[] f6576d;

    public C1966b(int i) {
        this(i, i);
    }

    public C1966b(int i, int i2) {
        if (i > 0) {
            if (i2 > 0) {
                this.f6573a = i;
                this.f6574b = i2;
                this.f6575c = (i + 31) / 32;
                this.f6576d = new int[(this.f6575c * i2)];
                return;
            }
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    private C1966b(int i, int i2, int i3, int[] iArr) {
        this.f6573a = i;
        this.f6574b = i2;
        this.f6575c = i3;
        this.f6576d = iArr;
    }

    public final C1961a m5414a(int i, C1961a c1961a) {
        int i2;
        if (c1961a != null) {
            if (c1961a.f6554b >= this.f6573a) {
                c1961a.m5393a();
                i *= this.f6575c;
                for (i2 = 0; i2 < this.f6575c; i2++) {
                    int i3 = i2 << 5;
                    c1961a.f6553a[i3 / 32] = this.f6576d[i + i2];
                }
                return c1961a;
            }
        }
        c1961a = new C1961a(this.f6573a);
        i *= this.f6575c;
        for (i2 = 0; i2 < this.f6575c; i2++) {
            int i32 = i2 << 5;
            c1961a.f6553a[i32 / 32] = this.f6576d[i + i2];
        }
        return c1961a;
    }

    public final void m5415a(int i, int i2, int i3, int i4) {
        if (i2 >= 0) {
            if (i >= 0) {
                if (i4 > 0) {
                    if (i3 > 0) {
                        i3 += i;
                        i4 += i2;
                        if (i4 <= this.f6574b) {
                            if (i3 <= this.f6573a) {
                                while (i2 < i4) {
                                    int i5 = this.f6575c * i2;
                                    for (int i6 = i; i6 < i3; i6++) {
                                        int[] iArr = this.f6576d;
                                        int i7 = (i6 / 32) + i5;
                                        iArr[i7] = iArr[i7] | (1 << (i6 & 31));
                                    }
                                    i2++;
                                }
                                return;
                            }
                        }
                        throw new IllegalArgumentException("The region must fit inside the matrix");
                    }
                }
                throw new IllegalArgumentException("Height and width must be at least 1");
            }
        }
        throw new IllegalArgumentException("Left and top must be nonnegative");
    }

    public final boolean m5416a(int i, int i2) {
        return ((this.f6576d[(i2 * this.f6575c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public final int[] m5417a() {
        int i = 0;
        while (i < this.f6576d.length && this.f6576d[i] == 0) {
            i++;
        }
        if (i == this.f6576d.length) {
            return null;
        }
        int i2;
        int i3 = i / this.f6575c;
        int i4 = (i % this.f6575c) << 5;
        for (i2 = 0; (this.f6576d[i] << (31 - i2)) == 0; i2++) {
        }
        return new int[]{i4 + i2, i3};
    }

    public final void m5418b(int i, int i2) {
        i2 = (i2 * this.f6575c) + (i / 32);
        int[] iArr = this.f6576d;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public final void m5419b(int i, C1961a c1961a) {
        System.arraycopy(c1961a.f6553a, 0, this.f6576d, i * this.f6575c, this.f6575c);
    }

    public final int[] m5420b() {
        int length = this.f6576d.length - 1;
        while (length >= 0 && this.f6576d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i;
        int i2 = length / this.f6575c;
        int i3 = (length % this.f6575c) << 5;
        for (i = 31; (this.f6576d[length] >>> i) == 0; i--) {
        }
        return new int[]{i3 + i, i2};
    }

    public final C1966b m5421c() {
        return new C1966b(this.f6573a, this.f6574b, this.f6575c, (int[]) this.f6576d.clone());
    }

    public final void m5422c(int i, int i2) {
        i2 = (i2 * this.f6575c) + (i / 32);
        int[] iArr = this.f6576d;
        iArr[i2] = (1 << (i & 31)) ^ iArr[i2];
    }

    public final /* synthetic */ Object clone() {
        return m5421c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1966b)) {
            return false;
        }
        C1966b c1966b = (C1966b) obj;
        return this.f6573a == c1966b.f6573a && this.f6574b == c1966b.f6574b && this.f6575c == c1966b.f6575c && Arrays.equals(this.f6576d, c1966b.f6576d);
    }

    public final int hashCode() {
        return (((((((this.f6573a * 31) + this.f6573a) * 31) + this.f6574b) * 31) + this.f6575c) * 31) + Arrays.hashCode(this.f6576d);
    }

    public final String toString() {
        String str = "X ";
        String str2 = "  ";
        String str3 = "\n";
        StringBuilder stringBuilder = new StringBuilder(this.f6574b * (this.f6573a + 1));
        for (int i = 0; i < this.f6574b; i++) {
            for (int i2 = 0; i2 < this.f6573a; i2++) {
                stringBuilder.append(m5416a(i2, i) ? str : str2);
            }
            stringBuilder.append(str3);
        }
        return stringBuilder.toString();
    }
}
