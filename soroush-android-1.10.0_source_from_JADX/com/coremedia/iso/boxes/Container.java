package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;

public interface Container {
    List<Box> getBoxes();

    <T extends Box> List<T> getBoxes(Class<T> cls);

    <T extends Box> List<T> getBoxes(Class<T> cls, boolean z);

    ByteBuffer getByteBuffer(long j, long j2);

    void setBoxes(List<Box> list);

    void writeContainer(WritableByteChannel writableByteChannel);
}
