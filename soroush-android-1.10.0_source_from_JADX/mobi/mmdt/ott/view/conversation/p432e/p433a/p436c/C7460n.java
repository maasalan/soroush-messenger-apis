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
import mobi.mmdt.ott.view.conversation.p432e.p433a.p436c.C7460n;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7595n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C6222c;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.VideoView;
import mobi.mmdt.ott.view.tools.C4515k;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7460n extends C7347b {
    private C7595n f21977A;
    private boolean f21978B;
    private C1247e<Drawable> f21979C;
    private final boolean f21980e;
    private ImageView f21981f;
    private TextView f21982g;
    private TextView f21983h;
    private ImageButton f21984i;
    private View f21985j;
    private View f21986k;
    private ImageButton f21987l;
    private ProgressWheel f21988m;
    private C3284e f21989n;
    private C3283d f21990o;
    private int f21991p;
    private ImageView f21992q;
    private boolean f21993r;
    private TextView f21994s;
    private RelativeLayout f21995t;
    private C3289j f21996u;
    private boolean f21997v;
    private TextureView f21998w;
    private VideoView f21999x;
    private Uri f22000y;
    private boolean f22001z;

    class C36104 implements OnClickListener {
        final /* synthetic */ C7460n f10812a;

        C36104(C7460n c7460n) {
            this.f10812a = c7460n;
        }

        public final void onClick(View view) {
            C7595n c7595n = (C7595n) this.f10812a.f16244a;
            if (C36092.f10811a[c7595n.f23237X.ordinal()] == 1) {
                this.f10812a.m19986a(c7595n);
            }
        }
    }

    class C36115 implements OnClickListener {
        final /* synthetic */ C7460n f10813a;

        C36115(C7460n c7460n) {
            this.f10813a = c7460n;
        }

        public final void onClick(View view) {
            this.f10813a.f21989n.mo2331e(((C7595n) this.f10813a.f16244a).f23232S);
        }
    }

    class C36126 implements OnClickListener {
        final /* synthetic */ C7460n f10814a;

        C36126(C7460n c7460n) {
            this.f10814a = c7460n;
        }

        public final void onClick(View view) {
            C7595n c7595n = (C7595n) this.f10814a.f16244a;
            switch (c7595n.f23237X) {
                case FINISHED:
                    if (this.f10814a.f21997v) {
                        this.f10814a.f21990o.mo2309a(c7595n.f23232S, null);
                        return;
                    } else {
                        this.f10814a.m19986a(c7595n);
                        return;
                    }
                case DELETED:
                case NOT_STARTED:
                    this.f10814a.f21989n.mo2307a(c7595n.ac, true);
                    return;
                case TRANSMITTING:
                    this.f10814a.f21989n.mo2305a(c7595n.ac);
                    return;
                case CANCEL:
                    this.f10814a.f21989n.mo2307a(c7595n.ac, true);
                    return;
                case ERROR:
                    this.f10814a.f21989n.mo2307a(c7595n.ac, true);
                    return;
                default:
                    return;
            }
        }
    }

    class C36137 implements OnClickListener {
        final /* synthetic */ C7460n f10815a;

        C36137(C7460n c7460n) {
            this.f10815a = c7460n;
        }

        public final void onClick(View view) {
            C7595n c7595n = (C7595n) this.f10815a.f16244a;
            if (C36092.f10811a[c7595n.f23237X.ordinal()] == 1) {
                this.f10815a.f21990o.mo2309a(c7595n.f23232S, null);
            }
        }
    }

    class C36148 implements Runnable {
        final /* synthetic */ C7460n f10816a;

        C36148(C7460n c7460n) {
            this.f10816a = c7460n;
        }

        public final void run() {
            this.f10816a.f21987l.setImageResource(R.drawable.ic_video_play);
            this.f10816a.f21987l.setVisibility(0);
        }
    }

    class C61521 implements C1247e<Drawable> {
        final /* synthetic */ C7460n f16645a;

        C61521(C7460n c7460n) {
            this.f16645a = c7460n;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7595n c7595n = (C7595n) this.f16645a.f16244a;
            if (!this.f16645a.f21993r) {
                this.f16645a.f21993r = true;
                if (c7595n.f23230Q > 0 && c7595n.f23231R > 0) {
                    Point b = C2491i.m6807b(this.f16645a.f21991p, c7595n.f23230Q, c7595n.f23231R);
                    this.f16645a.m19983a(b.x, b.y);
                }
            }
            return false;
        }
    }

    class C68903 extends C6222c {
        final /* synthetic */ C7460n f19629a;

        C68903(C7460n c7460n) {
            this.f19629a = c7460n;
        }

        public final void mo2382a(int i, int i2) {
        }

        public final void mo2383a(C4113d c4113d) {
            this.f19629a.c.runOnUiThread(new C36148(this.f19629a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19629a.m19986a(this.f19629a.f21977A);
            }
        }

        public final void mo2384a(C4113d c4113d, int i) {
        }

        public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
            this.f19629a.m19988b();
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
            this.f19629a.c.runOnUiThread(new C36148(this.f19629a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19629a.m19986a(this.f19629a.f21977A);
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
            this.f19629a.c.runOnUiThread(new C36148(this.f19629a));
            C4121n.m8000b();
        }
    }

    public C7460n(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, boolean z, C3284e c3284e, C3280a c3280a, C3283d c3283d, C3286g c3286g, C3289j c3289j) {
        C7347b c7347b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_video_channel_input_list_item : R.layout.chat_video_channel_input_list_item_old, c3280a, c3286g, c3284e);
        c7347b.f21997v = true;
        c7347b.f21978B = true ^ C2535a.m6888a().au();
        c7347b.f21979C = new C61521(c7347b);
        c7347b.f21989n = c3284e;
        c7347b.f21990o = c3283d;
        c7347b.f21996u = c3289j;
        c7347b.f21980e = z;
        c7347b.f21991p = i3;
        c7347b.f21981f = (ImageView) c7347b.itemView.findViewById(R.id.content_imageView);
        c7347b.f21982g = (TextView) c7347b.itemView.findViewById(R.id.video_length_textView);
        c7347b.f21983h = (TextView) c7347b.itemView.findViewById(R.id.video_size_textView);
        c7347b.f21985j = c7347b.itemView.findViewById(R.id.bottom_gradient_view);
        c7347b.f21986k = c7347b.itemView.findViewById(R.id.top_gradient_view);
        c7347b.f21987l = (ImageButton) c7347b.itemView.findViewById(R.id.action_imageView);
        c7347b.f21988m = (ProgressWheel) c7347b.itemView.findViewById(R.id.progress_wheel);
        c7347b.f21995t = (RelativeLayout) c7347b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7347b.f21992q = (ImageView) c7347b.itemView.findViewById(R.id.actionDownloadChatFile);
        c7347b.f21994s = (TextView) c7347b.itemView.findViewById(R.id.progress_text_action_view);
        c7347b.f21998w = (TextureView) c7347b.itemView.findViewById(R.id.textureView1);
        c7347b.f21984i = (ImageButton) c7347b.itemView.findViewById(R.id.action_image_option);
        c7347b.f21999x = (VideoView) c7347b.itemView.findViewById(R.id.video_view);
        c7347b.f21999x.f11710a = new C68903(c7347b);
        c7347b.f21998w.setOnClickListener(new C36104(c7347b));
        c7347b.f21992q.setOnClickListener(new C36115(c7347b));
        m19983a(i3, i2);
        c7347b.f21987l.setOnClickListener(new C36126(c7347b));
        c7347b.f21981f.setOnClickListener(new C36137(c7347b));
    }

    private void m19982a() {
        if (this.f21987l != null) {
            this.f21987l.setVisibility(8);
        }
    }

    private void m19983a(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.f21981f.getLayoutParams();
        layoutParams.height = i2;
        if (this.f21978B) {
            layoutParams.width = i;
        }
        int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        LayoutParams layoutParams2 = (LayoutParams) this.f21985j.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f21978B) {
            layoutParams2.width = i;
        }
        layoutParams2 = (LayoutParams) this.f21986k.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f21978B) {
            layoutParams2.width = i;
        }
        layoutParams = (LayoutParams) this.f21999x.getLayoutParams();
        layoutParams.height = i2;
        if (this.f21978B) {
            layoutParams.width = i;
        }
        layoutParams = (LayoutParams) this.f21998w.getLayoutParams();
        layoutParams.height = i2;
        if (this.f21978B) {
            layoutParams.width = i;
        }
    }

    private void m19986a(C7595n c7595n) {
        this.f21996u.mo2336g(c7595n.f20777c, c7595n.f23232S);
        String str = c7595n.f20777c;
        if (this.f21999x != null) {
            C4113d player = this.f21999x.getPlayer();
            if (!(player == null || player.f11761f)) {
                if (player.isPlaying()) {
                    player.m7967b();
                    if (this.f21987l != null) {
                        this.f21987l.setVisibility(0);
                        m19988b();
                    }
                    C4121n.m8000b();
                    return;
                }
                C4121n.f11799a = str;
                m19982a();
                player.seekTo(0);
                player.start();
            }
        }
    }

    private void m19988b() {
        this.c.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C7460n f10810a;

            {
                this.f10810a = r1;
            }

            public final void run() {
                this.f10810a.f21999x.getCoverView().setVisibility(0);
            }
        });
    }

    private void m19991c() {
        if (this.f21984i != null) {
            this.f21984i.setVisibility(8);
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7595n c7595n = (C7595n) c6829g;
        this.f21977A = c7595n;
        Object a = C2613o.m7045a(c7595n.f23237X, c7595n.f23238Y, c7595n.f23232S, c7595n.f23233T, c7595n.f21300A);
        this.f21993r = false;
        if (c7595n.f23237X == C2987i.FINISHED && this.f21980e) {
            this.f21997v = C2476b.m6722a(c7595n.f23232S);
        }
        C5255m a2 = C4515k.m8230a(c7595n.f23237X, c7595n.f23232S);
        C1247e c1247e = null;
        C1248f b;
        C1274i a3;
        Point a4;
        if (this.f21997v) {
            this.f21998w.setVisibility(8);
            this.f21999x.setVisibility(8);
            if (this.f22000y == null || !this.f22000y.equals(a)) {
                this.f21981f.setVisibility(0);
                this.f21981f.setImageBitmap(null);
                if (c7595n.f23230Q <= 0 || c7595n.f23231R <= 0) {
                    b = new C1248f().m2954b(this.f21991p, this.f21991p);
                    if (a2 != null) {
                        b.m2951a(a2);
                    }
                    a3 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                    a3.f3986c = this.f21979C;
                    a3 = a3.m3034a(b);
                } else {
                    a4 = this.f21978B ? C2491i.m6763a(this.f21991p, c7595n.f23230Q, c7595n.f23231R) : null;
                    b = new C1248f().m2954b(this.f21978B ? a4.x : this.f21991p, this.f21978B ? a4.y : this.f21991p);
                    if (a2 != null) {
                        b.m2951a(a2);
                    }
                    a3 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(b);
                    if (this.f21978B) {
                        c1247e = this.f21979C;
                    }
                    a3.f3986c = c1247e;
                }
                a3.m3031a(this.f21981f);
            }
        } else {
            if (this.f22000y == null || !this.f22000y.equals(a)) {
                this.f21981f.setImageBitmap(null);
                this.f21981f.setVisibility(8);
                a4 = this.f21978B ? C2491i.m6763a(this.f21991p, c7595n.f23230Q, c7595n.f23231R) : null;
                b = new C1248f().m2954b(this.f21978B ? a4.x : this.f21991p, this.f21978B ? a4.y : this.f21991p);
                if (a2 != null) {
                    b.m2951a(a2);
                }
                a3 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(b);
                if (this.f21978B) {
                    c1247e = this.f21979C;
                }
                a3.f3986c = c1247e;
                a3.m3031a(this.f21999x.getCoverView());
            }
            this.f21999x.getVideoInfo().f11701e = false;
            this.f21999x.m7923a(c7595n.f23232S).m7922a(c7595n.f20777c);
            this.f21999x.setVisibility(0);
            this.f21998w.setVisibility(0);
            if (C4121n.f11799a.equalsIgnoreCase(c7595n.f20777c)) {
                final int i = C4121n.f11800b;
                if (i > 0) {
                    this.c.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C7460n f10818b;

                        public final void run() {
                            if (this.f10818b.f21999x != null) {
                                C4113d player = this.f10818b.f21999x.getPlayer();
                                if (player != null && !player.f11761f) {
                                    this.f10818b.m19982a();
                                    player.seekTo(i);
                                    player.start();
                                }
                            }
                        }
                    });
                }
            } else {
                m19988b();
            }
        }
        this.f22000y = a;
        this.f21982g.setText(C2491i.m6774a(this.c, (long) c7595n.f23235V, true));
        this.f21983h.setText(c7595n.f23236W);
        m19991c();
        switch (c7595n.f23237X) {
            case FINISHED:
                this.f21988m.setVisibility(8);
                this.f21992q.setVisibility(8);
                this.f21994s.setVisibility(8);
                this.f21987l.setImageResource(R.drawable.ic_video_play);
                if (!this.f21997v) {
                    if (this.f21984i != null) {
                        this.f21984i.setVisibility(0);
                    }
                    if (this.f22001z) {
                        this.f22001z = false;
                        m19986a(c7595n);
                        break;
                    }
                }
                this.f21987l.setVisibility(0);
                m19991c();
                break;
                break;
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21988m.setVisibility(8);
                this.f21987l.setVisibility(0);
                this.f21987l.setImageResource(R.drawable.ic_file_start_download);
                this.f21992q.setVisibility(8);
                this.f21994s.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21988m.setVisibility(0);
                this.f21987l.setVisibility(0);
                this.f21987l.setImageResource(R.drawable.ic_file_stop_download);
                this.f21994s.setVisibility(0);
                this.f21994s.setText(c7595n.f23229P);
                if (c7595n.f23234U > 0) {
                    progressWheel = this.f21988m;
                    f = ((float) c7595n.f23234U) * 0.01f;
                } else {
                    progressWheel = this.f21988m;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f21992q.setVisibility(8);
                this.f22001z = true;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7595n, this.f21995t, false);
    }
}
