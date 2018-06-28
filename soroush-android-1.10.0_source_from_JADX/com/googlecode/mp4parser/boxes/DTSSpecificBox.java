package com.googlecode.mp4parser.boxes;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import java.nio.ByteBuffer;
import org.jivesoftware.smack.roster.Roster;
import org.linphone.core.Privacy;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class DTSSpecificBox extends AbstractBox {
    public static final String TYPE = "ddts";
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
    private static final C7000a ajc$tjp_22 = null;
    private static final C7000a ajc$tjp_23 = null;
    private static final C7000a ajc$tjp_24 = null;
    private static final C7000a ajc$tjp_25 = null;
    private static final C7000a ajc$tjp_26 = null;
    private static final C7000a ajc$tjp_27 = null;
    private static final C7000a ajc$tjp_28 = null;
    private static final C7000a ajc$tjp_29 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_30 = null;
    private static final C7000a ajc$tjp_31 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    private static final C7000a ajc$tjp_8 = null;
    private static final C7000a ajc$tjp_9 = null;
    long DTSSamplingFrequency;
    int LBRDurationMod;
    long avgBitRate;
    int channelLayout;
    int coreLFEPresent;
    int coreLayout;
    int coreSize;
    int frameDuration;
    long maxBitRate;
    int multiAssetFlag;
    int pcmSampleDepth;
    int representationType;
    int reserved;
    int reservedBoxPresent;
    int stereoDownmix;
    int streamConstruction;

    static {
        ajc$preClinit();
    }

    public DTSSpecificBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("DTSSpecificBox.java", DTSSpecificBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getAvgBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"), 89);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setAvgBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "avgBitRate", "", "void"), 93);
        ajc$tjp_10 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getStreamConstruction", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 129);
        ajc$tjp_11 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setStreamConstruction", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "streamConstruction", "", "void"), 133);
        ajc$tjp_12 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getCoreLFEPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 137);
        ajc$tjp_13 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setCoreLFEPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreLFEPresent", "", "void"), 141);
        ajc$tjp_14 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getCoreLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 145);
        ajc$tjp_15 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setCoreLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreLayout", "", "void"), 149);
        ajc$tjp_16 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getCoreSize", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 153);
        ajc$tjp_17 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setCoreSize", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreSize", "", "void"), 157);
        ajc$tjp_18 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getStereoDownmix", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 161);
        ajc$tjp_19 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setStereoDownmix", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "stereoDownmix", "", "void"), 165);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDTSSamplingFrequency", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"), 97);
        ajc$tjp_20 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getRepresentationType", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 169);
        ajc$tjp_21 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setRepresentationType", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "representationType", "", "void"), 173);
        ajc$tjp_22 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getChannelLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 177);
        ajc$tjp_23 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setChannelLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "channelLayout", "", "void"), 181);
        ajc$tjp_24 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getMultiAssetFlag", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 185);
        ajc$tjp_25 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setMultiAssetFlag", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "multiAssetFlag", "", "void"), 189);
        ajc$tjp_26 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLBRDurationMod", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 193);
        ajc$tjp_27 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setLBRDurationMod", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "LBRDurationMod", "", "void"), 197);
        ajc$tjp_28 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getReserved", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 201);
        ajc$tjp_29 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setReserved", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "reserved", "", "void"), 205);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDTSSamplingFrequency", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "DTSSamplingFrequency", "", "void"), 101);
        ajc$tjp_30 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getReservedBoxPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 209);
        ajc$tjp_31 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setReservedBoxPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "reservedBoxPresent", "", "void"), 213);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getMaxBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"), 105);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setMaxBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "maxBitRate", "", "void"), 109);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getPcmSampleDepth", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 113);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setPcmSampleDepth", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "pcmSampleDepth", "", "void"), 117);
        ajc$tjp_8 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getFrameDuration", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 121);
        ajc$tjp_9 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setFrameDuration", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "frameDuration", "", "void"), 125);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.DTSSamplingFrequency = IsoTypeReader.readUInt32(byteBuffer);
        this.maxBitRate = IsoTypeReader.readUInt32(byteBuffer);
        this.avgBitRate = IsoTypeReader.readUInt32(byteBuffer);
        this.pcmSampleDepth = IsoTypeReader.readUInt8(byteBuffer);
        BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBuffer);
        this.frameDuration = bitReaderBuffer.readBits(2);
        this.streamConstruction = bitReaderBuffer.readBits(5);
        this.coreLFEPresent = bitReaderBuffer.readBits(1);
        this.coreLayout = bitReaderBuffer.readBits(6);
        this.coreSize = bitReaderBuffer.readBits(14);
        this.stereoDownmix = bitReaderBuffer.readBits(1);
        this.representationType = bitReaderBuffer.readBits(3);
        this.channelLayout = bitReaderBuffer.readBits(16);
        this.multiAssetFlag = bitReaderBuffer.readBits(1);
        this.LBRDurationMod = bitReaderBuffer.readBits(1);
        this.reservedBoxPresent = bitReaderBuffer.readBits(1);
        this.reserved = bitReaderBuffer.readBits(5);
    }

    public long getAvgBitRate() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.avgBitRate;
    }

    public int getChannelLayout() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_22, (Object) this, (Object) this));
        return this.channelLayout;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt32(byteBuffer, this.DTSSamplingFrequency);
        IsoTypeWriter.writeUInt32(byteBuffer, this.maxBitRate);
        IsoTypeWriter.writeUInt32(byteBuffer, this.avgBitRate);
        IsoTypeWriter.writeUInt8(byteBuffer, this.pcmSampleDepth);
        BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
        bitWriterBuffer.writeBits(this.frameDuration, 2);
        bitWriterBuffer.writeBits(this.streamConstruction, 5);
        bitWriterBuffer.writeBits(this.coreLFEPresent, 1);
        bitWriterBuffer.writeBits(this.coreLayout, 6);
        bitWriterBuffer.writeBits(this.coreSize, 14);
        bitWriterBuffer.writeBits(this.stereoDownmix, 1);
        bitWriterBuffer.writeBits(this.representationType, 3);
        bitWriterBuffer.writeBits(this.channelLayout, 16);
        bitWriterBuffer.writeBits(this.multiAssetFlag, 1);
        bitWriterBuffer.writeBits(this.LBRDurationMod, 1);
        bitWriterBuffer.writeBits(this.reservedBoxPresent, 1);
        bitWriterBuffer.writeBits(this.reserved, 5);
    }

    protected long getContentSize() {
        return 20;
    }

    public int getCoreLFEPresent() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_12, (Object) this, (Object) this));
        return this.coreLFEPresent;
    }

    public int getCoreLayout() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_14, (Object) this, (Object) this));
        return this.coreLayout;
    }

    public int getCoreSize() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_16, (Object) this, (Object) this));
        return this.coreSize;
    }

    public long getDTSSamplingFrequency() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.DTSSamplingFrequency;
    }

    @DoNotParseDetail
    public int[] getDashAudioChannelConfiguration() {
        int i;
        int i2;
        int channelLayout = getChannelLayout();
        if ((channelLayout & 1) == 1) {
            i = 4;
            i2 = 1;
        } else {
            i2 = 0;
            i = i2;
        }
        if ((channelLayout & 2) == 2) {
            i2 += 2;
            i = (i | 1) | 2;
        }
        if ((channelLayout & 4) == 4) {
            i2 += 2;
            i = (i | 16) | 32;
        }
        if ((channelLayout & 8) == 8) {
            i2++;
            i |= 8;
        }
        if ((channelLayout & 16) == 16) {
            i2++;
            i |= 256;
        }
        if ((channelLayout & 32) == 32) {
            i2 += 2;
            i = (i | ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) | 16384;
        }
        if ((channelLayout & 64) == 64) {
            i2 += 2;
            i = (i | 16) | 32;
        }
        if ((channelLayout & 128) == 128) {
            i2++;
            i |= 8192;
        }
        if ((channelLayout & 256) == 256) {
            i2++;
            i |= 2048;
        }
        if ((channelLayout & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) {
            i2 += 2;
            i = (i | 64) | 128;
        }
        if ((channelLayout & Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE) == Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE) {
            i2 += 2;
            i = (i | IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) | Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE;
        }
        if ((channelLayout & 2048) == 2048) {
            i2 += 2;
            i = (i | 16) | 32;
        }
        if ((channelLayout & ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) {
            i2++;
            i |= 8;
        }
        if ((channelLayout & 8192) == 8192) {
            i2 += 2;
            i = (i | 16) | 32;
        }
        if ((channelLayout & 16384) == 16384) {
            i2++;
            i |= 65536;
        }
        if ((Privacy.DEFAULT & channelLayout) == Privacy.DEFAULT) {
            i2 += 2;
            i = 131072 | (Privacy.DEFAULT | i);
        }
        if ((65536 & channelLayout) == 65536) {
            i2++;
        }
        if ((channelLayout & 131072) == 131072) {
            i2 += 2;
        }
        return new int[]{i2, i};
    }

    public int getFrameDuration() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_8, (Object) this, (Object) this));
        return this.frameDuration;
    }

    public int getLBRDurationMod() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_26, (Object) this, (Object) this));
        return this.LBRDurationMod;
    }

    public long getMaxBitRate() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.maxBitRate;
    }

    public int getMultiAssetFlag() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_24, (Object) this, (Object) this));
        return this.multiAssetFlag;
    }

    public int getPcmSampleDepth() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        return this.pcmSampleDepth;
    }

    public int getRepresentationType() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_20, (Object) this, (Object) this));
        return this.representationType;
    }

    public int getReserved() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_28, (Object) this, (Object) this));
        return this.reserved;
    }

    public int getReservedBoxPresent() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_30, (Object) this, (Object) this));
        return this.reservedBoxPresent;
    }

    public int getStereoDownmix() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_18, (Object) this, (Object) this));
        return this.stereoDownmix;
    }

    public int getStreamConstruction() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_10, (Object) this, (Object) this));
        return this.streamConstruction;
    }

    public void setAvgBitRate(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.avgBitRate = j;
    }

    public void setChannelLayout(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_23, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.channelLayout = i;
    }

    public void setCoreLFEPresent(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_13, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.coreLFEPresent = i;
    }

    public void setCoreLayout(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_15, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.coreLayout = i;
    }

    public void setCoreSize(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_17, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.coreSize = i;
    }

    public void setDTSSamplingFrequency(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.DTSSamplingFrequency = j;
    }

    public void setFrameDuration(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_9, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.frameDuration = i;
    }

    public void setLBRDurationMod(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_27, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.LBRDurationMod = i;
    }

    public void setMaxBitRate(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.maxBitRate = j;
    }

    public void setMultiAssetFlag(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_25, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.multiAssetFlag = i;
    }

    public void setPcmSampleDepth(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_7, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.pcmSampleDepth = i;
    }

    public void setRepresentationType(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_21, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.representationType = i;
    }

    public void setReserved(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_29, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.reserved = i;
    }

    public void setReservedBoxPresent(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_31, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.reservedBoxPresent = i;
    }

    public void setStereoDownmix(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_19, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.stereoDownmix = i;
    }

    public void setStreamConstruction(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_11, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.streamConstruction = i;
    }
}
