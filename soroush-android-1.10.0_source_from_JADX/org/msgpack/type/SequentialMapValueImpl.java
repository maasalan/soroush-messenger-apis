package org.msgpack.type;

import java.util.AbstractCollection;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import org.msgpack.packer.Packer;
import org.msgpack.util.android.PortedImmutableEntry;

class SequentialMapValueImpl extends AbstractMapValue {
    private static SequentialMapValueImpl emptyInstance = new SequentialMapValueImpl(new Value[0], true);
    private Value[] array;

    private static class EntrySet extends AbstractSet<Entry<Value, Value>> {
        private Value[] array;

        EntrySet(Value[] valueArr) {
            this.array = valueArr;
        }

        public Iterator<Entry<Value, Value>> iterator() {
            return new EntrySetIterator(this.array);
        }

        public int size() {
            return this.array.length / 2;
        }
    }

    private static class EntrySetIterator implements Iterator<Entry<Value, Value>> {
        private static final boolean hasDefaultImmutableEntry;
        private Value[] array;
        private int pos = 0;

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = 1;
            r1 = "java.util.AbstractMap.SimpleImmutableEntry";	 Catch:{ ClassNotFoundException -> 0x000d, all -> 0x0009 }
            java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x000d, all -> 0x0009 }
            hasDefaultImmutableEntry = r0;
            return;
        L_0x0009:
            r1 = move-exception;
            hasDefaultImmutableEntry = r0;
            throw r1;
        L_0x000d:
            r0 = 0;
            hasDefaultImmutableEntry = r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.msgpack.type.SequentialMapValueImpl.EntrySetIterator.<clinit>():void");
        }

        EntrySetIterator(Value[] valueArr) {
            this.array = valueArr;
        }

        public boolean hasNext() {
            return this.pos < this.array.length;
        }

        public Entry<Value, Value> next() {
            if (this.pos >= this.array.length) {
                throw new NoSuchElementException();
            }
            Object obj = this.array[this.pos];
            Object obj2 = this.array[this.pos + 1];
            Entry<Value, Value> simpleImmutableEntry = hasDefaultImmutableEntry ? new SimpleImmutableEntry(obj, obj2) : new PortedImmutableEntry(obj, obj2);
            this.pos += 2;
            return simpleImmutableEntry;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static class KeySet extends AbstractSet<Value> {
        private Value[] array;

        KeySet(Value[] valueArr) {
            this.array = valueArr;
        }

        public Iterator<Value> iterator() {
            return new ValueIterator(this.array, 0);
        }

        public int size() {
            return this.array.length / 2;
        }
    }

    private static class ValueCollection extends AbstractCollection<Value> {
        private Value[] array;

        ValueCollection(Value[] valueArr) {
            this.array = valueArr;
        }

        public Iterator<Value> iterator() {
            return new ValueIterator(this.array, 1);
        }

        public int size() {
            return this.array.length / 2;
        }
    }

    private static class ValueIterator implements Iterator<Value> {
        private Value[] array;
        private int pos;

        ValueIterator(Value[] valueArr, int i) {
            this.array = valueArr;
            this.pos = i;
        }

        public boolean hasNext() {
            return this.pos < this.array.length;
        }

        public Value next() {
            if (this.pos >= this.array.length) {
                throw new NoSuchElementException();
            }
            Value value = this.array[this.pos];
            this.pos += 2;
            return value;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    SequentialMapValueImpl(Value[] valueArr, boolean z) {
        if (valueArr.length % 2 != 0) {
            throw new IllegalArgumentException();
        } else if (z) {
            this.array = valueArr;
        } else {
            this.array = new Value[valueArr.length];
            System.arraycopy(valueArr, 0, this.array, 0, valueArr.length);
        }
    }

    public static MapValue getEmptyInstance() {
        return emptyInstance;
    }

    public Set<Entry<Value, Value>> entrySet() {
        return new EntrySet(this.array);
    }

    public boolean equals(java.lang.Object r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = 1;
        if (r7 != r6) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r7 instanceof org.msgpack.type.Value;
        r2 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r7 = (org.msgpack.type.Value) r7;
        r1 = r7.isMapValue();
        if (r1 != 0) goto L_0x0013;
    L_0x0012:
        return r2;
    L_0x0013:
        r7 = r7.asMapValue();
        r1 = r7.size();
        r3 = r6.array;
        r3 = r3.length;
        r3 = r3 / 2;
        if (r1 == r3) goto L_0x0023;
    L_0x0022:
        return r2;
    L_0x0023:
        r1 = r2;
    L_0x0024:
        r3 = r6.array;	 Catch:{ ClassCastException -> 0x0042, ClassCastException -> 0x0042 }
        r3 = r3.length;	 Catch:{ ClassCastException -> 0x0042, ClassCastException -> 0x0042 }
        if (r1 >= r3) goto L_0x0041;	 Catch:{ ClassCastException -> 0x0042, ClassCastException -> 0x0042 }
    L_0x0029:
        r3 = r6.array;	 Catch:{ ClassCastException -> 0x0042, ClassCastException -> 0x0042 }
        r3 = r3[r1];	 Catch:{ ClassCastException -> 0x0042, ClassCastException -> 0x0042 }
        r4 = r6.array;	 Catch:{ ClassCastException -> 0x0042, ClassCastException -> 0x0042 }
        r5 = r1 + 1;	 Catch:{ ClassCastException -> 0x0042, ClassCastException -> 0x0042 }
        r4 = r4[r5];	 Catch:{ ClassCastException -> 0x0042, ClassCastException -> 0x0042 }
        r3 = r7.get(r3);	 Catch:{ ClassCastException -> 0x0042, ClassCastException -> 0x0042 }
        r3 = r4.equals(r3);	 Catch:{ ClassCastException -> 0x0042, ClassCastException -> 0x0042 }
        if (r3 != 0) goto L_0x003e;
    L_0x003d:
        return r2;
    L_0x003e:
        r1 = r1 + 2;
        goto L_0x0024;
    L_0x0041:
        return r0;
    L_0x0042:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.type.SequentialMapValueImpl.equals(java.lang.Object):boolean");
    }

    public Value get(Object obj) {
        if (obj == null) {
            return null;
        }
        for (int length = this.array.length - 2; length >= 0; length -= 2) {
            if (this.array[length].equals(obj)) {
                return this.array[length + 1];
            }
        }
        return null;
    }

    public Value[] getKeyValueArray() {
        return this.array;
    }

    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (i < this.array.length) {
            i2 += this.array[i].hashCode() ^ this.array[i + 1].hashCode();
            i += 2;
        }
        return i2;
    }

    public Set<Value> keySet() {
        return new KeySet(this.array);
    }

    public String toString() {
        return toString(new StringBuilder()).toString();
    }

    public StringBuilder toString(StringBuilder stringBuilder) {
        String str;
        if (this.array.length == 0) {
            str = "{}";
        } else {
            stringBuilder.append("{");
            stringBuilder.append(this.array[0]);
            stringBuilder.append(":");
            stringBuilder.append(this.array[1]);
            for (int i = 2; i < this.array.length; i += 2) {
                stringBuilder.append(",");
                this.array[i].toString(stringBuilder);
                stringBuilder.append(":");
                this.array[i + 1].toString(stringBuilder);
            }
            str = "}";
        }
        stringBuilder.append(str);
        return stringBuilder;
    }

    public Collection<Value> values() {
        return new ValueCollection(this.array);
    }

    public void writeTo(Packer packer) {
        packer.writeMapBegin(this.array.length / 2);
        for (Value writeTo : this.array) {
            writeTo.writeTo(packer);
        }
        packer.writeMapEnd();
    }
}
