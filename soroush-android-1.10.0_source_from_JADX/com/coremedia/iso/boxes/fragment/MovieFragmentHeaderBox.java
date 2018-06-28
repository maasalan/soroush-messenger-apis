package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class MovieFragmentHeaderBox extends AbstractFullBox {
    public static final String TYPE = "mfhd";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private long sequenceNumber;

    static {
        ajc$preClinit();
    }

    public MovieFragmentHeaderBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("MovieFragmentHeaderBox.java", MovieFragmentHeaderBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSequenceNumber", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", "", "", "", "long"), 59);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSequenceNumber", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", "long", "sequenceNumber", "", "void"), 63);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", "", "", "", "java.lang.String"), 68);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.sequenceNumber = IsoTypeReader.readUInt32(byteBuffer);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.sequenceNumber);
    }

    protected long getContentSize() {
        return 8;
    }

    public long getSequenceNumber() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.sequenceNumber;
    }

    public void setSequenceNumber(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.sequenceNumber = j;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("MovieFragmentHeaderBox{sequenceNumber=");
        stringBuilder.append(this.sequenceNumber);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
