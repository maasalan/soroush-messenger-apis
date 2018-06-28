package com.coremedia.iso;

import java.nio.ByteBuffer;

public final class IsoTypeWriterVariable {
    public static void write(long j, ByteBuffer byteBuffer, int i) {
        if (i != 8) {
            switch (i) {
                case 1:
                    IsoTypeWriter.writeUInt8(byteBuffer, (int) (j & 255));
                    return;
                case 2:
                    IsoTypeWriter.writeUInt16(byteBuffer, (int) (j & 65535));
                    return;
                case 3:
                    IsoTypeWriter.writeUInt24(byteBuffer, (int) (j & 16777215));
                    return;
                case 4:
                    IsoTypeWriter.writeUInt32(byteBuffer, j);
                    return;
                default:
                    StringBuilder stringBuilder = new StringBuilder("I don't know how to read ");
                    stringBuilder.append(i);
                    stringBuilder.append(" bytes");
                    throw new RuntimeException(stringBuilder.toString());
            }
        }
        IsoTypeWriter.writeUInt64(byteBuffer, j);
    }
}
