package com.coremedia.iso;

import java.nio.ByteBuffer;

public final class IsoTypeReaderVariable {
    public static long read(ByteBuffer byteBuffer, int i) {
        if (i == 8) {
            return IsoTypeReader.readUInt64(byteBuffer);
        }
        int readUInt8;
        switch (i) {
            case 1:
                readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
                break;
            case 2:
                readUInt8 = IsoTypeReader.readUInt16(byteBuffer);
                break;
            case 3:
                readUInt8 = IsoTypeReader.readUInt24(byteBuffer);
                break;
            case 4:
                return IsoTypeReader.readUInt32(byteBuffer);
            default:
                StringBuilder stringBuilder = new StringBuilder("I don't know how to read ");
                stringBuilder.append(i);
                stringBuilder.append(" bytes");
                throw new RuntimeException(stringBuilder.toString());
        }
        return (long) readUInt8;
    }
}
