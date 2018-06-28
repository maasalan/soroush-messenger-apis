package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class DataEntryUrnBox extends AbstractFullBox {
    public static final String TYPE = "urn ";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private String location;
    private String name;

    static {
        ajc$preClinit();
    }

    public DataEntryUrnBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("DataEntryUrnBox.java", DataEntryUrnBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getName", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLocation", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 67);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.name = IsoTypeReader.readString(byteBuffer);
        this.location = IsoTypeReader.readString(byteBuffer);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(Utf8.convert(this.name));
        byteBuffer.put((byte) 0);
        byteBuffer.put(Utf8.convert(this.location));
        byteBuffer.put((byte) 0);
    }

    protected long getContentSize() {
        return (long) (((Utf8.utf8StringLengthInBytes(this.name) + 1) + Utf8.utf8StringLengthInBytes(this.location)) + 1);
    }

    public String getLocation() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.location;
    }

    public String getName() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.name;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("DataEntryUrlBox[name=");
        stringBuilder.append(getName());
        stringBuilder.append(";location=");
        stringBuilder.append(getLocation());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
