package org.msgpack.io;

import java.nio.ByteBuffer;

abstract class BufferedOutput implements Output {
    protected byte[] buffer;
    protected final int bufferSize;
    protected ByteBuffer castByteBuffer;
    protected int filled;

    public BufferedOutput(int i) {
        if (i < 9) {
            i = 9;
        }
        this.bufferSize = i;
    }

    private void allocateNewBuffer() {
        this.buffer = new byte[this.bufferSize];
        this.castByteBuffer = ByteBuffer.wrap(this.buffer);
    }

    private void reserve(int i) {
        if (this.buffer == null) {
            allocateNewBuffer();
            return;
        }
        if (this.bufferSize - this.filled < i) {
            if (!flushBuffer(this.buffer, 0, this.filled)) {
                this.buffer = new byte[this.bufferSize];
                this.castByteBuffer = ByteBuffer.wrap(this.buffer);
            }
            this.filled = 0;
        }
    }

    public void flush() {
        if (this.filled > 0) {
            if (!flushBuffer(this.buffer, 0, this.filled)) {
                this.buffer = null;
            }
            this.filled = 0;
        }
    }

    protected abstract boolean flushBuffer(byte[] bArr, int i, int i2);

    protected void flushByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            flushBuffer(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.limit());
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        flushBuffer(bArr, 0, bArr.length);
    }

    public void write(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (this.buffer == null) {
            if (this.bufferSize < remaining) {
                flushByteBuffer(byteBuffer);
                return;
            }
            allocateNewBuffer();
        }
        if (remaining <= this.bufferSize - this.filled) {
            byteBuffer.get(this.buffer, this.filled, remaining);
            this.filled += remaining;
        } else if (remaining <= this.bufferSize) {
            if (!flushBuffer(this.buffer, 0, this.filled)) {
                allocateNewBuffer();
            }
            this.filled = 0;
            byteBuffer.get(this.buffer, 0, remaining);
            this.filled = remaining;
        } else {
            flush();
            flushByteBuffer(byteBuffer);
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        if (this.buffer == null) {
            if (this.bufferSize < i2) {
                flushBuffer(bArr, i, i2);
                return;
            }
            allocateNewBuffer();
        }
        if (i2 <= this.bufferSize - this.filled) {
            System.arraycopy(bArr, i, this.buffer, this.filled, i2);
            this.filled += i2;
        } else if (i2 <= this.bufferSize) {
            if (!flushBuffer(this.buffer, 0, this.filled)) {
                allocateNewBuffer();
            }
            this.filled = 0;
            System.arraycopy(bArr, i, this.buffer, 0, i2);
            this.filled = i2;
        } else {
            flush();
            flushBuffer(bArr, i, i2);
        }
    }

    public void writeByte(byte b) {
        reserve(1);
        byte[] bArr = this.buffer;
        int i = this.filled;
        this.filled = i + 1;
        bArr[i] = b;
    }

    public void writeByteAndByte(byte b, byte b2) {
        reserve(2);
        byte[] bArr = this.buffer;
        int i = this.filled;
        this.filled = i + 1;
        bArr[i] = b;
        byte[] bArr2 = this.buffer;
        int i2 = this.filled;
        this.filled = i2 + 1;
        bArr2[i2] = b2;
    }

    public void writeByteAndDouble(byte b, double d) {
        reserve(9);
        byte[] bArr = this.buffer;
        int i = this.filled;
        this.filled = i + 1;
        bArr[i] = b;
        this.castByteBuffer.putDouble(this.filled, d);
        this.filled += 8;
    }

    public void writeByteAndFloat(byte b, float f) {
        reserve(5);
        byte[] bArr = this.buffer;
        int i = this.filled;
        this.filled = i + 1;
        bArr[i] = b;
        this.castByteBuffer.putFloat(this.filled, f);
        this.filled += 4;
    }

    public void writeByteAndInt(byte b, int i) {
        reserve(5);
        byte[] bArr = this.buffer;
        int i2 = this.filled;
        this.filled = i2 + 1;
        bArr[i2] = b;
        this.castByteBuffer.putInt(this.filled, i);
        this.filled += 4;
    }

    public void writeByteAndLong(byte b, long j) {
        reserve(9);
        byte[] bArr = this.buffer;
        int i = this.filled;
        this.filled = i + 1;
        bArr[i] = b;
        this.castByteBuffer.putLong(this.filled, j);
        this.filled += 8;
    }

    public void writeByteAndShort(byte b, short s) {
        reserve(3);
        byte[] bArr = this.buffer;
        int i = this.filled;
        this.filled = i + 1;
        bArr[i] = b;
        this.castByteBuffer.putShort(this.filled, s);
        this.filled += 2;
    }

    public void writeDouble(double d) {
        reserve(8);
        this.castByteBuffer.putDouble(this.filled, d);
        this.filled += 8;
    }

    public void writeFloat(float f) {
        reserve(4);
        this.castByteBuffer.putFloat(this.filled, f);
        this.filled += 4;
    }

    public void writeInt(int i) {
        reserve(4);
        this.castByteBuffer.putInt(this.filled, i);
        this.filled += 4;
    }

    public void writeLong(long j) {
        reserve(8);
        this.castByteBuffer.putLong(this.filled, j);
        this.filled += 8;
    }

    public void writeShort(short s) {
        reserve(2);
        this.castByteBuffer.putShort(this.filled, s);
        this.filled += 2;
    }
}
