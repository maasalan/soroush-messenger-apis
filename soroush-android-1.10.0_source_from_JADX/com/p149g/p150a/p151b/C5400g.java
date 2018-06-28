package com.p149g.p150a.p151b;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import java.nio.ByteBuffer;

public final class C5400g extends GroupEntry {
    int f15027a;
    int f15028b;
    boolean f15029c;
    int f15030d;
    long f15031e;
    long f15032f;
    int f15033g;
    int f15034h;
    int f15035i;
    int f15036j;
    int f15037k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5400g c5400g = (C5400g) obj;
        return this.f15027a == c5400g.f15027a && this.f15035i == c5400g.f15035i && this.f15037k == c5400g.f15037k && this.f15036j == c5400g.f15036j && this.f15034h == c5400g.f15034h && this.f15032f == c5400g.f15032f && this.f15033g == c5400g.f15033g && this.f15031e == c5400g.f15031e && this.f15030d == c5400g.f15030d && this.f15028b == c5400g.f15028b && this.f15029c == c5400g.f15029c;
    }

    public final ByteBuffer get() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        IsoTypeWriter.writeUInt8(allocate, this.f15027a);
        IsoTypeWriter.writeUInt8(allocate, ((this.f15028b << 6) + (this.f15029c ? 32 : 0)) + this.f15030d);
        IsoTypeWriter.writeUInt32(allocate, this.f15031e);
        IsoTypeWriter.writeUInt48(allocate, this.f15032f);
        IsoTypeWriter.writeUInt8(allocate, this.f15033g);
        IsoTypeWriter.writeUInt16(allocate, this.f15034h);
        IsoTypeWriter.writeUInt16(allocate, this.f15035i);
        IsoTypeWriter.writeUInt8(allocate, this.f15036j);
        IsoTypeWriter.writeUInt16(allocate, this.f15037k);
        return (ByteBuffer) allocate.rewind();
    }

    public final String getType() {
        return "tscl";
    }

    public final int hashCode() {
        return (31 * ((((((((((((((((((this.f15027a * 31) + this.f15028b) * 31) + this.f15029c) * 31) + this.f15030d) * 31) + ((int) (this.f15031e ^ (this.f15031e >>> 32)))) * 31) + ((int) (this.f15032f ^ (this.f15032f >>> 32)))) * 31) + this.f15033g) * 31) + this.f15034h) * 31) + this.f15035i) * 31) + this.f15036j)) + this.f15037k;
    }

    public final void parse(ByteBuffer byteBuffer) {
        this.f15027a = IsoTypeReader.readUInt8(byteBuffer);
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.f15028b = (readUInt8 & 192) >> 6;
        this.f15029c = (readUInt8 & 32) > 0;
        this.f15030d = readUInt8 & 31;
        this.f15031e = IsoTypeReader.readUInt32(byteBuffer);
        this.f15032f = IsoTypeReader.readUInt48(byteBuffer);
        this.f15033g = IsoTypeReader.readUInt8(byteBuffer);
        this.f15034h = IsoTypeReader.readUInt16(byteBuffer);
        this.f15035i = IsoTypeReader.readUInt16(byteBuffer);
        this.f15036j = IsoTypeReader.readUInt8(byteBuffer);
        this.f15037k = IsoTypeReader.readUInt16(byteBuffer);
    }

    public final int size() {
        return 20;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TemporalLayerSampleGroup{temporalLayerId=");
        stringBuilder.append(this.f15027a);
        stringBuilder.append(", tlprofile_space=");
        stringBuilder.append(this.f15028b);
        stringBuilder.append(", tltier_flag=");
        stringBuilder.append(this.f15029c);
        stringBuilder.append(", tlprofile_idc=");
        stringBuilder.append(this.f15030d);
        stringBuilder.append(", tlprofile_compatibility_flags=");
        stringBuilder.append(this.f15031e);
        stringBuilder.append(", tlconstraint_indicator_flags=");
        stringBuilder.append(this.f15032f);
        stringBuilder.append(", tllevel_idc=");
        stringBuilder.append(this.f15033g);
        stringBuilder.append(", tlMaxBitRate=");
        stringBuilder.append(this.f15034h);
        stringBuilder.append(", tlAvgBitRate=");
        stringBuilder.append(this.f15035i);
        stringBuilder.append(", tlConstantFrameRate=");
        stringBuilder.append(this.f15036j);
        stringBuilder.append(", tlAvgFrameRate=");
        stringBuilder.append(this.f15037k);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
