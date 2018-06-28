package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public final class OmaDrmAccessUnitFormatBox extends AbstractFullBox {
    public static final String TYPE = "odaf";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private byte allBits;
    private int initVectorLength;
    private int keyIndicatorLength;
    private boolean selectiveEncryption;

    static {
        ajc$preClinit();
    }

    public OmaDrmAccessUnitFormatBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("OmaDrmAccessUnitFormatBox.java", OmaDrmAccessUnitFormatBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "isSelectiveEncryption", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", "boolean"), 46);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getKeyIndicatorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", "int"), 50);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getInitVectorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", "int"), 54);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setInitVectorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "int", "initVectorLength", "", "void"), 58);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setKeyIndicatorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "int", "keyIndicatorLength", "", "void"), 62);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setAllBits", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "byte", "allBits", "", "void"), 66);
    }

    public final void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.allBits = (byte) IsoTypeReader.readUInt8(byteBuffer);
        this.selectiveEncryption = (this.allBits & 128) == 128;
        this.keyIndicatorLength = IsoTypeReader.readUInt8(byteBuffer);
        this.initVectorLength = IsoTypeReader.readUInt8(byteBuffer);
    }

    protected final void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt8(byteBuffer, this.allBits);
        IsoTypeWriter.writeUInt8(byteBuffer, this.keyIndicatorLength);
        IsoTypeWriter.writeUInt8(byteBuffer, this.initVectorLength);
    }

    protected final long getContentSize() {
        return 7;
    }

    public final int getInitVectorLength() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.initVectorLength;
    }

    public final int getKeyIndicatorLength() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.keyIndicatorLength;
    }

    public final boolean isSelectiveEncryption() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.selectiveEncryption;
    }

    public final void setAllBits(byte b) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, new Byte(b)));
        this.allBits = b;
        this.selectiveEncryption = (b & 128) == 128;
    }

    public final void setInitVectorLength(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.initVectorLength = i;
    }

    public final void setKeyIndicatorLength(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_4, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.keyIndicatorLength = i;
    }
}
