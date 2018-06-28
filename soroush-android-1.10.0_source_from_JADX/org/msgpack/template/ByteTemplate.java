package org.msgpack.template;

import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class ByteTemplate extends AbstractTemplate<Byte> {
    static final ByteTemplate instance = new ByteTemplate();

    private ByteTemplate() {
    }

    public static ByteTemplate getInstance() {
        return instance;
    }

    public Byte read(Unpacker unpacker, Byte b, boolean z) {
        return (z || !unpacker.trySkipNil()) ? Byte.valueOf(unpacker.readByte()) : null;
    }

    public void write(Packer packer, Byte b, boolean z) {
        if (b != null) {
            packer.write(b.byteValue());
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
