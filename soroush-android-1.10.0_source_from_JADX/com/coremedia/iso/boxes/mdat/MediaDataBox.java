package com.coremedia.iso.boxes.mdat;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.DataSource;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.logging.Logger;

public final class MediaDataBox implements Box {
    private static Logger LOG = Logger.getLogger(MediaDataBox.class.getName());
    public static final String TYPE = "mdat";
    private DataSource dataSource;
    boolean largeBox = false;
    private long offset;
    Container parent;
    private long size;

    private static void transfer(DataSource dataSource, long j, long j2, WritableByteChannel writableByteChannel) {
        long j3 = 0;
        while (j3 < j2) {
            j3 += dataSource.transferTo(j + j3, Math.min(67076096, j2 - j3), writableByteChannel);
        }
    }

    public final void getBox(WritableByteChannel writableByteChannel) {
        transfer(this.dataSource, this.offset, this.size, writableByteChannel);
    }

    public final long getOffset() {
        return this.offset;
    }

    public final Container getParent() {
        return this.parent;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getType() {
        return TYPE;
    }

    public final void parse(DataSource dataSource, ByteBuffer byteBuffer, long j, BoxParser boxParser) {
        this.offset = dataSource.position() - ((long) byteBuffer.remaining());
        this.dataSource = dataSource;
        this.size = j + ((long) byteBuffer.remaining());
        dataSource.position(dataSource.position() + j);
    }

    public final void setParent(Container container) {
        this.parent = container;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MediaDataBox{size=");
        stringBuilder.append(this.size);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
