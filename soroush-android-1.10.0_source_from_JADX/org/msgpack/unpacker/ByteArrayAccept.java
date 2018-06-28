package org.msgpack.unpacker;

import java.nio.ByteBuffer;

final class ByteArrayAccept extends Accept {
    byte[] value;

    ByteArrayAccept() {
        super("raw value");
    }

    final void acceptEmptyRaw() {
        this.value = new byte[0];
    }

    final void acceptRaw(byte[] bArr) {
        this.value = bArr;
    }

    public final void refer(ByteBuffer byteBuffer, boolean z) {
        this.value = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.value);
    }
}
