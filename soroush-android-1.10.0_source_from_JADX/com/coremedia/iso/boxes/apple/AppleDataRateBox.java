package com.coremedia.iso.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class AppleDataRateBox extends AbstractFullBox {
    public static final String TYPE = "rmdr";
    private static final C7000a ajc$tjp_0 = null;
    private long dataRate;

    static {
        ajc$preClinit();
    }

    public AppleDataRateBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("AppleDataRateBox.java", AppleDataRateBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDataRate", "com.coremedia.iso.boxes.apple.AppleDataRateBox", "", "", "", "long"), 53);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.dataRate = IsoTypeReader.readUInt32(byteBuffer);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.dataRate);
    }

    protected long getContentSize() {
        return 8;
    }

    public long getDataRate() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.dataRate;
    }
}
