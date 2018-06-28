package org.msgpack.io;

import java.io.Closeable;
import java.io.Flushable;
import java.nio.ByteBuffer;

public interface Output extends Closeable, Flushable {
    void write(ByteBuffer byteBuffer);

    void write(byte[] bArr, int i, int i2);

    void writeByte(byte b);

    void writeByteAndByte(byte b, byte b2);

    void writeByteAndDouble(byte b, double d);

    void writeByteAndFloat(byte b, float f);

    void writeByteAndInt(byte b, int i);

    void writeByteAndLong(byte b, long j);

    void writeByteAndShort(byte b, short s);

    void writeDouble(double d);

    void writeFloat(float f);

    void writeInt(int i);

    void writeLong(long j);

    void writeShort(short s);
}
