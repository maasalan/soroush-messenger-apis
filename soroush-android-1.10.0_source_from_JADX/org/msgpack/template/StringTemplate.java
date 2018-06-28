package org.msgpack.template;

import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class StringTemplate extends AbstractTemplate<String> {
    static final StringTemplate instance = new StringTemplate();

    private StringTemplate() {
    }

    public static StringTemplate getInstance() {
        return instance;
    }

    public String read(Unpacker unpacker, String str, boolean z) {
        return (z || !unpacker.trySkipNil()) ? unpacker.readString() : null;
    }

    public void write(Packer packer, String str, boolean z) {
        if (str != null) {
            packer.write(str);
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
