package com.coremedia.iso.boxes;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.DateHelper;
import com.googlecode.mp4parser.util.Matrix;
import java.nio.ByteBuffer;
import java.util.Date;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class MovieHeaderBox extends AbstractFullBox {
    public static final String TYPE = "mvhd";
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
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    private static final C7000a ajc$tjp_8 = null;
    private static final C7000a ajc$tjp_9 = null;
    private Date creationTime;
    private int currentTime;
    private long duration;
    private Matrix matrix = Matrix.ROTATE_0;
    private Date modificationTime;
    private long nextTrackId;
    private int posterTime;
    private int previewDuration;
    private int previewTime;
    private double rate = 1.0d;
    private int selectionDuration;
    private int selectionTime;
    private long timescale;
    private float volume = BallPulseIndicator.SCALE;

    static {
        ajc$preClinit();
    }

    public MovieHeaderBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("MovieHeaderBox.java", MovieHeaderBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 63);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 67);
        ajc$tjp_10 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "", "void"), 203);
        ajc$tjp_11 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "", "void"), 211);
        ajc$tjp_12 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "", "void"), 215);
        ajc$tjp_13 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "", "void"), 222);
        ajc$tjp_14 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "", "void"), 226);
        ajc$tjp_15 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 230);
        ajc$tjp_16 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "", "void"), 234);
        ajc$tjp_17 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 238);
        ajc$tjp_18 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "", "void"), 242);
        ajc$tjp_19 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 246);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 71);
        ajc$tjp_20 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "", "void"), (int) Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        ajc$tjp_21 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 254);
        ajc$tjp_22 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "", "void"), 258);
        ajc$tjp_23 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 262);
        ajc$tjp_24 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "", "void"), 266);
        ajc$tjp_25 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 270);
        ajc$tjp_26 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "", "void"), 274);
        ajc$tjp_27 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 278);
        ajc$tjp_28 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "", "void"), 282);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 75);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "double"), 79);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "float"), 83);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 87);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 91);
        ajc$tjp_8 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.lang.String"), 139);
        ajc$tjp_9 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "", "void"), 195);
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
        this.rate = IsoTypeReader.readFixedPoint1616(byteBuffer);
        this.volume = IsoTypeReader.readFixedPoint88(byteBuffer);
        IsoTypeReader.readUInt16(byteBuffer);
        IsoTypeReader.readUInt32(byteBuffer);
        IsoTypeReader.readUInt32(byteBuffer);
        this.matrix = Matrix.fromByteBuffer(byteBuffer);
        this.previewTime = byteBuffer.getInt();
        this.previewDuration = byteBuffer.getInt();
        this.posterTime = byteBuffer.getInt();
        this.selectionTime = byteBuffer.getInt();
        this.selectionDuration = byteBuffer.getInt();
        this.currentTime = byteBuffer.getInt();
        this.nextTrackId = IsoTypeReader.readUInt32(byteBuffer);
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
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.rate);
        IsoTypeWriter.writeFixedPoint88(byteBuffer, (double) this.volume);
        IsoTypeWriter.writeUInt16(byteBuffer, 0);
        IsoTypeWriter.writeUInt32(byteBuffer, 0);
        IsoTypeWriter.writeUInt32(byteBuffer, 0);
        this.matrix.getContent(byteBuffer);
        byteBuffer.putInt(this.previewTime);
        byteBuffer.putInt(this.previewDuration);
        byteBuffer.putInt(this.posterTime);
        byteBuffer.putInt(this.selectionTime);
        byteBuffer.putInt(this.selectionDuration);
        byteBuffer.putInt(this.currentTime);
        IsoTypeWriter.writeUInt32(byteBuffer, this.nextTrackId);
    }

    protected long getContentSize() {
        return (getVersion() == 1 ? 32 : 20) + 80;
    }

    public Date getCreationTime() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.creationTime;
    }

    public int getCurrentTime() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_27, (Object) this, (Object) this));
        return this.currentTime;
    }

    public long getDuration() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_3, (Object) this, (Object) this));
        return this.duration;
    }

    public Matrix getMatrix() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        return this.matrix;
    }

    public Date getModificationTime() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.modificationTime;
    }

    public long getNextTrackId() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_7, (Object) this, (Object) this));
        return this.nextTrackId;
    }

    public int getPosterTime() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_21, (Object) this, (Object) this));
        return this.posterTime;
    }

    public int getPreviewDuration() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_19, (Object) this, (Object) this));
        return this.previewDuration;
    }

    public int getPreviewTime() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_17, (Object) this, (Object) this));
        return this.previewTime;
    }

    public double getRate() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.rate;
    }

    public int getSelectionDuration() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_25, (Object) this, (Object) this));
        return this.selectionDuration;
    }

    public int getSelectionTime() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_23, (Object) this, (Object) this));
        return this.selectionTime;
    }

    public long getTimescale() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.timescale;
    }

    public float getVolume() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_5, (Object) this, (Object) this));
        return this.volume;
    }

    public void setCreationTime(Date date) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_9, (Object) this, (Object) this, (Object) date));
        this.creationTime = date;
        if (DateHelper.convert(date) >= IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            setVersion(1);
        }
    }

    public void setCurrentTime(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_28, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.currentTime = i;
    }

    public void setDuration(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_12, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.duration = j;
        if (j >= IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            setVersion(1);
        }
    }

    public void setMatrix(Matrix matrix) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_15, (Object) this, (Object) this, (Object) matrix));
        this.matrix = matrix;
    }

    public void setModificationTime(Date date) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_10, (Object) this, (Object) this, (Object) date));
        this.modificationTime = date;
        if (DateHelper.convert(date) >= IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            setVersion(1);
        }
    }

    public void setNextTrackId(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_16, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.nextTrackId = j;
    }

    public void setPosterTime(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_22, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.posterTime = i;
    }

    public void setPreviewDuration(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_20, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.previewDuration = i;
    }

    public void setPreviewTime(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_18, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.previewTime = i;
    }

    public void setRate(double d) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_13, (Object) this, (Object) this, C4599a.m8312a(d)));
        this.rate = d;
    }

    public void setSelectionDuration(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_26, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.selectionDuration = i;
    }

    public void setSelectionTime(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_24, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.selectionTime = i;
    }

    public void setTimescale(long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_11, (Object) this, (Object) this, C4599a.m8315a(j)));
        this.timescale = j;
    }

    public void setVolume(float f) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_14, (Object) this, (Object) this, C4599a.m8313a(f)));
        this.volume = f;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_8, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MovieHeaderBox[");
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
        stringBuilder.append("rate=");
        stringBuilder.append(getRate());
        stringBuilder.append(";");
        stringBuilder.append("volume=");
        stringBuilder.append(getVolume());
        stringBuilder.append(";");
        stringBuilder.append("matrix=");
        stringBuilder.append(this.matrix);
        stringBuilder.append(";");
        stringBuilder.append("nextTrackId=");
        stringBuilder.append(getNextTrackId());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
