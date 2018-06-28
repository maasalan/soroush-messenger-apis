package org.msgpack.type;

import java.util.Arrays;
import org.jivesoftware.smack.util.StringUtils;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;

class StringRawValueImpl extends AbstractRawValue {
    private String string;

    StringRawValueImpl(String str) {
        this.string = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        return !value.isRawValue() ? false : value.getClass() == StringRawValueImpl.class ? this.string.equals(((StringRawValueImpl) value).string) : Arrays.equals(getByteArray(), value.asRawValue().getByteArray());
    }

    public byte[] getByteArray() {
        try {
            return this.string.getBytes(StringUtils.UTF8);
        } catch (Throwable e) {
            throw new MessageTypeException(e);
        }
    }

    public String getString() {
        return this.string;
    }

    public void writeTo(Packer packer) {
        packer.write(this.string);
    }
}
