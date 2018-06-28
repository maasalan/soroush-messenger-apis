package com.googlecode.mp4parser.boxes.threegpp26245;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class FontTableBox extends AbstractBox {
    public static final String TYPE = "ftab";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    List<FontRecord> entries = new LinkedList();

    public static class FontRecord {
        int fontId;
        String fontname;

        public FontRecord(int i, String str) {
            this.fontId = i;
            this.fontname = str;
        }

        public void getContent(ByteBuffer byteBuffer) {
            IsoTypeWriter.writeUInt16(byteBuffer, this.fontId);
            IsoTypeWriter.writeUInt8(byteBuffer, this.fontname.length());
            byteBuffer.put(Utf8.convert(this.fontname));
        }

        public int getSize() {
            return Utf8.utf8StringLengthInBytes(this.fontname) + 3;
        }

        public void parse(ByteBuffer byteBuffer) {
            this.fontId = IsoTypeReader.readUInt16(byteBuffer);
            this.fontname = IsoTypeReader.readString(byteBuffer, IsoTypeReader.readUInt8(byteBuffer));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("FontRecord{fontId=");
            stringBuilder.append(this.fontId);
            stringBuilder.append(", fontname='");
            stringBuilder.append(this.fontname);
            stringBuilder.append('\'');
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public FontTableBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("FontTableBox.java", FontTableBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getEntries", "com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox", "", "", "", "java.util.List"), 52);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setEntries", "com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox", "java.util.List", "entries", "", "void"), 56);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        int readUInt16 = IsoTypeReader.readUInt16(byteBuffer);
        for (int i = 0; i < readUInt16; i++) {
            FontRecord fontRecord = new FontRecord();
            fontRecord.parse(byteBuffer);
            this.entries.add(fontRecord);
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt16(byteBuffer, this.entries.size());
        for (FontRecord content : this.entries) {
            content.getContent(byteBuffer);
        }
    }

    protected long getContentSize() {
        int i = 2;
        for (FontRecord size : this.entries) {
            i += size.getSize();
        }
        return (long) i;
    }

    public List<FontRecord> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.entries;
    }

    public void setEntries(List<FontRecord> list) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) list));
        this.entries = list;
    }
}
