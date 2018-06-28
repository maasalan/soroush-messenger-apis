package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class TrackLoadSettingsAtom extends AbstractBox {
    public static final String TYPE = "load";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    int defaultHints;
    int preloadDuration;
    int preloadFlags;
    int preloadStartTime;

    static {
        ajc$preClinit();
    }

    public TrackLoadSettingsAtom() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("TrackLoadSettingsAtom.java", TrackLoadSettingsAtom.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getPreloadStartTime", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", "int"), 49);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setPreloadStartTime", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "int", "preloadStartTime", "", "void"), 53);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getPreloadDuration", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", "int"), 57);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setPreloadDuration", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "int", "preloadDuration", "", "void"), 61);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getPreloadFlags", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", "int"), 65);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setPreloadFlags", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "int", "preloadFlags", "", "void"), 69);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDefaultHints", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", "int"), 73);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDefaultHints", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "int", "defaultHints", "", "void"), 77);
    }

    protected void _parseDetails(ByteBuffer byteBuffer) {
        this.preloadStartTime = byteBuffer.getInt();
        this.preloadDuration = byteBuffer.getInt();
        this.preloadFlags = byteBuffer.getInt();
        this.defaultHints = byteBuffer.getInt();
    }

    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.preloadStartTime);
        byteBuffer.putInt(this.preloadDuration);
        byteBuffer.putInt(this.preloadFlags);
        byteBuffer.putInt(this.defaultHints);
    }

    protected long getContentSize() {
        return 16;
    }

    public int getDefaultHints() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_6, (Object) this, (Object) this));
        return this.defaultHints;
    }

    public int getPreloadDuration() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.preloadDuration;
    }

    public int getPreloadFlags() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.preloadFlags;
    }

    public int getPreloadStartTime() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.preloadStartTime;
    }

    public void setDefaultHints(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_7, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.defaultHints = i;
    }

    public void setPreloadDuration(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.preloadDuration = i;
    }

    public void setPreloadFlags(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.preloadFlags = i;
    }

    public void setPreloadStartTime(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.preloadStartTime = i;
    }
}
