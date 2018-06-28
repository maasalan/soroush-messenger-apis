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
import android.widget.LinearLayout;
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
import mobi.mmdt.ott.view.conversation.p432e.p433a.p442i.C7538n;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7673n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C6222c;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.VideoView;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7538n extends C7353b {
    private C1247e<Drawable> f22901A = new C61941(this);
    private final boolean f22902d;
    private TextView f22903e;
    private ImageView f22904f;
    private TextView f22905g;
    private TextView f22906h;
    private ImageButton f22907i;
    private View f22908j;
    private View f22909k;
    private ImageButton f22910l;
    private ProgressWheel f22911m;
    private C3284e f22912n;
    private C3283d f22913o;
    private int f22914p;
    private LinearLayout f22915q;
    private ImageView f22916r;
    private boolean f22917s;
    private C3289j f22918t;
    private boolean f22919u = true;
    private TextureView f22920v;
    private VideoView f22921w;
    private Uri f22922x;
    private boolean f22923y;
    private C7673n f22924z;

    class C39234 implements OnClickListener {
        final /* synthetic */ C7538n f11376a;

        C39234(C7538n c7538n) {
            this.f11376a = c7538n;
        }

        public final void onClick(View view) {
            C7673n c7673n = (C7673n) this.f11376a.f16244a;
            if (C39222.f11375a[c7673n.aa.ordinal()] == 1) {
                this.f11376a.m20536a(c7673n);
            }
        }
    }

    class C39245 implements OnClickListener {
        final /* synthetic */ C7538n f11377a;

        C39245(C7538n c7538n) {
            this.f11377a = c7538n;
        }

        public final void onClick(View view) {
            this.f11377a.f22912n.mo2331e(((C7673n) this.f11377a.f16244a).f23764S);
        }
    }

    class C39256 implements OnClickListener {
        final /* synthetic */ C7538n f11378a;

        C39256(C7538n c7538n) {
            this.f11378a = c7538n;
        }

        public final void onClick(View view) {
            C7673n c7673n = (C7673n) this.f11378a.f16244a;
            switch (c7673n.aa) {
                case FINISHED:
                    if (this.f11378a.f22919u) {
                        this.f11378a.f22913o.mo2309a(c7673n.f23764S, null);
                        return;
                    } else {
                        this.f11378a.m20536a(c7673n);
                        return;
                    }
                case DELETED:
                case NOT_STARTED:
                    this.f11378a.f22912n.mo2307a(c7673n.mo3604b(), true);
                    return;
                case TRANSMITTING:
                    this.f11378a.f22912n.mo2305a(c7673n.mo3604b());
                    return;
                case CANCEL:
                    this.f11378a.f22912n.mo2307a(c7673n.mo3604b(), true);
                    return;
                case ERROR:
                    this.f11378a.f22912n.mo2307a(c7673n.mo3604b(), true);
                    return;
                default:
                    return;
            }
        }
    }

    class C39267 implements OnClickListener {
        final /* synthetic */ C7538n f11379a;

        C39267(C7538n c7538n) {
            this.f11379a = c7538n;
        }

        public final void onClick(View view) {
            C7673n c7673n = (C7673n) this.f11379a.f16244a;
            if (C39222.f11375a[c7673n.aa.ordinal()] == 1) {
                this.f11379a.f22913o.mo2309a(c7673n.f23764S, null);
            }
        }
    }

    class C39278 implements Runnable {
        final /* synthetic */ C7538n f11380a;

        C39278(C7538n c7538n) {
            this.f11380a = c7538n;
        }

        public final void run() {
            this.f11380a.f22910l.setImageResource(R.drawable.ic_video_play);
            this.f11380a.f22910l.setVisibility(0);
        }
    }

    class C61941 implements C1247e<Drawable> {
        final /* synthetic */ C7538n f16735a;

        C61941(C7538n c7538n) {
            this.f16735a = c7538n;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7673n c7673n = (C7673n) this.f16735a.f16244a;
            if (!this.f16735a.f22917s) {
                this.f16735a.f22917s = true;
                if (c7673n.f23762Q > 0 && c7673n.f23763R > 0) {
                    Point b = C2491i.m6807b(this.f16735a.f22914p, c7673n.f23762Q, c7673n.f23763R);
                    LayoutParams layoutParams = (LayoutParams) this.f16735a.f22904f.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                    int dimension = (int) this.f16735a.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
                    LayoutParams layoutParams2 = (LayoutParams) this.f16735a.f22908j.getLayoutParams();
                    layoutParams2.height = dimension;
                    layoutParams2.width = b.x;
                    layoutParams2 = (LayoutParams) this.f16735a.f22909k.getLayoutParams();
                    layoutParams2.height = dimension;
                    layoutParams2.width = b.x;
                    layoutParams = (LayoutParams) this.f16735a.f22921w.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                    layoutParams = (LayoutParams) this.f16735a.f22920v.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                }
            }
            return false;
        }
    }

    class C69053 extends C6222c {
        final /* synthetic */ C7538n f19650a;

        C69053(C7538n c7538n) {
            this.f19650a = c7538n;
        }

        public final void mo2382a(int i, int i2) {
        }

        public final void mo2383a(C4113d c4113d) {
            this.f19650a.c.runOnUiThread(new C39278(this.f19650a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19650a.m20536a(this.f19650a.f22924z);
            }
        }

        public final void mo2384a(C4113d c4113d, int i) {
        }

        public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
            this.f19650a.m20538b();
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
            this.f19650a.c.runOnUiThread(new C39278(this.f19650a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19650a.m20536a(this.f19650a.f22924z);
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
            this.f19650a.c.runOnUiThread(new C39278(this.f19650a));
            C4121n.m8000b();
        }
    }

    public C7538n(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, boolean z, C3284e c3284e, C3283d c3283d, C3286g c3286g, C3289j c3289j) {
        int i3 = i;
        int i4 = i2;
        super(activity, layoutInflater, viewGroup, R.layout.chat_video_input_list_item, c3286g, c3284e);
        this.c = activity;
        this.f22912n = c3284e;
        this.f22913o = c3283d;
        this.f22918t = c3289j;
        this.f22902d = z;
        this.f22914p = i3;
        this.f22904f = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f22905g = (TextView) this.itemView.findViewById(R.id.video_length_textView);
        this.f22906h = (TextView) this.itemView.findViewById(R.id.video_size_textView);
        this.f22908j = this.itemView.findViewById(R.id.bottom_gradient_view);
        this.f22909k = this.itemView.findViewById(R.id.top_gradient_view);
        this.f22903e = (TextView) this.itemView.findViewById(R.id.progress_text_action_view);
        this.f22910l = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22911m = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f22915q = (LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f22916r = (ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile);
        this.f22920v = (TextureView) this.itemView.findViewById(R.id.textureView1);
        this.f22907i = (ImageButton) this.itemView.findViewById(R.id.action_image_option);
        this.f22921w = (VideoView) this.itemView.findViewById(R.id.video_view);
        this.f22921w.f11710a = new C69053(this);
        this.f22920v.setOnClickListener(new C39234(this));
        this.f22916r.setOnClickListener(new C39245(this));
        LayoutParams layoutParams = (LayoutParams) this.f22904f.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        layoutParams = (LayoutParams) this.f22921w.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        layoutParams = (LayoutParams) this.f22920v.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        LayoutParams layoutParams2 = (LayoutParams) this.f22908j.getLayoutParams();
        layoutParams2.height = dimension;
        layoutParams2.width = i3;
        layoutParams2 = (LayoutParams) this.f22909k.getLayoutParams();
        layoutParams2.height = dimension;
        layoutParams2.width = i3;
        this.f22910l.setOnClickListener(new C39256(this));
        this.f22904f.setOnClickListener(new C39267(this));
    }

    private void m20534a() {
        if (this.f22910l != null) {
            this.f22910l.setVisibility(8);
        }
    }

    private void m20536a(C7673n c7673n) {
        this.f22918t.mo2336g(c7673n.f20777c, c7673n.f23764S);
        String str = c7673n.f20777c;
        if (this.f22921w != null) {
            C4113d player = this.f22921w.getPlayer();
            if (!(player == null || player.f11761f)) {
                if (player.isPlaying()) {
                    player.m7967b();
                    if (this.f22910l != null) {
                        this.f22910l.setVisibility(0);
                        m20538b();
                    }
                    C4121n.m8000b();
                    return;
                }
                C4121n.f11799a = str;
                m20534a();
                player.seekTo(0);
                player.start();
            }
        }
    }

    private void m20538b() {
        this.c.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C7538n f11374a;

            {
                this.f11374a = r1;
            }

            public final void run() {
                this.f11374a.f22921w.getCoverView().setVisibility(0);
            }
        });
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7673n c7673n = (C7673n) c6829g;
        this.f22924z = c7673n;
        Object a = C2613o.m7045a(c7673n.aa, c7673n.ab, c7673n.f23764S, c7673n.f23765T, c7673n.f21300A);
        this.f22917s = false;
        if (c7673n.aa == C2987i.FINISHED && this.f22902d) {
            this.f22919u = C2476b.m6722a(c7673n.f23764S);
        }
        Point a2;
        C1274i a3;
        C1274i a4;
        C1248f a5;
        if (this.f22919u) {
            this.f22920v.setVisibility(8);
            this.f22921w.setVisibility(8);
            if (this.f22922x == null || !this.f22922x.equals(a)) {
                this.f22904f.setImageBitmap(null);
                this.f22904f.setVisibility(0);
                a2 = C2491i.m6763a(this.f22914p, c7673n.f23762Q, c7673n.f23763R);
                if (c7673n.f23762Q <= 0 || c7673n.f23763R <= 0) {
                    C1248f a6;
                    if (c7673n.aa != C2987i.FINISHED || c7673n.f23764S == null) {
                        a3 = C1212c.m2872a(this.c).m10950a(a);
                        a6 = new C1248f().m2954b(this.f22914p, this.f22914p).m2951a(new C7156b(10));
                    } else {
                        a3 = C1212c.m2872a(this.c).m10950a(a);
                        a6 = new C1248f().m2954b(this.f22914p, this.f22914p);
                    }
                    a3 = a3.m3034a(a6).m3033a();
                    a3.f3986c = this.f22901A;
                } else {
                    if (c7673n.aa != C2987i.FINISHED || c7673n.f23764S == null) {
                        a4 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                        a5 = new C1248f().m2954b(a2.x, a2.y).m2951a(new C7156b(10));
                    } else {
                        a4 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                        a5 = new C1248f().m2954b(a2.x, a2.y);
                    }
                    a3 = a4.m3034a(a5);
                }
                a3.m3031a(this.f22904f);
            }
        } else {
            a2 = C2491i.m6763a(this.f22914p, c7673n.f23762Q, c7673n.f23763R);
            if (this.f22922x == null || !this.f22922x.equals(a)) {
                this.f22904f.setImageBitmap(null);
                this.f22904f.setVisibility(8);
                if (c7673n.aa != C2987i.FINISHED || c7673n.f23764S == null) {
                    a4 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                    a5 = new C1248f().m2954b(a2.x, a2.y).m2951a(new C7156b(10));
                } else {
                    a4 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                    a5 = new C1248f().m2954b(a2.x, a2.y);
                }
                a3 = a4.m3034a(a5);
                a3.f3986c = this.f22901A;
                a3.m3031a(this.f22921w.getCoverView());
            }
            this.f22921w.getVideoInfo().f11701e = false;
            this.f22921w.m7923a(c7673n.f23764S).m7922a(c7673n.f20777c);
            this.f22921w.setVisibility(0);
            this.f22920v.setVisibility(0);
            if (C4121n.f11799a.equalsIgnoreCase(c7673n.f20777c)) {
                final int i = C4121n.f11800b;
                if (i > 0) {
                    this.c.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C7538n f11382b;

                        public final void run() {
                            if (this.f11382b.f22921w != null) {
                                C4113d player = this.f11382b.f22921w.getPlayer();
                                if (player != null && !player.f11761f) {
                                    this.f11382b.m20534a();
                                    player.seekTo(i);
                                    player.start();
                                }
                            }
                        }
                    });
                }
            } else {
                m20538b();
            }
        }
        this.f22922x = a;
        this.f22905g.setText(C2491i.m6774a(this.c, (long) c7673n.f23767Y, true));
        this.f22906h.setText(c7673n.f23768Z);
        this.f22907i.setVisibility(8);
        switch (c7673n.aa) {
            case FINISHED:
                this.f22911m.setVisibility(8);
                this.f22916r.setVisibility(8);
                this.f22903e.setVisibility(8);
                this.f22910l.setImageResource(R.drawable.ic_video_play);
                if (!this.f22919u) {
                    this.f22907i.setVisibility(0);
                    if (this.f22923y) {
                        this.f22923y = false;
                        m20536a(c7673n);
                        break;
                    }
                }
                this.f22910l.setVisibility(0);
                this.f22907i.setVisibility(8);
                break;
                break;
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22911m.setVisibility(8);
                this.f22910l.setVisibility(0);
                this.f22910l.setImageResource(R.drawable.ic_file_start_download);
                this.f22916r.setVisibility(8);
                this.f22903e.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22911m.setVisibility(0);
                this.f22910l.setVisibility(0);
                this.f22910l.setImageResource(R.drawable.ic_file_stop_download);
                this.f22903e.setVisibility(0);
                this.f22903e.setText(c7673n.f23761P);
                if (c7673n.f23766U > 0) {
                    progressWheel = this.f22911m;
                    f = ((float) c7673n.f23766U) * 0.01f;
                } else {
                    progressWheel = this.f22911m;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22916r.setVisibility(8);
                this.f22923y = true;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7673n, this.f22915q, false);
    }
}
