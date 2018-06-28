package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.DateHelper;
import java.nio.ByteBuffer;
import java.util.Date;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class MediaHeaderBox extends AbstractFullBox {
    public static final String TYPE = "mdhd";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_10 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    private static final C7000a ajc$tjp_8 = null;
    private static final C7000a ajc$tjp_9 = null;
    private Date creationTime = new Date();
    private long duration;
    private String language = "eng";
    private Date modificationTime = new Date();
    private long timescale;

    static {
        ajc$preClinit();
    }

    public MediaHeaderBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("MediaHeaderBox.java", MediaHeaderBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 46);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 50);
        ajc$tjp_10 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 118);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "long"), 54);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "long"), 58);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 62);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "", "void"), 79);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "", "void"), 83);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", "", "void"), 87);
        ajc$tjp_8 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", "", "void"), 91);
        ajc$tjp_9 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", IjkMediaMeta.IJKM_KEY_LANGUAGE, "", "void"), 95);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        long readUInt64;
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.creationTime = DateHelper.convert(IsoTypeReader.readUInt64(byteBuffer));
            this.modificationTime = DateHelper.convert(IsoTypeReader.readUInt64(byteBuffer));
            this.timescale = IsoTypeReader.readUInt32(byteBuffer);
            readUInt64 = IsoTypeReader.readUInt64(byteBuffer);
        } else {
            this.creationTime = DateHelper.convert(IsoTypeReader.readUInt32(byteBuffer));
            this.modificationTime = DateHelper.convert(IsoTypeReader.readUInt32(byteBuffer));
            this.timescale = IsoTypeReader.readUInt32(byteBuffer);
            readUInt64 = IsoTypeReader.readUInt32(byteBuffer);
        }
        this.duration = readUInt64;
        this.language = IsoTypeReader.readIso639(byteBuffer);
        IsoTypeReader.readUInt16(byteBuffer);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            IsoTypeWriter.writeUInt64(byteBuffer, DateHelper.convert(this.creationTime));
            IsoTypeWriter.writeUInt64(byteBuffer, DateHelper.convert(this.modificationTime));
            IsoTypeWriter.writeUInt32(byteBuffer, this.timescale);
            IsoTypeWriter.writeUInt64(byteBuffer, this.duration);
        } else {
            IsoTypeWriter.writeUInt32(byteBuffer, DateHelper.convert(this.creationTime));
            IsoTypeWriter.writeUInt32(byteBuffer, DateHelper.convert(this.modificationTime));
            IsoTypeWriter.writeUInt32(byteBuffer, this.timescale);
            IsoTypeWriter.writeUInt32(byteBuffer, this.duration);
        }
        IsoTypeWriter.writeIso639(byteBuffer, this.language);
        IsoTypeWriter.writeUInt16(byteBuffer, 0);
    }

    protected long getContentSize() {
        return ((getVersion() == 1 ? 32 : 20) + 2) + 2;
    }

    public Date getCreationTime() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.creationTime;
    }

    public long getDuration() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_3, (Object) this, (Object) this));
        return this.duration;
    }

    public String getLanguage() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.language;
    }

    public Date getModificationTime() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.modificationTime;
    }

    public long getTimescale() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.timescale;
    }

    public void setCreationTime(Date date) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, (Object) date));
        this.creationTime = date;
    }

    public void setDuration(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_8, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.duration = j;
    }

    public void setLanguage(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_9, (Object) this, (Object) this, (Object) str));
        this.language = str;
    }

    public void setModificationTime(Date date) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_6, (Object) this, (Object) this, (Object) date));
        this.modificationTime = date;
    }

    public void setTimescale(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_7, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.timescale = j;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_10, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaHeaderBox[");
        stringBuilder.append("creationTime=");
        stringBuilder.append(getCreationTime());
        stringBuilder.append(";");
        stringBuilder.append("modificationTime=");
        stringBuilder.append(getModificationTime());
        stringBuilder.append(";");
        stringBuilder.append("timescale=");
        stringBuilder.append(getTimescale());
        stringBuilder.append(";");
        stringBuilder.append("duration=");
        stringBuilder.append(getDuration());
        stringBuilder.append(";");
        stringBuilder.append("language=");
        stringBuilder.append(getLanguage());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
