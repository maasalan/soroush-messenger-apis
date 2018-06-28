package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class SoundMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = "smhd";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private float balance;

    static {
        ajc$preClinit();
    }

    public SoundMediaHeaderBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("SoundMediaHeaderBox.java", SoundMediaHeaderBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "", "float"), 36);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "", "java.lang.String"), 58);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.balance = IsoTypeReader.readFixedPoint88(byteBuffer);
        IsoTypeReader.readUInt16(byteBuffer);
    }

    public float getBalance() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.balance;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeFixedPoint88(byteBuffer, (double) this.balance);
        IsoTypeWriter.writeUInt16(byteBuffer, 0);
    }

    protected long getContentSize() {
        return 8;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("SoundMediaHeaderBox[balance=");
        stringBuilder.append(getBalance());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
