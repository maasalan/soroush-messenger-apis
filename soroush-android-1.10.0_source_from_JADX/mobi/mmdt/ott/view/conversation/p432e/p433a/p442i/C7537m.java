package mobi.mmdt.ott.view.conversation.p432e.p433a.p442i;

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
import jp.wasabeef.p215a.p216a.C7156b;
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
import mobi.mmdt.ott.view.conversation.p418a.C3289j;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p442i.C7537m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7672m;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C6222c;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.VideoView;
import mobi.mmdt.ott.view.tools.C4520n;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7537m extends C7353b {
    private C7672m f22876A;
    private C1247e<Drawable> f22877B = new C61931(this);
    private final boolean f22878d;
    private TextView f22879e;
    private ImageView f22880f;
    private TextView f22881g;
    private TextView f22882h;
    private TextView f22883i;
    private ImageButton f22884j;
    private View f22885k;
    private View f22886l;
    private ImageButton f22887m;
    private ProgressWheel f22888n;
    private C3284e f22889o;
    private C3283d f22890p;
    private int f22891q;
    private RelativeLayout f22892r;
    private ImageView f22893s;
    private boolean f22894t;
    private C3289j f22895u;
    private boolean f22896v = true;
    private TextureView f22897w;
    private VideoView f22898x;
    private Uri f22899y;
    private boolean f22900z;

    class C39164 implements OnClickListener {
        final /* synthetic */ C7537m f11367a;

        C39164(C7537m c7537m) {
            this.f11367a = c7537m;
        }

        public final void onClick(View view) {
            C7672m c7672m = (C7672m) this.f11367a.f16244a;
            if (C39152.f11366a[c7672m.ab.ordinal()] == 1) {
                this.f11367a.m20514a(c7672m);
            }
        }
    }

    class C39175 implements OnClickListener {
        final /* synthetic */ C7537m f11368a;

        C39175(C7537m c7537m) {
            this.f11368a = c7537m;
        }

        public final void onClick(View view) {
            this.f11368a.f22889o.mo2331e(((C7672m) this.f11368a.f16244a).f23756S);
        }
    }

    class C39186 implements OnClickListener {
        final /* synthetic */ C7537m f11369a;

        C39186(C7537m c7537m) {
            this.f11369a = c7537m;
        }

        public final void onClick(View view) {
            C7672m c7672m = (C7672m) this.f11369a.f16244a;
            switch (c7672m.ab) {
                case FINISHED:
                    if (this.f11369a.f22896v) {
                        this.f11369a.f22890p.mo2309a(c7672m.f23756S, c7672m.f23758U);
                        return;
                    } else {
                        this.f11369a.m20514a(c7672m);
                        return;
                    }
                case DELETED:
                case NOT_STARTED:
                    this.f11369a.f22889o.mo2307a(c7672m.mo3604b(), true);
                    return;
                case TRANSMITTING:
                    this.f11369a.f22889o.mo2305a(c7672m.mo3604b());
                    return;
                case CANCEL:
                    this.f11369a.f22889o.mo2307a(c7672m.mo3604b(), true);
                    return;
                case ERROR:
                    this.f11369a.f22889o.mo2307a(c7672m.mo3604b(), true);
                    return;
                default:
                    return;
            }
        }
    }

    class C39197 implements OnClickListener {
        final /* synthetic */ C7537m f11370a;

        C39197(C7537m c7537m) {
            this.f11370a = c7537m;
        }

        public final void onClick(View view) {
            C7672m c7672m = (C7672m) this.f11370a.f16244a;
            if (C39152.f11366a[c7672m.ab.ordinal()] == 1) {
                this.f11370a.f22890p.mo2309a(c7672m.f23756S, c7672m.f23758U);
            }
        }
    }

    class C39208 implements Runnable {
        final /* synthetic */ C7537m f11371a;

        C39208(C7537m c7537m) {
            this.f11371a = c7537m;
        }

        public final void run() {
            this.f11371a.f22887m.setImageResource(R.drawable.ic_video_play);
            this.f11371a.f22887m.setVisibility(0);
        }
    }

    class C61931 implements C1247e<Drawable> {
        final /* synthetic */ C7537m f16734a;

        C61931(C7537m c7537m) {
            this.f16734a = c7537m;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7672m c7672m = (C7672m) this.f16734a.f16244a;
            if (!this.f16734a.f22894t) {
                this.f16734a.f22894t = true;
                if (c7672m.f23754Q > 0 && c7672m.f23755R > 0) {
                    Point b = C2491i.m6807b(this.f16734a.f22891q, c7672m.f23754Q, c7672m.f23755R);
                    LayoutParams layoutParams = (LayoutParams) this.f16734a.f22880f.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                    int dimension = (int) this.f16734a.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
                    LayoutParams layoutParams2 = (LayoutParams) this.f16734a.f22885k.getLayoutParams();
                    layoutParams2.height = dimension;
                    layoutParams2.width = b.x;
                    layoutParams2 = (LayoutParams) this.f16734a.f22886l.getLayoutParams();
                    layoutParams2.height = dimension;
                    layoutParams2.width = b.x;
                    layoutParams = (LayoutParams) this.f16734a.f22898x.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                    layoutParams = (LayoutParams) this.f16734a.f22897w.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                }
            }
            return false;
        }
    }

    class C69043 extends C6222c {
        final /* synthetic */ C7537m f19649a;

        C69043(C7537m c7537m) {
            this.f19649a = c7537m;
        }

        public final void mo2382a(int i, int i2) {
        }

        public final void mo2383a(C4113d c4113d) {
            this.f19649a.c.runOnUiThread(new C39208(this.f19649a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19649a.m20514a(this.f19649a.f22876A);
            }
        }

        public final void mo2384a(C4113d c4113d, int i) {
        }

        public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
            this.f19649a.m20516b();
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
            this.f19649a.c.runOnUiThread(new C39208(this.f19649a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19649a.m20514a(this.f19649a.f22876A);
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
            this.f19649a.c.runOnUiThread(new C39208(this.f19649a));
            C4121n.m8000b();
        }
    }

    public C7537m(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, boolean z, C3284e c3284e, C3283d c3283d, C3286g c3286g, C3289j c3289j) {
        int i3 = i;
        int i4 = i2;
        super(activity, layoutInflater, viewGroup, R.layout.chat_video_captioned_input_list_item, c3286g, c3284e);
        this.f22889o = c3284e;
        this.f22890p = c3283d;
        this.f22895u = c3289j;
        this.f22878d = z;
        this.f22891q = i3;
        this.f22880f = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f22881g = (TextView) this.itemView.findViewById(R.id.caption_textView);
        this.f22882h = (TextView) this.itemView.findViewById(R.id.video_length_textView);
        this.f22883i = (TextView) this.itemView.findViewById(R.id.video_size_textView);
        this.f22885k = this.itemView.findViewById(R.id.bottom_gradient_view);
        this.f22886l = this.itemView.findViewById(R.id.top_gradient_view);
        this.f22887m = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22888n = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f22892r = (RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f22893s = (ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile);
        this.f22879e = (TextView) this.itemView.findViewById(R.id.progress_text_action_view);
        this.f22897w = (TextureView) this.itemView.findViewById(R.id.textureView1);
        this.f22884j = (ImageButton) this.itemView.findViewById(R.id.action_image_option);
        this.f22898x = (VideoView) this.itemView.findViewById(R.id.video_view);
        this.f22898x.f11710a = new C69043(this);
        this.f22897w.setOnClickListener(new C39164(this));
        this.f22893s.setOnClickListener(new C39175(this));
        LayoutParams layoutParams = (LayoutParams) this.f22880f.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        layoutParams = (LayoutParams) this.f22898x.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        layoutParams = (LayoutParams) this.f22897w.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        LayoutParams layoutParams2 = (LayoutParams) this.f22885k.getLayoutParams();
        layoutParams2.height = dimension;
        layoutParams2.width = i3;
        layoutParams2 = (LayoutParams) this.f22886l.getLayoutParams();
        layoutParams2.height = dimension;
        layoutParams2.width = i3;
        this.f22887m.setOnClickListener(new C39186(this));
        this.f22880f.setOnClickListener(new C39197(this));
    }

    private void m20512a() {
        if (this.f22887m != null) {
            this.f22887m.setVisibility(8);
        }
    }

    private void m20514a(C7672m c7672m) {
        this.f22895u.mo2336g(c7672m.f20777c, c7672m.f23756S);
        String str = c7672m.f20777c;
        if (this.f22898x != null) {
            C4113d player = this.f22898x.getPlayer();
            if (!(player == null || player.f11761f)) {
                if (player.isPlaying()) {
                    player.m7967b();
                    if (this.f22887m != null) {
                        this.f22887m.setVisibility(0);
                        m20516b();
                    }
                    C4121n.m8000b();
                    return;
                }
                C4121n.f11799a = str;
                m20512a();
                player.seekTo(0);
                player.start();
            }
        }
    }

    private void m20516b() {
        this.c.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C7537m f11365a;

            {
                this.f11365a = r1;
            }

            public final void run() {
                this.f11365a.f22898x.getCoverView().setVisibility(0);
            }
        });
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7672m c7672m = (C7672m) c6829g;
        this.f22876A = c7672m;
        Object a = C2613o.m7045a(c7672m.ab, c7672m.ac, c7672m.f23756S, c7672m.f23757T, c7672m.f21300A);
        this.f22894t = false;
        if (c7672m.ab == C2987i.FINISHED && this.f22878d) {
            this.f22896v = C2476b.m6722a(c7672m.f23756S);
        }
        Point a2;
        C1274i a3;
        C1274i a4;
        C1248f a5;
        if (this.f22896v) {
            this.f22897w.setVisibility(8);
            this.f22898x.setVisibility(8);
            if (this.f22899y == null || !this.f22899y.equals(a)) {
                this.f22880f.setImageBitmap(null);
                this.f22880f.setVisibility(0);
                a2 = C2491i.m6763a(this.f22891q, c7672m.f23754Q, c7672m.f23755R);
                if (c7672m.f23754Q <= 0 || c7672m.f23755R <= 0) {
                    C1248f a6;
                    if (c7672m.ab != C2987i.FINISHED || c7672m.f23756S == null) {
                        a3 = C1212c.m2872a(this.c).m10950a(a);
                        a6 = new C1248f().m2954b(this.f22891q, this.f22891q).m2951a(new C7156b(10));
                    } else {
                        a3 = C1212c.m2872a(this.c).m10950a(a);
                        a6 = new C1248f().m2954b(this.f22891q, this.f22891q);
                    }
                    a3 = a3.m3034a(a6).m3033a();
                    a3.f3986c = this.f22877B;
                } else {
                    if (c7672m.ab != C2987i.FINISHED || c7672m.f23756S == null) {
                        a4 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                        a5 = new C1248f().m2954b(a2.x, a2.y).m2951a(new C7156b(10));
                    } else {
                        a4 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                        a5 = new C1248f().m2954b(a2.x, a2.y);
                    }
                    a3 = a4.m3034a(a5);
                }
                a3.m3031a(this.f22880f);
            }
        } else {
            a2 = C2491i.m6763a(this.f22891q, c7672m.f23754Q, c7672m.f23755R);
            if (this.f22899y == null || !this.f22899y.equals(a)) {
                this.f22880f.setVisibility(8);
                this.f22880f.setImageBitmap(null);
                if (c7672m.ab != C2987i.FINISHED || c7672m.f23756S == null) {
                    a4 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                    a5 = new C1248f().m2954b(a2.x, a2.y).m2951a(new C7156b(10));
                } else {
                    a4 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                    a5 = new C1248f().m2954b(a2.x, a2.y);
                }
                a3 = a4.m3034a(a5);
                a3.f3986c = this.f22877B;
                a3.m3031a(this.f22898x.getCoverView());
            }
            this.f22898x.getVideoInfo().f11701e = false;
            this.f22898x.m7923a(c7672m.f23756S).m7922a(c7672m.f20777c);
            this.f22898x.setVisibility(0);
            this.f22897w.setVisibility(0);
            if (C4121n.f11799a.equalsIgnoreCase(c7672m.f20777c)) {
                final int i = C4121n.f11800b;
                if (i > 0) {
                    this.c.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C7537m f11373b;

                        public final void run() {
                            if (this.f11373b.f22898x != null) {
                                C4113d player = this.f11373b.f22898x.getPlayer();
                                if (player != null && !player.f11761f) {
                                    this.f11373b.m20512a();
                                    player.seekTo(i);
                                    player.start();
                                }
                            }
                        }
                    });
                }
            } else {
                m20516b();
            }
        }
        this.f22899y = a;
        this.f22882h.setText(C2491i.m6774a(this.c, (long) c7672m.f23760Z, true));
        this.f22883i.setText(c7672m.aa);
        if (c7672m.f23758U == null || c7672m.f23758U.isEmpty()) {
            this.f22881g.setVisibility(8);
        } else {
            this.f22881g.setText(c7672m.f23758U);
            this.f22881g.setVisibility(0);
            this.f22881g.setTextSize((float) (((double) c7672m.ad) * 0.85d));
            C4520n.m8234a(this.f22881g);
        }
        this.f22884j.setVisibility(8);
        switch (c7672m.ab) {
            case FINISHED:
                this.f22888n.setVisibility(8);
                this.f22893s.setVisibility(8);
                this.f22879e.setVisibility(8);
                this.f22887m.setImageResource(R.drawable.ic_video_play);
                if (!this.f22896v) {
                    this.f22884j.setVisibility(0);
                    if (this.f22900z) {
                        this.f22900z = false;
                        m20514a(c7672m);
                        break;
                    }
                }
                this.f22887m.setVisibility(0);
                this.f22884j.setVisibility(8);
                break;
                break;
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22888n.setVisibility(8);
                this.f22887m.setVisibility(0);
                this.f22887m.setImageResource(R.drawable.ic_file_start_download);
                this.f22893s.setVisibility(8);
                this.f22879e.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22888n.setVisibility(0);
                this.f22887m.setVisibility(0);
                this.f22887m.setImageResource(R.drawable.ic_file_stop_download);
                this.f22879e.setVisibility(0);
                this.f22879e.setText(c7672m.f23753P);
                if (c7672m.f23759Y > 0) {
                    progressWheel = this.f22888n;
                    f = ((float) c7672m.f23759Y) * 0.01f;
                } else {
                    progressWheel = this.f22888n;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22893s.setVisibility(8);
                this.f22900z = true;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7672m, this.f22892r, false);
    }
}
