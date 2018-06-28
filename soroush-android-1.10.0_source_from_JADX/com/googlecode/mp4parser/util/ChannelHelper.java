package com.googlecode.mp4parser.util;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

public class ChannelHelper {
    private static ByteBuffer empty = ByteBuffer.allocate(0).asReadOnlyBuffer();

    public static int readFully(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, int i) {
        int i2 = 0;
        while (true) {
            int read = readableByteChannel.read(byteBuffer);
            if (-1 != read) {
                i2 += read;
                if (i2 == i) {
                    break;
                }
            } else {
                break;
            }
        }
        if (read != -1) {
            return i2;
        }
        throw new EOFException("End of file. No more boxes.");
    }

    public static void readFully(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) {
        readFully(readableByteChannel, byteBuffer, byteBuffer.remaining());
    }
}
