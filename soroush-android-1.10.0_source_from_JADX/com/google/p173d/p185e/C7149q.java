package com.google.p173d.p185e;

import com.google.p173d.C1958a;
import com.google.p173d.C5629j;
import com.google.p173d.p177b.C1961a;

public final class C7149q extends C6605p {
    static final int[] f20441a = new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37};
    private static final int[] f20442g = new int[]{1, 1, 1, 1, 1, 1};
    private static final int[][] f20443h = new int[][]{new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
    private final int[] f20444i = new int[4];

    protected final int mo3421a(C1961a c1961a, int[] iArr, StringBuilder stringBuilder) {
        int[] iArr2 = this.f20444i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i = c1961a.f6554b;
        int i2 = iArr[1];
        int i3 = 0;
        int i4 = i3;
        while (i3 < 6 && i2 < i) {
            int a = C6605p.m16925a(c1961a, iArr2, i2, f);
            stringBuilder.append((char) (48 + (a % 10)));
            int i5 = i2;
            for (int i6 : iArr2) {
                i5 += i6;
            }
            if (a >= 10) {
                i4 = (1 << (5 - i3)) | i4;
            }
            i3++;
            i2 = i5;
        }
        for (int i7 = 0; i7 <= 1; i7++) {
            for (i3 = 0; i3 < 10; i3++) {
                if (i4 == f20443h[i7][i3]) {
                    stringBuilder.insert(0, (char) (i7 + 48));
                    stringBuilder.append((char) (i3 + 48));
                    return i2;
                }
            }
        }
        throw C5629j.m12369a();
    }

    protected final boolean mo3424a(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder stringBuilder = new StringBuilder(12);
        stringBuilder.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                stringBuilder.append(cArr, 0, 2);
                stringBuilder.append(c);
                stringBuilder.append("0000");
                stringBuilder.append(cArr, 2, 3);
                break;
            case '3':
                stringBuilder.append(cArr, 0, 3);
                stringBuilder.append("00000");
                stringBuilder.append(cArr, 3, 2);
                break;
            case '4':
                stringBuilder.append(cArr, 0, 4);
                stringBuilder.append("00000");
                stringBuilder.append(cArr[4]);
                break;
            default:
                stringBuilder.append(cArr, 0, 5);
                stringBuilder.append("0000");
                stringBuilder.append(c);
                break;
        }
        stringBuilder.append(str.charAt(7));
        return super.mo3424a(stringBuilder.toString());
    }

    protected final int[] mo3425a(C1961a c1961a, int i) {
        return C6605p.m16927a(c1961a, i, true, f20442g);
    }

    final C1958a mo3422b() {
        return C1958a.UPC_E;
    }
}
