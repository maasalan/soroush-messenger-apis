package mobi.mmdt.ott.view.conversation.p432e.p433a.p435b;

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
import com.p085c.p086a.p105g.C1247e;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2476b;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p261a.af.C2613o;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p386h.C2986h;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3289j;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p435b.C7446l;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7720l;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C6222c;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.VideoView;
import mobi.mmdt.ott.view.tools.C4520n;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7446l extends C7346b {
    private C7720l f21797A;
    private boolean f21798B;
    private boolean f21799C;
    private C1247e<Drawable> f21800D;
    private final boolean f21801e;
    private ImageView f21802f;
    private TextView f21803g;
    private TextView f21804h;
    private TextView f21805i;
    private ImageButton f21806j;
    private TextView f21807k;
    private ImageView f21808l;
    private View f21809m;
    private View f21810n;
    private ImageButton f21811o;
    private ProgressWheel f21812p;
    private C3284e f21813q;
    private C3283d f21814r;
    private int f21815s;
    private ImageView f21816t;
    private boolean f21817u;
    private RelativeLayout f21818v;
    private C3289j f21819w;
    private boolean f21820x;
    private TextureView f21821y;
    private VideoView f21822z;

    class C35494 implements OnClickListener {
        final /* synthetic */ C7446l f10708a;

        C35494(C7446l c7446l) {
            this.f10708a = c7446l;
        }

        public final void onClick(View view) {
            C7720l c7720l = (C7720l) this.f10708a.f16244a;
            if (C35482.f10706a[c7720l.f24321Y.ordinal()] == 1) {
                this.f10708a.m19881a(c7720l);
            }
        }
    }

    class C35505 implements OnClickListener {
        final /* synthetic */ C7446l f10709a;

        C35505(C7446l c7446l) {
            this.f10709a = c7446l;
        }

        public final void onClick(View view) {
            this.f10709a.f21813q.mo2331e(((C7720l) this.f10709a.f16244a).f24315S);
        }
    }

    class C35516 implements OnClickListener {
        final /* synthetic */ C7446l f10710a;

        C35516(C7446l c7446l) {
            this.f10710a = c7446l;
        }

        public final void onClick(View view) {
            C7720l c7720l = (C7720l) this.f10710a.f16244a;
            switch (c7720l.f24321Y) {
                case DELETED:
                case NOT_STARTED:
                    if (c7720l.ab == null || c7720l.ab.isEmpty()) {
                        this.f10710a.f21813q.mo2307a(c7720l.ac, false);
                        return;
                    } else {
                        this.f10710a.f21813q.mo2307a(c7720l.ac, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f10710a.f21813q.mo2305a(c7720l.ac);
                    return;
                case CANCEL:
                    if (c7720l.ab == null || c7720l.ab.isEmpty()) {
                        this.f10710a.f21813q.mo2307a(c7720l.ac, false);
                        return;
                    } else {
                        this.f10710a.f21813q.mo2307a(c7720l.ac, true);
                        return;
                    }
                case ERROR:
                    if (c7720l.ab == null || c7720l.ab.isEmpty()) {
                        this.f10710a.f21813q.mo2307a(c7720l.ac, false);
                        return;
                    } else {
                        this.f10710a.f21813q.mo2307a(c7720l.ac, true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C35527 implements OnClickListener {
        final /* synthetic */ C7446l f10711a;

        C35527(C7446l c7446l) {
            this.f10711a = c7446l;
        }

        public final void onClick(View view) {
            C7720l c7720l = (C7720l) this.f10711a.f16244a;
            if (c7720l.ab == null || c7720l.ab.isEmpty()) {
                int[] iArr = C35482.f10706a;
                c7720l.f24321Y.ordinal();
                this.f10711a.f21814r.mo2309a(c7720l.f24315S, c7720l.f24317U);
            } else if (c7720l.f24321Y == C2987i.FINISHED) {
                this.f10711a.f21814r.mo2309a(c7720l.f24315S, c7720l.f24317U);
            }
        }
    }

    class C35538 implements Runnable {
        final /* synthetic */ C7446l f10712a;

        C35538(C7446l c7446l) {
            this.f10712a = c7446l;
        }

        public final void run() {
            this.f10712a.f21811o.setImageResource(R.drawable.ic_video_play);
            this.f10712a.f21811o.setVisibility(0);
        }
    }

    class C61441 implements C1247e<Drawable> {
        final /* synthetic */ C7446l f16629a;

        C61441(C7446l c7446l) {
            this.f16629a = c7446l;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7720l c7720l = (C7720l) this.f16629a.f16244a;
            if (!this.f16629a.f21817u) {
                this.f16629a.f21817u = true;
                if (c7720l.f24313Q > 0 && c7720l.f24314R > 0) {
                    Point b = C2491i.m6807b(this.f16629a.f21815s, c7720l.f24313Q, c7720l.f24314R);
                    this.f16629a.m19878a(b.x, b.y);
                }
            }
            return false;
        }
    }

    class C68863 extends C6222c {
        final /* synthetic */ C7446l f19623a;

        C68863(C7446l c7446l) {
            this.f19623a = c7446l;
        }

        public final void mo2382a(int i, int i2) {
        }

        public final void mo2383a(C4113d c4113d) {
            this.f19623a.c.runOnUiThread(new C35538(this.f19623a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19623a.m19881a(this.f19623a.f21797A);
            }
        }

        public final void mo2384a(C4113d c4113d, int i) {
        }

        public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
            this.f19623a.m19884b();
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
            this.f19623a.c.runOnUiThread(new C35538(this.f19623a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19623a.m19881a(this.f19623a.f21797A);
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
            this.f19623a.c.runOnUiThread(new C35538(this.f19623a));
            C4121n.m8000b();
        }
    }

    public C7446l(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, boolean z, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g, C3289j c3289j) {
        C7346b c7346b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_video_captioned_channel_direct_output_list_item : R.layout.chat_video_captioned_channel_direct_output_list_item_old, c3280a, c3286g, c3284e);
        c7346b.f21820x = true;
        c7346b.f21799C = true ^ C2535a.m6888a().au();
        c7346b.f21800D = new C61441(c7346b);
        c7346b.f21813q = c3284e;
        c7346b.f21814r = c3283d;
        c7346b.f21819w = c3289j;
        c7346b.f21801e = z;
        c7346b.f21815s = i3;
        c7346b.f21802f = (ImageView) c7346b.itemView.findViewById(R.id.content_imageView);
        c7346b.f21803g = (TextView) c7346b.itemView.findViewById(R.id.caption_textView);
        c7346b.f21804h = (TextView) c7346b.itemView.findViewById(R.id.video_length_textView);
        c7346b.f21805i = (TextView) c7346b.itemView.findViewById(R.id.video_size_textView);
        c7346b.f21808l = (ImageView) c7346b.itemView.findViewById(R.id.status_imageView);
        c7346b.f21809m = c7346b.itemView.findViewById(R.id.bottom_gradient_view);
        c7346b.f21810n = c7346b.itemView.findViewById(R.id.top_gradient_view);
        c7346b.f21811o = (ImageButton) c7346b.itemView.findViewById(R.id.action_imageView);
        c7346b.f21807k = (TextView) c7346b.itemView.findViewById(R.id.progress_text_action_view);
        c7346b.f21812p = (ProgressWheel) c7346b.itemView.findViewById(R.id.progress_wheel);
        c7346b.f21818v = (RelativeLayout) c7346b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7346b.f21816t = (ImageView) c7346b.itemView.findViewById(R.id.actionDownloadChatFile);
        c7346b.f21821y = (TextureView) c7346b.itemView.findViewById(R.id.textureView1);
        c7346b.f21806j = (ImageButton) c7346b.itemView.findViewById(R.id.action_image_option);
        c7346b.f21822z = (VideoView) c7346b.itemView.findViewById(R.id.video_view);
        c7346b.f21822z.f11710a = new C68863(c7346b);
        c7346b.f21821y.setOnClickListener(new C35494(c7346b));
        c7346b.f21816t.setOnClickListener(new C35505(c7346b));
        m19878a(i3, i2);
        c7346b.f21811o.setOnClickListener(new C35516(c7346b));
        c7346b.f21802f.setOnClickListener(new C35527(c7346b));
    }

    private void m19877a() {
        if (this.f21811o != null) {
            this.f21811o.setVisibility(8);
        }
    }

    private void m19878a(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.f21802f.getLayoutParams();
        layoutParams.height = i2;
        if (this.f21799C) {
            layoutParams.width = i;
        }
        int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        LayoutParams layoutParams2 = (LayoutParams) this.f21809m.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f21799C) {
            layoutParams2.width = i;
        }
        layoutParams2 = (LayoutParams) this.f21810n.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f21799C) {
            layoutParams2.width = i;
        }
        layoutParams = (LayoutParams) this.f21822z.getLayoutParams();
        layoutParams.height = i2;
        if (this.f21799C) {
            layoutParams.width = i;
        }
        layoutParams = (LayoutParams) this.f21821y.getLayoutParams();
        layoutParams.height = i2;
        if (this.f21799C) {
            layoutParams.width = i;
        }
    }

    private void m19881a(C7720l c7720l) {
        this.f21819w.mo2336g(c7720l.f20777c, c7720l.f24315S);
        String str = c7720l.f20777c;
        if (this.f21822z != null) {
            C4113d player = this.f21822z.getPlayer();
            if (!(player == null || player.f11761f)) {
                if (player.isPlaying()) {
                    player.m7967b();
                    if (this.f21811o != null) {
                        this.f21811o.setVisibility(0);
                        m19884b();
                    }
                    C4121n.m8000b();
                    return;
                }
                C4121n.f11799a = str;
                m19877a();
                player.seekTo(0);
                player.start();
            }
        }
    }

    private void m19882a(C7720l c7720l, C2971k c2971k) {
        boolean z = ((c7720l.ab == null || c7720l.ab.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f21811o, z);
    }

    private void m19884b() {
        this.c.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C7446l f10705a;

            {
                this.f10705a = r1;
            }

            public final void run() {
                this.f10705a.f21822z.getCoverView().setVisibility(0);
            }
        });
    }

    private void m19887c() {
        if (this.f21806j != null) {
            this.f21806j.setVisibility(8);
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7720l c7720l = (C7720l) c6829g;
        this.f21797A = c7720l;
        Object a = C2613o.m7045a(c7720l.f24321Y, c7720l.f24322Z, c7720l.f24315S, c7720l.f24316T, c7720l.f21300A);
        C1247e c1247e = null;
        this.f21802f.setImageBitmap(null);
        this.f21817u = false;
        if (c7720l.f24321Y == C2987i.FINISHED && this.f21801e) {
            this.f21820x = C2476b.m6722a(c7720l.f24315S);
        }
        Point a2 = this.f21799C ? C2491i.m6763a(this.f21815s, c7720l.f24313Q, c7720l.f24314R) : null;
        C1274i a3;
        if (this.f21820x) {
            this.f21821y.setVisibility(8);
            this.f21822z.setVisibility(8);
            boolean z = c7720l.f24313Q > 0 && c7720l.f24314R > 0;
            C1248f c1248f = new C1248f();
            int i2 = (z && this.f21799C) ? a2.x : this.f21815s;
            int i3 = (z && this.f21799C) ? a2.y : this.f21815s;
            C1248f b = c1248f.m2954b(i2, i3);
            if (!z || this.f21799C) {
                c1247e = this.f21800D;
            }
            a3 = C1212c.m2872a(this.c).m10950a(a).m3034a(b).m3033a();
            a3.f3986c = c1247e;
            a3.m3031a(this.f21802f);
        } else {
            a3 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(new C1248f().m2954b(this.f21799C ? a2.x : this.f21815s, this.f21799C ? a2.y : this.f21815s));
            if (this.f21799C) {
                c1247e = this.f21800D;
            }
            a3.f3986c = c1247e;
            a3.m3031a(this.f21822z.getCoverView());
            this.f21822z.getVideoInfo().f11701e = false;
            this.f21822z.m7923a(c7720l.f24315S).m7922a(c7720l.f20777c);
            this.f21822z.setVisibility(0);
            this.f21821y.setVisibility(0);
            if (C4121n.f11799a.equalsIgnoreCase(c7720l.f20777c)) {
                final int i4 = C4121n.f11800b;
                if (i4 > 0) {
                    this.c.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C7446l f10714b;

                        public final void run() {
                            if (this.f10714b.f21822z != null) {
                                C4113d player = this.f10714b.f21822z.getPlayer();
                                if (player != null && !player.f11761f) {
                                    this.f10714b.m19877a();
                                    player.seekTo(i4);
                                    player.start();
                                }
                            }
                        }
                    });
                }
            } else {
                m19884b();
            }
        }
        this.f21804h.setText(C2491i.m6774a(this.c, (long) c7720l.f24319W, true));
        this.f21805i.setText(c7720l.f24320X);
        if (c7720l.f24317U == null || c7720l.f24317U.isEmpty()) {
            this.f21803g.setVisibility(8);
        } else {
            this.f21803g.setText(c7720l.f24317U);
            this.f21803g.setVisibility(0);
            this.f21803g.setTextSize((float) c7720l.aa);
            C4520n.m8234a(this.f21803g);
        }
        switch (c7720l.f21337w) {
            case ERROR:
                imageView = this.f21808l;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f21808l;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f21808l;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f21808l;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        m19887c();
        switch (c7720l.f24321Y) {
            case FINISHED:
                this.f21812p.setVisibility(8);
                this.f21816t.setVisibility(8);
                this.f21807k.setVisibility(8);
                this.f21811o.setImageResource(R.drawable.ic_video_play);
                if (!this.f21820x) {
                    if (this.f21806j != null) {
                        this.f21806j.setVisibility(0);
                    }
                    if (this.f21798B) {
                        this.f21798B = false;
                        m19881a(c7720l);
                        break;
                    }
                }
                this.f21811o.setVisibility(0);
                m19887c();
                break;
                break;
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21812p.setVisibility(8);
                this.f21811o.setVisibility(0);
                this.f21807k.setVisibility(8);
                m19882a(c7720l, c7720l.f21337w);
                this.f21816t.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21812p.setVisibility(0);
                this.f21811o.setVisibility(0);
                this.f21811o.setImageResource(R.drawable.ic_file_stop_download);
                this.f21807k.setVisibility(0);
                this.f21807k.setText(c7720l.f24312P);
                if (c7720l.f24318V > 0) {
                    progressWheel = this.f21812p;
                    f = ((float) c7720l.f24318V) * 0.01f;
                } else {
                    progressWheel = this.f21812p;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f21816t.setVisibility(8);
                this.f21798B = true;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7720l, this.f21818v, true);
    }
}
