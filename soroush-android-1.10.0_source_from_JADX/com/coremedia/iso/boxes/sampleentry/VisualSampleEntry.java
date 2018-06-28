package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class VisualSampleEntry extends AbstractSampleEntry implements Container {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE1 = "mp4v";
    public static final String TYPE2 = "s263";
    public static final String TYPE3 = "avc1";
    public static final String TYPE4 = "avc3";
    public static final String TYPE5 = "drmi";
    public static final String TYPE6 = "hvc1";
    public static final String TYPE7 = "hev1";
    public static final String TYPE_ENCRYPTED = "encv";
    private String compressorname;
    private int depth;
    private int frameCount;
    private int height;
    private double horizresolution;
    private long[] predefined;
    private double vertresolution;
    private int width;

    public VisualSampleEntry() {
        super(TYPE3);
        this.horizresolution = 72.0d;
        this.vertresolution = 72.0d;
        this.frameCount = 1;
        this.compressorname = "";
        this.depth = 24;
        this.predefined = new long[3];
    }

    public VisualSampleEntry(String str) {
        super(str);
        this.horizresolution = 72.0d;
        this.vertresolution = 72.0d;
        this.frameCount = 1;
        this.compressorname = "";
        this.depth = 24;
        this.predefined = new long[3];
    }

    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        IsoTypeWriter.writeUInt16(allocate, this.dataReferenceIndex);
        IsoTypeWriter.writeUInt16(allocate, 0);
        IsoTypeWriter.writeUInt16(allocate, 0);
        IsoTypeWriter.writeUInt32(allocate, this.predefined[0]);
        IsoTypeWriter.writeUInt32(allocate, this.predefined[1]);
        IsoTypeWriter.writeUInt32(allocate, this.predefined[2]);
        IsoTypeWriter.writeUInt16(allocate, getWidth());
        IsoTypeWriter.writeUInt16(allocate, getHeight());
        IsoTypeWriter.writeFixedPoint1616(allocate, getHorizresolution());
        IsoTypeWriter.writeFixedPoint1616(allocate, getVertresolution());
        IsoTypeWriter.writeUInt32(allocate, 0);
        IsoTypeWriter.writeUInt16(allocate, getFrameCount());
        IsoTypeWriter.writeUInt8(allocate, Utf8.utf8StringLengthInBytes(getCompressorname()));
        allocate.put(Utf8.convert(getCompressorname()));
        int utf8StringLengthInBytes = Utf8.utf8StringLengthInBytes(getCompressorname());
        while (utf8StringLengthInBytes < 31) {
            utf8StringLengthInBytes++;
            allocate.put((byte) 0);
        }
        IsoTypeWriter.writeUInt16(allocate, getDepth());
        IsoTypeWriter.writeUInt16(allocate, InBandBytestreamManager.MAXIMUM_BLOCK_SIZE);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public final String getCompressorname() {
        return this.compressorname;
    }

    public final int getDepth() {
        return this.depth;
    }

    public final int getFrameCount() {
        return this.frameCount;
    }

    public final int getHeight() {
        return this.height;
    }

    public final double getHorizresolution() {
        return this.horizresolution;
    }

    public final long getSize() {
        int i;
        long containerSize = getContainerSize() + 78;
        if (!this.largeBox) {
            if (containerSize + 8 < IjkMediaMeta.AV_CH_WIDE_RIGHT) {
                i = 8;
                return containerSize + ((long) i);
            }
        }
        i = 16;
        return containerSize + ((long) i);
    }

    public final double getVertresolution() {
        return this.vertresolution;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void parse(final DataSource dataSource, ByteBuffer byteBuffer, long j, BoxParser boxParser) {
        final long position = dataSource.position() + j;
        byteBuffer = ByteBuffer.allocate(78);
        dataSource.read(byteBuffer);
        byteBuffer.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer);
        IsoTypeReader.readUInt16(byteBuffer);
        IsoTypeReader.readUInt16(byteBuffer);
        this.predefined[0] = IsoTypeReader.readUInt32(byteBuffer);
        this.predefined[1] = IsoTypeReader.readUInt32(byteBuffer);
        this.predefined[2] = IsoTypeReader.readUInt32(byteBuffer);
        this.width = IsoTypeReader.readUInt16(byteBuffer);
        this.height = IsoTypeReader.readUInt16(byteBuffer);
        this.horizresolution = IsoTypeReader.readFixedPoint1616(byteBuffer);
        this.vertresolution = IsoTypeReader.readFixedPoint1616(byteBuffer);
        IsoTypeReader.readUInt32(byteBuffer);
        this.frameCount = IsoTypeReader.readUInt16(byteBuffer);
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        if (readUInt8 > 31) {
            readUInt8 = 31;
        }
        byte[] bArr = new byte[readUInt8];
        byteBuffer.get(bArr);
        this.compressorname = Utf8.convert(bArr);
        if (readUInt8 < 31) {
            byteBuffer.get(new byte[(31 - readUInt8)]);
        }
        this.depth = IsoTypeReader.readUInt16(byteBuffer);
        IsoTypeReader.readUInt16(byteBuffer);
        initContainer(new DataSource() {
            public void close() {
                dataSource.close();
            }

            public ByteBuffer map(long j, long j2) {
                return dataSource.map(j, j2);
            }

            public long position() {
                return dataSource.position();
            }

            public void position(long j) {
                dataSource.position(j);
            }

            public int read(ByteBuffer byteBuffer) {
                if (position == dataSource.position()) {
                    return -1;
                }
                if (((long) byteBuffer.remaining()) <= position - dataSource.position()) {
                    return dataSource.read(byteBuffer);
                }
                ByteBuffer allocate = ByteBuffer.allocate(CastUtils.l2i(position - dataSource.position()));
                dataSource.read(allocate);
                byteBuffer.put((ByteBuffer) allocate.rewind());
                return allocate.capacity();
            }

            public long size() {
                return position;
            }

            public long transferTo(long j, long j2, WritableByteChannel writableByteChannel) {
                return dataSource.transferTo(j, j2, writableByteChannel);
            }
        }, j - 78, boxParser);
    }

    public final void setCompressorname(String str) {
        this.compressorname = str;
    }

    public final void setDepth(int i) {
        this.depth = i;
    }

    public final void setFrameCount(int i) {
        this.frameCount = i;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setHorizresolution(double d) {
        this.horizresolution = d;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setVertresolution(double d) {
        this.vertresolution = d;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}
