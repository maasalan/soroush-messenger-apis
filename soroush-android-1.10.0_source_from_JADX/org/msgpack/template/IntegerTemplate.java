package org.msgpack.template;

import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class IntegerTemplate extends AbstractTemplate<Integer> {
    static final IntegerTemplate instance = new IntegerTemplate();

    private IntegerTemplate() {
    }

    public static IntegerTemplate getInstance() {
        return instance;
    }

    public Integer read(Unpacker unpacker, Integer num, boolean z) {
        return (z || !unpacker.trySkipNil()) ? Integer.valueOf(unpacker.readInt()) : null;
    }

    public void write(Packer packer, Integer num, boolean z) {
        if (num != null) {
            packer.write(num.intValue());
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
