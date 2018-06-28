package org.msgpack.io;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class StreamInput extends AbstractInput {
    private byte[] castBuffer = new byte[8];
    private ByteBuffer castByteBuffer = ByteBuffer.wrap(this.castBuffer);
    private int filled = 0;
    private final InputStream in;

    public StreamInput(InputStream inputStream) {
        this.in = inputStream;
    }

    private void require(int i) {
        while (this.filled < i) {
            int read = this.in.read(this.castBuffer, this.filled, i - this.filled);
            if (read < 0) {
                throw new EOFException();
            }
            this.filled += read;
        }
    }

    public void advance() {
        incrReadByteCount(this.filled);
        this.filled = 0;
    }

    public void close() {
        this.in.close();
    }

    public byte getByte() {
        require(1);
        return this.castBuffer[0];
    }

    public double getDouble() {
        require(8);
        return this.castByteBuffer.getDouble(0);
    }

    public float getFloat() {
        require(4);
        return this.castByteBuffer.getFloat(0);
    }

    public int getInt() {
        require(4);
        return this.castByteBuffer.getInt(0);
    }

    public long getLong() {
        require(8);
        return this.castByteBuffer.getLong(0);
    }

    public /* bridge */ /* synthetic */ int getReadByteCount() {
        return super.getReadByteCount();
    }

    public short getShort() {
        require(2);
        return this.castByteBuffer.getShort(0);
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3 = i;
        i = i2;
        while (i > 0) {
            int read = this.in.read(bArr, i3, i);
            if (read <= 0) {
                throw new EOFException();
            }
            incrReadByteCount(read);
            i -= read;
            i3 += read;
        }
        return i2;
    }

    public byte readByte() {
        int read = this.in.read();
        if (read < 0) {
            throw new EOFException();
        }
        incrReadOneByteCount();
        return (byte) read;
    }

    public /* bridge */ /* synthetic */ void resetReadByteCount() {
        super.resetReadByteCount();
    }

    public boolean tryRefer(BufferReferer bufferReferer, int i) {
        return false;
    }
}
