package org.msgpack.unpacker;

import java.nio.ByteBuffer;
import org.msgpack.MessagePack;
import org.msgpack.io.LinkedBufferInput;

public class MessagePackBufferUnpacker extends MessagePackUnpacker implements BufferUnpacker {
    private static final int DEFAULT_BUFFER_SIZE = 512;

    public MessagePackBufferUnpacker(MessagePack messagePack) {
        this(messagePack, 512);
    }

    public MessagePackBufferUnpacker(MessagePack messagePack, int i) {
        super(messagePack, new LinkedBufferInput(i));
    }

    public void clear() {
        ((LinkedBufferInput) this.in).clear();
        reset();
    }

    public void copyReferencedBuffer() {
        ((LinkedBufferInput) this.in).copyReferencedBuffer();
    }

    public MessagePackBufferUnpacker feed(ByteBuffer byteBuffer) {
        ((LinkedBufferInput) this.in).feed(byteBuffer);
        return this;
    }

    public MessagePackBufferUnpacker feed(ByteBuffer byteBuffer, boolean z) {
        ((LinkedBufferInput) this.in).feed(byteBuffer, z);
        return this;
    }

    public MessagePackBufferUnpacker feed(byte[] bArr) {
        ((LinkedBufferInput) this.in).feed(bArr);
        return this;
    }

    public MessagePackBufferUnpacker feed(byte[] bArr, int i, int i2) {
        ((LinkedBufferInput) this.in).feed(bArr, i, i2);
        return this;
    }

    public MessagePackBufferUnpacker feed(byte[] bArr, int i, int i2, boolean z) {
        ((LinkedBufferInput) this.in).feed(bArr, i, i2, z);
        return this;
    }

    public MessagePackBufferUnpacker feed(byte[] bArr, boolean z) {
        ((LinkedBufferInput) this.in).feed(bArr, z);
        return this;
    }

    public int getBufferSize() {
        return ((LinkedBufferInput) this.in).getSize();
    }

    public MessagePackBufferUnpacker wrap(ByteBuffer byteBuffer) {
        ((LinkedBufferInput) this.in).clear();
        ((LinkedBufferInput) this.in).feed(byteBuffer, true);
        return this;
    }

    public MessagePackBufferUnpacker wrap(byte[] bArr) {
        return wrap(bArr, 0, bArr.length);
    }

    public MessagePackBufferUnpacker wrap(byte[] bArr, int i, int i2) {
        ((LinkedBufferInput) this.in).clear();
        ((LinkedBufferInput) this.in).feed(bArr, i, i2, true);
        return this;
    }
}
