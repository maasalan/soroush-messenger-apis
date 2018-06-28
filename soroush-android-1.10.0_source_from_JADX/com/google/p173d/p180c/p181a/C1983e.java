package com.google.p173d.p180c.p181a;

import com.google.p173d.C5615f;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C1983e {
    private static final C1983e[] f6661h;
    final int f6662a;
    final int f6663b;
    final int f6664c;
    final int f6665d;
    final int f6666e;
    final C1982b f6667f;
    final int f6668g;

    static final class C1981a {
        final int f6657a;
        final int f6658b;

        private C1981a(int i, int i2) {
            this.f6657a = i;
            this.f6658b = i2;
        }
    }

    static final class C1982b {
        final int f6659a;
        final C1981a[] f6660b;

        private C1982b(int i, C1981a c1981a) {
            this.f6659a = i;
            this.f6660b = new C1981a[]{c1981a};
        }

        private C1982b(C1981a c1981a, C1981a c1981a2) {
            this.f6659a = 62;
            this.f6660b = new C1981a[]{c1981a, c1981a2};
        }
    }

    static {
        r0 = new C1983e[30];
        C1982b c1982b = new C1982b(14, new C1981a(1, 18));
        int i = 18;
        r0[4] = new C1983e(5, 18, 18, 16, 16, c1982b);
        r0[5] = new C1983e(6, 20, 20, 18, 18, new C1982b(i, new C1981a(1, 22)));
        r0[6] = new C1983e(7, 22, 22, 20, 20, new C1982b(20, new C1981a(1, 30)));
        r0[7] = new C1983e(8, 24, 24, 22, 22, new C1982b(24, new C1981a(1, 36)));
        r0[8] = new C1983e(9, 26, 26, 24, 24, new C1982b(28, new C1981a(1, 44)));
        r0[9] = new C1983e(10, 32, 32, 14, 14, new C1982b(36, new C1981a(1, 62)));
        r0[10] = new C1983e(11, 36, 36, 16, 16, new C1982b(42, new C1981a(1, 86)));
        r0[11] = new C1983e(12, 40, 40, 18, 18, new C1982b(48, new C1981a(1, 114)));
        int i2 = 56;
        r0[12] = new C1983e(13, 44, 44, 20, 20, new C1982b(56, new C1981a(1, IjkMediaMeta.FF_PROFILE_H264_HIGH_444)));
        r0[13] = new C1983e(14, 48, 48, 22, 22, new C1982b(68, new C1981a(1, 174)));
        r0[14] = new C1983e(15, 52, 52, 24, 24, new C1982b(42, new C1981a(2, 102)));
        r0[15] = new C1983e(16, 64, 64, 14, 14, new C1982b(i2, new C1981a(2, 140)));
        r0[16] = new C1983e(17, 72, 72, 16, 16, new C1982b(36, new C1981a(4, 92)));
        r0[17] = new C1983e(18, 80, 80, 18, 18, new C1982b(48, new C1981a(4, 114)));
        r0[i] = new C1983e(19, 88, 88, 20, 20, new C1982b(i2, new C1981a(4, IjkMediaMeta.FF_PROFILE_H264_HIGH_444)));
        r0[19] = new C1983e(20, 96, 96, 22, 22, new C1982b(68, new C1981a(4, 174)));
        r0[20] = new C1983e(21, 104, 104, 24, 24, new C1982b(i2, new C1981a(6, 136)));
        r0[21] = new C1983e(22, 120, 120, 18, 18, new C1982b(68, new C1981a(6, 175)));
        r0[22] = new C1983e(23, 132, 132, 20, 20, new C1982b(62, new C1981a(8, 163)));
        r0[23] = new C1983e(24, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 22, 22, new C1982b(new C1981a(8, 156), new C1981a(2, 155)));
        r0[24] = new C1983e(25, 8, 18, 6, 16, new C1982b(7, new C1981a(1, 5)));
        r0[25] = new C1983e(26, 8, 32, 6, 14, new C1982b(11, new C1981a(1, 10)));
        r0[26] = new C1983e(27, 12, 26, 10, 24, new C1982b(14, new C1981a(1, 16)));
        r0[27] = new C1983e(28, 12, 36, 10, 16, new C1982b(i, new C1981a(1, 22)));
        r0[28] = new C1983e(29, 16, 36, 14, 16, new C1982b(24, new C1981a(1, 32)));
        r0[29] = new C1983e(30, 16, 48, 14, 22, new C1982b(28, new C1981a(1, 49)));
        f6661h = r0;
    }

    private C1983e(int i, int i2, int i3, int i4, int i5, C1982b c1982b) {
        this.f6662a = i;
        this.f6663b = i2;
        this.f6664c = i3;
        this.f6665d = i4;
        this.f6666e = i5;
        this.f6667f = c1982b;
        i = c1982b.f6659a;
        C1981a[] c1981aArr = c1982b.f6660b;
        i3 = 0;
        i4 = c1981aArr.length;
        i5 = 0;
        while (i3 < i4) {
            C1981a c1981a = c1981aArr[i3];
            i5 += c1981a.f6657a * (c1981a.f6658b + i);
            i3++;
        }
        this.f6668g = i5;
    }

    public static C1983e m5450a(int i, int i2) {
        if ((i & 1) == 0) {
            if ((i2 & 1) == 0) {
                for (C1983e c1983e : f6661h) {
                    if (c1983e.f6663b == i && c1983e.f6664c == i2) {
                        return c1983e;
                    }
                }
                throw C5615f.m12347a();
            }
        }
        throw C5615f.m12347a();
    }

    public final String toString() {
        return String.valueOf(this.f6662a);
    }
}
