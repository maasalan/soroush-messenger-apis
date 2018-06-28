package com.googlecode.mp4parser.boxes.dece;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class BaseLocationBox extends AbstractFullBox {
    public static final String TYPE = "bloc";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    String baseLocation = "";
    String purchaseLocation = "";

    static {
        ajc$preClinit();
    }

    public BaseLocationBox() {
        super(TYPE);
    }

    public BaseLocationBox(String str, String str2) {
        super(TYPE);
        this.baseLocation = str;
        this.purchaseLocation = str2;
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("BaseLocationBox.java", BaseLocationBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getBaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setBaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "java.lang.String", "baseLocation", "", "void"), 48);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getPurchaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 52);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setPurchaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "java.lang.String", "purchaseLocation", "", "void"), 56);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "equals", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "java.lang.Object", "o", "", "boolean"), 86);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "hashCode", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "int"), 100);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 107);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.baseLocation = IsoTypeReader.readString(byteBuffer);
        byteBuffer.get(new byte[((256 - Utf8.utf8StringLengthInBytes(this.baseLocation)) - 1)]);
        this.purchaseLocation = IsoTypeReader.readString(byteBuffer);
        byteBuffer.get(new byte[((256 - Utf8.utf8StringLengthInBytes(this.purchaseLocation)) - 1)]);
        byteBuffer.get(new byte[IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED]);
    }

    public boolean equals(Object obj) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_4, (Object) this, (Object) this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseLocationBox baseLocationBox = (BaseLocationBox) obj;
        if (this.baseLocation != null) {
            if (!this.baseLocation.equals(baseLocationBox.baseLocation)) {
                return false;
            }
        } else if (baseLocationBox.baseLocation != null) {
            return false;
        }
        if (this.purchaseLocation != null) {
            if (!this.purchaseLocation.equals(baseLocationBox.purchaseLocation)) {
                return false;
            }
        } else if (baseLocationBox.purchaseLocation != null) {
            return false;
        }
        return true;
    }

    public String getBaseLocation() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.baseLocation;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(Utf8.convert(this.baseLocation));
        byteBuffer.put(new byte[(256 - Utf8.utf8StringLengthInBytes(this.baseLocation))]);
        byteBuffer.put(Utf8.convert(this.purchaseLocation));
        byteBuffer.put(new byte[(256 - Utf8.utf8StringLengthInBytes(this.purchaseLocation))]);
        byteBuffer.put(new byte[IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED]);
    }

    protected long getContentSize() {
        return 1028;
    }

    public String getPurchaseLocation() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.purchaseLocation;
    }

    public int hashCode() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_5, (Object) this, (Object) this));
        int i = 0;
        int hashCode = 31 * (this.baseLocation != null ? this.baseLocation.hashCode() : 0);
        if (this.purchaseLocation != null) {
            i = this.purchaseLocation.hashCode();
        }
        return hashCode + i;
    }

    public void setBaseLocation(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.baseLocation = str;
    }

    public void setPurchaseLocation(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        this.purchaseLocation = str;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("BaseLocationBox{baseLocation='");
        stringBuilder.append(this.baseLocation);
        stringBuilder.append('\'');
        stringBuilder.append(", purchaseLocation='");
        stringBuilder.append(this.purchaseLocation);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
