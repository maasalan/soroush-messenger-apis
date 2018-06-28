package com.google.p173d.p177b;

import com.google.p173d.C1974b;
import com.google.p173d.C2044h;
import com.google.p173d.C5629j;

public class C5602h extends C1974b {
    private static final byte[] f15457b = new byte[0];
    private byte[] f15458c = f15457b;
    private final int[] f15459d = new int[32];

    public C5602h(C2044h c2044h) {
        super(c2044h);
    }

    private static int m12319a(int[] iArr) {
        int i = 0;
        int length = iArr.length;
        int i2 = 0;
        int i3 = i2;
        int i4 = i3;
        int i5 = i4;
        while (i2 < length) {
            if (iArr[i2] > i3) {
                i3 = iArr[i2];
                i5 = i2;
            }
            if (iArr[i2] > i4) {
                i4 = iArr[i2];
            }
            i2++;
        }
        i2 = 0;
        i3 = i2;
        while (i < length) {
            int i6 = i - i5;
            int i7 = (iArr[i] * i6) * i6;
            if (i7 > i2) {
                i3 = i;
                i2 = i7;
            }
            i++;
        }
        if (i5 > i3) {
            int i8 = i5;
            i5 = i3;
            i3 = i8;
        }
        if (i3 - i5 <= length / 16) {
            throw C5629j.m12369a();
        }
        i = i3 - 1;
        length = -1;
        i2 = i;
        while (i > i5) {
            i6 = i - i5;
            i6 = ((i6 * i6) * (i3 - i)) * (i4 - iArr[i]);
            if (i6 > length) {
                i2 = i;
                length = i6;
            }
            i--;
        }
        return i2 << 3;
    }

    private void m12320a(int i) {
        if (this.f15458c.length < i) {
            this.f15458c = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f15459d[i2] = 0;
        }
    }

    public final C1961a mo1761a(int i, C1961a c1961a) {
        byte[] a;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int a2;
        C2044h c2044h = this.f6636a;
        int i5 = c2044h.f6868a;
        if (c1961a != null) {
            if (c1961a.f6554b >= i5) {
                c1961a.m5393a();
                m12320a(i5);
                a = c2044h.mo1768a(i, this.f15458c);
                iArr = this.f15459d;
                i2 = 0;
                for (i3 = 0; i3 < i5; i3++) {
                    i4 = (a[i3] & 255) >> 3;
                    iArr[i4] = iArr[i4] + 1;
                }
                a2 = C5602h.m12319a(iArr);
                if (i5 >= 3) {
                    while (i2 < i5) {
                        if ((a[i2] & 255) < a2) {
                            c1961a.m5397b(i2);
                        }
                        i2++;
                    }
                } else {
                    i3 = a[1] & 255;
                    i4 = a[0] & 255;
                    i2 = 1;
                    while (i2 < i5 - 1) {
                        int i6;
                        int i7 = i2 + 1;
                        i6 = a[i7] & 255;
                        if ((((i3 << 2) - i4) - i6) / 2 < a2) {
                            c1961a.m5397b(i2);
                        }
                        i4 = i3;
                        i2 = i7;
                        i3 = i6;
                    }
                }
                return c1961a;
            }
        }
        c1961a = new C1961a(i5);
        m12320a(i5);
        a = c2044h.mo1768a(i, this.f15458c);
        iArr = this.f15459d;
        i2 = 0;
        for (i3 = 0; i3 < i5; i3++) {
            i4 = (a[i3] & 255) >> 3;
            iArr[i4] = iArr[i4] + 1;
        }
        a2 = C5602h.m12319a(iArr);
        if (i5 >= 3) {
            i3 = a[1] & 255;
            i4 = a[0] & 255;
            i2 = 1;
            while (i2 < i5 - 1) {
                int i72 = i2 + 1;
                i6 = a[i72] & 255;
                if ((((i3 << 2) - i4) - i6) / 2 < a2) {
                    c1961a.m5397b(i2);
                }
                i4 = i3;
                i2 = i72;
                i3 = i6;
            }
        } else {
            while (i2 < i5) {
                if ((a[i2] & 255) < a2) {
                    c1961a.m5397b(i2);
                }
                i2++;
            }
        }
        return c1961a;
    }

    public C1966b mo1762a() {
        int i;
        C2044h c2044h = this.f6636a;
        int i2 = c2044h.f6868a;
        int i3 = c2044h.f6869b;
        C1966b c1966b = new C1966b(i2, i3);
        m12320a(i2);
        int[] iArr = this.f15459d;
        for (i = 1; i < 5; i++) {
            int i4;
            byte[] a = c2044h.mo1768a((i3 * i) / 5, this.f15458c);
            int i5 = (i2 << 2) / 5;
            for (i4 = i2 / 5; i4 < i5; i4++) {
                int i6 = (a[i4] & 255) >> 3;
                iArr[i6] = iArr[i6] + 1;
            }
        }
        int a2 = C5602h.m12319a(iArr);
        byte[] a3 = c2044h.mo1767a();
        for (i = 0; i < i3; i++) {
            i4 = i * i2;
            for (int i7 = 0; i7 < i2; i7++) {
                if ((a3[i4 + i7] & 255) < a2) {
                    c1966b.m5418b(i7, i);
                }
            }
        }
        return c1966b;
    }

    public C1974b mo1763a(C2044h c2044h) {
        return new C5602h(c2044h);
    }
}
