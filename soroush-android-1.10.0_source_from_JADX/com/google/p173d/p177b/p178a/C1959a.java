package com.google.p173d.p177b.p178a;

public final class C1959a {
    public static float m5386a(float f, float f2, float f3, float f4) {
        f -= f3;
        f2 -= f4;
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    public static float m5387a(int i, int i2, int i3, int i4) {
        i -= i3;
        i2 -= i4;
        return (float) Math.sqrt((double) ((i * i) + (i2 * i2)));
    }

    public static int m5388a(float f) {
        return (int) (f + (f < 0.0f ? -0.5f : 0.5f));
    }

    public static int m5389a(int[] iArr) {
        int i = 0;
        int i2 = 0;
        while (i < iArr.length) {
            i2 += iArr[i];
            i++;
        }
        return i2;
    }
}
