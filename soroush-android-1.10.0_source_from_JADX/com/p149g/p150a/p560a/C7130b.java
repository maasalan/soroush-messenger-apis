package com.p149g.p150a.p560a;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class C7130b extends AbstractFullBox {
    static final /* synthetic */ boolean f20318b = true;
    public static final C7000a f20319c;
    private static final C7000a f20320h;
    private static final C7000a f20321i;
    private static final C7000a f20322j;
    private static final C7000a f20323k;
    private static final C7000a f20324l;
    private static final C7000a f20325m;
    private static final C7000a f20326n;
    private static final C7000a f20327o;
    private static final C7000a f20328p;
    private static final C7000a f20329q;
    private static final C7000a f20330r;
    public short[] f20331a = new short[0];
    private short f20332d;
    private int f20333e;
    private String f20334f;
    private String f20335g;

    static {
        C4600b c4600b = new C4600b("SampleAuxiliaryInformationSizesBox.java", C7130b.class);
        f20320h = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "index", "", "short"), 57);
        f20321i = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 107);
        f20329q = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSampleCount", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "sampleCount", "", "void"), (int) IjkMediaMeta.FF_PROFILE_H264_HIGH_444);
        f20330r = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 149);
        f20322j = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoType", "", "void"), 111);
        f20323k = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 115);
        f20324l = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoTypeParameter", "", "void"), 119);
        f20325m = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDefaultSampleInfoSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "int"), 123);
        f20326n = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDefaultSampleInfoSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "defaultSampleInfoSize", "", "void"), 127);
        f20319c = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSampleInfoSizes", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "[S"), 132);
        f20327o = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSampleInfoSizes", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "[S", "sampleInfoSizes", "", "void"), 136);
        f20328p = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSampleCount", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "int"), 140);
    }

    public C7130b() {
        super("saiz");
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.f20334f = IsoTypeReader.read4cc(byteBuffer);
            this.f20335g = IsoTypeReader.read4cc(byteBuffer);
        }
        this.f20332d = (short) IsoTypeReader.readUInt8(byteBuffer);
        this.f20333e = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        if (this.f20332d == (short) 0) {
            this.f20331a = new short[this.f20333e];
            for (int i = 0; i < this.f20333e; i++) {
                this.f20331a[i] = (short) IsoTypeReader.readUInt8(byteBuffer);
            }
        }
    }

    public final String m18749a() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(f20321i, (Object) this, (Object) this));
        return this.f20334f;
    }

    public final short m18750a(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(f20320h, (Object) this, (Object) this, C4599a.m8314a(i)));
        return m18753b() == 0 ? this.f20331a[i] : this.f20332d;
    }

    public final void m18751a(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(f20322j, (Object) this, (Object) this, (Object) str));
        this.f20334f = str;
    }

    public final void m18752a(short[] sArr) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(f20327o, (Object) this, (Object) this, (Object) sArr));
        this.f20331a = Arrays.copyOf(sArr, sArr.length);
    }

    public final int m18753b() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(f20325m, (Object) this, (Object) this));
        return this.f20332d;
    }

    public final void m18754b(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(f20326n, (Object) this, (Object) this, C4599a.m8314a(i)));
        if (f20318b || i <= 255) {
            this.f20332d = (short) i;
            return;
        }
        throw new AssertionError();
    }

    public final int m18755c() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(f20328p, (Object) this, (Object) this));
        return this.f20333e;
    }

    public final void m18756c(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(f20329q, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.f20333e = i;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            byteBuffer.put(IsoFile.fourCCtoBytes(this.f20334f));
            byteBuffer.put(IsoFile.fourCCtoBytes(this.f20335g));
        }
        IsoTypeWriter.writeUInt8(byteBuffer, this.f20332d);
        if (this.f20332d == (short) 0) {
            IsoTypeWriter.writeUInt32(byteBuffer, (long) this.f20331a.length);
            for (short writeUInt8 : this.f20331a) {
                IsoTypeWriter.writeUInt8(byteBuffer, writeUInt8);
            }
            return;
        }
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.f20333e);
    }

    protected long getContentSize() {
        return (long) ((((getFlags() & 1) == 1 ? 12 : 4) + 5) + (this.f20332d == (short) 0 ? this.f20331a.length : 0));
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(f20330r, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("SampleAuxiliaryInformationSizesBox{defaultSampleInfoSize=");
        stringBuilder.append(this.f20332d);
        stringBuilder.append(", sampleCount=");
        stringBuilder.append(this.f20333e);
        stringBuilder.append(", auxInfoType='");
        stringBuilder.append(this.f20334f);
        stringBuilder.append('\'');
        stringBuilder.append(", auxInfoTypeParameter='");
        stringBuilder.append(this.f20335g);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
