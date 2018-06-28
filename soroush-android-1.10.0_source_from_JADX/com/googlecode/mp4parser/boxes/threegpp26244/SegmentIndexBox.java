package com.googlecode.mp4parser.boxes.threegpp26244;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class SegmentIndexBox extends AbstractFullBox {
    public static final String TYPE = "sidx";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_10 = null;
    private static final C7000a ajc$tjp_11 = null;
    private static final C7000a ajc$tjp_12 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    private static final C7000a ajc$tjp_8 = null;
    private static final C7000a ajc$tjp_9 = null;
    long earliestPresentationTime;
    List<Entry> entries = new ArrayList();
    long firstOffset;
    long referenceId;
    int reserved;
    long timeScale;

    public static class Entry {
        byte referenceType;
        int referencedSize;
        int sapDeltaTime;
        byte sapType;
        byte startsWithSap;
        long subsegmentDuration;

        public Entry(int i, int i2, long j, boolean z, int i3, int i4) {
            this.referenceType = (byte) i;
            this.referencedSize = i2;
            this.subsegmentDuration = j;
            this.startsWithSap = (byte) z;
            this.sapType = (byte) i3;
            this.sapDeltaTime = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.referenceType == entry.referenceType && this.referencedSize == entry.referencedSize && this.sapDeltaTime == entry.sapDeltaTime && this.sapType == entry.sapType && this.startsWithSap == entry.startsWithSap && this.subsegmentDuration == entry.subsegmentDuration;
        }

        public byte getReferenceType() {
            return this.referenceType;
        }

        public int getReferencedSize() {
            return this.referencedSize;
        }

        public int getSapDeltaTime() {
            return this.sapDeltaTime;
        }

        public byte getSapType() {
            return this.sapType;
        }

        public byte getStartsWithSap() {
            return this.startsWithSap;
        }

        public long getSubsegmentDuration() {
            return this.subsegmentDuration;
        }

        public int hashCode() {
            return (31 * ((((((((this.referenceType * 31) + this.referencedSize) * 31) + ((int) (this.subsegmentDuration ^ (this.subsegmentDuration >>> 32)))) * 31) + this.startsWithSap) * 31) + this.sapType)) + this.sapDeltaTime;
        }

        public void setReferenceType(byte b) {
            this.referenceType = b;
        }

        public void setReferencedSize(int i) {
            this.referencedSize = i;
        }

        public void setSapDeltaTime(int i) {
            this.sapDeltaTime = i;
        }

        public void setSapType(byte b) {
            this.sapType = b;
        }

        public void setStartsWithSap(byte b) {
            this.startsWithSap = b;
        }

        public void setSubsegmentDuration(long j) {
            this.subsegmentDuration = j;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Entry{referenceType=");
            stringBuilder.append(this.referenceType);
            stringBuilder.append(", referencedSize=");
            stringBuilder.append(this.referencedSize);
            stringBuilder.append(", subsegmentDuration=");
            stringBuilder.append(this.subsegmentDuration);
            stringBuilder.append(", startsWithSap=");
            stringBuilder.append(this.startsWithSap);
            stringBuilder.append(", sapType=");
            stringBuilder.append(this.sapType);
            stringBuilder.append(", sapDeltaTime=");
            stringBuilder.append(this.sapDeltaTime);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public SegmentIndexBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("SegmentIndexBox.java", SegmentIndexBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getEntries", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "java.util.List"), 128);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setEntries", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "java.util.List", "entries", "", "void"), 132);
        ajc$tjp_10 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getReserved", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "int"), 168);
        ajc$tjp_11 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setReserved", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "int", "reserved", "", "void"), 172);
        ajc$tjp_12 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "java.lang.String"), 298);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getReferenceId", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"), 136);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setReferenceId", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "referenceId", "", "void"), 140);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getTimeScale", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"), (int) IjkMediaMeta.FF_PROFILE_H264_HIGH_444);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setTimeScale", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "timeScale", "", "void"), 148);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getEarliestPresentationTime", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"), 152);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setEarliestPresentationTime", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "earliestPresentationTime", "", "void"), 156);
        ajc$tjp_8 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getFirstOffset", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"), 160);
        ajc$tjp_9 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setFirstOffset", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "firstOffset", "", "void"), 164);
    }

    protected void _parseDetails(ByteBuffer byteBuffer) {
        long readUInt32;
        parseVersionAndFlags(byteBuffer);
        this.referenceId = IsoTypeReader.readUInt32(byteBuffer);
        this.timeScale = IsoTypeReader.readUInt32(byteBuffer);
        if (getVersion() == 0) {
            this.earliestPresentationTime = IsoTypeReader.readUInt32(byteBuffer);
            readUInt32 = IsoTypeReader.readUInt32(byteBuffer);
        } else {
            this.earliestPresentationTime = IsoTypeReader.readUInt64(byteBuffer);
            readUInt32 = IsoTypeReader.readUInt64(byteBuffer);
        }
        this.firstOffset = readUInt32;
        this.reserved = IsoTypeReader.readUInt16(byteBuffer);
        int readUInt16 = IsoTypeReader.readUInt16(byteBuffer);
        for (int i = 0; i < readUInt16; i++) {
            BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBuffer);
            Entry entry = new Entry();
            entry.setReferenceType((byte) bitReaderBuffer.readBits(1));
            entry.setReferencedSize(bitReaderBuffer.readBits(31));
            entry.setSubsegmentDuration(IsoTypeReader.readUInt32(byteBuffer));
            bitReaderBuffer = new BitReaderBuffer(byteBuffer);
            entry.setStartsWithSap((byte) bitReaderBuffer.readBits(1));
            entry.setSapType((byte) bitReaderBuffer.readBits(3));
            entry.setSapDeltaTime(bitReaderBuffer.readBits(28));
            this.entries.add(entry);
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.referenceId);
        IsoTypeWriter.writeUInt32(byteBuffer, this.timeScale);
        if (getVersion() == 0) {
            IsoTypeWriter.writeUInt32(byteBuffer, this.earliestPresentationTime);
            IsoTypeWriter.writeUInt32(byteBuffer, this.firstOffset);
        } else {
            IsoTypeWriter.writeUInt64(byteBuffer, this.earliestPresentationTime);
            IsoTypeWriter.writeUInt64(byteBuffer, this.firstOffset);
        }
        IsoTypeWriter.writeUInt16(byteBuffer, this.reserved);
        IsoTypeWriter.writeUInt16(byteBuffer, this.entries.size());
        for (Entry entry : this.entries) {
            BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
            bitWriterBuffer.writeBits(entry.getReferenceType(), 1);
            bitWriterBuffer.writeBits(entry.getReferencedSize(), 31);
            IsoTypeWriter.writeUInt32(byteBuffer, entry.getSubsegmentDuration());
            bitWriterBuffer = new BitWriterBuffer(byteBuffer);
            bitWriterBuffer.writeBits(entry.getStartsWithSap(), 1);
            bitWriterBuffer.writeBits(entry.getSapType(), 3);
            bitWriterBuffer.writeBits(entry.getSapDeltaTime(), 28);
        }
    }

    protected long getContentSize() {
        return (((12 + ((long) (getVersion() == 0 ? 8 : 16))) + 2) + 2) + ((long) (this.entries.size() * 12));
    }

    public long getEarliestPresentationTime() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        return this.earliestPresentationTime;
    }

    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.entries;
    }

    public long getFirstOffset() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_8, (Object) this, (Object) this));
        return this.firstOffset;
    }

    public long getReferenceId() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.referenceId;
    }

    public int getReserved() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_10, (Object) this, (Object) this));
        return this.reserved;
    }

    public long getTimeScale() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.timeScale;
    }

    public void setEarliestPresentationTime(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_7, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.earliestPresentationTime = j;
    }

    public void setEntries(List<Entry> list) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) list));
        this.entries = list;
    }

    public void setFirstOffset(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_9, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.firstOffset = j;
    }

    public void setReferenceId(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.referenceId = j;
    }

    public void setReserved(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_11, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.reserved = i;
    }

    public void setTimeScale(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.timeScale = j;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_12, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("SegmentIndexBox{entries=");
        stringBuilder.append(this.entries);
        stringBuilder.append(", referenceId=");
        stringBuilder.append(this.referenceId);
        stringBuilder.append(", timeScale=");
        stringBuilder.append(this.timeScale);
        stringBuilder.append(", earliestPresentationTime=");
        stringBuilder.append(this.earliestPresentationTime);
        stringBuilder.append(", firstOffset=");
        stringBuilder.append(this.firstOffset);
        stringBuilder.append(", reserved=");
        stringBuilder.append(this.reserved);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
