package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class AppleCoverBox extends AppleDataBox {
    private static final int IMAGE_TYPE_JPG = 13;
    private static final int IMAGE_TYPE_PNG = 14;
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private byte[] data;

    static {
        ajc$preClinit();
    }

    public AppleCoverBox() {
        super("covr", 1);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("AppleCoverBox.java", AppleCoverBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getCoverData", "com.googlecode.mp4parser.boxes.apple.AppleCoverBox", "", "", "", "[B"), 21);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setJpg", "com.googlecode.mp4parser.boxes.apple.AppleCoverBox", "[B", "data", "", "void"), 25);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setPng", "com.googlecode.mp4parser.boxes.apple.AppleCoverBox", "[B", "data", "", "void"), 29);
    }

    private void setImageData(byte[] bArr, int i) {
        this.data = bArr;
        this.dataType = i;
    }

    public byte[] getCoverData() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.data;
    }

    protected int getDataLength() {
        return this.data.length;
    }

    protected void parseData(ByteBuffer byteBuffer) {
        this.data = new byte[byteBuffer.limit()];
        byteBuffer.get(this.data);
    }

    public void setJpg(byte[] bArr) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) bArr));
        setImageData(bArr, 13);
    }

    public void setPng(byte[] bArr) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_2, (Object) this, (Object) this, (Object) bArr));
        setImageData(bArr, 14);
    }

    protected byte[] writeData() {
        return this.data;
    }
}
