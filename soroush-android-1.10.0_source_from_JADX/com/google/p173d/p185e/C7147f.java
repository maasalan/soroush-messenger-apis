package com.google.p173d.p185e;

import com.google.p173d.C1958a;
import com.google.p173d.p177b.C1961a;

public final class C7147f extends C6605p {
    private final int[] f20439a = new int[4];

    protected final int mo3421a(C1961a c1961a, int[] iArr, StringBuilder stringBuilder) {
        int[] iArr2 = this.f20439a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i = c1961a.f6554b;
        int i2 = iArr[1];
        int i3 = 0;
        while (i3 < 4 && i2 < i) {
            stringBuilder.append((char) (C6605p.m16925a(c1961a, iArr2, i2, e) + 48));
            int i4 = i2;
            for (int i5 : iArr2) {
                i4 += i5;
            }
            i3++;
            i2 = i4;
        }
        int i6 = C6605p.m16927a(c1961a, i2, true, c)[1];
        i3 = 0;
        while (i3 < 4 && i6 < i) {
            stringBuilder.append((char) (C6605p.m16925a(c1961a, iArr2, i6, e) + 48));
            i4 = i6;
            for (int i52 : iArr2) {
                i4 += i52;
            }
            i3++;
            i6 = i4;
        }
        return i6;
    }

    final C1958a mo3422b() {
        return C1958a.EAN_8;
    }
}
