package org.msgpack.value.impl;

import java.util.Arrays;
import org.msgpack.core.MessagePacker;
import org.msgpack.value.ImmutableBinaryValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueType;

public class ImmutableBinaryValueImpl extends AbstractImmutableRawValue implements ImmutableBinaryValue {
    public ImmutableBinaryValueImpl(byte[] bArr) {
        super(bArr);
    }

    public ImmutableBinaryValue asBinaryValue() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        if (!value.isBinaryValue()) {
            return false;
        }
        byte[] bArr;
        byte[] bArr2;
        if (value instanceof ImmutableBinaryValueImpl) {
            ImmutableBinaryValueImpl immutableBinaryValueImpl = (ImmutableBinaryValueImpl) value;
            bArr = this.data;
            bArr2 = immutableBinaryValueImpl.data;
        } else {
            bArr = this.data;
            bArr2 = value.asBinaryValue().asByteArray();
        }
        return Arrays.equals(bArr, bArr2);
    }

    public ValueType getValueType() {
        return ValueType.BINARY;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    public ImmutableBinaryValue immutableValue() {
        return this;
    }

    public void writeTo(MessagePacker messagePacker) {
        messagePacker.packBinaryHeader(this.data.length);
        messagePacker.writePayload(this.data);
    }
}
