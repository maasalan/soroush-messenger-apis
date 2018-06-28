package org.msgpack.template;

import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class ShortTemplate extends AbstractTemplate<Short> {
    static final ShortTemplate instance = new ShortTemplate();

    private ShortTemplate() {
    }

    public static ShortTemplate getInstance() {
        return instance;
    }

    public Short read(Unpacker unpacker, Short sh, boolean z) {
        return (z || !unpacker.trySkipNil()) ? Short.valueOf(unpacker.readShort()) : null;
    }

    public void write(Packer packer, Short sh, boolean z) {
        if (sh != null) {
            packer.write(sh);
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
