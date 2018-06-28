package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.sampleentry.SampleEntry;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class TimeCodeBox extends AbstractBox implements SampleEntry {
    public static final String TYPE = "tmcd";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_10 = null;
    private static final C7000a ajc$tjp_11 = null;
    private static final C7000a ajc$tjp_12 = null;
    private static final C7000a ajc$tjp_13 = null;
    private static final C7000a ajc$tjp_14 = null;
    private static final C7000a ajc$tjp_15 = null;
    private static final C7000a ajc$tjp_16 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    private static final C7000a ajc$tjp_8 = null;
    private static final C7000a ajc$tjp_9 = null;
    int dataReferenceIndex;
    long flags;
    int frameDuration;
    int numberOfFrames;
    int reserved1;
    int reserved2;
    byte[] rest = new byte[0];
    int timeScale;

    static {
        ajc$preClinit();
    }

    public TimeCodeBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("TimeCodeBox.java", TimeCodeBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDataReferenceIndex", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 81);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDataReferenceIndex", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "dataReferenceIndex", "", "void"), 85);
        ajc$tjp_10 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setReserved1", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "reserved1", "", "void"), 130);
        ajc$tjp_11 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getReserved2", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 134);
        ajc$tjp_12 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setReserved2", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "reserved2", "", "void"), 138);
        ajc$tjp_13 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getFlags", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "long"), 142);
        ajc$tjp_14 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setFlags", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "long", "flags", "", "void"), 146);
        ajc$tjp_15 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getRest", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "[B"), 150);
        ajc$tjp_16 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setRest", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "[B", "rest", "", "void"), 154);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "java.lang.String"), 91);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getTimeScale", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 102);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setTimeScale", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "timeScale", "", "void"), 106);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getFrameDuration", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 110);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setFrameDuration", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "frameDuration", "", "void"), 114);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getNumberOfFrames", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 118);
        ajc$tjp_8 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setNumberOfFrames", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "numberOfFrames", "", "void"), (int) IjkMediaMeta.FF_PROFILE_H264_HIGH_422);
        ajc$tjp_9 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getReserved1", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 126);
    }

    protected void _parseDetails(ByteBuffer byteBuffer) {
        byteBuffer.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer);
        this.reserved1 = byteBuffer.getInt();
        this.flags = IsoTypeReader.readUInt32(byteBuffer);
        this.timeScale = byteBuffer.getInt();
        this.frameDuration = byteBuffer.getInt();
        this.numberOfFrames = IsoTypeReader.readUInt8(byteBuffer);
        this.reserved2 = IsoTypeReader.readUInt24(byteBuffer);
        this.rest = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.rest);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(new byte[6]);
        IsoTypeWriter.writeUInt16(byteBuffer, this.dataReferenceIndex);
        byteBuffer.putInt(this.reserved1);
        IsoTypeWriter.writeUInt32(byteBuffer, this.flags);
        byteBuffer.putInt(this.timeScale);
        byteBuffer.putInt(this.frameDuration);
        IsoTypeWriter.writeUInt8(byteBuffer, this.numberOfFrames);
        IsoTypeWriter.writeUInt24(byteBuffer, this.reserved2);
        byteBuffer.put(this.rest);
    }

    protected long getContentSize() {
        return (long) (28 + this.rest.length);
    }

    public int getDataReferenceIndex() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.dataReferenceIndex;
    }

    public long getFlags() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_13, (Object) this, (Object) this));
        return this.flags;
    }

    public int getFrameDuration() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_5, (Object) this, (Object) this));
        return this.frameDuration;
    }

    public int getNumberOfFrames() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_7, (Object) this, (Object) this));
        return this.numberOfFrames;
    }

    public int getReserved1() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_9, (Object) this, (Object) this));
        return this.reserved1;
    }

    public int getReserved2() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_11, (Object) this, (Object) this));
        return this.reserved2;
    }

    public byte[] getRest() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_15, (Object) this, (Object) this));
        return this.rest;
    }

    public int getTimeScale() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_3, (Object) this, (Object) this));
        return this.timeScale;
    }

    public void setDataReferenceIndex(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.dataReferenceIndex = i;
    }

    public void setFlags(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_14, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.flags = j;
    }

    public void setFrameDuration(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_6, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.frameDuration = i;
    }

    public void setNumberOfFrames(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_8, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.numberOfFrames = i;
    }

    public void setReserved1(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_10, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.reserved1 = i;
    }

    public void setReserved2(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_12, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.reserved2 = i;
    }

    public void setRest(byte[] bArr) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_16, (Object) this, (Object) this, (Object) bArr));
        this.rest = bArr;
    }

    public void setTimeScale(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_4, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.timeScale = i;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("TimeCodeBox{timeScale=");
        stringBuilder.append(this.timeScale);
        stringBuilder.append(", frameDuration=");
        stringBuilder.append(this.frameDuration);
        stringBuilder.append(", numberOfFrames=");
        stringBuilder.append(this.numberOfFrames);
        stringBuilder.append(", reserved1=");
        stringBuilder.append(this.reserved1);
        stringBuilder.append(", reserved2=");
        stringBuilder.append(this.reserved2);
        stringBuilder.append(", flags=");
        stringBuilder.append(this.flags);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
