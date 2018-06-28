package com.p149g.p150a.p151b;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import java.nio.ByteBuffer;

public final class C5399f extends GroupEntry {
    int f15025a;
    int f15026b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5399f c5399f = (C5399f) obj;
        return this.f15026b == c5399f.f15026b && this.f15025a == c5399f.f15025a;
    }

    public final ByteBuffer get() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        IsoTypeWriter.writeUInt8(allocate, this.f15026b + (this.f15025a << 6));
        return (ByteBuffer) allocate.rewind();
    }

    public final String getType() {
        return "sync";
    }

    public final int hashCode() {
        return (31 * this.f15025a) + this.f15026b;
    }

    public final void parse(ByteBuffer byteBuffer) {
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.f15025a = (readUInt8 & 192) >> 6;
        this.f15026b = readUInt8 & 63;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SyncSampleEntry{reserved=");
        stringBuilder.append(this.f15025a);
        stringBuilder.append(", nalUnitType=");
        stringBuilder.append(this.f15026b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
