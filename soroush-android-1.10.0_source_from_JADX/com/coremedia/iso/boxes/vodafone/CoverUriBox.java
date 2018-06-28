package com.coremedia.iso.boxes.vodafone;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class CoverUriBox extends AbstractFullBox {
    public static final String TYPE = "cvru";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private String coverUri;

    static {
        ajc$preClinit();
    }

    public CoverUriBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("CoverUriBox.java", CoverUriBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getCoverUri", "com.coremedia.iso.boxes.vodafone.CoverUriBox", "", "", "", "java.lang.String"), 38);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setCoverUri", "com.coremedia.iso.boxes.vodafone.CoverUriBox", "java.lang.String", "coverUri", "", "void"), 42);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.vodafone.CoverUriBox", "", "", "", "java.lang.String"), 64);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.coverUri = IsoTypeReader.readString(byteBuffer);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(Utf8.convert(this.coverUri));
        byteBuffer.put((byte) 0);
    }

    protected long getContentSize() {
        return (long) (Utf8.utf8StringLengthInBytes(this.coverUri) + 5);
    }

    public String getCoverUri() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.coverUri;
    }

    public void setCoverUri(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.coverUri = str;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("CoverUriBox[coverUri=");
        stringBuilder.append(getCoverUri());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
