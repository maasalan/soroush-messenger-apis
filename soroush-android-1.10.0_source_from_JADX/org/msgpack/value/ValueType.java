package org.msgpack.value;

public enum ValueType {
    NIL(false, false),
    BOOLEAN(false, false),
    INTEGER(true, false),
    FLOAT(true, false),
    STRING(false, true),
    BINARY(false, true),
    ARRAY(false, false),
    MAP(false, false),
    EXTENSION(false, false);
    
    private final boolean numberType;
    private final boolean rawType;

    private ValueType(boolean z, boolean z2) {
        this.numberType = z;
        this.rawType = z2;
    }

    public final boolean isArrayType() {
        return this == ARRAY;
    }

    public final boolean isBinaryType() {
        return this == BINARY;
    }

    public final boolean isBooleanType() {
        return this == BOOLEAN;
    }

    public final boolean isExtensionType() {
        return this == EXTENSION;
    }

    public final boolean isFloatType() {
        return this == FLOAT;
    }

    public final boolean isIntegerType() {
        return this == INTEGER;
    }

    public final boolean isMapType() {
        return this == MAP;
    }

    public final boolean isNilType() {
        return this == NIL;
    }

    public final boolean isNumberType() {
        return this.numberType;
    }

    public final boolean isRawType() {
        return this.rawType;
    }

    public final boolean isStringType() {
        return this == STRING;
    }
}
