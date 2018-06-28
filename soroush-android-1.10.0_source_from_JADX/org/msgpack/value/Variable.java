package org.msgpack.value;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.core.MessageTypeCastException;
import org.msgpack.value.impl.ImmutableBigIntegerValueImpl;

public class Variable implements Value {
    private static final long BYTE_MAX = 127;
    private static final long BYTE_MIN = -128;
    private static final long INT_MAX = 2147483647L;
    private static final long INT_MIN = -2147483648L;
    private static final BigInteger LONG_MAX = BigInteger.valueOf(Long.MAX_VALUE);
    private static final BigInteger LONG_MIN = BigInteger.valueOf(Long.MIN_VALUE);
    private static final long SHORT_MAX = 32767;
    private static final long SHORT_MIN = -32768;
    private AbstractValueAccessor accessor;
    private final ArrayValueAccessor arrayAccessor = new ArrayValueAccessor();
    private final BinaryValueAccessor binaryAccessor = new BinaryValueAccessor();
    private final BooleanValueAccessor booleanAccessor = new BooleanValueAccessor();
    private double doubleValue;
    private final ExtensionValueAccessor extensionAccessor = new ExtensionValueAccessor();
    private final FloatValueAccessor floatAccessor = new FloatValueAccessor();
    private final IntegerValueAccessor integerAccessor = new IntegerValueAccessor();
    private long longValue;
    private final MapValueAccessor mapAccessor = new MapValueAccessor();
    private final NilValueAccessor nilAccessor = new NilValueAccessor();
    private Object objectValue;
    private final StringValueAccessor stringAccessor = new StringValueAccessor();
    private Type type;

    public enum Type {
        NULL(ValueType.NIL),
        BOOLEAN(ValueType.BOOLEAN),
        LONG(ValueType.INTEGER),
        BIG_INTEGER(ValueType.INTEGER),
        DOUBLE(ValueType.FLOAT),
        BYTE_ARRAY(ValueType.BINARY),
        RAW_STRING(ValueType.STRING),
        LIST(ValueType.ARRAY),
        MAP(ValueType.MAP),
        EXTENSION(ValueType.EXTENSION);
        
        private final ValueType valueType;

        private Type(ValueType valueType) {
            this.valueType = valueType;
        }

        public final ValueType getValueType() {
            return this.valueType;
        }
    }

    private abstract class AbstractValueAccessor implements Value {
        private AbstractValueAccessor() {
        }

        public ArrayValue asArrayValue() {
            throw new MessageTypeCastException();
        }

        public BinaryValue asBinaryValue() {
            throw new MessageTypeCastException();
        }

        public BooleanValue asBooleanValue() {
            throw new MessageTypeCastException();
        }

        public ExtensionValue asExtensionValue() {
            throw new MessageTypeCastException();
        }

        public FloatValue asFloatValue() {
            throw new MessageTypeCastException();
        }

        public IntegerValue asIntegerValue() {
            throw new MessageTypeCastException();
        }

        public MapValue asMapValue() {
            throw new MessageTypeCastException();
        }

        public NilValue asNilValue() {
            throw new MessageTypeCastException();
        }

        public NumberValue asNumberValue() {
            throw new MessageTypeCastException();
        }

        public RawValue asRawValue() {
            throw new MessageTypeCastException();
        }

        public StringValue asStringValue() {
            throw new MessageTypeCastException();
        }

        public boolean equals(Object obj) {
            return Variable.this.equals(obj);
        }

        public int hashCode() {
            return Variable.this.hashCode();
        }

        public boolean isArrayValue() {
            return getValueType().isArrayType();
        }

        public boolean isBinaryValue() {
            return getValueType().isBinaryType();
        }

        public boolean isBooleanValue() {
            return getValueType().isBooleanType();
        }

        public boolean isExtensionValue() {
            return getValueType().isExtensionType();
        }

        public boolean isFloatValue() {
            return getValueType().isFloatType();
        }

        public boolean isIntegerValue() {
            return getValueType().isIntegerType();
        }

        public boolean isMapValue() {
            return getValueType().isMapType();
        }

        public boolean isNilValue() {
            return getValueType().isNilType();
        }

        public boolean isNumberValue() {
            return getValueType().isNumberType();
        }

