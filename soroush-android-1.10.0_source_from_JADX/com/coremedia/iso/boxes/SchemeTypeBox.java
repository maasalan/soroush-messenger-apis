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

public class SchemeTypeBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "schm";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    String schemeType = "    ";
    String schemeUri = null;
    long schemeVersion;

    static {
        ajc$preClinit();
    }

    public SchemeTypeBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("SchemeTypeBox.java", SchemeTypeBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSchemeType", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSchemeVersion", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "long"), 48);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSchemeUri", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 52);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSchemeType", "com.coremedia.iso.boxes.SchemeTypeBox", "java.lang.String", "schemeType", "", "void"), 56);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSchemeVersion", "com.coremedia.iso.boxes.SchemeTypeBox", "int", "schemeVersion", "", "void"), 61);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSchemeUri", "com.coremedia.iso.boxes.SchemeTypeBox", "java.lang.String", "schemeUri", "", "void"), 65);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 93);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.schemeType = IsoTypeReader.read4cc(byteBuffer);
        this.schemeVersion = IsoTypeReader.readUInt32(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.schemeUri = IsoTypeReader.readString(byteBuffer);
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(IsoFile.fourCCtoBytes(this.schemeType));
        IsoTypeWriter.writeUInt32(byteBuffer, this.schemeVersion);
        if ((getFlags() & 1) == 1) {
            byteBuffer.put(Utf8.convert(this.schemeUri));
        }
    }

    protected long getContentSize() {
        return (long) (12 + ((getFlags() & 1) == 1 ? Utf8.utf8StringLengthInBytes(this.schemeUri) + 1 : 0));
    }

    public String getSchemeType() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.schemeType;
    }

    public String getSchemeUri() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.schemeUri;
    }

    public long getSchemeVersion() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.schemeVersion;
    }

    public void setSchemeType(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        this.schemeType = str;
    }

    public void setSchemeUri(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, (Object) str));
        this.schemeUri = str;
    }

    public void setSchemeVersion(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_4, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.schemeVersion = (long) i;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Schema Type Box[");
        stringBuilder.append("schemeUri=");
        stringBuilder.append(this.schemeUri);
        stringBuilder.append("; ");
        stringBuilder.append("schemeType=");
        stringBuilder.append(this.schemeType);
        stringBuilder.append("; ");
        stringBuilder.append("schemeVersion=");
        stringBuilder.append(this.schemeVersion);
        stringBuilder.append("; ");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
