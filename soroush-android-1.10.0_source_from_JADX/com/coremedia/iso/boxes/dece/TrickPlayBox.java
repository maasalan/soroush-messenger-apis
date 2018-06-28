package com.coremedia.iso.boxes.dece;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class TrickPlayBox extends AbstractFullBox {
    public static final String TYPE = "trik";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private List<Entry> entries = new ArrayList();

    public static class Entry {
        private int value;

        public Entry(int i) {
            this.value = i;
        }

        public int getDependencyLevel() {
            return this.value & 63;
        }

        public int getPicType() {
            return (this.value >> 6) & 3;
        }

        public void setDependencyLevel(int i) {
            this.value = (i & 63) | this.value;
        }

        public void setPicType(int i) {
            this.value &= 31;
            this.value = ((i & 3) << 6) | this.value;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Entry");
            stringBuilder.append("{picType=");
            stringBuilder.append(getPicType());
            stringBuilder.append(",dependencyLevel=");
            stringBuilder.append(getDependencyLevel());
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public TrickPlayBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("TrickPlayBox.java", TrickPlayBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setEntries", "com.coremedia.iso.boxes.dece.TrickPlayBox", "java.util.List", "entries", "", "void"), 32);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getEntries", "com.coremedia.iso.boxes.dece.TrickPlayBox", "", "", "", "java.util.List"), 36);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.dece.TrickPlayBox", "", "", "", "java.lang.String"), 103);
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
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.entries;
    }

    public void setEntries(List<Entry> list) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_0, (Object) this, (Object) this, (Object) list));
        this.entries = list;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TrickPlayBox");
        stringBuilder.append("{entries=");
        stringBuilder.append(this.entries);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
