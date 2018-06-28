package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.jivesoftware.smack.roster.Roster;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class TrackRunBox extends AbstractFullBox {
    public static final String TYPE = "trun";
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
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    private static final C7000a ajc$tjp_8 = null;
    private static final C7000a ajc$tjp_9 = null;
    private int dataOffset;
    private List<Entry> entries = new ArrayList();
    private SampleFlags firstSampleFlags;

    public static class Entry {
        private long sampleCompositionTimeOffset;
        private long sampleDuration;
        private SampleFlags sampleFlags;
        private long sampleSize;

        public Entry(long j, long j2, SampleFlags sampleFlags, int i) {
            this.sampleDuration = j;
            this.sampleSize = j2;
            this.sampleFlags = sampleFlags;
            this.sampleCompositionTimeOffset = (long) i;
        }

        public long getSampleCompositionTimeOffset() {
            return this.sampleCompositionTimeOffset;
        }

        public long getSampleDuration() {
            return this.sampleDuration;
        }

        public SampleFlags getSampleFlags() {
            return this.sampleFlags;
        }

        public long getSampleSize() {
            return this.sampleSize;
        }

        public void setSampleCompositionTimeOffset(int i) {
            this.sampleCompositionTimeOffset = (long) i;
        }

        public void setSampleDuration(long j) {
            this.sampleDuration = j;
        }

        public void setSampleFlags(SampleFlags sampleFlags) {
            this.sampleFlags = sampleFlags;
        }

        public void setSampleSize(long j) {
            this.sampleSize = j;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Entry{duration=");
            stringBuilder.append(this.sampleDuration);
            stringBuilder.append(", size=");
            stringBuilder.append(this.sampleSize);
            stringBuilder.append(", dlags=");
            stringBuilder.append(this.sampleFlags);
            stringBuilder.append(", compTimeOffset=");
            stringBuilder.append(this.sampleCompositionTimeOffset);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public TrackRunBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("TrackRunBox.java", TrackRunBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.util.List"), 57);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", "int", "dataOffset", "", "void"), 120);
        ajc$tjp_10 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 267);
        ajc$tjp_11 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 275);
        ajc$tjp_12 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 283);
        ajc$tjp_13 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 292);
        ajc$tjp_14 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), (int) IjkMediaCodecInfo.RANK_SECURE);
        ajc$tjp_15 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "int"), 309);
        ajc$tjp_16 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 313);
        ajc$tjp_17 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "firstSampleFlags", "", "void"), 317);
        ajc$tjp_18 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.lang.String"), 327);
        ajc$tjp_19 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "java.util.List", "entries", "", "void"), 342);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSampleCompositionTimeOffsets", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "[J"), 129);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSampleCount", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "long"), 238);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "isDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 242);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "isFirstSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 246);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "isSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 251);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "isSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 255);
        ajc$tjp_8 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "isSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 259);
        ajc$tjp_9 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "isSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 263);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        long readUInt32 = IsoTypeReader.readUInt32(byteBuffer);
        this.dataOffset = (getFlags() & 1) == 1 ? CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer)) : -1;
        if ((getFlags() & 4) == 4) {
            this.firstSampleFlags = new SampleFlags(byteBuffer);
        }
        for (int i = 0; ((long) i) < readUInt32; i++) {
            Entry entry = new Entry();
            if ((getFlags() & 256) == 256) {
                entry.sampleDuration = IsoTypeReader.readUInt32(byteBuffer);
            }
            if ((getFlags() & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) {
                entry.sampleSize = IsoTypeReader.readUInt32(byteBuffer);
            }
            if ((getFlags() & Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE) == Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE) {
                entry.sampleFlags = new SampleFlags(byteBuffer);
            }
            if ((getFlags() & 2048) == 2048) {
                entry.sampleCompositionTimeOffset = (long) byteBuffer.getInt();
            }
            this.entries.add(entry);
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.entries.size());
        int flags = getFlags();
        if ((flags & 1) == 1) {
            IsoTypeWriter.writeUInt32(byteBuffer, (long) this.dataOffset);
        }
        if ((flags & 4) == 4) {
            this.firstSampleFlags.getContent(byteBuffer);
        }
        for (Entry entry : this.entries) {
            if ((flags & 256) == 256) {
                IsoTypeWriter.writeUInt32(byteBuffer, entry.sampleDuration);
            }
            if ((flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) {
                IsoTypeWriter.writeUInt32(byteBuffer, entry.sampleSize);
            }
            if ((flags & Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE) == Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE) {
                entry.sampleFlags.getContent(byteBuffer);
            }
            if ((flags & 2048) == 2048) {
                if (getVersion() == 0) {
                    IsoTypeWriter.writeUInt32(byteBuffer, entry.sampleCompositionTimeOffset);
                } else {
                    byteBuffer.putInt((int) entry.sampleCompositionTimeOffset);
                }
            }
        }
    }

    protected long getContentSize() {
        int flags = getFlags();
        long j = (flags & 1) == 1 ? 12 : 8;
        if ((flags & 4) == 4) {
            j += 4;
        }
        long j2 = 0;
        if ((flags & 256) == 256) {
            j2 = 4;
        }
        if ((flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) {
            j2 += 4;
        }
        if ((flags & Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE) == Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE) {
            j2 += 4;
        }
        if ((flags & 2048) == 2048) {
            j2 += 4;
        }
        return j + (j2 * ((long) this.entries.size()));
    }

    public int getDataOffset() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_15, (Object) this, (Object) this));
        return this.dataOffset;
    }

    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.entries;
    }

    public SampleFlags getFirstSampleFlags() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_16, (Object) this, (Object) this));
        return this.firstSampleFlags;
    }

    public long[] getSampleCompositionTimeOffsets() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        if (!isSampleCompositionTimeOffsetPresent()) {
            return null;
        }
        long[] jArr = new long[this.entries.size()];
        for (int i = 0; i < jArr.length; i++) {
            jArr[i] = ((Entry) this.entries.get(i)).getSampleCompositionTimeOffset();
        }
        return jArr;
    }

    public long getSampleCount() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_3, (Object) this, (Object) this));
        return (long) this.entries.size();
    }

    public boolean isDataOffsetPresent() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return (getFlags() & 1) == 1;
    }

    public boolean isFirstSampleFlagsPresent() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_5, (Object) this, (Object) this));
        return (getFlags() & 4) == 4;
    }

    public boolean isSampleCompositionTimeOffsetPresent() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_9, (Object) this, (Object) this));
        return (getFlags() & 2048) == 2048;
    }

    public boolean isSampleDurationPresent() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_7, (Object) this, (Object) this));
        return (getFlags() & 256) == 256;
    }

    public boolean isSampleFlagsPresent() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_8, (Object) this, (Object) this));
        return (getFlags() & Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE) == Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE;
    }

    public boolean isSampleSizePresent() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        return (getFlags() & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
    }

    public void setDataOffset(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8314a(i)));
        setFlags(i == -1 ? getFlags() & 16777214 : getFlags() | 1);
        this.dataOffset = i;
    }

    public void setDataOffsetPresent(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_10, (Object) this, (Object) this, C4599a.m8317a(z)));
        setFlags(z ? getFlags() | 1 : getFlags() & 16777214);
    }

    public void setEntries(List<Entry> list) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_19, (Object) this, (Object) this, (Object) list));
        this.entries = list;
    }

    public void setFirstSampleFlags(SampleFlags sampleFlags) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_17, (Object) this, (Object) this, (Object) sampleFlags));
        setFlags(sampleFlags == null ? getFlags() & 16777211 : getFlags() | 4);
        this.firstSampleFlags = sampleFlags;
    }

    public void setSampleCompositionTimeOffsetPresent(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_14, (Object) this, (Object) this, C4599a.m8317a(z)));
        setFlags(z ? getFlags() | 2048 : getFlags() & 16775167);
    }

    public void setSampleDurationPresent(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_12, (Object) this, (Object) this, C4599a.m8317a(z)));
        setFlags(z ? getFlags() | 256 : getFlags() & 16776959);
    }

    public void setSampleFlagsPresent(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_13, (Object) this, (Object) this, C4599a.m8317a(z)));
        setFlags(z ? getFlags() | Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE : getFlags() & 16776191);
    }

    public void setSampleSizePresent(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_11, (Object) this, (Object) this, C4599a.m8317a(z)));
        setFlags(z ? getFlags() | IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED : getFlags() & 16776703);
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_18, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TrackRunBox");
        stringBuilder.append("{sampleCount=");
        stringBuilder.append(this.entries.size());
        stringBuilder.append(", dataOffset=");
        stringBuilder.append(this.dataOffset);
        stringBuilder.append(", dataOffsetPresent=");
        stringBuilder.append(isDataOffsetPresent());
        stringBuilder.append(", sampleSizePresent=");
        stringBuilder.append(isSampleSizePresent());
        stringBuilder.append(", sampleDurationPresent=");
        stringBuilder.append(isSampleDurationPresent());
        stringBuilder.append(", sampleFlagsPresentPresent=");
        stringBuilder.append(isSampleFlagsPresent());
        stringBuilder.append(", sampleCompositionTimeOffsetPresent=");
        stringBuilder.append(isSampleCompositionTimeOffsetPresent());
        stringBuilder.append(", firstSampleFlags=");
        stringBuilder.append(this.firstSampleFlags);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
