package mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.view.C0567p;
import android.support.v7.app.C7406c;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.AbsListView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.p144f.p147b.p148a.C1586a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.provider.p386h.C2986h;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.p450a.C7206c;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7207b extends C6915a {
    protected long f20807h = -1;
    protected boolean f20808i;
    protected boolean f20809j;
    protected boolean f20810k;
    protected SeekBar f20811l;
    protected int f20812m = -1;
    protected final int f20813n = this.b.getStreamMaxVolume(3);
    protected float f20814o;
    protected final OnSeekBarChangeListener f20815p = new C41041(this);
    protected final OnClickListener f20816q = new C41052(this);
    private int f20817s = 0;
    private int f20818t = 0;

    class C41041 implements OnSeekBarChangeListener {
        final /* synthetic */ C7207b f11728a;

        C41041(C7207b c7207b) {
            this.f11728a = c7207b;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z && this.f11728a.f.m7924a()) {
                this.f11728a.c.m4110a((int) R.id.app_video_status).m4113b();
                C4113d player = this.f11728a.f.getPlayer();
                i = (int) ((((double) (player.getDuration() * i)) * 1.0d) / 1000.0d);
                CharSequence a = C7207b.m19070b((long) i);
                if (this.f11728a.f20810k) {
                    player.seekTo(i);
                }
                this.f11728a.c.m4110a((int) R.id.app_video_currentTime).m4112a(a);
            }
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            this.f11728a.f20809j = true;
            this.f11728a.m19076a(3600000);
            this.f11728a.e.removeMessages(1);
            if (this.f11728a.f20810k) {
                this.f11728a.b.setStreamMute(3, true);
            }
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            if (this.f11728a.f.m7924a()) {
                C4113d player = this.f11728a.f.getPlayer();
                if (!this.f11728a.f20810k) {
                    player.seekTo((int) ((((double) (player.getDuration() * seekBar.getProgress())) * 1.0d) / 1000.0d));
                }
                this.f11728a.m19076a(this.f11728a.d);
                this.f11728a.e.removeMessages(1);
                this.f11728a.b.setStreamMute(3, false);
                this.f11728a.f20809j = false;
                this.f11728a.e.sendEmptyMessageDelayed(1, 1000);
            }
        }
    }

    class C41052 implements OnClickListener {
        final /* synthetic */ C7207b f11729a;

        C41052(C7207b c7207b) {
            this.f11729a = c7207b;
        }

        public final void onClick(View view) {
            C4113d player = this.f11729a.f.getPlayer();
            int i = 0;
            if (view.getId() == R.id.app_video_fullscreen) {
                if (player.f11765j == 0) {
                    player.m7963a(1);
                    return;
                }
                if (player.f11765j == 1) {
                    player.m7963a(0);
                }
            } else if (view.getId() == R.id.app_video_play) {
                if (player.isPlaying()) {
                    player.pause();
                } else {
                    player.start();
                }
            } else if (view.getId() == R.id.app_video_replay_icon) {
                player.seekTo(0);
                player.start();
            } else {
                if (view.getId() == R.id.app_video_finish) {
                    player.m7965a("onBackPressed");
                    if (player.f11765j == 1) {
                        player.m7963a(0);
                        i = 1;
                    }
                    if (i == 0) {
                        ((Activity) this.f11729a.f.getContext()).finish();
                    }
                } else if (view.getId() == R.id.app_video_clarity) {
                    Activity activity = (Activity) this.f11729a.f.getContext();
                    if (activity instanceof C7406c) {
                        C7206c c7206c = new C7206c();
                        Bundle bundle = new Bundle();
                        bundle.putString("fingerprint", this.f11729a.f.getVideoInfo().f11700d);
                        c7206c.mo3059e(bundle);
                        c7206c.mo3404a(((C7406c) activity).m19188c(), "player_track");
                    }
                }
            }
        }
    }

    public class C4107a extends SimpleOnGestureListener {
        final /* synthetic */ C7207b f11732a;
        private boolean f11733b;
        private boolean f11734c;
        private boolean f11735d;

        public C4107a(C7207b c7207b) {
            this.f11732a = c7207b;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return true;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            this.f11733b = true;
            return true;
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!this.f11732a.f.m7924a()) {
                return true;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY() - motionEvent2.getY();
            float x2 = x - motionEvent2.getX();
            boolean z = false;
            if (this.f11733b) {
                this.f11735d = Math.abs(f) >= Math.abs(f2);
                this.f11734c = x > ((float) this.f11732a.f.getWidth()) * 0.5f;
                this.f11733b = false;
            }
            C4113d player = this.f11732a.f.getPlayer();
            if (!this.f11735d) {
                ViewParent parent = this.f11732a.f.getParent();
                while (parent != null) {
                    if (!(parent instanceof AbsListView)) {
                        if (!(parent instanceof C0567p)) {
                            parent = parent.getParent();
                        }
                    }
                    z = true;
                    break;
                }
                if (z) {
                    return true;
                }
                y /= (float) this.f11732a.f.getHeight();
                if (this.f11734c) {
                    C7207b.m19072b(this.f11732a, y);
                    return true;
                }
                C7207b.m19074c(this.f11732a, y);
            } else if (player.canSeekForward()) {
                C7207b.m19069a(this.f11732a, (-x2) / ((float) this.f11732a.f.getWidth()));
                return true;
            }
            return true;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            if (this.f11732a.f20808i) {
                this.f11732a.m19082a(false);
            } else {
                this.f11732a.m19076a(this.f11732a.d);
            }
            return true;
        }
    }

    public C7207b(Context context) {
        super(context);
    }

    static /* synthetic */ void m19069a(C7207b c7207b, float f) {
        C4113d player = c7207b.f.getPlayer();
        long currentPosition = (long) player.getCurrentPosition();
        long duration = (long) player.getDuration();
        long min = (long) (((float) Math.min(100000, duration - currentPosition)) * f);
        c7207b.f20807h = min + currentPosition;
        if (c7207b.f20807h > duration) {
            c7207b.f20807h = duration;
        } else if (c7207b.f20807h <= 0) {
            c7207b.f20807h = 0;
            min = -currentPosition;
        }
        int i = ((int) min) / IjkMediaCodecInfo.RANK_MAX;
        if (i != 0) {
            StringBuilder stringBuilder;
            String stringBuilder2;
            c7207b.c.m4110a((int) R.id.app_video_fastForward_box).m4109a();
            if (i > 0) {
                stringBuilder = new StringBuilder("+");
                stringBuilder.append(i);
                stringBuilder2 = stringBuilder.toString();
            } else {
                stringBuilder2 = String.valueOf(i);
            }
            C1586a a = c7207b.c.m4110a((int) R.id.app_video_fastForward);
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(stringBuilder2);
            stringBuilder3.append("s");
            a.m4112a(stringBuilder3.toString());
            C1586a a2 = c7207b.c.m4110a((int) R.id.app_video_fastForward_target);
            stringBuilder = new StringBuilder();
            stringBuilder.append(C7207b.m19070b(c7207b.f20807h));
            stringBuilder.append("/");
            a2.m4112a(stringBuilder.toString());
            c7207b.c.m4110a((int) R.id.app_video_fastForward_all).m4112a(C7207b.m19070b(duration));
        }
    }

    private static String m19070b(long j) {
        int i = (int) (j / 1000);
        int i2 = i % 60;
        int i3 = (i / 60) % 60;
        if (i / 3600 > 0) {
            return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf(i / 3600), Integer.valueOf(i3), Integer.valueOf(i2)});
        }
        return String.format("%02d:%02d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)});
    }

    private void m19071b(int i) {
        this.f20817s = i;
        if (i != -1) {
            if (i != 4) {
                switch (i) {
                    case 1:
                    case 2:
                        break;
                    default:
                        return;
                }
            }
            this.e.removeMessages(1);
            this.c.m4110a((int) R.id.app_video_replay).m4109a();
            this.c.m4110a((int) R.id.app_video_loading).m4113b();
            this.c.m4110a((int) R.id.app_video_status).m4113b();
            return;
        }
        this.c.m4110a((int) R.id.app_video_status).m4109a().m4112a((CharSequence) "something error");
        this.e.removeMessages(1);
        this.c.m4110a((int) R.id.app_video_loading).m4113b();
    }

    static /* synthetic */ void m19072b(C7207b c7207b, float f) {
        if (c7207b.f20812m == -1) {
            c7207b.f20812m = c7207b.b.getStreamVolume(3);
            if (c7207b.f20812m < 0) {
                c7207b.f20812m = 0;
            }
        }
        c7207b.m19082a(true);
        int i = ((int) (f * ((float) c7207b.f20813n))) + c7207b.f20812m;
        if (i > c7207b.f20813n) {
            i = c7207b.f20813n;
        } else if (i < 0) {
            i = 0;
        }
        c7207b.b.setStreamVolume(3, i, 0);
        i = (int) (((((double) i) * 1.0d) / ((double) c7207b.f20813n)) * 100.0d);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i);
        stringBuilder.append("%");
        CharSequence stringBuilder2 = stringBuilder.toString();
        if (i == 0) {
            stringBuilder2 = "off";
        }
        c7207b.c.m4110a((int) R.id.app_video_volume_icon).m4114b(i == 0 ? R.drawable.ic_volume_off_white_36dp : R.drawable.ic_volume_up_white_36dp);
        c7207b.c.m4110a((int) R.id.app_video_brightness_box).m4113b();
        c7207b.c.m4110a((int) R.id.app_video_volume_box).m4109a();
        c7207b.c.m4110a((int) R.id.app_video_volume_box).m4109a();
        c7207b.c.m4110a((int) R.id.app_video_volume).m4112a(stringBuilder2).m4109a();
    }

    private void m19073c() {
        if (!this.f.m7924a()) {
            this.c.m4110a((int) R.id.app_video_replay_icon).m4115c().m4114b(R.drawable.ic_pause_new);
        } else if (this.f.getPlayer().isPlaying()) {
            this.c.m4110a((int) R.id.app_video_replay_icon).m4115c();
        } else {
            this.c.m4110a((int) R.id.app_video_replay_icon).m4115c().m4114b(R.drawable.ic_pause_new);
        }
    }

    static /* synthetic */ void m19074c(C7207b c7207b, float f) {
        Window window = ((Activity) c7207b.a).getWindow();
        if (c7207b.f20814o < 0.0f) {
            c7207b.f20814o = window.getAttributes().screenBrightness;
            if (c7207b.f20814o <= 0.0f) {
                c7207b.f20814o = 0.5f;
            } else if (c7207b.f20814o < 0.01f) {
                c7207b.f20814o = 0.01f;
            }
        }
        String simpleName = c7207b.getClass().getSimpleName();
        StringBuilder stringBuilder = new StringBuilder("brightness:");
        stringBuilder.append(c7207b.f20814o);
        stringBuilder.append(",percent:");
        stringBuilder.append(f);
        Log.d(simpleName, stringBuilder.toString());
        c7207b.c.m4110a((int) R.id.app_video_brightness_box).m4109a();
        LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = c7207b.f20814o + f;
        if (attributes.screenBrightness > BallPulseIndicator.SCALE) {
            attributes.screenBrightness = BallPulseIndicator.SCALE;
        } else if (attributes.screenBrightness < 0.01f) {
            attributes.screenBrightness = 0.01f;
        }
        C1586a a = c7207b.c.m4110a((int) R.id.app_video_brightness);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append((int) (attributes.screenBrightness * 100.0f));
        stringBuilder2.append("%");
        a.m4112a(stringBuilder2.toString());
        window.setAttributes(attributes);
    }

    protected final View mo3465a() {
        return LayoutInflater.from(this.a).inflate(R.layout.giraffe_media_controller, this.f, false);
    }

    protected final void m19076a(int i) {
        if (!this.f20808i) {
            if (!this.f.getVideoInfo().f11698b) {
                if (this.f20818t != 1) {
                    this.c.m4110a((int) R.id.app_video_top_box).m4113b();
                    this.f20808i = true;
                }
            }
            this.c.m4110a((int) R.id.app_video_top_box).m4109a();
            this.c.m4110a((int) R.id.app_video_title).m4112a(this.f.getVideoInfo().f11702f);
            this.f20808i = true;
        }
        m19073c();
        this.e.sendEmptyMessage(1);
        this.e.removeMessages(2);
        if (i != 0) {
            this.e.sendMessageDelayed(this.e.obtainMessage(2), (long) i);
        }
    }

    public final void mo2382a(int i, int i2) {
        this.f20818t = i2;
    }

    protected final void mo3466a(View view) {
        this.f20811l = (SeekBar) this.c.m4110a((int) R.id.app_video_seekBar).f4923a;
        this.f20811l.setMax(IjkMediaCodecInfo.RANK_MAX);
        this.f20811l.setOnSeekBarChangeListener(this.f20815p);
        this.c.m4110a((int) R.id.app_video_play).m4111a(this.f20816q);
        this.c.m4110a((int) R.id.app_video_fullscreen).m4111a(this.f20816q);
        this.c.m4110a((int) R.id.app_video_finish).m4111a(this.f20816q);
        this.c.m4110a((int) R.id.app_video_replay_icon).m4111a(this.f20816q);
        this.c.m4110a((int) R.id.app_video_clarity).m4111a(this.f20816q);
        final GestureDetector gestureDetector = new GestureDetector(this.a, new C4107a(this));
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.setOnTouchListener(new OnTouchListener(this) {
            final /* synthetic */ C7207b f11731b;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (gestureDetector.onTouchEvent(motionEvent)) {
                    return true;
                }
                int action = motionEvent.getAction() & 255;
                if (action != 1) {
                    switch (action) {
                        case 3:
                        case 4:
                            break;
                        default:
                            return true;
                    }
                }
                this.f11731b.m19084b();
                return true;
            }
        });
    }

    public final void mo2383a(C4113d c4113d) {
        m19071b(4);
    }

    public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
        this.e.removeCallbacksAndMessages(null);
    }

    public final void mo2386a(C4113d c4113d, IjkTimedText ijkTimedText) {
        if (ijkTimedText == null) {
            this.c.m4110a((int) R.id.app_video_subtitle).m4113b();
        } else {
            this.c.m4110a((int) R.id.app_video_subtitle).m4109a().m4112a(ijkTimedText.getText());
        }
    }

    protected final void m19082a(boolean z) {
        if (z || this.f20808i) {
            this.e.removeMessages(1);
            this.c.m4110a((int) R.id.app_video_top_box).m4113b();
            this.f20808i = false;
        }
    }

    public final boolean mo2387a(C4113d c4113d, int i, int i2) {
        if (i != 3) {
            switch (i) {
                case IMediaPlayer.MEDIA_INFO_BUFFERING_START /*701*/:
                    m19071b(1);
                    return true;
                case IMediaPlayer.MEDIA_INFO_BUFFERING_END /*702*/:
                    break;
                case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /*703*/:
                    break;
                default:
                    return true;
            }
        }
        m19071b(2);
        return true;
    }

    protected final void m19084b() {
        this.f20812m = -1;
        this.f20814o = -1.0f;
        if (this.f20807h >= 0) {
            this.e.removeMessages(3);
            this.e.sendEmptyMessage(3);
        }
        this.e.removeMessages(4);
        this.e.sendEmptyMessageDelayed(4, 500);
    }

    public final void mo2388b(int i, int i2) {
        if (i2 != 0) {
            this.c.m4110a((int) R.id.app_video_cover).m4113b();
        }
    }

    public final void mo2389b(C4113d c4113d) {
        this.c.m4110a((int) R.id.app_video_replay).m4113b();
        m19076a(this.d);
    }

    public final boolean mo2390b(C4113d c4113d, int i, int i2) {
        m19071b(-1);
        return true;
    }

    public final void mo2392c(C4113d c4113d) {
        int i = c4113d.getDuration() == 0 ? 1 : 0;
        C1586a a = this.c.m4110a((int) R.id.app_video_seekBar);
        boolean z = i ^ true;
        if (a.f4923a != null) {
            a.f4923a.setEnabled(z);
        }
        if (c4113d.m7968c().length > 0) {
            this.c.m4110a((int) R.id.app_video_clarity).m4109a();
        } else {
            this.c.m4110a((int) R.id.app_video_clarity).m4113b();
        }
    }

    public final void mo2393d(C4113d c4113d) {
        m19071b(1);
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                if (!this.f20809j) {
                    if (this.f.m7924a()) {
                        C4113d player = this.f.getPlayer();
                        int i = player.f11758c;
                        if (!(i == 0 || i == 1)) {
                            if (i != -1) {
                                long currentPosition = (long) player.getCurrentPosition();
                                i = player.getDuration();
                                if (this.f20811l != null) {
                                    if (i > 0) {
                                        this.f20811l.setProgress((int) ((1000 * currentPosition) / ((long) i)));
                                    }
                                    this.f20811l.setSecondaryProgress(player.getBufferPercentage() * 10);
                                }
                                this.c.m4110a((int) R.id.app_video_currentTime).m4112a(C7207b.m19070b(currentPosition));
                                if (i == 0) {
                                    this.c.m4110a((int) R.id.app_video_endTime).m4116c(R.string.giraffe_player_live);
                                } else {
                                    this.c.m4110a((int) R.id.app_video_endTime).m4112a(C7207b.m19070b((long) i));
                                }
                            }
                        }
                    } else {
                        this.f20811l.setProgress(0);
                    }
                }
                if (!this.f20809j && this.f20808i) {
                    this.e.sendMessageDelayed(this.e.obtainMessage(1), 300);
                    m19073c();
                    break;
                }
            case 2:
                m19082a(false);
                return true;
            case 3:
                if (this.f20807h >= 0) {
                    this.f.getPlayer().seekTo((int) this.f20807h);
                    this.f20807h = -1;
                    return true;
                }
                break;
            case 4:
                this.c.m4110a((int) R.id.app_video_volume_box).m4113b();
                this.c.m4110a((int) R.id.app_video_brightness_box).m4113b();
                this.c.m4110a((int) R.id.app_video_fastForward_box).m4113b();
                return true;
            default:
                return true;
        }
        return true;
    }
}
