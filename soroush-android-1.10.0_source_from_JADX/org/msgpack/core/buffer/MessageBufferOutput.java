package org.msgpack.core.buffer;

import java.io.Closeable;
import java.io.Flushable;

public interface MessageBufferOutput extends Closeable, Flushable {
    void add(byte[] bArr, int i, int i2);

    MessageBuffer next(int i);

    void write(byte[] bArr, int i, int i2);

    void writeBuffer(int i);
}
