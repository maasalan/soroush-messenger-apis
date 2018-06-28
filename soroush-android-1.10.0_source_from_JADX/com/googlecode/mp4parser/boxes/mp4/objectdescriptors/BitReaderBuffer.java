package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.nio.ByteBuffer;

public class BitReaderBuffer {
    private ByteBuffer buffer;
    int initialPos;
    int position;

    public BitReaderBuffer(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        this.initialPos = byteBuffer.position();
    }

    public int byteSync() {
        int i = 8 - (this.position % 8);
        if (i == 8) {
            i = 0;
        }
        readBits(i);
        return i;
    }

    public int getPosition() {
        return this.position;
    }

    public int readBits(int i) {
        int i2 = this.buffer.get(this.initialPos + (this.position / 8));
        if (i2 < 0) {
            i2 += 256;
        }
        int i3 = 8 - (this.position % 8);
        if (i <= i3) {
            i2 = ((i2 << (this.position % 8)) & 255) >> ((this.position % 8) + (i3 - i));
            this.position += i;
        } else {
            i -= i3;
            i2 = (readBits(i3) << i) + readBits(i);
        }
        this.buffer.position(this.initialPos + ((int) Math.ceil(((double) this.position) / 8.0d)));
        return i2;
    }

    public boolean readBool() {
        return readBits(1) == 1;
    }

    public int remainingBits() {
        return (this.buffer.limit() * 8) - this.position;
    }
}
