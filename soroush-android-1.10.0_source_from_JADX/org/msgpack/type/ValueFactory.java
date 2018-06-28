package org.msgpack.type;

import java.math.BigInteger;
import java.nio.ByteBuffer;

public final class ValueFactory {
    private ValueFactory() {
    }

    public static ArrayValue createArrayValue() {
        return ArrayValueImpl.getEmptyInstance();
    }

    public static ArrayValue createArrayValue(Value[] valueArr) {
        return valueArr.length == 0 ? ArrayValueImpl.getEmptyInstance() : createArrayValue(valueArr, false);
    }

    public static ArrayValue createArrayValue(Value[] valueArr, boolean z) {
        return valueArr.length == 0 ? ArrayValueImpl.getEmptyInstance() : new ArrayValueImpl(valueArr, z);
    }

    public static BooleanValue createBooleanValue(boolean z) {
        return z ? TrueValueImpl.getInstance() : FalseValueImpl.getInstance();
    }

    public static FloatValue createFloatValue(double d) {
        return new DoubleValueImpl(d);
    }

    public static FloatValue createFloatValue(float f) {
        return new FloatValueImpl(f);
    }

    public static IntegerValue createIntegerValue(byte b) {
        return new IntValueImpl(b);
    }

    public static IntegerValue createIntegerValue(int i) {
        return new IntValueImpl(i);
    }

    public static IntegerValue createIntegerValue(long j) {
        return new LongValueImpl(j);
    }

    public static IntegerValue createIntegerValue(BigInteger bigInteger) {
        return new BigIntegerValueImpl(bigInteger);
    }

    public static IntegerValue createIntegerValue(short s) {
        return new IntValueImpl(s);
    }

    public static MapValue createMapValue() {
        return SequentialMapValueImpl.getEmptyInstance();
    }

    public static MapValue createMapValue(Value[] valueArr) {
        return valueArr.length == 0 ? SequentialMapValueImpl.getEmptyInstance() : createMapValue(valueArr, false);
    }

    public static MapValue createMapValue(Value[] valueArr, boolean z) {
        return valueArr.length == 0 ? SequentialMapValueImpl.getEmptyInstance() : new SequentialMapValueImpl(valueArr, z);
    }

    public static NilValue createNilValue() {
        return NilValue.getInstance();
    }

    public static RawValue createRawValue() {
        return ByteArrayRawValueImpl.getEmptyInstance();
    }

    public static RawValue createRawValue(String str) {
        return new StringRawValueImpl(str);
    }

    public static RawValue createRawValue(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        try {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            RawValue byteArrayRawValueImpl = new ByteArrayRawValueImpl(bArr, true);
            return byteArrayRawValueImpl;
        } finally {
            byteBuffer.position(position);
        }
    }

    public static RawValue createRawValue(byte[] bArr) {
        return createRawValue(bArr, false);
    }

    public static RawValue createRawValue(byte[] bArr, int i, int i2) {
        return new ByteArrayRawValueImpl(bArr, i, i2);
    }

    public static RawValue createRawValue(byte[] bArr, boolean z) {
        return new ByteArrayRawValueImpl(bArr, z);
    }
}
