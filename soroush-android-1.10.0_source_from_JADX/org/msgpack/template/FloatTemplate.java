package org.msgpack.template;

import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class FloatTemplate extends AbstractTemplate<Float> {
    static final FloatTemplate instance = new FloatTemplate();

    private FloatTemplate() {
    }

    public static FloatTemplate getInstance() {
        return instance;
    }

    public Float read(Unpacker unpacker, Float f, boolean z) {
        return (z || !unpacker.trySkipNil()) ? Float.valueOf(unpacker.readFloat()) : null;
    }

    public void write(Packer packer, Float f, boolean z) {
        if (f != null) {
            packer.write(f.floatValue());
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
