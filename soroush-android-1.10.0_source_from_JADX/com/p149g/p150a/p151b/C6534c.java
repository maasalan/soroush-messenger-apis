package com.p149g.p150a.p151b;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.p149g.p150a.p151b.C1611d.C1610a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class C6534c extends AbstractBox {
    public static final C7000a f17845b;
    public static final C7000a f17846c;
    private static final C7000a f17847d;
    private static final C7000a f17848e;
    private static final C7000a f17849f;
    private static final C7000a f17850g;
    private static final C7000a f17851h;
    private static final C7000a f17852i;
    private static final C7000a f17853j;
    private static final C7000a f17854k;
    private static final C7000a f17855l;
    private static final C7000a f17856m;
    private static final C7000a f17857n;
    private static final C7000a f17858o;
    private static final C7000a f17859p;
    private static final C7000a f17860q;
    private static final C7000a f17861r;
    private static final C7000a f17862s;
    private static final C7000a f17863t;
    private static final C7000a f17864u;
    private static final C7000a f17865v;
    private static final C7000a f17866w;
    public C1611d f17867a = new C1611d();

    static {
        C4600b c4600b = new C4600b("HevcConfigurationBox.java", C6534c.class);
        f17847d = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getHevcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord"), 36);
        f17848e = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setHevcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord", "hevcDecoderConfigurationRecord", "", "void"), 40);
        f17857n = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getGeneral_level_idc", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 88);
        f17858o = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getMin_spatial_segmentation_idc", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 92);
        f17859p = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getParallelismType", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 96);
        f17860q = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getChromaFormat", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 100);
        f17861r = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 104);
        f17862s = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 108);
        f17863t = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getAvgFrameRate", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 112);
        f17864u = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getNumTemporalLayers", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 116);
        f17845b = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 120);
        f17865v = c4600b.m8324a("method-execution", c4600b.m8325a("1", "isTemporalIdNested", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "boolean"), 124);
        f17849f = c4600b.m8324a("method-execution", c4600b.m8325a("1", "equals", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "java.lang.Object", "o", "", "boolean"), 45);
        f17866w = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getConstantFrameRate", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 128);
        f17846c = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getArrays", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "java.util.List"), 132);
        f17850g = c4600b.m8324a("method-execution", c4600b.m8325a("1", "hashCode", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 58);
        f17851h = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getConfigurationVersion", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 63);
        f17852i = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getGeneral_profile_space", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 67);
        f17853j = c4600b.m8324a("method-execution", c4600b.m8325a("1", "isGeneral_tier_flag", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "boolean"), 71);
        f17854k = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getGeneral_profile_idc", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 76);
        f17855l = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getGeneral_profile_compatibility_flags", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "long"), 80);
        f17856m = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getGeneral_constraint_indicator_flags", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "long"), 84);
    }

    public C6534c() {
        super("hvcC");
    }

    protected void _parseDetails(ByteBuffer byteBuffer) {
        C1611d c1611d = this.f17867a;
        c1611d.f5022a = IsoTypeReader.readUInt8(byteBuffer);
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        c1611d.f5023b = (readUInt8 & 192) >> 6;
        c1611d.f5024c = (readUInt8 & 32) > 0;
        c1611d.f5025d = readUInt8 & 31;
        c1611d.f5026e = IsoTypeReader.readUInt32(byteBuffer);
        c1611d.f5027f = IsoTypeReader.readUInt48(byteBuffer);
        c1611d.f5045x = ((c1611d.f5027f >> 44) & 8) > 0;
        c1611d.f5046y = ((c1611d.f5027f >> 44) & 4) > 0;
        c1611d.f5047z = ((c1611d.f5027f >> 44) & 2) > 0;
        c1611d.f5021A = ((c1611d.f5027f >> 44) & 1) > 0;
        c1611d.f5027f &= 140737488355327L;
        c1611d.f5028g = IsoTypeReader.readUInt8(byteBuffer);
        readUInt8 = IsoTypeReader.readUInt16(byteBuffer);
        c1611d.f5029h = (61440 & readUInt8) >> 12;
        c1611d.f5030i = readUInt8 & 4095;
        readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        c1611d.f5031j = (readUInt8 & 252) >> 2;
        c1611d.f5032k = readUInt8 & 3;
        readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        c1611d.f5033l = (readUInt8 & 252) >> 2;
        c1611d.f5034m = readUInt8 & 3;
        readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        c1611d.f5035n = (readUInt8 & 248) >> 3;
        c1611d.f5036o = readUInt8 & 7;
        readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        c1611d.f5037p = (readUInt8 & 248) >> 3;
        c1611d.f5038q = readUInt8 & 7;
        c1611d.f5039r = IsoTypeReader.readUInt16(byteBuffer);
        readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        c1611d.f5040s = (readUInt8 & 192) >> 6;
        c1611d.f5041t = (readUInt8 & 56) >> 3;
        c1611d.f5042u = (readUInt8 & 4) > 0;
        c1611d.f5043v = readUInt8 & 3;
        readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        c1611d.f5044w = new ArrayList();
        for (int i = 0; i < readUInt8; i++) {
            C1610a c1610a = new C1610a();
            int readUInt82 = IsoTypeReader.readUInt8(byteBuffer);
            c1610a.f5017a = (readUInt82 & 128) > 0;
            c1610a.f5018b = (readUInt82 & 64) > 0;
            c1610a.f5019c = readUInt82 & 63;
            readUInt82 = IsoTypeReader.readUInt16(byteBuffer);
            c1610a.f5020d = new ArrayList();
            for (int i2 = 0; i2 < readUInt82; i2++) {
                Object obj = new byte[IsoTypeReader.readUInt16(byteBuffer)];
                byteBuffer.get(obj);
                c1610a.f5020d.add(obj);
            }
            c1611d.f5044w.add(c1610a);
        }
    }

    public boolean equals(Object obj) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(f17849f, (Object) this, (Object) this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6534c c6534c = (C6534c) obj;
        if (this.f17867a != null) {
            if (!this.f17867a.equals(c6534c.f17867a)) {
                return false;
            }
        } else if (c6534c.f17867a != null) {
            return false;
        }
        return true;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        C1611d c1611d = this.f17867a;
        IsoTypeWriter.writeUInt8(byteBuffer, c1611d.f5022a);
        IsoTypeWriter.writeUInt8(byteBuffer, ((c1611d.f5023b << 6) + (c1611d.f5024c ? 32 : 0)) + c1611d.f5025d);
        IsoTypeWriter.writeUInt32(byteBuffer, c1611d.f5026e);
        long j = c1611d.f5027f;
        if (c1611d.f5045x) {
            j |= 140737488355328L;
        }
        if (c1611d.f5046y) {
            j |= 70368744177664L;
        }
        if (c1611d.f5047z) {
            j |= 35184372088832L;
        }
        if (c1611d.f5021A) {
            j |= 17592186044416L;
        }
        IsoTypeWriter.writeUInt48(byteBuffer, j);
        IsoTypeWriter.writeUInt8(byteBuffer, c1611d.f5028g);
        IsoTypeWriter.writeUInt16(byteBuffer, (c1611d.f5029h << 12) + c1611d.f5030i);
        IsoTypeWriter.writeUInt8(byteBuffer, (c1611d.f5031j << 2) + c1611d.f5032k);
        IsoTypeWriter.writeUInt8(byteBuffer, (c1611d.f5033l << 2) + c1611d.f5034m);
        IsoTypeWriter.writeUInt8(byteBuffer, (c1611d.f5035n << 3) + c1611d.f5036o);
        IsoTypeWriter.writeUInt8(byteBuffer, (c1611d.f5037p << 3) + c1611d.f5038q);
        IsoTypeWriter.writeUInt16(byteBuffer, c1611d.f5039r);
        IsoTypeWriter.writeUInt8(byteBuffer, (((c1611d.f5040s << 6) + (c1611d.f5041t << 3)) + (c1611d.f5042u ? 4 : 0)) + c1611d.f5043v);
        IsoTypeWriter.writeUInt8(byteBuffer, c1611d.f5044w.size());
        for (C1610a c1610a : c1611d.f5044w) {
            IsoTypeWriter.writeUInt8(byteBuffer, ((c1610a.f5017a ? 128 : 0) + (c1610a.f5018b ? 64 : 0)) + c1610a.f5019c);
            IsoTypeWriter.writeUInt16(byteBuffer, c1610a.f5020d.size());
            for (byte[] bArr : c1610a.f5020d) {
                IsoTypeWriter.writeUInt16(byteBuffer, bArr.length);
                byteBuffer.put(bArr);
            }
        }
    }

    protected long getContentSize() {
        int i = 23;
        for (C1610a c1610a : this.f17867a.f5044w) {
            i += 3;
            for (byte[] length : c1610a.f5020d) {
                i = (i + 2) + length.length;
            }
        }
        return (long) i;
    }

    public int hashCode() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(f17850g, (Object) this, (Object) this));
        return this.f17867a != null ? this.f17867a.hashCode() : 0;
    }
}
