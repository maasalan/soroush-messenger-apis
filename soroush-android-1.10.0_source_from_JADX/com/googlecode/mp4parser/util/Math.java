package com.googlecode.mp4parser.util;

public class Math {
    public static int gcd(int i, int i2) {
        while (true) {
            int i3 = i2;
            i2 = i;
            i = i3;
            if (i <= 0) {
                return i2;
            }
            i2 %= i;
        }
    }

    public static long gcd(long j, long j2) {
        while (true) {
            long j3 = j;
            j = j2;
            j2 = j3;
            if (j <= 0) {
                return j2;
            }
            j2 %= j;
        }
    }

    public static int lcm(int i, int i2) {
        return i * (i2 / gcd(i, i2));
    }

    public static long lcm(long j, long j2) {
        return j * (j2 / gcd(j, j2));
    }
}
