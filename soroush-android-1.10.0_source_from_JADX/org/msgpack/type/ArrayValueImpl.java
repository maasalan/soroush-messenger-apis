package org.msgpack.type;

import java.util.ListIterator;
import org.msgpack.packer.Packer;

class ArrayValueImpl extends AbstractArrayValue {
    private static ArrayValueImpl emptyInstance = new ArrayValueImpl(new Value[0], true);
    private Value[] array;

    ArrayValueImpl(Value[] valueArr, boolean z) {
        if (z) {
            this.array = valueArr;
            return;
        }
        this.array = new Value[valueArr.length];
        System.arraycopy(valueArr, 0, this.array, 0, valueArr.length);
    }

    private boolean equals(ArrayValueImpl arrayValueImpl) {
        if (this.array.length != arrayValueImpl.array.length) {
            return false;
        }
        for (int i = 0; i < this.array.length; i++) {
            if (!this.array[i].equals(arrayValueImpl.array[i])) {
                return false;
            }
        }
        return true;
    }

    public static ArrayValue getEmptyInstance() {
        return emptyInstance;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        if (!value.isArrayValue()) {
            return false;
        }
        if (value.getClass() == ArrayValueImpl.class) {
            return equals((ArrayValueImpl) value);
        }
        ListIterator listIterator = value.asArrayValue().listIterator();
        int i = 0;
        while (i < this.array.length) {
            if (!listIterator.hasNext() || !this.array[i].equals(listIterator.next())) {
                return false;
            }
            i++;
        }
        return !listIterator.hasNext();
    }

    public Value get(int i) {
        if (i >= 0) {
            if (this.array.length > i) {
                return this.array[i];
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public Value[] getElementArray() {
        return this.array;
    }

    public int hashCode() {
        int i = 1;
        for (Object hashCode : this.array) {
            i = hashCode.hashCode() + (31 * i);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.array.length == 0;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int length = this.array.length - 1; length >= 0; length--) {
            if (this.array[length].equals(obj)) {
                return length;
            }
        }
        return -1;
    }

    public int size() {
        return this.array.length;
    }

    public String toString() {
        return toString(new StringBuilder()).toString();
    }

    public StringBuilder toString(StringBuilder stringBuilder) {
        String str;
        if (this.array.length == 0) {
            str = "[]";
        } else {
            stringBuilder.append("[");
            stringBuilder.append(this.array[0]);
            for (int i = 1; i < this.array.length; i++) {
                stringBuilder.append(",");
                this.array[i].toString(stringBuilder);
            }
            str = "]";
        }
        stringBuilder.append(str);
        return stringBuilder;
    }

    public void writeTo(Packer packer) {
        packer.writeArrayBegin(this.array.length);
        for (Value writeTo : this.array) {
            writeTo.writeTo(packer);
        }
        packer.writeArrayEnd();
    }
}
