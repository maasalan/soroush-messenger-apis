package com.google.p173d.p177b;

import java.util.Arrays;

public final class C1961a implements Cloneable {
    int[] f6553a;
    public int f6554b;

    public C1961a() {
        this.f6554b = 0;
        this.f6553a = new int[1];
    }

    public C1961a(int i) {
        this.f6554b = i;
        this.f6553a = new int[((i + 31) / 32)];
    }

    private C1961a(int[] iArr, int i) {
        this.f6553a = iArr;
        this.f6554b = i;
    }

    public final void m5393a() {
        int length = this.f6553a.length;
        for (int i = 0; i < length; i++) {
            this.f6553a[i] = 0;
        }
    }

    public final boolean m5394a(int i) {
        return ((1 << (i & 31)) & this.f6553a[i / 32]) != 0;
    }

    public final boolean m5395a(int i, int i2) {
        if (i2 >= i && i >= 0) {
            if (i2 <= this.f6554b) {
                if (i2 == i) {
                    return true;
                }
                i2--;
                int i3 = i / 32;
                int i4 = i2 / 32;
                int i5 = i3;
                while (i5 <= i4) {
                    int i6 = 31;
                    int i7 = i5 > i3 ? 0 : i & 31;
                    if (i5 >= i4) {
                        i6 = 31 & i2;
                    }
                    if ((((2 << i6) - (1 << i7)) & this.f6553a[i5]) != 0) {
                        return false;
                    }
                    i5++;
                }
                return true;
            }
        }
        throw new IllegalArgumentException();
    }

    public final void m5396b() {
        int i;
        int[] iArr = new int[this.f6553a.length];
        int i2 = (this.f6554b - 1) / 32;
        int i3 = i2 + 1;
        for (i = 0; i < i3; i++) {
            long j = (long) r0.f6553a[i];
            long j2 = ((j >> 1) & 1431655765) | ((j & 1431655765) << 1);
            j2 = ((j2 >> 2) & 858993459) | ((j2 & 858993459) << 2);
            j2 = ((j2 >> 4) & 252645135) | ((j2 & 252645135) << 4);
            j2 = ((j2 >> 8) & 16711935) | ((j2 & 16711935) << 8);
            iArr[i2 - i] = (int) (((j2 >> 16) & 65535) | ((j2 & 65535) << 16));
        }
        i = i3 << 5;
        if (r0.f6554b != i) {
            i -= r0.f6554b;
            i2 = iArr[0] >>> i;
            for (int i4 = 1; i4 < i3; i4++) {
                int i5 = iArr[i4];
                iArr[i4 - 1] = i2 | (i5 << (32 - i));
                i2 = i5 >>> i;
            }
            iArr[i3 - 1] = i2;
        }
        r0.f6553a = iArr;
    }

    public final void m5397b(int i) {
        int[] iArr = this.f6553a;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public final int m5398c(int i) {
        if (i >= this.f6554b) {
            return this.f6554b;
        }
        int i2 = i / 32;
        i = (((1 << (i & 31)) - 1) ^ -1) & this.f6553a[i2];
        while (i == 0) {
            i2++;
            if (i2 == this.f6553a.length) {
                return this.f6554b;
            }
            i = this.f6553a[i2];
        }
        i2 = (i2 << 5) + Integer.numberOfTrailingZeros(i);
        return i2 > this.f6554b ? this.f6554b : i2;
    }

    public final /* synthetic */ Object clone() {
        return new C1961a((int[]) this.f6553a.clone(), this.f6554b);
    }

    public final int m5399d(int i) {
        if (i >= this.f6554b) {
            return this.f6554b;
        }
        int i2 = i / 32;
        i = (((1 << (i & 31)) - 1) ^ -1) & (this.f6553a[i2] ^ -1);
        while (i == 0) {
            i2++;
            if (i2 == this.f6553a.length) {
                return this.f6554b;
            }
            i = this.f6553a[i2] ^ -1;
        }
        i2 = (i2 << 5) + Integer.numberOfTrailingZeros(i);
        return i2 > this.f6554b ? this.f6554b : i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1961a)) {
            return false;
        }
        C1961a c1961a = (C1961a) obj;
        return this.f6554b == c1961a.f6554b && Arrays.equals(this.f6553a, c1961a.f6553a);
    }

    public final int hashCode() {
        return (31 * this.f6554b) + Arrays.hashCode(this.f6553a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.f6554b);
        for (int i = 0; i < this.f6554b; i++) {
            if ((i & 7) == 0) {
                stringBuilder.append(' ');
            }
            stringBuilder.append(m5394a(i) ? 'X' : '.');
        }
        return stringBuilder.toString();
    }
}
