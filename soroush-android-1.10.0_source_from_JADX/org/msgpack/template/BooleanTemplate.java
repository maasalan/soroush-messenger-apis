package org.msgpack.template;

import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class BooleanTemplate extends AbstractTemplate<Boolean> {
    static final BooleanTemplate instance = new BooleanTemplate();

    private BooleanTemplate() {
    }

    public static BooleanTemplate getInstance() {
        return instance;
    }

    public Boolean read(Unpacker unpacker, Boolean bool, boolean z) {
        return (z || !unpacker.trySkipNil()) ? Boolean.valueOf(unpacker.readBoolean()) : null;
    }

    public void write(Packer packer, Boolean bool, boolean z) {
        if (bool != null) {
            packer.write(bool.booleanValue());
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
