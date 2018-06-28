package org.msgpack.template;

import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class DoubleTemplate extends AbstractTemplate<Double> {
    static final DoubleTemplate instance = new DoubleTemplate();

    private DoubleTemplate() {
    }

    public static DoubleTemplate getInstance() {
        return instance;
    }

    public Double read(Unpacker unpacker, Double d, boolean z) {
        return (z || !unpacker.trySkipNil()) ? Double.valueOf(unpacker.readDouble()) : null;
    }

    public void write(Packer packer, Double d, boolean z) {
        if (d != null) {
            packer.write(d.doubleValue());
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
