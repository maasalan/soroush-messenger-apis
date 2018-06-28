package mobi.mmdt.componentsutils.p231a;

import android.content.Context;
import java.util.Calendar;

public final class C2464b {
    private static long m6696a(int i, int i2) {
        long j = (long) (i >= 0 ? i - 474 : i - 473);
        long j2 = 474 + (j % 2820);
        return ((((1 + ((long) (i2 <= 7 ? (i2 - 1) * 31 : ((i2 - 1) * 30) + 6))) + (((682 * j2) - 110) / 2816)) + ((j2 - 1) * 365)) + ((j / 2820) * 1029983)) + 1948320;
    }

    public static final C5761e m6697a(Context context, Calendar calendar) {
        long j;
        int i;
        double d;
        double d2;
        int ceil;
        Calendar calendar2 = calendar;
        long j2 = (long) calendar2.get(1);
        long j3 = (long) (calendar2.get(2) + 1);
        long j4 = (long) calendar2.get(5);
        if (j2 <= 1582 && (j2 != 1582 || j3 <= 10)) {
            if (j2 != 1582 || j3 != 10 || j4 <= 14) {
                j4 = ((((367 * j2) - ((7 * ((j2 + 5001) + ((j3 - 9) / 7))) / 4)) + ((275 * j3) / 9)) + j4) + 1729777;
                j3 = j4 - C2464b.m6696a(475, 1);
                j = j3 / 1029983;
                j3 %= 1029983;
                if (j3 != 1029982) {
                    j3 = 2820;
                } else {
                    long j5 = j3 / 366;
                    j3 = (((long) Math.floor(((double) (((2134 * j5) + (2816 * (j3 % 366))) + 2815)) / 1028522.0d)) + j5) + 1;
                }
                i = (int) ((j3 + (2820 * j)) + 474);
                if (i <= 0) {
                    i--;
                }
                j3 = (j4 - C2464b.m6696a(i, 1)) + 1;
                if (j3 > 186) {
                    d = (double) j3;
                    d2 = 31.0d;
                } else {
                    d = (double) (j3 - 6);
                    d2 = 30.0d;
                }
                ceil = (int) Math.ceil(d / d2);
                return new C5761e(context, i, ceil, ((int) (j4 - C2464b.m6696a(i, ceil))) + 1);
            }
        }
        long j6 = (j3 - 14) / 12;
        j4 = (((((1461 * ((j2 + 4800) + j6)) / 4) + ((367 * ((j3 - 2) - (12 * j6))) / 12)) - ((3 * (((j2 + 4900) + j6) / 100)) / 4)) + j4) - 32075;
        j3 = j4 - C2464b.m6696a(475, 1);
        j = j3 / 1029983;
        j3 %= 1029983;
        if (j3 != 1029982) {
            long j52 = j3 / 366;
            j3 = (((long) Math.floor(((double) (((2134 * j52) + (2816 * (j3 % 366))) + 2815)) / 1028522.0d)) + j52) + 1;
        } else {
            j3 = 2820;
        }
        i = (int) ((j3 + (2820 * j)) + 474);
        if (i <= 0) {
            i--;
        }
        j3 = (j4 - C2464b.m6696a(i, 1)) + 1;
        if (j3 > 186) {
            d = (double) (j3 - 6);
            d2 = 30.0d;
        } else {
            d = (double) j3;
            d2 = 31.0d;
        }
        ceil = (int) Math.ceil(d / d2);
        return new C5761e(context, i, ceil, ((int) (j4 - C2464b.m6696a(i, ceil))) + 1);
    }
}
