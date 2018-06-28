package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class AppleGPSCoordinatesBox extends AbstractBox {
    private static final int DEFAULT_LANG = 5575;
    public static final String TYPE = "©xyz";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    String coords;
    int lang = DEFAULT_LANG;

    static {
        ajc$preClinit();
    }

    public AppleGPSCoordinatesBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("AppleGPSCoordinatesBox.java", AppleGPSCoordinatesBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getValue", "com.googlecode.mp4parser.boxes.apple.AppleGPSCoordinatesBox", "", "", "", "java.lang.String"), 22);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setValue", "com.googlecode.mp4parser.boxes.apple.AppleGPSCoordinatesBox", "java.lang.String", "iso6709String", "", "void"), 26);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.googlecode.mp4parser.boxes.apple.AppleGPSCoordinatesBox", "", "", "", "java.lang.String"), 52);
    }

    protected void _parseDetails(ByteBuffer byteBuffer) {
        short s = byteBuffer.getShort();
        this.lang = byteBuffer.getShort();
        byte[] bArr = new byte[s];
        byteBuffer.get(bArr);
        this.coords = Utf8.convert(bArr);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.putShort((short) this.coords.length());
        byteBuffer.putShort((short) this.lang);
        byteBuffer.put(Utf8.convert(this.coords));
    }

    protected long getContentSize() {
        return (long) (4 + Utf8.utf8StringLengthInBytes(this.coords));
    }

    public String getValue() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.coords;
    }

    public void setValue(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.lang = DEFAULT_LANG;
        this.coords = str;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("AppleGPSCoordinatesBox[");
        stringBuilder.append(this.coords);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
