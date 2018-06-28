package org.msgpack.io;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;

public final class LinkedBufferOutput extends BufferedOutput {
    private LinkedList<Link> link = new LinkedList();
    private int size;

    private static final class Link {
        final byte[] buffer;
        final int offset;
        final int size;

        Link(byte[] bArr, int i, int i2) {
            this.buffer = bArr;
            this.offset = i;
            this.size = i2;
        }
    }

    public LinkedBufferOutput(int i) {
        super(i);
    }

    public final void clear() {
        this.link.clear();
        this.size = 0;
        this.filled = 0;
    }

    public final void close() {
    }

    public final /* bridge */ /* synthetic */ void flush() {
        super.flush();
    }

    protected final boolean flushBuffer(byte[] bArr, int i, int i2) {
        this.link.add(new Link(bArr, i, i2));
        this.size += i2;
        return false;
    }

    public final int getSize() {
        return this.size + this.filled;
    }

    public final byte[] toByteArray() {
        Object obj = new byte[(this.size + this.filled)];
        Iterator it = this.link.iterator();
        int i = 0;
        while (it.hasNext()) {
            Link link = (Link) it.next();
            System.arraycopy(link.buffer, link.offset, obj, i, link.size);
            i += link.size;
        }
        if (this.filled > 0) {
            System.arraycopy(this.buffer, 0, obj, i, this.filled);
        }
        return obj;
    }

    public final /* bridge */ /* synthetic */ void write(ByteBuffer byteBuffer) {
        super.write(byteBuffer);
    }

    public final /* bridge */ /* synthetic */ void write(byte[] bArr, int i, int i2) {
        super.write(bArr, i, i2);
    }

    public final /* bridge */ /* synthetic */ void writeByte(byte b) {
        super.writeByte(b);
    }

    public final /* bridge */ /* synthetic */ void writeByteAndByte(byte b, byte b2) {
        super.writeByteAndByte(b, b2);
    }

    public final /* bridge */ /* synthetic */ void writeByteAndDouble(byte b, double d) {
        super.writeByteAndDouble(b, d);
    }

    public final /* bridge */ /* synthetic */ void writeByteAndFloat(byte b, float f) {
        super.writeByteAndFloat(b, f);
    }

    public final /* bridge */ /* synthetic */ void writeByteAndInt(byte b, int i) {
        super.writeByteAndInt(b, i);
    }

    public final /* bridge */ /* synthetic */ void writeByteAndLong(byte b, long j) {
        super.writeByteAndLong(b, j);
    }

    public final /* bridge */ /* synthetic */ void writeByteAndShort(byte b, short s) {
        super.writeByteAndShort(b, s);
    }

    public final /* bridge */ /* synthetic */ void writeDouble(double d) {
        super.writeDouble(d);
    }

    public final /* bridge */ /* synthetic */ void writeFloat(float f) {
        super.writeFloat(f);
    }

    public final /* bridge */ /* synthetic */ void writeInt(int i) {
        super.writeInt(i);
    }

    public final /* bridge */ /* synthetic */ void writeLong(long j) {
        super.writeLong(j);
    }

    public final /* bridge */ /* synthetic */ void writeShort(short s) {
        super.writeShort(s);
    }
}
