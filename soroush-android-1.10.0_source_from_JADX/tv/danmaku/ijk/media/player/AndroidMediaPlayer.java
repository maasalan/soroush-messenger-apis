package tv.danmaku.ijk.media.player;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaDataSource;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnTimedTextListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.TimedText;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import tv.danmaku.ijk.media.player.misc.AndroidTrackInfo;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;
import tv.danmaku.ijk.media.player.pragma.DebugLog;

public class AndroidMediaPlayer extends AbstractMediaPlayer {
    private static MediaInfo sMediaInfo;
    private String mDataSource;
    private final Object mInitLock = new Object();
    private final AndroidMediaPlayerListenerHolder mInternalListenerAdapter;
    private final MediaPlayer mInternalMediaPlayer;
    private boolean mIsReleased;
    private MediaDataSource mMediaDataSource;

    private class AndroidMediaPlayerListenerHolder implements OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnSeekCompleteListener, OnTimedTextListener, OnVideoSizeChangedListener {
        private Handler handler = new Handler(Looper.getMainLooper());
        public final WeakReference<AndroidMediaPlayer> mWeakMediaPlayer;

        class C78554 implements Runnable {
            C78554() {
            }

            public void run() {
                if (((AndroidMediaPlayer) AndroidMediaPlayerListenerHolder.this.mWeakMediaPlayer.get()) != null) {
                    AndroidMediaPlayer.this.notifyOnSeekComplete();
                }
            }
        }

        class C78576 implements Runnable {
            C78576() {
            }

            public void run() {
                if (((AndroidMediaPlayer) AndroidMediaPlayerListenerHolder.this.mWeakMediaPlayer.get()) != null) {
                    AndroidMediaPlayer.this.notifyOnCompletion();
                }
            }
        }

        class C78587 implements Runnable {
            C78587() {
            }

            public void run() {
                if (((AndroidMediaPlayer) AndroidMediaPlayerListenerHolder.this.mWeakMediaPlayer.get()) != null) {
                    AndroidMediaPlayer.this.notifyOnPrepared();
                }
            }
        }

        public AndroidMediaPlayerListenerHolder(AndroidMediaPlayer androidMediaPlayer) {
            this.mWeakMediaPlayer = new WeakReference(androidMediaPlayer);
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, final int i) {
            this.handler.post(new Runnable() {
                public void run() {
                    if (((AndroidMediaPlayer) AndroidMediaPlayerListenerHolder.this.mWeakMediaPlayer.get()) != null) {
                        AndroidMediaPlayer.this.notifyOnBufferingUpdate(i);
                    }
                }
            });
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            this.handler.post(new C78576());
        }

        public boolean onError(MediaPlayer mediaPlayer, final int i, final int i2) {
            return this.handler.post(new Runnable() {
                public void run() {
                    if (((AndroidMediaPlayer) AndroidMediaPlayerListenerHolder.this.mWeakMediaPlayer.get()) != null) {
                        AndroidMediaPlayer.this.notifyOnError(i, i2);
                    }
                }
            });
        }

        public boolean onInfo(MediaPlayer mediaPlayer, final int i, final int i2) {
            return this.handler.post(new Runnable() {
                public void run() {
                    if (((AndroidMediaPlayer) AndroidMediaPlayerListenerHolder.this.mWeakMediaPlayer.get()) != null) {
                        AndroidMediaPlayer.this.notifyOnInfo(i, i2);
                    }
                }
            });
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            this.handler.post(new C78587());
        }

        public void onSeekComplete(MediaPlayer mediaPlayer) {
            this.handler.post(new C78554());
        }

        public void onTimedText(MediaPlayer mediaPlayer, final TimedText timedText) {
            this.handler.post(new Runnable() {
                public void run() {
                    if (((AndroidMediaPlayer) AndroidMediaPlayerListenerHolder.this.mWeakMediaPlayer.get()) != null) {
                        IjkTimedText ijkTimedText = null;
                        if (timedText != null) {
                            ijkTimedText = new IjkTimedText(timedText.getBounds(), timedText.getText());
                        }
                        AndroidMediaPlayer.this.notifyOnTimedText(ijkTimedText);
                    }
                }
            });
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, final int i, final int i2) {
            this.handler.post(new Runnable() {
                public void run() {
                    if (((AndroidMediaPlayer) AndroidMediaPlayerListenerHolder.this.mWeakMediaPlayer.get()) != null) {
                        AndroidMediaPlayer.this.notifyOnVideoSizeChanged(i, i2, 1, 1);
                    }
                }
            });
        }
    }

    @TargetApi(23)
    private static class MediaDataSourceProxy extends MediaDataSource {
        private final IMediaDataSource mMediaDataSource;

        public MediaDataSourceProxy(IMediaDataSource iMediaDataSource) {
            this.mMediaDataSource = iMediaDataSource;
        }

        public void close() {
            this.mMediaDataSource.close();
        }

        public long getSize() {
            return this.mMediaDataSource.getSize();
        }

        public int readAt(long j, byte[] bArr, int i, int i2) {
            return this.mMediaDataSource.readAt(j, bArr, i, i2);
        }
    }

    public AndroidMediaPlayer() {
        synchronized (this.mInitLock) {
            this.mInternalMediaPlayer = new MediaPlayer();
        }
        this.mInternalMediaPlayer.setAudioStreamType(3);
        this.mInternalListenerAdapter = new AndroidMediaPlayerListenerHolder(this);
        attachInternalListeners();
    }

