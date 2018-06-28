package com.coremedia.iso.boxes.vodafone;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class LyricsUriBox extends AbstractFullBox {
    public static final String TYPE = "lrcu";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private String lyricsUri;

    static {
        ajc$preClinit();
    }

    public LyricsUriBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("LyricsUriBox.java", LyricsUriBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLyricsUri", "com.coremedia.iso.boxes.vodafone.LyricsUriBox", "", "", "", "java.lang.String"), 39);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setLyricsUri", "com.coremedia.iso.boxes.vodafone.LyricsUriBox", "java.lang.String", "lyricsUri", "", "void"), 43);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.vodafone.LyricsUriBox", "", "", "", "java.lang.String"), 64);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.lyricsUri = IsoTypeReader.readString(byteBuffer);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(Utf8.convert(this.lyricsUri));
        byteBuffer.put((byte) 0);
    }

    protected long getContentSize() {
        return (long) (Utf8.utf8StringLengthInBytes(this.lyricsUri) + 5);
    }

    public String getLyricsUri() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.lyricsUri;
    }

    public void setLyricsUri(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.lyricsUri = str;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("LyricsUriBox[lyricsUri=");
        stringBuilder.append(getLyricsUri());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
