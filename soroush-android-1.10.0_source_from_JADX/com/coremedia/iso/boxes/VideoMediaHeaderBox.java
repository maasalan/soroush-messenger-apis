package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class VideoMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = "vmhd";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private int graphicsmode = 0;
    private int[] opcolor = new int[3];

    static {
        ajc$preClinit();
    }

    public VideoMediaHeaderBox() {
        super(TYPE);
        setFlags(1);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("VideoMediaHeaderBox.java", VideoMediaHeaderBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "int"), 39);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "[I"), 43);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "java.lang.String"), 71);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "", "void"), 75);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "", "void"), 79);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.graphicsmode = IsoTypeReader.readUInt16(byteBuffer);
        this.opcolor = new int[3];
        for (int i = 0; i < 3; i++) {
            this.opcolor[i] = IsoTypeReader.readUInt16(byteBuffer);
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt16(byteBuffer, this.graphicsmode);
        for (int writeUInt16 : this.opcolor) {
            IsoTypeWriter.writeUInt16(byteBuffer, writeUInt16);
        }
    }

    protected long getContentSize() {
        return 12;
    }

    public int getGraphicsmode() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.graphicsmode;
    }

    public int[] getOpcolor() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.opcolor;
    }

    public void setGraphicsmode(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_4, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.graphicsmode = i;
    }

    public void setOpcolor(int[] iArr) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, (Object) iArr));
        this.opcolor = iArr;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        stringBuilder.append(getGraphicsmode());
        stringBuilder.append(";opcolor0=");
        stringBuilder.append(getOpcolor()[0]);
        stringBuilder.append(";opcolor1=");
        stringBuilder.append(getOpcolor()[1]);
        stringBuilder.append(";opcolor2=");
        stringBuilder.append(getOpcolor()[2]);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
