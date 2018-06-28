package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.DataSource;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import java.util.List;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class MpegSampleEntry extends AbstractSampleEntry {
    public MpegSampleEntry() {
        super("mp4s");
    }

    public MpegSampleEntry(String str) {
        super(str);
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.position(6);
        IsoTypeWriter.writeUInt16(allocate, this.dataReferenceIndex);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public long getSize() {
        int i;
        long containerSize = getContainerSize() + 8;
        if (!this.largeBox) {
            if (containerSize < IjkMediaMeta.AV_CH_WIDE_RIGHT) {
                i = 8;
                return containerSize + ((long) i);
            }
        }
        i = 16;
        return containerSize + ((long) i);
    }

    public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j, BoxParser boxParser) {
        byteBuffer = ByteBuffer.allocate(8);
        dataSource.read(byteBuffer);
        byteBuffer.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer);
        initContainer(dataSource, j - 8, boxParser);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MpegSampleEntry");
        stringBuilder.append(Arrays.asList(new List[]{getBoxes()}));
        return stringBuilder.toString();
    }
}
