package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class CompositionTimeToSample extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "ctts";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    List<Entry> entries = Collections.emptyList();

    public static class Entry {
        int count;
        int offset;

        public Entry(int i, int i2) {
            this.count = i;
            this.offset = i2;
        }

        public int getCount() {
            return this.count;
        }

        public int getOffset() {
            return this.offset;
        }

        public void setCount(int i) {
            this.count = i;
        }

        public void setOffset(int i) {
            this.offset = i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Entry{count=");
            stringBuilder.append(this.count);
            stringBuilder.append(", offset=");
            stringBuilder.append(this.offset);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public CompositionTimeToSample() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("CompositionTimeToSample.java", CompositionTimeToSample.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "", "java.util.List"), 57);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "", "void"), 61);
    }

    public static int[] blowupCompositionTimes(List<Entry> list) {
        long j = 0;
        for (Entry count : list) {
            j += (long) count.getCount();
        }
        int[] iArr = new int[((int) j)];
        int i = 0;
        for (Entry entry : list) {
            int i2 = i;
            i = 0;
            while (i < entry.getCount()) {
                int i3 = i2 + 1;
                iArr[i2] = entry.getOffset();
                i++;
                i2 = i3;
            }
            i = i2;
        }
        return iArr;
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int l2i = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.entries = new ArrayList(l2i);
        for (int i = 0; i < l2i; i++) {
            this.entries.add(new Entry(CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer)), byteBuffer.getInt()));
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.entries.size());
        for (Entry entry : this.entries) {
            IsoTypeWriter.writeUInt32(byteBuffer, (long) entry.getCount());
            byteBuffer.putInt(entry.getOffset());
        }
    }

    protected long getContentSize() {
        return (long) (8 + (this.entries.size() * 8));
    }

    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.entries;
    }

    public void setEntries(List<Entry> list) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) list));
        this.entries = list;
    }
}
