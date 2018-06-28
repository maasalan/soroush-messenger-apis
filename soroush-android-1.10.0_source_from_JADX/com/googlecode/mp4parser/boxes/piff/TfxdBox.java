package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.UserBox;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.msgpack.core.MessagePack.Code;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class TfxdBox extends AbstractFullBox {
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    public long fragmentAbsoluteDuration;
    public long fragmentAbsoluteTime;

    static {
        ajc$preClinit();
    }

    public TfxdBox() {
        super(UserBox.TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("TfxdBox.java", TfxdBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getFragmentAbsoluteTime", "com.googlecode.mp4parser.boxes.piff.TfxdBox", "", "", "", "long"), 79);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getFragmentAbsoluteDuration", "com.googlecode.mp4parser.boxes.piff.TfxdBox", "", "", "", "long"), 83);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        long readUInt64;
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.fragmentAbsoluteTime = IsoTypeReader.readUInt64(byteBuffer);
            readUInt64 = IsoTypeReader.readUInt64(byteBuffer);
        } else {
            this.fragmentAbsoluteTime = IsoTypeReader.readUInt32(byteBuffer);
            readUInt64 = IsoTypeReader.readUInt32(byteBuffer);
        }
        this.fragmentAbsoluteDuration = readUInt64;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            IsoTypeWriter.writeUInt64(byteBuffer, this.fragmentAbsoluteTime);
            IsoTypeWriter.writeUInt64(byteBuffer, this.fragmentAbsoluteDuration);
            return;
        }
        IsoTypeWriter.writeUInt32(byteBuffer, this.fragmentAbsoluteTime);
        IsoTypeWriter.writeUInt32(byteBuffer, this.fragmentAbsoluteDuration);
    }

    protected long getContentSize() {
        return (long) (getVersion() == 1 ? 20 : 12);
    }

    public long getFragmentAbsoluteDuration() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.fragmentAbsoluteDuration;
    }

    public long getFragmentAbsoluteTime() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.fragmentAbsoluteTime;
    }

    public byte[] getUserType() {
        return new byte[]{(byte) 109, (byte) 29, (byte) -101, (byte) 5, (byte) 66, Code.FIXEXT2, (byte) 68, (byte) -26, Byte.MIN_VALUE, (byte) -30, (byte) 20, (byte) 29, (byte) -81, (byte) -9, (byte) 87, (byte) -78};
    }
}
