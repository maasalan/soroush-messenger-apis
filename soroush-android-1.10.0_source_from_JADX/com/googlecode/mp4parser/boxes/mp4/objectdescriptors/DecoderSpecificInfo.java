package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.Hex;
import java.nio.ByteBuffer;
import java.util.Arrays;

@Descriptor(tags = {5})
public class DecoderSpecificInfo extends BaseDescriptor {
    byte[] bytes;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.bytes, ((DecoderSpecificInfo) obj).bytes);
    }

    public int hashCode() {
        return this.bytes != null ? Arrays.hashCode(this.bytes) : 0;
    }

    public void parseDetail(ByteBuffer byteBuffer) {
        if (this.sizeOfInstance > 0) {
            this.bytes = new byte[this.sizeOfInstance];
            byteBuffer.get(this.bytes);
        }
    }

    public ByteBuffer serialize() {
        return ByteBuffer.wrap(this.bytes);
    }

    public int serializedSize() {
        return this.bytes.length;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DecoderSpecificInfo");
        stringBuilder.append("{bytes=");
        stringBuilder.append(this.bytes == null ? "null" : Hex.encodeHex(this.bytes));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