        public boolean isRawValue() {
            return getValueType().isRawType();
        }

        public boolean isStringValue() {
            return getValueType().isStringType();
        }

        public String toJson() {
            return Variable.this.toJson();
        }

        public String toString() {
            return Variable.this.toString();
        }
    }

    private abstract class AbstractNumberValueAccessor extends AbstractValueAccessor implements NumberValue {
        private AbstractNumberValueAccessor() {
            super();
        }

        public NumberValue asNumberValue() {
            return this;
        }

        public BigInteger toBigInteger() {
            return Variable.this.type == Type.BIG_INTEGER ? (BigInteger) Variable.this.objectValue : Variable.this.type == Type.DOUBLE ? new BigDecimal(Variable.this.doubleValue).toBigInteger() : BigInteger.valueOf(Variable.this.longValue);
        }

        public byte toByte() {
            return Variable.this.type == Type.BIG_INTEGER ? ((BigInteger) Variable.this.objectValue).byteValue() : (byte) ((int) Variable.this.longValue);
        }

        public double toDouble() {
            return Variable.this.type == Type.BIG_INTEGER ? ((BigInteger) Variable.this.objectValue).doubleValue() : Variable.this.type == Type.DOUBLE ? Variable.this.doubleValue : (double) Variable.this.longValue;
        }

        public float toFloat() {
            return Variable.this.type == Type.BIG_INTEGER ? ((BigInteger) Variable.this.objectValue).floatValue() : Variable.this.type == Type.DOUBLE ? (float) Variable.this.doubleValue : (float) Variable.this.longValue;
        }

        public int toInt() {
            return Variable.this.type == Type.BIG_INTEGER ? ((BigInteger) Variable.this.objectValue).intValue() : (int) Variable.this.longValue;
        }

        public long toLong() {
            return Variable.this.type == Type.BIG_INTEGER ? ((BigInteger) Variable.this.objectValue).longValue() : Variable.this.longValue;
        }

        public short toShort() {
            return Variable.this.type == Type.BIG_INTEGER ? ((BigInteger) Variable.this.objectValue).shortValue() : (short) ((int) Variable.this.longValue);
        }
    }

    private abstract class AbstractRawValueAccessor extends AbstractValueAccessor implements RawValue {
        private AbstractRawValueAccessor() {
            super();
        }

        public byte[] asByteArray() {
            return (byte[]) Variable.this.objectValue;
        }

        public ByteBuffer asByteBuffer() {
            return ByteBuffer.wrap(asByteArray());
        }

        public RawValue asRawValue() {
            return this;
        }

        public String asString() {
            try {
                return MessagePack.UTF8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap((byte[]) Variable.this.objectValue)).toString();
            } catch (CharacterCodingException e) {
                throw new MessageStringCodingException(e);
            }
        }

