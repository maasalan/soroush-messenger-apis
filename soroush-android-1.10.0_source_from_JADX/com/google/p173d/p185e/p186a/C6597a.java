package com.google.p173d.p185e.p186a;

import com.google.p173d.C5629j;
import com.google.p173d.p185e.C5612k;

public abstract class C6597a extends C5612k {
    protected final int[] f18808a = new int[4];
    protected final int[] f18809b = new int[8];
    protected final float[] f18810c = new float[4];
    protected final float[] f18811d = new float[4];
    protected final int[] f18812e = new int[(this.f18809b.length / 2)];
    protected final int[] f18813f = new int[(this.f18809b.length / 2)];

    protected C6597a() {
    }

    protected static int m16899a(int[] iArr, int[][] iArr2) {
        for (int i = 0; i < iArr2.length; i++) {
            if (C5612k.m12334a(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw C5629j.m12369a();
    }

    protected static void m16900a(int[] iArr, float[] fArr) {
        float f = fArr[0];
        int i = 0;
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] > f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    protected static boolean m16901a(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f = ((float) i) / ((float) ((iArr[2] + i) + iArr[3]));
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i2 = Integer.MIN_VALUE;
            int i3 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            for (int i4 : iArr) {
                if (i4 > i2) {
                    i2 = i4;
                }
                if (i4 < i3) {
                    i3 = i4;
                }
            }
            if (i2 < i3 * 10) {
                return true;
            }
        }
        return false;
    }

    protected static void m16902b(int[] iArr, float[] fArr) {
        float f = fArr[0];
        int i = 0;
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] < f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }
}
