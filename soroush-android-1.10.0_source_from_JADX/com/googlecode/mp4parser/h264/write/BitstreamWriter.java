package com.googlecode.mp4parser.h264.write;

import com.googlecode.mp4parser.h264.Debug;
import java.io.OutputStream;

public class BitstreamWriter {
    private int curBit;
    private int[] curByte = new int[8];
    private final OutputStream os;

    public BitstreamWriter(OutputStream outputStream) {
        this.os = outputStream;
    }

    private void writeCurByte() {
        this.os.write((((((((this.curByte[0] << 7) | (this.curByte[1] << 6)) | (this.curByte[2] << 5)) | (this.curByte[3] << 4)) | (this.curByte[4] << 3)) | (this.curByte[5] << 2)) | (this.curByte[6] << 1)) | this.curByte[7]);
    }

    public void flush() {
        for (int i = this.curBit; i < 8; i++) {
            this.curByte[i] = 0;
        }
        this.curBit = 0;
        writeCurByte();
    }

    public void write1Bit(int i) {
        Debug.print(i);
        if (this.curBit == 8) {
            this.curBit = 0;
            writeCurByte();
        }
        int[] iArr = this.curByte;
        int i2 = this.curBit;
        this.curBit = i2 + 1;
        iArr[i2] = i;
    }

    public void writeByte(int i) {
        this.os.write(i);
    }

    public void writeNBit(long j, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            write1Bit(((int) (j >> ((i - i2) - 1))) & 1);
        }
    }

    public void writeRemainingZero() {
        writeNBit(0, 8 - this.curBit);
    }
}
