package org.msgpack.unpacker;

import java.io.EOFException;
import java.math.BigInteger;
import org.msgpack.MessagePack;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Unconverter;
import org.msgpack.type.ArrayValue;
import org.msgpack.type.MapValue;
import org.msgpack.type.Value;
import org.msgpack.type.ValueType;

public class Converter extends AbstractUnpacker {
    private final UnpackerStack stack;
    protected Value value;
    private Object[] values;

    public Converter(MessagePack messagePack, Value value) {
        super(messagePack);
        this.stack = new UnpackerStack();
        this.values = new Object[128];
        this.value = value;
    }

    public Converter(Value value) {
        this(new MessagePack(), value);
    }

    private void ensureValue() {
        if (this.value == null) {
            this.value = nextValue();
        }
    }

    private Value getTop() {
        ensureValue();
        this.stack.checkCount();
        if (this.stack.getDepth() == 0) {
            return this.value;
        }
        Value[] valueArr = (Value[]) this.values[this.stack.getDepth()];
        return valueArr[valueArr.length - this.stack.getTopCount()];
    }

    public void close() {
    }

    public ValueType getNextType() {
        return getTop().getType();
    }

    public int getReadByteCount() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Value nextValue() {
        throw new EOFException();
    }

    public int readArrayBegin() {
        Value top = getTop();
        if (top.isArrayValue()) {
            ArrayValue asArrayValue = top.asArrayValue();
            this.stack.reduceCount();
            this.stack.pushArray(asArrayValue.size());
            this.values[this.stack.getDepth()] = asArrayValue.getElementArray();
            return asArrayValue.size();
        }
        throw new MessageTypeException("Expected array but got not array value");
    }

    public void readArrayEnd(boolean z) {
        if (this.stack.topIsArray()) {
            int topCount = this.stack.getTopCount();
            if (topCount > 0) {
                if (z) {
                    throw new MessageTypeException("readArrayEnd(check=true) is called but the array is not end");
                }
                for (int i = 0; i < topCount; i++) {
                    skip();
                }
            }
            this.stack.pop();
            if (this.stack.getDepth() == 0) {
                this.value = null;
                return;
            }
            return;
        }
        throw new MessageTypeException("readArrayEnd() is called but readArrayBegin() is not called");
    }

    public BigInteger readBigInteger() {
        BigInteger bigInteger = getTop().asIntegerValue().getBigInteger();
        this.stack.reduceCount();
        if (this.stack.getDepth() == 0) {
            this.value = null;
        }
        return bigInteger;
    }

    public boolean readBoolean() {
        boolean z = getTop().asBooleanValue().getBoolean();
        this.stack.reduceCount();
        return z;
    }

    public byte readByte() {
        byte b = getTop().asIntegerValue().getByte();
        this.stack.reduceCount();
        if (this.stack.getDepth() == 0) {
            this.value = null;
        }
        return b;
    }

    public byte[] readByteArray() {
        byte[] byteArray = getTop().asRawValue().getByteArray();
        this.stack.reduceCount();
        if (this.stack.getDepth() == 0) {
            this.value = null;
        }
        return byteArray;
    }

    public double readDouble() {
        double d = getTop().asFloatValue().getDouble();
        this.stack.reduceCount();
        if (this.stack.getDepth() == 0) {
            this.value = null;
        }
        return d;
    }

    public float readFloat() {
        float f = getTop().asFloatValue().getFloat();
        this.stack.reduceCount();
        if (this.stack.getDepth() == 0) {
            this.value = null;
        }
        return f;
    }

    public int readInt() {
        int i = getTop().asIntegerValue().getInt();
        this.stack.reduceCount();
        if (this.stack.getDepth() == 0) {
            this.value = null;
        }
        return i;
    }

    public long readLong() {
        long j = getTop().asIntegerValue().getLong();
        this.stack.reduceCount();
        if (this.stack.getDepth() == 0) {
            this.value = null;
        }
        return j;
    }

    public int readMapBegin() {
        Value top = getTop();
        if (top.isMapValue()) {
            MapValue asMapValue = top.asMapValue();
            this.stack.reduceCount();
            this.stack.pushMap(asMapValue.size());
            this.values[this.stack.getDepth()] = asMapValue.getKeyValueArray();
            return asMapValue.size();
        }
        throw new MessageTypeException("Expected map but got not map value");
    }

    public void readMapEnd(boolean z) {
        if (this.stack.topIsMap()) {
            int topCount = this.stack.getTopCount();
            if (topCount > 0) {
                if (z) {
                    throw new MessageTypeException("readMapEnd(check=true) is called but the map is not end");
                }
                for (int i = 0; i < topCount; i++) {
                    skip();
                }
            }
            this.stack.pop();
            if (this.stack.getDepth() == 0) {
                this.value = null;
                return;
            }
            return;
        }
        throw new MessageTypeException("readMapEnd() is called but readMapBegin() is not called");
    }

