package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class MLPSpecificBox extends AbstractBox {
    public static final String TYPE = "dmlp";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    int format_info;
    int peak_data_rate;
    int reserved;
    int reserved2;

    static {
        ajc$preClinit();
    }

    public MLPSpecificBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("MLPSpecificBox.java", MLPSpecificBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getFormat_info", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 49);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setFormat_info", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "format_info", "", "void"), 53);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getPeak_data_rate", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 57);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setPeak_data_rate", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "peak_data_rate", "", "void"), 61);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getReserved", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 65);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setReserved", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "reserved", "", "void"), 69);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getReserved2", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 73);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setReserved2", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "reserved2", "", "void"), 77);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBuffer);
        this.format_info = bitReaderBuffer.readBits(32);
        this.peak_data_rate = bitReaderBuffer.readBits(15);
        this.reserved = bitReaderBuffer.readBits(1);
        this.reserved2 = bitReaderBuffer.readBits(32);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
        bitWriterBuffer.writeBits(this.format_info, 32);
        bitWriterBuffer.writeBits(this.peak_data_rate, 15);
        bitWriterBuffer.writeBits(this.reserved, 1);
        bitWriterBuffer.writeBits(this.reserved2, 32);
    }

    protected long getContentSize() {
        return 10;
    }

    public int getFormat_info() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.format_info;
    }

    public int getPeak_data_rate() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.peak_data_rate;
    }

    public int getReserved() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.reserved;
    }

    public int getReserved2() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        return this.reserved2;
    }

    public void setFormat_info(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.format_info = i;
    }

    public void setPeak_data_rate(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.peak_data_rate = i;
    }

    public void setReserved(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.reserved = i;
    }

    public void setReserved2(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_7, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.reserved2 = i;
    }
}
