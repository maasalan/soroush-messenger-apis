package org.msgpack.util.json;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.msgpack.MessagePack;
import org.msgpack.packer.BufferPacker;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.BufferUnpacker;
import org.msgpack.unpacker.Unpacker;

public class JSON extends MessagePack {
    public JSON(MessagePack messagePack) {
        super(messagePack);
    }

    public BufferPacker createBufferPacker() {
        return new JSONBufferPacker((MessagePack) this);
    }

    public BufferPacker createBufferPacker(int i) {
        return new JSONBufferPacker(this, i);
    }

    public BufferUnpacker createBufferUnpacker() {
        return new JSONBufferUnpacker();
    }

    public BufferUnpacker createBufferUnpacker(ByteBuffer byteBuffer) {
        return createBufferUnpacker().wrap(byteBuffer);
    }

    public BufferUnpacker createBufferUnpacker(byte[] bArr) {
        return createBufferUnpacker().wrap(bArr);
    }

    public BufferUnpacker createBufferUnpacker(byte[] bArr, int i, int i2) {
        return createBufferUnpacker().wrap(bArr, i, i2);
    }

    public Packer createPacker(OutputStream outputStream) {
        return new JSONPacker((MessagePack) this, outputStream);
    }

    public Unpacker createUnpacker(InputStream inputStream) {
        return new JSONUnpacker((MessagePack) this, inputStream);
    }
}
