package org.msgpack.type;

import org.msgpack.packer.Packer;

class FalseValueImpl extends AbstractBooleanValue {
    private static FalseValueImpl instance = new FalseValueImpl();

    private FalseValueImpl() {
    }

    static FalseValueImpl getInstance() {
        return instance;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        return value.isBooleanValue() && !value.asBooleanValue().getBoolean();
    }

    public boolean getBoolean() {
        return false;
    }

    public int hashCode() {
        return 1237;
    }

    public String toString() {
        return "false";
    }

    public StringBuilder toString(StringBuilder stringBuilder) {
        stringBuilder.append("false");
        return stringBuilder;
    }

    public void writeTo(Packer packer) {
        packer.write(false);
    }
}
