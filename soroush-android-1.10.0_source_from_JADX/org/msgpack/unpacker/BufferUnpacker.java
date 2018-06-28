package org.msgpack.unpacker;

import java.nio.ByteBuffer;

public interface BufferUnpacker extends Unpacker {
    void clear();

    void copyReferencedBuffer();

    BufferUnpacker feed(ByteBuffer byteBuffer);

    BufferUnpacker feed(ByteBuffer byteBuffer, boolean z);

    BufferUnpacker feed(byte[] bArr);

    BufferUnpacker feed(byte[] bArr, int i, int i2);

    BufferUnpacker feed(byte[] bArr, int i, int i2, boolean z);

    BufferUnpacker feed(byte[] bArr, boolean z);

    int getBufferSize();

    BufferUnpacker wrap(ByteBuffer byteBuffer);

    BufferUnpacker wrap(byte[] bArr);

    BufferUnpacker wrap(byte[] bArr, int i, int i2);
}
