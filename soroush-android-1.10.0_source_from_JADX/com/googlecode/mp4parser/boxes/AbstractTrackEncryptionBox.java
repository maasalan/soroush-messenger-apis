package com.googlecode.mp4parser.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.UserBox;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.UUID;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public abstract class AbstractTrackEncryptionBox extends AbstractFullBox {
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    int defaultAlgorithmId;
    int defaultIvSize;
    byte[] default_KID;

    static {
        ajc$preClinit();
    }

    protected AbstractTrackEncryptionBox(String str) {
        super(str);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("AbstractTrackEncryptionBox.java", AbstractTrackEncryptionBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDefaultAlgorithmId", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", "int"), 24);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDefaultAlgorithmId", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "int", "defaultAlgorithmId", "", "void"), 28);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDefaultIvSize", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", "int"), 32);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDefaultIvSize", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "int", "defaultIvSize", "", "void"), 36);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDefault_KID", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", "java.util.UUID"), 40);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDefault_KID", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "java.util.UUID", UserBox.TYPE, "", "void"), 46);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "equals", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "java.lang.Object", "o", "", "boolean"), 76);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "hashCode", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", "int"), 90);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.defaultAlgorithmId = IsoTypeReader.readUInt24(byteBuffer);
        this.defaultIvSize = IsoTypeReader.readUInt8(byteBuffer);
        this.default_KID = new byte[16];
        byteBuffer.get(this.default_KID);
    }

    public boolean equals(Object obj) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_6, (Object) this, (Object) this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractTrackEncryptionBox abstractTrackEncryptionBox = (AbstractTrackEncryptionBox) obj;
        return this.defaultAlgorithmId == abstractTrackEncryptionBox.defaultAlgorithmId && this.defaultIvSize == abstractTrackEncryptionBox.defaultIvSize && Arrays.equals(this.default_KID, abstractTrackEncryptionBox.default_KID);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt24(byteBuffer, this.defaultAlgorithmId);
        IsoTypeWriter.writeUInt8(byteBuffer, this.defaultIvSize);
        byteBuffer.put(this.default_KID);
    }

    protected long getContentSize() {
        return 24;
    }

    public int getDefaultAlgorithmId() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.defaultAlgorithmId;
    }

    public int getDefaultIvSize() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.defaultIvSize;
    }

    public UUID getDefault_KID() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        ByteBuffer wrap = ByteBuffer.wrap(this.default_KID);
        wrap.order(ByteOrder.BIG_ENDIAN);
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    public int hashCode() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_7, (Object) this, (Object) this));
        return (31 * ((this.defaultAlgorithmId * 31) + this.defaultIvSize)) + (this.default_KID != null ? Arrays.hashCode(this.default_KID) : 0);
    }

    public void setDefaultAlgorithmId(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.defaultAlgorithmId = i;
    }

    public void setDefaultIvSize(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.defaultIvSize = i;
    }

    public void setDefault_KID(UUID uuid) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, (Object) uuid));
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        this.default_KID = wrap.array();
    }
}
