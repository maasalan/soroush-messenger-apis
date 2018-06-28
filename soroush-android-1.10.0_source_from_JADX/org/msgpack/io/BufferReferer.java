package org.msgpack.io;

import java.nio.ByteBuffer;

public interface BufferReferer {
    void refer(ByteBuffer byteBuffer, boolean z);
}
