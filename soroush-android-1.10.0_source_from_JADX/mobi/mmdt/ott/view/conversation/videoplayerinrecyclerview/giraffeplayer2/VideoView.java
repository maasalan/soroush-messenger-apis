package mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.tools.ProportionalImageView;

public class VideoView extends FrameLayout {
    public C4116h f11710a;
    private C6227f f11711b;
    private ViewGroup f11712c;
    private VideoInfo f11713d = VideoInfo.m7920a();
    private Activity f11714e;

    public VideoView(Context context) {
        super(context);
        m7921a(context);
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7921a(context);
    }

    public VideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7921a(context);
    }

    public VideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m7921a(context);
    }

    private void m7921a(Context context) {
        this.f11714e = (Activity) context;
        this.f11712c = new FrameLayout(context);
        addView(this.f11712c, new LayoutParams(-1, -1));
        this.f11711b = new C7207b(getContext());
        this.f11711b.mo3235a(this);
        setBackgroundColor(this.f11713d.f11707k);
    }

    public final VideoView m7922a(Object obj) {
        VideoInfo videoInfo = this.f11713d;
        if (!(videoInfo.f11704h == null || videoInfo.f11704h.equals(obj))) {
            C4118i.m7985a().m7992c(videoInfo.f11704h);
        }
        videoInfo.f11700d = String.valueOf(obj);
        videoInfo.f11704h = videoInfo.f11700d;
        return this;
    }

    public final VideoView m7923a(String str) {
        VideoInfo videoInfo = this.f11713d;
        Uri parse = Uri.parse(str);
        if (!(videoInfo.f11705i == null || videoInfo.f11705i.equals(parse))) {
            C4118i.m7985a().m7992c(videoInfo.f11704h);
        }
        videoInfo.f11699c = parse;
        videoInfo.f11705i = videoInfo.f11699c;
        return this;
    }

    public final boolean m7924a() {
        return C4118i.m7985a().m7989a(this.f11713d.f11700d);
    }

    public ViewGroup getContainer() {
        return this.f11712c;
    }

    public ProportionalImageView getCoverView() {
        return (ProportionalImageView) findViewById(R.id.app_video_cover);
    }

    public C6227f getMediaController() {
        return this.f11711b;
    }

    public C4113d getPlayer() {
        if (this.f11713d.f11699c == null) {
            throw new RuntimeException("player uri is null");
        }
        C4118i a = C4118i.m7985a();
        C4113d c4113d = (C4113d) a.f11795d.get(getVideoInfo().f11700d);
        if (c4113d != null) {
            return c4113d;
        }
        VideoInfo videoInfo = getVideoInfo();
        C4118i.m7986a(videoInfo.f11700d, "createPlayer");
        a.f11794c.put(videoInfo.f11700d, this);
        a.m7988a(((Activity) getContext()).getApplication());
        C4113d a2 = C4113d.m7929a(getContext(), videoInfo);
        a.f11795d.put(videoInfo.f11700d, a2);
        a.f11796e.put(getContext(), videoInfo.f11700d);
        return a2;
    }

    public C4116h getPlayerListener() {
        return this.f11710a;
    }

    public VideoInfo getVideoInfo() {
        return this.f11713d;
    }

    public Uri getVideoPath() {
        return this.f11713d.f11699c;
    }
}
