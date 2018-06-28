package mobi.mmdt.ott.view.conversation.p432e.p433a.p434a;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p089c.C5255m;
import com.p085c.p086a.p105g.C1247e;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2476b;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p261a.af.C2613o;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p386h.C2986h;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p418a.C3289j;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p434a.C7434l;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7708l;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C6222c;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.VideoView;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4520n;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7434l extends C7345b {
    private C7708l f21644A;
    private boolean f21645B;
    private C1247e<Drawable> f21646C;
    private final boolean f21647d;
    private ImageView f21648e;
    private TextView f21649f;
    private TextView f21650g;
    private TextView f21651h;
    private ImageButton f21652i;
    private View f21653j;
    private View f21654k;
    private ImageButton f21655l;
    private ProgressWheel f21656m;
    private C3284e f21657n;
    private C3283d f21658o;
    private int f21659p;
    private RelativeLayout f21660q;
    private ImageView f21661r;
    private boolean f21662s;
    private C3289j f21663t;
    private boolean f21664u;
    private TextureView f21665v;
    private VideoView f21666w;
    private TextView f21667x;
    private Uri f21668y;
    private boolean f21669z;

    class C35084 implements OnClickListener {
        final /* synthetic */ C7434l f10655a;

        C35084(C7434l c7434l) {
            this.f10655a = c7434l;
        }

        public final void onClick(View view) {
            C7708l c7708l = (C7708l) this.f10655a.f16244a;
            if (C35072.f10654a[c7708l.f24204Y.ordinal()] == 1) {
                this.f10655a.m19797a(c7708l);
            }
        }
    }

    class C35095 implements OnClickListener {
        final /* synthetic */ C7434l f10656a;

        C35095(C7434l c7434l) {
            this.f10656a = c7434l;
        }

        public final void onClick(View view) {
            this.f10656a.f21657n.mo2331e(((C7708l) this.f10656a.f16244a).f24198S);
        }
    }

    class C35106 implements OnClickListener {
        final /* synthetic */ C7434l f10657a;

        C35106(C7434l c7434l) {
            this.f10657a = c7434l;
        }

        public final void onClick(View view) {
            C7708l c7708l = (C7708l) this.f10657a.f16244a;
            switch (c7708l.f24204Y) {
                case FINISHED:
                    if (this.f10657a.f21664u) {
                        this.f10657a.f21658o.mo2309a(c7708l.f24198S, c7708l.f24200U);
                        return;
                    } else {
                        this.f10657a.m19797a(c7708l);
                        return;
                    }
                case DELETED:
                case NOT_STARTED:
                    this.f10657a.f21657n.mo2307a(c7708l.ac, true);
                    return;
                case TRANSMITTING:
                    this.f10657a.f21657n.mo2305a(c7708l.ac);
                    return;
                case CANCEL:
                    this.f10657a.f21657n.mo2307a(c7708l.ac, true);
                    return;
                case ERROR:
                    this.f10657a.f21657n.mo2307a(c7708l.ac, true);
                    return;
                default:
                    return;
            }
        }
    }

    class C35117 implements OnClickListener {
        final /* synthetic */ C7434l f10658a;

        C35117(C7434l c7434l) {
            this.f10658a = c7434l;
        }

        public final void onClick(View view) {
            C7708l c7708l = (C7708l) this.f10658a.f16244a;
            if (C35072.f10654a[c7708l.f24204Y.ordinal()] == 1) {
                this.f10658a.f21658o.mo2309a(c7708l.f24198S, c7708l.f24200U);
            }
        }
    }

    class C35128 implements Runnable {
        final /* synthetic */ C7434l f10659a;

        C35128(C7434l c7434l) {
            this.f10659a = c7434l;
        }

        public final void run() {
            this.f10659a.f21655l.setImageResource(R.drawable.ic_video_play);
            this.f10659a.f21655l.setVisibility(0);
        }
    }

    class C61381 implements C1247e<Drawable> {
        final /* synthetic */ C7434l f16623a;

        C61381(C7434l c7434l) {
            this.f16623a = c7434l;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7708l c7708l = (C7708l) this.f16623a.f16244a;
            if (!this.f16623a.f21662s) {
                this.f16623a.f21662s = true;
                if (c7708l.f24196Q > 0 && c7708l.f24197R > 0) {
                    Point b = C2491i.m6807b(this.f16623a.f21659p, c7708l.f24196Q, c7708l.f24197R);
                    this.f16623a.m19794a(b.x, b.y);
                }
            }
            return false;
        }
    }

    class C68843 extends C6222c {
        final /* synthetic */ C7434l f19621a;

        C68843(C7434l c7434l) {
            this.f19621a = c7434l;
        }

        public final void mo2382a(int i, int i2) {
        }

        public final void mo2383a(C4113d c4113d) {
            this.f19621a.c.runOnUiThread(new C35128(this.f19621a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19621a.m19797a(this.f19621a.f21644A);
            }
        }

        public final void mo2384a(C4113d c4113d, int i) {
        }

        public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
            this.f19621a.m19799b();
        }

        public final void mo2386a(C4113d c4113d, IjkTimedText ijkTimedText) {
        }

        public final boolean mo2387a(C4113d c4113d, int i, int i2) {
            return false;
        }

        public final void mo2388b(int i, int i2) {
        }

        public final void mo2389b(C4113d c4113d) {
        }

        public final boolean mo2390b(C4113d c4113d, int i, int i2) {
            this.f19621a.c.runOnUiThread(new C35128(this.f19621a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19621a.m19797a(this.f19621a.f21644A);
            }
            return false;
        }

        public final void mo2391c(int i, int i2) {
        }

        public final void mo2392c(C4113d c4113d) {
        }

        public final void mo2393d(C4113d c4113d) {
        }

        public final void mo2394e(C4113d c4113d) {
        }

        public final void mo2395f(C4113d c4113d) {
            this.f19621a.c.runOnUiThread(new C35128(this.f19621a));
            C4121n.m8000b();
        }
    }

    public C7434l(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, boolean z, C3284e c3284e, C3288i c3288i, C3283d c3283d, C3286g c3286g, C3289j c3289j) {
        C7345b c7345b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_video_captioned_channel_direct_input_list_item : R.layout.chat_video_captioned_channel_direct_input_list_item_old, c3288i, c3286g, c3284e);
        c7345b.f21664u = true;
        c7345b.f21645B = true ^ C2535a.m6888a().au();
        c7345b.f21646C = new C61381(c7345b);
        c7345b.f21657n = c3284e;
        c7345b.f21658o = c3283d;
        c7345b.f21663t = c3289j;
        c7345b.f21647d = z;
        c7345b.f21659p = i3;
        c7345b.f21648e = (ImageView) c7345b.itemView.findViewById(R.id.content_imageView);
        c7345b.f21649f = (TextView) c7345b.itemView.findViewById(R.id.caption_textView);
        c7345b.f21650g = (TextView) c7345b.itemView.findViewById(R.id.video_length_textView);
        c7345b.f21651h = (TextView) c7345b.itemView.findViewById(R.id.video_size_textView);
        c7345b.f21653j = c7345b.itemView.findViewById(R.id.bottom_gradient_view);
        c7345b.f21654k = c7345b.itemView.findViewById(R.id.top_gradient_view);
        c7345b.f21655l = (ImageButton) c7345b.itemView.findViewById(R.id.action_imageView);
        c7345b.f21656m = (ProgressWheel) c7345b.itemView.findViewById(R.id.progress_wheel);
        c7345b.f21660q = (RelativeLayout) c7345b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7345b.f21661r = (ImageView) c7345b.itemView.findViewById(R.id.actionDownloadChatFile);
        c7345b.f21667x = (TextView) c7345b.itemView.findViewById(R.id.progress_text_action_view);
        c7345b.f21665v = (TextureView) c7345b.itemView.findViewById(R.id.textureView1);
        c7345b.f21652i = (ImageButton) c7345b.itemView.findViewById(R.id.action_image_option);
        c7345b.f21666w = (VideoView) c7345b.itemView.findViewById(R.id.video_view);
        c7345b.f21666w.f11710a = new C68843(c7345b);
        c7345b.f21665v.setOnClickListener(new C35084(c7345b));
        c7345b.f21661r.setOnClickListener(new C35095(c7345b));
        m19794a(i3, i2);
        c7345b.f21655l.setOnClickListener(new C35106(c7345b));
        c7345b.f21648e.setOnClickListener(new C35117(c7345b));
    }

    private void m19793a() {
        if (this.f21655l != null) {
            this.f21655l.setVisibility(8);
        }
    }

    private void m19794a(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.f21648e.getLayoutParams();
        layoutParams.height = i2;
        if (this.f21645B) {
            layoutParams.width = i;
        }
        int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        LayoutParams layoutParams2 = (LayoutParams) this.f21653j.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f21645B) {
            layoutParams2.width = i;
        }
        layoutParams2 = (LayoutParams) this.f21654k.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f21645B) {
            layoutParams2.width = i;
        }
        layoutParams = (LayoutParams) this.f21666w.getLayoutParams();
        layoutParams.height = i2;
        if (this.f21645B) {
            layoutParams.width = i;
        }
        layoutParams = (LayoutParams) this.f21665v.getLayoutParams();
        layoutParams.height = i2;
        if (this.f21645B) {
            layoutParams.width = i;
        }
    }

    private void m19797a(C7708l c7708l) {
        this.f21663t.mo2336g(c7708l.f20777c, c7708l.f24198S);
        String str = c7708l.f20777c;
        if (this.f21666w != null) {
            C4113d player = this.f21666w.getPlayer();
            if (!(player == null || player.f11761f)) {
                if (player.isPlaying()) {
                    player.m7967b();
                    if (this.f21655l != null) {
                        this.f21655l.setVisibility(0);
                        m19799b();
                    }
                    C4121n.m8000b();
                    return;
                }
                C4121n.f11799a = str;
                m19793a();
                player.seekTo(0);
                player.start();
            }
        }
    }

    private void m19799b() {
        this.c.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C7434l f10653a;

            {
                this.f10653a = r1;
            }

            public final void run() {
                this.f10653a.f21666w.getCoverView().setVisibility(0);
            }
        });
    }

    private void m19802c() {
        if (this.f21652i != null) {
            this.f21652i.setVisibility(8);
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7708l c7708l = (C7708l) c6829g;
        this.f21644A = c7708l;
        Object a = C2613o.m7045a(c7708l.f24204Y, c7708l.f24205Z, c7708l.f24198S, c7708l.f24199T, c7708l.f21300A);
        C1247e c1247e = null;
        this.f21648e.setImageBitmap(null);
        this.f21662s = false;
        if (c7708l.f24204Y == C2987i.FINISHED && this.f21647d) {
            this.f21664u = C2476b.m6722a(c7708l.f24198S);
        }
        C5255m a2 = C4515k.m8230a(c7708l.f24204Y, c7708l.f24198S);
        C1274i a3;
        Point a4;
        C1248f b;
        if (this.f21664u) {
            this.f21665v.setVisibility(8);
            this.f21666w.setVisibility(8);
            if (this.f21668y == null || !this.f21668y.equals(a)) {
                this.f21648e.setVisibility(0);
                this.f21648e.setImageBitmap(null);
                if (c7708l.f24196Q <= 0 || c7708l.f24197R <= 0) {
                    C1248f b2 = new C1248f().m2954b(this.f21659p, this.f21659p);
                    if (a2 != null) {
                        b2.m2951a(a2);
                    }
                    a3 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                    a3.f3986c = this.f21646C;
                    a3.m3034a(b2).m3031a(this.f21648e);
                } else {
                    a4 = this.f21645B ? C2491i.m6763a(this.f21659p, c7708l.f24196Q, c7708l.f24197R) : null;
                    b = new C1248f().m2954b(this.f21645B ? a4.x : this.f21659p, this.f21645B ? a4.y : this.f21659p);
                    if (a2 != null) {
                        b.m2951a(a2);
                    }
                    a3 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(b);
                    if (this.f21645B) {
                        c1247e = this.f21646C;
                    }
                    a3.f3986c = c1247e;
                    a3.m3031a(this.f21648e);
                }
            }
        } else {
            if (this.f21668y == null || !this.f21668y.equals(a)) {
                this.f21648e.setImageBitmap(null);
                this.f21648e.setVisibility(8);
                a4 = this.f21645B ? C2491i.m6763a(this.f21659p, c7708l.f24196Q, c7708l.f24197R) : null;
                b = new C1248f().m2954b(this.f21645B ? a4.x : this.f21659p, this.f21645B ? a4.y : this.f21659p);
                if (a2 != null) {
                    b.m2951a(a2);
                }
                a3 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(b);
                if (this.f21645B) {
                    c1247e = this.f21646C;
                }
                a3.f3986c = c1247e;
                a3.m3031a(this.f21666w.getCoverView());
            }
            this.f21666w.getVideoInfo().f11701e = false;
            this.f21666w.m7923a(c7708l.f24198S).m7922a(c7708l.f20777c);
            this.f21666w.setVisibility(0);
            this.f21665v.setVisibility(0);
            if (C4121n.f11799a.equalsIgnoreCase(c7708l.f20777c)) {
                final int i = C4121n.f11800b;
                if (i > 0) {
                    this.c.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C7434l f10661b;

                        public final void run() {
                            if (this.f10661b.f21666w != null) {
                                C4113d player = this.f10661b.f21666w.getPlayer();
                                if (player != null && !player.f11761f) {
                                    this.f10661b.m19793a();
                                    player.seekTo(i);
                                    player.start();
                                }
                            }
                        }
                    });
                }
            } else {
                m19799b();
            }
        }
        this.f21668y = a;
        this.f21650g.setText(C2491i.m6774a(this.c, (long) c7708l.f24202W, true));
        this.f21651h.setText(c7708l.f24203X);
        if (c7708l.f24200U == null || c7708l.f24200U.isEmpty()) {
            this.f21649f.setVisibility(8);
        } else {
            this.f21649f.setText(c7708l.f24200U);
            this.f21649f.setVisibility(0);
            this.f21649f.setTextSize((float) c7708l.aa);
            C4520n.m8234a(this.f21649f);
        }
        m19802c();
        switch (c7708l.f24204Y) {
            case FINISHED:
                this.f21656m.setVisibility(8);
                this.f21661r.setVisibility(8);
                this.f21667x.setVisibility(8);
                this.f21655l.setImageResource(R.drawable.ic_video_play);
                if (!this.f21664u) {
                    if (this.f21652i != null) {
                        this.f21652i.setVisibility(0);
                    }
                    if (this.f21669z) {
                        this.f21669z = false;
                        m19797a(c7708l);
                        break;
                    }
                }
                this.f21655l.setVisibility(0);
                m19802c();
                break;
                break;
            case DELETED:
            case NOT_STARTED:
            case ERROR:
                this.f21656m.setVisibility(8);
                this.f21655l.setVisibility(0);
                this.f21655l.setImageResource(R.drawable.ic_file_start_download);
                this.f21661r.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21656m.setVisibility(0);
                this.f21655l.setVisibility(0);
                this.f21655l.setImageResource(R.drawable.ic_file_stop_download);
                this.f21667x.setVisibility(0);
                this.f21667x.setText(c7708l.f24195P);
                if (c7708l.f24201V > 0) {
                    progressWheel = this.f21656m;
                    f = ((float) c7708l.f24201V) * 0.01f;
                } else {
                    progressWheel = this.f21656m;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f21661r.setVisibility(8);
                this.f21669z = true;
                break;
            case CANCEL:
                this.f21656m.setVisibility(8);
                this.f21655l.setVisibility(0);
                this.f21655l.setImageResource(R.drawable.ic_file_start_download);
                break;
            default:
                break;
        }
        this.f21667x.setVisibility(8);
        m19051a((C7358a) c7708l, this.f21660q, false);
    }
}
