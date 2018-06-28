package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class AppleRecordingYearBox extends AppleDataBox {
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    Date date = new Date();
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'kk:mm:ssZ");

    static {
        ajc$preClinit();
    }

    public AppleRecordingYearBox() {
        super("©day", 1);
        this.df.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("AppleRecordingYearBox.java", AppleRecordingYearBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDate", "com.googlecode.mp4parser.boxes.apple.AppleRecordingYearBox", "", "", "", "java.util.Date"), 27);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDate", "com.googlecode.mp4parser.boxes.apple.AppleRecordingYearBox", "java.util.Date", "date", "", "void"), 31);
    }

    protected static String iso8601toRfc822Date(String str) {
        return str.replaceAll("Z$", "+0000").replaceAll("([0-9][0-9]):([0-9][0-9])$", "$1$2");
    }

    protected static String rfc822toIso8601Date(String str) {
        return str.replaceAll("\\+0000$", "Z");
    }

    protected int getDataLength() {
        return Utf8.convert(rfc822toIso8601Date(this.df.format(this.date))).length;
    }

    public Date getDate() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.date;
    }

    protected void parseData(ByteBuffer byteBuffer) {
        try {
            this.date = this.df.parse(iso8601toRfc822Date(IsoTypeReader.readString(byteBuffer, byteBuffer.remaining())));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setDate(Date date) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) date));
        this.date = date;
    }

    protected byte[] writeData() {
        return Utf8.convert(rfc822toIso8601Date(this.df.format(this.date)));
    }
}
