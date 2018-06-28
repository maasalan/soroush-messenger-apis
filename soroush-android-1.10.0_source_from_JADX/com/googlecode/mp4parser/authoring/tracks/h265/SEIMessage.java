package com.googlecode.mp4parser.authoring.tracks.h265;

import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import java.io.PrintStream;

public class SEIMessage {
    public SEIMessage(BitReaderBuffer bitReaderBuffer) {
        int i = 0;
        while (((long) bitReaderBuffer.readBits(8)) == 255) {
            i += 255;
        }
        int readBits = bitReaderBuffer.readBits(8) + i;
        do {
        } while (((long) bitReaderBuffer.readBits(8)) == 255);
        bitReaderBuffer.readBits(8);
        PrintStream printStream = System.err;
        StringBuilder stringBuilder = new StringBuilder("payloadType ");
        stringBuilder.append(readBits);
        printStream.println(stringBuilder.toString());
    }
}
