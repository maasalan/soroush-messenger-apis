package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class TrackExtendsBox extends AbstractFullBox {
    public static final String TYPE = "trex";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_10 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    private static final C7000a ajc$tjp_8 = null;
    private static final C7000a ajc$tjp_9 = null;
    private long defaultSampleDescriptionIndex;
    private long defaultSampleDuration;
    private SampleFlags defaultSampleFlags;
    private long defaultSampleSize;
    private long trackId;

    static {
        ajc$preClinit();
    }

    public TrackExtendsBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("TrackExtendsBox.java", TrackExtendsBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 72);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDefaultSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 76);
        ajc$tjp_10 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", "void"), 112);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 80);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 84);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 88);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDefaultSampleFlagsStr", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "java.lang.String"), 92);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "trackId", "", "void"), 96);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDefaultSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleDescriptionIndex", "", "void"), 100);
        ajc$tjp_8 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleDuration", "", "void"), 104);
        ajc$tjp_9 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleSize", "", "void"), 108);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.trackId = IsoTypeReader.readUInt32(byteBuffer);
        this.defaultSampleDescriptionIndex = IsoTypeReader.readUInt32(byteBuffer);
        this.defaultSampleDuration = IsoTypeReader.readUInt32(byteBuffer);
        this.defaultSampleSize = IsoTypeReader.readUInt32(byteBuffer);
        this.defaultSampleFlags = new SampleFlags(byteBuffer);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.trackId);
        IsoTypeWriter.writeUInt32(byteBuffer, this.defaultSampleDescriptionIndex);
        IsoTypeWriter.writeUInt32(byteBuffer, this.defaultSampleDuration);
        IsoTypeWriter.writeUInt32(byteBuffer, this.defaultSampleSize);
        this.defaultSampleFlags.getContent(byteBuffer);
    }

    protected long getContentSize() {
        return 24;
    }

    public long getDefaultSampleDescriptionIndex() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.defaultSampleDescriptionIndex;
    }

    public long getDefaultSampleDuration() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.defaultSampleDuration;
    }

    public SampleFlags getDefaultSampleFlags() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.defaultSampleFlags;
    }

    public String getDefaultSampleFlagsStr() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_5, (Object) this, (Object) this));
        return this.defaultSampleFlags.toString();
    }

    public long getDefaultSampleSize() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_3, (Object) this, (Object) this));
        return this.defaultSampleSize;
    }

    public long getTrackId() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.trackId;
    }

    public void setDefaultSampleDescriptionIndex(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_7, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.defaultSampleDescriptionIndex = j;
    }

    public void setDefaultSampleDuration(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_8, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.defaultSampleDuration = j;
    }

    public void setDefaultSampleFlags(SampleFlags sampleFlags) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_10, (Object) this, (Object) this, (Object) sampleFlags));
        this.defaultSampleFlags = sampleFlags;
    }

    public void setDefaultSampleSize(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_9, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.defaultSampleSize = j;
    }

    public void setTrackId(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_6, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.trackId = j;
    }
}
