package org.msgpack.value;

import java.math.BigInteger;
import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.msgpack.value.impl.ImmutableArrayValueImpl;
import org.msgpack.value.impl.ImmutableBigIntegerValueImpl;
import org.msgpack.value.impl.ImmutableBinaryValueImpl;
import org.msgpack.value.impl.ImmutableBooleanValueImpl;
import org.msgpack.value.impl.ImmutableDoubleValueImpl;
import org.msgpack.value.impl.ImmutableExtensionValueImpl;
import org.msgpack.value.impl.ImmutableLongValueImpl;
import org.msgpack.value.impl.ImmutableMapValueImpl;
import org.msgpack.value.impl.ImmutableNilValueImpl;
import org.msgpack.value.impl.ImmutableStringValueImpl;

public final class ValueFactory {

    public static class MapBuilder {
        private final Map<Value, Value> map = new LinkedHashMap();

        public MapValue build() {
            return ValueFactory.newMap(this.map);
        }

        public MapBuilder put(Entry<? extends Value, ? extends Value> entry) {
            put((Value) entry.getKey(), (Value) entry.getValue());
            return this;
        }

        public MapBuilder put(Value value, Value value2) {
            this.map.put(value, value2);
            return this;
        }

        public MapBuilder putAll(Iterable<? extends Entry<? extends Value, ? extends Value>> iterable) {
            for (Entry entry : iterable) {
                put((Value) entry.getKey(), (Value) entry.getValue());
            }
            return this;
        }

        public MapBuilder putAll(Map<? extends Value, ? extends Value> map) {
            for (Entry put : map.entrySet()) {
                put(put);
            }
            return this;
        }
    }

    private ValueFactory() {
    }

    public static ImmutableArrayValue emptyArray() {
        return ImmutableArrayValueImpl.empty();
    }

    public static ImmutableMapValue emptyMap() {
        return ImmutableMapValueImpl.empty();
    }

    public static ImmutableArrayValue newArray(List<? extends Value> list) {
        return list.isEmpty() ? ImmutableArrayValueImpl.empty() : new ImmutableArrayValueImpl((Value[]) list.toArray(new Value[list.size()]));
    }

    public static ImmutableArrayValue newArray(Value... valueArr) {
        return valueArr.length == 0 ? ImmutableArrayValueImpl.empty() : new ImmutableArrayValueImpl((Value[]) Arrays.copyOf(valueArr, valueArr.length));
    }

    public static ImmutableArrayValue newArray(Value[] valueArr, boolean z) {
        return valueArr.length == 0 ? ImmutableArrayValueImpl.empty() : z ? new ImmutableArrayValueImpl(valueArr) : new ImmutableArrayValueImpl((Value[]) Arrays.copyOf(valueArr, valueArr.length));
    }

    public static ImmutableBinaryValue newBinary(byte[] bArr) {
        return newBinary(bArr, false);
    }

    public static ImmutableBinaryValue newBinary(byte[] bArr, int i, int i2) {
        return newBinary(bArr, i, i2, false);
    }

    public static ImmutableBinaryValue newBinary(byte[] bArr, int i, int i2, boolean z) {
        return (z && i == 0 && i2 == bArr.length) ? new ImmutableBinaryValueImpl(bArr) : new ImmutableBinaryValueImpl(Arrays.copyOfRange(bArr, i, i2));
    }

    public static ImmutableBinaryValue newBinary(byte[] bArr, boolean z) {
        return z ? new ImmutableBinaryValueImpl(bArr) : new ImmutableBinaryValueImpl(Arrays.copyOf(bArr, bArr.length));
    }

    public static ImmutableBooleanValue newBoolean(boolean z) {
        return z ? ImmutableBooleanValueImpl.TRUE : ImmutableBooleanValueImpl.FALSE;
    }

    public static ImmutableExtensionValue newExtension(byte b, byte[] bArr) {
        return new ImmutableExtensionValueImpl(b, bArr);
    }

    public static ImmutableFloatValue newFloat(double d) {
        return new ImmutableDoubleValueImpl(d);
    }

    public static ImmutableFloatValue newFloat(float f) {
        return new ImmutableDoubleValueImpl((double) f);
    }

    public static ImmutableIntegerValue newInteger(byte b) {
        return new ImmutableLongValueImpl((long) b);
    }

    public static ImmutableIntegerValue newInteger(int i) {
        return new ImmutableLongValueImpl((long) i);
    }

    public static ImmutableIntegerValue newInteger(long j) {
        return new ImmutableLongValueImpl(j);
    }

    public static ImmutableIntegerValue newInteger(BigInteger bigInteger) {
        return new ImmutableBigIntegerValueImpl(bigInteger);
    }

    public static ImmutableIntegerValue newInteger(short s) {
        return new ImmutableLongValueImpl((long) s);
    }

    public static <K extends Value, V extends Value> ImmutableMapValue newMap(Map<K, V> map) {
        Value[] valueArr = new Value[(map.size() * 2)];
        int i = 0;
        for (Entry entry : map.entrySet()) {
            valueArr[i] = (Value) entry.getKey();
            i++;
            valueArr[i] = (Value) entry.getValue();
            i++;
        }
        return new ImmutableMapValueImpl(valueArr);
    }

    public static ImmutableMapValue newMap(Value... valueArr) {
        return valueArr.length == 0 ? ImmutableMapValueImpl.empty() : new ImmutableMapValueImpl((Value[]) Arrays.copyOf(valueArr, valueArr.length));
    }

    public static ImmutableMapValue newMap(Value[] valueArr, boolean z) {
        return valueArr.length == 0 ? ImmutableMapValueImpl.empty() : z ? new ImmutableMapValueImpl(valueArr) : new ImmutableMapValueImpl((Value[]) Arrays.copyOf(valueArr, valueArr.length));
    }

    public static MapValue newMap(Entry<? extends Value, ? extends Value>... entryArr) {
        Value[] valueArr = new Value[(entryArr.length * 2)];
        for (int i = 0; i < entryArr.length; i += 2) {
            int i2 = i * 2;
            valueArr[i2] = (Value) entryArr[i].getKey();
            valueArr[i2 + 1] = (Value) entryArr[i].getValue();
        }
        return newMap(valueArr, true);
    }

    public static MapBuilder newMapBuilder() {
        return new MapBuilder();
    }

    public static Entry<Value, Value> newMapEntry(Value value, Value value2) {
        return new SimpleEntry(value, value2);
    }

    public static ImmutableNilValue newNil() {
        return ImmutableNilValueImpl.get();
    }

    public static ImmutableStringValue newString(String str) {
        return new ImmutableStringValueImpl(str);
    }

    public static ImmutableStringValue newString(byte[] bArr) {
        return new ImmutableStringValueImpl(bArr);
    }

    public static ImmutableStringValue newString(byte[] bArr, int i, int i2) {
        return newString(bArr, i, i2, false);
    }

    public static ImmutableStringValue newString(byte[] bArr, int i, int i2, boolean z) {
        return (z && i == 0 && i2 == bArr.length) ? new ImmutableStringValueImpl(bArr) : new ImmutableStringValueImpl(Arrays.copyOfRange(bArr, i, i2));
    }

    public static ImmutableStringValue newString(byte[] bArr, boolean z) {
        return z ? new ImmutableStringValueImpl(bArr) : new ImmutableStringValueImpl(Arrays.copyOf(bArr, bArr.length));
    }
}
