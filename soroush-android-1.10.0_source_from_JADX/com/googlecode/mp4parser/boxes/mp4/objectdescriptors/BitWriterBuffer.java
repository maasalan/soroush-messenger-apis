package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.nio.ByteBuffer;

public class BitWriterBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private ByteBuffer buffer;
    int initialPos;
    int position = 0;

    public BitWriterBuffer(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        this.initialPos = byteBuffer.position();
    }

    public void writeBits(int i, int i2) {
        ByteBuffer byteBuffer;
        int i3 = 8 - (this.position % 8);
        int i4 = 1;
        if (i2 <= i3) {
            int i5 = this.buffer.get(this.initialPos + (this.position / 8));
            if (i5 < 0) {
                i5 += 256;
            }
            i5 += i << (i3 - i2);
            byteBuffer = this.buffer;
            i3 = this.initialPos + (this.position / 8);
            if (i5 > 127) {
                i5 -= 256;
            }
            byteBuffer.put(i3, (byte) i5);
            this.position += i2;
        } else {
            i2 -= i3;
            writeBits(i >> i2, i3);
            writeBits(i & ((1 << i2) - 1), i2);
        }
        byteBuffer = this.buffer;
        i2 = this.initialPos + (this.position / 8);
        if (this.position % 8 <= 0) {
            i4 = 0;
        }
        byteBuffer.position(i2 + i4);
    }
}
