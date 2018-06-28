package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeReaderVariable;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeWriterVariable;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class TrackFragmentRandomAccessBox extends AbstractFullBox {
    public static final String TYPE = "tfra";
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
    private List<Entry> entries = Collections.emptyList();
    private int lengthSizeOfSampleNum = 2;
    private int lengthSizeOfTrafNum = 2;
    private int lengthSizeOfTrunNum = 2;
    private int reserved;
    private long trackId;

    public static class Entry {
        private long moofOffset;
        private long sampleNumber;
        private long time;
        private long trafNumber;
        private long trunNumber;

        public Entry(long j, long j2, long j3, long j4, long j5) {
            this.moofOffset = j2;
            this.sampleNumber = j5;
            this.time = j;
            this.trafNumber = j3;
            this.trunNumber = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.moofOffset == entry.moofOffset && this.sampleNumber == entry.sampleNumber && this.time == entry.time && this.trafNumber == entry.trafNumber && this.trunNumber == entry.trunNumber;
        }

        public long getMoofOffset() {
            return this.moofOffset;
        }

        public long getSampleNumber() {
            return this.sampleNumber;
        }

        public long getTime() {
            return this.time;
        }

        public long getTrafNumber() {
            return this.trafNumber;
        }

        public long getTrunNumber() {
            return this.trunNumber;
        }

        public int hashCode() {
            return (31 * ((((((((int) (this.time ^ (this.time >>> 32))) * 31) + ((int) (this.moofOffset ^ (this.moofOffset >>> 32)))) * 31) + ((int) (this.trafNumber ^ (this.trafNumber >>> 32)))) * 31) + ((int) (this.trunNumber ^ (this.trunNumber >>> 32))))) + ((int) (this.sampleNumber ^ (this.sampleNumber >>> 32)));
        }

        public void setMoofOffset(long j) {
            this.moofOffset = j;
        }

        public void setSampleNumber(long j) {
            this.sampleNumber = j;
        }

        public void setTime(long j) {
            this.time = j;
        }

        public void setTrafNumber(long j) {
            this.trafNumber = j;
        }

        public void setTrunNumber(long j) {
            this.trunNumber = j;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Entry{time=");
            stringBuilder.append(this.time);
            stringBuilder.append(", moofOffset=");
            stringBuilder.append(this.moofOffset);
            stringBuilder.append(", trafNumber=");
            stringBuilder.append(this.trafNumber);
            stringBuilder.append(", trunNumber=");
            stringBuilder.append(this.trunNumber);
            stringBuilder.append(", sampleNumber=");
            stringBuilder.append(this.sampleNumber);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public TrackFragmentRandomAccessBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("TrackFragmentRandomAccessBox.java", TrackFragmentRandomAccessBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "long", "trackId", "", "void"), 145);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrafNum", "", "void"), 149);
        ajc$tjp_10 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.util.List"), 185);
        ajc$tjp_11 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "java.util.List", "entries", "", "void"), 189);
        ajc$tjp_12 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.lang.String"), 290);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrunNum", "", "void"), 153);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfSampleNum", "", "void"), 157);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "long"), 161);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getReserved", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 165);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 169);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 173);
        ajc$tjp_8 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 177);
        ajc$tjp_9 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getNumberOfEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "long"), 181);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.trackId = IsoTypeReader.readUInt32(byteBuffer);
        long readUInt32 = IsoTypeReader.readUInt32(byteBuffer);
        this.reserved = (int) (readUInt32 >> 6);
        this.lengthSizeOfTrafNum = (((int) (readUInt32 & 63)) >> 4) + 1;
        this.lengthSizeOfTrunNum = (((int) (readUInt32 & 12)) >> 2) + 1;
        this.lengthSizeOfSampleNum = ((int) (readUInt32 & 3)) + 1;
        readUInt32 = IsoTypeReader.readUInt32(byteBuffer);
        this.entries = new ArrayList();
        for (int i = 0; ((long) i) < readUInt32; i++) {
            long readUInt64;
            Entry entry = new Entry();
            if (getVersion() == 1) {
                entry.time = IsoTypeReader.readUInt64(byteBuffer);
                readUInt64 = IsoTypeReader.readUInt64(byteBuffer);
            } else {
                entry.time = IsoTypeReader.readUInt32(byteBuffer);
                readUInt64 = IsoTypeReader.readUInt32(byteBuffer);
            }
            entry.moofOffset = readUInt64;
            entry.trafNumber = IsoTypeReaderVariable.read(byteBuffer, this.lengthSizeOfTrafNum);
            entry.trunNumber = IsoTypeReaderVariable.read(byteBuffer, this.lengthSizeOfTrunNum);
            entry.sampleNumber = IsoTypeReaderVariable.read(byteBuffer, this.lengthSizeOfSampleNum);
            this.entries.add(entry);
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.trackId);
        IsoTypeWriter.writeUInt32(byteBuffer, ((((long) (this.reserved << 6)) | ((long) (((this.lengthSizeOfTrafNum - 1) & 3) << 4))) | ((long) (((this.lengthSizeOfTrunNum - 1) & 3) << 2))) | ((long) ((this.lengthSizeOfSampleNum - 1) & 3)));
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.entries.size());
        for (Entry entry : this.entries) {
            if (getVersion() == 1) {
                IsoTypeWriter.writeUInt64(byteBuffer, entry.time);
                IsoTypeWriter.writeUInt64(byteBuffer, entry.moofOffset);
            } else {
                IsoTypeWriter.writeUInt32(byteBuffer, entry.time);
                IsoTypeWriter.writeUInt32(byteBuffer, entry.moofOffset);
            }
            IsoTypeWriterVariable.write(entry.trafNumber, byteBuffer, this.lengthSizeOfTrafNum);
            IsoTypeWriterVariable.write(entry.trunNumber, byteBuffer, this.lengthSizeOfTrunNum);
            IsoTypeWriterVariable.write(entry.sampleNumber, byteBuffer, this.lengthSizeOfSampleNum);
        }
    }

    protected long getContentSize() {
        return (((16 + ((long) ((getVersion() == 1 ? 16 : 8) * this.entries.size()))) + ((long) (this.lengthSizeOfTrafNum * this.entries.size()))) + ((long) (this.lengthSizeOfTrunNum * this.entries.size()))) + ((long) (this.lengthSizeOfSampleNum * this.entries.size()));
    }

    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_10, (Object) this, (Object) this));
        return Collections.unmodifiableList(this.entries);
    }

    public int getLengthSizeOfSampleNum() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_8, (Object) this, (Object) this));
        return this.lengthSizeOfSampleNum;
    }

    public int getLengthSizeOfTrafNum() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        return this.lengthSizeOfTrafNum;
    }

    public int getLengthSizeOfTrunNum() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_7, (Object) this, (Object) this));
        return this.lengthSizeOfTrunNum;
    }

    public long getNumberOfEntries() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_9, (Object) this, (Object) this));
        return (long) this.entries.size();
    }

    public int getReserved() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_5, (Object) this, (Object) this));
        return this.reserved;
    }

    public long getTrackId() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.trackId;
    }

    public void setEntries(List<Entry> list) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_11, (Object) this, (Object) this, (Object) list));
        this.entries = list;
    }

    public void setLengthSizeOfSampleNum(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.lengthSizeOfSampleNum = i;
    }

    public void setLengthSizeOfTrafNum(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.lengthSizeOfTrafNum = i;
    }

    public void setLengthSizeOfTrunNum(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_2, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.lengthSizeOfTrunNum = i;
    }

    public void setTrackId(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_0, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.trackId = j;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_12, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("TrackFragmentRandomAccessBox{trackId=");
        stringBuilder.append(this.trackId);
        stringBuilder.append(", entries=");
        stringBuilder.append(this.entries);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
