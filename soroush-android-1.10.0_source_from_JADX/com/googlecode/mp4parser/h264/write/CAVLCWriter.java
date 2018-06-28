package com.googlecode.mp4parser.h264.write;

import com.googlecode.mp4parser.h264.Debug;
import java.io.OutputStream;

public class CAVLCWriter extends BitstreamWriter {
    public CAVLCWriter(OutputStream outputStream) {
        super(outputStream);
    }

    public void writeBool(boolean z, String str) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str));
        stringBuilder.append("\t");
        Debug.print(stringBuilder.toString());
        write1Bit(z);
        StringBuilder stringBuilder2 = new StringBuilder("\t");
        stringBuilder2.append(z);
        Debug.println(stringBuilder2.toString());
    }

    public void writeNBit(long j, int i, String str) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str));
        stringBuilder.append("\t");
        Debug.print(stringBuilder.toString());
        for (int i2 = 0; i2 < i; i2++) {
            write1Bit(((int) (j >> ((i - i2) - 1))) & 1);
        }
        StringBuilder stringBuilder2 = new StringBuilder("\t");
        stringBuilder2.append(j);
        Debug.println(stringBuilder2.toString());
    }

    public void writeSE(int i, String str) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str));
        stringBuilder.append("\t");
        Debug.print(stringBuilder.toString());
        int i2 = 1;
        int i3 = (i << 1) * (i < 0 ? -1 : 1);
        if (i <= 0) {
            i2 = 0;
        }
        writeUE(i3 + i2);
        StringBuilder stringBuilder2 = new StringBuilder("\t");
        stringBuilder2.append(i);
        Debug.println(stringBuilder2.toString());
    }

    public void writeSliceTrailingBits() {
        throw new IllegalStateException("todo");
    }

    public void writeTrailingBits() {
        write1Bit(1);
        writeRemainingZero();
        flush();
    }

    public void writeU(int i, int i2) {
        writeNBit((long) i, i2);
    }

    public void writeU(int i, int i2, String str) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str));
        stringBuilder.append("\t");
        Debug.print(stringBuilder.toString());
        writeNBit((long) i, i2);
        StringBuilder stringBuilder2 = new StringBuilder("\t");
        stringBuilder2.append(i);
        Debug.println(stringBuilder2.toString());
    }

    public void writeUE(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = i3;
        while (i3 < 15) {
            int i5 = (1 << i3) + i4;
            if (i < i5) {
                i2 = i3;
                break;
            } else {
                i3++;
                i4 = i5;
            }
        }
        writeNBit(0, i2);
        write1Bit(1);
        writeNBit((long) (i - i4), i2);
    }

    public void writeUE(int i, String str) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str));
        stringBuilder.append("\t");
        Debug.print(stringBuilder.toString());
        writeUE(i);
        StringBuilder stringBuilder2 = new StringBuilder("\t");
        stringBuilder2.append(i);
        Debug.println(stringBuilder2.toString());
    }
}
