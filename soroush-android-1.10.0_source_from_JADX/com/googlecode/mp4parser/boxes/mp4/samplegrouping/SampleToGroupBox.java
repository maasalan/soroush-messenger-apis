package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class SampleToGroupBox extends AbstractFullBox {
    public static final String TYPE = "sbgp";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    List<Entry> entries = new LinkedList();
    private String groupingType;
    private String groupingTypeParameter;

    public static class Entry {
        private int groupDescriptionIndex;
        private long sampleCount;

        public Entry(long j, int i) {
            this.sampleCount = j;
            this.groupDescriptionIndex = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.groupDescriptionIndex == entry.groupDescriptionIndex && this.sampleCount == entry.sampleCount;
        }

        public int getGroupDescriptionIndex() {
            return this.groupDescriptionIndex;
        }

        public long getSampleCount() {
            return this.sampleCount;
        }

        public int hashCode() {
            return (31 * ((int) (this.sampleCount ^ (this.sampleCount >>> 32)))) + this.groupDescriptionIndex;
        }

        public void setGroupDescriptionIndex(int i) {
            this.groupDescriptionIndex = i;
        }

        public void setSampleCount(long j) {
            this.sampleCount = j;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Entry{sampleCount=");
            stringBuilder.append(this.sampleCount);
            stringBuilder.append(", groupDescriptionIndex=");
            stringBuilder.append(this.groupDescriptionIndex);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public SampleToGroupBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("SampleToGroupBox.java", SampleToGroupBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.lang.String"), 150);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingType", "", "void"), 154);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getGroupingTypeParameter", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.lang.String"), 158);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setGroupingTypeParameter", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingTypeParameter", "", "void"), 162);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.util.List"), 166);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.util.List", "entries", "", "void"), 170);
    }

    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.groupingType = IsoTypeReader.read4cc(byteBuffer);
        if (getVersion() == 1) {
            this.groupingTypeParameter = IsoTypeReader.read4cc(byteBuffer);
        }
        long readUInt32 = IsoTypeReader.readUInt32(byteBuffer);
        while (true) {
            long j = readUInt32 - 1;
            if (readUInt32 > 0) {
                this.entries.add(new Entry((long) CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer)), CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer))));
                readUInt32 = j;
            } else {
                return;
            }
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(this.groupingType.getBytes());
        if (getVersion() == 1) {
            byteBuffer.put(this.groupingTypeParameter.getBytes());
        }
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.entries.size());
        for (Entry entry : this.entries) {
            IsoTypeWriter.writeUInt32(byteBuffer, entry.getSampleCount());
            IsoTypeWriter.writeUInt32(byteBuffer, (long) entry.getGroupDescriptionIndex());
        }
    }

    protected long getContentSize() {
        return (long) (getVersion() == 1 ? (this.entries.size() * 8) + 16 : (this.entries.size() * 8) + 12);
    }

    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.entries;
    }

    public String getGroupingType() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.groupingType;
    }

    public String getGroupingTypeParameter() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.groupingTypeParameter;
    }

    public void setEntries(List<Entry> list) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, (Object) list));
        this.entries = list;
    }

    public void setGroupingType(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.groupingType = str;
    }

    public void setGroupingTypeParameter(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        this.groupingTypeParameter = str;
    }
}
