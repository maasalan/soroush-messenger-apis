package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class CopyrightBox extends AbstractFullBox {
    public static final String TYPE = "cprt";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private String copyright;
    private String language;

    static {
        ajc$preClinit();
    }

    public CopyrightBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("CopyrightBox.java", CopyrightBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLanguage", "com.coremedia.iso.boxes.CopyrightBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getCopyright", "com.coremedia.iso.boxes.CopyrightBox", "", "", "", "java.lang.String"), 50);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setLanguage", "com.coremedia.iso.boxes.CopyrightBox", "java.lang.String", IjkMediaMeta.IJKM_KEY_LANGUAGE, "", "void"), 54);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setCopyright", "com.coremedia.iso.boxes.CopyrightBox", "java.lang.String", "copyright", "", "void"), 58);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.CopyrightBox", "", "", "", "java.lang.String"), 81);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = IsoTypeReader.readIso639(byteBuffer);
        this.copyright = IsoTypeReader.readString(byteBuffer);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeIso639(byteBuffer, this.language);
        byteBuffer.put(Utf8.convert(this.copyright));
        byteBuffer.put((byte) 0);
    }

    protected long getContentSize() {
        return (long) (7 + Utf8.utf8StringLengthInBytes(this.copyright));
    }

    public String getCopyright() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.copyright;
    }

    public String getLanguage() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.language;
    }

    public void setCopyright(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        this.copyright = str;
    }

    public void setLanguage(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_2, (Object) this, (Object) this, (Object) str));
        this.language = str;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("CopyrightBox[language=");
        stringBuilder.append(getLanguage());
        stringBuilder.append(";copyright=");
        stringBuilder.append(getCopyright());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
