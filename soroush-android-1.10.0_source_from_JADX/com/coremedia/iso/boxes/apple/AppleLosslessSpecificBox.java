package com.coremedia.iso.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public final class AppleLosslessSpecificBox extends AbstractFullBox {
    public static final String TYPE = "alac";
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
    private static final C7000a ajc$tjp_18 = null;
    private static final C7000a ajc$tjp_19 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_20 = null;
    private static final C7000a ajc$tjp_21 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    private static final C7000a ajc$tjp_8 = null;
    private static final C7000a ajc$tjp_9 = null;
    private long bitRate;
    private int channels;
    private int historyMult;
    private int initialHistory;
    private int kModifier;
    private long maxCodedFrameSize;
    private long maxSamplePerFrame;
    private long sampleRate;
    private int sampleSize;
    private int unknown1;
    private int unknown2;

    static {
        ajc$preClinit();
    }

    public AppleLosslessSpecificBox() {
        super("alac");
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("AppleLosslessSpecificBox.java", AppleLosslessSpecificBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 34);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "maxSamplePerFrame", "", "void"), 38);
        ajc$tjp_10 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 74);
        ajc$tjp_11 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "kModifier", "", "void"), 78);
        ajc$tjp_12 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 82);
        ajc$tjp_13 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "channels", "", "void"), 86);
        ajc$tjp_14 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 90);
        ajc$tjp_15 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "unknown2", "", "void"), 94);
        ajc$tjp_16 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 98);
        ajc$tjp_17 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "maxCodedFrameSize", "", "void"), 102);
        ajc$tjp_18 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 106);
        ajc$tjp_19 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "bitRate", "", "void"), 110);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 42);
        ajc$tjp_20 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 114);
        ajc$tjp_21 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "sampleRate", "", "void"), 118);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "unknown1", "", "void"), 46);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 50);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "sampleSize", "", "void"), 54);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 58);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "historyMult", "", "void"), 62);
        ajc$tjp_8 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 66);
        ajc$tjp_9 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "initialHistory", "", "void"), 70);
    }

    public final void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.maxSamplePerFrame = IsoTypeReader.readUInt32(byteBuffer);
        this.unknown1 = IsoTypeReader.readUInt8(byteBuffer);
        this.sampleSize = IsoTypeReader.readUInt8(byteBuffer);
        this.historyMult = IsoTypeReader.readUInt8(byteBuffer);
        this.initialHistory = IsoTypeReader.readUInt8(byteBuffer);
        this.kModifier = IsoTypeReader.readUInt8(byteBuffer);
        this.channels = IsoTypeReader.readUInt8(byteBuffer);
        this.unknown2 = IsoTypeReader.readUInt16(byteBuffer);
        this.maxCodedFrameSize = IsoTypeReader.readUInt32(byteBuffer);
        this.bitRate = IsoTypeReader.readUInt32(byteBuffer);
        this.sampleRate = IsoTypeReader.readUInt32(byteBuffer);
    }

    public final long getBitRate() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_18, (Object) this, (Object) this));
        return this.bitRate;
    }

    public final int getChannels() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_12, (Object) this, (Object) this));
        return this.channels;
    }

    protected final void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.maxSamplePerFrame);
        IsoTypeWriter.writeUInt8(byteBuffer, this.unknown1);
        IsoTypeWriter.writeUInt8(byteBuffer, this.sampleSize);
        IsoTypeWriter.writeUInt8(byteBuffer, this.historyMult);
        IsoTypeWriter.writeUInt8(byteBuffer, this.initialHistory);
        IsoTypeWriter.writeUInt8(byteBuffer, this.kModifier);
        IsoTypeWriter.writeUInt8(byteBuffer, this.channels);
        IsoTypeWriter.writeUInt16(byteBuffer, this.unknown2);
        IsoTypeWriter.writeUInt32(byteBuffer, this.maxCodedFrameSize);
        IsoTypeWriter.writeUInt32(byteBuffer, this.bitRate);
        IsoTypeWriter.writeUInt32(byteBuffer, this.sampleRate);
    }

    protected final long getContentSize() {
        return 28;
    }

    public final int getHistoryMult() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        return this.historyMult;
    }

    public final int getInitialHistory() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_8, (Object) this, (Object) this));
        return this.initialHistory;
    }

    public final int getKModifier() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_10, (Object) this, (Object) this));
        return this.kModifier;
    }

    public final long getMaxCodedFrameSize() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_16, (Object) this, (Object) this));
        return this.maxCodedFrameSize;
    }

    public final long getMaxSamplePerFrame() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.maxSamplePerFrame;
    }

    public final long getSampleRate() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_20, (Object) this, (Object) this));
        return this.sampleRate;
    }

    public final int getSampleSize() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.sampleSize;
    }

    public final int getUnknown1() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.unknown1;
    }

    public final int getUnknown2() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_14, (Object) this, (Object) this));
        return this.unknown2;
    }

    public final void setBitRate(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_19, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.bitRate = (long) i;
    }

    public final void setChannels(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_13, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.channels = i;
    }

    public final void setHistoryMult(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_7, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.historyMult = i;
    }

    public final void setInitialHistory(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_9, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.initialHistory = i;
    }

    public final void setKModifier(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_11, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.kModifier = i;
    }

    public final void setMaxCodedFrameSize(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_17, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.maxCodedFrameSize = (long) i;
    }

    public final void setMaxSamplePerFrame(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.maxSamplePerFrame = (long) i;
    }

    public final void setSampleRate(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_21, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.sampleRate = (long) i;
    }

    public final void setSampleSize(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.sampleSize = i;
    }

    public final void setUnknown1(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.unknown1 = i;
    }

    public final void setUnknown2(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_15, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.unknown2 = i;
    }
}
