package mobi.mmdt.ott.logic.player.music;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.player.music.MusicPlayerService.C2882a;

public final class C2886b {
    static boolean f9023a;
    public static C2887c f9024b;
    private static C2886b f9025f;
    public MusicPlayerService f9026c;
    Handler f9027d;
    Uri f9028e;
    private final Runnable f9029g = new C28841(this);
    private ServiceConnection f9030h = new C28852(this);

    class C28841 implements Runnable {
        final /* synthetic */ C2886b f9021a;

        C28841(C2886b c2886b) {
            this.f9021a = c2886b;
        }

        public final void run() {
            if (this.f9021a.f9027d != null && this.f9021a.f9028e != null) {
                int c = this.f9021a.m7246c();
                C2886b c2886b = this.f9021a;
                if (c2886b.f9026c == null) {
                    throw new IllegalAccessError("Music Player Service Not Binding! ");
                }
                int duration = c2886b.f9026c.f9017a.getDuration();
                if (c > duration) {
                    c = duration;
                }
                if (C2886b.f9024b != null) {
                    C2886b.f9024b.mo3672a(c, duration);
                }
                if (this.f9021a.f9027d != null) {
                    this.f9021a.f9027d.postDelayed(this, 100);
                }
            }
        }
    }

    class C28852 implements ServiceConnection {
        final /* synthetic */ C2886b f9022a;

        C28852(C2886b c2886b) {
            this.f9022a = c2886b;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.e("***", "onServiceConnected");
            C2882a c2882a = (C2882a) iBinder;
            this.f9022a.f9026c = c2882a.f9016a;
            C2886b.f9023a = true;
            C2886b.f9024b.mo3671a();
            C2886b c2886b = this.f9022a;
            if (c2886b.f9026c == null) {
                throw new IllegalAccessError("Music Player Service Not Binding! ");
            }
            MusicPlayerService musicPlayerService = c2886b.f9026c;
            if (musicPlayerService.f9017a != null) {
                musicPlayerService.f9017a.start();
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            Log.e("***", "onServiceDisconnected");
            C2886b.f9023a = false;
            C2886b.f9024b.mo3673b();
        }
    }

    private C2886b(C2887c c2887c) {
        f9024b = c2887c;
        Context b = MyApplication.m12952b();
        Intent intent = new Intent(b, MusicPlayerService.class);
        b.bindService(intent, this.f9030h, 1);
        b.startService(intent);
        Log.e("***", "onStart1");
    }

    public static C2886b m7241a(C2887c c2887c) {
        if (f9025f == null || !f9023a) {
            f9025f = new C2886b(c2887c);
        }
        return f9025f;
    }

    public final void m7242a() {
        if (this.f9026c == null) {
            throw new IllegalAccessError("Music Player Service Not Binding! ");
        }
        MusicPlayerService musicPlayerService = this.f9026c;
        musicPlayerService.f9017a.reset();
        try {
            musicPlayerService.f9017a.setDataSource(musicPlayerService.getApplicationContext(), (Uri) musicPlayerService.f9018b.get(musicPlayerService.f9019c));
        } catch (Throwable e) {
            Log.e("MUSIC SERVICE", "Error setting data source", e);
        }
        musicPlayerService.f9017a.prepareAsync();
        if (this.f9027d == null) {
            this.f9027d = new Handler();
        }
        this.f9027d.post(this.f9029g);
    }

    public final void m7243a(int i) {
        if (this.f9026c == null) {
            throw new IllegalAccessError("Music Player Service Not Binding! ");
        }
        StringBuilder stringBuilder = new StringBuilder("seek:");
        stringBuilder.append(i);
        Log.e("***", stringBuilder.toString());
        MusicPlayerService musicPlayerService = this.f9026c;
        stringBuilder = new StringBuilder("seek1:");
        stringBuilder.append(i);
        C2480b.m6732a(stringBuilder.toString());
        musicPlayerService.f9017a.seekTo(i);
    }

    public final void m7244a(Uri uri) {
        MusicPlayerService musicPlayerService = this.f9026c;
        musicPlayerService.f9019c = musicPlayerService.f9018b.indexOf(uri);
        if (musicPlayerService.f9019c == -1) {
            musicPlayerService.f9018b.add(uri);
        }
        musicPlayerService.f9019c = musicPlayerService.f9018b.indexOf(uri);
        this.f9028e = uri;
    }

    public final void m7245b() {
        this.f9026c.f9017a.start();
        if (this.f9027d == null) {
            this.f9027d = new Handler();
        }
        this.f9027d.post(this.f9029g);
    }

    public final int m7246c() {
        if (this.f9026c != null) {
            return this.f9026c.f9017a.getCurrentPosition();
        }
        throw new IllegalAccessError("Music Player Service Not Binding! ");
    }

    public final boolean m7247d() {
        if (this.f9026c != null) {
            return this.f9026c.f9017a.isPlaying();
        }
        throw new IllegalAccessError("Music Player Service Not Binding! ");
    }

    public final void m7248e() {
        Log.e("MusicPlayerController", "pausePlayer");
        if (this.f9026c == null) {
            throw new IllegalAccessError("Music Player Service Not Binding! ");
        }
        this.f9026c.f9017a.pause();
        if (this.f9027d != null) {
            this.f9027d.removeCallbacks(this.f9029g);
        }
    }
}
