package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class AC3SpecificBox extends AbstractBox {
    public static final String TYPE = "dac3";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_10 = null;
    private static final C7000a ajc$tjp_11 = null;
    private static final C7000a ajc$tjp_12 = null;
    private static final C7000a ajc$tjp_13 = null;
    private static final C7000a ajc$tjp_14 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    private static final C7000a ajc$tjp_8 = null;
    private static final C7000a ajc$tjp_9 = null;
    int acmod;
    int bitRateCode;
    int bsid;
    int bsmod;
    int fscod;
    int lfeon;
    int reserved;

    static {
        ajc$preClinit();
    }

    public AC3SpecificBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("AC3SpecificBox.java", AC3SpecificBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getFscod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 55);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setFscod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "fscod", "", "void"), 59);
        ajc$tjp_10 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getBitRateCode", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 95);
        ajc$tjp_11 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setBitRateCode", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "bitRateCode", "", "void"), 99);
        ajc$tjp_12 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getReserved", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 103);
        ajc$tjp_13 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setReserved", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "reserved", "", "void"), 107);
        ajc$tjp_14 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "java.lang.String"), 112);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getBsid", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 63);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setBsid", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "bsid", "", "void"), 67);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getBsmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 71);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setBsmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "bsmod", "", "void"), 75);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getAcmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 79);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setAcmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "acmod", "", "void"), 83);
        ajc$tjp_8 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLfeon", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 87);
        ajc$tjp_9 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setLfeon", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "lfeon", "", "void"), 91);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBuffer);
        this.fscod = bitReaderBuffer.readBits(2);
        this.bsid = bitReaderBuffer.readBits(5);
        this.bsmod = bitReaderBuffer.readBits(3);
        this.acmod = bitReaderBuffer.readBits(3);
        this.lfeon = bitReaderBuffer.readBits(1);
        this.bitRateCode = bitReaderBuffer.readBits(5);
        this.reserved = bitReaderBuffer.readBits(5);
    }

    public int getAcmod() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        return this.acmod;
    }

    public int getBitRateCode() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_10, (Object) this, (Object) this));
        return this.bitRateCode;
    }

    public int getBsid() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.bsid;
    }

    public int getBsmod() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.bsmod;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
        bitWriterBuffer.writeBits(this.fscod, 2);
        bitWriterBuffer.writeBits(this.bsid, 5);
        bitWriterBuffer.writeBits(this.bsmod, 3);
        bitWriterBuffer.writeBits(this.acmod, 3);
        bitWriterBuffer.writeBits(this.lfeon, 1);
        bitWriterBuffer.writeBits(this.bitRateCode, 5);
        bitWriterBuffer.writeBits(this.reserved, 5);
    }

    protected long getContentSize() {
        return 3;
    }

    public int getFscod() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.fscod;
    }

    public int getLfeon() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_8, (Object) this, (Object) this));
        return this.lfeon;
    }

    public int getReserved() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_12, (Object) this, (Object) this));
        return this.reserved;
    }

    public void setAcmod(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_7, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.acmod = i;
    }

    public void setBitRateCode(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_11, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.bitRateCode = i;
    }

    public void setBsid(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.bsid = i;
    }

    public void setBsmod(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.bsmod = i;
    }

    public void setFscod(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.fscod = i;
    }

    public void setLfeon(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_9, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.lfeon = i;
    }

    public void setReserved(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_13, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.reserved = i;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_14, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("AC3SpecificBox{fscod=");
        stringBuilder.append(this.fscod);
        stringBuilder.append(", bsid=");
        stringBuilder.append(this.bsid);
        stringBuilder.append(", bsmod=");
        stringBuilder.append(this.bsmod);
        stringBuilder.append(", acmod=");
        stringBuilder.append(this.acmod);
        stringBuilder.append(", lfeon=");
        stringBuilder.append(this.lfeon);
        stringBuilder.append(", bitRateCode=");
        stringBuilder.append(this.bitRateCode);
        stringBuilder.append(", reserved=");
        stringBuilder.append(this.reserved);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
