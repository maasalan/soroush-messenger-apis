package org.jivesoftware.smack.sm;

import java.math.BigInteger;

public class SMUtils {
    private static long MASK_32_BIT = BigInteger.ONE.shiftLeft(32).subtract(BigInteger.ONE).longValue();

    public static long calculateDelta(long j, long j2) {
        if (j2 <= j) {
            return (j - j2) & MASK_32_BIT;
        }
        StringBuilder stringBuilder = new StringBuilder("Illegal Stream Management State: Last known handled count (");
        stringBuilder.append(j2);
        stringBuilder.append(") is greater than reported handled count (");
        stringBuilder.append(j);
        stringBuilder.append(')');
        throw new IllegalStateException(stringBuilder.toString());
    }

    public static long incrementHeight(long j) {
        return (j + 1) & MASK_32_BIT;
    }
}
