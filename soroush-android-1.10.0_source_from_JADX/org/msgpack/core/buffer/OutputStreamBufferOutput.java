package org.msgpack.core.buffer;

import java.io.OutputStream;
import org.msgpack.core.Preconditions;

public class OutputStreamBufferOutput implements MessageBufferOutput {
    private MessageBuffer buffer;
    private OutputStream out;

    public OutputStreamBufferOutput(OutputStream outputStream) {
        this(outputStream, 8192);
    }

    public OutputStreamBufferOutput(OutputStream outputStream, int i) {
        this.out = (OutputStream) Preconditions.checkNotNull(outputStream, "output is null");
        this.buffer = MessageBuffer.allocate(i);
    }

    public void add(byte[] bArr, int i, int i2) {
        write(bArr, i, i2);
    }

    public void close() {
        this.out.close();
    }

    public void flush() {
        this.out.flush();
    }

    public MessageBuffer next(int i) {
        if (this.buffer.size() < i) {
            this.buffer = MessageBuffer.allocate(i);
        }
        return this.buffer;
    }

    public OutputStream reset(OutputStream outputStream) {
        OutputStream outputStream2 = this.out;
        this.out = outputStream;
        return outputStream2;
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
    }

    public void writeBuffer(int i) {
        write(this.buffer.array(), this.buffer.arrayOffset(), i);
    }
}
