package com.p149g.p150a.p151b;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public final class C6533a extends AbstractBox {
    private static final C7000a f17814A;
    private static final C7000a f17815B;
    private static final C7000a f17816C;
    private static final C7000a f17817D;
    private static final C7000a f17818E;
    public static final C7000a f17819b;
    private static final C7000a f17820c;
    private static final C7000a f17821d;
    private static final C7000a f17822e;
    private static final C7000a f17823f;
    private static final C7000a f17824g;
    private static final C7000a f17825h;
    private static final C7000a f17826i;
    private static final C7000a f17827j;
    private static final C7000a f17828k;
    private static final C7000a f17829l;
    private static final C7000a f17830m;
    private static final C7000a f17831n;
    private static final C7000a f17832o;
    private static final C7000a f17833p;
    private static final C7000a f17834q;
    private static final C7000a f17835r;
    private static final C7000a f17836s;
    private static final C7000a f17837t;
    private static final C7000a f17838u;
    private static final C7000a f17839v;
    private static final C7000a f17840w;
    private static final C7000a f17841x;
    private static final C7000a f17842y;
    private static final C7000a f17843z;
    public C1609b f17844a = new C1609b();

    static {
        C4600b c4600b = new C4600b("AvcConfigurationBox.java", C6533a.class);
        f17820c = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 44);
        f17821d = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 48);
        f17830m = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "", "void"), 84);
        f17831n = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "", "void"), 88);
        f17832o = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "", "void"), 92);
        f17833p = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "", "void"), 96);
        f17834q = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 100);
        f17835r = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "", "void"), 104);
        f17836s = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 108);
        f17837t = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "", "void"), 112);
        f17838u = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 116);
        f17839v = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "", "void"), 120);
        f17822e = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 52);
        f17840w = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 124);
        f17841x = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "", "void"), 128);
        f17842y = c4600b.m8324a("method-execution", c4600b.m8325a("1", "hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "boolean"), 132);
        f17843z = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "", "void"), 136);
        f17814A = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "long"), 147);
        f17815B = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 153);
        f17816C = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 158);
        f17817D = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 162);
        f17819b = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"), 167);
        f17818E = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.lang.String"), 172);
        f17823f = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 56);
        f17824g = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 60);
        f17825h = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 64);
        f17826i = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 68);
        f17827j = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "", "void"), 72);
        f17828k = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "", "void"), 76);
        f17829l = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "", "void"), 80);
    }

    public C6533a() {
        super("avcC");
    }

    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.f17844a = new C1609b(byteBuffer);
    }

    public final int m15775a() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(f17824g, (Object) this, (Object) this));
        return this.f17844a.f5004e;
    }

    public final void m15776a(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(f17828k, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.f17844a.f5001b = i;
    }

    public final void m15777a(List<byte[]> list) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(f17832o, (Object) this, (Object) this, (Object) list));
        this.f17844a.f5005f = list;
    }

    public final List<byte[]> m15778b() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(f17825h, (Object) this, (Object) this));
        return Collections.unmodifiableList(this.f17844a.f5005f);
    }

    public final void m15779b(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(f17829l, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.f17844a.f5002c = i;
    }

    public final void m15780b(List<byte[]> list) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(f17833p, (Object) this, (Object) this, (Object) list));
        this.f17844a.f5006g = list;
    }

    public final List<byte[]> m15781c() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(f17826i, (Object) this, (Object) this));
        return Collections.unmodifiableList(this.f17844a.f5006g);
    }

    public final void m15782c(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(f17830m, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.f17844a.f5003d = i;
    }

    public final void m15783d() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(f17827j, (Object) this, (Object) this, C4599a.m8314a(1)));
        this.f17844a.f5000a = 1;
    }

    public final void m15784d(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(f17835r, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.f17844a.f5008i = i;
    }

    public final void m15785e() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(f17831n, (Object) this, (Object) this, C4599a.m8314a(3)));
        this.f17844a.f5004e = 3;
    }

    public final void m15786e(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(f17837t, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.f17844a.f5009j = i;
    }

    public final List<byte[]> m15787f() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(f17840w, (Object) this, (Object) this));
        return this.f17844a.f5011l;
    }

    public final void m15788f(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(f17839v, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.f17844a.f5010k = i;
    }

    public final void getContent(ByteBuffer byteBuffer) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(f17815B, (Object) this, (Object) this, (Object) byteBuffer));
        this.f17844a.m4145a(byteBuffer);
    }

    public final long getContentSize() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(f17814A, (Object) this, (Object) this));
        return this.f17844a.m4144a();
    }

    public final String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(f17818E, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("AvcConfigurationBox{avcDecoderConfigurationRecord=");
        stringBuilder.append(this.f17844a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
