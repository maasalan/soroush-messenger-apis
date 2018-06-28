package org.msgpack.template;

import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class LongTemplate extends AbstractTemplate<Long> {
    static final LongTemplate instance = new LongTemplate();

    private LongTemplate() {
    }

    public static LongTemplate getInstance() {
        return instance;
    }

    public Long read(Unpacker unpacker, Long l, boolean z) {
        return (z || !unpacker.trySkipNil()) ? Long.valueOf(unpacker.readLong()) : null;
    }

    public void write(Packer packer, Long l, boolean z) {
        if (l != null) {
            packer.write(l.longValue());
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
