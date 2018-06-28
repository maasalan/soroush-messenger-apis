package org.msgpack.value.impl;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import org.msgpack.core.MessagePacker;
import org.msgpack.value.ImmutableArrayValue;
import org.msgpack.value.ImmutableBinaryValue;
import org.msgpack.value.ImmutableBooleanValue;
import org.msgpack.value.ImmutableExtensionValue;
import org.msgpack.value.ImmutableFloatValue;
import org.msgpack.value.ImmutableIntegerValue;
import org.msgpack.value.ImmutableMapValue;
import org.msgpack.value.ImmutableNilValue;
import org.msgpack.value.ImmutableNumberValue;
import org.msgpack.value.ImmutableRawValue;
import org.msgpack.value.ImmutableStringValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueType;

public class ImmutableMapValueImpl extends AbstractImmutableValue implements ImmutableMapValue {
    private static final ImmutableMapValueImpl EMPTY = new ImmutableMapValueImpl(new Value[0]);
    private final Value[] kvs;

    private static class EntryIterator implements Iterator<Value> {
        private int index;
        private Value[] kvs;

        public EntryIterator(Value[] valueArr, int i) {
            this.kvs = valueArr;
            this.index = i;
        }

        public boolean hasNext() {
            return this.index < this.kvs.length;
        }

