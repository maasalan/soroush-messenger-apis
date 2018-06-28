package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class SampleSizeBox extends AbstractFullBox {
    public static final String TYPE = "stsz";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    int sampleCount;
    private long sampleSize;
    private long[] sampleSizes = new long[0];

    static {
        ajc$preClinit();
    }

    public SampleSizeBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("SampleSizeBox.java", SampleSizeBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"), 50);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "", "void"), 54);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "", "long"), 59);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"), 67);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "[J"), 76);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "", "void"), 80);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "java.lang.String"), 119);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.sampleSize = IsoTypeReader.readUInt32(byteBuffer);
        this.sampleCount = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        if (this.sampleSize == 0) {
            this.sampleSizes = new long[this.sampleCount];
            for (int i = 0; i < this.sampleCount; i++) {
                this.sampleSizes[i] = IsoTypeReader.readUInt32(byteBuffer);
            }
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.sampleSize);
        if (this.sampleSize == 0) {
            IsoTypeWriter.writeUInt32(byteBuffer, (long) this.sampleSizes.length);
            for (long writeUInt32 : this.sampleSizes) {
                IsoTypeWriter.writeUInt32(byteBuffer, writeUInt32);
            }
            return;
        }
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.sampleCount);
    }

    protected long getContentSize() {
        return (long) (12 + (this.sampleSize == 0 ? this.sampleSizes.length * 4 : 0));
    }

    public long getSampleCount() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_3, (Object) this, (Object) this));
        return (long) (this.sampleSize > 0 ? this.sampleCount : this.sampleSizes.length);
    }

    public long getSampleSize() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.sampleSize;
    }

    public long getSampleSizeAtIndex(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_2, (Object) this, (Object) this, C4599a.m8314a(i)));
        return this.sampleSize > 0 ? this.sampleSize : this.sampleSizes[i];
    }

    public long[] getSampleSizes() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.sampleSizes;
    }

    public void setSampleSize(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.sampleSize = j;
    }

    public void setSampleSizes(long[] jArr) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, (Object) jArr));
        this.sampleSizes = jArr;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("SampleSizeBox[sampleSize=");
        stringBuilder.append(getSampleSize());
        stringBuilder.append(";sampleCount=");
        stringBuilder.append(getSampleCount());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
