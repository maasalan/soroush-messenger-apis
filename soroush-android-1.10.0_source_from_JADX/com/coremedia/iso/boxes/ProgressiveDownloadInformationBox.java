package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class ProgressiveDownloadInformationBox extends AbstractFullBox {
    public static final String TYPE = "pdin";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    List<Entry> entries = Collections.emptyList();

    public static class Entry {
        long initialDelay;
        long rate;

        public Entry(long j, long j2) {
            this.rate = j;
            this.initialDelay = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.initialDelay == entry.initialDelay && this.rate == entry.rate;
        }

        public long getInitialDelay() {
            return this.initialDelay;
        }

        public long getRate() {
            return this.rate;
        }

        public int hashCode() {
            return (31 * ((int) (this.rate ^ (this.rate >>> 32)))) + ((int) (this.initialDelay ^ (this.initialDelay >>> 32)));
        }

        public void setInitialDelay(long j) {
            this.initialDelay = j;
        }

        public void setRate(long j) {
            this.rate = j;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Entry{rate=");
            stringBuilder.append(this.rate);
            stringBuilder.append(", initialDelay=");
            stringBuilder.append(this.initialDelay);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public ProgressiveDownloadInformationBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("ProgressiveDownloadInformationBox.java", ProgressiveDownloadInformationBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getEntries", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "", "", "", "java.util.List"), 38);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setEntries", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "java.util.List", "entries", "", "void"), 42);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "", "", "", "java.lang.String"), 112);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.entries = new LinkedList();
        while (byteBuffer.remaining() >= 8) {
            this.entries.add(new Entry(IsoTypeReader.readUInt32(byteBuffer), IsoTypeReader.readUInt32(byteBuffer)));
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        for (Entry entry : this.entries) {
            IsoTypeWriter.writeUInt32(byteBuffer, entry.getRate());
            IsoTypeWriter.writeUInt32(byteBuffer, entry.getInitialDelay());
        }
    }

    protected long getContentSize() {
        return (long) (4 + (this.entries.size() * 8));
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
        StringBuilder stringBuilder = new StringBuilder("ProgressiveDownloadInfoBox{entries=");
        stringBuilder.append(this.entries);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
