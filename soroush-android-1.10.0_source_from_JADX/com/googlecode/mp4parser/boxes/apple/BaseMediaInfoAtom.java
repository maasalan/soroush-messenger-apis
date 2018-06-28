package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.linphone.core.Privacy;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class BaseMediaInfoAtom extends AbstractFullBox {
    public static final String TYPE = "gmin";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_10 = null;
    private static final C7000a ajc$tjp_11 = null;
    private static final C7000a ajc$tjp_12 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    private static final C7000a ajc$tjp_8 = null;
    private static final C7000a ajc$tjp_9 = null;
    short balance;
    short graphicsMode = (short) 64;
    int opColorB = Privacy.DEFAULT;
    int opColorG = Privacy.DEFAULT;
    int opColorR = Privacy.DEFAULT;
    short reserved;

    static {
        ajc$preClinit();
    }

    public BaseMediaInfoAtom() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("BaseMediaInfoAtom.java", BaseMediaInfoAtom.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getGraphicsMode", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"), 54);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setGraphicsMode", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "graphicsMode", "", "void"), 58);
        ajc$tjp_10 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getReserved", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"), 94);
        ajc$tjp_11 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setReserved", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "reserved", "", "void"), 98);
        ajc$tjp_12 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "java.lang.String"), 103);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getOpColorR", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"), 62);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setOpColorR", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorR", "", "void"), 66);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getOpColorG", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"), 70);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setOpColorG", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorG", "", "void"), 74);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getOpColorB", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"), 78);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setOpColorB", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorB", "", "void"), 82);
        ajc$tjp_8 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getBalance", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"), 86);
        ajc$tjp_9 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setBalance", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "balance", "", "void"), 90);
    }

    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.graphicsMode = byteBuffer.getShort();
        this.opColorR = IsoTypeReader.readUInt16(byteBuffer);
        this.opColorG = IsoTypeReader.readUInt16(byteBuffer);
        this.opColorB = IsoTypeReader.readUInt16(byteBuffer);
        this.balance = byteBuffer.getShort();
        this.reserved = byteBuffer.getShort();
    }

    public short getBalance() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_8, (Object) this, (Object) this));
        return this.balance;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putShort(this.graphicsMode);
        IsoTypeWriter.writeUInt16(byteBuffer, this.opColorR);
        IsoTypeWriter.writeUInt16(byteBuffer, this.opColorG);
        IsoTypeWriter.writeUInt16(byteBuffer, this.opColorB);
        byteBuffer.putShort(this.balance);
        byteBuffer.putShort(this.reserved);
    }

    protected long getContentSize() {
        return 16;
    }

    public short getGraphicsMode() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.graphicsMode;
    }

    public int getOpColorB() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        return this.opColorB;
    }

    public int getOpColorG() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.opColorG;
    }

    public int getOpColorR() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.opColorR;
    }

    public short getReserved() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_10, (Object) this, (Object) this));
        return this.reserved;
    }

    public void setBalance(short s) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_9, (Object) this, (Object) this, C4599a.m8316a(s)));
        this.balance = s;
    }

    public void setGraphicsMode(short s) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8316a(s)));
        this.graphicsMode = s;
    }

    public void setOpColorB(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_7, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.opColorB = i;
    }

    public void setOpColorG(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.opColorG = i;
    }

    public void setOpColorR(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.opColorR = i;
    }

    public void setReserved(short s) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_11, (Object) this, (Object) this, C4599a.m8316a(s)));
        this.reserved = s;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_12, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("BaseMediaInfoAtom{graphicsMode=");
        stringBuilder.append(this.graphicsMode);
        stringBuilder.append(", opColorR=");
        stringBuilder.append(this.opColorR);
        stringBuilder.append(", opColorG=");
        stringBuilder.append(this.opColorG);
        stringBuilder.append(", opColorB=");
        stringBuilder.append(this.opColorB);
        stringBuilder.append(", balance=");
        stringBuilder.append(this.balance);
        stringBuilder.append(", reserved=");
        stringBuilder.append(this.reserved);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
