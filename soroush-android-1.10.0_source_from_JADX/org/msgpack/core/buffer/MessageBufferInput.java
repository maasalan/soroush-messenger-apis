package org.msgpack.core.buffer;

import java.io.Closeable;

public interface MessageBufferInput extends Closeable {
    void close();

    MessageBuffer next();
}
