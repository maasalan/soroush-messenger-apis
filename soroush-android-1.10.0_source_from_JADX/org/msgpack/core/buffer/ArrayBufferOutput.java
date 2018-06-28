package org.msgpack.core.buffer;

import java.util.ArrayList;
import java.util.List;

public class ArrayBufferOutput implements MessageBufferOutput {
    private int bufferSize;
    private MessageBuffer lastBuffer;
    private List<MessageBuffer> list;

    public ArrayBufferOutput() {
        this(8192);
    }

    public ArrayBufferOutput(int i) {
        this.bufferSize = i;
        this.list = new ArrayList();
    }

    public void add(byte[] bArr, int i, int i2) {
        this.list.add(MessageBuffer.wrap(bArr, i, i2));
    }

    public void clear() {
        this.list.clear();
    }

    public void close() {
    }

    public void flush() {
    }

    public int getSize() {
        int i = 0;
        for (MessageBuffer size : this.list) {
            i += size.size();
        }
        return i;
    }

    public MessageBuffer next(int i) {
        if (this.lastBuffer != null && this.lastBuffer.size() > i) {
            return this.lastBuffer;
        }
        MessageBuffer allocate = MessageBuffer.allocate(Math.max(this.bufferSize, i));
        this.lastBuffer = allocate;
        return allocate;
    }

    public List<MessageBuffer> toBufferList() {
        return new ArrayList(this.list);
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[getSize()];
        int i = 0;
        for (MessageBuffer messageBuffer : this.list) {
            messageBuffer.getBytes(0, bArr, i, messageBuffer.size());
            i += messageBuffer.size();
        }
        return bArr;
    }

    public MessageBuffer toMessageBuffer() {
        return this.list.size() == 1 ? (MessageBuffer) this.list.get(0) : this.list.isEmpty() ? MessageBuffer.allocate(0) : MessageBuffer.wrap(toByteArray());
    }

    public void write(byte[] bArr, int i, int i2) {
        MessageBuffer allocate = MessageBuffer.allocate(i2);
        allocate.putBytes(0, bArr, i, i2);
        this.list.add(allocate);
    }

    public void writeBuffer(int i) {
        this.list.add(this.lastBuffer.slice(0, i));
        this.lastBuffer = this.lastBuffer.size() - i > this.bufferSize / 4 ? this.lastBuffer.slice(i, this.lastBuffer.size() - i) : null;
    }
}
