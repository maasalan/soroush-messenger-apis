package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class SampleDependencyTypeBox extends AbstractFullBox {
    public static final String TYPE = "sdtp";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private List<Entry> entries = new ArrayList();

    public static class Entry {
        private int value;

        public Entry(int i) {
            this.value = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.value == ((Entry) obj).value;
        }

        public int getReserved() {
            return (this.value >> 6) & 3;
        }

        public int getSampleDependsOn() {
            return (this.value >> 4) & 3;
        }

        public int getSampleHasRedundancy() {
            return this.value & 3;
        }

        public int getSampleIsDependentOn() {
            return (this.value >> 2) & 3;
        }

        public int hashCode() {
            return this.value;
        }

        public void setReserved(int i) {
            this.value = ((i & 3) << 6) | (this.value & 63);
        }

        public void setSampleDependsOn(int i) {
            this.value = ((i & 3) << 4) | (this.value & 207);
        }

        public void setSampleHasRedundancy(int i) {
            this.value = (i & 3) | (this.value & 252);
        }

        public void setSampleIsDependentOn(int i) {
            this.value = ((i & 3) << 2) | (this.value & 243);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Entry{reserved=");
            stringBuilder.append(getReserved());
            stringBuilder.append(", sampleDependsOn=");
            stringBuilder.append(getSampleDependsOn());
            stringBuilder.append(", sampleIsDependentOn=");
            stringBuilder.append(getSampleIsDependentOn());
            stringBuilder.append(", sampleHasRedundancy=");
            stringBuilder.append(getSampleHasRedundancy());
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public SampleDependencyTypeBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("SampleDependencyTypeBox.java", SampleDependencyTypeBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getEntries", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "", "", "", "java.util.List"), 139);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setEntries", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "java.util.List", "entries", "", "void"), 143);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "", "", "", "java.lang.String"), 148);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        while (byteBuffer.remaining() > 0) {
            this.entries.add(new Entry(IsoTypeReader.readUInt8(byteBuffer)));
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        for (Entry access$0 : this.entries) {
            IsoTypeWriter.writeUInt8(byteBuffer, access$0.value);
        }
    }

    protected long getContentSize() {
        return (long) (4 + this.entries.size());
    }

    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.entries;
    }

    public void setEntries(List<Entry> list) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) list));
        this.entries = list;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SampleDependencyTypeBox");
        stringBuilder.append("{entries=");
        stringBuilder.append(this.entries);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
