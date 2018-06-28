package org.msgpack.packer;

import org.msgpack.MessageTypeException;

public final class PackerStack {
    public static final int MAX_STACK_SIZE = 128;
    private static final byte TYPE_ARRAY = (byte) 1;
    private static final byte TYPE_INVALID = (byte) 0;
    private static final byte TYPE_MAP = (byte) 2;
    private int[] counts = new int[128];
    private int top = 0;
    private byte[] types = new byte[128];

    public PackerStack() {
        this.types[0] = TYPE_INVALID;
    }

    public final void checkCount() {
        if (this.counts[this.top] <= 0) {
            if (this.types[this.top] == TYPE_ARRAY) {
                throw new MessageTypeException("Array is end but writeArrayEnd() is not called");
            } else if (this.types[this.top] == TYPE_MAP) {
                throw new MessageTypeException("Map is end but writeMapEnd() is not called");
            }
        }
    }

    public final void clear() {
        this.top = 0;
    }

    public final int getDepth() {
        return this.top;
    }

    public final int getTopCount() {
        return this.counts[this.top];
    }

    public final void pop() {
        this.top--;
    }

    public final void pushArray(int i) {
        this.top++;
        this.types[this.top] = TYPE_ARRAY;
        this.counts[this.top] = i;
    }

    public final void pushMap(int i) {
        this.top++;
        this.types[this.top] = TYPE_MAP;
        this.counts[this.top] = i * 2;
    }

    public final void reduceCount() {
        int[] iArr = this.counts;
        int i = this.top;
        iArr[i] = iArr[i] - 1;
    }

    public final boolean topIsArray() {
        return this.types[this.top] == TYPE_ARRAY;
    }

    public final boolean topIsMap() {
        return this.types[this.top] == TYPE_MAP;
    }
}
