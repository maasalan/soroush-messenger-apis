package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class AudioSampleEntry extends AbstractSampleEntry {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE1 = "samr";
    public static final String TYPE10 = "mlpa";
    public static final String TYPE11 = "dtsl";
    public static final String TYPE12 = "dtsh";
    public static final String TYPE13 = "dtse";
    public static final String TYPE2 = "sawb";
    public static final String TYPE3 = "mp4a";
    public static final String TYPE4 = "drms";
    public static final String TYPE5 = "alac";
    public static final String TYPE7 = "owma";
    public static final String TYPE8 = "ac-3";
    public static final String TYPE9 = "ec-3";
    public static final String TYPE_ENCRYPTED = "enca";
    private long bytesPerFrame;
    private long bytesPerPacket;
    private long bytesPerSample;
    private int channelCount;
    private int compressionId;
    private int packetSize;
    private int reserved1;
    private long reserved2;
    private long sampleRate;
    private int sampleSize;
    private long samplesPerPacket;
    private int soundVersion;
    private byte[] soundVersion2Data;

    public AudioSampleEntry(String str) {
        super(str);
    }

    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        int i = 0;
        int i2 = 28 + (this.soundVersion == 1 ? 16 : 0);
        if (this.soundVersion == 2) {
            i = 36;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i2 + i);
        allocate.position(6);
        IsoTypeWriter.writeUInt16(allocate, this.dataReferenceIndex);
        IsoTypeWriter.writeUInt16(allocate, this.soundVersion);
        IsoTypeWriter.writeUInt16(allocate, this.reserved1);
        IsoTypeWriter.writeUInt32(allocate, this.reserved2);
        IsoTypeWriter.writeUInt16(allocate, this.channelCount);
        IsoTypeWriter.writeUInt16(allocate, this.sampleSize);
        IsoTypeWriter.writeUInt16(allocate, this.compressionId);
        IsoTypeWriter.writeUInt16(allocate, this.packetSize);
        IsoTypeWriter.writeUInt32(allocate, this.type.equals(TYPE10) ? getSampleRate() : getSampleRate() << 16);
        if (this.soundVersion == 1) {
            IsoTypeWriter.writeUInt32(allocate, this.samplesPerPacket);
            IsoTypeWriter.writeUInt32(allocate, this.bytesPerPacket);
            IsoTypeWriter.writeUInt32(allocate, this.bytesPerFrame);
            IsoTypeWriter.writeUInt32(allocate, this.bytesPerSample);
        }
        if (this.soundVersion == 2) {
            IsoTypeWriter.writeUInt32(allocate, this.samplesPerPacket);
            IsoTypeWriter.writeUInt32(allocate, this.bytesPerPacket);
            IsoTypeWriter.writeUInt32(allocate, this.bytesPerFrame);
            IsoTypeWriter.writeUInt32(allocate, this.bytesPerSample);
            allocate.put(this.soundVersion2Data);
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public final long getBytesPerFrame() {
        return this.bytesPerFrame;
    }

    public final long getBytesPerPacket() {
        return this.bytesPerPacket;
    }

    public final long getBytesPerSample() {
        return this.bytesPerSample;
    }

    public final int getChannelCount() {
        return this.channelCount;
    }

    public final int getCompressionId() {
        return this.compressionId;
    }

    public final int getPacketSize() {
        return this.packetSize;
    }

    public final int getReserved1() {
        return this.reserved1;
    }

    public final long getReserved2() {
        return this.reserved2;
    }

    public final long getSampleRate() {
        return this.sampleRate;
    }

    public final int getSampleSize() {
        return this.sampleSize;
    }

    public final long getSamplesPerPacket() {
        return this.samplesPerPacket;
    }

    public final long getSize() {
        int i = 0;
        int i2 = 16;
        int i3 = 28 + (this.soundVersion == 1 ? 16 : 0);
        if (this.soundVersion == 2) {
            i = 36;
        }
        long containerSize = ((long) (i3 + i)) + getContainerSize();
        if (!this.largeBox) {
            if (containerSize + 8 < IjkMediaMeta.AV_CH_WIDE_RIGHT) {
                i2 = 8;
            }
        }
        return containerSize + ((long) i2);
    }

    public final int getSoundVersion() {
        return this.soundVersion;
    }

    public final byte[] getSoundVersion2Data() {
        return this.soundVersion2Data;
    }

    public final void parse(DataSource dataSource, ByteBuffer byteBuffer, long j, BoxParser boxParser) {
        byteBuffer = ByteBuffer.allocate(28);
        dataSource.read(byteBuffer);
        byteBuffer.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer);
        this.soundVersion = IsoTypeReader.readUInt16(byteBuffer);
        this.reserved1 = IsoTypeReader.readUInt16(byteBuffer);
        this.reserved2 = IsoTypeReader.readUInt32(byteBuffer);
        this.channelCount = IsoTypeReader.readUInt16(byteBuffer);
        this.sampleSize = IsoTypeReader.readUInt16(byteBuffer);
        this.compressionId = IsoTypeReader.readUInt16(byteBuffer);
        this.packetSize = IsoTypeReader.readUInt16(byteBuffer);
        this.sampleRate = IsoTypeReader.readUInt32(byteBuffer);
        int i = 16;
        if (!this.type.equals(TYPE10)) {
            this.sampleRate >>>= 16;
        }
        if (this.soundVersion == 1) {
            byteBuffer = ByteBuffer.allocate(16);
            dataSource.read(byteBuffer);
            byteBuffer.rewind();
            this.samplesPerPacket = IsoTypeReader.readUInt32(byteBuffer);
            this.bytesPerPacket = IsoTypeReader.readUInt32(byteBuffer);
            this.bytesPerFrame = IsoTypeReader.readUInt32(byteBuffer);
            this.bytesPerSample = IsoTypeReader.readUInt32(byteBuffer);
        }
        int i2 = 36;
        if (this.soundVersion == 2) {
            byteBuffer = ByteBuffer.allocate(36);
            dataSource.read(byteBuffer);
            byteBuffer.rewind();
            this.samplesPerPacket = IsoTypeReader.readUInt32(byteBuffer);
            this.bytesPerPacket = IsoTypeReader.readUInt32(byteBuffer);
            this.bytesPerFrame = IsoTypeReader.readUInt32(byteBuffer);
            this.bytesPerSample = IsoTypeReader.readUInt32(byteBuffer);
            this.soundVersion2Data = new byte[20];
            byteBuffer.get(this.soundVersion2Data);
        }
        if (TYPE7.equals(this.type)) {
            System.err.println(TYPE7);
            long j2 = j - 28;
            if (this.soundVersion != 1) {
                i = 0;
            }
            long j3 = j2 - ((long) i);
            if (this.soundVersion != 2) {
                i2 = 0;
            }
            final long j4 = j3 - ((long) i2);
            byteBuffer = ByteBuffer.allocate(CastUtils.l2i(j4));
            dataSource.read(byteBuffer);
            addBox(new Box() {
                public void getBox(WritableByteChannel writableByteChannel) {
                    byteBuffer.rewind();
                    writableByteChannel.write(byteBuffer);
                }

                public long getOffset() {
                    return 0;
                }

                public Container getParent() {
                    return AudioSampleEntry.this;
                }

                public long getSize() {
                    return j4;
                }

                public String getType() {
                    return "----";
                }

                public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j, BoxParser boxParser) {
                    throw new RuntimeException("NotImplemented");
                }

                public void setParent(Container container) {
                }
            });
            return;
        }
        j2 = j - 28;
        if (this.soundVersion != 1) {
            i = 0;
        }
        j4 = j2 - ((long) i);
        if (this.soundVersion != 2) {
            i2 = 0;
        }
        initContainer(dataSource, j4 - ((long) i2), boxParser);
    }

    public final void setBytesPerFrame(long j) {
        this.bytesPerFrame = j;
    }

    public final void setBytesPerPacket(long j) {
        this.bytesPerPacket = j;
    }

    public final void setBytesPerSample(long j) {
        this.bytesPerSample = j;
    }

    public final void setChannelCount(int i) {
        this.channelCount = i;
    }

    public final void setCompressionId(int i) {
        this.compressionId = i;
    }

    public final void setPacketSize(int i) {
        this.packetSize = i;
    }

    public final void setReserved1(int i) {
        this.reserved1 = i;
    }

    public final void setReserved2(long j) {
        this.reserved2 = j;
    }

    public final void setSampleRate(long j) {
        this.sampleRate = j;
    }

    public final void setSampleSize(int i) {
        this.sampleSize = i;
    }

    public final void setSamplesPerPacket(long j) {
        this.samplesPerPacket = j;
    }

    public final void setSoundVersion(int i) {
        this.soundVersion = i;
    }

    public final void setSoundVersion2Data(byte[] bArr) {
        this.soundVersion2Data = bArr;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioSampleEntry{bytesPerSample=");
        stringBuilder.append(this.bytesPerSample);
        stringBuilder.append(", bytesPerFrame=");
        stringBuilder.append(this.bytesPerFrame);
        stringBuilder.append(", bytesPerPacket=");
        stringBuilder.append(this.bytesPerPacket);
        stringBuilder.append(", samplesPerPacket=");
        stringBuilder.append(this.samplesPerPacket);
        stringBuilder.append(", packetSize=");
        stringBuilder.append(this.packetSize);
        stringBuilder.append(", compressionId=");
        stringBuilder.append(this.compressionId);
        stringBuilder.append(", soundVersion=");
        stringBuilder.append(this.soundVersion);
        stringBuilder.append(", sampleRate=");
        stringBuilder.append(this.sampleRate);
        stringBuilder.append(", sampleSize=");
        stringBuilder.append(this.sampleSize);
        stringBuilder.append(", channelCount=");
        stringBuilder.append(this.channelCount);
        stringBuilder.append(", boxes=");
        stringBuilder.append(getBoxes());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
