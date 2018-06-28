package org.msgpack.unpacker;

final class ArrayAccept extends Accept {
    int size;

    ArrayAccept() {
        super("array");
    }

    final void acceptArray(int i) {
        this.size = i;
    }
}