        public String toString() {
            try {
                return MessagePack.UTF8.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).decode(ByteBuffer.wrap((byte[]) Variable.this.objectValue)).toString();
            } catch (CharacterCodingException e) {
                throw new MessageStringCodingException(e);
            }
        }
    }

    private class ArrayValueAccessor extends AbstractValueAccessor implements ArrayValue {
        private ArrayValueAccessor() {
            super();
        }

        public ArrayValue asArrayValue() {
            return this;
        }

        public Value get(int i) {
            return (Value) list().get(i);
        }

        public Value getOrNilValue(int i) {
            List list = list();
            return (list.size() >= i || i < 0) ? (Value) list.get(i) : ValueFactory.newNil();
        }

        public ValueType getValueType() {
            return ValueType.ARRAY;
        }

        public ImmutableArrayValue immutableValue() {
            return ValueFactory.newArray(list());
        }

        public Iterator<Value> iterator() {
            return list().iterator();
        }

        public List<Value> list() {
            return (List) Variable.this.objectValue;
        }

        public int size() {
            return list().size();
        }

        public void writeTo(MessagePacker messagePacker) {
            List<Value> list = list();
            messagePacker.packArrayHeader(list.size());
            for (Value writeTo : list) {
                writeTo.writeTo(messagePacker);
            }
        }
    }

    private class BooleanValueAccessor extends AbstractValueAccessor implements BooleanValue {
        private BooleanValueAccessor() {
            super();
        }

        public BooleanValue asBooleanValue() {
            return this;
        }

        public boolean getBoolean() {
            return Variable.this.longValue == 1;
        }

        public ValueType getValueType() {
            return ValueType.BOOLEAN;
        }

        public ImmutableBooleanValue immutableValue() {
            return ValueFactory.newBoolean(getBoolean());
        }

        public void writeTo(MessagePacker messagePacker) {
            messagePacker.packBoolean(Variable.this.longValue == 1);
        }
    }

    private class ExtensionValueAccessor extends AbstractValueAccessor implements ExtensionValue {
        private ExtensionValueAccessor() {
            super();
        }

        public ExtensionValue asExtensionValue() {
            return this;
        }

        public byte[] getData() {
            return ((ImmutableExtensionValue) Variable.this.objectValue).getData();
        }

        public byte getType() {
            return ((ImmutableExtensionValue) Variable.this.objectValue).getType();
        }

        public ValueType getValueType() {
            return ValueType.EXTENSION;
        }

        public ImmutableExtensionValue immutableValue() {
            return (ImmutableExtensionValue) Variable.this.objectValue;
        }

        public void writeTo(MessagePacker messagePacker) {
            ((ImmutableExtensionValue) Variable.this.objectValue).writeTo(messagePacker);
        }
    }

    private class MapValueAccessor extends AbstractValueAccessor implements MapValue {
        private MapValueAccessor() {
            super();
        }

        public MapValue asMapValue() {
            return this;
        }

        public Set<Entry<Value, Value>> entrySet() {
            return map().entrySet();
        }

        public Value[] getKeyValueArray() {
            Map map = map();
            Value[] valueArr = new Value[(map.size() * 2)];
            int i = 0;
            for (Entry entry : map.entrySet()) {
                valueArr[i] = (Value) entry.getKey();
                i++;
                valueArr[i] = (Value) entry.getValue();
                i++;
            }
            return valueArr;
        }

        public ValueType getValueType() {
            return ValueType.MAP;
        }

        public ImmutableMapValue immutableValue() {
            return ValueFactory.newMap(map());
        }

        public Set<Value> keySet() {
            return map().keySet();
        }

        public Map<Value, Value> map() {
            return (Map) Variable.this.objectValue;
        }

        public int size() {
            return map().size();
        }

        public Collection<Value> values() {
            return map().values();
        }

        public void writeTo(MessagePacker messagePacker) {
            Map map = map();
            messagePacker.packArrayHeader(map.size());
            for (Entry entry : map.entrySet()) {
                ((Value) entry.getKey()).writeTo(messagePacker);
                ((Value) entry.getValue()).writeTo(messagePacker);
            }
        }
    }

    private class NilValueAccessor extends AbstractValueAccessor implements NilValue {
        private NilValueAccessor() {
            super();
        }

        public NilValue asNilValue() {
            return this;
        }

        public ValueType getValueType() {
            return ValueType.NIL;
        }

        public ImmutableNilValue immutableValue() {
            return ValueFactory.newNil();
        }

        public void writeTo(MessagePacker messagePacker) {
            messagePacker.packNil();
        }
    }

    private class BinaryValueAccessor extends AbstractRawValueAccessor implements BinaryValue {
        private BinaryValueAccessor() {
            super();
        }

        public BinaryValue asBinaryValue() {
            return this;
        }

        public ValueType getValueType() {
            return ValueType.BINARY;
        }

        public ImmutableBinaryValue immutableValue() {
            return ValueFactory.newBinary(asByteArray());
        }

        public void writeTo(MessagePacker messagePacker) {
            byte[] bArr = (byte[]) Variable.this.objectValue;
            messagePacker.packBinaryHeader(bArr.length);
            messagePacker.writePayload(bArr);
        }
    }

    private class FloatValueAccessor extends AbstractNumberValueAccessor implements FloatValue {
        private FloatValueAccessor() {
            super();
        }

        public FloatValue asFloatValue() {
            return this;
        }

        public ValueType getValueType() {
            return ValueType.FLOAT;
        }

        public ImmutableFloatValue immutableValue() {
            return ValueFactory.newFloat(Variable.this.doubleValue);
        }

        public void writeTo(MessagePacker messagePacker) {
            messagePacker.packDouble(Variable.this.doubleValue);
        }
    }

    private class IntegerValueAccessor extends AbstractNumberValueAccessor implements IntegerValue {
        private IntegerValueAccessor() {
            super();
        }

        public BigInteger asBigInteger() {
            return Variable.this.type == Type.BIG_INTEGER ? (BigInteger) Variable.this.objectValue : BigInteger.valueOf(Variable.this.longValue);
        }

        public byte asByte() {
            if (isInByteRange()) {
                return (byte) ((int) Variable.this.longValue);
            }
            throw new MessageIntegerOverflowException(Variable.this.longValue);
        }

        public int asInt() {
            if (isInIntRange()) {
                return (int) Variable.this.longValue;
            }
            throw new MessageIntegerOverflowException(Variable.this.longValue);
        }

        public IntegerValue asIntegerValue() {
            return this;
        }

        public long asLong() {
            if (isInLongRange()) {
                return Variable.this.longValue;
            }
            throw new MessageIntegerOverflowException(Variable.this.longValue);
        }

        public short asShort() {
            if (isInByteRange()) {
                return (short) ((int) Variable.this.longValue);
            }
            throw new MessageIntegerOverflowException(Variable.this.longValue);
        }

        public ValueType getValueType() {
            return ValueType.INTEGER;
        }

        public ImmutableIntegerValue immutableValue() {
            return Variable.this.type == Type.BIG_INTEGER ? ValueFactory.newInteger((BigInteger) Variable.this.objectValue) : ValueFactory.newInteger(Variable.this.longValue);
        }

        public boolean isInByteRange() {
            return Variable.this.type != Type.BIG_INTEGER && Variable.BYTE_MIN <= Variable.this.longValue && Variable.this.longValue <= Variable.BYTE_MAX;
        }

        public boolean isInIntRange() {
            return Variable.this.type != Type.BIG_INTEGER && Variable.INT_MIN <= Variable.this.longValue && Variable.this.longValue <= Variable.INT_MAX;
        }

        public boolean isInLongRange() {
            return Variable.this.type != Type.BIG_INTEGER;
        }

        public boolean isInShortRange() {
            return Variable.this.type != Type.BIG_INTEGER && Variable.SHORT_MIN <= Variable.this.longValue && Variable.this.longValue <= Variable.SHORT_MAX;
        }

        public MessageFormat mostSuccinctMessageFormat() {
            return ImmutableBigIntegerValueImpl.mostSuccinctMessageFormat(this);
        }

        public void writeTo(MessagePacker messagePacker) {
            if (Variable.this.type == Type.BIG_INTEGER) {
                messagePacker.packBigInteger((BigInteger) Variable.this.objectValue);
            } else {
                messagePacker.packLong(Variable.this.longValue);
            }
        }
    }

    private class StringValueAccessor extends AbstractRawValueAccessor implements StringValue {
        private StringValueAccessor() {
            super();
        }

        public StringValue asStringValue() {
            return this;
        }

        public ValueType getValueType() {
            return ValueType.STRING;
        }

        public ImmutableStringValue immutableValue() {
            return ValueFactory.newString((byte[]) Variable.this.objectValue);
        }

        public void writeTo(MessagePacker messagePacker) {
            byte[] bArr = (byte[]) Variable.this.objectValue;
            messagePacker.packRawStringHeader(bArr.length);
            messagePacker.writePayload(bArr);
        }
    }

    public Variable() {
        setNilValue();
    }

    public ArrayValue asArrayValue() {
        if (isArrayValue()) {
            return (ArrayValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    public BinaryValue asBinaryValue() {
        if (isBinaryValue()) {
            return (BinaryValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    public BooleanValue asBooleanValue() {
        if (isBooleanValue()) {
            return (BooleanValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    public ExtensionValue asExtensionValue() {
        if (isExtensionValue()) {
            return (ExtensionValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    public FloatValue asFloatValue() {
        if (isFloatValue()) {
            return (FloatValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    public IntegerValue asIntegerValue() {
        if (isIntegerValue()) {
            return (IntegerValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    public MapValue asMapValue() {
        if (isMapValue()) {
            return (MapValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    public NilValue asNilValue() {
        if (isNilValue()) {
            return (NilValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    public NumberValue asNumberValue() {
        if (isNumberValue()) {
            return (NumberValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    public RawValue asRawValue() {
        if (isRawValue()) {
            return (RawValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    public StringValue asStringValue() {
        if (isStringValue()) {
            return (StringValue) this.accessor;
        }
        throw new MessageTypeCastException();
    }

    public boolean equals(Object obj) {
        return immutableValue().equals(obj);
    }

    public ValueType getValueType() {
        return this.type.getValueType();
    }

    public int hashCode() {
        return immutableValue().hashCode();
    }

    public ImmutableValue immutableValue() {
        return this.accessor.immutableValue();
    }

    public boolean isArrayValue() {
        return getValueType().isArrayType();
    }

    public boolean isBinaryValue() {
        return getValueType().isBinaryType();
    }

    public boolean isBooleanValue() {
        return getValueType().isBooleanType();
    }

    public boolean isExtensionValue() {
        return getValueType().isExtensionType();
    }

    public boolean isFloatValue() {
        return getValueType().isFloatType();
    }

    public boolean isIntegerValue() {
        return getValueType().isIntegerType();
    }

    public boolean isMapValue() {
        return getValueType().isMapType();
    }

    public boolean isNilValue() {
        return getValueType().isNilType();
    }

    public boolean isNumberValue() {
        return getValueType().isNumberType();
    }

    public boolean isRawValue() {
        return getValueType().isRawType();
    }

    public boolean isStringValue() {
        return getValueType().isStringType();
    }

    public Variable setArrayValue(List<Value> list) {
        this.type = Type.LIST;
        this.accessor = this.arrayAccessor;
        this.objectValue = list;
        return this;
    }

    public Variable setBinaryValue(byte[] bArr) {
        this.type = Type.BYTE_ARRAY;
        this.accessor = this.binaryAccessor;
        this.objectValue = bArr;
        return this;
    }

    public Variable setBooleanValue(boolean z) {
        this.type = Type.BOOLEAN;
        this.accessor = this.booleanAccessor;
        this.longValue = z ? 1 : 0;
        return this;
    }

    public Variable setExtensionValue(byte b, byte[] bArr) {
        this.type = Type.EXTENSION;
        this.accessor = this.extensionAccessor;
        this.objectValue = ValueFactory.newExtension(b, bArr);
        return this;
    }

    public Variable setFloatValue(double d) {
        this.type = Type.DOUBLE;
        this.accessor = this.floatAccessor;
        this.doubleValue = d;
        this.longValue = (long) d;
        return this;
    }

    public Variable setFloatValue(float f) {
        this.type = Type.DOUBLE;
        this.accessor = this.floatAccessor;
        this.longValue = (long) f;
        return this;
    }

    public Variable setIntegerValue(long j) {
        this.type = Type.LONG;
        this.accessor = this.integerAccessor;
        this.longValue = j;
        return this;
    }

    public Variable setIntegerValue(BigInteger bigInteger) {
        if (bigInteger.compareTo(LONG_MIN) < 0 || bigInteger.compareTo(LONG_MAX) > 0) {
            this.type = Type.BIG_INTEGER;
            this.accessor = this.integerAccessor;
            this.objectValue = bigInteger;
            return this;
        }
        this.type = Type.LONG;
        this.accessor = this.integerAccessor;
        this.longValue = bigInteger.longValue();
        return this;
    }

    public Variable setMapValue(Map<Value, Value> map) {
        this.type = Type.MAP;
        this.accessor = this.mapAccessor;
        this.objectValue = map;
        return this;
    }

    public Variable setNilValue() {
        this.type = Type.NULL;
        this.accessor = this.nilAccessor;
        return this;
    }

    public Variable setStringValue(String str) {
        return setStringValue(str.getBytes(MessagePack.UTF8));
    }

    public Variable setStringValue(byte[] bArr) {
        this.type = Type.RAW_STRING;
        this.accessor = this.stringAccessor;
        this.objectValue = bArr;
        return this;
    }

    public String toJson() {
        return immutableValue().toJson();
    }

    public String toString() {
        return immutableValue().toString();
    }

    public void writeTo(MessagePacker messagePacker) {
        this.accessor.writeTo(messagePacker);
    }
}
