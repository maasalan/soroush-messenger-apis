package mobi.mmdt.ott.view.conversation.p432e.p433a.p436c;

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
import mobi.mmdt.ott.view.conversation.p432e.p433a.p436c.C7459m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7594m;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C6222c;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.VideoView;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4520n;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7459m extends C7347b {
    private C7594m f21951A;
    private boolean f21952B;
    private boolean f21953C;
    private C1247e<Drawable> f21954D;
    private final boolean f21955e;
    private ImageView f21956f;
    private TextView f21957g;
    private TextView f21958h;
    private TextView f21959i;
    private ImageButton f21960j;
    private View f21961k;
    private View f21962l;
    private ImageButton f21963m;
    private ProgressWheel f21964n;
    private C3284e f21965o;
    private C3283d f21966p;
    private int f21967q;
    private RelativeLayout f21968r;
    private ImageView f21969s;
    private boolean f21970t;
    private TextView f21971u;
    private C3289j f21972v;
    private boolean f21973w;
    private TextureView f21974x;
    private VideoView f21975y;
    private Uri f21976z;

    class C36034 implements OnClickListener {
        final /* synthetic */ C7459m f10803a;

        C36034(C7459m c7459m) {
            this.f10803a = c7459m;
        }

        public final void onClick(View view) {
            C7594m c7594m = (C7594m) this.f10803a.f16244a;
            if (C36022.f10802a[c7594m.f23227Y.ordinal()] == 1) {
                this.f10803a.m19966a(c7594m);
            }
        }
    }

    class C36045 implements OnClickListener {
        final /* synthetic */ C7459m f10804a;

        C36045(C7459m c7459m) {
            this.f10804a = c7459m;
        }

        public final void onClick(View view) {
            this.f10804a.f21965o.mo2331e(((C7594m) this.f10804a.f16244a).f23221S);
        }
    }

    class C36056 implements OnClickListener {
        final /* synthetic */ C7459m f10805a;

        C36056(C7459m c7459m) {
            this.f10805a = c7459m;
        }

        public final void onClick(View view) {
            C7594m c7594m = (C7594m) this.f10805a.f16244a;
            switch (c7594m.f23227Y) {
                case FINISHED:
                    if (this.f10805a.f21973w) {
                        this.f10805a.f21966p.mo2309a(c7594m.f23221S, c7594m.f23223U);
                        return;
                    } else {
                        this.f10805a.m19966a(c7594m);
                        return;
                    }
                case DELETED:
                case NOT_STARTED:
                    this.f10805a.f21965o.mo2307a(c7594m.ac, true);
                    return;
                case TRANSMITTING:
                    this.f10805a.f21965o.mo2305a(c7594m.ac);
                    return;
                case CANCEL:
                    this.f10805a.f21965o.mo2307a(c7594m.ac, true);
                    return;
                case ERROR:
                    this.f10805a.f21965o.mo2307a(c7594m.ac, true);
                    return;
                default:
                    return;
            }
        }
    }

    class C36067 implements OnClickListener {
        final /* synthetic */ C7459m f10806a;

        C36067(C7459m c7459m) {
            this.f10806a = c7459m;
        }

        public final void onClick(View view) {
            C7594m c7594m = (C7594m) this.f10806a.f16244a;
            if (C36022.f10802a[c7594m.f23227Y.ordinal()] == 1) {
                this.f10806a.f21966p.mo2309a(c7594m.f23221S, c7594m.f23223U);
            }
        }
    }

    class C36078 implements Runnable {
        final /* synthetic */ C7459m f10807a;

        C36078(C7459m c7459m) {
            this.f10807a = c7459m;
        }

        public final void run() {
            this.f10807a.f21963m.setImageResource(R.drawable.ic_video_play);
            this.f10807a.f21963m.setVisibility(0);
        }
    }

    class C61511 implements C1247e<Drawable> {
        final /* synthetic */ C7459m f16644a;

        C61511(C7459m c7459m) {
            this.f16644a = c7459m;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7594m c7594m = (C7594m) this.f16644a.f16244a;
            if (!this.f16644a.f21970t) {
                this.f16644a.f21970t = true;
                if (c7594m.f23219Q > 0 && c7594m.f23220R > 0) {
                    Point b = C2491i.m6807b(this.f16644a.f21967q, c7594m.f23219Q, c7594m.f23220R);
                    this.f16644a.m19963a(b.x, b.y);
                }
            }
            return false;
        }
    }

    class C68893 extends C6222c {
        final /* synthetic */ C7459m f19628a;

        C68893(C7459m c7459m) {
            this.f19628a = c7459m;
        }

        public final void mo2382a(int i, int i2) {
        }

        public final void mo2383a(C4113d c4113d) {
            this.f19628a.c.runOnUiThread(new C36078(this.f19628a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19628a.m19966a(this.f19628a.f21951A);
            }
        }

        public final void mo2384a(C4113d c4113d, int i) {
        }

        public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
            this.f19628a.m19968b();
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
            this.f19628a.c.runOnUiThread(new C36078(this.f19628a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19628a.m19966a(this.f19628a.f21951A);
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
            this.f19628a.c.runOnUiThread(new C36078(this.f19628a));
            C4121n.m8000b();
        }
    }

    public C7459m(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, boolean z, C3284e c3284e, C3280a c3280a, C3283d c3283d, C3286g c3286g, C3289j c3289j) {
        C7347b c7347b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_video_captioned_channel_input_list_item : R.layout.chat_video_captioned_channel_input_list_item_old, c3280a, c3286g, c3284e);
        c7347b.f21973w = true;
        c7347b.f21952B = false;
        c7347b.f21953C = true ^ C2535a.m6888a().au();
        c7347b.f21954D = new C61511(c7347b);
        c7347b.f21965o = c3284e;
        c7347b.f21966p = c3283d;
        c7347b.f21972v = c3289j;
        c7347b.f21955e = z;
        c7347b.f21967q = i3;
        c7347b.f21956f = (ImageView) c7347b.itemView.findViewById(R.id.content_imageView);
        c7347b.f21957g = (TextView) c7347b.itemView.findViewById(R.id.caption_textView);
        c7347b.f21958h = (TextView) c7347b.itemView.findViewById(R.id.video_length_textView);
        c7347b.f21959i = (TextView) c7347b.itemView.findViewById(R.id.video_size_textView);
        c7347b.f21961k = c7347b.itemView.findViewById(R.id.bottom_gradient_view);
        c7347b.f21962l = c7347b.itemView.findViewById(R.id.top_gradient_view);
        c7347b.f21963m = (ImageButton) c7347b.itemView.findViewById(R.id.action_imageView);
        c7347b.f21964n = (ProgressWheel) c7347b.itemView.findViewById(R.id.progress_wheel);
        c7347b.f21968r = (RelativeLayout) c7347b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7347b.f21969s = (ImageView) c7347b.itemView.findViewById(R.id.actionDownloadChatFile);
        c7347b.f21971u = (TextView) c7347b.itemView.findViewById(R.id.progress_text_action_view);
        c7347b.f21974x = (TextureView) c7347b.itemView.findViewById(R.id.textureView1);
        c7347b.f21960j = (ImageButton) c7347b.itemView.findViewById(R.id.action_image_option);
        c7347b.f21975y = (VideoView) c7347b.itemView.findViewById(R.id.video_view);
        c7347b.f21975y.f11710a = new C68893(c7347b);
        c7347b.f21974x.setOnClickListener(new C36034(c7347b));
        c7347b.f21969s.setOnClickListener(new C36045(c7347b));
        m19963a(i3, i2);
        c7347b.f21963m.setOnClickListener(new C36056(c7347b));
        c7347b.f21956f.setOnClickListener(new C36067(c7347b));
    }

    private void m19962a() {
        if (this.f21963m != null) {
            this.f21963m.setVisibility(8);
        }
    }

    private void m19963a(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.f21956f.getLayoutParams();
        layoutParams.height = i2;
        if (this.f21953C) {
            layoutParams.width = i;
        }
        int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        LayoutParams layoutParams2 = (LayoutParams) this.f21961k.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f21953C) {
            layoutParams2.width = i;
        }
        layoutParams2 = (LayoutParams) this.f21962l.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f21953C) {
            layoutParams2.width = i;
        }
        layoutParams = (LayoutParams) this.f21975y.getLayoutParams();
        layoutParams.height = i2;
        if (this.f21953C) {
            layoutParams.width = i;
        }
        layoutParams = (LayoutParams) this.f21974x.getLayoutParams();
        layoutParams.height = i2;
        if (this.f21953C) {
            layoutParams.width = i;
        }
    }

    private void m19966a(C7594m c7594m) {
        if (!this.f21972v.mo2348x()) {
            this.f21972v.mo2336g(c7594m.f20777c, c7594m.f23221S);
            String str = c7594m.f20777c;
            if (this.f21975y != null) {
                C4113d player = this.f21975y.getPlayer();
                if (!(player == null || player.f11761f)) {
                    if (player.isPlaying()) {
                        player.m7967b();
                        if (this.f21963m != null) {
                            this.f21963m.setVisibility(0);
                            m19968b();
                        }
                        C4121n.m8000b();
                        return;
                    }
                    C4121n.f11799a = str;
                    m19962a();
                    player.seekTo(0);
                    player.start();
                }
            }
        }
    }

    private void m19968b() {
        this.c.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C7459m f10801a;

            {
                this.f10801a = r1;
            }

            public final void run() {
                this.f10801a.f21975y.getCoverView().setVisibility(0);
            }
        });
    }

    private void m19971c() {
        if (this.f21960j != null) {
            this.f21960j.setVisibility(8);
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7594m c7594m = (C7594m) c6829g;
        this.f21951A = c7594m;
        Object a = C2613o.m7045a(c7594m.f23227Y, c7594m.f23228Z, c7594m.f23221S, c7594m.f23222T, c7594m.f21300A);
        this.f21970t = false;
        if (c7594m.f23227Y == C2987i.FINISHED && this.f21955e) {
            this.f21973w = C2476b.m6722a(c7594m.f23221S);
        }
        C5255m a2 = C4515k.m8230a(c7594m.f23227Y, c7594m.f23221S);
        C1247e c1247e = null;
        C1248f b;
        C1274i a3;
        Point a4;
        if (this.f21973w) {
            this.f21974x.setVisibility(8);
            this.f21975y.setVisibility(8);
            if (this.f21976z == null || !this.f21976z.equals(a)) {
                this.f21956f.setVisibility(0);
                this.f21956f.setImageBitmap(null);
                if (c7594m.f23219Q <= 0 || c7594m.f23220R <= 0) {
                    b = new C1248f().m2954b(this.f21967q, this.f21967q);
                    if (a2 != null) {
                        b.m2951a(a2);
                    }
                    a3 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                    a3.f3986c = this.f21954D;
                    a3 = a3.m3034a(b);
                } else {
                    a4 = this.f21953C ? C2491i.m6763a(this.f21967q, c7594m.f23219Q, c7594m.f23220R) : null;
                    b = new C1248f().m2954b(this.f21953C ? a4.x : this.f21967q, this.f21953C ? a4.y : this.f21967q);
                    if (a2 != null) {
                        b.m2951a(a2);
                    }
                    a3 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(b);
                    if (this.f21953C) {
                        c1247e = this.f21954D;
                    }
                    a3.f3986c = c1247e;
                }
                a3.m3031a(this.f21956f);
            }
        } else {
            if (this.f21976z == null || !this.f21976z.equals(a)) {
                this.f21956f.setImageBitmap(null);
                this.f21956f.setVisibility(8);
                a4 = this.f21953C ? C2491i.m6763a(this.f21967q, c7594m.f23219Q, c7594m.f23220R) : null;
                b = new C1248f().m2954b(this.f21953C ? a4.x : this.f21967q, this.f21953C ? a4.y : this.f21967q);
                if (a2 != null) {
                    b.m2951a(a2);
                }
                a3 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(b);
                if (this.f21953C) {
                    c1247e = this.f21954D;
                }
                a3.f3986c = c1247e;
                a3.m3031a(this.f21975y.getCoverView());
            }
            this.f21975y.getVideoInfo().f11701e = false;
            this.f21975y.m7923a(c7594m.f23221S).m7922a(c7594m.f20777c);
            this.f21975y.setVisibility(0);
            this.f21974x.setVisibility(0);
            if (C4121n.f11799a.equalsIgnoreCase(c7594m.f20777c)) {
                final int i = C4121n.f11800b;
                if (i > 0) {
                    this.c.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C7459m f10809b;

                        public final void run() {
                            if (this.f10809b.f21975y != null) {
                                C4113d player = this.f10809b.f21975y.getPlayer();
                                if (player != null && !player.f11761f) {
                                    this.f10809b.m19962a();
                                    player.seekTo(i);
                                    player.start();
                                }
                            }
                        }
                    });
                }
            } else {
                m19968b();
            }
        }
        this.f21976z = a;
        this.f21958h.setText(C2491i.m6774a(this.c, (long) c7594m.f23225W, true));
        this.f21959i.setText(c7594m.f23226X);
        if (c7594m.f23223U == null || c7594m.f23223U.isEmpty()) {
            this.f21957g.setVisibility(8);
        } else {
            this.f21957g.setText(c7594m.f23223U);
            this.f21957g.setVisibility(0);
            this.f21957g.setTextSize((float) c7594m.aa);
            C4520n.m8234a(this.f21957g);
        }
        m19971c();
        switch (c7594m.f23227Y) {
            case FINISHED:
                this.f21964n.setVisibility(8);
                this.f21969s.setVisibility(8);
                this.f21971u.setVisibility(8);
                this.f21963m.setImageResource(R.drawable.ic_video_play);
                if (!this.f21973w) {
                    if (this.f21960j != null) {
                        this.f21960j.setVisibility(0);
                    }
                    if (this.f21952B) {
                        this.f21952B = false;
                        m19966a(c7594m);
                        break;
                    }
                }
                this.f21963m.setVisibility(0);
                m19971c();
                break;
                break;
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21964n.setVisibility(8);
                this.f21963m.setVisibility(0);
                this.f21963m.setImageResource(R.drawable.ic_file_start_download);
                this.f21969s.setVisibility(8);
                this.f21971u.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21964n.setVisibility(0);
                this.f21963m.setVisibility(0);
                this.f21963m.setImageResource(R.drawable.ic_file_stop_download);
                this.f21971u.setVisibility(0);
                this.f21971u.setText(c7594m.f23218P);
                if (c7594m.f23224V > 0) {
                    progressWheel = this.f21964n;
                    f = ((float) c7594m.f23224V) * 0.01f;
                } else {
                    progressWheel = this.f21964n;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f21969s.setVisibility(8);
                this.f21952B = true;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7594m, this.f21968r, false);
    }
}
