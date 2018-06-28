package com.p111d.p112a.p114b.p116c;

import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C1352h {
    static final String f4210a = "-9223372036854775808";
    private static int f4211b = 1000000;
    private static int f4212c = 1000000000;
    private static long f4213d = 10000000000L;
    private static long f4214e = 1000;
    private static long f4215f = -2147483648L;
    private static long f4216g = 2147483647L;
    private static final char[] f4217h = new char[4000];
    private static final char[] f4218i = new char[4000];
    private static final byte[] f4219j = new byte[4000];
    private static final String[] f4220k = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private static final String[] f4221l = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};

    static {
        int i = 0;
        int i2 = i;
        while (i < 10) {
            char c = (char) (48 + i);
            char c2 = i == 0 ? '\u0000' : c;
            int i3 = i2;
            i2 = 0;
            while (i2 < 10) {
                char c3 = (char) (48 + i2);
                char c4 = (i == 0 && i2 == 0) ? '\u0000' : c3;
                int i4 = i3;
                for (i3 = 0; i3 < 10; i3++) {
                    char c5 = (char) (48 + i3);
                    f4217h[i4] = c2;
                    int i5 = i4 + 1;
                    f4217h[i5] = c4;
                    int i6 = i4 + 2;
                    f4217h[i6] = c5;
                    f4218i[i4] = c;
                    f4218i[i5] = c3;
                    f4218i[i6] = c5;
                    i4 += 4;
                }
                i2++;
                i3 = i4;
            }
            i++;
            i2 = i3;
        }
        for (i = 0; i < 4000; i++) {
            f4219j[i] = (byte) f4218i[i];
        }
    }

    public static int m3236a(int i, byte[] bArr, int i2) {
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return C1352h.m3238a((long) i, bArr, i2);
            }
            int i3 = i2 + 1;
            bArr[i2] = (byte) 45;
            i = -i;
            i2 = i3;
        }
        if (i >= f4211b) {
            int i4;
            Object obj = i >= f4212c ? 1 : null;
            if (obj != null) {
                i -= f4212c;
                if (i >= f4212c) {
                    i -= f4212c;
                    i4 = i2 + 1;
                    bArr[i2] = (byte) 50;
                } else {
                    i4 = i2 + 1;
                    bArr[i2] = (byte) 49;
                }
            } else {
                i4 = i2;
            }
            i2 = i / IjkMediaCodecInfo.RANK_MAX;
            int i5 = i2 / IjkMediaCodecInfo.RANK_MAX;
            return C1352h.m3246c(i - (i2 * IjkMediaCodecInfo.RANK_MAX), bArr, C1352h.m3246c(i2 - (i5 * IjkMediaCodecInfo.RANK_MAX), bArr, obj != null ? C1352h.m3246c(i5, bArr, i4) : C1352h.m3243b(i5, bArr, i4)));
        } else if (i >= IjkMediaCodecInfo.RANK_MAX) {
            i3 = i / IjkMediaCodecInfo.RANK_MAX;
            return C1352h.m3246c(i - (i3 * IjkMediaCodecInfo.RANK_MAX), bArr, C1352h.m3243b(i3, bArr, i2));
        } else if (i >= 10) {
            return C1352h.m3243b(i, bArr, i2);
        } else {
            i3 = i2 + 1;
            bArr[i2] = (byte) (48 + i);
            return i3;
        }
    }

    public static int m3237a(int i, char[] cArr, int i2) {
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return C1352h.m3239a((long) i, cArr, i2);
            }
            int i3 = i2 + 1;
            cArr[i2] = '-';
            i = -i;
            i2 = i3;
        }
        if (i >= f4211b) {
            int i4;
            Object obj = i >= f4212c ? 1 : null;
            if (obj != null) {
                i -= f4212c;
                if (i >= f4212c) {
                    i -= f4212c;
                    i4 = i2 + 1;
                    cArr[i2] = '2';
                } else {
                    i4 = i2 + 1;
                    cArr[i2] = '1';
                }
            } else {
                i4 = i2;
            }
            i2 = i / IjkMediaCodecInfo.RANK_MAX;
            int i5 = i2 / IjkMediaCodecInfo.RANK_MAX;
            return C1352h.m3247c(i - (i2 * IjkMediaCodecInfo.RANK_MAX), cArr, C1352h.m3247c(i2 - (i5 * IjkMediaCodecInfo.RANK_MAX), cArr, obj != null ? C1352h.m3247c(i5, cArr, i4) : C1352h.m3244b(i5, cArr, i4)));
        } else if (i >= IjkMediaCodecInfo.RANK_MAX) {
            i3 = i / IjkMediaCodecInfo.RANK_MAX;
            return C1352h.m3247c(i - (i3 * IjkMediaCodecInfo.RANK_MAX), cArr, C1352h.m3244b(i3, cArr, i2));
        } else if (i >= 10) {
            return C1352h.m3244b(i, cArr, i2);
        } else {
            i3 = i2 + 1;
            cArr[i2] = (char) (48 + i);
            return i3;
        }
    }

    public static int m3238a(long j, byte[] bArr, int i) {
        int b;
        int i2;
        long j2;
        int i3;
        int i4;
        if (j >= 0) {
            if (j <= f4216g) {
            }
            b = C1352h.m3245b(j) + i;
            i2 = b;
            while (j > f4216g) {
                i2 -= 3;
                j2 = j / f4214e;
                C1352h.m3246c((int) (j - (f4214e * j2)), bArr, i2);
                j = j2;
            }
            i3 = (int) j;
            while (i3 >= IjkMediaCodecInfo.RANK_MAX) {
                i2 -= 3;
                i4 = i3 / IjkMediaCodecInfo.RANK_MAX;
                C1352h.m3246c(i3 - (i4 * IjkMediaCodecInfo.RANK_MAX), bArr, i2);
                i3 = i4;
            }
            C1352h.m3243b(i3, bArr, i);
            return b;
        } else if (j <= f4215f) {
            if (j == Long.MIN_VALUE) {
                i3 = f4210a.length();
                i4 = 0;
                while (i4 < i3) {
                    b = i + 1;
                    bArr[i] = (byte) f4210a.charAt(i4);
                    i4++;
                    i = b;
                }
                return i;
            }
            b = i + 1;
            bArr[i] = (byte) 45;
            j = -j;
            i = b;
            b = C1352h.m3245b(j) + i;
            i2 = b;
            while (j > f4216g) {
                i2 -= 3;
                j2 = j / f4214e;
                C1352h.m3246c((int) (j - (f4214e * j2)), bArr, i2);
                j = j2;
            }
            i3 = (int) j;
            while (i3 >= IjkMediaCodecInfo.RANK_MAX) {
                i2 -= 3;
                i4 = i3 / IjkMediaCodecInfo.RANK_MAX;
                C1352h.m3246c(i3 - (i4 * IjkMediaCodecInfo.RANK_MAX), bArr, i2);
                i3 = i4;
            }
            C1352h.m3243b(i3, bArr, i);
            return b;
        }
        return C1352h.m3236a((int) j, bArr, i);
    }

    public static int m3239a(long j, char[] cArr, int i) {
        int b;
        int i2;
        long j2;
        int i3;
        int i4;
        if (j >= 0) {
            if (j <= f4216g) {
            }
            b = C1352h.m3245b(j) + i;
            i2 = b;
            while (j > f4216g) {
                i2 -= 3;
                j2 = j / f4214e;
                C1352h.m3247c((int) (j - (f4214e * j2)), cArr, i2);
                j = j2;
            }
            i3 = (int) j;
            while (i3 >= IjkMediaCodecInfo.RANK_MAX) {
                i2 -= 3;
                i4 = i3 / IjkMediaCodecInfo.RANK_MAX;
                C1352h.m3247c(i3 - (i4 * IjkMediaCodecInfo.RANK_MAX), cArr, i2);
                i3 = i4;
            }
            C1352h.m3244b(i3, cArr, i);
            return b;
        } else if (j <= f4215f) {
            if (j == Long.MIN_VALUE) {
                i3 = f4210a.length();
                f4210a.getChars(0, i3, cArr, i);
                return i + i3;
            }
            b = i + 1;
            cArr[i] = '-';
            j = -j;
            i = b;
            b = C1352h.m3245b(j) + i;
            i2 = b;
            while (j > f4216g) {
                i2 -= 3;
                j2 = j / f4214e;
                C1352h.m3247c((int) (j - (f4214e * j2)), cArr, i2);
                j = j2;
            }
            i3 = (int) j;
            while (i3 >= IjkMediaCodecInfo.RANK_MAX) {
                i2 -= 3;
                i4 = i3 / IjkMediaCodecInfo.RANK_MAX;
                C1352h.m3247c(i3 - (i4 * IjkMediaCodecInfo.RANK_MAX), cArr, i2);
                i3 = i4;
            }
            C1352h.m3244b(i3, cArr, i);
            return b;
        }
        return C1352h.m3237a((int) j, cArr, i);
    }

    public static String m3240a(double d) {
        return Double.toString(d);
    }

    public static String m3241a(int i) {
        if (i < f4220k.length) {
            if (i >= 0) {
                return f4220k[i];
            }
            int i2 = (-i) - 1;
            if (i2 < f4221l.length) {
                return f4221l[i2];
            }
        }
        return Integer.toString(i);
    }

    public static String m3242a(long j) {
        return (j > 2147483647L || j < -2147483648L) ? Long.toString(j) : C1352h.m3241a((int) j);
    }

    private static int m3243b(int i, byte[] bArr, int i2) {
        int i3;
        i <<= 2;
        int i4 = i + 1;
        char c = f4217h[i];
        if (c != '\u0000') {
            i3 = i2 + 1;
            bArr[i2] = (byte) c;
            i2 = i3;
        }
        i3 = i4 + 1;
        c = f4217h[i4];
        if (c != '\u0000') {
            i4 = i2 + 1;
            bArr[i2] = (byte) c;
            i2 = i4;
        }
        i = i2 + 1;
        bArr[i2] = (byte) f4217h[i3];
        return i;
    }

    private static int m3244b(int i, char[] cArr, int i2) {
        int i3;
        i <<= 2;
        int i4 = i + 1;
        char c = f4217h[i];
        if (c != '\u0000') {
            i3 = i2 + 1;
            cArr[i2] = c;
            i2 = i3;
        }
        i3 = i4 + 1;
        c = f4217h[i4];
        if (c != '\u0000') {
            i4 = i2 + 1;
            cArr[i2] = c;
            i2 = i4;
        }
        i = i2 + 1;
        cArr[i2] = f4217h[i3];
        return i;
    }

    private static int m3245b(long j) {
        int i = 10;
        for (long j2 = f4213d; j >= j2 && i != 19; j2 = (j2 << 3) + (j2 << 1)) {
            i++;
        }
        return i;
    }

    private static int m3246c(int i, byte[] bArr, int i2) {
        i <<= 2;
        int i3 = i2 + 1;
        int i4 = i + 1;
        bArr[i2] = f4219j[i];
        i = i3 + 1;
        int i5 = i4 + 1;
        bArr[i3] = f4219j[i4];
        i2 = i + 1;
        bArr[i] = f4219j[i5];
        return i2;
    }

    private static int m3247c(int i, char[] cArr, int i2) {
        i <<= 2;
        int i3 = i2 + 1;
        int i4 = i + 1;
        cArr[i2] = f4218i[i];
        i = i3 + 1;
        int i5 = i4 + 1;
        cArr[i3] = f4218i[i4];
        i2 = i + 1;
        cArr[i] = f4218i[i5];
        return i2;
    }
}
