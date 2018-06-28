package org.msgpack.core.buffer;

import java.nio.ByteBuffer;
import org.msgpack.core.Preconditions;

public class MessageBufferU extends MessageBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final ByteBuffer wrap;

    private MessageBufferU(Object obj, long j, int i, ByteBuffer byteBuffer) {
        super(obj, j, i);
        this.wrap = byteBuffer;
    }

    MessageBufferU(ByteBuffer byteBuffer) {
        super(byteBuffer);
        this.wrap = byteBuffer.slice();
    }

    MessageBufferU(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
        this.wrap = ByteBuffer.wrap(bArr, i, i2).slice();
    }

    private void resetBufferPosition() {
        this.wrap.position(0);
        this.wrap.limit(this.size);
    }

    public void copyTo(int i, MessageBuffer messageBuffer, int i2, int i3) {
        try {
            this.wrap.position(i);
            messageBuffer.putByteBuffer(i2, this.wrap, i3);
        } finally {
            resetBufferPosition();
        }
    }

    public boolean getBoolean(int i) {
        return this.wrap.get(i) != (byte) 0;
    }

    public byte getByte(int i) {
        return this.wrap.get(i);
    }

    public void getBytes(int i, int i2, ByteBuffer byteBuffer) {
        try {
            this.wrap.position(i);
            this.wrap.limit(i + i2);
            byteBuffer.put(this.wrap);
        } finally {
            resetBufferPosition();
        }
    }

    public void getBytes(int i, byte[] bArr, int i2, int i3) {
        try {
            this.wrap.position(i);
            this.wrap.get(bArr, i2, i3);
        } finally {
            resetBufferPosition();
        }
    }

    public double getDouble(int i) {
        return this.wrap.getDouble(i);
    }

    public float getFloat(int i) {
        return this.wrap.getFloat(i);
    }

    public int getInt(int i) {
        return this.wrap.getInt(i);
    }

    public long getLong(int i) {
        return this.wrap.getLong(i);
    }

    public short getShort(int i) {
        return this.wrap.getShort(i);
    }

    public void putBoolean(int i, boolean z) {
        this.wrap.put(i, z);
    }

    public void putByte(int i, byte b) {
        this.wrap.put(i, b);
    }

    public void putByteBuffer(int i, ByteBuffer byteBuffer, int i2) {
        if (byteBuffer.hasArray()) {
            putBytes(i, byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), i2);
            byteBuffer.position(byteBuffer.position() + i2);
            return;
        }
        int limit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i2);
            this.wrap.position(i);
            this.wrap.put(byteBuffer);
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public void putBytes(int i, byte[] bArr, int i2, int i3) {
        try {
            this.wrap.position(i);
            this.wrap.put(bArr, i2, i3);
        } finally {
            resetBufferPosition();
        }
    }

    public void putDouble(int i, double d) {
        this.wrap.putDouble(i, d);
    }

    public void putFloat(int i, float f) {
        this.wrap.putFloat(i, f);
    }

    public void putInt(int i, int i2) {
        this.wrap.putInt(i, i2);
    }

    public void putLong(int i, long j) {
        this.wrap.putLong(i, j);
    }

    public void putMessageBuffer(int i, MessageBuffer messageBuffer, int i2, int i3) {
        putBytes(i, messageBuffer.toByteArray(), i2, i3);
    }

    public void putShort(int i, short s) {
        this.wrap.putShort(i, s);
    }

    public MessageBufferU slice(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        MessageBufferU messageBufferU = i + i2;
        Preconditions.checkArgument(messageBufferU <= size());
        try {
            this.wrap.position(i);
            this.wrap.limit(messageBufferU);
            MessageBufferU messageBufferU2 = new MessageBufferU(this.base, this.address + ((long) i), i2, this.wrap.slice());
            return messageBufferU;
        } finally {
            resetBufferPosition();
        }
    }

    public ByteBuffer sliceAsByteBuffer() {
        return sliceAsByteBuffer(0, this.size);
    }

    public ByteBuffer sliceAsByteBuffer(int i, int i2) {
        try {
            this.wrap.position(i);
            this.wrap.limit(i + i2);
            ByteBuffer slice = this.wrap.slice();
            return slice;
        } finally {
            resetBufferPosition();
        }
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        getBytes(0, bArr, 0, bArr.length);
        return bArr;
    }
}
