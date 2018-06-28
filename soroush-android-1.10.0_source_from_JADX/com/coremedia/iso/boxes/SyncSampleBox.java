package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class SyncSampleBox extends AbstractFullBox {
    public static final String TYPE = "stss";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private long[] sampleNumber;

    static {
        ajc$preClinit();
    }

    public SyncSampleBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("SyncSampleBox.java", SyncSampleBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "[J"), 46);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "java.lang.String"), 77);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "", "void"), 81);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int l2i = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.sampleNumber = new long[l2i];
        for (int i = 0; i < l2i; i++) {
            this.sampleNumber[i] = IsoTypeReader.readUInt32(byteBuffer);
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.sampleNumber.length);
        for (long writeUInt32 : this.sampleNumber) {
            IsoTypeWriter.writeUInt32(byteBuffer, writeUInt32);
        }
    }

    protected long getContentSize() {
        return (long) ((this.sampleNumber.length * 4) + 8);
    }

    public long[] getSampleNumber() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.sampleNumber;
    }

    public void setSampleNumber(long[] jArr) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_2, (Object) this, (Object) this, (Object) jArr));
        this.sampleNumber = jArr;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("SyncSampleBox[entryCount=");
        stringBuilder.append(this.sampleNumber.length);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
