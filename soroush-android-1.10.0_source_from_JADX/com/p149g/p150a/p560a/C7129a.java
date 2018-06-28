package com.p149g.p150a.p560a;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class C7129a extends AbstractFullBox {
    public static final C7000a f20309b;
    private static final C7000a f20310e;
    private static final C7000a f20311f;
    private static final C7000a f20312g;
    private static final C7000a f20313h;
    private static final C7000a f20314i;
    public String f20315a;
    private long[] f20316c = new long[0];
    private String f20317d;

    static {
        C4600b c4600b = new C4600b("SampleAuxiliaryInformationOffsetsBox.java", C7129a.class);
        f20310e = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "java.lang.String"), 107);
        f20309b = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "java.lang.String", "auxInfoType", "", "void"), 111);
        f20311f = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "java.lang.String"), 115);
        f20312g = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "java.lang.String", "auxInfoTypeParameter", "", "void"), 119);
        f20313h = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getOffsets", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "[J"), 123);
        f20314i = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setOffsets", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "[J", "offsets", "", "void"), 127);
    }

    public C7129a() {
        super("saio");
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.f20315a = IsoTypeReader.read4cc(byteBuffer);
            this.f20317d = IsoTypeReader.read4cc(byteBuffer);
        }
        int l2i = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.f20316c = new long[l2i];
        for (int i = 0; i < l2i; i++) {
            if (getVersion() == 0) {
                this.f20316c[i] = IsoTypeReader.readUInt32(byteBuffer);
            } else {
                this.f20316c[i] = IsoTypeReader.readUInt64(byteBuffer);
            }
        }
    }

    public final String m18746a() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(f20310e, (Object) this, (Object) this));
        return this.f20315a;
    }

    public final void m18747a(long[] jArr) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(f20314i, (Object) this, (Object) this, (Object) jArr));
        this.f20316c = jArr;
    }

    public final long[] m18748b() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(f20313h, (Object) this, (Object) this));
        return this.f20316c;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            byteBuffer.put(IsoFile.fourCCtoBytes(this.f20315a));
            byteBuffer.put(IsoFile.fourCCtoBytes(this.f20317d));
        }
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.f20316c.length);
        for (long valueOf : this.f20316c) {
            Long valueOf2 = Long.valueOf(valueOf);
            if (getVersion() == 0) {
                IsoTypeWriter.writeUInt32(byteBuffer, valueOf2.longValue());
            } else {
                IsoTypeWriter.writeUInt64(byteBuffer, valueOf2.longValue());
            }
        }
    }

    protected long getContentSize() {
        int i = 8;
        int length = (getVersion() == 0 ? 4 * this.f20316c.length : this.f20316c.length * 8) + 8;
        if ((getFlags() & 1) != 1) {
            i = 0;
        }
        return (long) (length + i);
    }
}
