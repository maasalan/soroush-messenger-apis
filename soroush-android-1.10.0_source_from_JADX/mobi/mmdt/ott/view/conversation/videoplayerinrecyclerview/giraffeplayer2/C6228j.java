package mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2;

import android.net.Uri;
import android.util.Log;
import mobi.mmdt.ott.provider.p386h.C2986h;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C6228j implements C4116h {
    private VideoInfo f16857a;
    private C4116h f16858b;

    public C6228j(VideoInfo videoInfo) {
        this.f16857a = videoInfo;
    }

    private C4116h m14399a() {
        if (this.f16858b != null) {
            return this.f16858b;
        }
        VideoView a = C4118i.m7985a().m7987a(this.f16857a);
        return (a == null || a.getPlayerListener() == null) ? C6222c.f16848r : a.getPlayerListener();
    }

    private void m14400a(String str) {
        if (C4113d.f11756a) {
            Log.d("GiraffeListener", String.format("[fingerprint:%s] %s", new Object[]{this.f16857a.f11700d, str}));
        }
    }

    private C4116h m14401b() {
        VideoView a = C4118i.m7985a().m7987a(this.f16857a);
        return (a == null || a.getMediaController() == null) ? C6222c.f16848r : a.getMediaController();
    }

    public final void mo2382a(int i, int i2) {
        if (C4113d.f11756a) {
            StringBuilder stringBuilder = new StringBuilder("onDisplayModelChange:");
            stringBuilder.append(i);
            stringBuilder.append("->");
            stringBuilder.append(i2);
            m14400a(stringBuilder.toString());
        }
        m14401b().mo2382a(i, i2);
        m14399a().mo2382a(i, i2);
    }

    public final void mo2383a(C4113d c4113d) {
        m14400a("onCompletion");
        String str = c4113d.f11766k.f11700d;
        m14401b().mo2383a(c4113d);
        m14399a().mo2383a(c4113d);
    }

    public final void mo2384a(C4113d c4113d, int i) {
        m14401b().mo2384a(c4113d, i);
        m14399a().mo2384a(c4113d, i);
    }

    public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
        m14400a("onRelease");
        m14401b().mo2385a(c4113d, uri, j, j2, c2986h);
        m14399a().mo2385a(c4113d, uri, j, j2, c2986h);
    }

    public final void mo2386a(C4113d c4113d, IjkTimedText ijkTimedText) {
        if (C4113d.f11756a) {
            StringBuilder stringBuilder = new StringBuilder("onTimedText:");
            stringBuilder.append(ijkTimedText != null ? ijkTimedText.getText() : "null");
            m14400a(stringBuilder.toString());
        }
        m14401b().mo2386a(c4113d, ijkTimedText);
        m14399a().mo2386a(c4113d, ijkTimedText);
    }

    public final boolean mo2387a(C4113d c4113d, int i, int i2) {
        if (C4113d.f11756a) {
            StringBuilder stringBuilder = new StringBuilder("onInfo:");
            stringBuilder.append(i);
            stringBuilder.append(",");
            stringBuilder.append(i2);
            m14400a(stringBuilder.toString());
        }
        m14401b().mo2387a(c4113d, i, i2);
        return m14399a().mo2387a(c4113d, i, i2);
    }

    public final void mo2388b(int i, int i2) {
        if (C4113d.f11756a) {
            StringBuilder stringBuilder = new StringBuilder("onTargetStateChange:");
            stringBuilder.append(i);
            stringBuilder.append("->");
            stringBuilder.append(i2);
            m14400a(stringBuilder.toString());
        }
        m14401b().mo2388b(i, i2);
        m14399a().mo2388b(i, i2);
    }

    public final void mo2389b(C4113d c4113d) {
        m14400a("onStart");
        m14401b().mo2389b(c4113d);
        m14399a().mo2389b(c4113d);
    }

    public final boolean mo2390b(C4113d c4113d, int i, int i2) {
        if (C4113d.f11756a) {
            StringBuilder stringBuilder = new StringBuilder("onError:");
            stringBuilder.append(i);
            stringBuilder.append(",");
            stringBuilder.append(i2);
            m14400a(stringBuilder.toString());
        }
        m14401b().mo2390b(c4113d, i, i2);
        return m14399a().mo2390b(c4113d, i, i2);
    }

    public final void mo2391c(int i, int i2) {
        if (C4113d.f11756a) {
            StringBuilder stringBuilder = new StringBuilder("onCurrentStateChange:");
            stringBuilder.append(i);
            stringBuilder.append("->");
            stringBuilder.append(i2);
            m14400a(stringBuilder.toString());
        }
        m14401b().mo2391c(i, i2);
        m14399a().mo2391c(i, i2);
    }

    public final void mo2392c(C4113d c4113d) {
        m14400a("onPrepared");
        m14401b().mo2392c(c4113d);
        m14399a().mo2392c(c4113d);
    }

    public final void mo2393d(C4113d c4113d) {
        m14400a("onPreparing");
        m14401b().mo2393d(c4113d);
        m14399a().mo2393d(c4113d);
    }

    public final void mo2394e(C4113d c4113d) {
        m14400a("onSeekComplete");
        m14401b().mo2394e(c4113d);
        m14399a().mo2394e(c4113d);
    }

    public final void mo2395f(C4113d c4113d) {
        m14400a("onPause");
        m14401b().mo2395f(c4113d);
        m14399a().mo2395f(c4113d);
    }
}
