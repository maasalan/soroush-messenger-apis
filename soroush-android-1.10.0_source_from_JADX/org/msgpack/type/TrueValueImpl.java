package org.msgpack.type;

import org.msgpack.packer.Packer;

class TrueValueImpl extends AbstractBooleanValue {
    private static TrueValueImpl instance = new TrueValueImpl();

    private TrueValueImpl() {
    }

    static TrueValueImpl getInstance() {
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
        return value.isBooleanValue() && value.asBooleanValue().getBoolean();
    }

    public boolean getBoolean() {
        return true;
    }

    public int hashCode() {
        return 1231;
    }

    public String toString() {
        return "true";
    }

    public StringBuilder toString(StringBuilder stringBuilder) {
        stringBuilder.append("true");
        return stringBuilder;
    }

    public void writeTo(Packer packer) {
        packer.write(true);
    }
}
