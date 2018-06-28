package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;

@Descriptor(tags = {6})
public class SLConfigDescriptor extends BaseDescriptor {
    int predefined;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.predefined == ((SLConfigDescriptor) obj).predefined;
    }

    public int getPredefined() {
        return this.predefined;
    }

    public int hashCode() {
        return this.predefined;
    }

    public void parseDetail(ByteBuffer byteBuffer) {
        this.predefined = IsoTypeReader.readUInt8(byteBuffer);
    }

    public ByteBuffer serialize() {
        ByteBuffer allocate = ByteBuffer.allocate(3);
        IsoTypeWriter.writeUInt8(allocate, 6);
        IsoTypeWriter.writeUInt8(allocate, 1);
        IsoTypeWriter.writeUInt8(allocate, this.predefined);
        return allocate;
    }

    public int serializedSize() {
        return 3;
    }

    public void setPredefined(int i) {
        this.predefined = i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SLConfigDescriptor");
        stringBuilder.append("{predefined=");
        stringBuilder.append(this.predefined);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
