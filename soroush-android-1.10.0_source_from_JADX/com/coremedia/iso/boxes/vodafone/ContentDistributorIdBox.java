package com.coremedia.iso.boxes.vodafone;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class ContentDistributorIdBox extends AbstractFullBox {
    public static final String TYPE = "cdis";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private String contentDistributorId;
    private String language;

    static {
        ajc$preClinit();
    }

    public ContentDistributorIdBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("ContentDistributorIdBox.java", ContentDistributorIdBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLanguage", "com.coremedia.iso.boxes.vodafone.ContentDistributorIdBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getContentDistributorId", "com.coremedia.iso.boxes.vodafone.ContentDistributorIdBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.vodafone.ContentDistributorIdBox", "", "", "", "java.lang.String"), 68);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = IsoTypeReader.readIso639(byteBuffer);
        this.contentDistributorId = IsoTypeReader.readString(byteBuffer);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeIso639(byteBuffer, this.language);
        byteBuffer.put(Utf8.convert(this.contentDistributorId));
        byteBuffer.put((byte) 0);
    }

    public String getContentDistributorId() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.contentDistributorId;
    }

    protected long getContentSize() {
        return (long) ((2 + Utf8.utf8StringLengthInBytes(this.contentDistributorId)) + 5);
    }

    public String getLanguage() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.language;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("ContentDistributorIdBox[language=");
        stringBuilder.append(getLanguage());
        stringBuilder.append(";contentDistributorId=");
        stringBuilder.append(getContentDistributorId());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
