package org.msgpack.template;

import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public abstract class AbstractTemplate<T> implements Template<T> {
    public T read(Unpacker unpacker, T t) {
        return read(unpacker, t, false);
    }

    public void write(Packer packer, T t) {
        write(packer, t, false);
    }
}
