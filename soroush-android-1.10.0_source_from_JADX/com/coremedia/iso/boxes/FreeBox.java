package com.coremedia.iso.boxes;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.LinkedList;
import java.util.List;

public class FreeBox implements Box {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "free";
    ByteBuffer data;
    private long offset;
    private Container parent;
    List<Box> replacers;

    public FreeBox() {
        this.replacers = new LinkedList();
        this.data = ByteBuffer.wrap(new byte[0]);
    }

    public FreeBox(int i) {
        this.replacers = new LinkedList();
        this.data = ByteBuffer.allocate(i);
    }

    public void addAndReplace(Box box) {
        this.data.position(CastUtils.l2i(box.getSize()));
        this.data = this.data.slice();
        this.replacers.add(box);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FreeBox freeBox = (FreeBox) obj;
        if (getData() != null) {
            if (!getData().equals(freeBox.getData())) {
                return false;
            }
        } else if (freeBox.getData() != null) {
            return false;
        }
        return true;
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        for (Box box : this.replacers) {
            box.getBox(writableByteChannel);
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        IsoTypeWriter.writeUInt32(allocate, (long) (8 + this.data.limit()));
        allocate.put(TYPE.getBytes());
        allocate.rewind();
        writableByteChannel.write(allocate);
        allocate.rewind();
        this.data.rewind();
        writableByteChannel.write(this.data);
        this.data.rewind();
    }

    public ByteBuffer getData() {
        return this.data != null ? (ByteBuffer) this.data.duplicate().rewind() : null;
    }

    public long getOffset() {
        return this.offset;
    }

    public Container getParent() {
        return this.parent;
    }

    public long getSize() {
        long j = 8;
        for (Box size : this.replacers) {
            j += size.getSize();
        }
        return j + ((long) this.data.limit());
    }

    public String getType() {
        return TYPE;
    }

    public int hashCode() {
        return this.data != null ? this.data.hashCode() : 0;
    }

    public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j, BoxParser boxParser) {
        this.offset = dataSource.position() - ((long) byteBuffer.remaining());
        if (j > 1048576) {
            this.data = dataSource.map(dataSource.position(), j);
            dataSource.position(dataSource.position() + j);
            return;
        }
        this.data = ByteBuffer.allocate(CastUtils.l2i(j));
        dataSource.read(this.data);
    }

    public void setData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
    }

    public void setParent(Container container) {
        this.parent = container;
    }
}
