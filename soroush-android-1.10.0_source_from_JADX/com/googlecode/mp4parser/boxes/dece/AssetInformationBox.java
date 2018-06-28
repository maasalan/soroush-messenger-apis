package com.googlecode.mp4parser.boxes.dece;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class AssetInformationBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "ainf";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    String apid = "";
    String profileVersion = "0000";

    public static class Entry {
        public String assetId;
        public String namespace;
        public String profileLevelIdc;

        public Entry(String str, String str2, String str3) {
            this.namespace = str;
            this.profileLevelIdc = str2;
            this.assetId = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.assetId.equals(entry.assetId) && this.namespace.equals(entry.namespace) && this.profileLevelIdc.equals(entry.profileLevelIdc);
        }

        public int getSize() {
            return ((3 + Utf8.utf8StringLengthInBytes(this.namespace)) + Utf8.utf8StringLengthInBytes(this.profileLevelIdc)) + Utf8.utf8StringLengthInBytes(this.assetId);
        }

        public int hashCode() {
            return (31 * ((this.namespace.hashCode() * 31) + this.profileLevelIdc.hashCode())) + this.assetId.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("{namespace='");
            stringBuilder.append(this.namespace);
            stringBuilder.append('\'');
            stringBuilder.append(", profileLevelIdc='");
            stringBuilder.append(this.profileLevelIdc);
            stringBuilder.append('\'');
            stringBuilder.append(", assetId='");
            stringBuilder.append(this.assetId);
            stringBuilder.append('\'');
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public AssetInformationBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("AssetInformationBox.java", AssetInformationBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getApid", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "", "", "", "java.lang.String"), 131);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setApid", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "java.lang.String", "apid", "", "void"), 135);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getProfileVersion", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "", "", "", "java.lang.String"), 139);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setProfileVersion", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "java.lang.String", "profileVersion", "", "void"), 143);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.profileVersion = IsoTypeReader.readString(byteBuffer, 4);
        this.apid = IsoTypeReader.readString(byteBuffer);
    }

    public String getApid() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.apid;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 0) {
            byteBuffer.put(Utf8.convert(this.profileVersion), 0, 4);
            byteBuffer.put(Utf8.convert(this.apid));
            byteBuffer.put((byte) 0);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Unknown ainf version ");
        stringBuilder.append(getVersion());
        throw new RuntimeException(stringBuilder.toString());
    }

    protected long getContentSize() {
        return (long) (Utf8.utf8StringLengthInBytes(this.apid) + 9);
    }

    public String getProfileVersion() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.profileVersion;
    }

    @DoNotParseDetail
    public boolean isHidden() {
        return (getFlags() & 1) == 1;
    }

    public void setApid(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.apid = str;
    }

    @DoNotParseDetail
    public void setHidden(boolean z) {
        int flags = getFlags();
        if ((isHidden() ^ z) != 0) {
            if (z) {
                setFlags(flags | 1);
                return;
            }
            setFlags(16777214 & flags);
        }
    }

    public void setProfileVersion(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        this.profileVersion = str;
    }
}
