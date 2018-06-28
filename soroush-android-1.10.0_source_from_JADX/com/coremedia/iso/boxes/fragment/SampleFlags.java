package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class SampleFlags {
    private byte is_leading;
    private byte reserved;
    private int sampleDegradationPriority;
    private byte sampleDependsOn;
    private byte sampleHasRedundancy;
    private byte sampleIsDependedOn;
    private boolean sampleIsDifferenceSample;
    private byte samplePaddingValue;

    public SampleFlags(ByteBuffer byteBuffer) {
        long readUInt32 = IsoTypeReader.readUInt32(byteBuffer);
        this.reserved = (byte) ((int) ((readUInt32 & -268435456) >> 28));
        this.is_leading = (byte) ((int) ((readUInt32 & 201326592) >> 26));
        this.sampleDependsOn = (byte) ((int) ((readUInt32 & 50331648) >> 24));
        this.sampleIsDependedOn = (byte) ((int) ((readUInt32 & 12582912) >> 22));
        this.sampleHasRedundancy = (byte) ((int) ((readUInt32 & 3145728) >> 20));
        this.samplePaddingValue = (byte) ((int) ((readUInt32 & 917504) >> 17));
        this.sampleIsDifferenceSample = ((readUInt32 & IjkMediaMeta.AV_CH_TOP_BACK_CENTER) >> 16) > 0;
        this.sampleDegradationPriority = (int) (readUInt32 & 65535);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SampleFlags sampleFlags = (SampleFlags) obj;
        return this.is_leading == sampleFlags.is_leading && this.reserved == sampleFlags.reserved && this.sampleDegradationPriority == sampleFlags.sampleDegradationPriority && this.sampleDependsOn == sampleFlags.sampleDependsOn && this.sampleHasRedundancy == sampleFlags.sampleHasRedundancy && this.sampleIsDependedOn == sampleFlags.sampleIsDependedOn && this.sampleIsDifferenceSample == sampleFlags.sampleIsDifferenceSample && this.samplePaddingValue == sampleFlags.samplePaddingValue;
    }

    public void getContent(ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt32(byteBuffer, (((((((0 | ((long) (this.reserved << 28))) | ((long) (this.is_leading << 26))) | ((long) (this.sampleDependsOn << 24))) | ((long) (this.sampleIsDependedOn << 22))) | ((long) (this.sampleHasRedundancy << 20))) | ((long) (this.samplePaddingValue << 17))) | ((long) (this.sampleIsDifferenceSample << 16))) | ((long) this.sampleDegradationPriority));
    }

    public int getReserved() {
        return this.reserved;
    }

    public int getSampleDegradationPriority() {
        return this.sampleDegradationPriority;
    }

    public int getSampleDependsOn() {
        return this.sampleDependsOn;
    }

    public int getSampleHasRedundancy() {
        return this.sampleHasRedundancy;
    }

    public int getSampleIsDependedOn() {
        return this.sampleIsDependedOn;
    }

    public int getSamplePaddingValue() {
        return this.samplePaddingValue;
    }

    public int hashCode() {
        return (31 * ((((((((((((this.reserved * 31) + this.is_leading) * 31) + this.sampleDependsOn) * 31) + this.sampleIsDependedOn) * 31) + this.sampleHasRedundancy) * 31) + this.samplePaddingValue) * 31) + this.sampleIsDifferenceSample)) + this.sampleDegradationPriority;
    }

    public boolean isSampleIsDifferenceSample() {
        return this.sampleIsDifferenceSample;
    }

    public void setReserved(int i) {
        this.reserved = (byte) i;
    }

    public void setSampleDegradationPriority(int i) {
        this.sampleDegradationPriority = i;
    }

    public void setSampleDependsOn(int i) {
        this.sampleDependsOn = (byte) i;
    }

    public void setSampleHasRedundancy(int i) {
        this.sampleHasRedundancy = (byte) i;
    }

    public void setSampleIsDependedOn(int i) {
        this.sampleIsDependedOn = (byte) i;
    }

    public void setSampleIsDifferenceSample(boolean z) {
        this.sampleIsDifferenceSample = z;
    }

    public void setSamplePaddingValue(int i) {
        this.samplePaddingValue = (byte) i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SampleFlags{reserved=");
        stringBuilder.append(this.reserved);
        stringBuilder.append(", isLeading=");
        stringBuilder.append(this.is_leading);
        stringBuilder.append(", depOn=");
        stringBuilder.append(this.sampleDependsOn);
        stringBuilder.append(", isDepOn=");
        stringBuilder.append(this.sampleIsDependedOn);
        stringBuilder.append(", hasRedundancy=");
        stringBuilder.append(this.sampleHasRedundancy);
        stringBuilder.append(", padValue=");
        stringBuilder.append(this.samplePaddingValue);
        stringBuilder.append(", isDiffSample=");
        stringBuilder.append(this.sampleIsDifferenceSample);
        stringBuilder.append(", degradPrio=");
        stringBuilder.append(this.sampleDegradationPriority);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
