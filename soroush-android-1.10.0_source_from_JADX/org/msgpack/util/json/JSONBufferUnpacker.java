package org.msgpack.util.json;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.ByteBuffer;
import org.msgpack.MessagePack;
import org.msgpack.unpacker.BufferUnpacker;

public class JSONBufferUnpacker extends JSONUnpacker implements BufferUnpacker {
    private static final int DEFAULT_BUFFER_SIZE = 512;

    public JSONBufferUnpacker() {
        this(512);
    }

    public JSONBufferUnpacker(int i) {
        this(new MessagePack(), i);
    }

    public JSONBufferUnpacker(MessagePack messagePack) {
        this(messagePack, 512);
    }

    public JSONBufferUnpacker(MessagePack messagePack, int i) {
        super(messagePack, newEmptyReader());
    }

    private static Reader newEmptyReader() {
        return new InputStreamReader(new ByteArrayInputStream(new byte[0]));
    }

    public void clear() {
        reset();
        this.in = newEmptyReader();
    }

    public void copyReferencedBuffer() {
        throw new UnsupportedOperationException("JSONBufferUnpacker doesn't support copyReferencedBuffer()");
    }

    public JSONBufferUnpacker feed(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("JSONBufferUnpacker doesn't support feed()");
    }

    public JSONBufferUnpacker feed(ByteBuffer byteBuffer, boolean z) {
        throw new UnsupportedOperationException("JSONBufferUnpacker doesn't support feed()");
    }

    public JSONBufferUnpacker feed(byte[] bArr) {
        throw new UnsupportedOperationException("JSONBufferUnpacker doesn't support feed()");
    }

    public JSONBufferUnpacker feed(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("JSONBufferUnpacker doesn't support feed()");
    }

    public JSONBufferUnpacker feed(byte[] bArr, int i, int i2, boolean z) {
        throw new UnsupportedOperationException("JSONBufferUnpacker doesn't support feed()");
    }

    public JSONBufferUnpacker feed(byte[] bArr, boolean z) {
        throw new UnsupportedOperationException("JSONBufferUnpacker doesn't support feed()");
    }

    public int getBufferSize() {
        throw new UnsupportedOperationException("JSONBufferUnpacker doesn't support getBufferSize()");
    }

    public JSONBufferUnpacker wrap(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("JSONBufferUnpacker doesn't support wrap(ByteBuffer buf)");
    }

    public JSONBufferUnpacker wrap(byte[] bArr) {
        return wrap(bArr, 0, bArr.length);
    }

    public JSONBufferUnpacker wrap(byte[] bArr, int i, int i2) {
        this.in = new InputStreamReader(new ByteArrayInputStream(bArr, i, i2));
        return this;
    }
}
