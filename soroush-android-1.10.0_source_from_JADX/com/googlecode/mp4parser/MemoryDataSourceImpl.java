package com.googlecode.mp4parser;

import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class MemoryDataSourceImpl implements DataSource {
    ByteBuffer data;

    public MemoryDataSourceImpl(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
    }

    public MemoryDataSourceImpl(byte[] bArr) {
        this.data = ByteBuffer.wrap(bArr);
    }

    public void close() {
    }

    public ByteBuffer map(long j, long j2) {
        int position = this.data.position();
        this.data.position(CastUtils.l2i(j));
        ByteBuffer slice = this.data.slice();
        slice.limit(CastUtils.l2i(j2));
        this.data.position(position);
        return slice;
    }

    public long position() {
        return (long) this.data.position();
    }

    public void position(long j) {
        this.data.position(CastUtils.l2i(j));
    }

    public int read(ByteBuffer byteBuffer) {
        if (this.data.remaining() == 0 && byteBuffer.remaining() != 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.data.remaining());
        if (byteBuffer.hasArray()) {
            byteBuffer.put(this.data.array(), this.data.position(), min);
            this.data.position(this.data.position() + min);
            return min;
        }
        byte[] bArr = new byte[min];
        this.data.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    public long size() {
        return (long) this.data.capacity();
    }

    public long transferTo(long j, long j2, WritableByteChannel writableByteChannel) {
        return (long) writableByteChannel.write((ByteBuffer) ((ByteBuffer) this.data.position(CastUtils.l2i(j))).slice().limit(CastUtils.l2i(j2)));
    }
}
