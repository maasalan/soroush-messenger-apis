package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.UserBox;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.msgpack.core.MessagePack.Code;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class TfrfBox extends AbstractFullBox {
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    public List<Entry> entries = new ArrayList();

    public class Entry {
        long fragmentAbsoluteDuration;
        long fragmentAbsoluteTime;

        public long getFragmentAbsoluteDuration() {
            return this.fragmentAbsoluteDuration;
        }

        public long getFragmentAbsoluteTime() {
            return this.fragmentAbsoluteTime;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Entry");
            stringBuilder.append("{fragmentAbsoluteTime=");
            stringBuilder.append(this.fragmentAbsoluteTime);
            stringBuilder.append(", fragmentAbsoluteDuration=");
            stringBuilder.append(this.fragmentAbsoluteDuration);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public TfrfBox() {
        super(UserBox.TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("TfrfBox.java", TfrfBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getFragmentCount", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "long"), 91);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getEntries", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "java.util.List"), 95);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "java.lang.String"), 100);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        for (int i = 0; i < readUInt8; i++) {
            long readUInt64;
            Entry entry = new Entry();
            if (getVersion() == 1) {
                entry.fragmentAbsoluteTime = IsoTypeReader.readUInt64(byteBuffer);
                readUInt64 = IsoTypeReader.readUInt64(byteBuffer);
            } else {
                entry.fragmentAbsoluteTime = IsoTypeReader.readUInt32(byteBuffer);
                readUInt64 = IsoTypeReader.readUInt32(byteBuffer);
            }
            entry.fragmentAbsoluteDuration = readUInt64;
            this.entries.add(entry);
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt8(byteBuffer, this.entries.size());
        for (Entry entry : this.entries) {
            if (getVersion() == 1) {
                IsoTypeWriter.writeUInt64(byteBuffer, entry.fragmentAbsoluteTime);
                IsoTypeWriter.writeUInt64(byteBuffer, entry.fragmentAbsoluteDuration);
            } else {
                IsoTypeWriter.writeUInt32(byteBuffer, entry.fragmentAbsoluteTime);
                IsoTypeWriter.writeUInt32(byteBuffer, entry.fragmentAbsoluteDuration);
            }
        }
    }

    protected long getContentSize() {
        return (long) (5 + (this.entries.size() * (getVersion() == 1 ? 16 : 8)));
    }

    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.entries;
    }

    public long getFragmentCount() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return (long) this.entries.size();
    }

    public byte[] getUserType() {
        return new byte[]{Code.FIXEXT1, Byte.MIN_VALUE, (byte) 126, (byte) -14, Code.FLOAT32, (byte) 57, (byte) 70, (byte) -107, (byte) -114, (byte) 84, (byte) 38, Code.FLOAT64, (byte) -98, (byte) 70, (byte) -89, (byte) -97};
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TfrfBox");
        stringBuilder.append("{entries=");
        stringBuilder.append(this.entries);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
