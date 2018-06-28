package org.msgpack.type;

abstract class AbstractBooleanValue extends AbstractValue implements BooleanValue {
    AbstractBooleanValue() {
    }

    public BooleanValue asBooleanValue() {
        return this;
    }

    public ValueType getType() {
        return ValueType.BOOLEAN;
    }

    public boolean isBooleanValue() {
        return true;
    }

    public boolean isFalse() {
        return !getBoolean();
    }

    public boolean isTrue() {
        return getBoolean();
    }
}
