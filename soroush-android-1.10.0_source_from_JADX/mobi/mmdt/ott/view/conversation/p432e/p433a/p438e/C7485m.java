package mobi.mmdt.ott.view.conversation.p432e.p433a.p438e;

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
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3289j;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p438e.C7485m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7620m;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C6222c;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.VideoView;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4520n;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7485m extends C7349b {
    private boolean f22266A;
    private C7620m f22267B;
    private boolean f22268C;
    private C1247e<Drawable> f22269D;
    private final boolean f22270e;
    private ImageView f22271f;
    private TextView f22272g;
    private TextView f22273h;
    private TextView f22274i;
    private ImageButton f22275j;
    private View f22276k;
    private View f22277l;
    private ImageButton f22278m;
    private ProgressWheel f22279n;
    private C3284e f22280o;
    private C3283d f22281p;
    private int f22282q;
    private RelativeLayout f22283r;
    private ImageView f22284s;
    private boolean f22285t;
    private TextView f22286u;
    private C3289j f22287v;
    private boolean f22288w;
    private TextureView f22289x;
    private VideoView f22290y;
    private Uri f22291z;

    class C37094 implements OnClickListener {
        final /* synthetic */ C7485m f10994a;

        C37094(C7485m c7485m) {
            this.f10994a = c7485m;
        }

        public final void onClick(View view) {
            C7620m c7620m = (C7620m) this.f10994a.f16244a;
            if (C37082.f10993a[c7620m.af.ordinal()] == 1) {
                this.f10994a.m20143a(c7620m);
            }
        }
    }

    class C37105 implements OnClickListener {
        final /* synthetic */ C7485m f10995a;

        C37105(C7485m c7485m) {
            this.f10995a = c7485m;
        }

        public final void onClick(View view) {
            this.f10995a.f22280o.mo2331e(((C7620m) this.f10995a.f16244a).f23420S);
        }
    }

    class C37116 implements OnClickListener {
        final /* synthetic */ C7485m f10996a;

        C37116(C7485m c7485m) {
            this.f10996a = c7485m;
        }

        public final void onClick(View view) {
            C7620m c7620m = (C7620m) this.f10996a.f16244a;
            switch (c7620m.af) {
                case FINISHED:
                    if (this.f10996a.f22288w) {
                        this.f10996a.f22281p.mo2309a(c7620m.f23420S, c7620m.f23422U);
                        return;
                    } else {
                        this.f10996a.m20143a(c7620m);
                        return;
                    }
                case DELETED:
                case NOT_STARTED:
                    this.f10996a.f22280o.mo2307a(c7620m.f23088W, true);
                    return;
                case TRANSMITTING:
                    this.f10996a.f22280o.mo2305a(c7620m.f23088W);
                    return;
                case CANCEL:
                    this.f10996a.f22280o.mo2307a(c7620m.f23088W, true);
                    return;
                case ERROR:
                    this.f10996a.f22280o.mo2307a(c7620m.f23088W, true);
                    return;
                default:
                    return;
            }
        }
    }

    class C37127 implements OnClickListener {
        final /* synthetic */ C7485m f10997a;

        C37127(C7485m c7485m) {
            this.f10997a = c7485m;
        }

        public final void onClick(View view) {
            C7620m c7620m = (C7620m) this.f10997a.f16244a;
            if (C37082.f10993a[c7620m.af.ordinal()] == 1) {
                this.f10997a.f22281p.mo2309a(c7620m.f23420S, c7620m.f23422U);
            }
        }
    }

    class C37138 implements Runnable {
        final /* synthetic */ C7485m f10998a;

        C37138(C7485m c7485m) {
            this.f10998a = c7485m;
        }

        public final void run() {
            this.f10998a.f22278m.setImageResource(R.drawable.ic_video_play);
            this.f10998a.f22278m.setVisibility(0);
        }
    }

    class C61651 implements C1247e<Drawable> {
        final /* synthetic */ C7485m f16674a;

        C61651(C7485m c7485m) {
            this.f16674a = c7485m;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7620m c7620m = (C7620m) this.f16674a.f16244a;
            if (!this.f16674a.f22285t) {
                this.f16674a.f22285t = true;
                if (c7620m.f23418Q > 0 && c7620m.f23419R > 0) {
                    Point b = C2491i.m6807b(this.f16674a.f22282q, c7620m.f23418Q, c7620m.f23419R);
                    this.f16674a.m20140a(b.x, b.y);
                }
            }
            return false;
        }
    }

    class C68943 extends C6222c {
        final /* synthetic */ C7485m f19635a;

        C68943(C7485m c7485m) {
            this.f19635a = c7485m;
        }

        public final void mo2382a(int i, int i2) {
        }

        public final void mo2383a(C4113d c4113d) {
            this.f19635a.c.runOnUiThread(new C37138(this.f19635a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19635a.m20143a(this.f19635a.f22267B);
            }
        }

        public final void mo2384a(C4113d c4113d, int i) {
        }

        public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
            this.f19635a.m20145b();
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
            this.f19635a.c.runOnUiThread(new C37138(this.f19635a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19635a.m20143a(this.f19635a.f22267B);
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
            this.f19635a.c.runOnUiThread(new C37138(this.f19635a));
            C4121n.m8000b();
        }
    }

    public C7485m(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, boolean z, C3284e c3284e, C3280a c3280a, C3283d c3283d, C3286g c3286g, C3289j c3289j) {
        C7349b c7349b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_video_captioned_channel_reply_input_list_item : R.layout.chat_video_captioned_channel_reply_input_list_item_old, c3280a, c3286g, c3284e);
        c7349b.f22288w = true;
        c7349b.f22268C = true ^ C2535a.m6888a().au();
        c7349b.f22269D = new C61651(c7349b);
        c7349b.f22280o = c3284e;
        c7349b.f22281p = c3283d;
        c7349b.f22287v = c3289j;
        c7349b.f22270e = z;
        c7349b.f22282q = i3;
        c7349b.f22271f = (ImageView) c7349b.itemView.findViewById(R.id.content_imageView);
        c7349b.f22272g = (TextView) c7349b.itemView.findViewById(R.id.caption_textView);
        c7349b.f22273h = (TextView) c7349b.itemView.findViewById(R.id.video_length_textView);
        c7349b.f22274i = (TextView) c7349b.itemView.findViewById(R.id.video_size_textView);
        c7349b.f22276k = c7349b.itemView.findViewById(R.id.bottom_gradient_view);
        c7349b.f22277l = c7349b.itemView.findViewById(R.id.top_gradient_view);
        c7349b.f22278m = (ImageButton) c7349b.itemView.findViewById(R.id.action_imageView);
        c7349b.f22279n = (ProgressWheel) c7349b.itemView.findViewById(R.id.progress_wheel);
        c7349b.f22283r = (RelativeLayout) c7349b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7349b.f22284s = (ImageView) c7349b.itemView.findViewById(R.id.actionDownloadChatFile);
        c7349b.f22286u = (TextView) c7349b.itemView.findViewById(R.id.progress_text_action_view);
        c7349b.f22289x = (TextureView) c7349b.itemView.findViewById(R.id.textureView1);
        c7349b.f22275j = (ImageButton) c7349b.itemView.findViewById(R.id.action_image_option);
        c7349b.f22290y = (VideoView) c7349b.itemView.findViewById(R.id.video_view);
        c7349b.f22290y.f11710a = new C68943(c7349b);
        c7349b.f22289x.setOnClickListener(new C37094(c7349b));
        c7349b.f22284s.setOnClickListener(new C37105(c7349b));
        m20140a(i3, i2);
        c7349b.f22278m.setOnClickListener(new C37116(c7349b));
        c7349b.f22271f.setOnClickListener(new C37127(c7349b));
    }

    private void m20139a() {
        if (this.f22278m != null) {
            this.f22278m.setVisibility(8);
        }
    }

    private void m20140a(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.f22271f.getLayoutParams();
        layoutParams.height = i2;
        if (this.f22268C) {
            layoutParams.width = i;
        }
        int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        LayoutParams layoutParams2 = (LayoutParams) this.f22276k.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f22268C) {
            layoutParams2.width = i;
        }
        layoutParams2 = (LayoutParams) this.f22277l.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f22268C) {
            layoutParams2.width = i;
        }
        layoutParams = (LayoutParams) this.f22290y.getLayoutParams();
        layoutParams.height = i2;
        if (this.f22268C) {
            layoutParams.width = i;
        }
        layoutParams = (LayoutParams) this.f22289x.getLayoutParams();
        layoutParams.height = i2;
        if (this.f22268C) {
            layoutParams.width = i;
        }
    }

    private void m20143a(C7620m c7620m) {
        this.f22287v.mo2336g(c7620m.f20777c, c7620m.f23420S);
        String str = c7620m.f20777c;
        if (this.f22290y != null) {
            C4113d player = this.f22290y.getPlayer();
            if (!(player == null || player.f11761f)) {
                if (player.isPlaying()) {
                    player.m7967b();
                    if (this.f22278m != null) {
                        this.f22278m.setVisibility(0);
                        m20145b();
                    }
                    C4121n.m8000b();
                    return;
                }
                C4121n.f11799a = str;
                m20139a();
                player.seekTo(0);
                player.start();
            }
        }
    }

    private void m20145b() {
        this.c.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C7485m f10992a;

            {
                this.f10992a = r1;
            }

            public final void run() {
                this.f10992a.f22290y.getCoverView().setVisibility(0);
            }
        });
    }

    private void m20148c() {
        if (this.f22275j != null) {
            this.f22275j.setVisibility(8);
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7620m c7620m = (C7620m) c6829g;
        this.f22267B = c7620m;
        Object a = C2613o.m7045a(c7620m.af, c7620m.ag, c7620m.f23420S, c7620m.f23421T, c7620m.f21300A);
        this.f22285t = false;
        if (c7620m.af == C2987i.FINISHED && this.f22270e) {
            this.f22288w = C2476b.m6722a(c7620m.f23420S);
        }
        C5255m a2 = C4515k.m8230a(c7620m.af, c7620m.f23420S);
        C1247e c1247e = null;
        C1248f b;
        C1274i a3;
        Point a4;
        if (this.f22288w) {
            this.f22289x.setVisibility(8);
            this.f22290y.setVisibility(8);
            if (this.f22291z == null || !this.f22291z.equals(a)) {
                this.f22271f.setVisibility(0);
                this.f22271f.setImageBitmap(null);
                if (c7620m.f23418Q <= 0 || c7620m.f23419R <= 0) {
                    b = new C1248f().m2954b(this.f22282q, this.f22282q);
                    if (a2 != null) {
                        b.m2951a(a2);
                    }
                    a3 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                    a3.f3986c = this.f22269D;
                    a3 = a3.m3034a(b);
                } else {
                    a4 = this.f22268C ? C2491i.m6763a(this.f22282q, c7620m.f23418Q, c7620m.f23419R) : null;
                    b = new C1248f().m2954b(this.f22268C ? a4.x : this.f22282q, this.f22268C ? a4.y : this.f22282q);
                    if (a2 != null) {
                        b.m2951a(a2);
                    }
                    a3 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(b);
                    if (this.f22268C) {
                        c1247e = this.f22269D;
                    }
                    a3.f3986c = c1247e;
                }
                a3.m3031a(this.f22271f);
            }
        } else {
            if (this.f22291z == null || !this.f22291z.equals(a)) {
                this.f22271f.setImageBitmap(null);
                this.f22271f.setVisibility(8);
                a4 = this.f22268C ? C2491i.m6763a(this.f22282q, c7620m.f23418Q, c7620m.f23419R) : null;
                b = new C1248f().m2954b(this.f22268C ? a4.x : this.f22282q, this.f22268C ? a4.y : this.f22282q);
                if (a2 != null) {
                    b.m2951a(a2);
                }
                a3 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(b);
                if (this.f22268C) {
                    c1247e = this.f22269D;
                }
                a3.f3986c = c1247e;
                a3.m3031a(this.f22290y.getCoverView());
            }
            this.f22290y.getVideoInfo().f11701e = false;
            this.f22290y.m7923a(c7620m.f23420S).m7922a(c7620m.f20777c);
            this.f22290y.setVisibility(0);
            this.f22289x.setVisibility(0);
            if (C4121n.f11799a.equalsIgnoreCase(c7620m.f20777c)) {
                final int i = C4121n.f11800b;
                if (i > 0) {
                    this.c.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C7485m f11000b;

                        public final void run() {
                            if (this.f11000b.f22290y != null) {
                                C4113d player = this.f11000b.f22290y.getPlayer();
                                if (player != null && !player.f11761f) {
                                    this.f11000b.m20139a();
                                    player.seekTo(i);
                                    player.start();
                                }
                            }
                        }
                    });
                }
            } else {
                m20145b();
            }
        }
        this.f22291z = a;
        this.f22273h.setText(C2491i.m6774a(this.c, (long) c7620m.ad, true));
        this.f22274i.setText(c7620m.ae);
        if (c7620m.f23422U == null || c7620m.f23422U.isEmpty()) {
            this.f22272g.setVisibility(8);
        } else {
            this.f22272g.setText(c7620m.f23422U);
            this.f22272g.setVisibility(0);
            this.f22272g.setTextSize((float) c7620m.ah);
            C4520n.m8234a(this.f22272g);
        }
        m20148c();
        switch (c7620m.af) {
            case FINISHED:
                this.f22279n.setVisibility(8);
                this.f22284s.setVisibility(8);
                this.f22286u.setVisibility(8);
                this.f22278m.setImageResource(R.drawable.ic_video_play);
                if (!this.f22288w) {
                    if (this.f22275j != null) {
                        this.f22275j.setVisibility(0);
                    }
                    if (this.f22266A) {
                        this.f22266A = false;
                        m20143a(c7620m);
                        break;
                    }
                }
                this.f22278m.setVisibility(0);
                m20148c();
                break;
                break;
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22279n.setVisibility(8);
                this.f22278m.setVisibility(0);
                this.f22278m.setImageResource(R.drawable.ic_file_start_download);
                this.f22284s.setVisibility(8);
                this.f22286u.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22279n.setVisibility(0);
                this.f22278m.setVisibility(0);
                this.f22278m.setImageResource(R.drawable.ic_file_stop_download);
                this.f22286u.setVisibility(0);
                this.f22286u.setText(c7620m.f23417P);
                if (c7620m.ac > 0) {
                    progressWheel = this.f22279n;
                    f = ((float) c7620m.ac) * 0.01f;
                } else {
                    progressWheel = this.f22279n;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22284s.setVisibility(8);
                this.f22266A = true;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7620m, this.f22283r, false);
    }
}
