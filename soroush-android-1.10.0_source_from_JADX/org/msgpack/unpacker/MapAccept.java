package org.msgpack.unpacker;

final class MapAccept extends Accept {
    int size;

    MapAccept() {
        super("map");
    }

    final void acceptMap(int i) {
        this.size = i;
    }
}
