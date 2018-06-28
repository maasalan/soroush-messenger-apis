package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class HintMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = "hmhd";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private long avgBitrate;
    private int avgPduSize;
    private long maxBitrate;
    private int maxPduSize;

    static {
        ajc$preClinit();
    }

    public HintMediaHeaderBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("HintMediaHeaderBox.java", HintMediaHeaderBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getMaxPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "int"), 42);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getAvgPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "int"), 46);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getMaxBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "long"), 50);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getAvgBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "long"), 54);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "java.lang.String"), 84);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.maxPduSize = IsoTypeReader.readUInt16(byteBuffer);
        this.avgPduSize = IsoTypeReader.readUInt16(byteBuffer);
        this.maxBitrate = IsoTypeReader.readUInt32(byteBuffer);
        this.avgBitrate = IsoTypeReader.readUInt32(byteBuffer);
        IsoTypeReader.readUInt32(byteBuffer);
    }

    public long getAvgBitrate() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_3, (Object) this, (Object) this));
        return this.avgBitrate;
    }

    public int getAvgPduSize() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.avgPduSize;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt16(byteBuffer, this.maxPduSize);
        IsoTypeWriter.writeUInt16(byteBuffer, this.avgPduSize);
        IsoTypeWriter.writeUInt32(byteBuffer, this.maxBitrate);
        IsoTypeWriter.writeUInt32(byteBuffer, this.avgBitrate);
        IsoTypeWriter.writeUInt32(byteBuffer, 0);
    }

    protected long getContentSize() {
        return 20;
    }

    public long getMaxBitrate() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.maxBitrate;
    }

    public int getMaxPduSize() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.maxPduSize;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("HintMediaHeaderBox{maxPduSize=");
        stringBuilder.append(this.maxPduSize);
        stringBuilder.append(", avgPduSize=");
        stringBuilder.append(this.avgPduSize);
        stringBuilder.append(", maxBitrate=");
        stringBuilder.append(this.maxBitrate);
        stringBuilder.append(", avgBitrate=");
        stringBuilder.append(this.avgBitrate);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
