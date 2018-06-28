package org.msgpack.packer;

public interface BufferPacker extends Packer {
    void clear();

    int getBufferSize();

    byte[] toByteArray();
}
