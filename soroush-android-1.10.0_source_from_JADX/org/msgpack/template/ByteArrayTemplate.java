package org.msgpack.template;

import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class ByteArrayTemplate extends AbstractTemplate<byte[]> {
    static final ByteArrayTemplate instance = new ByteArrayTemplate();

    private ByteArrayTemplate() {
    }

    public static ByteArrayTemplate getInstance() {
        return instance;
    }

    public byte[] read(Unpacker unpacker, byte[] bArr, boolean z) {
        return (z || !unpacker.trySkipNil()) ? unpacker.readByteArray() : null;
    }

    public void write(Packer packer, byte[] bArr, boolean z) {
        if (bArr != null) {
            packer.write(bArr);
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
