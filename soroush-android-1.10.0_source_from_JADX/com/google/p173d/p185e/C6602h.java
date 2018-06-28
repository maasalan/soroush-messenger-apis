package com.google.p173d.p185e;

import com.google.p173d.C1958a;
import com.google.p173d.C2007e;
import com.google.p173d.C2047n;
import com.google.p173d.C2049p;
import com.google.p173d.C5615f;
import com.google.p173d.C5629j;
import com.google.p173d.p177b.C1961a;
import java.util.Map;

public final class C6602h extends C5612k {
    static final int[][] f18832a = new int[][]{new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    private static final int[] f18833b = new int[]{6, 8, 10, 12, 14};
    private static final int[] f18834d = new int[]{1, 1, 1, 1};
    private static final int[] f18835e = new int[]{1, 1, 3};
    private int f18836c = -1;

    private static int m16914a(C1961a c1961a) {
        int i = c1961a.f6554b;
        int c = c1961a.m5398c(0);
        if (c != i) {
            return c;
        }
        throw C5629j.m12369a();
    }

    private static int m16915a(int[] iArr) {
        float f = 0.38f;
        int i = -1;
        int length = f18832a.length;
        for (int i2 = 0; i2 < length; i2++) {
            float a = C5612k.m12334a(iArr, f18832a[i2], 0.78f);
            if (a < f) {
                i = i2;
                f = a;
            }
        }
        if (i >= 0) {
            return i;
        }
        throw C5629j.m12369a();
    }

    private void m16916a(C1961a c1961a, int i) {
        int i2 = this.f18836c * 10;
        if (i2 >= i) {
            i2 = i;
        }
        i--;
        while (i2 > 0 && i >= 0 && !c1961a.m5394a(i)) {
            i2--;
            i--;
        }
        if (i2 != 0) {
            throw C5629j.m12369a();
        }
    }

    private static void m16917a(C1961a c1961a, int i, int i2, StringBuilder stringBuilder) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            C5612k.m12335a(c1961a, i, iArr);
            int i3 = 0;
            for (int i4 = 0; i4 < 5; i4++) {
                int i5 = 2 * i4;
                iArr2[i4] = iArr[i5];
                iArr3[i4] = iArr[i5 + 1];
            }
            stringBuilder.append((char) (C6602h.m16915a(iArr2) + 48));
            stringBuilder.append((char) (C6602h.m16915a(iArr3) + 48));
            while (i3 < 10) {
                i += iArr[i3];
                i3++;
            }
        }
    }

    private int[] m16918b(C1961a c1961a) {
        c1961a.m5396b();
        try {
            int[] c = C6602h.m16919c(c1961a, C6602h.m16914a(c1961a), f18835e);
            m16916a(c1961a, c[0]);
            int i = c[0];
            c[0] = c1961a.f6554b - c[1];
            c[1] = c1961a.f6554b - i;
            return c;
        } finally {
            c1961a.m5396b();
        }
    }

    private static int[] m16919c(C1961a c1961a, int i, int[] iArr) {
        int length = iArr.length;
        Object obj = new int[length];
        int i2 = c1961a.f6554b;
        int i3 = i;
        int i4 = 0;
        int i5 = i4;
        while (i < i2) {
            if ((c1961a.m5394a(i) ^ i4) != 0) {
                obj[i5] = obj[i5] + 1;
            } else {
                int i6 = length - 1;
                if (i5 != i6) {
                    i5++;
                } else if (C5612k.m12334a((int[]) obj, iArr, 0.78f) < 0.38f) {
                    return new int[]{i3, i};
                } else {
                    i3 += obj[0] + obj[1];
                    int i7 = length - 2;
                    System.arraycopy(obj, 2, obj, 0, i7);
                    obj[i7] = null;
                    obj[i6] = null;
                    i5--;
                }
                obj[i5] = 1;
                i4 ^= 1;
            }
            i++;
        }
        throw C5629j.m12369a();
    }

    public final C2047n mo3064a(int i, C1961a c1961a, Map<C2007e, ?> map) {
        int i2;
        int[] c = C6602h.m16919c(c1961a, C6602h.m16914a(c1961a), f18834d);
        this.f18836c = (c[1] - c[0]) / 4;
        m16916a(c1961a, c[0]);
        int[] b = m16918b(c1961a);
        StringBuilder stringBuilder = new StringBuilder(20);
        C6602h.m16917a(c1961a, c[1], b[0], stringBuilder);
        String stringBuilder2 = stringBuilder.toString();
        int[] iArr = map != null ? (int[]) map.get(C2007e.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f18833b;
        }
        int length = stringBuilder2.length();
        int length2 = iArr.length;
        int i3 = 0;
        int i4 = i3;
        while (i3 < length2) {
            int i5 = iArr[i3];
            if (length == i5) {
                i2 = 1;
                break;
            }
            if (i5 > i4) {
                i4 = i5;
            }
            i3++;
        }
        i2 = 0;
        if (i2 == 0 && length > i4) {
            i2 = 1;
        }
        if (i2 == 0) {
            throw C5615f.m12347a();
        }
        r5 = new C2049p[2];
        float f = (float) i;
        r5[0] = new C2049p((float) c[1], f);
        r5[1] = new C2049p((float) b[0], f);
        return new C2047n(stringBuilder2, null, r5, C1958a.ITF);
    }
}
