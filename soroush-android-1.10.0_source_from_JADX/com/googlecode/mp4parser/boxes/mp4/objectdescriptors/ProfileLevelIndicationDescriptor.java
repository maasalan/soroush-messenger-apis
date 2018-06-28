package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;

@Descriptor(tags = {20})
public class ProfileLevelIndicationDescriptor extends BaseDescriptor {
    int profileLevelIndicationIndex;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.profileLevelIndicationIndex == ((ProfileLevelIndicationDescriptor) obj).profileLevelIndicationIndex;
    }

    public int hashCode() {
        return this.profileLevelIndicationIndex;
    }

    public void parseDetail(ByteBuffer byteBuffer) {
        this.profileLevelIndicationIndex = IsoTypeReader.readUInt8(byteBuffer);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileLevelIndicationDescriptor");
        stringBuilder.append("{profileLevelIndicationIndex=");
        stringBuilder.append(Integer.toHexString(this.profileLevelIndicationIndex));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