    public void readNil() {
        if (getTop().isNilValue()) {
            this.stack.reduceCount();
            if (this.stack.getDepth() == 0) {
                this.value = null;
                return;
            }
            return;
        }
        throw new MessageTypeException("Expected nil but got not nil value");
    }

    public short readShort() {
        short s = getTop().asIntegerValue().getShort();
        this.stack.reduceCount();
        if (this.stack.getDepth() == 0) {
            this.value = null;
        }
        return s;
    }

    public String readString() {
        String string = getTop().asRawValue().getString();
        this.stack.reduceCount();
        if (this.stack.getDepth() == 0) {
            this.value = null;
        }
        return string;
    }

    public Value readValue() {
        if (this.stack.getDepth() != 0) {
            return super.readValue();
        }
        if (this.value == null) {
            return nextValue();
        }
        Value value = this.value;
        this.value = null;
        return value;
    }

    protected void readValue(Unconverter unconverter) {
        if (unconverter.getResult() != null) {
            unconverter.resetResult();
        }
        this.stack.checkCount();
        Value top = getTop();
        if (!(top.isArrayValue() || top.isMapValue())) {
            unconverter.write(top);
            this.stack.reduceCount();
            if (this.stack.getDepth() == 0) {
                this.value = null;
            }
            if (unconverter.getResult() != null) {
                return;
            }
        }
        while (true) {
            if (this.stack.getDepth() == 0 || this.stack.getTopCount() != 0) {
                this.stack.checkCount();
                top = getTop();
                if (top.isArrayValue()) {
                    ArrayValue asArrayValue = top.asArrayValue();
                    unconverter.writeArrayBegin(asArrayValue.size());
                    this.stack.reduceCount();
                    this.stack.pushArray(asArrayValue.size());
                    this.values[this.stack.getDepth()] = asArrayValue.getElementArray();
                } else if (top.isMapValue()) {
                    MapValue asMapValue = top.asMapValue();
                    unconverter.writeMapBegin(asMapValue.size());
                    this.stack.reduceCount();
                    this.stack.pushMap(asMapValue.size());
                    this.values[this.stack.getDepth()] = asMapValue.getKeyValueArray();
                } else {
                    unconverter.write(top);
                    this.stack.reduceCount();
                }
            } else {
                if (this.stack.topIsArray()) {
                    unconverter.writeArrayEnd(true);
                } else if (this.stack.topIsMap()) {
                    unconverter.writeMapEnd(true);
                } else {
                    throw new RuntimeException("invalid stack");
                }
                this.stack.pop();
                if (this.stack.getDepth() == 0) {
                    this.value = null;
                }
                if (unconverter.getResult() != null) {
                    return;
                }
            }
        }
    }

    public void reset() {
        this.stack.clear();
        this.value = null;
    }

    public void setArraySizeLimit(int i) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void setMapSizeLimit(int i) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void setRawSizeLimit(int i) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void skip() {
        this.stack.checkCount();
        Value top = getTop();
        if (top.isArrayValue() || top.isMapValue()) {
            int depth = this.stack.getDepth();
            while (true) {
                if (this.stack.getTopCount() == 0) {
                    this.stack.pop();
                    if (this.stack.getDepth() == 0) {
                        this.value = null;
                    }
                    if (this.stack.getDepth() <= depth) {
                        return;
                    }
                } else {
                    this.stack.checkCount();
                    Value top2 = getTop();
                    if (top2.isArrayValue()) {
                        ArrayValue asArrayValue = top2.asArrayValue();
                        this.stack.reduceCount();
                        this.stack.pushArray(asArrayValue.size());
                        this.values[this.stack.getDepth()] = asArrayValue.getElementArray();
                    } else if (top2.isMapValue()) {
                        MapValue asMapValue = top2.asMapValue();
                        this.stack.reduceCount();
                        this.stack.pushMap(asMapValue.size());
                        this.values[this.stack.getDepth()] = asMapValue.getKeyValueArray();
                    } else {
                        this.stack.reduceCount();
                    }
                }
            }
        } else {
            this.stack.reduceCount();
            if (this.stack.getDepth() == 0) {
                this.value = null;
            }
        }
    }

    public boolean tryReadNil() {
        this.stack.checkCount();
        if (!getTop().isNilValue()) {
            return false;
        }
        this.stack.reduceCount();
        if (this.stack.getDepth() == 0) {
            this.value = null;
        }
        return true;
    }

    public boolean trySkipNil() {
        ensureValue();
        if (this.stack.getDepth() > 0 && this.stack.getTopCount() <= 0) {
            return true;
        }
        if (!getTop().isNilValue()) {
            return false;
        }
        this.stack.reduceCount();
        if (this.stack.getDepth() == 0) {
            this.value = null;
        }
        return true;
    }
}
