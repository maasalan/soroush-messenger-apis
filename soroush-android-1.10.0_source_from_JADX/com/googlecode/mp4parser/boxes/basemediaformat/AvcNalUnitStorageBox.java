package com.googlecode.mp4parser.boxes.basemediaformat;

import com.coremedia.iso.Hex;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.p149g.p150a.p151b.C1609b;
import com.p149g.p150a.p151b.C6533a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class AvcNalUnitStorageBox extends AbstractBox {
    public static final String TYPE = "avcn";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    C1609b avcDecoderConfigurationRecord;

    static {
        ajc$preClinit();
    }

    public AvcNalUnitStorageBox() {
        super(TYPE);
    }

    public AvcNalUnitStorageBox(C6533a c6533a) {
        super(TYPE);
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(C6533a.f17819b, (Object) c6533a, (Object) c6533a));
        this.avcDecoderConfigurationRecord = c6533a.f17844a;
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("AvcNalUnitStorageBox.java", AvcNalUnitStorageBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getAvcDecoderConfigurationRecord", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"), 44);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLengthSizeMinusOne", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "int"), 49);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSPS", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "[Ljava.lang.String;"), 53);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getPPS", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "[Ljava.lang.String;"), 57);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSequenceParameterSetsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 61);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSequenceParameterSetExtsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 65);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getPictureParameterSetsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 69);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.lang.String"), 89);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.avcDecoderConfigurationRecord = new C1609b(byteBuffer);
    }

    public C1609b getAvcDecoderConfigurationRecord() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        this.avcDecoderConfigurationRecord.m4145a(byteBuffer);
    }

    protected long getContentSize() {
        return this.avcDecoderConfigurationRecord.m4144a();
    }

    public int getLengthSizeMinusOne() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.f5004e;
    }

    public String[] getPPS() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_3, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.m4146b();
    }

    public List<String> getPictureParameterSetsAsStrings() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.m4149e();
    }

    public String[] getSPS() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.m4147c();
    }

    public List<String> getSequenceParameterSetExtsAsStrings() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_5, (Object) this, (Object) this));
        C1609b c1609b = this.avcDecoderConfigurationRecord;
        List<String> arrayList = new ArrayList(c1609b.f5011l.size());
        for (byte[] encodeHex : c1609b.f5011l) {
            arrayList.add(Hex.encodeHex(encodeHex));
        }
        return arrayList;
    }

    public List<String> getSequenceParameterSetsAsStrings() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.m4148d();
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_7, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("AvcNalUnitStorageBox{SPS=");
        stringBuilder.append(this.avcDecoderConfigurationRecord.m4148d());
        stringBuilder.append(",PPS=");
        stringBuilder.append(this.avcDecoderConfigurationRecord.m4149e());
        stringBuilder.append(",lengthSize=");
        stringBuilder.append(this.avcDecoderConfigurationRecord.f5004e + 1);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
