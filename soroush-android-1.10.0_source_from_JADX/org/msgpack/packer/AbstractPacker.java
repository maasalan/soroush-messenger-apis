package org.msgpack.packer;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.msgpack.MessagePack;
import org.msgpack.type.Value;

public abstract class AbstractPacker implements Packer {
    protected MessagePack msgpack;

    protected AbstractPacker(MessagePack messagePack) {
        this.msgpack = messagePack;
    }

    public void close() {
    }

    public Packer write(byte b) {
        writeByte(b);
        return this;
    }

    public Packer write(double d) {
        writeDouble(d);
        return this;
    }

    public Packer write(float f) {
        writeFloat(f);
        return this;
    }

    public Packer write(int i) {
        writeInt(i);
        return this;
    }

    public Packer write(long j) {
        writeLong(j);
        return this;
    }

    public Packer write(Boolean bool) {
        if (bool == null) {
            writeNil();
            return this;
        }
        writeBoolean(bool.booleanValue());
        return this;
    }

    public Packer write(Byte b) {
        if (b == null) {
            writeNil();
            return this;
        }
        writeByte(b.byteValue());
        return this;
    }

    public Packer write(Double d) {
        if (d == null) {
            writeNil();
            return this;
        }
        writeDouble(d.doubleValue());
        return this;
    }

    public Packer write(Float f) {
        if (f == null) {
            writeNil();
            return this;
        }
        writeFloat(f.floatValue());
        return this;
    }

    public Packer write(Integer num) {
        if (num == null) {
            writeNil();
            return this;
        }
        writeInt(num.intValue());
        return this;
    }

    public Packer write(Long l) {
        if (l == null) {
            writeNil();
            return this;
        }
        writeLong(l.longValue());
        return this;
    }

    public Packer write(Object obj) {
        if (obj == null) {
            writeNil();
            return this;
        }
        this.msgpack.lookup(obj.getClass()).write(this, obj);
        return this;
    }

    public Packer write(Short sh) {
        if (sh == null) {
            writeNil();
            return this;
        }
        writeShort(sh.shortValue());
        return this;
    }

    public Packer write(String str) {
        if (str == null) {
            writeNil();
            return this;
        }
        writeString(str);
        return this;
    }

    public Packer write(BigInteger bigInteger) {
        if (bigInteger == null) {
            writeNil();
            return this;
        }
        writeBigInteger(bigInteger);
        return this;
    }

    public Packer write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            writeNil();
            return this;
        }
        writeByteBuffer(byteBuffer);
        return this;
    }

    public Packer write(Value value) {
        if (value == null) {
            writeNil();
            return this;
        }
        value.writeTo(this);
        return this;
    }

    public Packer write(short s) {
        writeShort(s);
        return this;
    }

    public Packer write(boolean z) {
        writeBoolean(z);
        return this;
    }

    public Packer write(byte[] bArr) {
        if (bArr == null) {
            writeNil();
            return this;
        }
        writeByteArray(bArr);
        return this;
    }

    public Packer write(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            writeNil();
            return this;
        }
        writeByteArray(bArr, i, i2);
        return this;
    }

    public Packer writeArrayEnd() {
        writeArrayEnd(true);
        return this;
    }

    public abstract void writeBigInteger(BigInteger bigInteger);

    public abstract void writeBoolean(boolean z);

    public abstract void writeByte(byte b);

    protected void writeByteArray(byte[] bArr) {
        writeByteArray(bArr, 0, bArr.length);
    }

    public abstract void writeByteArray(byte[] bArr, int i, int i2);

    public abstract void writeByteBuffer(ByteBuffer byteBuffer);

    public abstract void writeDouble(double d);

    public abstract void writeFloat(float f);

    public abstract void writeInt(int i);

    public abstract void writeLong(long j);

    public Packer writeMapEnd() {
        writeMapEnd(true);
        return this;
    }

    public abstract void writeShort(short s);

    public abstract void writeString(String str);
}
