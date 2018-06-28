package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class TimeToSampleBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "stts";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    static Map<List<Entry>, SoftReference<long[]>> cache = new WeakHashMap();
    List<Entry> entries = Collections.emptyList();

    public static class Entry {
        long count;
        long delta;

        public Entry(long j, long j2) {
            this.count = j;
            this.delta = j2;
        }

        public long getCount() {
            return this.count;
        }

        public long getDelta() {
            return this.delta;
        }

        public void setCount(long j) {
            this.count = j;
        }

        public void setDelta(long j) {
            this.delta = j;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Entry{count=");
            stringBuilder.append(this.count);
            stringBuilder.append(", delta=");
            stringBuilder.append(this.delta);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public TimeToSampleBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("TimeToSampleBox.java", TimeToSampleBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.util.List"), 79);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "", "void"), 83);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.lang.String"), 87);
    }

    public static synchronized long[] blowupTimeToSamples(List<Entry> list) {
        synchronized (TimeToSampleBox.class) {
            SoftReference softReference = (SoftReference) cache.get(list);
            if (softReference != null) {
                long[] jArr = (long[]) softReference.get();
                if (jArr != null) {
                    return jArr;
                }
            }
            long j = 0;
            for (Entry count : list) {
                j += count.getCount();
            }
            Object obj = new long[((int) j)];
            int i = 0;
            for (Entry entry : list) {
                int i2 = i;
                i = 0;
                while (((long) i) < entry.getCount()) {
                    int i3 = i2 + 1;
                    obj[i2] = entry.getDelta();
                    i++;
                    i2 = i3;
                }
                i = i2;
            }
            cache.put(list, new SoftReference(obj));
            return obj;
        }
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int l2i = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.entries = new ArrayList(l2i);
        for (int i = 0; i < l2i; i++) {
            this.entries.add(new Entry(IsoTypeReader.readUInt32(byteBuffer), IsoTypeReader.readUInt32(byteBuffer)));
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.entries.size());
        for (Entry entry : this.entries) {
            IsoTypeWriter.writeUInt32(byteBuffer, entry.getCount());
            IsoTypeWriter.writeUInt32(byteBuffer, entry.getDelta());
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

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("TimeToSampleBox[entryCount=");
        stringBuilder.append(this.entries.size());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
