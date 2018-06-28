package org.msgpack.io;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

public class ByteBufferOutput implements Output {
    private ByteBuffer buffer;
    private ExpandBufferCallback callback;

    public interface ExpandBufferCallback {
        ByteBuffer call(ByteBuffer byteBuffer, int i);
    }

    public ByteBufferOutput(ByteBuffer byteBuffer) {
        this(byteBuffer, null);
    }

    public ByteBufferOutput(ByteBuffer byteBuffer, ExpandBufferCallback expandBufferCallback) {
        this.buffer = byteBuffer;
        this.callback = expandBufferCallback;
    }

    private void reserve(int i) {
        if (i > this.buffer.remaining()) {
            if (this.callback == null) {
                throw new BufferOverflowException();
            }
            this.buffer = this.callback.call(this.buffer, i);
        }
    }

    public void close() {
    }

    public void flush() {
    }

    public void write(ByteBuffer byteBuffer) {
        reserve(byteBuffer.remaining());
        this.buffer.put(byteBuffer);
    }

    public void write(byte[] bArr, int i, int i2) {
        reserve(i2);
        this.buffer.put(bArr, i, i2);
    }

    public void writeByte(byte b) {
        reserve(1);
        this.buffer.put(b);
    }

    public void writeByteAndByte(byte b, byte b2) {
        reserve(2);
        this.buffer.put(b);
        this.buffer.put(b2);
    }

    public void writeByteAndDouble(byte b, double d) {
        reserve(9);
        this.buffer.put(b);
        this.buffer.putDouble(d);
    }

    public void writeByteAndFloat(byte b, float f) {
        reserve(5);
        this.buffer.put(b);
        this.buffer.putFloat(f);
    }

    public void writeByteAndInt(byte b, int i) {
        reserve(5);
        this.buffer.put(b);
        this.buffer.putInt(i);
    }

    public void writeByteAndLong(byte b, long j) {
        reserve(9);
        this.buffer.put(b);
        this.buffer.putLong(j);
    }

    public void writeByteAndShort(byte b, short s) {
        reserve(3);
        this.buffer.put(b);
        this.buffer.putShort(s);
    }

    public void writeDouble(double d) {
        reserve(8);
        this.buffer.putDouble(d);
    }

    public void writeFloat(float f) {
        reserve(4);
        this.buffer.putFloat(f);
    }

    public void writeInt(int i) {
        reserve(4);
        this.buffer.putInt(i);
    }

    public void writeLong(long j) {
        reserve(8);
        this.buffer.putLong(j);
    }

    public void writeShort(short s) {
        reserve(2);
        this.buffer.putShort(s);
    }
}
