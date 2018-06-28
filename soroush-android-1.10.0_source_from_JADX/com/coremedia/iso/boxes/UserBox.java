package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class UserBox extends AbstractBox {
    public static final String TYPE = "uuid";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    byte[] data;

    static {
        ajc$preClinit();
    }

    public UserBox(byte[] bArr) {
        super(TYPE, bArr);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("UserBox.java", UserBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.UserBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getData", "com.coremedia.iso.boxes.UserBox", "", "", "", "[B"), 47);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setData", "com.coremedia.iso.boxes.UserBox", "[B", "data", "", "void"), 51);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.data = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.data);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(this.data);
    }

    protected long getContentSize() {
        return (long) this.data.length;
    }

    public byte[] getData() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.data;
    }

    public void setData(byte[] bArr) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_2, (Object) this, (Object) this, (Object) bArr));
        this.data = bArr;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("UserBox[type=");
        stringBuilder.append(getType());
        stringBuilder.append(";userType=");
        stringBuilder.append(new String(getUserType()));
        stringBuilder.append(";contentLength=");
        stringBuilder.append(this.data.length);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
