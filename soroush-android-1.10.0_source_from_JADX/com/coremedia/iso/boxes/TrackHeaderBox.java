package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.DateHelper;
import com.googlecode.mp4parser.util.Matrix;
import java.nio.ByteBuffer;
import java.util.Date;
import org.jivesoftware.smack.sm.packet.StreamManagement.Enabled;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class TrackHeaderBox extends AbstractFullBox {
    public static final String TYPE = "tkhd";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_10 = null;
    private static final C7000a ajc$tjp_11 = null;
    private static final C7000a ajc$tjp_12 = null;
    private static final C7000a ajc$tjp_13 = null;
    private static final C7000a ajc$tjp_14 = null;
    private static final C7000a ajc$tjp_15 = null;
    private static final C7000a ajc$tjp_16 = null;
    private static final C7000a ajc$tjp_17 = null;
    private static final C7000a ajc$tjp_18 = null;
    private static final C7000a ajc$tjp_19 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_20 = null;
    private static final C7000a ajc$tjp_21 = null;
    private static final C7000a ajc$tjp_22 = null;
    private static final C7000a ajc$tjp_23 = null;
    private static final C7000a ajc$tjp_24 = null;
    private static final C7000a ajc$tjp_25 = null;
    private static final C7000a ajc$tjp_26 = null;
    private static final C7000a ajc$tjp_27 = null;
    private static final C7000a ajc$tjp_28 = null;
    private static final C7000a ajc$tjp_29 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    private static final C7000a ajc$tjp_8 = null;
    private static final C7000a ajc$tjp_9 = null;
    private int alternateGroup;
    private Date creationTime;
    private long duration;
    private double height;
    private int layer;
    private Matrix matrix = Matrix.ROTATE_0;
    private Date modificationTime;
    private long trackId;
    private float volume;
    private double width;

    static {
        ajc$preClinit();
    }

    public TrackHeaderBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("TrackHeaderBox.java", TrackHeaderBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 60);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 64);
        ajc$tjp_10 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 142);
        ajc$tjp_11 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.lang.String"), 170);
        ajc$tjp_12 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "", "void"), 196);
        ajc$tjp_13 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "", "void"), 203);
        ajc$tjp_14 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "", "void"), 211);
        ajc$tjp_15 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "", "void"), 215);
        ajc$tjp_16 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "", "void"), 222);
        ajc$tjp_17 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "", "void"), 226);
        ajc$tjp_18 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "", "void"), 230);
        ajc$tjp_19 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 234);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "long"), 68);
        ajc$tjp_20 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "", "void"), 238);
        ajc$tjp_21 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "", "void"), 242);
        ajc$tjp_22 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 247);
        ajc$tjp_23 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 251);
        ajc$tjp_24 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 255);
        ajc$tjp_25 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 259);
        ajc$tjp_26 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", Enabled.ELEMENT, "", "void"), 263);
        ajc$tjp_27 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "", "void"), 271);
        ajc$tjp_28 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "", "void"), 279);
        ajc$tjp_29 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "", "void"), 287);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "long"), 72);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"), 76);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"), 80);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "float"), 84);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 88);
        ajc$tjp_8 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"), 92);
        ajc$tjp_9 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"), 96);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.creationTime = DateHelper.convert(IsoTypeReader.readUInt64(byteBuffer));
            this.modificationTime = DateHelper.convert(IsoTypeReader.readUInt64(byteBuffer));
            this.trackId = IsoTypeReader.readUInt32(byteBuffer);
            IsoTypeReader.readUInt32(byteBuffer);
            this.duration = byteBuffer.getLong();
            if (this.duration < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        }
        this.creationTime = DateHelper.convert(IsoTypeReader.readUInt32(byteBuffer));
        this.modificationTime = DateHelper.convert(IsoTypeReader.readUInt32(byteBuffer));
        this.trackId = IsoTypeReader.readUInt32(byteBuffer);
        IsoTypeReader.readUInt32(byteBuffer);
        this.duration = IsoTypeReader.readUInt32(byteBuffer);
        IsoTypeReader.readUInt32(byteBuffer);
        IsoTypeReader.readUInt32(byteBuffer);
        this.layer = IsoTypeReader.readUInt16(byteBuffer);
        this.alternateGroup = IsoTypeReader.readUInt16(byteBuffer);
        this.volume = IsoTypeReader.readFixedPoint88(byteBuffer);
        IsoTypeReader.readUInt16(byteBuffer);
        this.matrix = Matrix.fromByteBuffer(byteBuffer);
        this.width = IsoTypeReader.readFixedPoint1616(byteBuffer);
        this.height = IsoTypeReader.readFixedPoint1616(byteBuffer);
    }

    public int getAlternateGroup() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_5, (Object) this, (Object) this));
        return this.alternateGroup;
    }

    public void getContent(ByteBuffer byteBuffer) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_10, (Object) this, (Object) this, (Object) byteBuffer));
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            IsoTypeWriter.writeUInt64(byteBuffer, DateHelper.convert(this.creationTime));
            IsoTypeWriter.writeUInt64(byteBuffer, DateHelper.convert(this.modificationTime));
            IsoTypeWriter.writeUInt32(byteBuffer, this.trackId);
            IsoTypeWriter.writeUInt32(byteBuffer, 0);
            IsoTypeWriter.writeUInt64(byteBuffer, this.duration);
        } else {
            IsoTypeWriter.writeUInt32(byteBuffer, DateHelper.convert(this.creationTime));
            IsoTypeWriter.writeUInt32(byteBuffer, DateHelper.convert(this.modificationTime));
            IsoTypeWriter.writeUInt32(byteBuffer, this.trackId);
            IsoTypeWriter.writeUInt32(byteBuffer, 0);
            IsoTypeWriter.writeUInt32(byteBuffer, this.duration);
        }
        IsoTypeWriter.writeUInt32(byteBuffer, 0);
        IsoTypeWriter.writeUInt32(byteBuffer, 0);
        IsoTypeWriter.writeUInt16(byteBuffer, this.layer);
        IsoTypeWriter.writeUInt16(byteBuffer, this.alternateGroup);
        IsoTypeWriter.writeFixedPoint88(byteBuffer, (double) this.volume);
        IsoTypeWriter.writeUInt16(byteBuffer, 0);
        this.matrix.getContent(byteBuffer);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.width);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.height);
    }

    protected long getContentSize() {
        return (getVersion() == 1 ? 36 : 24) + 60;
    }

    public Date getCreationTime() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.creationTime;
    }

    public long getDuration() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_3, (Object) this, (Object) this));
        return this.duration;
    }

    public double getHeight() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_9, (Object) this, (Object) this));
        return this.height;
    }

    public int getLayer() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.layer;
    }

    public Matrix getMatrix() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_7, (Object) this, (Object) this));
        return this.matrix;
    }

    public Date getModificationTime() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.modificationTime;
    }

    public long getTrackId() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.trackId;
    }

    public float getVolume() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        return this.volume;
    }

    public double getWidth() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_8, (Object) this, (Object) this));
        return this.width;
    }

    public boolean isEnabled() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_22, (Object) this, (Object) this));
        return (getFlags() & 1) > 0;
    }

    public boolean isInMovie() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_23, (Object) this, (Object) this));
        return (getFlags() & 2) > 0;
    }

    public boolean isInPoster() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_25, (Object) this, (Object) this));
        return (getFlags() & 8) > 0;
    }

    public boolean isInPreview() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_24, (Object) this, (Object) this));
        return (getFlags() & 4) > 0;
    }

    public void setAlternateGroup(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_17, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.alternateGroup = i;
    }

    public void setCreationTime(Date date) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_12, (Object) this, (Object) this, (Object) date));
        this.creationTime = date;
        if (DateHelper.convert(date) >= IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            setVersion(1);
        }
    }

    public void setDuration(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_15, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.duration = j;
        if (j >= IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            setFlags(1);
        }
    }

    public void setEnabled(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_26, (Object) this, (Object) this, C4599a.m8317a(z)));
        setFlags(z ? getFlags() | 1 : getFlags() & -2);
    }

    public void setHeight(double d) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_21, (Object) this, (Object) this, C4599a.m8312a(d)));
        this.height = d;
    }

    public void setInMovie(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_27, (Object) this, (Object) this, C4599a.m8317a(z)));
        setFlags(z ? getFlags() | 2 : getFlags() & -3);
    }

    public void setInPoster(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_29, (Object) this, (Object) this, C4599a.m8317a(z)));
        setFlags(z ? getFlags() | 8 : getFlags() & -9);
    }

    public void setInPreview(boolean z) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_28, (Object) this, (Object) this, C4599a.m8317a(z)));
        setFlags(z ? getFlags() | 4 : getFlags() & -5);
    }

    public void setLayer(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_16, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.layer = i;
    }

    public void setMatrix(Matrix matrix) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_19, (Object) this, (Object) this, (Object) matrix));
        this.matrix = matrix;
    }

    public void setModificationTime(Date date) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_13, (Object) this, (Object) this, (Object) date));
        this.modificationTime = date;
        if (DateHelper.convert(date) >= IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            setVersion(1);
        }
    }

    public void setTrackId(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_14, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.trackId = j;
    }

    public void setVolume(float f) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_18, (Object) this, (Object) this, C4599a.m8313a(f)));
        this.volume = f;
    }

    public void setWidth(double d) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_20, (Object) this, (Object) this, C4599a.m8312a(d)));
        this.width = d;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_11, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TrackHeaderBox[");
        stringBuilder.append("creationTime=");
        stringBuilder.append(getCreationTime());
        stringBuilder.append(";");
        stringBuilder.append("modificationTime=");
        stringBuilder.append(getModificationTime());
        stringBuilder.append(";");
        stringBuilder.append("trackId=");
        stringBuilder.append(getTrackId());
        stringBuilder.append(";");
        stringBuilder.append("duration=");
        stringBuilder.append(getDuration());
        stringBuilder.append(";");
        stringBuilder.append("layer=");
        stringBuilder.append(getLayer());
        stringBuilder.append(";");
        stringBuilder.append("alternateGroup=");
        stringBuilder.append(getAlternateGroup());
        stringBuilder.append(";");
        stringBuilder.append("volume=");
        stringBuilder.append(getVolume());
        stringBuilder.append(";");
        stringBuilder.append("matrix=");
        stringBuilder.append(this.matrix);
        stringBuilder.append(";");
        stringBuilder.append("width=");
        stringBuilder.append(getWidth());
        stringBuilder.append(";");
        stringBuilder.append("height=");
        stringBuilder.append(getHeight());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
