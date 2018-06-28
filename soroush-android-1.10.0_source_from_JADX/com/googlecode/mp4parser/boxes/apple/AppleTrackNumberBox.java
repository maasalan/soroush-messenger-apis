package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class AppleTrackNumberBox extends AppleDataBox {
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    int f20447a;
    int f20448b;

    static {
        ajc$preClinit();
    }

    public AppleTrackNumberBox() {
        super("trkn", 0);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("AppleTrackNumberBox.java", AppleTrackNumberBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getA", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", "", "", "", "int"), 16);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setA", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", "int", "a", "", "void"), 20);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getB", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", "", "", "", "int"), 24);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setB", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", "int", "b", "", "void"), 28);
    }

    public int getA() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.f20447a;
    }

    public int getB() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.f20448b;
    }

    protected int getDataLength() {
        return 8;
    }

    protected void parseData(ByteBuffer byteBuffer) {
        this.f20447a = byteBuffer.getInt();
        this.f20448b = byteBuffer.getInt();
    }

    public void setA(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.f20447a = i;
    }

    public void setB(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.f20448b = i;
    }

    protected byte[] writeData() {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(this.f20447a);
        allocate.putInt(this.f20448b);
        return allocate.array();
    }
}
