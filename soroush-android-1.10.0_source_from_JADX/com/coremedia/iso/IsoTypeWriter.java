package com.coremedia.iso;

import java.nio.ByteBuffer;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class IsoTypeWriter {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static void writeFixedPoint0230(ByteBuffer byteBuffer, double d) {
        int i = (int) (d * 1.073741824E9d);
        byteBuffer.put((byte) ((-16777216 & i) >> 24));
        byteBuffer.put((byte) ((16711680 & i) >> 16));
        byteBuffer.put((byte) ((65280 & i) >> 8));
        byteBuffer.put((byte) (i & 255));
    }

    public static void writeFixedPoint1616(ByteBuffer byteBuffer, double d) {
        int i = (int) (d * 65536.0d);
        byteBuffer.put((byte) ((-16777216 & i) >> 24));
        byteBuffer.put((byte) ((16711680 & i) >> 16));
        byteBuffer.put((byte) ((65280 & i) >> 8));
        byteBuffer.put((byte) (i & 255));
    }

    public static void writeFixedPoint88(ByteBuffer byteBuffer, double d) {
        short s = (short) ((int) (d * 256.0d));
        byteBuffer.put((byte) ((65280 & s) >> 8));
        byteBuffer.put((byte) (s & 255));
    }

    public static void writeIso639(ByteBuffer byteBuffer, String str) {
        if (str.getBytes().length != 3) {
            StringBuilder stringBuilder = new StringBuilder("\"");
            stringBuilder.append(str);
            stringBuilder.append("\" language string isn't exactly 3 characters long!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int i = 0;
        int i2 = 0;
        while (i < 3) {
            i2 += (str.getBytes()[i] - 96) << ((2 - i) * 5);
            i++;
        }
        writeUInt16(byteBuffer, i2);
    }

    public static void writePascalUtfString(ByteBuffer byteBuffer, String str) {
        byte[] convert = Utf8.convert(str);
        writeUInt8(byteBuffer, convert.length);
        byteBuffer.put(convert);
    }

    public static void writeUInt16(ByteBuffer byteBuffer, int i) {
        i &= InBandBytestreamManager.MAXIMUM_BLOCK_SIZE;
        writeUInt8(byteBuffer, i >> 8);
        writeUInt8(byteBuffer, i & 255);
    }

    public static void writeUInt16BE(ByteBuffer byteBuffer, int i) {
        i &= InBandBytestreamManager.MAXIMUM_BLOCK_SIZE;
        writeUInt8(byteBuffer, i & 255);
        writeUInt8(byteBuffer, i >> 8);
    }

    public static void writeUInt24(ByteBuffer byteBuffer, int i) {
        i &= 16777215;
        writeUInt16(byteBuffer, i >> 8);
        writeUInt8(byteBuffer, i);
    }

    public static void writeUInt32(ByteBuffer byteBuffer, long j) {
        byteBuffer.putInt((int) j);
    }

    public static void writeUInt32BE(ByteBuffer byteBuffer, long j) {
        writeUInt16BE(byteBuffer, ((int) j) & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE);
        writeUInt16BE(byteBuffer, (int) ((j >> 16) & 65535));
    }

    public static void writeUInt48(ByteBuffer byteBuffer, long j) {
        long j2 = j & 281474976710655L;
        writeUInt16(byteBuffer, (int) (j2 >> 32));
        writeUInt32(byteBuffer, j2 & 4294967295L);
    }

    public static void writeUInt64(ByteBuffer byteBuffer, long j) {
        byteBuffer.putLong(j);
    }

    public static void writeUInt8(ByteBuffer byteBuffer, int i) {
        byteBuffer.put((byte) (i & 255));
    }

    public static void writeUtf8String(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(Utf8.convert(str));
        writeUInt8(byteBuffer, 0);
    }

    public static void writeZeroTermUtf8String(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(Utf8.convert(str));
        writeUInt8(byteBuffer, 0);
    }
}
