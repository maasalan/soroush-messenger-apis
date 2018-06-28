package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class TrackProductionApertureDimensionsAtom extends AbstractFullBox {
    public static final String TYPE = "prof";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    double height;
    double width;

    static {
        ajc$preClinit();
    }

    public TrackProductionApertureDimensionsAtom() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("TrackProductionApertureDimensionsAtom.java", TrackProductionApertureDimensionsAtom.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getWidth", "com.googlecode.mp4parser.boxes.apple.TrackProductionApertureDimensionsAtom", "", "", "", "double"), 44);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setWidth", "com.googlecode.mp4parser.boxes.apple.TrackProductionApertureDimensionsAtom", "double", "width", "", "void"), 48);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getHeight", "com.googlecode.mp4parser.boxes.apple.TrackProductionApertureDimensionsAtom", "", "", "", "double"), 52);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setHeight", "com.googlecode.mp4parser.boxes.apple.TrackProductionApertureDimensionsAtom", "double", "height", "", "void"), 56);
    }

    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.width = IsoTypeReader.readFixedPoint1616(byteBuffer);
        this.height = IsoTypeReader.readFixedPoint1616(byteBuffer);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.width);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.height);
    }

    protected long getContentSize() {
        return 12;
    }

    public double getHeight() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.height;
    }

    public double getWidth() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.width;
    }

    public void setHeight(double d) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, C4599a.m8312a(d)));
        this.height = d;
    }

    public void setWidth(double d) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8312a(d)));
        this.width = d;
    }
}
