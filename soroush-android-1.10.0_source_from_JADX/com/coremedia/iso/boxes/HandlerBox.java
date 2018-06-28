package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class HandlerBox extends AbstractFullBox {
    public static final String TYPE = "hdlr";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    public static final Map<String, String> readableTypes;
    private long f20077a;
    private long f20078b;
    private long f20079c;
    private String handlerType;
    private String name = null;
    private long shouldBeZeroButAppleWritesHereSomeValue;
    private boolean zeroTerm = true;

    static {
        ajc$preClinit();
        Map hashMap = new HashMap();
        hashMap.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mdir", "Apple Meta Data iTunes Reader");
        hashMap.put("mp7b", "MPEG-7 binary XML");
        hashMap.put("mp7t", "MPEG-7 XML");
        hashMap.put("vide", "Video Track");
        hashMap.put("soun", "Sound Track");
        hashMap.put(TrackReferenceTypeBox.TYPE1, "Hint Track");
        hashMap.put("appl", "Apple specific");
        hashMap.put(MetaBox.TYPE, "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        readableTypes = Collections.unmodifiableMap(hashMap);
    }

    public HandlerBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("HandlerBox.java", HandlerBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 78);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "", "void"), 87);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "", "void"), 91);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 95);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 99);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 149);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.shouldBeZeroButAppleWritesHereSomeValue = IsoTypeReader.readUInt32(byteBuffer);
        this.handlerType = IsoTypeReader.read4cc(byteBuffer);
        this.f20077a = IsoTypeReader.readUInt32(byteBuffer);
        this.f20078b = IsoTypeReader.readUInt32(byteBuffer);
        this.f20079c = IsoTypeReader.readUInt32(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            this.name = IsoTypeReader.readString(byteBuffer, byteBuffer.remaining());
            if (this.name.endsWith("\u0000")) {
                this.name = this.name.substring(0, this.name.length() - 1);
                this.zeroTerm = true;
                return;
            }
            this.zeroTerm = false;
            return;
        }
        this.zeroTerm = false;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.shouldBeZeroButAppleWritesHereSomeValue);
        byteBuffer.put(IsoFile.fourCCtoBytes(this.handlerType));
        IsoTypeWriter.writeUInt32(byteBuffer, this.f20077a);
        IsoTypeWriter.writeUInt32(byteBuffer, this.f20078b);
        IsoTypeWriter.writeUInt32(byteBuffer, this.f20079c);
        if (this.name != null) {
            byteBuffer.put(Utf8.convert(this.name));
        }
        if (this.zeroTerm) {
            byteBuffer.put((byte) 0);
        }
    }

    protected long getContentSize() {
        return (long) ((this.zeroTerm ? 25 : 24) + Utf8.utf8StringLengthInBytes(this.name));
    }

    public String getHandlerType() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.handlerType;
    }

    public String getHumanReadableTrackType() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return readableTypes.get(this.handlerType) != null ? (String) readableTypes.get(this.handlerType) : "Unknown Handler Type";
    }

    public String getName() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_3, (Object) this, (Object) this));
        return this.name;
    }

    public void setHandlerType(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_2, (Object) this, (Object) this, (Object) str));
        this.handlerType = str;
    }

    public void setName(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.name = str;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_5, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("HandlerBox[handlerType=");
        stringBuilder.append(getHandlerType());
        stringBuilder.append(";name=");
        stringBuilder.append(getName());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
