package com.googlecode.mp4parser;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.FullBox;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import java.util.logging.Logger;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public abstract class FullContainerBox extends AbstractContainerBox implements FullBox {
    private static Logger LOG = Logger.getLogger(FullContainerBox.class.getName());
    private int flags;
    private int version;

    public FullContainerBox(String str) {
        super(str);
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        super.getBox(writableByteChannel);
    }

    public <T extends Box> List<T> getBoxes(Class<T> cls) {
        return getBoxes(cls, false);
    }

    public int getFlags() {
        return this.flags;
    }

    protected ByteBuffer getHeader() {
        byte[] bArr;
        ByteBuffer wrap;
        if (!this.largeBox) {
            if (getSize() < IjkMediaMeta.AV_CH_WIDE_RIGHT) {
                bArr = new byte[12];
                bArr[4] = this.type.getBytes()[0];
                bArr[5] = this.type.getBytes()[1];
                bArr[6] = this.type.getBytes()[2];
                bArr[7] = this.type.getBytes()[3];
                wrap = ByteBuffer.wrap(bArr);
                IsoTypeWriter.writeUInt32(wrap, getSize());
                wrap.position(8);
                writeVersionAndFlags(wrap);
                wrap.rewind();
                return wrap;
            }
        }
        bArr = new byte[20];
        bArr[3] = (byte) 1;
        bArr[4] = this.type.getBytes()[0];
        bArr[5] = this.type.getBytes()[1];
        bArr[6] = this.type.getBytes()[2];
        bArr[7] = this.type.getBytes()[3];
        wrap = ByteBuffer.wrap(bArr);
        wrap.position(8);
        IsoTypeWriter.writeUInt64(wrap, getSize());
        writeVersionAndFlags(wrap);
        wrap.rewind();
        return wrap;
    }

    public int getVersion() {
        return this.version;
    }

    public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j, BoxParser boxParser) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        dataSource.read(allocate);
        parseVersionAndFlags((ByteBuffer) allocate.rewind());
        super.parse(dataSource, byteBuffer, j, boxParser);
    }

    protected final long parseVersionAndFlags(ByteBuffer byteBuffer) {
        this.version = IsoTypeReader.readUInt8(byteBuffer);
        this.flags = IsoTypeReader.readUInt24(byteBuffer);
        return 4;
    }

    public void setFlags(int i) {
        this.flags = i;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(getClass().getSimpleName()));
        stringBuilder.append("[childBoxes]");
        return stringBuilder.toString();
    }

    protected final void writeVersionAndFlags(ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt8(byteBuffer, this.version);
        IsoTypeWriter.writeUInt24(byteBuffer, this.flags);
    }
}
