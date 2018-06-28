package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import com.p149g.p150a.p151b.C5398e;
import com.p149g.p150a.p151b.C5399f;
import com.p149g.p150a.p151b.C5400g;
import com.p149g.p150a.p151b.C5401h;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class SampleGroupDescriptionBox extends AbstractFullBox {
    public static final String TYPE = "sgpd";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private int defaultLength;
    private List<GroupEntry> groupEntries = new LinkedList();

    static {
        ajc$preClinit();
    }

    public SampleGroupDescriptionBox() {
        super(TYPE);
        setVersion(1);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("SampleGroupDescriptionBox.java", SampleGroupDescriptionBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDefaultLength", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"), 145);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDefaultLength", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "int", "defaultLength", "", "void"), 149);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getGroupEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.util.List"), 153);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setGroupEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.util.List", "groupEntries", "", "void"), 157);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "equals", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.lang.Object", "o", "", "boolean"), 162);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "hashCode", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"), 183);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"), 191);
    }

    private GroupEntry parseGroupEntry(ByteBuffer byteBuffer, String str) {
        GroupEntry rollRecoveryEntry = RollRecoveryEntry.TYPE.equals(str) ? new RollRecoveryEntry() : RateShareEntry.TYPE.equals(str) ? new RateShareEntry() : CencSampleEncryptionInformationGroupEntry.TYPE.equals(str) ? new CencSampleEncryptionInformationGroupEntry() : VisualRandomAccessEntry.TYPE.equals(str) ? new VisualRandomAccessEntry() : TemporalLevelEntry.TYPE.equals(str) ? new TemporalLevelEntry() : "sync".equals(str) ? new C5399f() : "tscl".equals(str) ? new C5400g() : "tsas".equals(str) ? new C5401h() : "stsa".equals(str) ? new C5398e() : new UnknownEntry(str);
        rollRecoveryEntry.parse(byteBuffer);
        return rollRecoveryEntry;
    }

    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() != 1) {
            throw new RuntimeException("SampleGroupDescriptionBox are only supported in version 1");
        }
        String read4cc = IsoTypeReader.read4cc(byteBuffer);
        if (getVersion() == 1) {
            this.defaultLength = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        }
        long readUInt32 = IsoTypeReader.readUInt32(byteBuffer);
        while (true) {
            long j = readUInt32 - 1;
            if (readUInt32 > 0) {
                int i = this.defaultLength;
                if (getVersion() == 1) {
                    if (this.defaultLength == 0) {
                        i = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
                    }
                    int position = byteBuffer.position() + i;
                    ByteBuffer slice = byteBuffer.slice();
                    slice.limit(i);
                    this.groupEntries.add(parseGroupEntry(slice, read4cc));
                    byteBuffer.position(position);
                    readUInt32 = j;
                } else {
                    throw new RuntimeException("This should be implemented");
                }
            }
            return;
        }
    }

    public boolean equals(Object obj) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_4, (Object) this, (Object) this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SampleGroupDescriptionBox sampleGroupDescriptionBox = (SampleGroupDescriptionBox) obj;
        if (this.defaultLength != sampleGroupDescriptionBox.defaultLength) {
            return false;
        }
        if (this.groupEntries != null) {
            if (!this.groupEntries.equals(sampleGroupDescriptionBox.groupEntries)) {
                return false;
            }
        } else if (sampleGroupDescriptionBox.groupEntries != null) {
            return false;
        }
        return true;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(IsoFile.fourCCtoBytes(((GroupEntry) this.groupEntries.get(0)).getType()));
        if (getVersion() == 1) {
            IsoTypeWriter.writeUInt32(byteBuffer, (long) this.defaultLength);
        }
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.groupEntries.size());
        for (GroupEntry groupEntry : this.groupEntries) {
            if (getVersion() == 1 && this.defaultLength == 0) {
                IsoTypeWriter.writeUInt32(byteBuffer, (long) groupEntry.get().limit());
            }
            byteBuffer.put(groupEntry.get());
        }
    }

    protected long getContentSize() {
        long j = (getVersion() == 1 ? 12 : 8) + 4;
        for (GroupEntry groupEntry : this.groupEntries) {
            if (getVersion() == 1 && this.defaultLength == 0) {
                j += 4;
            }
            j += (long) groupEntry.size();
        }
        return j;
    }

    public int getDefaultLength() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.defaultLength;
    }

    public List<GroupEntry> getGroupEntries() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.groupEntries;
    }

    public int hashCode() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_5, (Object) this, (Object) this));
        int i = 0;
        int i2 = 31 * (this.defaultLength + 0);
        if (this.groupEntries != null) {
            i = this.groupEntries.hashCode();
        }
        return i2 + i;
    }

    public void setDefaultLength(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.defaultLength = i;
    }

    public void setGroupEntries(List<GroupEntry> list) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, (Object) list));
        this.groupEntries = list;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("SampleGroupDescriptionBox{groupingType='");
        stringBuilder.append(this.groupEntries.size() > 0 ? ((GroupEntry) this.groupEntries.get(0)).getType() : "????");
        stringBuilder.append('\'');
        stringBuilder.append(", defaultLength=");
        stringBuilder.append(this.defaultLength);
        stringBuilder.append(", groupEntries=");
        stringBuilder.append(this.groupEntries);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
