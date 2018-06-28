package com.coremedia.iso.boxes;

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

public class EditListBox extends AbstractFullBox {
    public static final String TYPE = "elst";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private List<Entry> entries = new LinkedList();

    public static class Entry {
        EditListBox editListBox;
        private double mediaRate;
        private long mediaTime;
        private long segmentDuration;

        public Entry(EditListBox editListBox, long j, long j2, double d) {
            this.segmentDuration = j;
            this.mediaTime = j2;
            this.mediaRate = d;
            this.editListBox = editListBox;
        }

        public Entry(EditListBox editListBox, ByteBuffer byteBuffer) {
            long j;
            if (editListBox.getVersion() == 1) {
                this.segmentDuration = IsoTypeReader.readUInt64(byteBuffer);
                j = byteBuffer.getLong();
            } else {
                this.segmentDuration = IsoTypeReader.readUInt32(byteBuffer);
                j = (long) byteBuffer.getInt();
            }
            this.mediaTime = j;
            this.mediaRate = IsoTypeReader.readFixedPoint1616(byteBuffer);
            this.editListBox = editListBox;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.mediaTime == entry.mediaTime && this.segmentDuration == entry.segmentDuration;
        }

        public void getContent(ByteBuffer byteBuffer) {
            if (this.editListBox.getVersion() == 1) {
                IsoTypeWriter.writeUInt64(byteBuffer, this.segmentDuration);
                byteBuffer.putLong(this.mediaTime);
            } else {
                IsoTypeWriter.writeUInt32(byteBuffer, (long) CastUtils.l2i(this.segmentDuration));
                byteBuffer.putInt(CastUtils.l2i(this.mediaTime));
            }
            IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.mediaRate);
        }

        public double getMediaRate() {
            return this.mediaRate;
        }

        public long getMediaTime() {
            return this.mediaTime;
        }

        public long getSegmentDuration() {
            return this.segmentDuration;
        }

        public int hashCode() {
            return (31 * ((int) (this.segmentDuration ^ (this.segmentDuration >>> 32)))) + ((int) (this.mediaTime ^ (this.mediaTime >>> 32)));
        }

        public void setMediaRate(double d) {
            this.mediaRate = d;
        }

        public void setMediaTime(long j) {
            this.mediaTime = j;
        }

        public void setSegmentDuration(long j) {
            this.segmentDuration = j;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Entry{segmentDuration=");
            stringBuilder.append(this.segmentDuration);
            stringBuilder.append(", mediaTime=");
            stringBuilder.append(this.mediaTime);
            stringBuilder.append(", mediaRate=");
            stringBuilder.append(this.mediaRate);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public EditListBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("EditListBox.java", EditListBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getEntries", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.util.List"), 68);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setEntries", "com.coremedia.iso.boxes.EditListBox", "java.util.List", "entries", "", "void"), 72);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.lang.String"), 108);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int l2i = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.entries = new LinkedList();
        for (int i = 0; i < l2i; i++) {
            this.entries.add(new Entry(this, byteBuffer));
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.entries.size());
        for (Entry content : this.entries) {
            content.getContent(byteBuffer);
        }
    }

    protected long getContentSize() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:6:0x001e in {2, 4, 5} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r7 = this;
        r0 = r7.getVersion();
        r1 = 8;
        r3 = 1;
        if (r0 != r3) goto L_0x0015;
    L_0x0009:
        r0 = r7.entries;
        r0 = r0.size();
        r0 = r0 * 20;
    L_0x0011:
        r3 = (long) r0;
        r5 = r1 + r3;
        return r5;
    L_0x0015:
        r0 = r7.entries;
        r0 = r0.size();
        r0 = r0 * 12;
        goto L_0x0011;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coremedia.iso.boxes.EditListBox.getContentSize():long");
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
        StringBuilder stringBuilder = new StringBuilder("EditListBox{entries=");
        stringBuilder.append(this.entries);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
