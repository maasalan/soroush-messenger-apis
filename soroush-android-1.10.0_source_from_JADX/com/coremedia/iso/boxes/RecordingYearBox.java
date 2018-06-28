package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class RecordingYearBox extends AbstractFullBox {
    public static final String TYPE = "yrrc";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    int recordingYear;

    static {
        ajc$preClinit();
    }

    public RecordingYearBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("RecordingYearBox.java", RecordingYearBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getRecordingYear", "com.coremedia.iso.boxes.RecordingYearBox", "", "", "", "int"), 42);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setRecordingYear", "com.coremedia.iso.boxes.RecordingYearBox", "int", "recordingYear", "", "void"), 46);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.recordingYear = IsoTypeReader.readUInt16(byteBuffer);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt16(byteBuffer, this.recordingYear);
    }

    protected long getContentSize() {
        return 6;
    }

    public int getRecordingYear() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.recordingYear;
    }

    public void setRecordingYear(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.recordingYear = i;
    }
}
