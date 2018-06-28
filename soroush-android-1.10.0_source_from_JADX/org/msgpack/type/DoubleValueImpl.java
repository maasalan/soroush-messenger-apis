package org.msgpack.type;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.msgpack.packer.Packer;

class DoubleValueImpl extends FloatValue {
    private double value;

    DoubleValueImpl(double d) {
        this.value = d;
    }

    public BigInteger bigIntegerValue() {
        return new BigDecimal(this.value).toBigInteger();
    }

    public byte byteValue() {
        return (byte) ((int) this.value);
    }

    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        return value.isFloatValue() && this.value == value.asFloatValue().getDouble();
    }

    public float floatValue() {
        return (float) this.value;
    }

    public double getDouble() {
        return this.value;
    }

    public float getFloat() {
        return (float) this.value;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.value);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
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
        return Double.toString(this.value);
    }

    public StringBuilder toString(StringBuilder stringBuilder) {
        stringBuilder.append(Double.toString(this.value));
        return stringBuilder;
    }

    public void writeTo(Packer packer) {
        packer.write(this.value);
    }
}
