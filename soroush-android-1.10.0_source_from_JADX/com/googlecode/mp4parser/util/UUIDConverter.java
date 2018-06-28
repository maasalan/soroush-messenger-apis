package com.googlecode.mp4parser.util;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

public class UUIDConverter {
    public static UUID convert(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.BIG_ENDIAN);
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    public static byte[] convert(UUID uuid) {
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        byte[] bArr = new byte[16];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) ((int) (mostSignificantBits >>> (8 * (7 - i))));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            bArr[i2] = (byte) ((int) (leastSignificantBits >>> ((7 - i2) * 8)));
        }
        return bArr;
    }
}
