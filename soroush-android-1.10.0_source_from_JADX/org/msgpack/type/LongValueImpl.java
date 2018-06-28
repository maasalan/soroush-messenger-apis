package org.msgpack.type;

import java.math.BigInteger;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;

class LongValueImpl extends IntegerValue {
    private static long BYTE_MAX = 127;
    private static long BYTE_MIN = -128;
    private static long INT_MAX = 2147483647L;
    private static long INT_MIN = -2147483648L;
    private static long SHORT_MAX = 32767;
    private static long SHORT_MIN = -32768;
    private long value;

    LongValueImpl(long j) {
        this.value = j;
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(this.value);
    }

    public byte byteValue() {
        return (byte) ((int) this.value);
    }

    public double doubleValue() {
        return (double) this.value;
    }

    public boolean equals(java.lang.Object r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = 1;
        if (r8 != r7) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r8 instanceof org.msgpack.type.Value;
        r2 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r8 = (org.msgpack.type.Value) r8;
        r1 = r8.isIntegerValue();
        if (r1 != 0) goto L_0x0013;
    L_0x0012:
        return r2;
    L_0x0013:
        r3 = r7.value;	 Catch:{ MessageTypeException -> 0x0022 }
        r8 = r8.asIntegerValue();	 Catch:{ MessageTypeException -> 0x0022 }
        r5 = r8.getLong();	 Catch:{ MessageTypeException -> 0x0022 }
        r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r8 != 0) goto L_0x0022;
    L_0x0021:
        return r0;
    L_0x0022:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.type.LongValueImpl.equals(java.lang.Object):boolean");
    }

    public float floatValue() {
        return (float) this.value;
    }

    public BigInteger getBigInteger() {
        return BigInteger.valueOf(this.value);
    }

    public byte getByte() {
        if (this.value <= BYTE_MAX) {
            if (this.value >= BYTE_MIN) {
                return (byte) ((int) this.value);
            }
        }
        throw new MessageTypeException();
    }

    public int getInt() {
        if (this.value <= INT_MAX) {
            if (this.value >= INT_MIN) {
                return (int) this.value;
            }
        }
        throw new MessageTypeException();
    }

    public long getLong() {
        return this.value;
    }

    public short getShort() {
        if (this.value <= SHORT_MAX) {
            if (this.value >= SHORT_MIN) {
                return (short) ((int) this.value);
            }
        }
        throw new MessageTypeException();
    }

    public int hashCode() {
        return (INT_MIN > this.value || this.value > INT_MAX) ? (int) (this.value ^ (this.value >>> 32)) : (int) this.value;
    }

    public int intValue() {
        return (int) this.value;
    }

    public long longValue() {
        return this.value;
    }

    public short shortValue() {
        return (short) ((int) this.value);
    }

    public String toString() {
        return Long.toString(this.value);
    }

    public StringBuilder toString(StringBuilder stringBuilder) {
        stringBuilder.append(Long.toString(this.value));
        return stringBuilder;
    }

    public void writeTo(Packer packer) {
        packer.write(this.value);
    }
}
