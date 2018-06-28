package com.coremedia.iso.boxes;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.DataSource;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class ItemProtectionBox extends AbstractContainerBox implements FullBox {
    public static final String TYPE = "ipro";
    private int flags;
    private int version;

    public ItemProtectionBox() {
        super(TYPE);
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(6);
        IsoTypeWriter.writeUInt8(allocate, this.version);
        IsoTypeWriter.writeUInt24(allocate, this.flags);
        IsoTypeWriter.writeUInt16(allocate, getBoxes().size());
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public int getFlags() {
        return this.flags;
    }

    public SchemeInformationBox getItemProtectionScheme() {
        return !getBoxes(SchemeInformationBox.class).isEmpty() ? (SchemeInformationBox) getBoxes(SchemeInformationBox.class).get(0) : null;
    }

    public long getSize() {
        int i;
        long containerSize = getContainerSize() + 6;
        if (!this.largeBox) {
            if (containerSize < IjkMediaMeta.AV_CH_WIDE_RIGHT) {
                i = 8;
                return containerSize + ((long) i);
            }
        }
        i = 16;
        return containerSize + ((long) i);
    }

    public int getVersion() {
        return this.version;
    }

    public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j, BoxParser boxParser) {
        byteBuffer = ByteBuffer.allocate(6);
        dataSource.read(byteBuffer);
        byteBuffer.rewind();
        this.version = IsoTypeReader.readUInt8(byteBuffer);
        this.flags = IsoTypeReader.readUInt24(byteBuffer);
        initContainer(dataSource, j - 6, boxParser);
    }

    public void setFlags(int i) {
        this.flags = i;
    }

    public void setVersion(int i) {
        this.version = i;
    }
}
