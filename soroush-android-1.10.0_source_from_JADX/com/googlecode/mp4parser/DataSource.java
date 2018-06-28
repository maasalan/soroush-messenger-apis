package com.googlecode.mp4parser;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public interface DataSource extends Closeable {
    void close();

    ByteBuffer map(long j, long j2);

    long position();

    void position(long j);

    int read(ByteBuffer byteBuffer);

    long size();

    long transferTo(long j, long j2, WritableByteChannel writableByteChannel);
}
