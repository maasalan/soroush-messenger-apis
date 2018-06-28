package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class GenericMediaHeaderTextAtom extends AbstractBox {
    public static final String TYPE = "text";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_10 = null;
    private static final C7000a ajc$tjp_11 = null;
    private static final C7000a ajc$tjp_12 = null;
    private static final C7000a ajc$tjp_13 = null;
    private static final C7000a ajc$tjp_14 = null;
    private static final C7000a ajc$tjp_15 = null;
    private static final C7000a ajc$tjp_16 = null;
    private static final C7000a ajc$tjp_17 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    private static final C7000a ajc$tjp_8 = null;
    private static final C7000a ajc$tjp_9 = null;
    int unknown_1 = 65536;
    int unknown_2;
    int unknown_3;
    int unknown_4;
    int unknown_5 = 65536;
    int unknown_6;
    int unknown_7;
    int unknown_8;
    int unknown_9 = 1073741824;

    static {
        ajc$preClinit();
    }

    public GenericMediaHeaderTextAtom() {
        super("text");
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("GenericMediaHeaderTextAtom.java", GenericMediaHeaderTextAtom.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getUnknown_1", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 60);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setUnknown_1", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_1", "", "void"), 64);
        ajc$tjp_10 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getUnknown_6", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 100);
        ajc$tjp_11 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setUnknown_6", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_6", "", "void"), 104);
        ajc$tjp_12 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getUnknown_7", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 108);
        ajc$tjp_13 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setUnknown_7", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_7", "", "void"), 112);
        ajc$tjp_14 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getUnknown_8", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 116);
        ajc$tjp_15 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setUnknown_8", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_8", "", "void"), 120);
        ajc$tjp_16 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getUnknown_9", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 124);
        ajc$tjp_17 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setUnknown_9", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_9", "", "void"), 128);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getUnknown_2", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 68);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setUnknown_2", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_2", "", "void"), 72);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getUnknown_3", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 76);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setUnknown_3", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_3", "", "void"), 80);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getUnknown_4", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 84);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setUnknown_4", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_4", "", "void"), 88);
        ajc$tjp_8 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getUnknown_5", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 92);
        ajc$tjp_9 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setUnknown_5", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_5", "", "void"), 96);
    }

    protected void _parseDetails(ByteBuffer byteBuffer) {
        this.unknown_1 = byteBuffer.getInt();
        this.unknown_2 = byteBuffer.getInt();
        this.unknown_3 = byteBuffer.getInt();
        this.unknown_4 = byteBuffer.getInt();
        this.unknown_5 = byteBuffer.getInt();
        this.unknown_6 = byteBuffer.getInt();
        this.unknown_7 = byteBuffer.getInt();
        this.unknown_8 = byteBuffer.getInt();
        this.unknown_9 = byteBuffer.getInt();
    }

    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.unknown_1);
        byteBuffer.putInt(this.unknown_2);
        byteBuffer.putInt(this.unknown_3);
        byteBuffer.putInt(this.unknown_4);
        byteBuffer.putInt(this.unknown_5);
        byteBuffer.putInt(this.unknown_6);
        byteBuffer.putInt(this.unknown_7);
        byteBuffer.putInt(this.unknown_8);
        byteBuffer.putInt(this.unknown_9);
    }

    protected long getContentSize() {
        return 36;
    }

    public int getUnknown_1() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.unknown_1;
    }

    public int getUnknown_2() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.unknown_2;
    }

    public int getUnknown_3() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.unknown_3;
    }

    public int getUnknown_4() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        return this.unknown_4;
    }

    public int getUnknown_5() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_8, (Object) this, (Object) this));
        return this.unknown_5;
    }

    public int getUnknown_6() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_10, (Object) this, (Object) this));
        return this.unknown_6;
    }

    public int getUnknown_7() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_12, (Object) this, (Object) this));
        return this.unknown_7;
    }

    public int getUnknown_8() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_14, (Object) this, (Object) this));
        return this.unknown_8;
    }

    public int getUnknown_9() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_16, (Object) this, (Object) this));
        return this.unknown_9;
    }

    public void setUnknown_1(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.unknown_1 = i;
    }

    public void setUnknown_2(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.unknown_2 = i;
    }

    public void setUnknown_3(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.unknown_3 = i;
    }

    public void setUnknown_4(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_7, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.unknown_4 = i;
    }

    public void setUnknown_5(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_9, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.unknown_5 = i;
    }

    public void setUnknown_6(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_11, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.unknown_6 = i;
    }

    public void setUnknown_7(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_13, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.unknown_7 = i;
    }

    public void setUnknown_8(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_15, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.unknown_8 = i;
    }

    public void setUnknown_9(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_17, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.unknown_9 = i;
    }
}
