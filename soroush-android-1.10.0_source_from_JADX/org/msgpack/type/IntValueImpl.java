package org.msgpack.type;

import java.math.BigInteger;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;

class IntValueImpl extends IntegerValue {
    private static int BYTE_MAX = 127;
    private static int BYTE_MIN = -128;
    private static int SHORT_MAX = 32767;
    private static int SHORT_MIN = -32768;
    private int value;

    IntValueImpl(int i) {
        this.value = i;
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf((long) this.value);
    }

    public byte byteValue() {
        return (byte) this.value;
    }

    public double doubleValue() {
        return (double) this.value;
    }

    public boolean equals(java.lang.Object r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = 1;
        if (r4 != r3) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r4 instanceof org.msgpack.type.Value;
        r2 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r4 = (org.msgpack.type.Value) r4;
        r1 = r4.isIntegerValue();
        if (r1 != 0) goto L_0x0013;
    L_0x0012:
        return r2;
    L_0x0013:
        r1 = r3.value;	 Catch:{ MessageTypeException -> 0x0020 }
        r4 = r4.asIntegerValue();	 Catch:{ MessageTypeException -> 0x0020 }
        r4 = r4.getInt();	 Catch:{ MessageTypeException -> 0x0020 }
        if (r1 != r4) goto L_0x0020;
    L_0x001f:
        return r0;
    L_0x0020:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.type.IntValueImpl.equals(java.lang.Object):boolean");
    }

    public float floatValue() {
        return (float) this.value;
    }

    public BigInteger getBigInteger() {
        return BigInteger.valueOf((long) this.value);
    }

    public byte getByte() {
        if (this.value <= BYTE_MAX) {
            if (this.value >= BYTE_MIN) {
                return (byte) this.value;
            }
        }
        throw new MessageTypeException();
    }

    public int getInt() {
        return this.value;
    }

    public long getLong() {
        return (long) this.value;
    }

    public short getShort() {
        if (this.value <= SHORT_MAX) {
            if (this.value >= SHORT_MIN) {
                return (short) this.value;
            }
        }
        throw new MessageTypeException();
    }

    public int hashCode() {
        return this.value;
    }

    public int intValue() {
        return this.value;
    }

    public long longValue() {
        return (long) this.value;
    }

    public short shortValue() {
        return (short) this.value;
    }

    public String toString() {
        return Integer.toString(this.value);
    }

    public StringBuilder toString(StringBuilder stringBuilder) {
        stringBuilder.append(Integer.toString(this.value));
        return stringBuilder;
    }

    public void writeTo(Packer packer) {
        packer.write(this.value);
    }
}
