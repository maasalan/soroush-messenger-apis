package org.msgpack.core.buffer;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.msgpack.core.Preconditions;

public class ChannelBufferOutput implements MessageBufferOutput {
    private MessageBuffer buffer;
    private WritableByteChannel channel;

    public ChannelBufferOutput(WritableByteChannel writableByteChannel) {
        this(writableByteChannel, 8192);
    }

    public ChannelBufferOutput(WritableByteChannel writableByteChannel, int i) {
        this.channel = (WritableByteChannel) Preconditions.checkNotNull(writableByteChannel, "output channel is null");
        this.buffer = MessageBuffer.allocate(i);
    }

    public void add(byte[] bArr, int i, int i2) {
        write(bArr, i, i2);
    }

    public void close() {
        this.channel.close();
    }

    public void flush() {
    }

    public MessageBuffer next(int i) {
        if (this.buffer.size() < i) {
            this.buffer = MessageBuffer.allocate(i);
        }
        return this.buffer;
    }

    public WritableByteChannel reset(WritableByteChannel writableByteChannel) {
        WritableByteChannel writableByteChannel2 = this.channel;
        this.channel = writableByteChannel;
        return writableByteChannel2;
    }

    public void write(byte[] bArr, int i, int i2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        while (wrap.hasRemaining()) {
            this.channel.write(wrap);
        }
    }

    public void writeBuffer(int i) {
        ByteBuffer sliceAsByteBuffer = this.buffer.sliceAsByteBuffer(0, i);
        while (sliceAsByteBuffer.hasRemaining()) {
            this.channel.write(sliceAsByteBuffer);
        }
    }
}
