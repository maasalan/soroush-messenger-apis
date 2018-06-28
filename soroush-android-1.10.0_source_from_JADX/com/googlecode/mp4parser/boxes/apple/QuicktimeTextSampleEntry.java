package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class QuicktimeTextSampleEntry extends AbstractSampleEntry {
    public static final String TYPE = "text";
    int backgroundB;
    int backgroundG;
    int backgroundR;
    int dataReferenceIndex;
    long defaultTextBox;
    int displayFlags;
    short fontFace;
    String fontName = "";
    short fontNumber;
    int foregroundB = InBandBytestreamManager.MAXIMUM_BLOCK_SIZE;
    int foregroundG = InBandBytestreamManager.MAXIMUM_BLOCK_SIZE;
    int foregroundR = InBandBytestreamManager.MAXIMUM_BLOCK_SIZE;
    long reserved1;
    byte reserved2;
    short reserved3;
    int textJustification;

    public QuicktimeTextSampleEntry() {
        super("text");
    }

    public void addBox(Box box) {
        throw new RuntimeException("QuicktimeTextSampleEntries may not have child boxes");
    }

    public int getBackgroundB() {
        return this.backgroundB;
    }

    public int getBackgroundG() {
        return this.backgroundG;
    }

    public int getBackgroundR() {
        return this.backgroundR;
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(52 + (this.fontName != null ? this.fontName.length() : 0));
        allocate.position(6);
        IsoTypeWriter.writeUInt16(allocate, this.dataReferenceIndex);
        allocate.putInt(this.displayFlags);
        allocate.putInt(this.textJustification);
        IsoTypeWriter.writeUInt16(allocate, this.backgroundR);
        IsoTypeWriter.writeUInt16(allocate, this.backgroundG);
        IsoTypeWriter.writeUInt16(allocate, this.backgroundB);
        IsoTypeWriter.writeUInt64(allocate, this.defaultTextBox);
        IsoTypeWriter.writeUInt64(allocate, this.reserved1);
        allocate.putShort(this.fontNumber);
        allocate.putShort(this.fontFace);
        allocate.put(this.reserved2);
        allocate.putShort(this.reserved3);
        IsoTypeWriter.writeUInt16(allocate, this.foregroundR);
        IsoTypeWriter.writeUInt16(allocate, this.foregroundG);
        IsoTypeWriter.writeUInt16(allocate, this.foregroundB);
        if (this.fontName != null) {
            IsoTypeWriter.writeUInt8(allocate, this.fontName.length());
            allocate.put(this.fontName.getBytes());
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
    }

    public long getDefaultTextBox() {
        return this.defaultTextBox;
    }

    public int getDisplayFlags() {
        return this.displayFlags;
    }

    public short getFontFace() {
        return this.fontFace;
    }

    public String getFontName() {
        return this.fontName;
    }

    public short getFontNumber() {
        return this.fontNumber;
    }

    public int getForegroundB() {
        return this.foregroundB;
    }

    public int getForegroundG() {
        return this.foregroundG;
    }

    public int getForegroundR() {
        return this.foregroundR;
    }

    public long getReserved1() {
        return this.reserved1;
    }

    public byte getReserved2() {
        return this.reserved2;
    }

    public short getReserved3() {
        return this.reserved3;
    }

    public long getSize() {
        int i;
        long containerSize = (getContainerSize() + 52) + ((long) (this.fontName != null ? this.fontName.length() : 0));
        if (!this.largeBox) {
            if (containerSize + 8 < IjkMediaMeta.AV_CH_WIDE_RIGHT) {
                i = 8;
                return containerSize + ((long) i);
            }
        }
        i = 16;
        return containerSize + ((long) i);
    }

    public int getTextJustification() {
        return this.textJustification;
    }

    public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j, BoxParser boxParser) {
        byteBuffer = ByteBuffer.allocate(CastUtils.l2i(j));
        dataSource.read(byteBuffer);
        byteBuffer.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer);
        this.displayFlags = byteBuffer.getInt();
        this.textJustification = byteBuffer.getInt();
        this.backgroundR = IsoTypeReader.readUInt16(byteBuffer);
        this.backgroundG = IsoTypeReader.readUInt16(byteBuffer);
        this.backgroundB = IsoTypeReader.readUInt16(byteBuffer);
        this.defaultTextBox = IsoTypeReader.readUInt64(byteBuffer);
        this.reserved1 = IsoTypeReader.readUInt64(byteBuffer);
        this.fontNumber = byteBuffer.getShort();
        this.fontFace = byteBuffer.getShort();
        this.reserved2 = byteBuffer.get();
        this.reserved3 = byteBuffer.getShort();
        this.foregroundR = IsoTypeReader.readUInt16(byteBuffer);
        this.foregroundG = IsoTypeReader.readUInt16(byteBuffer);
        this.foregroundB = IsoTypeReader.readUInt16(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            byte[] bArr = new byte[IsoTypeReader.readUInt8(byteBuffer)];
            byteBuffer.get(bArr);
            this.fontName = new String(bArr);
            return;
        }
        this.fontName = null;
    }

    public void setBackgroundB(int i) {
        this.backgroundB = i;
    }

    public void setBackgroundG(int i) {
        this.backgroundG = i;
    }

    public void setBackgroundR(int i) {
        this.backgroundR = i;
    }

    public void setBoxes(List<Box> list) {
        throw new RuntimeException("QuicktimeTextSampleEntries may not have child boxes");
    }

    public void setDefaultTextBox(long j) {
        this.defaultTextBox = j;
    }

    public void setDisplayFlags(int i) {
        this.displayFlags = i;
    }

    public void setFontFace(short s) {
        this.fontFace = s;
    }

    public void setFontName(String str) {
        this.fontName = str;
    }

    public void setFontNumber(short s) {
        this.fontNumber = s;
    }

    public void setForegroundB(int i) {
        this.foregroundB = i;
    }

    public void setForegroundG(int i) {
        this.foregroundG = i;
    }

    public void setForegroundR(int i) {
        this.foregroundR = i;
    }

    public void setReserved1(long j) {
        this.reserved1 = j;
    }

    public void setReserved2(byte b) {
        this.reserved2 = b;
    }

    public void setReserved3(short s) {
        this.reserved3 = s;
    }

    public void setTextJustification(int i) {
        this.textJustification = i;
    }
}
