package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeReaderVariable;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeWriterVariable;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class ItemLocationBox extends AbstractFullBox {
    public static final String TYPE = "iloc";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_10 = null;
    private static final C7000a ajc$tjp_11 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    private static final C7000a ajc$tjp_8 = null;
    private static final C7000a ajc$tjp_9 = null;
    public int baseOffsetSize = 8;
    public int indexSize = 0;
    public List<Item> items = new LinkedList();
    public int lengthSize = 8;
    public int offsetSize = 8;

    public class Extent {
        public long extentIndex;
        public long extentLength;
        public long extentOffset;

        public Extent(long j, long j2, long j3) {
            this.extentOffset = j;
            this.extentLength = j2;
            this.extentIndex = j3;
        }

        public Extent(ByteBuffer byteBuffer) {
            if (ItemLocationBox.this.getVersion() == 1 && ItemLocationBox.this.indexSize > 0) {
                this.extentIndex = IsoTypeReaderVariable.read(byteBuffer, ItemLocationBox.this.indexSize);
            }
            this.extentOffset = IsoTypeReaderVariable.read(byteBuffer, ItemLocationBox.this.offsetSize);
            this.extentLength = IsoTypeReaderVariable.read(byteBuffer, ItemLocationBox.this.lengthSize);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Extent extent = (Extent) obj;
            return this.extentIndex == extent.extentIndex && this.extentLength == extent.extentLength && this.extentOffset == extent.extentOffset;
        }

        public void getContent(ByteBuffer byteBuffer) {
            if (ItemLocationBox.this.getVersion() == 1 && ItemLocationBox.this.indexSize > 0) {
                IsoTypeWriterVariable.write(this.extentIndex, byteBuffer, ItemLocationBox.this.indexSize);
            }
            IsoTypeWriterVariable.write(this.extentOffset, byteBuffer, ItemLocationBox.this.offsetSize);
            IsoTypeWriterVariable.write(this.extentLength, byteBuffer, ItemLocationBox.this.lengthSize);
        }

        public int getSize() {
            return ((ItemLocationBox.this.indexSize > 0 ? ItemLocationBox.this.indexSize : 0) + ItemLocationBox.this.offsetSize) + ItemLocationBox.this.lengthSize;
        }

        public int hashCode() {
            return (31 * ((((int) (this.extentOffset ^ (this.extentOffset >>> 32))) * 31) + ((int) (this.extentLength ^ (this.extentLength >>> 32))))) + ((int) (this.extentIndex ^ (this.extentIndex >>> 32)));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Extent");
            stringBuilder.append("{extentOffset=");
            stringBuilder.append(this.extentOffset);
            stringBuilder.append(", extentLength=");
            stringBuilder.append(this.extentLength);
            stringBuilder.append(", extentIndex=");
            stringBuilder.append(this.extentIndex);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public class Item {
        public long baseOffset;
        public int constructionMethod;
        public int dataReferenceIndex;
        public List<Extent> extents = new LinkedList();
        public int itemId;

        public Item(int i, int i2, int i3, long j, List<Extent> list) {
            this.itemId = i;
            this.constructionMethod = i2;
            this.dataReferenceIndex = i3;
            this.baseOffset = j;
            this.extents = list;
        }

        public Item(ByteBuffer byteBuffer) {
            this.itemId = IsoTypeReader.readUInt16(byteBuffer);
            if (ItemLocationBox.this.getVersion() == 1) {
                this.constructionMethod = IsoTypeReader.readUInt16(byteBuffer) & 15;
            }
            this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer);
            this.baseOffset = ItemLocationBox.this.baseOffsetSize > 0 ? IsoTypeReaderVariable.read(byteBuffer, ItemLocationBox.this.baseOffsetSize) : 0;
            int readUInt16 = IsoTypeReader.readUInt16(byteBuffer);
            for (int i = 0; i < readUInt16; i++) {
                this.extents.add(new Extent(byteBuffer));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Item item = (Item) obj;
            if (this.baseOffset != item.baseOffset || this.constructionMethod != item.constructionMethod || this.dataReferenceIndex != item.dataReferenceIndex || this.itemId != item.itemId) {
                return false;
            }
            if (this.extents != null) {
                if (!this.extents.equals(item.extents)) {
                    return false;
                }
            } else if (item.extents != null) {
                return false;
            }
            return true;
        }

        public void getContent(ByteBuffer byteBuffer) {
            IsoTypeWriter.writeUInt16(byteBuffer, this.itemId);
            if (ItemLocationBox.this.getVersion() == 1) {
                IsoTypeWriter.writeUInt16(byteBuffer, this.constructionMethod);
            }
            IsoTypeWriter.writeUInt16(byteBuffer, this.dataReferenceIndex);
            if (ItemLocationBox.this.baseOffsetSize > 0) {
                IsoTypeWriterVariable.write(this.baseOffset, byteBuffer, ItemLocationBox.this.baseOffsetSize);
            }
            IsoTypeWriter.writeUInt16(byteBuffer, this.extents.size());
            for (Extent content : this.extents) {
                content.getContent(byteBuffer);
            }
        }

        public int getSize() {
            int i = (((ItemLocationBox.this.getVersion() == 1 ? 4 : 2) + 2) + ItemLocationBox.this.baseOffsetSize) + 2;
            for (Extent size : this.extents) {
                i += size.getSize();
            }
            return i;
        }

        public int hashCode() {
            return (31 * ((((((this.itemId * 31) + this.constructionMethod) * 31) + this.dataReferenceIndex) * 31) + ((int) (this.baseOffset ^ (this.baseOffset >>> 32))))) + (this.extents != null ? this.extents.hashCode() : 0);
        }

        public void setBaseOffset(long j) {
            this.baseOffset = j;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Item{baseOffset=");
            stringBuilder.append(this.baseOffset);
            stringBuilder.append(", itemId=");
            stringBuilder.append(this.itemId);
            stringBuilder.append(", constructionMethod=");
            stringBuilder.append(this.constructionMethod);
            stringBuilder.append(", dataReferenceIndex=");
            stringBuilder.append(this.dataReferenceIndex);
            stringBuilder.append(", extents=");
            stringBuilder.append(this.extents);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public ItemLocationBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("ItemLocationBox.java", ItemLocationBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 119);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "offsetSize", "", "void"), 123);
        ajc$tjp_10 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "createItem", "com.coremedia.iso.boxes.ItemLocationBox", "int:int:int:long:java.util.List", "itemId:constructionMethod:dataReferenceIndex:baseOffset:extents", "", "com.coremedia.iso.boxes.ItemLocationBox$Item"), 160);
        ajc$tjp_11 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "createExtent", "com.coremedia.iso.boxes.ItemLocationBox", "long:long:long", "extentOffset:extentLength:extentIndex", "", "com.coremedia.iso.boxes.ItemLocationBox$Extent"), 285);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 127);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "lengthSize", "", "void"), 131);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 135);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "baseOffsetSize", "", "void"), 139);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 143);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "indexSize", "", "void"), 147);
        ajc$tjp_8 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getItems", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "java.util.List"), 151);
        ajc$tjp_9 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setItems", "com.coremedia.iso.boxes.ItemLocationBox", "java.util.List", "items", "", "void"), 155);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.offsetSize = readUInt8 >>> 4;
        this.lengthSize = readUInt8 & 15;
        readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.baseOffsetSize = readUInt8 >>> 4;
        if (getVersion() == 1) {
            this.indexSize = readUInt8 & 15;
        }
        readUInt8 = IsoTypeReader.readUInt16(byteBuffer);
        for (int i = 0; i < readUInt8; i++) {
            this.items.add(new Item(byteBuffer));
        }
    }

    public Extent createExtent(long j, long j2, long j3) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8323a(ajc$tjp_11, (Object) this, (Object) this, new Object[]{C4599a.m8315a(j), C4599a.m8315a(j2), C4599a.m8315a(j3)}));
        return new Extent(j, j2, j3);
    }

    Extent createExtent(ByteBuffer byteBuffer) {
        return new Extent(byteBuffer);
    }

    public Item createItem(int i, int i2, int i3, long j, List<Extent> list) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8323a(ajc$tjp_10, (Object) this, (Object) this, new Object[]{C4599a.m8314a(i), C4599a.m8314a(i2), C4599a.m8314a(i3), C4599a.m8315a(j), list}));
        return new Item(i, i2, i3, j, list);
    }

    Item createItem(ByteBuffer byteBuffer) {
        return new Item(byteBuffer);
    }

    public int getBaseOffsetSize() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.baseOffsetSize;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt8(byteBuffer, (this.offsetSize << 4) | this.lengthSize);
        IsoTypeWriter.writeUInt8(byteBuffer, getVersion() == 1 ? (this.baseOffsetSize << 4) | this.indexSize : this.baseOffsetSize << 4);
        IsoTypeWriter.writeUInt16(byteBuffer, this.items.size());
        for (Item content : this.items) {
            content.getContent(byteBuffer);
        }
    }

    protected long getContentSize() {
        long j = 8;
        for (Item size : this.items) {
            j += (long) size.getSize();
        }
        return j;
    }

    public int getIndexSize() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        return this.indexSize;
    }

    public List<Item> getItems() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_8, (Object) this, (Object) this));
        return this.items;
    }

    public int getLengthSize() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.lengthSize;
    }

    public int getOffsetSize() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.offsetSize;
    }

    public void setBaseOffsetSize(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.baseOffsetSize = i;
    }

    public void setIndexSize(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_7, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.indexSize = i;
    }

    public void setItems(List<Item> list) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_9, (Object) this, (Object) this, (Object) list));
        this.items = list;
    }

    public void setLengthSize(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.lengthSize = i;
    }

    public void setOffsetSize(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.offsetSize = i;
    }
}
