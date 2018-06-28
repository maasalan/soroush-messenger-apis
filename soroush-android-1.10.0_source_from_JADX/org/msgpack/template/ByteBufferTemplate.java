package org.msgpack.template;

import java.nio.ByteBuffer;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class ByteBufferTemplate extends AbstractTemplate<ByteBuffer> {
    static final ByteBufferTemplate instance = new ByteBufferTemplate();

    private ByteBufferTemplate() {
    }

    public static ByteBufferTemplate getInstance() {
        return instance;
    }

    public ByteBuffer read(Unpacker unpacker, ByteBuffer byteBuffer, boolean z) {
        return (z || !unpacker.trySkipNil()) ? unpacker.readByteBuffer() : null;
    }

    public void write(Packer packer, ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer != null) {
            packer.write(byteBuffer);
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
