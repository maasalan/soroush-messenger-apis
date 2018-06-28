package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.coremedia.iso.Hex;
import java.nio.ByteBuffer;

public class UnknownEntry extends GroupEntry {
    private ByteBuffer content;
    private String type;

    public UnknownEntry(String str) {
        this.type = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnknownEntry unknownEntry = (UnknownEntry) obj;
        if (this.content != null) {
            if (!this.content.equals(unknownEntry.content)) {
                return false;
            }
        } else if (unknownEntry.content != null) {
            return false;
        }
        return true;
    }

    public ByteBuffer get() {
        return this.content.duplicate();
    }

    public ByteBuffer getContent() {
        return this.content;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.content != null ? this.content.hashCode() : 0;
    }

    public void parse(ByteBuffer byteBuffer) {
        this.content = (ByteBuffer) byteBuffer.duplicate().rewind();
    }

    public void setContent(ByteBuffer byteBuffer) {
        this.content = (ByteBuffer) byteBuffer.duplicate().rewind();
    }

    public String toString() {
        ByteBuffer duplicate = this.content.duplicate();
        duplicate.rewind();
        byte[] bArr = new byte[duplicate.limit()];
        duplicate.get(bArr);
        StringBuilder stringBuilder = new StringBuilder("UnknownEntry{content=");
        stringBuilder.append(Hex.encodeHex(bArr));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
