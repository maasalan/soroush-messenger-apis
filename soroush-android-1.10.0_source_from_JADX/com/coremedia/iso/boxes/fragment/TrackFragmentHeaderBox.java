package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class TrackFragmentHeaderBox extends AbstractFullBox {
    public static final String TYPE = "tfhd";
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
    private long baseDataOffset = -1;
    private boolean defaultBaseIsMoof;
    private long defaultSampleDuration = -1;
    private SampleFlags defaultSampleFlags;
    private long defaultSampleSize = -1;
    private boolean durationIsEmpty;
    private long sampleDescriptionIndex;
    private long trackId;

    static {
        ajc$preClinit();
    }

    public TrackFragmentHeaderBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("TrackFragmentHeaderBox.java", TrackFragmentHeaderBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "hasBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 126);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "hasSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 130);
        ajc$tjp_10 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 166);
        ajc$tjp_11 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "isDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 170);
        ajc$tjp_12 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "isDefaultBaseIsMoof", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 174);
        ajc$tjp_13 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "trackId", "", "void"), 178);
        ajc$tjp_14 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "baseDataOffset", "", "void"), 182);
        ajc$tjp_15 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "sampleDescriptionIndex", "", "void"), 191);
        ajc$tjp_16 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "defaultSampleDuration", "", "void"), 200);
        ajc$tjp_17 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "defaultSampleSize", "", "void"), 205);
        ajc$tjp_18 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", "void"), 210);
        ajc$tjp_19 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "boolean", "durationIsEmpty", "", "void"), 215);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "hasDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 134);
        ajc$tjp_20 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDefaultBaseIsMoof", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "boolean", "defaultBaseIsMoof", "", "void"), 220);
        ajc$tjp_21 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "java.lang.String"), 226);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "hasDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 138);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "hasDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 142);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 146);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 150);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 154);
        ajc$tjp_8 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 158);
        ajc$tjp_9 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 162);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.trackId = IsoTypeReader.readUInt32(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.baseDataOffset = IsoTypeReader.readUInt64(byteBuffer);
        }
        if ((getFlags() & 2) == 2) {
            this.sampleDescriptionIndex = IsoTypeReader.readUInt32(byteBuffer);
        }
        if ((getFlags() & 8) == 8) {
            this.defaultSampleDuration = IsoTypeReader.readUInt32(byteBuffer);
        }
        if ((getFlags() & 16) == 16) {
            this.defaultSampleSize = IsoTypeReader.readUInt32(byteBuffer);
        }
        if ((getFlags() & 32) == 32) {
            this.defaultSampleFlags = new SampleFlags(byteBuffer);
        }
        if ((getFlags() & 65536) == 65536) {
            this.durationIsEmpty = true;
        }
        if ((getFlags() & 131072) == 131072) {
            this.defaultBaseIsMoof = true;
        }
    }

    public long getBaseDataOffset() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        return this.baseDataOffset;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.trackId);
        if ((getFlags() & 1) == 1) {
            IsoTypeWriter.writeUInt64(byteBuffer, getBaseDataOffset());
        }
        if ((getFlags() & 2) == 2) {
            IsoTypeWriter.writeUInt32(byteBuffer, getSampleDescriptionIndex());
        }
        if ((getFlags() & 8) == 8) {
            IsoTypeWriter.writeUInt32(byteBuffer, getDefaultSampleDuration());
        }
        if ((getFlags() & 16) == 16) {
            IsoTypeWriter.writeUInt32(byteBuffer, getDefaultSampleSize());
        }
        if ((getFlags() & 32) == 32) {
            this.defaultSampleFlags.getContent(byteBuffer);
        }
    }

    protected long getContentSize() {
        int flags = getFlags();
        long j = (flags & 1) == 1 ? 16 : 8;
        if ((flags & 2) == 2) {
            j += 4;
        }
        if ((flags & 8) == 8) {
            j += 4;
        }
        if ((flags & 16) == 16) {
            j += 4;
        }
        return (flags & 32) == 32 ? j + 4 : j;
    }

    public long getDefaultSampleDuration() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_8, (Object) this, (Object) this));
        return this.defaultSampleDuration;
    }

    public SampleFlags getDefaultSampleFlags() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_10, (Object) this, (Object) this));
        return this.defaultSampleFlags;
    }

    public long getDefaultSampleSize() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_9, (Object) this, (Object) this));
        return this.defaultSampleSize;
    }

    public long getSampleDescriptionIndex() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_7, (Object) this, (Object) this));
        return this.sampleDescriptionIndex;
    }

    public long getTrackId() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_5, (Object) this, (Object) this));
        return this.trackId;
    }

    public boolean hasBaseDataOffset() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return (getFlags() & 1) != 0;
    }

    public boolean hasDefaultSampleDuration() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return (getFlags() & 8) != 0;
    }

    public boolean hasDefaultSampleFlags() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return (getFlags() & 32) != 0;
    }

    public boolean hasDefaultSampleSize() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_3, (Object) this, (Object) this));
        return (getFlags() & 16) != 0;
    }

    public boolean hasSampleDescriptionIndex() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return (getFlags() & 2) != 0;
    }

    public boolean isDefaultBaseIsMoof() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_12, (Object) this, (Object) this));
        return this.defaultBaseIsMoof;
    }

    public boolean isDurationIsEmpty() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_11, (Object) this, (Object) this));
        return this.durationIsEmpty;
    }

    public void setBaseDataOffset(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_14, (Object) this, (Object) this, C4599a.m8315a(j)));
        setFlags(j == -1 ? getFlags() & 2147483646 : getFlags() | 1);
        this.baseDataOffset = j;
    }

    public void setDefaultBaseIsMoof(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_20, (Object) this, (Object) this, C4599a.m8317a(z)));
        setFlags(getFlags() | 131072);
        this.defaultBaseIsMoof = z;
    }

    public void setDefaultSampleDuration(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_16, (Object) this, (Object) this, C4599a.m8315a(j)));
        setFlags(getFlags() | 8);
        this.defaultSampleDuration = j;
    }

    public void setDefaultSampleFlags(SampleFlags sampleFlags) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_18, (Object) this, (Object) this, (Object) sampleFlags));
        setFlags(getFlags() | 32);
        this.defaultSampleFlags = sampleFlags;
    }

    public void setDefaultSampleSize(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_17, (Object) this, (Object) this, C4599a.m8315a(j)));
        setFlags(getFlags() | 16);
        this.defaultSampleSize = j;
    }

    public void setDurationIsEmpty(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_19, (Object) this, (Object) this, C4599a.m8317a(z)));
        setFlags(getFlags() | 65536);
        this.durationIsEmpty = z;
    }

    public void setSampleDescriptionIndex(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_15, (Object) this, (Object) this, C4599a.m8315a(j)));
        setFlags(j == -1 ? getFlags() & 2147483645 : getFlags() | 2);
        this.sampleDescriptionIndex = j;
    }

    public void setTrackId(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_13, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.trackId = j;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_21, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TrackFragmentHeaderBox");
        stringBuilder.append("{trackId=");
        stringBuilder.append(this.trackId);
        stringBuilder.append(", baseDataOffset=");
        stringBuilder.append(this.baseDataOffset);
        stringBuilder.append(", sampleDescriptionIndex=");
        stringBuilder.append(this.sampleDescriptionIndex);
        stringBuilder.append(", defaultSampleDuration=");
        stringBuilder.append(this.defaultSampleDuration);
        stringBuilder.append(", defaultSampleSize=");
        stringBuilder.append(this.defaultSampleSize);
        stringBuilder.append(", defaultSampleFlags=");
        stringBuilder.append(this.defaultSampleFlags);
        stringBuilder.append(", durationIsEmpty=");
        stringBuilder.append(this.durationIsEmpty);
        stringBuilder.append(", defaultBaseIsMoof=");
        stringBuilder.append(this.defaultBaseIsMoof);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
