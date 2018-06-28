package mobi.mmdt.ott.logic.p364n;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import java.util.Timer;
import java.util.TimerTask;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2968f;
import mobi.mmdt.ott.provider.p386h.C2983b;
import mobi.mmdt.ott.provider.p386h.C2984c;
import mobi.mmdt.ott.provider.p386h.C2986h;
import mobi.mmdt.ott.provider.p386h.C6025e;
import mobi.mmdt.ott.provider.p386h.C6027g;

public final class C2867a {
    private static C2867a f8960e;
    MediaPlayer f8961a = new MediaPlayer();
    Timer f8962b = new Timer();
    C2983b f8963c;
    C2986h f8964d = C2986h.STOP;
    private C2968f f8965f;

    class C28641 extends TimerTask {
        final /* synthetic */ C2867a f8957a;

        C28641(C2867a c2867a) {
            this.f8957a = c2867a;
        }

        public final void run() {
            try {
                if (this.f8957a.f8961a != null) {
                    C2984c.m7462b(this.f8957a.f8963c.f9332a, this.f8957a.f8961a.getCurrentPosition());
                }
            } catch (Throwable e) {
                C2480b.m6738b(e);
            }
        }
    }

    class C28652 implements OnCompletionListener {
        final /* synthetic */ C2867a f8958a;

        C28652(C2867a c2867a) {
            this.f8958a = c2867a;
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            this.f8958a.f8962b.cancel();
            C2984c.m7462b(this.f8958a.f8963c.f9332a, 0);
            C2984c.m7455a(this.f8958a.f8963c.f9332a, C2986h.STOP);
            this.f8958a.f8964d = C2986h.STOP;
        }
    }

    class C28663 implements OnErrorListener {
        final /* synthetic */ C2867a f8959a;

        C28663(C2867a c2867a) {
            this.f8959a = c2867a;
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            this.f8959a.f8962b.cancel();
            C2984c.m7462b(this.f8959a.f8963c.f9332a, 0);
            C2984c.m7455a(this.f8959a.f8963c.f9332a, C2986h.STOP);
            this.f8959a.f8964d = C2986h.STOP;
            return false;
        }
    }

    private C2867a() {
        C2984c.m7458a(C2986h.STOP);
        C2984c.m7465b(C2986h.STOP);
    }

    public static C2867a m7211a() {
        if (f8960e == null) {
            f8960e = new C2867a();
        }
        return f8960e;
    }

    private void m7212c() {
        this.f8962b = new Timer();
        this.f8962b.schedule(new C28641(this), 250, 250);
    }

    private void m7213d() {
        C2984c.m7462b(this.f8963c.f9332a, 0);
        this.f8961a = new MediaPlayer();
        this.f8961a.setDataSource(MyApplication.m12952b(), this.f8963c.f9334c);
        this.f8961a.setLooping(false);
        this.f8961a.setOnCompletionListener(new C28652(this));
        this.f8961a.setOnErrorListener(new C28663(this));
        this.f8961a.prepare();
        long j = this.f8963c.f9332a;
        int duration = this.f8961a.getDuration();
        C6025e c6025e = new C6025e();
        c6025e.m13449a(Integer.valueOf(duration));
        C6027g c6027g = new C6027g();
        c6027g.m13470b(j);
        c6025e.m13445a(MyApplication.m12952b(), c6027g);
        this.f8961a.start();
        this.f8964d = C2986h.PLAYING;
        m7212c();
        C2984c.m7455a(this.f8963c.f9332a, C2986h.PLAYING);
    }

    private synchronized void m7214e() {
        this.f8962b.cancel();
        this.f8961a.stop();
        this.f8961a.release();
        C2984c.m7455a(this.f8963c.f9332a, C2986h.STOP);
        C2984c.m7462b(this.f8963c.f9332a, 0);
        this.f8964d = C2986h.STOP;
    }

    public final synchronized void m7215a(int i) {
        if (this.f8963c != null) {
            this.f8961a.seekTo(i);
            C2984c.m7462b(this.f8963c.f9332a, i);
        }
    }

    public final synchronized void m7216a(long j) {
        if (this.f8964d.equals(C2986h.PAUSE) && j == this.f8965f.f9205a) {
            C2984c.m7455a(this.f8963c.f9332a, C2986h.PLAYING);
            this.f8961a.start();
            this.f8964d = C2986h.PLAYING;
            m7212c();
            return;
        }
        if (!this.f8964d.equals(C2986h.PLAYING)) {
            if (!this.f8964d.equals(C2986h.PAUSE)) {
                C2984c.m7458a(C2986h.STOP);
                C2984c.m7465b(C2986h.STOP);
                this.f8965f = C2966b.m7399a(j);
                this.f8963c = C2984c.m7461a(this.f8965f.f9216l.longValue());
                m7213d();
                return;
            }
        }
        m7214e();
        this.f8965f = C2966b.m7399a(j);
        this.f8963c = C2984c.m7461a(this.f8965f.f9216l.longValue());
        m7213d();
    }

    public final synchronized void m7217b() {
        if (this.f8963c != null) {
            this.f8962b.cancel();
            this.f8961a.pause();
            C2984c.m7455a(this.f8963c.f9332a, C2986h.PAUSE);
            C2984c.m7462b(this.f8963c.f9332a, this.f8961a.getCurrentPosition());
            this.f8964d = C2986h.PAUSE;
        }
    }
}
