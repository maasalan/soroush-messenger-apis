package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class OriginalFormatBox extends AbstractBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "frma";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private String dataFormat = "    ";

    static {
        ajc$preClinit();
    }

    public OriginalFormatBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("OriginalFormatBox.java", OriginalFormatBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDataFormat", "com.coremedia.iso.boxes.OriginalFormatBox", "", "", "", "java.lang.String"), 42);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDataFormat", "com.coremedia.iso.boxes.OriginalFormatBox", "java.lang.String", "dataFormat", "", "void"), 47);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.OriginalFormatBox", "", "", "", "java.lang.String"), 67);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.dataFormat = IsoTypeReader.read4cc(byteBuffer);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(IsoFile.fourCCtoBytes(this.dataFormat));
    }

    protected long getContentSize() {
        return 4;
    }

    public String getDataFormat() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.dataFormat;
    }

    public void setDataFormat(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.dataFormat = str;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("OriginalFormatBox[dataFormat=");
        stringBuilder.append(getDataFormat());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
