package com.googlecode.mp4parser.util;

public class CastUtils {
    public static int l2i(long j) {
        if (j <= 2147483647L) {
            if (j >= -2147483648L) {
                return (int) j;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("A cast to int has gone wrong. Please contact the mp4parser discussion group (");
        stringBuilder.append(j);
        stringBuilder.append(")");
        throw new RuntimeException(stringBuilder.toString());
    }
}
