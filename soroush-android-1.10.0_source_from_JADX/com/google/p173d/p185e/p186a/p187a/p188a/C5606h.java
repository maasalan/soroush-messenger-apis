package com.google.p173d.p185e.p186a.p187a.p188a;

import com.google.p173d.p177b.C1961a;

abstract class C5606h extends C1991j {
    C5606h(C1961a c1961a) {
        super(c1961a);
    }

    final void m12329a(StringBuilder stringBuilder, int i, int i2) {
        int i3;
        for (i3 = 0; i3 < 4; i3++) {
            int a = this.f6681b.m5472a((i3 * 10) + i, 10);
            if (a / 100 == 0) {
                stringBuilder.append('0');
            }
            if (a / 10 == 0) {
                stringBuilder.append('0');
            }
            stringBuilder.append(a);
        }
        i = 0;
        i3 = i;
        while (i < 13) {
            a = stringBuilder.charAt(i + i2) - 48;
            if ((i & 1) == 0) {
                a *= 3;
            }
            i3 += a;
            i++;
        }
        i = 10 - (i3 % 10);
        if (i == 10) {
            i = 0;
        }
        stringBuilder.append(i);
    }

    final void m12330b(StringBuilder stringBuilder, int i) {
        stringBuilder.append("(01)");
        int length = stringBuilder.length();
        stringBuilder.append('9');
        m12329a(stringBuilder, i, length);
    }
}
