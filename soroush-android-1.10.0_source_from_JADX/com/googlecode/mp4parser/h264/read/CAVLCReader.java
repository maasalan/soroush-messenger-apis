package com.googlecode.mp4parser.h264.read;

import com.googlecode.mp4parser.h264.BTree;
import com.googlecode.mp4parser.h264.Debug;
import java.io.InputStream;

public class CAVLCReader extends BitstreamReader {
    public CAVLCReader(InputStream inputStream) {
        super(inputStream);
    }

    private int readUE() {
        int i = 0;
        while (read1Bit() == 0) {
            i++;
        }
        if (i <= 0) {
            return 0;
        }
        return (int) (((long) ((1 << i) - 1)) + readNBit(i));
    }

    private void trace(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        String valueOf = String.valueOf(BitstreamReader.bitsRead - this.debugBits.length());
        int length = 8 - valueOf.length();
        StringBuilder stringBuilder2 = new StringBuilder("@");
        stringBuilder2.append(valueOf);
        stringBuilder.append(stringBuilder2.toString());
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            stringBuilder.append(' ');
        }
        stringBuilder.append(str);
        int length2 = (100 - stringBuilder.length()) - this.debugBits.length();
        while (i < length2) {
            stringBuilder.append(' ');
            i++;
        }
        stringBuilder.append(this.debugBits);
        StringBuilder stringBuilder3 = new StringBuilder(" (");
        stringBuilder3.append(str2);
        stringBuilder3.append(")");
        stringBuilder.append(stringBuilder3.toString());
        this.debugBits.clear();
        Debug.println(stringBuilder.toString());
    }

    public byte[] read(int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) readByte();
        }
        return bArr;
    }

    public boolean readAE() {
        throw new UnsupportedOperationException("Stan");
    }

    public int readAEI() {
        throw new UnsupportedOperationException("Stan");
    }

    public boolean readBool(String str) {
        boolean z = read1Bit() != 0;
        trace(str, z ? "1" : "0");
        return z;
    }

    public Object readCE(BTree bTree, String str) {
        Object value;
        do {
            bTree = bTree.down(read1Bit());
            if (bTree == null) {
                throw new RuntimeException("Illegal code");
            }
            value = bTree.getValue();
        } while (value == null);
        trace(str, value.toString());
        return value;
    }

    public int readME(String str) {
        return readUE(str);
    }

    public long readNBit(int i, String str) {
        long readNBit = readNBit(i);
        trace(str, String.valueOf(readNBit));
        return readNBit;
    }

    public int readSE(String str) {
        int readUE = readUE();
        int i = readUE & 1;
        readUE = ((readUE >> 1) + i) * ((i << 1) - 1);
        trace(str, String.valueOf(readUE));
        return readUE;
    }

    public int readTE(int i) {
        return i > 1 ? readUE() : (read1Bit() ^ -1) & 1;
    }

    public void readTrailingBits() {
        read1Bit();
        readRemainingByte();
    }

    public int readU(int i, String str) {
        return (int) readNBit(i, str);
    }

    public int readUE(String str) {
        int readUE = readUE();
        trace(str, String.valueOf(readUE));
        return readUE;
    }

    public int readZeroBitCount(String str) {
        int i = 0;
        while (read1Bit() == 0) {
            i++;
        }
        trace(str, String.valueOf(i));
        return i;
    }
}
