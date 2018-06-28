package com.googlecode.mp4parser.h264.read;

import com.googlecode.mp4parser.h264.CharCache;
import java.io.InputStream;

public class BitstreamReader {
    protected static int bitsRead;
    private int curByte;
    protected CharCache debugBits = new CharCache(50);
    private InputStream is;
    int nBit;
    private int nextByte;

    public BitstreamReader(InputStream inputStream) {
        this.is = inputStream;
        this.curByte = inputStream.read();
        this.nextByte = inputStream.read();
    }

    private void advance() {
        this.curByte = this.nextByte;
        this.nextByte = this.is.read();
        this.nBit = 0;
    }

    public void close() {
    }

    public long getBitPosition() {
        return (long) ((bitsRead * 8) + (this.nBit % 8));
    }

    public int getCurBit() {
        return this.nBit;
    }

    public boolean isByteAligned() {
        return this.nBit % 8 == 0;
    }

    public boolean moreRBSPData() {
        if (this.nBit == 8) {
            advance();
        }
        int i = 1 << ((8 - this.nBit) - 1);
        return this.curByte != -1 ? (this.nextByte == -1 && ((((i << 1) - 1) & this.curByte) == i)) ? false : true : false;
    }

    public int peakNextBits(int i) {
        if (i > 8) {
            throw new IllegalArgumentException("N should be less then 8");
        }
        if (this.nBit == 8) {
            advance();
            if (this.curByte == -1) {
                return -1;
            }
        }
        int[] iArr = new int[(16 - this.nBit)];
        int i2 = this.nBit;
        int i3 = 0;
        int i4 = 0;
        while (i2 < 8) {
            int i5 = i4 + 1;
            iArr[i4] = (this.curByte >> (7 - i2)) & 1;
            i2++;
            i4 = i5;
        }
        i2 = 0;
        while (i2 < 8) {
            i5 = i4 + 1;
            iArr[i4] = (this.nextByte >> (7 - i2)) & 1;
            i2++;
            i4 = i5;
        }
        int i6 = 0;
        while (i3 < i) {
            i6 = (i6 << 1) | iArr[i3];
            i3++;
        }
        return i6;
    }

    public int read1Bit() {
        if (this.nBit == 8) {
            advance();
            if (this.curByte == -1) {
                return -1;
            }
        }
        int i = (this.curByte >> (7 - this.nBit)) & 1;
        this.nBit++;
        this.debugBits.append(i == 0 ? '0' : '1');
        bitsRead++;
        return i;
    }

    public boolean readBool() {
        return read1Bit() == 1;
    }

    public int readByte() {
        if (this.nBit > 0) {
            advance();
        }
        int i = this.curByte;
        advance();
        return i;
    }

    public long readNBit(int i) {
        if (i > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long j = 0;
        int i2 = 0;
        while (i2 < i) {
            i2++;
            j = (j << 1) | ((long) read1Bit());
        }
        return j;
    }

    public long readRemainingByte() {
        return readNBit(8 - this.nBit);
    }
}
