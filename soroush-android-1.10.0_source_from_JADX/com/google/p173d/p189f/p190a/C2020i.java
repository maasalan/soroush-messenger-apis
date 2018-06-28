package com.google.p173d.p189f.p190a;

import com.google.p173d.p177b.p178a.C1959a;
import com.google.p173d.p189f.C2022a;
import java.lang.reflect.Array;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

final class C2020i {
    private static final float[][] f6781a = ((float[][]) Array.newInstance(float.class, new int[]{C2022a.f6783a.length, 8}));

    static {
        for (int i = 0; i < C2022a.f6783a.length; i++) {
            int i2 = C2022a.f6783a[i];
            int i3 = i2 & 1;
            int i4 = i2;
            i2 = 0;
            while (i2 < 8) {
                int i5;
                float f = 0.0f;
                while (true) {
                    i5 = i4 & 1;
                    if (i5 != i3) {
                        break;
                    }
                    f += BallPulseIndicator.SCALE;
                    i4 >>= 1;
                }
                f6781a[i][(8 - i2) - 1] = f / 17.0f;
                i2++;
                i3 = i5;
            }
        }
    }

    static int m5520a(int[] iArr) {
        float a = (float) C1959a.m5389a(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = i;
        int i3 = i2;
        while (i < 17) {
            if (((float) (iArr[i3] + i2)) <= (a / 34.0f) + ((((float) i) * a) / 17.0f)) {
                i2 += iArr[i3];
                i3++;
            }
            iArr2[i3] = iArr2[i3] + 1;
            i++;
        }
        long j = 0;
        int i4 = 0;
        while (i4 < 8) {
            long j2 = j;
            i = 0;
            while (i < iArr2[i4]) {
                i++;
                j2 = (j2 << 1) | ((long) (i4 % 2 == 0 ? 1 : 0));
            }
            i4++;
            j = j2;
        }
        i4 = (int) j;
        i = -1;
        if (C2022a.m5528a(i4) == -1) {
            i4 = -1;
        }
        if (i4 != -1) {
            return i4;
        }
        i4 = C1959a.m5389a(iArr);
        float[] fArr = new float[8];
        for (i2 = 0; i2 < 8; i2++) {
            fArr[i2] = ((float) iArr[i2]) / ((float) i4);
        }
        a = Float.MAX_VALUE;
        for (int i5 = 0; i5 < f6781a.length; i5++) {
            float[] fArr2 = f6781a[i5];
            float f = 0.0f;
            for (i2 = 0; i2 < 8; i2++) {
                float f2 = fArr2[i2] - fArr[i2];
                f += f2 * f2;
                if (f >= a) {
                    break;
                }
            }
            if (f < a) {
                i = C2022a.f6783a[i5];
                a = f;
            }
        }
        return i;
    }
}
