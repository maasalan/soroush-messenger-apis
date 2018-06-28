package org.msgpack.core.buffer;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import org.msgpack.core.Preconditions;

public class ChannelBufferInput implements MessageBufferInput {
    private final MessageBuffer buffer;
    private ReadableByteChannel channel;

    public ChannelBufferInput(ReadableByteChannel readableByteChannel) {
        this(readableByteChannel, 8192);
    }

    public ChannelBufferInput(ReadableByteChannel readableByteChannel, int i) {
        this.channel = (ReadableByteChannel) Preconditions.checkNotNull(readableByteChannel, "input channel is null");
        boolean z = i > 0;
        StringBuilder stringBuilder = new StringBuilder("buffer size must be > 0: ");
        stringBuilder.append(i);
        Preconditions.checkArgument(z, stringBuilder.toString());
        this.buffer = MessageBuffer.allocate(i);
    }

    public void close() {
        this.channel.close();
    }

    public MessageBuffer next() {
        ByteBuffer sliceAsByteBuffer = this.buffer.sliceAsByteBuffer();
        while (sliceAsByteBuffer.remaining() > 0) {
            if (this.channel.read(sliceAsByteBuffer) == -1) {
                break;
            }
        }
        sliceAsByteBuffer.flip();
        return sliceAsByteBuffer.remaining() == 0 ? null : this.buffer.slice(0, sliceAsByteBuffer.limit());
    }

    public ReadableByteChannel reset(ReadableByteChannel readableByteChannel) {
        ReadableByteChannel readableByteChannel2 = this.channel;
        this.channel = readableByteChannel;
        return readableByteChannel2;
    }
}
