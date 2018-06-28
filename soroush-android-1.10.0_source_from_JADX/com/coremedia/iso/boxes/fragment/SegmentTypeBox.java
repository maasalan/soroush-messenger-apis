package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class SegmentTypeBox extends AbstractBox {
    public static final String TYPE = "styp";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private List<String> compatibleBrands = Collections.emptyList();
    private String majorBrand;
    private long minorVersion;

    static {
        ajc$preClinit();
    }

    public SegmentTypeBox() {
        super(TYPE);
    }

    public SegmentTypeBox(String str, long j, List<String> list) {
        super(TYPE);
        this.majorBrand = str;
        this.minorVersion = j;
        this.compatibleBrands = list;
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("SegmentTypeBox.java", SegmentTypeBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getMajorBrand", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "", "", "", "java.lang.String"), 85);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setMajorBrand", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "java.lang.String", "majorBrand", "", "void"), 94);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setMinorVersion", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "long", "minorVersion", "", "void"), 103);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getMinorVersion", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "", "", "", "long"), 113);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getCompatibleBrands", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "", "", "", "java.util.List"), (int) IjkMediaMeta.FF_PROFILE_H264_HIGH_422);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setCompatibleBrands", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "java.util.List", "compatibleBrands", "", "void"), 126);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.majorBrand = IsoTypeReader.read4cc(byteBuffer);
        this.minorVersion = IsoTypeReader.readUInt32(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.compatibleBrands = new LinkedList();
        for (int i = 0; i < remaining; i++) {
            this.compatibleBrands.add(IsoTypeReader.read4cc(byteBuffer));
        }
    }

    public List<String> getCompatibleBrands() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.compatibleBrands;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(IsoFile.fourCCtoBytes(this.majorBrand));
        IsoTypeWriter.writeUInt32(byteBuffer, this.minorVersion);
        for (String fourCCtoBytes : this.compatibleBrands) {
            byteBuffer.put(IsoFile.fourCCtoBytes(fourCCtoBytes));
        }
    }

    protected long getContentSize() {
        return (long) (8 + (this.compatibleBrands.size() * 4));
    }

    public String getMajorBrand() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.majorBrand;
    }

    public long getMinorVersion() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_3, (Object) this, (Object) this));
        return this.minorVersion;
    }

    public void setCompatibleBrands(List<String> list) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, (Object) list));
        this.compatibleBrands = list;
    }

    public void setMajorBrand(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.majorBrand = str;
    }

    public void setMinorVersion(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_2, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.minorVersion = j;
    }

    @DoNotParseDetail
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SegmentTypeBox[");
        stringBuilder.append("majorBrand=");
        stringBuilder.append(getMajorBrand());
        stringBuilder.append(";");
        stringBuilder.append("minorVersion=");
        stringBuilder.append(getMinorVersion());
        for (String str : this.compatibleBrands) {
            stringBuilder.append(";");
            stringBuilder.append("compatibleBrand=");
            stringBuilder.append(str);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
