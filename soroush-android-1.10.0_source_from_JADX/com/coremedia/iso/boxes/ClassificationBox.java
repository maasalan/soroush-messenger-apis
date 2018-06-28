package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class ClassificationBox extends AbstractFullBox {
    public static final String TYPE = "clsf";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    private static final C7000a ajc$tjp_8 = null;
    private String classificationEntity;
    private String classificationInfo;
    private int classificationTableIndex;
    private String language;

    static {
        ajc$preClinit();
    }

    public ClassificationBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("ClassificationBox.java", ClassificationBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLanguage", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getClassificationEntity", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 48);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getClassificationTableIndex", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "int"), 52);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getClassificationInfo", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 56);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setClassificationEntity", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "classificationEntity", "", "void"), 60);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setClassificationTableIndex", "com.coremedia.iso.boxes.ClassificationBox", "int", "classificationTableIndex", "", "void"), 64);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setLanguage", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", IjkMediaMeta.IJKM_KEY_LANGUAGE, "", "void"), 68);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setClassificationInfo", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "classificationInfo", "", "void"), 72);
        ajc$tjp_8 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 101);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        this.classificationEntity = IsoFile.bytesToFourCC(bArr);
        this.classificationTableIndex = IsoTypeReader.readUInt16(byteBuffer);
        this.language = IsoTypeReader.readIso639(byteBuffer);
        this.classificationInfo = IsoTypeReader.readString(byteBuffer);
    }

    public String getClassificationEntity() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.classificationEntity;
    }

    public String getClassificationInfo() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_3, (Object) this, (Object) this));
        return this.classificationInfo;
    }

    public int getClassificationTableIndex() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.classificationTableIndex;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(IsoFile.fourCCtoBytes(this.classificationEntity));
        IsoTypeWriter.writeUInt16(byteBuffer, this.classificationTableIndex);
        IsoTypeWriter.writeIso639(byteBuffer, this.language);
        byteBuffer.put(Utf8.convert(this.classificationInfo));
        byteBuffer.put((byte) 0);
    }

    protected long getContentSize() {
        return (long) ((8 + Utf8.utf8StringLengthInBytes(this.classificationInfo)) + 1);
    }

    public String getLanguage() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.language;
    }

    public void setClassificationEntity(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_4, (Object) this, (Object) this, (Object) str));
        this.classificationEntity = str;
    }

    public void setClassificationInfo(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_7, (Object) this, (Object) this, (Object) str));
        this.classificationInfo = str;
    }

    public void setClassificationTableIndex(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.classificationTableIndex = i;
    }

    public void setLanguage(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_6, (Object) this, (Object) this, (Object) str));
        this.language = str;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_8, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ClassificationBox[language=");
        stringBuilder.append(getLanguage());
        stringBuilder.append("classificationEntity=");
        stringBuilder.append(getClassificationEntity());
        stringBuilder.append(";classificationTableIndex=");
        stringBuilder.append(getClassificationTableIndex());
        stringBuilder.append(";language=");
        stringBuilder.append(getLanguage());
        stringBuilder.append(";classificationInfo=");
        stringBuilder.append(getClassificationInfo());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
