package org.msgpack.io;

abstract class AbstractInput implements Input {
    private int readByteCount = 0;

    AbstractInput() {
    }

    public int getReadByteCount() {
        return this.readByteCount;
    }

    protected final void incrReadByteCount(int i) {
        this.readByteCount += i;
    }

    protected final void incrReadOneByteCount() {
        this.readByteCount++;
    }

    public void resetReadByteCount() {
        this.readByteCount = 0;
    }
}
