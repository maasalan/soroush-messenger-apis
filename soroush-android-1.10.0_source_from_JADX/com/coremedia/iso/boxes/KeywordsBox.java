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

public class KeywordsBox extends AbstractFullBox {
    public static final String TYPE = "kywd";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private String[] keywords;
    private String language;

    static {
        ajc$preClinit();
    }

    public KeywordsBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("KeywordsBox.java", KeywordsBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLanguage", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getKeywords", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "[Ljava.lang.String;"), 44);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setLanguage", "com.coremedia.iso.boxes.KeywordsBox", "java.lang.String", IjkMediaMeta.IJKM_KEY_LANGUAGE, "", "void"), 48);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setKeywords", "com.coremedia.iso.boxes.KeywordsBox", "[Ljava.lang.String;", "keywords", "", "void"), 52);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "java.lang.String"), 87);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = IsoTypeReader.readIso639(byteBuffer);
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.keywords = new String[readUInt8];
        for (int i = 0; i < readUInt8; i++) {
            IsoTypeReader.readUInt8(byteBuffer);
            this.keywords[i] = IsoTypeReader.readString(byteBuffer);
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeIso639(byteBuffer, this.language);
        IsoTypeWriter.writeUInt8(byteBuffer, this.keywords.length);
        for (String str : this.keywords) {
            IsoTypeWriter.writeUInt8(byteBuffer, Utf8.utf8StringLengthInBytes(str) + 1);
            byteBuffer.put(Utf8.convert(str));
        }
    }

    protected long getContentSize() {
        String[] strArr = this.keywords;
        long j = 7;
        int i = 0;
        while (i < strArr.length) {
            i++;
            j += (long) ((Utf8.utf8StringLengthInBytes(strArr[i]) + 1) + 1);
        }
        return j;
    }

    public String[] getKeywords() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.keywords;
    }

    public String getLanguage() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.language;
    }

    public void setKeywords(String[] strArr) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, (Object) strArr));
        this.keywords = strArr;
    }

    public void setLanguage(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_2, (Object) this, (Object) this, (Object) str));
        this.language = str;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("KeywordsBox[language=");
        stringBuffer.append(getLanguage());
        for (int i = 0; i < this.keywords.length; i++) {
            stringBuffer.append(";keyword");
            stringBuffer.append(i);
            stringBuffer.append("=");
            stringBuffer.append(this.keywords[i]);
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
