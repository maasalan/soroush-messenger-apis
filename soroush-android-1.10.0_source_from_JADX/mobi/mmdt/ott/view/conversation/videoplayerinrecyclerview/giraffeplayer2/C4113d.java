package mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.MediaController.MediaPlayerControl;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.provider.p386h.C2986h;
import tv.danmaku.ijk.media.player.AndroidMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;

public final class C4113d implements MediaPlayerControl {
    public static boolean f11756a = false;
    boolean f11757b = true;
    int f11758c = 0;
    int f11759d = 0;
    public IMediaPlayer f11760e;
    public volatile boolean f11761f;
    public Handler f11762g;
    C6228j f11763h;
    volatile int f11764i = -1;
    int f11765j = 0;
    VideoInfo f11766k;
    private final HandlerThread f11767l;
    private int f11768m = 0;
    private boolean f11769n = true;
    private boolean f11770o = true;
    private int f11771p;
    private Uri f11772q;
    private Map<String, String> f11773r;
    private Context f11774s;
    private Handler f11775t = new Handler(Looper.getMainLooper());
    private WeakReference<ViewGroup> f11776u;
    private boolean f11777v = false;

    class C41081 implements Callback {
        final /* synthetic */ C4113d f11747a;

        C41081(C4113d c4113d) {
            this.f11747a = c4113d;
        }

        public final boolean handleMessage(Message message) {
            C4113d c4113d = this.f11747a;
            StringBuilder stringBuilder = new StringBuilder("handleMessage:");
            stringBuilder.append(message.what);
            c4113d.m7965a(stringBuilder.toString());
            if (message.what == 4) {
                if (!this.f11747a.f11761f) {
                    this.f11747a.f11762g.removeCallbacks(null);
                    C4113d.m7938b(this.f11747a, (String) message.obj);
                }
                return true;
            }
            if (this.f11747a.f11760e != null) {
                if (!this.f11747a.f11761f) {
                    int intValue;
                    switch (message.what) {
                        case 1:
                            if (this.f11747a.f11758c != -1) {
                                if (C4113d.m7949e(this.f11747a)) {
                                    if (this.f11747a.f11757b) {
                                        if (this.f11747a.f11758c == 5) {
                                            this.f11747a.f11764i = 0;
                                        }
                                        if (this.f11747a.f11764i >= 0) {
                                            this.f11747a.f11760e.seekTo((long) this.f11747a.f11764i);
                                            this.f11747a.f11764i = -1;
                                        }
                                    }
                                    this.f11747a.f11760e.start();
                                    this.f11747a.m7947d(3);
                                    break;
                                }
                            }
                            this.f11747a.f11762g.sendEmptyMessage(5);
                            return true;
                            break;
                        case 2:
                            this.f11747a.f11760e.pause();
                            this.f11747a.f11758c = 4;
                            return true;
                        case 3:
                            if (this.f11747a.f11757b) {
                                this.f11747a.f11760e.seekTo((long) ((Integer) message.obj).intValue());
                                return true;
                            }
                            break;
                        case 5:
                            C4113d.m7933a(this.f11747a, false);
                            this.f11747a.f11762g.sendEmptyMessage(1);
                            return true;
                        case 6:
                            intValue = ((Integer) message.obj).intValue();
                            if (this.f11747a.f11760e instanceof IjkMediaPlayer) {
                                ((IjkMediaPlayer) this.f11747a.f11760e).selectTrack(intValue);
                                return true;
                            } else if (this.f11747a.f11760e instanceof AndroidMediaPlayer) {
                                ((AndroidMediaPlayer) this.f11747a.f11760e).getInternalMediaPlayer().selectTrack(intValue);
                                return true;
                            }
                            break;
                        case 7:
                            intValue = ((Integer) message.obj).intValue();
                            if (this.f11747a.f11760e instanceof IjkMediaPlayer) {
                                ((IjkMediaPlayer) this.f11747a.f11760e).deselectTrack(intValue);
                                return true;
                            } else if (this.f11747a.f11760e instanceof AndroidMediaPlayer) {
                                ((AndroidMediaPlayer) this.f11747a.f11760e).getInternalMediaPlayer().deselectTrack(intValue);
                                return true;
                            }
                            break;
                        case 8:
                            Map map = (Map) message.obj;
                            this.f11747a.f11760e.setVolume(((Float) map.get("left")).floatValue(), ((Float) map.get("right")).floatValue());
                            return true;
                        case 12:
                            if (message.obj == null) {
                                this.f11747a.f11760e.setDisplay(null);
                                return true;
                            } else if (message.obj instanceof SurfaceTexture) {
                                this.f11747a.f11760e.setSurface(new Surface((SurfaceTexture) message.obj));
                                return true;
                            } else if (message.obj instanceof SurfaceView) {
                                this.f11747a.f11760e.setDisplay(((SurfaceView) message.obj).getHolder());
                                return true;
                            }
                            break;
                        default:
                            return true;
                    }
                    return true;
                }
            }
            this.f11747a.f11762g.removeCallbacks(null);
            C4113d.m7933a(this.f11747a, true);
            this.f11747a.f11762g.sendMessage(Message.obtain(message));
            return true;
        }
    }

