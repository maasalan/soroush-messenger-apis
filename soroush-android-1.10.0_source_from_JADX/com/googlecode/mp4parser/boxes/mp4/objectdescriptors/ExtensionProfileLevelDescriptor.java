package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.Hex;
import java.nio.ByteBuffer;

@Descriptor(tags = {19})
public class ExtensionProfileLevelDescriptor extends BaseDescriptor {
    byte[] bytes;

    public void parseDetail(ByteBuffer byteBuffer) {
        if (getSize() > 0) {
            this.bytes = new byte[getSize()];
            byteBuffer.get(this.bytes);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ExtensionDescriptor");
        stringBuilder.append("{bytes=");
        stringBuilder.append(this.bytes == null ? "null" : Hex.encodeHex(this.bytes));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
