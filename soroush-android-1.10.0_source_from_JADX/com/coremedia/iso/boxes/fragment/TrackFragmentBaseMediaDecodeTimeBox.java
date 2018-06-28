package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class TrackFragmentBaseMediaDecodeTimeBox extends AbstractFullBox {
    public static final String TYPE = "tfdt";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private long baseMediaDecodeTime;

    static {
        ajc$preClinit();
    }

    public TrackFragmentBaseMediaDecodeTimeBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("TrackFragmentBaseMediaDecodeTimeBox.java", TrackFragmentBaseMediaDecodeTimeBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getBaseMediaDecodeTime", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "", "", "", "long"), 65);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setBaseMediaDecodeTime", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "long", "baseMediaDecodeTime", "", "void"), 69);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "", "", "", "java.lang.String"), 74);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.baseMediaDecodeTime = getVersion() == 1 ? IsoTypeReader.readUInt64(byteBuffer) : IsoTypeReader.readUInt32(byteBuffer);
    }

    public long getBaseMediaDecodeTime() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.baseMediaDecodeTime;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            IsoTypeWriter.writeUInt64(byteBuffer, this.baseMediaDecodeTime);
        } else {
            IsoTypeWriter.writeUInt32(byteBuffer, this.baseMediaDecodeTime);
        }
    }

    protected long getContentSize() {
        return (long) (getVersion() == 0 ? 8 : 12);
    }

    public void setBaseMediaDecodeTime(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.baseMediaDecodeTime = j;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("TrackFragmentBaseMediaDecodeTimeBox{baseMediaDecodeTime=");
        stringBuilder.append(this.baseMediaDecodeTime);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
