package com.google.p173d.p177b;

import com.google.p173d.C1974b;
import com.google.p173d.C2044h;
import java.lang.reflect.Array;

public final class C6592j extends C5602h {
    private C1966b f18807b;

    public C6592j(C2044h c2044h) {
        super(c2044h);
    }

    private static int m16890a(int i, int i2) {
        return i < 2 ? 2 : i > i2 ? i2 : i;
    }

    public final C1966b mo1762a() {
        if (this.f18807b != null) {
            return r0.f18807b;
        }
        C2044h c2044h = r0.f6636a;
        int i = c2044h.f6868a;
        int i2 = c2044h.f6869b;
        if (i < 40 || i2 < 40) {
            r0.f18807b = super.mo1762a();
        } else {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            byte[] a = c2044h.mo1767a();
            int i10 = i >> 3;
            if ((i & 7) != 0) {
                i10++;
            }
            int i11 = i2 >> 3;
            if ((i2 & 7) != 0) {
                i11++;
            }
            int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{i11, i10});
            int i12 = 0;
            while (true) {
                i3 = 8;
                if (i12 >= i11) {
                    break;
                }
                i4 = i12 << 3;
                i5 = i2 - 8;
                if (i4 <= i5) {
                    i5 = i4;
                }
                i4 = 0;
                while (i4 < i10) {
                    i6 = i4 << 3;
                    i7 = i - 8;
                    if (i6 > i7) {
                        i6 = i7;
                    }
                    int i13 = 255;
                    int i14 = (i5 * i) + i6;
                    i6 = 0;
                    i7 = 0;
                    i8 = 0;
                    while (i6 < i3) {
                        i9 = i13;
                        int i15 = i8;
                        i13 = 0;
                        while (i13 < i3) {
                            i3 = a[i14 + i13] & 255;
                            i7 += i3;
                            i8 = i3 < i9 ? i3 : i9;
                            i9 = i15;
                            i15 = i3 > i9 ? i3 : i9;
                            i13++;
                            i9 = i8;
                            i3 = 8;
                        }
                        i8 = i15;
                        if (i8 - i9 <= 24) {
                            i6++;
                            i14 += i;
                            i13 = i9;
                            i3 = 8;
                        }
                        while (true) {
                            i6++;
                            i14 += i;
                            i13 = 8;
                            if (i6 >= 8) {
                                break;
                            }
                            i3 = 0;
                            while (i3 < i13) {
                                i7 += a[i14 + i3] & 255;
                                i3++;
                                i13 = 8;
                            }
                        }
                        i6++;
                        i14 += i;
                        i13 = i9;
                        i3 = 8;
                    }
                    i9 = i7 >> 6;
                    if (i8 - i13 <= 24) {
                        i9 = i13 / 2;
                        if (i12 > 0 && i4 > 0) {
                            i3 = i12 - 1;
                            i8 = i4 - 1;
                            i3 = ((iArr[i3][i4] + (iArr[i12][i8] * 2)) + iArr[i3][i8]) / 4;
                            if (i13 < i3) {
                                i9 = i3;
                            }
                        }
                    }
                    iArr[i12][i4] = i9;
                    i4++;
                    i3 = 8;
                }
                i12++;
            }
            C1966b c1966b = new C1966b(i, i2);
            for (i12 = 0; i12 < i11; i12++) {
                int i16;
                byte[] bArr;
                i9 = i12 << 3;
                i4 = i2 - 8;
                if (i9 > i4) {
                    i9 = i4;
                }
                for (i3 = 0; i3 < i10; i3++) {
                    i4 = i3 << 3;
                    i5 = i - 8;
                    if (i4 <= i5) {
                        i5 = i4;
                    }
                    i4 = C6592j.m16890a(i3, i10 - 3);
                    i6 = C6592j.m16890a(i12, i11 - 3);
                    i7 = -2;
                    int i17 = 2;
                    i8 = 0;
                    while (i7 <= i17) {
                        int[] iArr2 = iArr[i6 + i7];
                        i8 += (((iArr2[i4 - 2] + iArr2[i4 - 1]) + iArr2[i4]) + iArr2[i4 + 1]) + iArr2[i4 + 2];
                        i7++;
                        i17 = 2;
                    }
                    int i18 = i17;
                    i17 = i8 / 25;
                    i6 = (i9 * i) + i5;
                    i4 = 0;
                    while (true) {
                        i7 = 8;
                        if (i4 >= 8) {
                            break;
                        }
                        i16 = i2;
                        i2 = 0;
                        while (i2 < i7) {
                            bArr = a;
                            if ((a[i6 + i2] & 255) <= i17) {
                                c1966b.m5418b(i5 + i2, i9 + i4);
                            }
                            i2++;
                            a = bArr;
                            i7 = 8;
                        }
                        bArr = a;
                        i4++;
                        i6 += i;
                        i2 = i16;
                    }
                    bArr = a;
                    i16 = i2;
                }
                bArr = a;
                i16 = i2;
            }
            r0.f18807b = c1966b;
        }
        return r0.f18807b;
    }

    public final C1974b mo1763a(C2044h c2044h) {
        return new C6592j(c2044h);
    }
}
