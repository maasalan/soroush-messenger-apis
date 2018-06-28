package com.google.p173d.p180c.p181a;

import com.google.p173d.C5615f;
import com.google.p173d.p177b.C1966b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

final class C1975a {
    final C1966b f6637a;
    final C1966b f6638b;
    final C1983e f6639c;

    C1975a(C1966b c1966b) {
        int i = c1966b.f6574b;
        if (i >= 8 && i <= IjkMediaMeta.FF_PROFILE_H264_HIGH_444) {
            if ((i & 1) == 0) {
                this.f6639c = C1983e.m5450a(c1966b.f6574b, c1966b.f6573a);
                this.f6637a = m5435a(c1966b);
                this.f6638b = new C1966b(this.f6637a.f6573a, this.f6637a.f6574b);
                return;
            }
        }
        throw C5615f.m12347a();
    }

    private C1966b m5435a(C1966b c1966b) {
        C1966b c1966b2 = c1966b;
        int i = this.f6639c.f6663b;
        int i2 = this.f6639c.f6664c;
        if (c1966b2.f6574b != i) {
            throw new IllegalArgumentException("Dimension of bitMarix must match the version size");
        }
        int i3 = r0.f6639c.f6665d;
        int i4 = r0.f6639c.f6666e;
        i /= i3;
        i2 /= i4;
        C1966b c1966b3 = new C1966b(i2 * i4, i * i3);
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i5 * i3;
            for (int i7 = 0; i7 < i2; i7++) {
                int i8 = i7 * i4;
                for (int i9 = 0; i9 < i3; i9++) {
                    int i10 = (((i3 + 2) * i5) + 1) + i9;
                    int i11 = i6 + i9;
                    for (int i12 = 0; i12 < i4; i12++) {
                        if (c1966b2.m5416a((((i4 + 2) * i7) + 1) + i12, i10)) {
                            c1966b3.m5418b(i8 + i12, i11);
                        }
                    }
                }
            }
        }
        return c1966b3;
    }

    final boolean m5436a(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f6638b.m5418b(i2, i);
        return this.f6637a.m5416a(i2, i);
    }

    final int m5437b(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int a = m5436a(i5, i6, i3, i4) << 1;
        int i7 = i2 - 1;
        if (m5436a(i5, i7, i3, i4)) {
            a |= 1;
        }
        i5 = a << 1;
        a = i - 1;
        if (m5436a(a, i6, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (m5436a(a, i7, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (m5436a(a, i2, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (m5436a(i, i6, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (m5436a(i, i7, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        return m5436a(i, i2, i3, i4) ? i5 | 1 : i5;
    }
}
