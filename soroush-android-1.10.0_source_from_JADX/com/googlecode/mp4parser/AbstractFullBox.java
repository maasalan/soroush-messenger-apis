package com.googlecode.mp4parser;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.FullBox;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public abstract class AbstractFullBox extends AbstractBox implements FullBox {
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private int flags;
    private int version;

    static {
        ajc$preClinit();
    }

    protected AbstractFullBox(String str) {
        super(str);
    }

    protected AbstractFullBox(String str, byte[] bArr) {
        super(str, bArr);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("AbstractFullBox.java", AbstractFullBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setVersion", "com.googlecode.mp4parser.AbstractFullBox", "int", "version", "", "void"), 51);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setFlags", "com.googlecode.mp4parser.AbstractFullBox", "int", "flags", "", "void"), 64);
    }

    @DoNotParseDetail
    public int getFlags() {
        if (!this.isParsed) {
            parseDetails();
        }
        return this.flags;
    }

    @DoNotParseDetail
    public int getVersion() {
        if (!this.isParsed) {
            parseDetails();
        }
        return this.version;
    }

    protected final long parseVersionAndFlags(ByteBuffer byteBuffer) {
        this.version = IsoTypeReader.readUInt8(byteBuffer);
        this.flags = IsoTypeReader.readUInt24(byteBuffer);
        return 4;
    }

    public void setFlags(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.flags = i;
    }

    public void setVersion(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_0, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.version = i;
    }

    protected final void writeVersionAndFlags(ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt8(byteBuffer, this.version);
        IsoTypeWriter.writeUInt24(byteBuffer, this.flags);
    }
}
