package org.msgpack.template;

import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public interface Template<T> {
    T read(Unpacker unpacker, T t);

    T read(Unpacker unpacker, T t, boolean z);

    void write(Packer packer, T t);

    void write(Packer packer, T t, boolean z);
}
