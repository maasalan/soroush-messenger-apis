package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.jivesoftware.smackx.hoxt.packet.AbstractHttpOverXmpp.Xml;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class XmlBox extends AbstractFullBox {
    public static final String TYPE = "xml ";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    String xml = "";

    static {
        ajc$preClinit();
    }

    public XmlBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("XmlBox.java", XmlBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getXml", "com.coremedia.iso.boxes.XmlBox", "", "", "", "java.lang.String"), 20);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setXml", "com.coremedia.iso.boxes.XmlBox", "java.lang.String", Xml.ELEMENT, "", "void"), 24);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.XmlBox", "", "", "", "java.lang.String"), 46);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.xml = IsoTypeReader.readString(byteBuffer, byteBuffer.remaining());
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(Utf8.convert(this.xml));
    }

    protected long getContentSize() {
        return (long) (4 + Utf8.utf8StringLengthInBytes(this.xml));
    }

    public String getXml() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.xml;
    }

    public void setXml(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.xml = str;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("XmlBox{xml='");
        stringBuilder.append(this.xml);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
