package com.googlecode.mp4parser.util;

import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

public class ByteBufferByteChannel implements ByteChannel {
    ByteBuffer byteBuffer;

    public ByteBufferByteChannel(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }

    public void close() {
    }

    public boolean isOpen() {
        return true;
    }

    public int read(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (this.byteBuffer.remaining() <= 0) {
            return -1;
        }
        byteBuffer.put((ByteBuffer) this.byteBuffer.duplicate().limit(this.byteBuffer.position() + byteBuffer.remaining()));
        this.byteBuffer.position(this.byteBuffer.position() + remaining);
        return remaining;
    }

    public int write(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        this.byteBuffer.put(byteBuffer);
        return remaining;
    }
}
