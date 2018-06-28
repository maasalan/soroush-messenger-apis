package org.msgpack.util.json;

import org.msgpack.MessagePack;
import org.msgpack.io.LinkedBufferOutput;
import org.msgpack.packer.BufferPacker;

public class JSONBufferPacker extends JSONPacker implements BufferPacker {
    private static final int DEFAULT_BUFFER_SIZE = 512;

    public JSONBufferPacker() {
        this(512);
    }

    public JSONBufferPacker(int i) {
        this(new MessagePack(), i);
    }

    public JSONBufferPacker(MessagePack messagePack) {
        this(messagePack, 512);
    }

    public JSONBufferPacker(MessagePack messagePack, int i) {
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
