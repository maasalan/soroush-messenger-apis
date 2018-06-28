package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.jivesoftware.smack.util.StringUtils;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public abstract class Utf8AppleDataBox extends AppleDataBox {
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    String value;

    static {
        ajc$preClinit();
    }

    protected Utf8AppleDataBox(String str) {
        super(str, 1);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("Utf8AppleDataBox.java", Utf8AppleDataBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getValue", "com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox", "", "", "", "java.lang.String"), 21);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setValue", "com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox", "java.lang.String", "value", "", "void"), 30);
    }

    protected int getDataLength() {
        return this.value.getBytes(Charset.forName(StringUtils.UTF8)).length;
    }

    public String getValue() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        if (!isParsed()) {
            parseDetails();
        }
        return this.value;
    }

    protected void parseData(ByteBuffer byteBuffer) {
        this.value = IsoTypeReader.readString(byteBuffer, byteBuffer.remaining());
    }

    public void setValue(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.value = str;
    }

    @DoNotParseDetail
    public byte[] writeData() {
        return Utf8.convert(this.value);
    }
}
