package org.msgpack.type;

import org.msgpack.packer.Packer;

public class NilValue extends AbstractValue {
    private static NilValue instance = new NilValue();

    private NilValue() {
    }

    static NilValue getInstance() {
        return instance;
    }

    public /* bridge */ /* synthetic */ ArrayValue asArrayValue() {
        return super.asArrayValue();
    }

    public /* bridge */ /* synthetic */ BooleanValue asBooleanValue() {
        return super.asBooleanValue();
    }

    public /* bridge */ /* synthetic */ FloatValue asFloatValue() {
        return super.asFloatValue();
    }

    public /* bridge */ /* synthetic */ IntegerValue asIntegerValue() {
        return super.asIntegerValue();
    }

    public /* bridge */ /* synthetic */ MapValue asMapValue() {
        return super.asMapValue();
    }

    public NilValue asNilValue() {
        return this;
    }

    public /* bridge */ /* synthetic */ RawValue asRawValue() {
        return super.asRawValue();
    }

    public boolean equals(Object obj) {
        return obj == this ? true : !(obj instanceof Value) ? false : ((Value) obj).isNilValue();
    }

    public ValueType getType() {
        return ValueType.NIL;
    }

    public int hashCode() {
        return 0;
    }

    public /* bridge */ /* synthetic */ boolean isArrayValue() {
        return super.isArrayValue();
    }

    public /* bridge */ /* synthetic */ boolean isBooleanValue() {
        return super.isBooleanValue();
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

    public boolean isNilValue() {
        return true;
    }

    public /* bridge */ /* synthetic */ boolean isRawValue() {
        return super.isRawValue();
    }

    public String toString() {
        return "null";
    }

    public StringBuilder toString(StringBuilder stringBuilder) {
        stringBuilder.append("null");
        return stringBuilder;
    }

    public void writeTo(Packer packer) {
        packer.writeNil();
    }
}
