package com.google.p173d.p193g.p195b;

import com.google.p173d.C2050q;
import com.google.p173d.p177b.C1966b;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

final class C2038b {
    final C1966b f6847a;
    final List<C5625a> f6848b = new ArrayList(5);
    final int f6849c;
    final int f6850d;
    final int f6851e;
    final int f6852f;
    private final float f6853g;
    private final int[] f6854h;
    private final C2050q f6855i;

    C2038b(C1966b c1966b, int i, int i2, int i3, int i4, float f, C2050q c2050q) {
        this.f6847a = c1966b;
        this.f6849c = i;
        this.f6850d = i2;
        this.f6851e = i3;
        this.f6852f = i4;
        this.f6853g = f;
        this.f6854h = new int[3];
        this.f6855i = c2050q;
    }

    private static float m5562a(int[] iArr, int i) {
        return ((float) (i - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    final C5625a m5563a(int[] iArr, int i, int i2) {
        int i3 = (iArr[0] + iArr[1]) + iArr[2];
        float a = C2038b.m5562a(iArr, i2);
        int i4 = (int) a;
        int i5 = iArr[1] * 2;
        C1966b c1966b = this.f6847a;
        int i6 = c1966b.f6574b;
        int[] iArr2 = this.f6854h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i7 = i;
        while (i7 >= 0 && c1966b.m5416a(i4, i7) && iArr2[1] <= i5) {
            iArr2[1] = iArr2[1] + 1;
            i7--;
        }
        float f = Float.NaN;
        if (i7 >= 0) {
            if (iArr2[1] <= i5) {
                while (i7 >= 0 && !c1966b.m5416a(i4, i7) && iArr2[0] <= i5) {
                    iArr2[0] = iArr2[0] + 1;
                    i7--;
                }
                if (iArr2[0] <= i5) {
                    i++;
                    while (i < i6 && c1966b.m5416a(i4, i) && iArr2[1] <= i5) {
                        iArr2[1] = iArr2[1] + 1;
                        i++;
                    }
                    if (i != i6) {
                        if (iArr2[1] <= i5) {
                            while (i < i6 && !c1966b.m5416a(i4, i) && iArr2[2] <= i5) {
                                iArr2[2] = iArr2[2] + 1;
                                i++;
                            }
                            if (iArr2[2] <= i5) {
                                if (5 * Math.abs(((iArr2[0] + iArr2[1]) + iArr2[2]) - i3) < i3 * 2) {
                                    if (m5564a(iArr2)) {
                                        f = C2038b.m5562a(iArr2, i);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!Float.isNaN(f)) {
            float f2 = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
            for (C5625a c5625a : this.f6848b) {
                int i8;
                if (Math.abs(f - c5625a.f6892b) <= f2 && Math.abs(a - c5625a.f6891a) <= f2) {
                    float abs = Math.abs(f2 - c5625a.f15477c);
                    if (abs <= BallPulseIndicator.SCALE || abs <= c5625a.f15477c) {
                        i8 = 1;
                        continue;
                        if (i8 != 0) {
                            return new C5625a((c5625a.f6891a + a) / 2.0f, (c5625a.f6892b + f) / 2.0f, (c5625a.f15477c + f2) / 2.0f);
                        }
                    }
                }
                i8 = 0;
                continue;
                if (i8 != 0) {
                    return new C5625a((c5625a.f6891a + a) / 2.0f, (c5625a.f6892b + f) / 2.0f, (c5625a.f15477c + f2) / 2.0f);
                }
            }
            this.f6848b.add(new C5625a(a, f, f2));
        }
        return null;
    }

    final boolean m5564a(int[] iArr) {
        float f = this.f6853g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - ((float) iArr[i])) >= f2) {
                return false;
            }
        }
        return true;
    }
}
