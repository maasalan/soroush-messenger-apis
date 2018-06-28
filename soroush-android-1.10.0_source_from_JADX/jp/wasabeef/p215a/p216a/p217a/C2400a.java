package jp.wasabeef.p215a.p216a.p217a;

import android.graphics.Bitmap;
import java.lang.reflect.Array;

public final class C2400a {
    public static Bitmap m6569a(Bitmap bitmap, int i) {
        int i2 = i;
        if (i2 <= 0) {
            return null;
        }
        int i3;
        int i4;
        int[] iArr;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i5 = width * height;
        int[] iArr2 = new int[i5];
        bitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i6 = width - 1;
        int i7 = height - 1;
        int i8 = (i2 + i2) + 1;
        int[] iArr3 = new int[i5];
        int[] iArr4 = new int[i5];
        int[] iArr5 = new int[i5];
        int[] iArr6 = new int[Math.max(width, height)];
        i5 = (i8 + 1) >> 1;
        i5 *= i5;
        int i9 = 256 * i5;
        int[] iArr7 = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            iArr7[i10] = i10 / i5;
        }
        int[][] iArr8 = (int[][]) Array.newInstance(int.class, new int[]{i8, 3});
        i5 = i2 + 1;
        i9 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i9 < height) {
            int i13 = -i2;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (i13 <= i2) {
                i3 = i7;
                i4 = height;
                i7 = iArr2[i11 + Math.min(i6, Math.max(i13, 0))];
                int[] iArr9 = iArr8[i13 + i2];
                iArr9[0] = (i7 & 16711680) >> 16;
                iArr9[1] = (i7 & 65280) >> 8;
                iArr9[2] = i7 & 255;
                i7 = i5 - Math.abs(i13);
                i14 += iArr9[0] * i7;
                i15 += iArr9[1] * i7;
                i16 += iArr9[2] * i7;
                if (i13 > 0) {
                    i17 += iArr9[0];
                    i18 += iArr9[1];
                    i19 += iArr9[2];
                } else {
                    i20 += iArr9[0];
                    i21 += iArr9[1];
                    i22 += iArr9[2];
                }
                i13++;
                height = i4;
                i7 = i3;
            }
            i3 = i7;
            i4 = height;
            height = i2;
            i7 = 0;
            while (i7 < width) {
                iArr3[i11] = iArr7[i14];
                iArr4[i11] = iArr7[i15];
                iArr5[i11] = iArr7[i16];
                i14 -= i20;
                i15 -= i21;
                i16 -= i22;
                int[] iArr10 = iArr8[((height - i2) + i8) % i8];
                i20 -= iArr10[0];
                i21 -= iArr10[1];
                i22 -= iArr10[2];
                if (i9 == 0) {
                    iArr = iArr7;
                    iArr6[i7] = Math.min((i7 + i2) + 1, i6);
                } else {
                    iArr = iArr7;
                }
                int i23 = iArr2[i12 + iArr6[i7]];
                iArr10[0] = (i23 & 16711680) >> 16;
                iArr10[1] = (i23 & 65280) >> 8;
                iArr10[2] = i23 & 255;
                i17 += iArr10[0];
                i18 += iArr10[1];
                i19 += iArr10[2];
                i14 += i17;
                i15 += i18;
                i16 += i19;
                height = (height + 1) % i8;
                iArr7 = iArr8[height % i8];
                i20 += iArr7[0];
                i21 += iArr7[1];
                i22 += iArr7[2];
                i17 -= iArr7[0];
                i18 -= iArr7[1];
                i19 -= iArr7[2];
                i11++;
                i7++;
                iArr7 = iArr;
            }
            iArr = iArr7;
            i12 += width;
            i9++;
            height = i4;
            i7 = i3;
        }
        i3 = i7;
        i4 = height;
        iArr = iArr7;
        i6 = 0;
        while (i6 < width) {
            int[] iArr11;
            int abs;
            i7 = -i2;
            height = i7 * width;
            i9 = 0;
            i23 = 0;
            i13 = 0;
            i11 = 0;
            i12 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 0;
            while (i7 <= i2) {
                iArr11 = iArr6;
                i18 = Math.max(0, height) + i6;
                int[] iArr12 = iArr8[i7 + i2];
                iArr12[0] = iArr3[i18];
                iArr12[1] = iArr4[i18];
                iArr12[2] = iArr5[i18];
                abs = i5 - Math.abs(i7);
                i9 += iArr3[i18] * abs;
                i23 += iArr4[i18] * abs;
                i13 += iArr5[i18] * abs;
                if (i7 > 0) {
                    i11 += iArr12[0];
                    i12 += iArr12[1];
                    i14 += iArr12[2];
                } else {
                    i15 += iArr12[0];
                    i16 += iArr12[1];
                    i17 += iArr12[2];
                }
                abs = i3;
                if (i7 < abs) {
                    height += width;
                }
                i7++;
                i3 = abs;
                iArr6 = iArr11;
            }
            iArr11 = iArr6;
            abs = i3;
            i18 = i12;
            i19 = i14;
            height = i4;
            i7 = 0;
            i12 = i2;
            i14 = i11;
            i11 = i13;
            i13 = i23;
            i23 = i9;
            i9 = i6;
            while (i7 < height) {
                iArr2[i9] = (((-16777216 & iArr2[i9]) | (iArr[i23] << 16)) | (iArr[i13] << 8)) | iArr[i11];
                i23 -= i15;
                i13 -= i16;
                i11 -= i17;
                int[] iArr13 = iArr8[((i12 - i2) + i8) % i8];
                i15 -= iArr13[0];
                i16 -= iArr13[1];
                i17 -= iArr13[2];
                if (i6 == 0) {
                    iArr11[i7] = Math.min(i7 + i5, abs) * width;
                }
                i2 = iArr11[i7] + i6;
                iArr13[0] = iArr3[i2];
                iArr13[1] = iArr4[i2];
                iArr13[2] = iArr5[i2];
                i14 += iArr13[0];
                i18 += iArr13[1];
                i19 += iArr13[2];
                i23 += i14;
                i13 += i18;
                i11 += i19;
                i12 = (i12 + 1) % i8;
                int[] iArr14 = iArr8[i12];
                i15 += iArr14[0];
                i16 += iArr14[1];
                i17 += iArr14[2];
                i14 -= iArr14[0];
                i18 -= iArr14[1];
                i19 -= iArr14[2];
                i9 += width;
                i7++;
                i2 = i;
            }
            i6++;
            i3 = abs;
            i4 = height;
            iArr6 = iArr11;
            i2 = i;
        }
        bitmap.setPixels(iArr2, 0, width, 0, 0, width, i4);
        return bitmap;
    }
}
