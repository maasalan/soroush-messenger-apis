package org.msgpack.io;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class StreamOutput implements Output {
    private DataOutputStream out;

    public StreamOutput(OutputStream outputStream) {
        this.out = new DataOutputStream(outputStream);
    }

    public void close() {
        this.out.close();
    }

    public void flush() {
    }

    public void write(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            this.out.write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.limit());
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        this.out.write(bArr);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
    }

    public void writeByte(byte b) {
        this.out.write(b);
    }

    public void writeByteAndByte(byte b, byte b2) {
        this.out.write(b);
        this.out.write(b2);
    }

    public void writeByteAndDouble(byte b, double d) {
        this.out.write(b);
        this.out.writeDouble(d);
    }

    public void writeByteAndFloat(byte b, float f) {
        this.out.write(b);
        this.out.writeFloat(f);
    }

    public void writeByteAndInt(byte b, int i) {
        this.out.write(b);
        this.out.writeInt(i);
    }

    public void writeByteAndLong(byte b, long j) {
        this.out.write(b);
        this.out.writeLong(j);
    }

    public void writeByteAndShort(byte b, short s) {
        this.out.write(b);
        this.out.writeShort(s);
    }

    public void writeDouble(double d) {
        this.out.writeDouble(d);
    }

    public void writeFloat(float f) {
        this.out.writeFloat(f);
    }

    public void writeInt(int i) {
        this.out.writeInt(i);
    }

    public void writeLong(long j) {
        this.out.writeLong(j);
    }

    public void writeShort(short s) {
        this.out.writeShort(s);
    }
}
