package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class TrackReferenceTypeBox extends AbstractBox {
    public static final String TYPE1 = "hint";
    public static final String TYPE2 = "cdsc";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private long[] trackIds;

    static {
        ajc$preClinit();
    }

    public TrackReferenceTypeBox(String str) {
        super(str);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("TrackReferenceTypeBox.java", TrackReferenceTypeBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getTrackIds", "com.coremedia.iso.boxes.TrackReferenceTypeBox", "", "", "", "[J"), 40);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.TrackReferenceTypeBox", "", "", "", "java.lang.String"), 65);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining() / 4;
        this.trackIds = new long[remaining];
        for (int i = 0; i < remaining; i++) {
            this.trackIds[i] = IsoTypeReader.readUInt32(byteBuffer);
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        for (long writeUInt32 : this.trackIds) {
            IsoTypeWriter.writeUInt32(byteBuffer, writeUInt32);
        }
    }

    protected long getContentSize() {
        return (long) (this.trackIds.length * 4);
    }

    public long[] getTrackIds() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.trackIds;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TrackReferenceTypeBox[type=");
        stringBuilder.append(getType());
        for (int i = 0; i < this.trackIds.length; i++) {
            stringBuilder.append(";trackId");
            stringBuilder.append(i);
            stringBuilder.append("=");
            stringBuilder.append(this.trackIds[i]);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
