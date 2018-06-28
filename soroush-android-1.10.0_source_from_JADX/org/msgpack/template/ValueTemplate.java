package org.msgpack.template;

import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.type.Value;
import org.msgpack.unpacker.Unpacker;

public class ValueTemplate extends AbstractTemplate<Value> {
    static final ValueTemplate instance = new ValueTemplate();

    private ValueTemplate() {
    }

    public static ValueTemplate getInstance() {
        return instance;
    }

    public Value read(Unpacker unpacker, Value value, boolean z) {
        return (z || !unpacker.trySkipNil()) ? unpacker.readValue() : null;
    }

    public void write(Packer packer, Value value, boolean z) {
        if (value != null) {
            value.writeTo(packer);
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
