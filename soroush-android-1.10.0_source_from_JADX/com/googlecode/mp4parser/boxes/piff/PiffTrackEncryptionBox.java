package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.boxes.UserBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox;
import org.msgpack.core.MessagePack.Code;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class PiffTrackEncryptionBox extends AbstractTrackEncryptionBox {
    private static final C7000a ajc$tjp_0 = null;

    static {
        ajc$preClinit();
    }

    public PiffTrackEncryptionBox() {
        super(UserBox.TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("PiffTrackEncryptionBox.java", PiffTrackEncryptionBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getFlags", "com.googlecode.mp4parser.boxes.piff.PiffTrackEncryptionBox", "", "", "", "int"), 29);
    }

    public int getFlags() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return 0;
    }

    public byte[] getUserType() {
        return new byte[]{(byte) -119, (byte) 116, Code.STR32, Code.UINT32, (byte) 123, (byte) -25, (byte) 76, (byte) 81, (byte) -124, (byte) -7, (byte) 113, (byte) 72, (byte) -7, (byte) -120, (byte) 37, (byte) 84};
    }
}