        public Value next() {
            int i = this.index;
            if (i >= this.kvs.length) {
                throw new NoSuchElementException();
            }
            this.index = i + 2;
            return this.kvs[i];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static class EntrySet extends AbstractSet<Entry<Value, Value>> {
        private final Value[] kvs;

        EntrySet(Value[] valueArr) {
            this.kvs = valueArr;
        }

        public Iterator<Entry<Value, Value>> iterator() {
            return new EntrySetIterator(this.kvs);
        }

        public int size() {
            return this.kvs.length / 2;
        }
    }

    private static class EntrySetIterator implements Iterator<Entry<Value, Value>> {
        private int index = 0;
        private final Value[] kvs;

        EntrySetIterator(Value[] valueArr) {
            this.kvs = valueArr;
        }

        public boolean hasNext() {
            return this.index < this.kvs.length;
        }

        public Entry<Value, Value> next() {
            if (this.index >= this.kvs.length) {
                throw new NoSuchElementException();
            }
            Entry simpleImmutableEntry = new SimpleImmutableEntry(this.kvs[this.index], this.kvs[this.index + 1]);
            this.index += 2;
            return simpleImmutableEntry;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static class ImmutableMapValueMap extends AbstractMap<Value, Value> {
        private final Value[] kvs;

        public ImmutableMapValueMap(Value[] valueArr) {
            this.kvs = valueArr;
        }

        public Set<Entry<Value, Value>> entrySet() {
            return new EntrySet(this.kvs);
        }
    }

    private static class KeySet extends AbstractSet<Value> {
        private Value[] kvs;

        KeySet(Value[] valueArr) {
            this.kvs = valueArr;
        }

        public Iterator<Value> iterator() {
            return new EntryIterator(this.kvs, 0);
        }

        public int size() {
            return this.kvs.length / 2;
        }
    }

    private static class ValueCollection extends AbstractCollection<Value> {
        private Value[] kvs;

        ValueCollection(Value[] valueArr) {
            this.kvs = valueArr;
        }

        public Iterator<Value> iterator() {
            return new EntryIterator(this.kvs, 1);
        }

        public int size() {
            return this.kvs.length / 2;
        }
    }

    public ImmutableMapValueImpl(Value[] valueArr) {
        this.kvs = valueArr;
    }

    private static void appendJsonKey(StringBuilder stringBuilder, Value value) {
        if (value.isRawValue()) {
            stringBuilder.append(value.toJson());
        } else {
            AbstractImmutableRawValue.appendJsonString(stringBuilder, value.toString());
        }
    }

    private static void appendString(StringBuilder stringBuilder, Value value) {
        stringBuilder.append(value.isRawValue() ? value.toJson() : value.toString());
    }

    public static ImmutableMapValue empty() {
        return EMPTY;
    }

    public /* bridge */ /* synthetic */ ImmutableArrayValue asArrayValue() {
        return super.asArrayValue();
    }

    public /* bridge */ /* synthetic */ ImmutableBinaryValue asBinaryValue() {
        return super.asBinaryValue();
    }

    public /* bridge */ /* synthetic */ ImmutableBooleanValue asBooleanValue() {
        return super.asBooleanValue();
    }

    public /* bridge */ /* synthetic */ ImmutableExtensionValue asExtensionValue() {
        return super.asExtensionValue();
    }

    public /* bridge */ /* synthetic */ ImmutableFloatValue asFloatValue() {
        return super.asFloatValue();
    }

    public /* bridge */ /* synthetic */ ImmutableIntegerValue asIntegerValue() {
        return super.asIntegerValue();
    }

    public ImmutableMapValue asMapValue() {
        return this;
    }

    public /* bridge */ /* synthetic */ ImmutableNilValue asNilValue() {
        return super.asNilValue();
    }

    public /* bridge */ /* synthetic */ ImmutableNumberValue asNumberValue() {
        return super.asNumberValue();
    }

    public /* bridge */ /* synthetic */ ImmutableRawValue asRawValue() {
        return super.asRawValue();
    }

    public /* bridge */ /* synthetic */ ImmutableStringValue asStringValue() {
        return super.asStringValue();
    }

    public Set<Entry<Value, Value>> entrySet() {
        return new EntrySet(this.kvs);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        if (!value.isMapValue()) {
            return false;
        }
        return map().equals(value.asMapValue().map());
    }

    public Value[] getKeyValueArray() {
        return (Value[]) Arrays.copyOf(this.kvs, this.kvs.length);
    }

    public ValueType getValueType() {
        return ValueType.MAP;
    }

    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (i < this.kvs.length) {
            i2 += this.kvs[i].hashCode() ^ this.kvs[i + 1].hashCode();
            i += 2;
        }
        return i2;
    }

    public ImmutableMapValue immutableValue() {
        return this;
    }

    public /* bridge */ /* synthetic */ boolean isArrayValue() {
        return super.isArrayValue();
    }

    public /* bridge */ /* synthetic */ boolean isBinaryValue() {
        return super.isBinaryValue();
    }

    public /* bridge */ /* synthetic */ boolean isBooleanValue() {
        return super.isBooleanValue();
    }

    public /* bridge */ /* synthetic */ boolean isExtensionValue() {
        return super.isExtensionValue();
    }

    public /* bridge */ /* synthetic */ boolean isFloatValue() {
        return super.isFloatValue();
    }

    public /* bridge */ /* synthetic */ boolean isIntegerValue() {
        return super.isIntegerValue();
    }

    public /* bridge */ /* synthetic */ boolean isMapValue() {
        return super.isMapValue();
    }

    public /* bridge */ /* synthetic */ boolean isNilValue() {
        return super.isNilValue();
    }

    public /* bridge */ /* synthetic */ boolean isNumberValue() {
        return super.isNumberValue();
    }

    public /* bridge */ /* synthetic */ boolean isRawValue() {
        return super.isRawValue();
    }

    public /* bridge */ /* synthetic */ boolean isStringValue() {
        return super.isStringValue();
    }

    public Set<Value> keySet() {
        return new KeySet(this.kvs);
    }

    public Map<Value, Value> map() {
        return new ImmutableMapValueMap(this.kvs);
    }

    public int size() {
        return this.kvs.length / 2;
    }

    public String toJson() {
        if (this.kvs.length == 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        appendJsonKey(stringBuilder, this.kvs[0]);
        stringBuilder.append(":");
        stringBuilder.append(this.kvs[1].toJson());
        for (int i = 2; i < this.kvs.length; i += 2) {
            stringBuilder.append(",");
            appendJsonKey(stringBuilder, this.kvs[i]);
            stringBuilder.append(":");
            stringBuilder.append(this.kvs[i + 1].toJson());
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public String toString() {
        if (this.kvs.length == 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        appendString(stringBuilder, this.kvs[0]);
        stringBuilder.append(":");
        appendString(stringBuilder, this.kvs[1]);
        for (int i = 2; i < this.kvs.length; i += 2) {
            stringBuilder.append(",");
            appendString(stringBuilder, this.kvs[i]);
            stringBuilder.append(":");
            appendString(stringBuilder, this.kvs[i + 1]);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public Collection<Value> values() {
        return new ValueCollection(this.kvs);
    }

    public void writeTo(MessagePacker messagePacker) {
        messagePacker.packMapHeader(this.kvs.length / 2);
        for (Value writeTo : this.kvs) {
            writeTo.writeTo(messagePacker);
        }
    }
}
