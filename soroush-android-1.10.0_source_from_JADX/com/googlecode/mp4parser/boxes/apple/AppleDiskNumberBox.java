package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class AppleDiskNumberBox extends AppleDataBox {
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    int f20445a;
    short f20446b;

    static {
        ajc$preClinit();
    }

    public AppleDiskNumberBox() {
        super("disk", 0);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("AppleDiskNumberBox.java", AppleDiskNumberBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getA", "com.googlecode.mp4parser.boxes.apple.AppleDiskNumberBox", "", "", "", "int"), 16);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setA", "com.googlecode.mp4parser.boxes.apple.AppleDiskNumberBox", "int", "a", "", "void"), 20);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getB", "com.googlecode.mp4parser.boxes.apple.AppleDiskNumberBox", "", "", "", "short"), 24);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setB", "com.googlecode.mp4parser.boxes.apple.AppleDiskNumberBox", "short", "b", "", "void"), 28);
    }

    public int getA() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.f20445a;
    }

    public short getB() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.f20446b;
    }

    protected int getDataLength() {
        return 6;
    }

    protected void parseData(ByteBuffer byteBuffer) {
        this.f20445a = byteBuffer.getInt();
        this.f20446b = byteBuffer.getShort();
    }

    public void setA(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.f20445a = i;
    }

    public void setB(short s) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, C4599a.m8316a(s)));
        this.f20446b = s;
    }

    protected byte[] writeData() {
        ByteBuffer allocate = ByteBuffer.allocate(6);
        allocate.putInt(this.f20445a);
        allocate.putShort(this.f20446b);
        return allocate.array();
    }
}
