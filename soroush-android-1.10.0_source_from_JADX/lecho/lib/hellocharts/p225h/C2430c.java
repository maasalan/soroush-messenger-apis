package lecho.lib.hellocharts.p225h;

import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C2430c {
    public static final int[] f8049a = new int[]{1, 10, 100, IjkMediaCodecInfo.RANK_MAX, 10000, 100000, 1000000};

    public static int m6643a(char[] cArr, float f, int i, int i2, char c) {
        if (i2 >= f8049a.length) {
            cArr[i - 1] = '.';
            return 1;
        } else if (f == 0.0f) {
            cArr[i - 1] = '0';
            return 1;
        } else {
            int i3;
            int i4;
            int i5 = 0;
            if (f < 0.0f) {
                f = -f;
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i2 > f8049a.length) {
                i2 = f8049a.length - 1;
            }
            long round = (long) Math.round(f * ((float) f8049a[i2]));
            i--;
            while (true) {
                if (round == 0) {
                    if (i5 >= i2 + 1) {
                        break;
                    }
                }
                round /= 10;
                int i6 = i - 1;
                cArr[i] = (char) (((int) (round % 10)) + 48);
                i5++;
                if (i5 == i2) {
                    i4 = i6 - 1;
                    cArr[i6] = c;
                    i5++;
                    i = i4;
                } else {
                    i = i6;
                }
            }
            if (cArr[i + 1] == c) {
                i4 = i - 1;
                cArr[i] = '0';
                i5++;
            } else {
                i4 = i;
            }
            if (i3 != 0) {
                cArr[i4] = '-';
                i5++;
            }
            return i5;
        }
    }

    public static void m6644a(float f, float f2, int i, C2428a c2428a) {
        double d = (double) (f2 - f);
        if (i != 0) {
            if (d > 0.0d) {
                d /= (double) i;
                int i2 = 1;
                float pow = (float) Math.pow(10.0d, (double) (1 - ((int) ((float) Math.ceil((double) ((float) Math.log10(d < 0.0d ? -d : d)))))));
                d = (double) (((float) Math.round(d * ((double) pow))) / pow);
                double pow2 = Math.pow(10.0d, (double) ((int) Math.log10(d)));
                if (((int) (d / pow2)) > 5) {
                    d = Math.floor(10.0d * pow2);
                }
                pow2 = Math.ceil(((double) f) / d) * d;
                double floor = Math.floor(((double) f2) / d) * d;
                if (!Double.isNaN(floor)) {
                    if (floor != Double.POSITIVE_INFINITY) {
                        floor += 0.0d;
                        long doubleToRawLongBits = Double.doubleToRawLongBits(floor);
                        if (floor < 0.0d) {
                            i2 = -1;
                        }
                        floor = Double.longBitsToDouble(doubleToRawLongBits + ((long) i2));
                    }
                }
                i = 0;
                for (double d2 = pow2; d2 <= floor; d2 += d) {
                    i++;
                }
                c2428a.f8038b = i;
                if (c2428a.f8037a.length < i) {
                    c2428a.f8037a = new float[i];
                }
                for (int i3 = 0; i3 < i; i3++) {
                    c2428a.f8037a[i3] = (float) pow2;
                    pow2 += d;
                }
                if (d < 1.0d) {
                    c2428a.f8039c = (int) Math.ceil(-Math.log10(d));
                    return;
                } else {
                    c2428a.f8039c = 0;
                    return;
                }
            }
        }
        c2428a.f8037a = new float[0];
        c2428a.f8038b = 0;
    }
}
