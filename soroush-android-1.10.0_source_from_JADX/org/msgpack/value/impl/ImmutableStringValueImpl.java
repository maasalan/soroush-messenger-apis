package org.msgpack.value.impl;

import java.util.Arrays;
import org.msgpack.core.MessagePacker;
import org.msgpack.value.ImmutableStringValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueType;

public class ImmutableStringValueImpl extends AbstractImmutableRawValue implements ImmutableStringValue {
    public ImmutableStringValueImpl(String str) {
        super(str);
    }

    public ImmutableStringValueImpl(byte[] bArr) {
        super(bArr);
    }

    public ImmutableStringValue asStringValue() {
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
        if (!value.isStringValue()) {
            return false;
        }
        byte[] bArr;
        byte[] bArr2;
        if (value instanceof ImmutableStringValueImpl) {
            ImmutableStringValueImpl immutableStringValueImpl = (ImmutableStringValueImpl) value;
            bArr = this.data;
            bArr2 = immutableStringValueImpl.data;
        } else {
            bArr = this.data;
            bArr2 = value.asStringValue().asByteArray();
        }
        return Arrays.equals(bArr, bArr2);
    }

    public ValueType getValueType() {
        return ValueType.STRING;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    public ImmutableStringValue immutableValue() {
        return this;
    }

    public void writeTo(MessagePacker messagePacker) {
        messagePacker.packRawStringHeader(this.data.length);
        messagePacker.writePayload(this.data);
    }
}
