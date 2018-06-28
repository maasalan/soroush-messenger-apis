package com.google.p173d.p185e;

import com.google.p173d.C1958a;
import com.google.p173d.C2047n;
import com.google.p173d.C2048o;
import com.google.p173d.C2049p;
import com.google.p173d.C5629j;
import com.google.p173d.p177b.C1961a;
import java.util.EnumMap;
import java.util.Map;

final class C2004m {
    private final int[] f6713a = new int[4];
    private final StringBuilder f6714b = new StringBuilder();

    C2004m() {
    }

    final C2047n m5482a(int i, C1961a c1961a, int[] iArr) {
        C1961a c1961a2 = c1961a;
        StringBuilder stringBuilder = this.f6714b;
        stringBuilder.setLength(0);
        int[] iArr2 = this.f6713a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i2 = c1961a2.f6554b;
        int i3 = 0;
        int i4 = iArr[1];
        int i5 = i3;
        while (i5 < 2 && i4 < i2) {
            int a = C6605p.m16925a(c1961a2, iArr2, i4, C6605p.f18843f);
            stringBuilder.append((char) (48 + (a % 10)));
            int i6 = i4;
            for (int i7 : iArr2) {
                i6 += i7;
            }
            if (a >= 10) {
                i3 = (1 << (1 - i5)) | i3;
            }
            i4 = i5 != 1 ? c1961a2.m5399d(c1961a2.m5398c(i6)) : i6;
            i5++;
        }
        if (stringBuilder.length() != 2) {
            throw C5629j.m12369a();
        } else if (Integer.parseInt(stringBuilder.toString()) % 4 != i3) {
            throw C5629j.m12369a();
        } else {
            Map map;
            String stringBuilder2 = stringBuilder.toString();
            if (stringBuilder2.length() != 2) {
                map = null;
            } else {
                map = new EnumMap(C2048o.class);
                map.put(C2048o.ISSUE_NUMBER, Integer.valueOf(stringBuilder2));
            }
            r7 = new C2049p[2];
            float f = (float) i;
            r7[0] = new C2049p(((float) (iArr[0] + iArr[1])) / 2.0f, f);
            r7[1] = new C2049p((float) i4, f);
            C2047n c2047n = new C2047n(stringBuilder2, null, r7, C1958a.UPC_EAN_EXTENSION);
            if (map != null) {
                c2047n.m5582a(map);
            }
            return c2047n;
        }
    }
}
