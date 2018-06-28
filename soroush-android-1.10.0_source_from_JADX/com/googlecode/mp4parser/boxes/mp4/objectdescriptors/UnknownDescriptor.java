package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.nio.ByteBuffer;
import java.util.logging.Logger;

public class UnknownDescriptor extends BaseDescriptor {
    private static Logger log = Logger.getLogger(UnknownDescriptor.class.getName());
    private ByteBuffer data;

    public void parseDetail(ByteBuffer byteBuffer) {
        this.data = (ByteBuffer) byteBuffer.slice().limit(getSizeOfInstance());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UnknownDescriptor");
        stringBuilder.append("{tag=");
        stringBuilder.append(this.tag);
        stringBuilder.append(", sizeOfInstance=");
        stringBuilder.append(this.sizeOfInstance);
        stringBuilder.append(", data=");
        stringBuilder.append(this.data);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
