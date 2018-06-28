package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class RatingBox extends AbstractFullBox {
    public static final String TYPE = "rtng";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    private static final C7000a ajc$tjp_8 = null;
    private String language;
    private String ratingCriteria;
    private String ratingEntity;
    private String ratingInfo;

    static {
        ajc$preClinit();
    }

    public RatingBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("RatingBox.java", RatingBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setRatingEntity", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingEntity", "", "void"), 46);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setRatingCriteria", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingCriteria", "", "void"), 50);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setLanguage", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", IjkMediaMeta.IJKM_KEY_LANGUAGE, "", "void"), 54);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setRatingInfo", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingInfo", "", "void"), 58);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLanguage", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 62);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getRatingEntity", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 73);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getRatingCriteria", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 83);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getRatingInfo", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 87);
        ajc$tjp_8 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 115);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.ratingEntity = IsoTypeReader.read4cc(byteBuffer);
        this.ratingCriteria = IsoTypeReader.read4cc(byteBuffer);
        this.language = IsoTypeReader.readIso639(byteBuffer);
        this.ratingInfo = IsoTypeReader.readString(byteBuffer);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(IsoFile.fourCCtoBytes(this.ratingEntity));
        byteBuffer.put(IsoFile.fourCCtoBytes(this.ratingCriteria));
        IsoTypeWriter.writeIso639(byteBuffer, this.language);
        byteBuffer.put(Utf8.convert(this.ratingInfo));
        byteBuffer.put((byte) 0);
    }

    protected long getContentSize() {
        return (long) (15 + Utf8.utf8StringLengthInBytes(this.ratingInfo));
    }

    public String getLanguage() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.language;
    }

    public String getRatingCriteria() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        return this.ratingCriteria;
    }

    public String getRatingEntity() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_5, (Object) this, (Object) this));
        return this.ratingEntity;
    }

    public String getRatingInfo() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_7, (Object) this, (Object) this));
        return this.ratingInfo;
    }

    public void setLanguage(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_2, (Object) this, (Object) this, (Object) str));
        this.language = str;
    }

    public void setRatingCriteria(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.ratingCriteria = str;
    }

    public void setRatingEntity(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_0, (Object) this, (Object) this, (Object) str));
        this.ratingEntity = str;
    }

    public void setRatingInfo(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        this.ratingInfo = str;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_8, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RatingBox[language=");
        stringBuilder.append(getLanguage());
        stringBuilder.append("ratingEntity=");
        stringBuilder.append(getRatingEntity());
        stringBuilder.append(";ratingCriteria=");
        stringBuilder.append(getRatingCriteria());
        stringBuilder.append(";language=");
        stringBuilder.append(getLanguage());
        stringBuilder.append(";ratingInfo=");
        stringBuilder.append(getRatingInfo());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
