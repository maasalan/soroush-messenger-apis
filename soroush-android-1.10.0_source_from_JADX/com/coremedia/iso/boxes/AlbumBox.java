package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class AlbumBox extends AbstractFullBox {
    public static final String TYPE = "albm";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private String albumTitle;
    private String language;
    private int trackNumber;

    static {
        ajc$preClinit();
    }

    public AlbumBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("AlbumBox.java", AlbumBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLanguage", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 51);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getAlbumTitle", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 55);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getTrackNumber", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "int"), 59);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setLanguage", "com.coremedia.iso.boxes.AlbumBox", "java.lang.String", IjkMediaMeta.IJKM_KEY_LANGUAGE, "", "void"), 63);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setAlbumTitle", "com.coremedia.iso.boxes.AlbumBox", "java.lang.String", "albumTitle", "", "void"), 67);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setTrackNumber", "com.coremedia.iso.boxes.AlbumBox", "int", "trackNumber", "", "void"), 71);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 103);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = IsoTypeReader.readIso639(byteBuffer);
        this.albumTitle = IsoTypeReader.readString(byteBuffer);
        this.trackNumber = byteBuffer.remaining() > 0 ? IsoTypeReader.readUInt8(byteBuffer) : -1;
    }

    public String getAlbumTitle() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.albumTitle;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeIso639(byteBuffer, this.language);
        byteBuffer.put(Utf8.convert(this.albumTitle));
        byteBuffer.put((byte) 0);
        if (this.trackNumber != -1) {
            IsoTypeWriter.writeUInt8(byteBuffer, this.trackNumber);
        }
    }

    protected long getContentSize() {
        int i = 1;
        int utf8StringLengthInBytes = (6 + Utf8.utf8StringLengthInBytes(this.albumTitle)) + 1;
        if (this.trackNumber == -1) {
            i = 0;
        }
        return (long) (utf8StringLengthInBytes + i);
    }

    public String getLanguage() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.language;
    }

    public int getTrackNumber() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.trackNumber;
    }

    public void setAlbumTitle(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_4, (Object) this, (Object) this, (Object) str));
        this.albumTitle = str;
    }

    public void setLanguage(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        this.language = str;
    }

    public void setTrackNumber(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.trackNumber = i;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AlbumBox[language=");
        stringBuilder.append(getLanguage());
        stringBuilder.append(";");
        stringBuilder.append("albumTitle=");
        stringBuilder.append(getAlbumTitle());
        if (this.trackNumber >= 0) {
            stringBuilder.append(";trackNumber=");
            stringBuilder.append(getTrackNumber());
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
