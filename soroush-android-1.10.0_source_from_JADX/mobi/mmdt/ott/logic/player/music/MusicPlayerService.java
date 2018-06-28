package mobi.mmdt.ott.logic.player.music;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;

public class MusicPlayerService extends Service implements OnCompletionListener, OnErrorListener, OnPreparedListener {
    MediaPlayer f9017a;
    ArrayList<Uri> f9018b = new ArrayList();
    int f9019c;
    private final IBinder f9020d = new C2882a(this);

    public class C2882a extends Binder {
        final /* synthetic */ MusicPlayerService f9016a;

        public C2882a(MusicPlayerService musicPlayerService) {
            this.f9016a = musicPlayerService;
        }
    }

    public static int m7239a(Uri uri) {
        return MediaPlayer.create(MyApplication.m12952b(), uri).getDuration();
    }

    public IBinder onBind(Intent intent) {
        return this.f9020d;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        C2886b.f9024b.m_();
    }

    public void onCreate() {
        super.onCreate();
        Log.e("***", "Service Oncretae");
        this.f9017a = new MediaPlayer();
        this.f9017a.setWakeMode(getApplicationContext(), 1);
        this.f9017a.setAudioStreamType(3);
        this.f9017a.setOnPreparedListener(this);
        this.f9017a.setOnCompletionListener(this);
        this.f9017a.setOnErrorListener(this);
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder("Player Error : ");
        stringBuilder.append(i);
        stringBuilder.append(" - ");
        stringBuilder.append(i2);
        C2480b.m6732a(stringBuilder.toString());
        return false;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
    }

    public boolean onUnbind(Intent intent) {
        Log.e("***", "onUnbind");
        this.f9017a.stop();
        this.f9017a.release();
        return false;
    }
}
