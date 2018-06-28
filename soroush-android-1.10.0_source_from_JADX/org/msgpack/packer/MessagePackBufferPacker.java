package org.msgpack.packer;

import org.msgpack.MessagePack;
import org.msgpack.io.LinkedBufferOutput;

public class MessagePackBufferPacker extends MessagePackPacker implements BufferPacker {
    private static final int DEFAULT_BUFFER_SIZE = 512;

    public MessagePackBufferPacker(MessagePack messagePack) {
        this(messagePack, 512);
    }

    public MessagePackBufferPacker(MessagePack messagePack, int i) {
        super(messagePack, new LinkedBufferOutput(i));
    }

    public void clear() {
        reset();
        ((LinkedBufferOutput) this.out).clear();
    }

    public int getBufferSize() {
        return ((LinkedBufferOutput) this.out).getSize();
    }

    public byte[] toByteArray() {
        return ((LinkedBufferOutput) this.out).toByteArray();
    }
}
