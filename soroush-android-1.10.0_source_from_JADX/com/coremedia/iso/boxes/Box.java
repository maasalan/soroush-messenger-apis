package com.coremedia.iso.boxes;

import com.coremedia.iso.BoxParser;
import com.googlecode.mp4parser.DataSource;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public interface Box {
    void getBox(WritableByteChannel writableByteChannel);

    long getOffset();

    Container getParent();

    long getSize();

    String getType();

    void parse(DataSource dataSource, ByteBuffer byteBuffer, long j, BoxParser boxParser);

    void setParent(Container container);
}