    class C41118 implements Runnable {
        final /* synthetic */ C4113d f11753a;

        C41118(C4113d c4113d) {
            this.f11753a = c4113d;
        }

        public final void run() {
            this.f11753a.m7948e();
        }
    }

    class C62232 implements OnErrorListener {
        final /* synthetic */ C4113d f16853a;

        C62232(C4113d c4113d) {
            this.f16853a = c4113d;
        }

        public final boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            this.f16853a.m7947d(-1);
            boolean b = this.f16853a.f11763h.mo2390b(this.f16853a, i, i2);
            i = this.f16853a.f11766k.f11706j;
            if (i > 0) {
                C4113d c4113d = this.f16853a;
                StringBuilder stringBuilder = new StringBuilder("replay delay ");
                stringBuilder.append(i);
                stringBuilder.append(" seconds");
                c4113d.m7965a(stringBuilder.toString());
                this.f16853a.f11762g.sendEmptyMessageDelayed(5, (long) (i * IjkMediaCodecInfo.RANK_MAX));
            }
            return b;
        }
    }

    class C62243 implements OnSeekCompleteListener {
        final /* synthetic */ C4113d f16854a;

        C62243(C4113d c4113d) {
            this.f16854a = c4113d;
        }

        public final void onSeekComplete(IMediaPlayer iMediaPlayer) {
            this.f16854a.f11763h.mo2394e(this.f16854a);
        }
    }

    class C62254 implements OnVideoSizeChangedListener {
        final /* synthetic */ C4113d f16855a;

        C62254(C4113d c4113d) {
            this.f16855a = c4113d;
        }

        public final void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
            if (C4113d.f11756a) {
                C4113d c4113d = this.f16855a;
                StringBuilder stringBuilder = new StringBuilder("onVideoSizeChanged:width:");
                stringBuilder.append(i);
                stringBuilder.append(",height:");
                stringBuilder.append(i2);
                c4113d.m7965a(stringBuilder.toString());
            }
            i = iMediaPlayer.getVideoWidth();
            int videoHeight = iMediaPlayer.getVideoHeight();
            if (i != 0 && videoHeight != 0) {
                C6229l k = this.f16855a.m7950f();
                if (k != null && (k instanceof C4119k)) {
                    k.mo2396a(i, videoHeight);
                }
            }
        }
    }

    class C62265 implements OnTimedTextListener {
        final /* synthetic */ C4113d f16856a;

        C62265(C4113d c4113d) {
            this.f16856a = c4113d;
        }

        public final void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            this.f16856a.f11763h.mo2386a(this.f16856a, ijkTimedText);
        }
    }

    private C4113d(Context context, VideoInfo videoInfo) {
        this.f11774s = context.getApplicationContext();
        this.f11766k = videoInfo;
        VideoView a = C4118i.m7985a().m7987a(videoInfo);
        this.f11776u = new WeakReference(a != null ? a.getContainer() : null);
        m7965a("new GiraffePlayer");
        this.f11763h = new C6228j(videoInfo);
        this.f11767l = new HandlerThread("GiraffePlayerInternal:Handler", -16);
        this.f11767l.start();
        this.f11762g = new Handler(this.f11767l.getLooper(), new C41081(this));
        C4118i a2 = C4118i.m7985a();
        videoInfo = this.f11766k;
        C4118i.m7986a(videoInfo.f11700d, "setCurrentPlayer");
        String str = videoInfo.f11700d;
        if (a2.m7989a(str)) {
            C4118i.m7986a(videoInfo.f11700d, "is currentPlayer");
            return;
        }
        try {
            String str2 = videoInfo.f11700d;
            StringBuilder stringBuilder = new StringBuilder("not same release before one:");
            stringBuilder.append(a2.f11792a);
            C4118i.m7986a(str2, stringBuilder.toString());
            C4118i.m7986a(a2.f11792a, "releaseCurrent");
            C4113d b = a2.m7990b();
            if (b != null) {
                if (b.f11763h != null) {
                    b.f11763h.mo2383a(b);
                }
                b.m7967b();
            }
            a2.f11792a = null;
            a2.f11792a = str;
        } catch (Throwable e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static C4113d m7929a(Context context, VideoInfo videoInfo) {
        return new C4113d(context, videoInfo);
    }

    private void m7930a(ViewGroup viewGroup) {
        m7965a("doCreateDisplay");
        View findViewById = viewGroup.findViewById(R.id.player_display_group);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        findViewById = new FrameLayout(viewGroup.getContext());
        findViewById.setId(R.id.player_display_group);
        findViewById.setBackgroundColor(this.f11766k.f11707k);
        LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        final View c6229l = new C6229l(viewGroup.getContext());
        c6229l.setAspectRatio(this.f11766k.f11703g);
        c6229l.setId(R.id.player_display);
        findViewById.addView(c6229l, layoutParams);
        viewGroup.addView(findViewById, 0, layoutParams);
        c6229l.setSurfaceTextureListener(new SurfaceTextureListener(this) {
            final /* synthetic */ C4113d f11749b;
            private SurfaceTexture f11750c;

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                this.f11749b.m7965a("onSurfaceTextureAvailable");
                if (this.f11750c == null) {
                    this.f11749b.f11762g.obtainMessage(12, surfaceTexture).sendToTarget();
                    this.f11750c = surfaceTexture;
                    return;
                }
                c6229l.setSurfaceTexture(this.f11750c);
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                this.f11749b.m7965a("onSurfaceTextureDestroyed");
                return false;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        });
    }

    static /* synthetic */ void m7933a(C4113d c4113d, boolean z) {
        StringBuilder stringBuilder = new StringBuilder("init createDisplay:");
        stringBuilder.append(z);
        c4113d.m7965a(stringBuilder.toString());
        c4113d.f11775t.post(new Runnable(c4113d) {
            final /* synthetic */ C4113d f11745a;

            {
                this.f11745a = r1;
            }

            public final void run() {
                this.f11745a.f11763h.mo2393d(this.f11745a);
            }
        });
        c4113d.m7964a();
        c4113d.f11760e = "system".equals(c4113d.f11766k.f11708l) ? new AndroidMediaPlayer() : new IjkMediaPlayer(Looper.getMainLooper());
        if (c4113d.f11760e instanceof IjkMediaPlayer) {
            IjkMediaPlayer.native_setLogLevel(f11756a ? 3 : 6);
        }
        c4113d.m7946d();
        c4113d.f11761f = false;
        c4113d.f11760e.setAudioStreamType(3);
        c4113d.f11760e.setOnPreparedListener(new OnPreparedListener(c4113d) {
            final /* synthetic */ C4113d f16849a;

            {
                this.f16849a = r1;
            }

            public final void onPrepared(IMediaPlayer iMediaPlayer) {
                int i = this.f16849a.f11760e.getDuration() == 0 ? 1 : 0;
                this.f16849a.f11770o = i ^ 1;
                this.f16849a.f11757b = i ^ true;
                this.f16849a.m7947d(2);
                this.f16849a.f11763h.mo2392c(this.f16849a);
                if (this.f16849a.f11759d == 3) {
                    this.f16849a.f11762g.sendEmptyMessage(1);
                }
            }
        });
        c4113d.f11760e.setOnBufferingUpdateListener(new OnBufferingUpdateListener(c4113d) {
            final /* synthetic */ C4113d f16850a;

            {
                this.f16850a = r1;
            }

            public final void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
                this.f16850a.f11768m = i;
                this.f16850a.f11763h.mo2384a(this.f16850a, i);
            }
        });
        c4113d.f11760e.setOnInfoListener(new OnInfoListener(c4113d) {
            final /* synthetic */ C4113d f16851a;

            {
                this.f16851a = r1;
            }

            public final boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                return this.f16851a.f11763h.mo2387a(this.f16851a, i, i2);
            }
        });
        c4113d.f11760e.setOnCompletionListener(new OnCompletionListener(c4113d) {
            final /* synthetic */ C4113d f16852a;

            {
                this.f16852a = r1;
            }

            public final void onCompletion(IMediaPlayer iMediaPlayer) {
                this.f16852a.f11758c = 5;
                this.f16852a.f11763h.mo2383a(this.f16852a);
            }
        });
        c4113d.f11760e.setOnErrorListener(new C62232(c4113d));
        c4113d.f11760e.setOnSeekCompleteListener(new C62243(c4113d));
        c4113d.f11760e.setOnVideoSizeChangedListener(new C62254(c4113d));
        c4113d.f11760e.setOnTimedTextListener(new C62265(c4113d));
        if (z) {
            VideoView a = C4118i.m7985a().m7987a(c4113d.f11766k);
            if (!(a == null || a.getContainer() == null)) {
                final ViewGroup container = a.getContainer();
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    c4113d.f11775t.post(new Runnable(c4113d) {
                        final /* synthetic */ C4113d f11752b;

                        public final void run() {
                            this.f11752b.m7930a(container);
                        }
                    });
                } else {
                    c4113d.m7930a(container);
                }
            }
        }
        try {
            c4113d.f11772q = c4113d.f11766k.f11699c;
            c4113d.f11760e.setDataSource(c4113d.f11774s, c4113d.f11772q, c4113d.f11773r);
            c4113d.m7947d(1);
            c4113d.f11760e.prepareAsync();
        } catch (IOException e) {
            c4113d.m7947d(-1);
            e.printStackTrace();
            c4113d.f11775t.post(new Runnable(c4113d) {
                final /* synthetic */ C4113d f11746a;

                {
                    this.f11746a = r1;
                }

                public final void run() {
                    this.f11746a.f11763h.mo2390b(this.f11746a, 0, 0);
                }
            });
        }
    }

    private static void m7936b(ViewGroup viewGroup) {
        viewGroup = (ViewGroup) viewGroup.getParent();
        View findViewById = viewGroup.findViewById(R.id.player_display_floor);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
    }

    static /* synthetic */ void m7938b(C4113d c4113d, String str) {
        if (!c4113d.f11761f) {
            long currentPosition;
            long duration;
            C2986h c2986h;
            C2986h c2986h2 = C2986h.PAUSE;
            if (c4113d.f11760e != null) {
                currentPosition = c4113d.f11760e.getCurrentPosition();
                duration = c4113d.f11760e.getDuration();
                c2986h = c4113d.f11760e.isPlaying() ? C2986h.PLAYING : C2986h.PAUSE;
            } else {
                c2986h = c2986h2;
                currentPosition = -1;
                duration = currentPosition;
            }
            StringBuilder stringBuilder = new StringBuilder("------------  mediaPlayer releaseMediaPlayer():  ");
            stringBuilder.append(currentPosition);
            stringBuilder.append("  -  getDuration: ");
            stringBuilder.append(duration);
            C2480b.m6742f(stringBuilder.toString());
            c4113d.m7965a("doRelease");
            C4118i.m7985a().m7993d(str);
            c4113d.f11767l.quit();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                c4113d.m7948e();
            } else {
                c4113d.f11775t.post(new C41118(c4113d));
            }
            c4113d.m7964a();
            c4113d.f11761f = true;
            c4113d.f11763h.mo2385a(c4113d, c4113d.f11772q, currentPosition, duration, c2986h);
        }
    }

    private void m7942c(final int i) {
        final int i2 = this.f11759d;
        this.f11759d = i;
        if (i2 != i) {
            this.f11775t.post(new Runnable(this) {
                final /* synthetic */ C4113d f11741c;

                public final void run() {
                    this.f11741c.f11763h.mo2388b(i2, i);
                }
            });
        }
    }

    private void m7946d() {
        if ((this.f11760e instanceof IjkMediaPlayer) && this.f11766k.f11697a.size() > 0) {
            IjkMediaPlayer ijkMediaPlayer = (IjkMediaPlayer) this.f11760e;
            Iterator it = this.f11766k.f11697a.iterator();
            while (it.hasNext()) {
                C4115g c4115g = (C4115g) it.next();
                if (c4115g.f11789c instanceof String) {
                    ijkMediaPlayer.setOption(c4115g.f11787a, c4115g.f11788b, (String) c4115g.f11789c);
                } else if (c4115g.f11789c instanceof Long) {
                    ijkMediaPlayer.setOption(c4115g.f11787a, c4115g.f11788b, ((Long) c4115g.f11789c).longValue());
                }
            }
        }
    }

    private void m7947d(final int i) {
        final int i2 = this.f11758c;
        this.f11758c = i;
        if (i2 != i) {
            this.f11775t.post(new Runnable(this) {
                final /* synthetic */ C4113d f11744c;

                public final void run() {
                    this.f11744c.f11763h.mo2391c(i2, i);
                }
            });
        }
    }

    private void m7948e() {
        m7965a("doRemoveDisplayGroupFromParent");
        ViewGroup viewGroup = (ViewGroup) this.f11776u.get();
        if (viewGroup != null) {
            C6229l f = m7950f();
            if (f != null) {
                f.setSurfaceTextureListener(null);
            }
            viewGroup = (ViewGroup) viewGroup.getParent();
            if (viewGroup != null) {
                View findViewById = viewGroup.findViewById(R.id.player_display_group);
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
            }
        }
    }

    static /* synthetic */ boolean m7949e(C4113d c4113d) {
        return (c4113d.f11760e == null || c4113d.f11758c == -1 || c4113d.f11758c == 0 || c4113d.f11758c == 1) ? false : true;
    }

    private C6229l m7950f() {
        ViewGroup viewGroup = (ViewGroup) this.f11776u.get();
        return viewGroup != null ? (C6229l) viewGroup.findViewById(R.id.player_display) : null;
    }

    private void m7953g() {
        ViewGroup viewGroup = (ViewGroup) this.f11776u.get();
        if (viewGroup != null) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null) {
                C4113d.m7936b(viewGroup);
                viewGroup2.removeView(viewGroup);
            }
        }
    }

    private Activity m7954h() {
        ViewGroup viewGroup = (ViewGroup) this.f11776u.get();
        return viewGroup == null ? null : (Activity) viewGroup.getContext();
    }

    final C4113d m7963a(int i) {
        if (this.f11776u == null || this.f11776u.get() == null) {
            return this;
        }
        final VideoView a = C4118i.m7985a().m7987a(this.f11766k);
        if (a == null) {
            return this;
        }
        final ViewGroup viewGroup = (ViewGroup) this.f11776u.get();
        Activity activity = (Activity) a.getContext();
        ViewGroup viewGroup2 = (ViewGroup) activity.findViewById(16908290);
        boolean z = this.f11766k.f11709m && !this.f11766k.f11701e && VERSION.SDK_INT >= 19;
        LayoutParams layoutParams = new FrameLayout.LayoutParams(a.getLayoutParams());
        int[] iArr = new int[]{0, 0};
        a.getLocationOnScreen(iArr);
        layoutParams.leftMargin = iArr[0];
        layoutParams.topMargin = iArr[1];
        C4120m a2;
        if (i == 1) {
            a2 = C4120m.m7995a(m7954h());
            if (this.f11766k.f11701e) {
                a2.m7996a(0);
            }
            a2.m7997a(false).m7998b(true);
            m7953g();
            View view = new View(activity);
            view.setId(R.id.player_display_floor);
            view.setBackgroundColor(this.f11766k.f11707k);
            viewGroup2.addView(view, new FrameLayout.LayoutParams(-1, -1));
            if (z) {
                viewGroup2.addView(viewGroup, layoutParams);
            } else {
                viewGroup2.addView(viewGroup);
            }
            if (z) {
                this.f11775t.postDelayed(new Runnable(this) {
                    final /* synthetic */ C4113d f11755b;

                    public final void run() {
                        TransitionManager.beginDelayedTransition(viewGroup);
                        viewGroup.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    }
                }, 200);
            }
            this.f11763h.mo2382a(this.f11765j, 1);
            this.f11765j = 1;
            return this;
        }
        if (i == 0) {
            a2 = C4120m.m7995a(m7954h());
            if (this.f11766k.f11701e) {
                a2.m7996a(1);
            }
            a2.m7997a(true).m7998b(false);
            if (z) {
                TransitionManager.beginDelayedTransition(viewGroup);
                viewGroup.setLayoutParams(layoutParams);
            }
            C4113d.m7936b(viewGroup);
            if (z) {
                this.f11775t.postDelayed(new Runnable(this) {
                    final /* synthetic */ C4113d f11738c;

                    public final void run() {
                        this.f11738c.m7953g();
                        a.addView(viewGroup, 0, new FrameLayout.LayoutParams(-1, -1));
                        this.f11738c.f11763h.mo2382a(this.f11738c.f11765j, 0);
                        this.f11738c.f11765j = 0;
                    }
                }, 200);
                return this;
            }
            m7953g();
            a.addView(viewGroup, 0, new FrameLayout.LayoutParams(-1, -1));
            this.f11763h.mo2382a(this.f11765j, 0);
            this.f11765j = 0;
        }
        return this;
    }

    final void m7964a() {
        if (this.f11760e != null) {
            m7965a("releaseMediaPlayer");
            this.f11760e.release();
            this.f11760e = null;
        }
    }

    final void m7965a(String str) {
        if (f11756a) {
            Log.d("GiraffePlayer", String.format("[fingerprint:%s] %s", new Object[]{this.f11766k.f11700d, str}));
        }
    }

    public final int m7966b(int i) {
        if (this.f11760e == null || this.f11761f) {
            return -1;
        }
        if (this.f11760e instanceof IjkMediaPlayer) {
            return ((IjkMediaPlayer) this.f11760e).getSelectedTrack(i);
        }
        if ((this.f11760e instanceof AndroidMediaPlayer) && VERSION.SDK_INT >= 21) {
            return ((AndroidMediaPlayer) this.f11760e).getInternalMediaPlayer().getSelectedTrack(i);
        }
        return -1;
    }

    public final void m7967b() {
        m7965a("try release");
        String str = this.f11766k.f11700d;
        C4118i.m7985a().m7993d(str);
        this.f11762g.obtainMessage(4, str).sendToTarget();
    }

    public final ITrackInfo[] m7968c() {
        if (this.f11760e != null) {
            if (!this.f11761f) {
                return this.f11760e.getTrackInfo();
            }
        }
        return new ITrackInfo[0];
    }

    public final boolean canPause() {
        return this.f11769n;
    }

    public final boolean canSeekBackward() {
        return this.f11770o;
    }

    public final boolean canSeekForward() {
        return this.f11757b;
    }

    public final int getAudioSessionId() {
        if (this.f11771p == 0) {
            this.f11771p = this.f11760e.getAudioSessionId();
        }
        return this.f11771p;
    }

    public final int getBufferPercentage() {
        return this.f11768m;
    }

    public final int getCurrentPosition() {
        return this.f11760e == null ? 0 : (int) this.f11760e.getCurrentPosition();
    }

    public final int getDuration() {
        return this.f11760e == null ? 0 : (int) this.f11760e.getDuration();
    }

    public final boolean isPlaying() {
        return this.f11758c == 3;
    }

    public final void pause() {
        m7942c(4);
        this.f11762g.sendEmptyMessage(2);
        this.f11763h.mo2395f(this);
    }

    public final void seekTo(int i) {
        this.f11762g.obtainMessage(3, Integer.valueOf(i)).sendToTarget();
    }

    public final void start() {
        m7942c(3);
        this.f11762g.sendEmptyMessage(1);
        this.f11763h.mo2389b(this);
    }
}
