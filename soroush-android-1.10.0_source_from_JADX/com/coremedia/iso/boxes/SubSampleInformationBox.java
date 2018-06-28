package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class SubSampleInformationBox extends AbstractFullBox {
    public static final String TYPE = "subs";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private List<SubSampleEntry> entries = new ArrayList();

    public static class SubSampleEntry {
        private long sampleDelta;
        private List<SubsampleEntry> subsampleEntries = new ArrayList();

        public static class SubsampleEntry {
            private int discardable;
            private long reserved;
            private int subsamplePriority;
            private long subsampleSize;

            public int getDiscardable() {
                return this.discardable;
            }

            public long getReserved() {
                return this.reserved;
            }

            public int getSubsamplePriority() {
                return this.subsamplePriority;
            }

            public long getSubsampleSize() {
                return this.subsampleSize;
            }

            public void setDiscardable(int i) {
                this.discardable = i;
            }

            public void setReserved(long j) {
                this.reserved = j;
            }

            public void setSubsamplePriority(int i) {
                this.subsamplePriority = i;
            }

            public void setSubsampleSize(long j) {
                this.subsampleSize = j;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder("SubsampleEntry{subsampleSize=");
                stringBuilder.append(this.subsampleSize);
                stringBuilder.append(", subsamplePriority=");
                stringBuilder.append(this.subsamplePriority);
                stringBuilder.append(", discardable=");
                stringBuilder.append(this.discardable);
                stringBuilder.append(", reserved=");
                stringBuilder.append(this.reserved);
                stringBuilder.append('}');
                return stringBuilder.toString();
            }
        }

        public long getSampleDelta() {
            return this.sampleDelta;
        }

        public int getSubsampleCount() {
            return this.subsampleEntries.size();
        }

        public List<SubsampleEntry> getSubsampleEntries() {
            return this.subsampleEntries;
        }

        public void setSampleDelta(long j) {
            this.sampleDelta = j;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("SampleEntry{sampleDelta=");
            stringBuilder.append(this.sampleDelta);
            stringBuilder.append(", subsampleCount=");
            stringBuilder.append(this.subsampleEntries.size());
            stringBuilder.append(", subsampleEntries=");
            stringBuilder.append(this.subsampleEntries);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public SubSampleInformationBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("SubSampleInformationBox.java", SubSampleInformationBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.util.List"), 50);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "java.util.List", "entries", "", "void"), 54);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.lang.String"), 124);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        long readUInt32 = IsoTypeReader.readUInt32(byteBuffer);
        for (int i = 0; ((long) i) < readUInt32; i++) {
            SubSampleEntry subSampleEntry = new SubSampleEntry();
            subSampleEntry.setSampleDelta(IsoTypeReader.readUInt32(byteBuffer));
            int readUInt16 = IsoTypeReader.readUInt16(byteBuffer);
            for (int i2 = 0; i2 < readUInt16; i2++) {
                SubsampleEntry subsampleEntry = new SubsampleEntry();
                subsampleEntry.setSubsampleSize(getVersion() == 1 ? IsoTypeReader.readUInt32(byteBuffer) : (long) IsoTypeReader.readUInt16(byteBuffer));
                subsampleEntry.setSubsamplePriority(IsoTypeReader.readUInt8(byteBuffer));
                subsampleEntry.setDiscardable(IsoTypeReader.readUInt8(byteBuffer));
                subsampleEntry.setReserved(IsoTypeReader.readUInt32(byteBuffer));
                subSampleEntry.getSubsampleEntries().add(subsampleEntry);
            }
            this.entries.add(subSampleEntry);
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.entries.size());
        for (SubSampleEntry subSampleEntry : this.entries) {
            IsoTypeWriter.writeUInt32(byteBuffer, subSampleEntry.getSampleDelta());
            IsoTypeWriter.writeUInt16(byteBuffer, subSampleEntry.getSubsampleCount());
            for (SubsampleEntry subsampleEntry : subSampleEntry.getSubsampleEntries()) {
                if (getVersion() == 1) {
                    IsoTypeWriter.writeUInt32(byteBuffer, subsampleEntry.getSubsampleSize());
                } else {
                    IsoTypeWriter.writeUInt16(byteBuffer, CastUtils.l2i(subsampleEntry.getSubsampleSize()));
                }
                IsoTypeWriter.writeUInt8(byteBuffer, subsampleEntry.getSubsamplePriority());
                IsoTypeWriter.writeUInt8(byteBuffer, subsampleEntry.getDiscardable());
                IsoTypeWriter.writeUInt32(byteBuffer, subsampleEntry.getReserved());
            }
        }
    }

    protected long getContentSize() {
        long j = 8;
        for (SubSampleEntry subsampleEntries : this.entries) {
            long j2 = (j + 4) + 2;
            int i = 0;
            while (i < subsampleEntries.getSubsampleEntries().size()) {
                i++;
                j2 = ((getVersion() == 1 ? j2 + 4 : j2 + 2) + 2) + 4;
            }
            j = j2;
        }
        return j;
    }

    public List<SubSampleEntry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.entries;
    }

    public void setEntries(List<SubSampleEntry> list) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) list));
        this.entries = list;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("SubSampleInformationBox{entryCount=");
        stringBuilder.append(this.entries.size());
        stringBuilder.append(", entries=");
        stringBuilder.append(this.entries);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
