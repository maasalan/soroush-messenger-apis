package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class Ovc1VisualSampleEntryImpl extends AbstractSampleEntry {
    public static final String TYPE = "ovc1";
    private byte[] vc1Content = new byte[0];

    public Ovc1VisualSampleEntryImpl() {
        super(TYPE);
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.position(6);
        IsoTypeWriter.writeUInt16(allocate, this.dataReferenceIndex);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writableByteChannel.write(ByteBuffer.wrap(this.vc1Content));
    }

    public long getSize() {
        int i = 16;
        if (!this.largeBox) {
            if (((long) (this.vc1Content.length + 16)) < IjkMediaMeta.AV_CH_WIDE_RIGHT) {
                i = 8;
            }
        }
        return (((long) i) + ((long) this.vc1Content.length)) + 8;
    }

    public byte[] getVc1Content() {
        return this.vc1Content;
    }

    public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j, BoxParser boxParser) {
        byteBuffer = ByteBuffer.allocate(CastUtils.l2i(j));
        dataSource.read(byteBuffer);
        byteBuffer.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer);
        this.vc1Content = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.vc1Content);
    }

    public void setVc1Content(byte[] bArr) {
        this.vc1Content = bArr;
    }
}
