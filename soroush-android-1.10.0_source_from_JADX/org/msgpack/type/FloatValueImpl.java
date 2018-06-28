package org.msgpack.type;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.msgpack.packer.Packer;

class FloatValueImpl extends FloatValue {
    private float value;

    FloatValueImpl(float f) {
        this.value = f;
    }

    public BigInteger bigIntegerValue() {
        return new BigDecimal((double) this.value).toBigInteger();
    }

    public byte byteValue() {
        return (byte) ((int) this.value);
    }

    public double doubleValue() {
        return (double) this.value;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        return value.isFloatValue() && ((double) this.value) == value.asFloatValue().getDouble();
    }

    public float floatValue() {
        return this.value;
    }

    public double getDouble() {
        return (double) this.value;
    }

    public float getFloat() {
        return this.value;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.value);
    }

    public int intValue() {
        return (int) this.value;
    }

    public long longValue() {
        return (long) this.value;
    }

    public short shortValue() {
        return (short) ((int) this.value);
    }

    public String toString() {
        return Float.toString(this.value);
    }

    public StringBuilder toString(StringBuilder stringBuilder) {
        stringBuilder.append(Float.toString(this.value));
        return stringBuilder;
    }

    public void writeTo(Packer packer) {
        packer.write(this.value);
    }
}
