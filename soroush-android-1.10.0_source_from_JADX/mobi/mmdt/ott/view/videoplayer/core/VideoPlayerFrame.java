package mobi.mmdt.ott.view.videoplayer.core;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import java.util.HashMap;
import java.util.Map;
import mobi.mmdt.componentsutils.p232b.C2492j;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

public class VideoPlayerFrame extends FrameLayout implements SurfaceTextureListener, OnClickListener, OnSeekBarChangeListener, OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnPreparedListener, OnVideoSizeChangedListener {
    public IjkMediaPlayer f17213a;
    public Handler f17214b;
    private TextureView f17215c;
    private Surface f17216d;
    private View f17217e;
    private boolean f17218f;
    private boolean f17219g;
    private boolean f17220h;
    private int f17221i;
    private int f17222j;
    private Uri f17223k;
    private C4593a f17224l;
    private boolean f17225m;
    private int f17226n = -1;

    public VideoPlayerFrame(Context context) {
        super(context);
        m14718f();
    }

    public VideoPlayerFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14718f();
    }

    public VideoPlayerFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m14718f();
    }

    private void m14716a(int i, int i2, int i3, int i4) {
        double d = ((double) i4) / ((double) i3);
        i3 = (int) (((double) i) * d);
        if (i2 > i3) {
            i4 = i3;
            i3 = i;
        } else {
            i3 = (int) (((double) i2) / d);
            i4 = i2;
        }
        int i5 = (i - i3) / 2;
        int i6 = (i2 - i4) / 2;
        Matrix matrix = new Matrix();
        this.f17215c.getTransform(matrix);
        matrix.setScale(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        matrix.postTranslate((float) i5, (float) i6);
        this.f17215c.setTransform(matrix);
    }

    private void m14717a(Exception exception) {
        if (this.f17224l != null) {
            this.f17224l.mo3579a(exception);
            return;
        }
        throw new RuntimeException(exception);
    }

    private void m14718f() {
        setBackgroundColor(-16777216);
        this.f17225m = false;
    }

    private void m14719g() {
        if (this.f17218f && this.f17223k != null && this.f17213a != null && !this.f17219g) {
            try {
                if (this.f17224l != null) {
                    this.f17224l.mo3576P();
                }
                this.f17213a.setSurface(this.f17216d);
                if (this.f17223k.getScheme() == null || !(this.f17223k.getScheme().equals("http") || this.f17223k.getScheme().equals("https"))) {
                    StringBuilder stringBuilder = new StringBuilder("Loading local URI: ");
                    stringBuilder.append(this.f17223k.toString());
                    C2480b.m6736b(stringBuilder.toString());
                    this.f17213a.setDataSource(getContext(), this.f17223k);
                } else {
                    Map hashMap = new HashMap();
                    String a = C2492j.m6840a(MyApplication.m12952b());
                    hashMap.put("User-Agent", a);
                    hashMap.put("http.agent", a);
                    StringBuilder stringBuilder2 = new StringBuilder("User Agent is:");
                    stringBuilder2.append(a);
                    C2480b.m6732a(stringBuilder2.toString());
                    this.f17213a.setDataSource(getContext(), this.f17223k, hashMap);
                }
                this.f17213a.prepareAsync();
            } catch (Exception e) {
                m14717a(e);
            }
        }
    }

    public final void m14720a() {
        this.f17217e.setOnClickListener(null);
        this.f17217e.setClickable(false);
    }

    public final void m14721a(int i) {
        if (this.f17213a != null) {
            this.f17213a.seekTo((long) i);
        }
    }

    public final boolean m14722b() {
        return this.f17213a != null && this.f17213a.isPlaying();
    }

    public final void m14723c() {
        if (this.f17213a != null) {
            this.f17213a.start();
            if (this.f17214b == null) {
                this.f17214b = new Handler();
            }
        }
    }

    public final void m14724d() {
        if (this.f17213a != null && m14722b()) {
            this.f17213a.pause();
            if (this.f17214b != null) {
            }
        }
    }

    public final void m14725e() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = 0;
        r2.f17219g = r0;
        r0 = r2.f17213a;
        r1 = 0;
        if (r0 == 0) goto L_0x000f;
    L_0x0008:
        r0 = r2.f17213a;	 Catch:{ Throwable -> 0x000d }
        r0.release();	 Catch:{ Throwable -> 0x000d }
    L_0x000d:
        r2.f17213a = r1;
    L_0x000f:
        r0 = r2.f17214b;
        if (r0 == 0) goto L_0x0015;
    L_0x0013:
        r2.f17214b = r1;
    L_0x0015:
        r0 = r2.f17215c;
        if (r0 == 0) goto L_0x0022;
    L_0x0019:
        r0 = r2.f17215c;	 Catch:{ Throwable -> 0x0022 }
        r0 = r0.getSurfaceTexture();	 Catch:{ Throwable -> 0x0022 }
        r0.release();	 Catch:{ Throwable -> 0x0022 }
    L_0x0022:
        r0 = r2.f17216d;
        if (r0 == 0) goto L_0x002d;
    L_0x0026:
        r0 = r2.f17216d;	 Catch:{ Throwable -> 0x002b }
        r0.release();	 Catch:{ Throwable -> 0x002b }
    L_0x002b:
        r2.f17216d = r1;
    L_0x002d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.videoplayer.core.VideoPlayerFrame.e():void");
    }

    public long getCurrentPosition() {
        return this.f17213a == null ? -1 : this.f17213a.getCurrentPosition();
    }

    public long getDuration() {
        return this.f17213a == null ? -1 : this.f17213a.getDuration();
    }

    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
        if (this.f17224l != null) {
            this.f17224l.mo3580d(i);
        }
    }

    public void onClick(View view) {
    }

    public void onCompletion(IMediaPlayer iMediaPlayer) {
        if (this.f17224l != null) {
            this.f17224l.mo3578R();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m14725e();
        this.f17217e = null;
        if (this.f17214b != null) {
            this.f17214b = null;
        }
    }

    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        if (i == -38) {
            return false;
        }
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder("Preparation/playback error (");
        stringBuilder2.append(i);
        stringBuilder2.append("): ");
        String stringBuilder3 = stringBuilder2.toString();
        if (i == IMediaPlayer.MEDIA_ERROR_UNSUPPORTED) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder3);
            stringBuilder3 = "Unsupported";
        } else if (i == IMediaPlayer.MEDIA_ERROR_MALFORMED) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder3);
            stringBuilder3 = "Malformed";
        } else if (i == IMediaPlayer.MEDIA_ERROR_IO) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder3);
            stringBuilder3 = "I/O error";
        } else if (i == IMediaPlayer.MEDIA_ERROR_TIMED_OUT) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder3);
            stringBuilder3 = "Timed out";
        } else if (i == 100) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder3);
            stringBuilder3 = "Server died";
        } else if (i != 200) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder3);
            stringBuilder3 = "Unknown error";
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder3);
            stringBuilder3 = "Not valid for progressive playback";
        }
        stringBuilder.append(stringBuilder3);
        m14717a(new Exception(stringBuilder.toString()));
        return false;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setKeepScreenOn(true);
        this.f17214b = new Handler();
        this.f17213a = new IjkMediaPlayer();
        this.f17213a.setOnPreparedListener(this);
        this.f17213a.setOnBufferingUpdateListener(this);
        this.f17213a.setOnCompletionListener(this);
        this.f17213a.setOnVideoSizeChangedListener(this);
        this.f17213a.setOnErrorListener(this);
        this.f17213a.setAudioStreamType(3);
        LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f17215c = new TextureView(getContext());
        this.f17215c.setBackgroundColor(-16777216);
        addView(this.f17215c, layoutParams);
        this.f17215c.setSurfaceTextureListener(this);
        this.f17217e = new FrameLayout(getContext());
        addView(this.f17217e, new LayoutParams(-1, -1));
        new FrameLayout.LayoutParams(-1, -2).gravity = 80;
        m14719g();
    }

    public void onPrepared(IMediaPlayer iMediaPlayer) {
        this.f17219g = true;
        if (this.f17224l != null) {
            this.f17224l.mo3577Q();
        }
        if (this.f17225m) {
            m14723c();
            if (this.f17226n > 0) {
                m14721a(this.f17226n);
                this.f17226n = -1;
                return;
            }
        }
        this.f17213a.start();
        this.f17213a.pause();
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            m14721a(i);
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        this.f17220h = m14722b();
        if (this.f17220h) {
            this.f17213a.pause();
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        if (this.f17220h) {
            this.f17213a.start();
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f17221i = i;
        this.f17222j = i2;
        this.f17218f = true;
        this.f17216d = new Surface(surfaceTexture);
        if (this.f17219g) {
            this.f17213a.setSurface(this.f17216d);
        } else {
            m14719g();
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f17218f = false;
        this.f17216d = null;
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        m14716a(i, i2, this.f17213a.getVideoWidth(), this.f17213a.getVideoHeight());
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
        m14716a(this.f17221i, this.f17222j, i, i2);
    }

    public void setAutoPlay(boolean z) {
        this.f17225m = z;
    }

    public void setCallback(C4593a c4593a) {
        this.f17224l = c4593a;
    }

    public void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener) {
        this.f17213a.setOnSeekCompleteListener(onSeekCompleteListener);
    }

    public void setSource(Uri uri) {
        this.f17223k = uri;
        if (this.f17213a != null) {
            m14719g();
        }
    }
}
