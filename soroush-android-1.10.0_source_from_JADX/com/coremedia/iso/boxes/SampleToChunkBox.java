package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class SampleToChunkBox extends AbstractFullBox {
    public static final String TYPE = "stsc";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    List<Entry> entries = Collections.emptyList();

    public static class Entry {
        long firstChunk;
        long sampleDescriptionIndex;
        long samplesPerChunk;

        public Entry(long j, long j2, long j3) {
            this.firstChunk = j;
            this.samplesPerChunk = j2;
            this.sampleDescriptionIndex = j3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.firstChunk == entry.firstChunk && this.sampleDescriptionIndex == entry.sampleDescriptionIndex && this.samplesPerChunk == entry.samplesPerChunk;
        }

        public long getFirstChunk() {
            return this.firstChunk;
        }

        public long getSampleDescriptionIndex() {
            return this.sampleDescriptionIndex;
        }

        public long getSamplesPerChunk() {
            return this.samplesPerChunk;
        }

        public int hashCode() {
            return (31 * ((((int) (this.firstChunk ^ (this.firstChunk >>> 32))) * 31) + ((int) (this.samplesPerChunk ^ (this.samplesPerChunk >>> 32))))) + ((int) (this.sampleDescriptionIndex ^ (this.sampleDescriptionIndex >>> 32)));
        }

        public void setFirstChunk(long j) {
            this.firstChunk = j;
        }

        public void setSampleDescriptionIndex(long j) {
            this.sampleDescriptionIndex = j;
        }

        public void setSamplesPerChunk(long j) {
            this.samplesPerChunk = j;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Entry{firstChunk=");
            stringBuilder.append(this.firstChunk);
            stringBuilder.append(", samplesPerChunk=");
            stringBuilder.append(this.samplesPerChunk);
            stringBuilder.append(", sampleDescriptionIndex=");
            stringBuilder.append(this.sampleDescriptionIndex);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public SampleToChunkBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("SampleToChunkBox.java", SampleToChunkBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.util.List"), 47);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "", "void"), 51);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.lang.String"), 84);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "", "[J"), 95);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int l2i = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.entries = new ArrayList(l2i);
        for (int i = 0; i < l2i; i++) {
            this.entries.add(new Entry(IsoTypeReader.readUInt32(byteBuffer), IsoTypeReader.readUInt32(byteBuffer), IsoTypeReader.readUInt32(byteBuffer)));
        }
    }

    public long[] blowup(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, C4599a.m8314a(i)));
        long[] jArr = new long[i];
        List linkedList = new LinkedList(this.entries);
        Collections.reverse(linkedList);
        Iterator it = linkedList.iterator();
        Entry entry = (Entry) it.next();
        while (i > 1) {
            jArr[i - 1] = entry.getSamplesPerChunk();
            if (((long) i) == entry.getFirstChunk()) {
                entry = (Entry) it.next();
            }
            i--;
        }
        jArr[0] = entry.getSamplesPerChunk();
        return jArr;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.entries.size());
        for (Entry entry : this.entries) {
            IsoTypeWriter.writeUInt32(byteBuffer, entry.getFirstChunk());
            IsoTypeWriter.writeUInt32(byteBuffer, entry.getSamplesPerChunk());
            IsoTypeWriter.writeUInt32(byteBuffer, entry.getSampleDescriptionIndex());
        }
    }

    protected long getContentSize() {
        return (long) ((this.entries.size() * 12) + 8);
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
        StringBuilder stringBuilder = new StringBuilder("SampleToChunkBox[entryCount=");
        stringBuilder.append(this.entries.size());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
