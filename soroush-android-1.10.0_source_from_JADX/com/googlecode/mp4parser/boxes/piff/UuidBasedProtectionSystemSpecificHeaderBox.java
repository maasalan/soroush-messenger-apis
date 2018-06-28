package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.UserBox;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.UUIDConverter;
import java.nio.ByteBuffer;
import java.util.UUID;
import org.msgpack.core.MessagePack.Code;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class UuidBasedProtectionSystemSpecificHeaderBox extends AbstractFullBox {
    public static byte[] USER_TYPE = new byte[]{Code.INT8, (byte) -118, (byte) 79, (byte) 24, (byte) 16, (byte) -13, (byte) 74, (byte) -126, (byte) -74, Code.EXT16, (byte) 50, Code.FIXEXT16, (byte) -85, (byte) -95, (byte) -125, Code.INT64};
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    ProtectionSpecificHeader protectionSpecificHeader;
    UUID systemId;

    static {
        ajc$preClinit();
    }

    public UuidBasedProtectionSystemSpecificHeaderBox() {
        super(UserBox.TYPE, USER_TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("UuidBasedProtectionSystemSpecificHeaderBox.java", UuidBasedProtectionSystemSpecificHeaderBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSystemId", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.util.UUID"), 67);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSystemId", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "java.util.UUID", "systemId", "", "void"), 71);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSystemIdString", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"), 75);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getProtectionSpecificHeader", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader"), 79);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getProtectionSpecificHeaderString", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"), 83);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setProtectionSpecificHeader", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader", "protectionSpecificHeader", "", "void"), 87);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"), 92);
    }

    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        this.systemId = UUIDConverter.convert(bArr);
        CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.protectionSpecificHeader = ProtectionSpecificHeader.createFor(this.systemId, byteBuffer);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt64(byteBuffer, this.systemId.getMostSignificantBits());
        IsoTypeWriter.writeUInt64(byteBuffer, this.systemId.getLeastSignificantBits());
        ByteBuffer data = this.protectionSpecificHeader.getData();
        data.rewind();
        IsoTypeWriter.writeUInt32(byteBuffer, (long) data.limit());
        byteBuffer.put(data);
    }

    protected long getContentSize() {
        return (long) (24 + this.protectionSpecificHeader.getData().limit());
    }

    public ProtectionSpecificHeader getProtectionSpecificHeader() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_3, (Object) this, (Object) this));
        return this.protectionSpecificHeader;
    }

    public String getProtectionSpecificHeaderString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.protectionSpecificHeader.toString();
    }

    public UUID getSystemId() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.systemId;
    }

    public String getSystemIdString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.systemId.toString();
    }

    public byte[] getUserType() {
        return USER_TYPE;
    }

    public void setProtectionSpecificHeader(ProtectionSpecificHeader protectionSpecificHeader) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, (Object) protectionSpecificHeader));
        this.protectionSpecificHeader = protectionSpecificHeader;
    }

    public void setSystemId(UUID uuid) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) uuid));
        this.systemId = uuid;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UuidBasedProtectionSystemSpecificHeaderBox");
        stringBuilder.append("{systemId=");
        stringBuilder.append(this.systemId.toString());
        stringBuilder.append(", dataSize=");
        stringBuilder.append(this.protectionSpecificHeader.getData().limit());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
