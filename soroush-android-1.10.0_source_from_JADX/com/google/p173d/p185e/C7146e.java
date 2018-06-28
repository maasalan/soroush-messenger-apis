package com.google.p173d.p185e;

import com.google.p173d.C1958a;
import com.google.p173d.C5629j;
import com.google.p173d.p177b.C1961a;

public final class C7146e extends C6605p {
    static final int[] f20437a = new int[]{0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    private final int[] f20438g = new int[4];

    protected final int mo3421a(C1961a c1961a, int[] iArr, StringBuilder stringBuilder) {
        int[] iArr2 = this.f20438g;
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
        for (i3 = 0; i3 < 10; i3++) {
            if (i4 == f20437a[i3]) {
                stringBuilder.insert(0, (char) (i3 + 48));
                int i7 = C6605p.m16927a(c1961a, i2, true, c)[1];
                i3 = 0;
                while (i3 < 6 && i7 < i) {
                    stringBuilder.append((char) (C6605p.m16925a(c1961a, iArr2, i7, e) + 48));
                    i4 = i7;
                    for (int i8 : iArr2) {
                        i4 += i8;
                    }
                    i3++;
                    i7 = i4;
                }
                return i7;
            }
        }
        throw C5629j.m12369a();
    }

    final C1958a mo3422b() {
        return C1958a.EAN_13;
    }
}
