package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;

public class VisualRandomAccessEntry extends GroupEntry {
    public static final String TYPE = "rap ";
    private short numLeadingSamples;
    private boolean numLeadingSamplesKnown;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VisualRandomAccessEntry visualRandomAccessEntry = (VisualRandomAccessEntry) obj;
        return this.numLeadingSamples == visualRandomAccessEntry.numLeadingSamples && this.numLeadingSamplesKnown == visualRandomAccessEntry.numLeadingSamplesKnown;
    }

    public ByteBuffer get() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) ((this.numLeadingSamplesKnown ? 128 : 0) | (this.numLeadingSamples & 127)));
        allocate.rewind();
        return allocate;
    }

    public short getNumLeadingSamples() {
        return this.numLeadingSamples;
    }

    public String getType() {
        return TYPE;
    }

    public int hashCode() {
        return (31 * this.numLeadingSamplesKnown) + this.numLeadingSamples;
    }

    public boolean isNumLeadingSamplesKnown() {
        return this.numLeadingSamplesKnown;
    }

    public void parse(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        this.numLeadingSamplesKnown = (b & 128) == 128;
        this.numLeadingSamples = (short) (b & 127);
    }

    public void setNumLeadingSamples(short s) {
        this.numLeadingSamples = s;
    }

    public void setNumLeadingSamplesKnown(boolean z) {
        this.numLeadingSamplesKnown = z;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VisualRandomAccessEntry");
        stringBuilder.append("{numLeadingSamplesKnown=");
        stringBuilder.append(this.numLeadingSamplesKnown);
        stringBuilder.append(", numLeadingSamples=");
        stringBuilder.append(this.numLeadingSamples);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
