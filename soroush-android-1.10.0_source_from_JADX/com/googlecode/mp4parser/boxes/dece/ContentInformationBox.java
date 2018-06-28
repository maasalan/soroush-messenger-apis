package com.googlecode.mp4parser.boxes.dece;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class ContentInformationBox extends AbstractFullBox {
    public static final String TYPE = "cinf";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_10 = null;
    private static final C7000a ajc$tjp_11 = null;
    private static final C7000a ajc$tjp_12 = null;
    private static final C7000a ajc$tjp_13 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    private static final C7000a ajc$tjp_8 = null;
    private static final C7000a ajc$tjp_9 = null;
    Map<String, String> brandEntries = new LinkedHashMap();
    String codecs;
    Map<String, String> idEntries = new LinkedHashMap();
    String languages;
    String mimeSubtypeName;
    String profileLevelIdc;
    String protection;

    public static class BrandEntry {
        String iso_brand;
        String version;

        public BrandEntry(String str, String str2) {
            this.iso_brand = str;
            this.version = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BrandEntry brandEntry = (BrandEntry) obj;
            if (this.iso_brand != null) {
                if (!this.iso_brand.equals(brandEntry.iso_brand)) {
                    return false;
                }
            } else if (brandEntry.iso_brand != null) {
                return false;
            }
            if (this.version != null) {
                if (!this.version.equals(brandEntry.version)) {
                    return false;
                }
            } else if (brandEntry.version != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = 31 * (this.iso_brand != null ? this.iso_brand.hashCode() : 0);
            if (this.version != null) {
                i = this.version.hashCode();
            }
            return hashCode + i;
        }
    }

    static {
        ajc$preClinit();
    }

    public ContentInformationBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("ContentInformationBox.java", ContentInformationBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getMimeSubtypeName", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), (int) IjkMediaMeta.FF_PROFILE_H264_HIGH_444);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setMimeSubtypeName", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "mimeSubtypeName", "", "void"), 148);
        ajc$tjp_10 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getBrandEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.util.Map"), 184);
        ajc$tjp_11 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setBrandEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.util.Map", "brandEntries", "", "void"), 188);
        ajc$tjp_12 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getIdEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.util.Map"), 192);
        ajc$tjp_13 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setIdEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.util.Map", "idEntries", "", "void"), 196);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getProfileLevelIdc", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 152);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setProfileLevelIdc", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "profileLevelIdc", "", "void"), 156);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getCodecs", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 160);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setCodecs", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "codecs", "", "void"), 164);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getProtection", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 168);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setProtection", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "protection", "", "void"), 172);
        ajc$tjp_8 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLanguages", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 176);
        ajc$tjp_9 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setLanguages", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "languages", "", "void"), 180);
    }

    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.mimeSubtypeName = IsoTypeReader.readString(byteBuffer);
        this.profileLevelIdc = IsoTypeReader.readString(byteBuffer);
        this.codecs = IsoTypeReader.readString(byteBuffer);
        this.protection = IsoTypeReader.readString(byteBuffer);
        this.languages = IsoTypeReader.readString(byteBuffer);
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        while (true) {
            int i = readUInt8 - 1;
            if (readUInt8 <= 0) {
                break;
            }
            this.brandEntries.put(IsoTypeReader.readString(byteBuffer), IsoTypeReader.readString(byteBuffer));
            readUInt8 = i;
        }
        readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        while (true) {
            i = readUInt8 - 1;
            if (readUInt8 > 0) {
                this.idEntries.put(IsoTypeReader.readString(byteBuffer), IsoTypeReader.readString(byteBuffer));
                readUInt8 = i;
            } else {
                return;
            }
        }
    }

    public Map<String, String> getBrandEntries() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_10, (Object) this, (Object) this));
        return this.brandEntries;
    }

    public String getCodecs() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.codecs;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, this.mimeSubtypeName);
        IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, this.profileLevelIdc);
        IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, this.codecs);
        IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, this.protection);
        IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, this.languages);
        IsoTypeWriter.writeUInt8(byteBuffer, this.brandEntries.size());
        for (Entry entry : this.brandEntries.entrySet()) {
            IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, (String) entry.getKey());
            IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, (String) entry.getValue());
        }
        IsoTypeWriter.writeUInt8(byteBuffer, this.idEntries.size());
        for (Entry entry2 : this.idEntries.entrySet()) {
            IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, (String) entry2.getKey());
            IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, (String) entry2.getValue());
        }
    }

    protected long getContentSize() {
        long utf8StringLengthInBytes = (((((4 + ((long) (Utf8.utf8StringLengthInBytes(this.mimeSubtypeName) + 1))) + ((long) (Utf8.utf8StringLengthInBytes(this.profileLevelIdc) + 1))) + ((long) (Utf8.utf8StringLengthInBytes(this.codecs) + 1))) + ((long) (Utf8.utf8StringLengthInBytes(this.protection) + 1))) + ((long) (Utf8.utf8StringLengthInBytes(this.languages) + 1))) + 1;
        for (Entry entry : this.brandEntries.entrySet()) {
            utf8StringLengthInBytes = (utf8StringLengthInBytes + ((long) (Utf8.utf8StringLengthInBytes((String) entry.getKey()) + 1))) + ((long) (Utf8.utf8StringLengthInBytes((String) entry.getValue()) + 1));
        }
        long j = utf8StringLengthInBytes + 1;
        for (Entry entry2 : this.idEntries.entrySet()) {
            j = (j + ((long) (Utf8.utf8StringLengthInBytes((String) entry2.getKey()) + 1))) + ((long) (Utf8.utf8StringLengthInBytes((String) entry2.getValue()) + 1));
        }
        return j;
    }

    public Map<String, String> getIdEntries() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_12, (Object) this, (Object) this));
        return this.idEntries;
    }

    public String getLanguages() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_8, (Object) this, (Object) this));
        return this.languages;
    }

    public String getMimeSubtypeName() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.mimeSubtypeName;
    }

    public String getProfileLevelIdc() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.profileLevelIdc;
    }

    public String getProtection() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        return this.protection;
    }

    public void setBrandEntries(Map<String, String> map) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_11, (Object) this, (Object) this, (Object) map));
        this.brandEntries = map;
    }

    public void setCodecs(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, (Object) str));
        this.codecs = str;
    }

    public void setIdEntries(Map<String, String> map) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_13, (Object) this, (Object) this, (Object) map));
        this.idEntries = map;
    }

    public void setLanguages(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_9, (Object) this, (Object) this, (Object) str));
        this.languages = str;
    }

    public void setMimeSubtypeName(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.mimeSubtypeName = str;
    }

    public void setProfileLevelIdc(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        this.profileLevelIdc = str;
    }

    public void setProtection(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_7, (Object) this, (Object) this, (Object) str));
        this.protection = str;
    }
}
