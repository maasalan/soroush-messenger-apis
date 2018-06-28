package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class AmrSpecificBox extends AbstractBox {
    public static final String TYPE = "damr";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private int decoderVersion;
    private int framesPerSample;
    private int modeChangePeriod;
    private int modeSet;
    private String vendor;

    static {
        ajc$preClinit();
    }

    public AmrSpecificBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("AmrSpecificBox.java", AmrSpecificBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getVendor", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDecoderVersion", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 50);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getModeSet", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 54);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getModeChangePeriod", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 58);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getFramesPerSample", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 62);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getContent", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 84);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"), 92);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        this.vendor = IsoFile.bytesToFourCC(bArr);
        this.decoderVersion = IsoTypeReader.readUInt8(byteBuffer);
        this.modeSet = IsoTypeReader.readUInt16(byteBuffer);
        this.modeChangePeriod = IsoTypeReader.readUInt8(byteBuffer);
        this.framesPerSample = IsoTypeReader.readUInt8(byteBuffer);
    }

    public void getContent(ByteBuffer byteBuffer) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, (Object) byteBuffer));
        byteBuffer.put(IsoFile.fourCCtoBytes(this.vendor));
        IsoTypeWriter.writeUInt8(byteBuffer, this.decoderVersion);
        IsoTypeWriter.writeUInt16(byteBuffer, this.modeSet);
        IsoTypeWriter.writeUInt8(byteBuffer, this.modeChangePeriod);
        IsoTypeWriter.writeUInt8(byteBuffer, this.framesPerSample);
    }

    protected long getContentSize() {
        return 9;
    }

    public int getDecoderVersion() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.decoderVersion;
    }

    public int getFramesPerSample() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.framesPerSample;
    }

    public int getModeChangePeriod() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_3, (Object) this, (Object) this));
        return this.modeChangePeriod;
    }

    public int getModeSet() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.modeSet;
    }

    public String getVendor() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.vendor;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AmrSpecificBox[vendor=");
        stringBuilder.append(getVendor());
        stringBuilder.append(";decoderVersion=");
        stringBuilder.append(getDecoderVersion());
        stringBuilder.append(";modeSet=");
        stringBuilder.append(getModeSet());
        stringBuilder.append(";modeChangePeriod=");
        stringBuilder.append(getModeChangePeriod());
        stringBuilder.append(";framesPerSample=");
        stringBuilder.append(getFramesPerSample());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
