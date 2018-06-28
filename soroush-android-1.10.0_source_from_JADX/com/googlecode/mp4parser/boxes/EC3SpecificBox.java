package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class EC3SpecificBox extends AbstractBox {
    public static final String TYPE = "dec3";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    private static final C7000a ajc$tjp_8 = null;
    int dataRate;
    List<Entry> entries = new LinkedList();
    int numIndSub;

    public static class Entry {
        public int acmod;
        public int bsid;
        public int bsmod;
        public int chan_loc;
        public int fscod;
        public int lfeon;
        public int num_dep_sub;
        public int reserved;
        public int reserved2;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Entry{fscod=");
            stringBuilder.append(this.fscod);
            stringBuilder.append(", bsid=");
            stringBuilder.append(this.bsid);
            stringBuilder.append(", bsmod=");
            stringBuilder.append(this.bsmod);
            stringBuilder.append(", acmod=");
            stringBuilder.append(this.acmod);
            stringBuilder.append(", lfeon=");
            stringBuilder.append(this.lfeon);
            stringBuilder.append(", reserved=");
            stringBuilder.append(this.reserved);
            stringBuilder.append(", num_dep_sub=");
            stringBuilder.append(this.num_dep_sub);
            stringBuilder.append(", chan_loc=");
            stringBuilder.append(this.chan_loc);
            stringBuilder.append(", reserved2=");
            stringBuilder.append(this.reserved2);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public EC3SpecificBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("EC3SpecificBox.java", EC3SpecificBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getContentSize", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "long"), 25);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getContent", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 65);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getEntries", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "java.util.List"), 86);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setEntries", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "java.util.List", "entries", "", "void"), 90);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "addEntry", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry", "entry", "", "void"), 94);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDataRate", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "int"), 98);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDataRate", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "int", "dataRate", "", "void"), 102);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getNumIndSub", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "int"), 106);
        ajc$tjp_8 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setNumIndSub", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "int", "numIndSub", "", "void"), 110);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBuffer);
        this.dataRate = bitReaderBuffer.readBits(13);
        this.numIndSub = bitReaderBuffer.readBits(3) + 1;
        for (int i = 0; i < this.numIndSub; i++) {
            Entry entry = new Entry();
            entry.fscod = bitReaderBuffer.readBits(2);
            entry.bsid = bitReaderBuffer.readBits(5);
            entry.bsmod = bitReaderBuffer.readBits(5);
            entry.acmod = bitReaderBuffer.readBits(3);
            entry.lfeon = bitReaderBuffer.readBits(1);
            entry.reserved = bitReaderBuffer.readBits(3);
            entry.num_dep_sub = bitReaderBuffer.readBits(4);
            if (entry.num_dep_sub > 0) {
                entry.chan_loc = bitReaderBuffer.readBits(9);
            } else {
                entry.reserved2 = bitReaderBuffer.readBits(1);
            }
            this.entries.add(entry);
        }
    }

    public void addEntry(Entry entry) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_4, (Object) this, (Object) this, (Object) entry));
        this.entries.add(entry);
    }

    public void getContent(ByteBuffer byteBuffer) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) byteBuffer));
        BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
        bitWriterBuffer.writeBits(this.dataRate, 13);
        bitWriterBuffer.writeBits(this.entries.size() - 1, 3);
        for (Entry entry : this.entries) {
            bitWriterBuffer.writeBits(entry.fscod, 2);
            bitWriterBuffer.writeBits(entry.bsid, 5);
            bitWriterBuffer.writeBits(entry.bsmod, 5);
            bitWriterBuffer.writeBits(entry.acmod, 3);
            bitWriterBuffer.writeBits(entry.lfeon, 1);
            bitWriterBuffer.writeBits(entry.reserved, 3);
            bitWriterBuffer.writeBits(entry.num_dep_sub, 4);
            if (entry.num_dep_sub > 0) {
                bitWriterBuffer.writeBits(entry.chan_loc, 9);
            } else {
                bitWriterBuffer.writeBits(entry.reserved2, 1);
            }
        }
    }

    public long getContentSize() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        long j = 2;
        for (Entry entry : this.entries) {
            j += entry.num_dep_sub > 0 ? 4 : 3;
        }
        return j;
    }

    public int getDataRate() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_5, (Object) this, (Object) this));
        return this.dataRate;
    }

    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.entries;
    }

    public int getNumIndSub() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_7, (Object) this, (Object) this));
        return this.numIndSub;
    }

    public void setDataRate(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_6, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.dataRate = i;
    }

    public void setEntries(List<Entry> list) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, (Object) list));
        this.entries = list;
    }

    public void setNumIndSub(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_8, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.numIndSub = i;
    }
}