    private void attachInternalListeners() {
        this.mInternalMediaPlayer.setOnPreparedListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnBufferingUpdateListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnCompletionListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnSeekCompleteListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnVideoSizeChangedListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnErrorListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnInfoListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnTimedTextListener(this.mInternalListenerAdapter);
    }

    private void releaseMediaDataSource() {
        if (this.mMediaDataSource != null) {
            try {
                this.mMediaDataSource.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.mMediaDataSource = null;
        }
    }

    public int getAudioSessionId() {
        return this.mInternalMediaPlayer.getAudioSessionId();
    }

    public long getCurrentPosition() {
        try {
            return (long) this.mInternalMediaPlayer.getCurrentPosition();
        } catch (Throwable e) {
            DebugLog.printStackTrace(e);
            return 0;
        }
    }

    public String getDataSource() {
        return this.mDataSource;
    }

    public long getDuration() {
        try {
            return (long) this.mInternalMediaPlayer.getDuration();
        } catch (Throwable e) {
            DebugLog.printStackTrace(e);
            return 0;
        }
    }

    public MediaPlayer getInternalMediaPlayer() {
        return this.mInternalMediaPlayer;
    }

    public MediaInfo getMediaInfo() {
        if (sMediaInfo == null) {
            MediaInfo mediaInfo = new MediaInfo();
            mediaInfo.mVideoDecoder = "android";
            mediaInfo.mVideoDecoderImpl = "HW";
            mediaInfo.mAudioDecoder = "android";
            mediaInfo.mAudioDecoderImpl = "HW";
            sMediaInfo = mediaInfo;
        }
        return sMediaInfo;
    }

    public ITrackInfo[] getTrackInfo() {
        return AndroidTrackInfo.fromMediaPlayer(this.mInternalMediaPlayer);
    }

    public int getVideoHeight() {
        return this.mInternalMediaPlayer.getVideoHeight();
    }

    public int getVideoSarDen() {
        return 1;
    }

    public int getVideoSarNum() {
        return 1;
    }

    public int getVideoWidth() {
        return this.mInternalMediaPlayer.getVideoWidth();
    }

    public boolean isLooping() {
        return this.mInternalMediaPlayer.isLooping();
    }

    public boolean isPlayable() {
        return true;
    }

    public boolean isPlaying() {
        try {
            return this.mInternalMediaPlayer.isPlaying();
        } catch (Throwable e) {
            DebugLog.printStackTrace(e);
            return false;
        }
    }

    public void pause() {
        this.mInternalMediaPlayer.pause();
    }

    public void prepareAsync() {
        this.mInternalMediaPlayer.prepareAsync();
    }

    public void release() {
        this.mIsReleased = true;
        this.mInternalMediaPlayer.release();
        releaseMediaDataSource();
        resetListeners();
        attachInternalListeners();
    }

    public void reset() {
        try {
            this.mInternalMediaPlayer.reset();
        } catch (Throwable e) {
            DebugLog.printStackTrace(e);
        }
        releaseMediaDataSource();
        resetListeners();
        attachInternalListeners();
    }

    public void seekTo(long j) {
        this.mInternalMediaPlayer.seekTo((int) j);
    }

    public void setAudioStreamType(int i) {
        this.mInternalMediaPlayer.setAudioStreamType(i);
    }

    public void setDataSource(Context context, Uri uri) {
        this.mInternalMediaPlayer.setDataSource(context, uri);
    }

    @TargetApi(14)
    public void setDataSource(Context context, Uri uri, Map<String, String> map) {
        this.mInternalMediaPlayer.setDataSource(context, uri, map);
    }

    public void setDataSource(FileDescriptor fileDescriptor) {
        this.mInternalMediaPlayer.setDataSource(fileDescriptor);
    }

    public void setDataSource(String str) {
        this.mDataSource = str;
        Uri parse = Uri.parse(str);
        Object scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equalsIgnoreCase("file")) {
            this.mInternalMediaPlayer.setDataSource(str);
        } else {
            this.mInternalMediaPlayer.setDataSource(parse.getPath());
        }
    }

    @TargetApi(23)
    public void setDataSource(IMediaDataSource iMediaDataSource) {
        releaseMediaDataSource();
        this.mMediaDataSource = new MediaDataSourceProxy(iMediaDataSource);
        this.mInternalMediaPlayer.setDataSource(this.mMediaDataSource);
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        synchronized (this.mInitLock) {
            if (!this.mIsReleased) {
                this.mInternalMediaPlayer.setDisplay(surfaceHolder);
            }
        }
    }

    public void setKeepInBackground(boolean z) {
    }

    public void setLogEnabled(boolean z) {
    }

    public void setLooping(boolean z) {
        this.mInternalMediaPlayer.setLooping(z);
    }

    public void setScreenOnWhilePlaying(boolean z) {
        this.mInternalMediaPlayer.setScreenOnWhilePlaying(z);
    }

    @TargetApi(14)
    public void setSurface(Surface surface) {
        this.mInternalMediaPlayer.setSurface(surface);
    }

    public void setVolume(float f, float f2) {
        this.mInternalMediaPlayer.setVolume(f, f2);
    }

    public void setWakeMode(Context context, int i) {
        this.mInternalMediaPlayer.setWakeMode(context, i);
    }

    public void start() {
        this.mInternalMediaPlayer.start();
    }

    public void stop() {
        this.mInternalMediaPlayer.stop();
    }
}
