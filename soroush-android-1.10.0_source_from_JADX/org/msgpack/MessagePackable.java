package org.msgpack;

import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public interface MessagePackable {
    void readFrom(Unpacker unpacker);

    void writeTo(Packer packer);
}
