package org.msgpack.io;

import java.io.Closeable;

public interface Input extends Closeable {
    void advance();

    byte getByte();

    double getDouble();

    float getFloat();

    int getInt();

    long getLong();

    int getReadByteCount();

    short getShort();

    int read(byte[] bArr, int i, int i2);

    byte readByte();

    void resetReadByteCount();

    boolean tryRefer(BufferReferer bufferReferer, int i);
}
