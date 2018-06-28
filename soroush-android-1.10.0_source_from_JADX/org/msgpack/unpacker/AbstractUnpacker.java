package org.msgpack.unpacker;

import java.nio.ByteBuffer;
import org.msgpack.MessagePack;
import org.msgpack.packer.Unconverter;
import org.msgpack.template.Template;
import org.msgpack.type.Value;

public abstract class AbstractUnpacker implements Unpacker {
    protected int arraySizeLimit = 4194304;
    protected int mapSizeLimit = 2097152;
    protected MessagePack msgpack;
    protected int rawSizeLimit = 134217728;

    protected AbstractUnpacker(MessagePack messagePack) {
        this.msgpack = messagePack;
    }

    public int getReadByteCount() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public UnpackerIterator iterator() {
        return new UnpackerIterator(this);
    }

    public <T> T read(Class<T> cls) {
        return tryReadNil() ? null : this.msgpack.lookup((Class) cls).read(this, null);
    }

    public <T> T read(T t) {
        return tryReadNil() ? null : this.msgpack.lookup(t.getClass()).read(this, t);
    }

    public <T> T read(T t, Template<T> template) {
        return tryReadNil() ? null : template.read(this, t);
    }

    public <T> T read(Template<T> template) {
        return tryReadNil() ? null : template.read(this, null);
    }

    public void readArrayEnd() {
        readArrayEnd(false);
    }

    public ByteBuffer readByteBuffer() {
        return ByteBuffer.wrap(readByteArray());
    }

    public void readMapEnd() {
        readMapEnd(false);
    }

    public Value readValue() {
        Unconverter unconverter = new Unconverter(this.msgpack);
        readValue(unconverter);
        return unconverter.getResult();
    }

    protected abstract void readValue(Unconverter unconverter);

    public void resetReadByteCount() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void setArraySizeLimit(int i) {
        if (i < 16) {
            this.arraySizeLimit = 16;
        } else {
            this.arraySizeLimit = i;
        }
    }

    public void setMapSizeLimit(int i) {
        if (i < 16) {
            this.mapSizeLimit = 16;
        } else {
            this.mapSizeLimit = i;
        }
    }

    public void setRawSizeLimit(int i) {
        if (i < 32) {
            this.rawSizeLimit = 32;
        } else {
            this.rawSizeLimit = i;
        }
    }

    protected abstract boolean tryReadNil();
}
