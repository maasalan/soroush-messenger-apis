package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.DataSource;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class TextSampleEntry extends AbstractSampleEntry {
    public static final String TYPE1 = "tx3g";
    public static final String TYPE_ENCRYPTED = "enct";
    private int[] backgroundColorRgba;
    private BoxRecord boxRecord;
    private long displayFlags;
    private int horizontalJustification;
    private StyleRecord styleRecord;
    private int verticalJustification;

    public static class BoxRecord {
        int bottom;
        int left;
        int right;
        int top;

        public BoxRecord(int i, int i2, int i3, int i4) {
            this.top = i;
            this.left = i2;
            this.bottom = i3;
            this.right = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BoxRecord boxRecord = (BoxRecord) obj;
            return this.bottom == boxRecord.bottom && this.left == boxRecord.left && this.right == boxRecord.right && this.top == boxRecord.top;
        }

        public void getContent(ByteBuffer byteBuffer) {
            IsoTypeWriter.writeUInt16(byteBuffer, this.top);
            IsoTypeWriter.writeUInt16(byteBuffer, this.left);
            IsoTypeWriter.writeUInt16(byteBuffer, this.bottom);
            IsoTypeWriter.writeUInt16(byteBuffer, this.right);
        }

        public int getSize() {
            return 8;
        }

        public int hashCode() {
            return (31 * ((((this.top * 31) + this.left) * 31) + this.bottom)) + this.right;
        }

        public void parse(ByteBuffer byteBuffer) {
            this.top = IsoTypeReader.readUInt16(byteBuffer);
            this.left = IsoTypeReader.readUInt16(byteBuffer);
            this.bottom = IsoTypeReader.readUInt16(byteBuffer);
            this.right = IsoTypeReader.readUInt16(byteBuffer);
        }
    }

    public static class StyleRecord {
        int endChar;
        int faceStyleFlags;
        int fontId;
        int fontSize;
        int startChar;
        int[] textColor = new int[]{255, 255, 255, 255};

        public StyleRecord(int i, int i2, int i3, int i4, int i5, int[] iArr) {
            this.startChar = i;
            this.endChar = i2;
            this.fontId = i3;
            this.faceStyleFlags = i4;
            this.fontSize = i5;
            this.textColor = iArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            StyleRecord styleRecord = (StyleRecord) obj;
            return this.endChar == styleRecord.endChar && this.faceStyleFlags == styleRecord.faceStyleFlags && this.fontId == styleRecord.fontId && this.fontSize == styleRecord.fontSize && this.startChar == styleRecord.startChar && Arrays.equals(this.textColor, styleRecord.textColor);
        }

        public void getContent(ByteBuffer byteBuffer) {
            IsoTypeWriter.writeUInt16(byteBuffer, this.startChar);
            IsoTypeWriter.writeUInt16(byteBuffer, this.endChar);
            IsoTypeWriter.writeUInt16(byteBuffer, this.fontId);
            IsoTypeWriter.writeUInt8(byteBuffer, this.faceStyleFlags);
            IsoTypeWriter.writeUInt8(byteBuffer, this.fontSize);
            IsoTypeWriter.writeUInt8(byteBuffer, this.textColor[0]);
            IsoTypeWriter.writeUInt8(byteBuffer, this.textColor[1]);
            IsoTypeWriter.writeUInt8(byteBuffer, this.textColor[2]);
            IsoTypeWriter.writeUInt8(byteBuffer, this.textColor[3]);
        }

        public int getSize() {
            return 12;
        }

        public int hashCode() {
            return (31 * ((((((((this.startChar * 31) + this.endChar) * 31) + this.fontId) * 31) + this.faceStyleFlags) * 31) + this.fontSize)) + (this.textColor != null ? Arrays.hashCode(this.textColor) : 0);
        }

        public void parse(ByteBuffer byteBuffer) {
            this.startChar = IsoTypeReader.readUInt16(byteBuffer);
            this.endChar = IsoTypeReader.readUInt16(byteBuffer);
            this.fontId = IsoTypeReader.readUInt16(byteBuffer);
            this.faceStyleFlags = IsoTypeReader.readUInt8(byteBuffer);
            this.fontSize = IsoTypeReader.readUInt8(byteBuffer);
            this.textColor = new int[4];
            this.textColor[0] = IsoTypeReader.readUInt8(byteBuffer);
            this.textColor[1] = IsoTypeReader.readUInt8(byteBuffer);
            this.textColor[2] = IsoTypeReader.readUInt8(byteBuffer);
            this.textColor[3] = IsoTypeReader.readUInt8(byteBuffer);
        }
    }

    public TextSampleEntry() {
        super(TYPE1);
        this.backgroundColorRgba = new int[4];
        this.boxRecord = new BoxRecord();
        this.styleRecord = new StyleRecord();
    }

    public TextSampleEntry(String str) {
        super(str);
        this.backgroundColorRgba = new int[4];
        this.boxRecord = new BoxRecord();
        this.styleRecord = new StyleRecord();
    }

    public int[] getBackgroundColorRgba() {
        return this.backgroundColorRgba;
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(38);
        allocate.position(6);
        IsoTypeWriter.writeUInt16(allocate, this.dataReferenceIndex);
        IsoTypeWriter.writeUInt32(allocate, this.displayFlags);
        IsoTypeWriter.writeUInt8(allocate, this.horizontalJustification);
        IsoTypeWriter.writeUInt8(allocate, this.verticalJustification);
        IsoTypeWriter.writeUInt8(allocate, this.backgroundColorRgba[0]);
        IsoTypeWriter.writeUInt8(allocate, this.backgroundColorRgba[1]);
        IsoTypeWriter.writeUInt8(allocate, this.backgroundColorRgba[2]);
        IsoTypeWriter.writeUInt8(allocate, this.backgroundColorRgba[3]);
        this.boxRecord.getContent(allocate);
        this.styleRecord.getContent(allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public BoxRecord getBoxRecord() {
        return this.boxRecord;
    }

    public int getHorizontalJustification() {
        return this.horizontalJustification;
    }

    public long getSize() {
        int i;
        long containerSize = getContainerSize() + 38;
        if (!this.largeBox) {
            if (containerSize < IjkMediaMeta.AV_CH_WIDE_RIGHT) {
                i = 8;
                return containerSize + ((long) i);
            }
        }
        i = 16;
        return containerSize + ((long) i);
    }

    public StyleRecord getStyleRecord() {
        return this.styleRecord;
    }

    public int getVerticalJustification() {
        return this.verticalJustification;
    }

    public boolean isContinuousKaraoke() {
        return (this.displayFlags & IjkMediaMeta.AV_CH_TOP_CENTER) == IjkMediaMeta.AV_CH_TOP_CENTER;
    }

    public boolean isFillTextRegion() {
        return (this.displayFlags & 262144) == 262144;
    }

    public boolean isScrollDirection() {
        return (this.displayFlags & 384) == 384;
    }

    public boolean isScrollIn() {
        return (this.displayFlags & 32) == 32;
    }

    public boolean isScrollOut() {
        return (this.displayFlags & 64) == 64;
    }

    public boolean isWriteTextVertically() {
        return (this.displayFlags & IjkMediaMeta.AV_CH_TOP_BACK_RIGHT) == IjkMediaMeta.AV_CH_TOP_BACK_RIGHT;
    }

    public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j, BoxParser boxParser) {
        byteBuffer = ByteBuffer.allocate(38);
        dataSource.read(byteBuffer);
        byteBuffer.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer);
        this.displayFlags = IsoTypeReader.readUInt32(byteBuffer);
        this.horizontalJustification = IsoTypeReader.readUInt8(byteBuffer);
        this.verticalJustification = IsoTypeReader.readUInt8(byteBuffer);
        this.backgroundColorRgba = new int[4];
        this.backgroundColorRgba[0] = IsoTypeReader.readUInt8(byteBuffer);
        this.backgroundColorRgba[1] = IsoTypeReader.readUInt8(byteBuffer);
        this.backgroundColorRgba[2] = IsoTypeReader.readUInt8(byteBuffer);
        this.backgroundColorRgba[3] = IsoTypeReader.readUInt8(byteBuffer);
        this.boxRecord = new BoxRecord();
        this.boxRecord.parse(byteBuffer);
        this.styleRecord = new StyleRecord();
        this.styleRecord.parse(byteBuffer);
        initContainer(dataSource, j - 38, boxParser);
    }

    public void setBackgroundColorRgba(int[] iArr) {
        this.backgroundColorRgba = iArr;
    }

    public void setBoxRecord(BoxRecord boxRecord) {
        this.boxRecord = boxRecord;
    }

    public void setContinuousKaraoke(boolean z) {
        this.displayFlags = z ? this.displayFlags | IjkMediaMeta.AV_CH_TOP_CENTER : this.displayFlags & -2049;
    }

    public void setFillTextRegion(boolean z) {
        this.displayFlags = z ? this.displayFlags | 262144 : this.displayFlags & -262145;
    }

    public void setHorizontalJustification(int i) {
        this.horizontalJustification = i;
    }

    public void setScrollDirection(boolean z) {
        this.displayFlags = z ? this.displayFlags | 384 : this.displayFlags & -385;
    }

    public void setScrollIn(boolean z) {
        this.displayFlags = z ? this.displayFlags | 32 : this.displayFlags & -33;
    }

    public void setScrollOut(boolean z) {
        this.displayFlags = z ? this.displayFlags | 64 : this.displayFlags & -65;
    }

    public void setStyleRecord(StyleRecord styleRecord) {
        this.styleRecord = styleRecord;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVerticalJustification(int i) {
        this.verticalJustification = i;
    }

    public void setWriteTextVertically(boolean z) {
        this.displayFlags = z ? this.displayFlags | IjkMediaMeta.AV_CH_TOP_BACK_RIGHT : this.displayFlags & -131073;
    }

    public String toString() {
        return "TextSampleEntry";
    }
}
