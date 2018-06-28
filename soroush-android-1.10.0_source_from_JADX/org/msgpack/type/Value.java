package org.msgpack.type;

import org.msgpack.packer.Packer;

public interface Value {
    ArrayValue asArrayValue();

    BooleanValue asBooleanValue();

    FloatValue asFloatValue();

    IntegerValue asIntegerValue();

    MapValue asMapValue();

    NilValue asNilValue();

    RawValue asRawValue();

    ValueType getType();

    boolean isArrayValue();

    boolean isBooleanValue();

    boolean isFloatValue();

    boolean isIntegerValue();

    boolean isMapValue();

    boolean isNilValue();

    boolean isRawValue();

    StringBuilder toString(StringBuilder stringBuilder);

    void writeTo(Packer packer);
}
