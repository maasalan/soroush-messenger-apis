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
import mobi.mmdt.ott.view.conversation.p432e.p433a.p438e.C7486n;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7621n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C6222c;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.VideoView;
import mobi.mmdt.ott.view.tools.C4515k;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7486n extends C7349b {
    private C7621n f22292A;
    private boolean f22293B;
    private C1247e<Drawable> f22294C;
    private final boolean f22295e;
    private ImageView f22296f;
    private TextView f22297g;
    private TextView f22298h;
    private ImageButton f22299i;
    private View f22300j;
    private View f22301k;
    private ImageButton f22302l;
    private ProgressWheel f22303m;
    private C3284e f22304n;
    private C3283d f22305o;
    private int f22306p;
    private ImageView f22307q;
    private boolean f22308r;
    private TextView f22309s;
    private RelativeLayout f22310t;
    private C3289j f22311u;
    private boolean f22312v;
    private TextureView f22313w;
    private VideoView f22314x;
    private Uri f22315y;
    private boolean f22316z;

    class C37164 implements OnClickListener {
        final /* synthetic */ C7486n f11003a;

        C37164(C7486n c7486n) {
            this.f11003a = c7486n;
        }

        public final void onClick(View view) {
            C7621n c7621n = (C7621n) this.f11003a.f16244a;
            if (C37152.f11002a[c7621n.ae.ordinal()] == 1) {
                this.f11003a.m20163a(c7621n);
            }
        }
    }

    class C37175 implements OnClickListener {
        final /* synthetic */ C7486n f11004a;

        C37175(C7486n c7486n) {
            this.f11004a = c7486n;
        }

        public final void onClick(View view) {
            this.f11004a.f22304n.mo2331e(((C7621n) this.f11004a.f16244a).f23426S);
        }
    }

    class C37186 implements OnClickListener {
        final /* synthetic */ C7486n f11005a;

        C37186(C7486n c7486n) {
            this.f11005a = c7486n;
        }

        public final void onClick(View view) {
            C7621n c7621n = (C7621n) this.f11005a.f16244a;
            switch (c7621n.ae) {
                case FINISHED:
                    if (this.f11005a.f22312v) {
                        this.f11005a.f22305o.mo2309a(c7621n.f23426S, null);
                        return;
                    } else {
                        this.f11005a.m20163a(c7621n);
                        return;
                    }
                case DELETED:
                case NOT_STARTED:
                    this.f11005a.f22304n.mo2307a(c7621n.f23088W, true);
                    return;
                case TRANSMITTING:
                    this.f11005a.f22304n.mo2305a(c7621n.f23088W);
                    return;
                case CANCEL:
                    this.f11005a.f22304n.mo2307a(c7621n.f23088W, true);
                    return;
                case ERROR:
                    this.f11005a.f22304n.mo2307a(c7621n.f23088W, true);
                    return;
                default:
                    return;
            }
        }
    }

    class C37197 implements OnClickListener {
        final /* synthetic */ C7486n f11006a;

        C37197(C7486n c7486n) {
            this.f11006a = c7486n;
        }

        public final void onClick(View view) {
            C7621n c7621n = (C7621n) this.f11006a.f16244a;
            if (C37152.f11002a[c7621n.ae.ordinal()] == 1) {
                this.f11006a.f22305o.mo2309a(c7621n.f23426S, null);
            }
        }
    }

    class C37208 implements Runnable {
        final /* synthetic */ C7486n f11007a;

        C37208(C7486n c7486n) {
            this.f11007a = c7486n;
        }

        public final void run() {
            this.f11007a.f22302l.setImageResource(R.drawable.ic_video_play);
            this.f11007a.f22302l.setVisibility(0);
        }
    }

    class C61661 implements C1247e<Drawable> {
        final /* synthetic */ C7486n f16675a;

        C61661(C7486n c7486n) {
            this.f16675a = c7486n;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7621n c7621n = (C7621n) this.f16675a.f16244a;
            if (!this.f16675a.f22308r) {
                this.f16675a.f22308r = true;
                if (c7621n.f23424Q > 0 && c7621n.f23425R > 0) {
                    Point b = C2491i.m6807b(this.f16675a.f22306p, c7621n.f23424Q, c7621n.f23425R);
                    this.f16675a.m20160a(b.x, b.y);
                }
            }
            return false;
        }
    }

    class C68953 extends C6222c {
        final /* synthetic */ C7486n f19636a;

        C68953(C7486n c7486n) {
            this.f19636a = c7486n;
        }

        public final void mo2382a(int i, int i2) {
        }

        public final void mo2383a(C4113d c4113d) {
            this.f19636a.c.runOnUiThread(new C37208(this.f19636a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19636a.m20163a(this.f19636a.f22292A);
            }
        }

        public final void mo2384a(C4113d c4113d, int i) {
        }

        public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
            this.f19636a.m20165b();
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
            this.f19636a.c.runOnUiThread(new C37208(this.f19636a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19636a.m20163a(this.f19636a.f22292A);
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
            this.f19636a.c.runOnUiThread(new C37208(this.f19636a));
            C4121n.m8000b();
        }
    }

    public C7486n(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, boolean z, C3284e c3284e, C3280a c3280a, C3283d c3283d, C3286g c3286g, C3289j c3289j) {
        C7349b c7349b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_video_channel_reply_input_list_item : R.layout.chat_video_channel_reply_input_list_item_old, c3280a, c3286g, c3284e);
        c7349b.f22312v = true;
        c7349b.f22293B = true ^ C2535a.m6888a().au();
        c7349b.f22294C = new C61661(c7349b);
        c7349b.f22304n = c3284e;
        c7349b.f22305o = c3283d;
        c7349b.f22311u = c3289j;
        c7349b.f22295e = z;
        c7349b.f22306p = i3;
        c7349b.f22296f = (ImageView) c7349b.itemView.findViewById(R.id.content_imageView);
        c7349b.f22297g = (TextView) c7349b.itemView.findViewById(R.id.video_length_textView);
        c7349b.f22298h = (TextView) c7349b.itemView.findViewById(R.id.video_size_textView);
        c7349b.f22300j = c7349b.itemView.findViewById(R.id.bottom_gradient_view);
        c7349b.f22301k = c7349b.itemView.findViewById(R.id.top_gradient_view);
        c7349b.f22302l = (ImageButton) c7349b.itemView.findViewById(R.id.action_imageView);
        c7349b.f22303m = (ProgressWheel) c7349b.itemView.findViewById(R.id.progress_wheel);
        c7349b.f22310t = (RelativeLayout) c7349b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7349b.f22307q = (ImageView) c7349b.itemView.findViewById(R.id.actionDownloadChatFile);
        c7349b.f22309s = (TextView) c7349b.itemView.findViewById(R.id.progress_text_action_view);
        c7349b.f22313w = (TextureView) c7349b.itemView.findViewById(R.id.textureView1);
        c7349b.f22299i = (ImageButton) c7349b.itemView.findViewById(R.id.action_image_option);
        c7349b.f22314x = (VideoView) c7349b.itemView.findViewById(R.id.video_view);
        c7349b.f22314x.f11710a = new C68953(c7349b);
        c7349b.f22313w.setOnClickListener(new C37164(c7349b));
        c7349b.f22307q.setOnClickListener(new C37175(c7349b));
        m20160a(i3, i2);
        c7349b.f22302l.setOnClickListener(new C37186(c7349b));
        c7349b.f22296f.setOnClickListener(new C37197(c7349b));
    }

    private void m20159a() {
        if (this.f22302l != null) {
            this.f22302l.setVisibility(8);
        }
    }

    private void m20160a(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.f22296f.getLayoutParams();
        layoutParams.height = i2;
        if (this.f22293B) {
            layoutParams.width = i;
        }
        int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        LayoutParams layoutParams2 = (LayoutParams) this.f22300j.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f22293B) {
            layoutParams2.width = i;
        }
        layoutParams2 = (LayoutParams) this.f22301k.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f22293B) {
            layoutParams2.width = i;
        }
        layoutParams = (LayoutParams) this.f22314x.getLayoutParams();
        layoutParams.height = i2;
        if (this.f22293B) {
            layoutParams.width = i;
        }
        layoutParams = (LayoutParams) this.f22313w.getLayoutParams();
        layoutParams.height = i2;
        if (this.f22293B) {
            layoutParams.width = i;
        }
    }

    private void m20163a(C7621n c7621n) {
        this.f22311u.mo2336g(c7621n.f20777c, c7621n.f23426S);
        String str = c7621n.f20777c;
        if (this.f22314x != null) {
            C4113d player = this.f22314x.getPlayer();
            if (!(player == null || player.f11761f)) {
                if (player.isPlaying()) {
                    player.m7967b();
                    if (this.f22302l != null) {
                        this.f22302l.setVisibility(0);
                        m20165b();
                    }
                    C4121n.m8000b();
                    return;
                }
                C4121n.f11799a = str;
                m20159a();
                player.seekTo(0);
                player.start();
            }
        }
    }

    private void m20165b() {
        this.c.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C7486n f11001a;

            {
                this.f11001a = r1;
            }

            public final void run() {
                this.f11001a.f22314x.getCoverView().setVisibility(0);
            }
        });
    }

    private void m20168c() {
        if (this.f22299i != null) {
            this.f22299i.setVisibility(8);
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7621n c7621n = (C7621n) c6829g;
        this.f22292A = c7621n;
        Object a = C2613o.m7045a(c7621n.ae, c7621n.af, c7621n.f23426S, c7621n.f23427T, c7621n.f21300A);
        this.f22308r = false;
        if (c7621n.ae == C2987i.FINISHED && this.f22295e) {
            this.f22312v = C2476b.m6722a(c7621n.f23426S);
        }
        C5255m a2 = C4515k.m8230a(c7621n.ae, c7621n.f23426S);
        C1247e c1247e = null;
        C1248f b;
        C1274i a3;
        Point a4;
        if (this.f22312v) {
            this.f22313w.setVisibility(8);
            this.f22314x.setVisibility(8);
            if (this.f22315y == null || !this.f22315y.equals(a)) {
                this.f22296f.setVisibility(0);
                this.f22296f.setImageBitmap(null);
                if (c7621n.f23424Q <= 0 || c7621n.f23425R <= 0) {
                    b = new C1248f().m2954b(this.f22306p, this.f22306p);
                    if (a2 != null) {
                        b.m2951a(a2);
                    }
                    a3 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                    a3.f3986c = this.f22294C;
                    a3 = a3.m3034a(b);
                } else {
                    a4 = this.f22293B ? C2491i.m6763a(this.f22306p, c7621n.f23424Q, c7621n.f23425R) : null;
                    b = new C1248f().m2954b(this.f22293B ? a4.x : this.f22306p, this.f22293B ? a4.y : this.f22306p);
                    if (a2 != null) {
                        b.m2951a(a2);
                    }
                    a3 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(b);
                    if (this.f22293B) {
                        c1247e = this.f22294C;
                    }
                    a3.f3986c = c1247e;
                }
                a3.m3031a(this.f22296f);
            }
        } else {
            if (this.f22315y == null || !this.f22315y.equals(a)) {
                this.f22296f.setImageBitmap(null);
                this.f22296f.setVisibility(8);
                a4 = this.f22293B ? C2491i.m6763a(this.f22306p, c7621n.f23424Q, c7621n.f23425R) : null;
                b = new C1248f().m2954b(this.f22293B ? a4.x : this.f22306p, this.f22293B ? a4.y : this.f22306p);
                if (a2 != null) {
                    b.m2951a(a2);
                }
                a3 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(b);
                if (this.f22293B) {
                    c1247e = this.f22294C;
                }
                a3.f3986c = c1247e;
                a3.m3031a(this.f22314x.getCoverView());
            }
            this.f22314x.getVideoInfo().f11701e = false;
            this.f22314x.m7923a(c7621n.f23426S).m7922a(c7621n.f20777c);
            this.f22314x.setVisibility(0);
            this.f22313w.setVisibility(0);
            if (C4121n.f11799a.equalsIgnoreCase(c7621n.f20777c)) {
                final int i = C4121n.f11800b;
                if (i > 0) {
                    this.c.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C7486n f11009b;

                        public final void run() {
                            if (this.f11009b.f22314x != null) {
                                C4113d player = this.f11009b.f22314x.getPlayer();
                                if (player != null && !player.f11761f) {
                                    this.f11009b.m20159a();
                                    player.seekTo(i);
                                    player.start();
                                }
                            }
                        }
                    });
                }
            } else {
                m20165b();
            }
        }
        this.f22315y = a;
        this.f22297g.setText(C2491i.m6774a(this.c, (long) c7621n.ac, true));
        this.f22298h.setText(c7621n.ad);
        m20168c();
        switch (c7621n.ae) {
            case FINISHED:
                this.f22303m.setVisibility(8);
                this.f22307q.setVisibility(8);
                this.f22309s.setVisibility(8);
                this.f22302l.setImageResource(R.drawable.ic_video_play);
                if (!this.f22312v) {
                    if (this.f22299i != null) {
                        this.f22299i.setVisibility(0);
                    }
                    if (this.f22316z) {
                        this.f22316z = false;
                        m20163a(c7621n);
                        break;
                    }
                }
                this.f22302l.setVisibility(0);
                m20168c();
                break;
                break;
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22303m.setVisibility(8);
                this.f22302l.setVisibility(0);
                this.f22302l.setImageResource(R.drawable.ic_file_start_download);
                this.f22307q.setVisibility(8);
                this.f22309s.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22303m.setVisibility(0);
                this.f22302l.setVisibility(0);
                this.f22302l.setImageResource(R.drawable.ic_file_stop_download);
                this.f22309s.setVisibility(0);
                this.f22309s.setText(c7621n.f23423P);
                if (c7621n.f23428U > 0) {
                    progressWheel = this.f22303m;
                    f = ((float) c7621n.f23428U) * 0.01f;
                } else {
                    progressWheel = this.f22303m;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22307q.setVisibility(8);
                this.f22316z = true;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7621n, this.f22310t, false);
    }
}
