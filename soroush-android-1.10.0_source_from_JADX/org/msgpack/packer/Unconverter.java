package org.msgpack.packer;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.msgpack.MessagePack;
import org.msgpack.MessageTypeException;
import org.msgpack.type.Value;
import org.msgpack.type.ValueFactory;

public class Unconverter extends AbstractPacker {
    private Value result;
    private PackerStack stack;
    private Object[] values;

    public Unconverter() {
        this(new MessagePack());
    }

    public Unconverter(MessagePack messagePack) {
        super(messagePack);
        this.stack = new PackerStack();
        this.values = new Object[128];
    }

    private void put(Value value) {
        if (this.stack.getDepth() <= 0) {
            this.result = value;
            return;
        }
        this.stack.checkCount();
        Value[] valueArr = (Value[]) this.values[this.stack.getDepth()];
        valueArr[valueArr.length - this.stack.getTopCount()] = value;
        this.stack.reduceCount();
    }

    private void putContainer(Value value) {
        if (this.stack.getDepth() <= 0) {
            this.values[0] = value;
            return;
        }
        this.stack.checkCount();
        Value[] valueArr = (Value[]) this.values[this.stack.getDepth()];
        valueArr[valueArr.length - this.stack.getTopCount()] = value;
        this.stack.reduceCount();
    }

    public void close() {
    }

    public void flush() {
    }

    public Value getResult() {
        return this.result;
    }

    public void resetResult() {
        this.result = null;
    }

    public Packer write(Value value) {
        put(value);
        return this;
    }

    public Packer writeArrayBegin(int i) {
        if (i == 0) {
            putContainer(ValueFactory.createArrayValue());
            this.stack.pushArray(0);
            this.values[this.stack.getDepth()] = null;
            return this;
        }
        Value[] valueArr = new Value[i];
        putContainer(ValueFactory.createArrayValue(valueArr, true));
        this.stack.pushArray(i);
        this.values[this.stack.getDepth()] = valueArr;
        return this;
    }

    public Packer writeArrayEnd(boolean z) {
        if (this.stack.topIsArray()) {
            int topCount = this.stack.getTopCount();
            if (topCount > 0) {
                if (z) {
                    throw new MessageTypeException("writeArrayEnd(check=true) is called but the array is not end");
                }
                for (int i = 0; i < topCount; i++) {
                    writeNil();
                }
            }
            this.stack.pop();
            if (this.stack.getDepth() <= 0) {
                this.result = (Value) this.values[0];
            }
            return this;
        }
        throw new MessageTypeException("writeArrayEnd() is called but writeArrayBegin() is not called");
    }

    public void writeBigInteger(BigInteger bigInteger) {
        put(ValueFactory.createIntegerValue(bigInteger));
    }

    public void writeBoolean(boolean z) {
        put(ValueFactory.createBooleanValue(z));
    }

    public void writeByte(byte b) {
        put(ValueFactory.createIntegerValue(b));
    }

    public void writeByteArray(byte[] bArr, int i, int i2) {
        put(ValueFactory.createRawValue(bArr, i, i2));
    }

    public void writeByteBuffer(ByteBuffer byteBuffer) {
        put(ValueFactory.createRawValue(byteBuffer));
    }

    public void writeDouble(double d) {
        put(ValueFactory.createFloatValue(d));
    }

    public void writeFloat(float f) {
        put(ValueFactory.createFloatValue(f));
    }

    public void writeInt(int i) {
        put(ValueFactory.createIntegerValue(i));
    }

    public void writeLong(long j) {
        put(ValueFactory.createIntegerValue(j));
    }

    public Packer writeMapBegin(int i) {
        this.stack.checkCount();
        if (i == 0) {
            putContainer(ValueFactory.createMapValue());
            this.stack.pushMap(0);
            this.values[this.stack.getDepth()] = null;
            return this;
        }
        Value[] valueArr = new Value[(i * 2)];
        putContainer(ValueFactory.createMapValue(valueArr, true));
        this.stack.pushMap(i);
        this.values[this.stack.getDepth()] = valueArr;
        return this;
    }

    public Packer writeMapEnd(boolean z) {
        if (this.stack.topIsMap()) {
            int topCount = this.stack.getTopCount();
            if (topCount > 0) {
                if (z) {
                    throw new MessageTypeException("writeMapEnd(check=true) is called but the map is not end");
                }
                for (int i = 0; i < topCount; i++) {
                    writeNil();
                }
            }
            this.stack.pop();
            if (this.stack.getDepth() <= 0) {
                this.result = (Value) this.values[0];
            }
            return this;
        }
        throw new MessageTypeException("writeMapEnd() is called but writeMapBegin() is not called");
    }

    public Packer writeNil() {
        put(ValueFactory.createNilValue());
        return this;
    }

    public void writeShort(short s) {
        put(ValueFactory.createIntegerValue(s));
    }

    public void writeString(String str) {
        put(ValueFactory.createRawValue(str));
    }
}
