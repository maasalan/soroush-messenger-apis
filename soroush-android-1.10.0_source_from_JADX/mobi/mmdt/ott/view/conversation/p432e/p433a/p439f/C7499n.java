package mobi.mmdt.ott.view.conversation.p432e.p433a.p439f;

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
import mobi.mmdt.ott.view.conversation.p432e.p433a.p439f.C7499n;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7634n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C6222c;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.VideoView;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7499n extends C7350b {
    private C7634n f22453A;
    private boolean f22454B;
    private C1247e<Drawable> f22455C;
    private final boolean f22456e;
    private ImageView f22457f;
    private TextView f22458g;
    private TextView f22459h;
    private ImageButton f22460i;
    private TextView f22461j;
    private ImageView f22462k;
    private View f22463l;
    private View f22464m;
    private ImageButton f22465n;
    private ProgressWheel f22466o;
    private C3284e f22467p;
    private C3283d f22468q;
    private int f22469r;
    private RelativeLayout f22470s;
    private ImageView f22471t;
    private boolean f22472u;
    private C3289j f22473v;
    private boolean f22474w;
    private TextureView f22475x;
    private VideoView f22476y;
    private boolean f22477z;

    class C37684 implements OnClickListener {
        final /* synthetic */ C7499n f11100a;

        C37684(C7499n c7499n) {
            this.f11100a = c7499n;
        }

        public final void onClick(View view) {
            C7634n c7634n = (C7634n) this.f11100a.f16244a;
            if (C37672.f11098a[c7634n.aa.ordinal()] == 1) {
                this.f11100a.m20254a(c7634n);
            }
        }
    }

    class C37695 implements OnClickListener {
        final /* synthetic */ C7499n f11101a;

        C37695(C7499n c7499n) {
            this.f11101a = c7499n;
        }

        public final void onClick(View view) {
            this.f11101a.f22467p.mo2331e(((C7634n) this.f11101a.f16244a).f23505R);
        }
    }

    class C37706 implements OnClickListener {
        final /* synthetic */ C7499n f11102a;

        C37706(C7499n c7499n) {
            this.f11102a = c7499n;
        }

        public final void onClick(View view) {
            C7634n c7634n = (C7634n) this.f11102a.f16244a;
            switch (c7634n.aa) {
                case FINISHED:
                    if (this.f11102a.f22474w) {
                        this.f11102a.f22468q.mo2309a(c7634n.f23505R, null);
                        return;
                    } else {
                        this.f11102a.m20254a(c7634n);
                        return;
                    }
                case DELETED:
                case NOT_STARTED:
                    if (c7634n.ac == null || c7634n.ac.isEmpty()) {
                        this.f11102a.f22467p.mo2307a(c7634n.f23095W, false);
                        return;
                    } else {
                        this.f11102a.f22467p.mo2307a(c7634n.f23095W, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11102a.f22467p.mo2305a(c7634n.f23095W);
                    return;
                case CANCEL:
                    if (c7634n.ac == null || c7634n.ac.isEmpty()) {
                        this.f11102a.f22467p.mo2307a(c7634n.f23095W, false);
                        return;
                    } else {
                        this.f11102a.f22467p.mo2307a(c7634n.f23095W, true);
                        return;
                    }
                case ERROR:
                    if (c7634n.ac == null || c7634n.ac.isEmpty()) {
                        this.f11102a.f22467p.mo2307a(c7634n.f23095W, false);
                        return;
                    } else {
                        this.f11102a.f22467p.mo2307a(c7634n.f23095W, true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C37717 implements OnClickListener {
        final /* synthetic */ C7499n f11103a;

        C37717(C7499n c7499n) {
            this.f11103a = c7499n;
        }

        public final void onClick(View view) {
            C7634n c7634n = (C7634n) this.f11103a.f16244a;
            if (c7634n.ac == null || c7634n.ac.isEmpty()) {
                int[] iArr = C37672.f11098a;
                c7634n.aa.ordinal();
                this.f11103a.f22468q.mo2309a(c7634n.f23505R, null);
            } else if (c7634n.aa == C2987i.FINISHED) {
                this.f11103a.f22468q.mo2309a(c7634n.f23505R, null);
            }
        }
    }

    class C37728 implements Runnable {
        final /* synthetic */ C7499n f11104a;

        C37728(C7499n c7499n) {
            this.f11104a = c7499n;
        }

        public final void run() {
            this.f11104a.f22465n.setImageResource(R.drawable.ic_video_play);
            this.f11104a.f22465n.setVisibility(0);
        }
    }

    class C61731 implements C1247e<Drawable> {
        final /* synthetic */ C7499n f16690a;

        C61731(C7499n c7499n) {
            this.f16690a = c7499n;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7634n c7634n = (C7634n) this.f16690a.f16244a;
            if (!this.f16690a.f22472u) {
                this.f16690a.f22472u = true;
                if (c7634n.f23503P > 0 && c7634n.f23504Q > 0) {
                    Point b = C2491i.m6807b(this.f16690a.f22469r, c7634n.f23503P, c7634n.f23504Q);
                    this.f16690a.m20251a(b.x, b.y);
                }
            }
            return false;
        }
    }

    class C68973 extends C6222c {
        final /* synthetic */ C7499n f19638a;

        C68973(C7499n c7499n) {
            this.f19638a = c7499n;
        }

        public final void mo2382a(int i, int i2) {
        }

        public final void mo2383a(C4113d c4113d) {
            this.f19638a.c.runOnUiThread(new C37728(this.f19638a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19638a.m20254a(this.f19638a.f22453A);
            }
        }

        public final void mo2384a(C4113d c4113d, int i) {
        }

        public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
            this.f19638a.m20257b();
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
            this.f19638a.c.runOnUiThread(new C37728(this.f19638a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19638a.m20254a(this.f19638a.f22453A);
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
            this.f19638a.c.runOnUiThread(new C37728(this.f19638a));
            C4121n.m8000b();
        }
    }

    public C7499n(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, boolean z, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g, C3289j c3289j) {
        C7350b c7350b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_video_channel_output_list_item : R.layout.chat_video_channel_output_list_item_old, c3280a, c3286g, c3284e);
        c7350b.f22474w = true;
        c7350b.f22454B = true ^ C2535a.m6888a().au();
        c7350b.f22455C = new C61731(c7350b);
        c7350b.c = activity;
        c7350b.f22467p = c3284e;
        c7350b.f22468q = c3283d;
        c7350b.f22473v = c3289j;
        c7350b.f22456e = z;
        c7350b.f22469r = i3;
        c7350b.f22457f = (ImageView) c7350b.itemView.findViewById(R.id.content_imageView);
        c7350b.f22458g = (TextView) c7350b.itemView.findViewById(R.id.video_length_textView);
        c7350b.f22459h = (TextView) c7350b.itemView.findViewById(R.id.video_size_textView);
        c7350b.f22462k = (ImageView) c7350b.itemView.findViewById(R.id.status_imageView);
        c7350b.f22463l = c7350b.itemView.findViewById(R.id.bottom_gradient_view);
        c7350b.f22464m = c7350b.itemView.findViewById(R.id.top_gradient_view);
        c7350b.f22465n = (ImageButton) c7350b.itemView.findViewById(R.id.action_imageView);
        c7350b.f22461j = (TextView) c7350b.itemView.findViewById(R.id.progress_text_action_view);
        c7350b.f22466o = (ProgressWheel) c7350b.itemView.findViewById(R.id.progress_wheel);
        c7350b.f22470s = (RelativeLayout) c7350b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7350b.f22471t = (ImageView) c7350b.itemView.findViewById(R.id.actionDownloadChatFile);
        c7350b.f22475x = (TextureView) c7350b.itemView.findViewById(R.id.textureView1);
        c7350b.f22460i = (ImageButton) c7350b.itemView.findViewById(R.id.action_image_option);
        c7350b.f22476y = (VideoView) c7350b.itemView.findViewById(R.id.video_view);
        c7350b.f22476y.f11710a = new C68973(c7350b);
        c7350b.f22475x.setOnClickListener(new C37684(c7350b));
        c7350b.f22471t.setOnClickListener(new C37695(c7350b));
        m20251a(i3, i2);
        c7350b.f22465n.setOnClickListener(new C37706(c7350b));
        c7350b.f22457f.setOnClickListener(new C37717(c7350b));
    }

    private void m20250a() {
        if (this.f22465n != null) {
            this.f22465n.setVisibility(8);
        }
    }

    private void m20251a(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.f22457f.getLayoutParams();
        layoutParams.height = i2;
        if (this.f22454B) {
            layoutParams.width = i;
        }
        int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        LayoutParams layoutParams2 = (LayoutParams) this.f22463l.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f22454B) {
            layoutParams2.width = i;
        }
        layoutParams2 = (LayoutParams) this.f22464m.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f22454B) {
            layoutParams2.width = i;
        }
        layoutParams = (LayoutParams) this.f22476y.getLayoutParams();
        layoutParams.height = i2;
        if (this.f22454B) {
            layoutParams.width = i;
        }
        layoutParams = (LayoutParams) this.f22475x.getLayoutParams();
        layoutParams.height = i2;
        if (this.f22454B) {
            layoutParams.width = i;
        }
    }

    private void m20254a(C7634n c7634n) {
        this.f22473v.mo2336g(c7634n.f20777c, c7634n.f23505R);
        String str = c7634n.f20777c;
        if (this.f22476y != null) {
            C4113d player = this.f22476y.getPlayer();
            if (!(player == null || player.f11761f)) {
                if (player.isPlaying()) {
                    player.m7967b();
                    if (this.f22465n != null) {
                        this.f22465n.setVisibility(0);
                        m20257b();
                    }
                    C4121n.m8000b();
                    return;
                }
                C4121n.f11799a = str;
                m20250a();
                player.seekTo(0);
                player.start();
            }
        }
    }

    private void m20255a(C7634n c7634n, C2971k c2971k) {
        boolean z = ((c7634n.ac == null || c7634n.ac.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22465n, z);
    }

    private void m20257b() {
        this.c.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C7499n f11097a;

            {
                this.f11097a = r1;
            }

            public final void run() {
                this.f11097a.f22476y.getCoverView().setVisibility(0);
            }
        });
    }

    private void m20260c() {
        if (this.f22460i != null) {
            this.f22460i.setVisibility(8);
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7634n c7634n = (C7634n) c6829g;
        this.f22453A = c7634n;
        Object a = C2613o.m7045a(c7634n.aa, c7634n.ab, c7634n.f23505R, c7634n.f23506S, c7634n.f21300A);
        C1247e c1247e = null;
        this.f22457f.setImageBitmap(null);
        this.f22472u = false;
        if (c7634n.aa == C2987i.FINISHED && this.f22456e) {
            this.f22474w = C2476b.m6722a(c7634n.f23505R);
        }
        Point a2 = this.f22454B ? C2491i.m6763a(this.f22469r, c7634n.f23503P, c7634n.f23504Q) : null;
        C1274i a3;
        if (this.f22474w) {
            this.f22475x.setVisibility(8);
            this.f22476y.setVisibility(8);
            boolean z = c7634n.f23503P > 0 && c7634n.f23504Q > 0;
            C1248f c1248f = new C1248f();
            int i2 = (z && this.f22454B) ? a2.x : this.f22469r;
            int i3 = (z && this.f22454B) ? a2.y : this.f22469r;
            C1248f b = c1248f.m2954b(i2, i3);
            if (!z || this.f22454B) {
                c1247e = this.f22455C;
            }
            a3 = C1212c.m2872a(this.c).m10950a(a).m3034a(b).m3033a();
            a3.f3986c = c1247e;
            a3.m3031a(this.f22457f);
        } else {
            a3 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(new C1248f().m2954b(this.f22454B ? a2.x : this.f22469r, this.f22454B ? a2.y : this.f22469r));
            if (this.f22454B) {
                c1247e = this.f22455C;
            }
            a3.f3986c = c1247e;
            a3.m3031a(this.f22476y.getCoverView());
            this.f22476y.getVideoInfo().f11701e = false;
            this.f22476y.m7923a(c7634n.f23505R).m7922a(c7634n.f20777c);
            this.f22476y.setVisibility(0);
            this.f22475x.setVisibility(0);
            if (C4121n.f11799a.equalsIgnoreCase(c7634n.f20777c)) {
                final int i4 = C4121n.f11800b;
                if (i4 > 0) {
                    this.c.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C7499n f11106b;

                        public final void run() {
                            if (this.f11106b.f22476y != null) {
                                C4113d player = this.f11106b.f22476y.getPlayer();
                                if (player != null && !player.f11761f) {
                                    this.f11106b.m20250a();
                                    player.seekTo(i4);
                                    player.start();
                                }
                            }
                        }
                    });
                }
            } else {
                m20257b();
            }
        }
        this.f22458g.setText(C2491i.m6774a(this.c, (long) c7634n.f23508U, true));
        this.f22459h.setText(c7634n.f23509V);
        switch (c7634n.f21337w) {
            case ERROR:
                imageView = this.f22462k;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22462k;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22462k;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22462k;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        m20260c();
        switch (c7634n.aa) {
            case FINISHED:
                this.f22466o.setVisibility(8);
                this.f22471t.setVisibility(8);
                this.f22461j.setVisibility(8);
                this.f22465n.setImageResource(R.drawable.ic_video_play);
                if (!this.f22474w) {
                    if (this.f22460i != null) {
                        this.f22460i.setVisibility(0);
                    }
                    if (this.f22477z) {
                        this.f22477z = false;
                        m20254a(c7634n);
                        break;
                    }
                }
                this.f22465n.setVisibility(0);
                m20260c();
                break;
                break;
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22466o.setVisibility(8);
                this.f22465n.setVisibility(0);
                this.f22461j.setVisibility(8);
                this.f22471t.setVisibility(8);
                m20255a(c7634n, c7634n.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22466o.setVisibility(0);
                this.f22465n.setVisibility(0);
                this.f22465n.setImageResource(R.drawable.ic_file_stop_download);
                if (c7634n.f23507T > 0) {
                    progressWheel = this.f22466o;
                    f = ((float) c7634n.f23507T) * 0.01f;
                } else {
                    progressWheel = this.f22466o;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22471t.setVisibility(8);
                this.f22477z = true;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7634n, this.f22470s, true);
    }
}
