package mobi.mmdt.ott.view.conversation.p432e.p433a.p437d;

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
import mobi.mmdt.ott.view.conversation.p432e.p433a.p437d.C7473n;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7608n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C6222c;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.VideoView;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7473n extends C7348b {
    private C7608n f22138A;
    private boolean f22139B;
    private C1247e<Drawable> f22140C;
    private final boolean f22141e;
    private ImageView f22142f;
    private TextView f22143g;
    private TextView f22144h;
    private ImageButton f22145i;
    private TextView f22146j;
    private ImageView f22147k;
    private View f22148l;
    private View f22149m;
    private ImageButton f22150n;
    private ProgressWheel f22151o;
    private C3284e f22152p;
    private C3283d f22153q;
    private int f22154r;
    private View f22155s;
    private ImageView f22156t;
    private boolean f22157u;
    private C3289j f22158v;
    private boolean f22159w;
    private TextureView f22160x;
    private VideoView f22161y;
    private boolean f22162z;

    class C36624 implements OnClickListener {
        final /* synthetic */ C7473n f10909a;

        C36624(C7473n c7473n) {
            this.f10909a = c7473n;
        }

        public final void onClick(View view) {
            C7608n c7608n = (C7608n) this.f10909a.f16244a;
            if (C36612.f10907a[c7608n.f23356X.ordinal()] == 1) {
                this.f10909a.m20077a(c7608n);
            }
        }
    }

    class C36635 implements OnClickListener {
        final /* synthetic */ C7473n f10910a;

        C36635(C7473n c7473n) {
            this.f10910a = c7473n;
        }

        public final void onClick(View view) {
            this.f10910a.f22152p.mo2331e(((C7608n) this.f10910a.f16244a).f23351S);
        }
    }

    class C36646 implements OnClickListener {
        final /* synthetic */ C7473n f10911a;

        C36646(C7473n c7473n) {
            this.f10911a = c7473n;
        }

        public final void onClick(View view) {
            C7608n c7608n = (C7608n) this.f10911a.f16244a;
            switch (c7608n.f23356X) {
                case FINISHED:
                    if (this.f10911a.f22159w) {
                        this.f10911a.f22153q.mo2309a(c7608n.f23351S, null);
                        return;
                    } else {
                        this.f10911a.m20077a(c7608n);
                        return;
                    }
                case DELETED:
                case NOT_STARTED:
                    if (c7608n.f23358Z == null || c7608n.f23358Z.isEmpty()) {
                        this.f10911a.f22152p.mo2307a(c7608n.ac, false);
                        return;
                    } else {
                        this.f10911a.f22152p.mo2307a(c7608n.ac, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f10911a.f22152p.mo2305a(c7608n.ac);
                    return;
                case CANCEL:
                    if (c7608n.f23358Z == null || c7608n.f23358Z.isEmpty()) {
                        this.f10911a.f22152p.mo2307a(c7608n.ac, false);
                        return;
                    } else {
                        this.f10911a.f22152p.mo2307a(c7608n.ac, true);
                        return;
                    }
                case ERROR:
                    if (c7608n.f23358Z == null || c7608n.f23358Z.isEmpty()) {
                        this.f10911a.f22152p.mo2307a(c7608n.ac, false);
                        return;
                    } else {
                        this.f10911a.f22152p.mo2307a(c7608n.ac, true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C36657 implements OnClickListener {
        final /* synthetic */ C7473n f10912a;

        C36657(C7473n c7473n) {
            this.f10912a = c7473n;
        }

        public final void onClick(View view) {
            C7608n c7608n = (C7608n) this.f10912a.f16244a;
            if (c7608n.f23358Z == null || c7608n.f23358Z.isEmpty()) {
                int[] iArr = C36612.f10907a;
                c7608n.f23356X.ordinal();
                this.f10912a.f22153q.mo2309a(c7608n.f23351S, null);
            } else if (c7608n.f23356X == C2987i.FINISHED) {
                this.f10912a.f22153q.mo2309a(c7608n.f23351S, null);
            }
        }
    }

    class C36668 implements Runnable {
        final /* synthetic */ C7473n f10913a;

        C36668(C7473n c7473n) {
            this.f10913a = c7473n;
        }

        public final void run() {
            this.f10913a.f22150n.setImageResource(R.drawable.ic_video_play);
            this.f10913a.f22150n.setVisibility(0);
        }
    }

    class C61591 implements C1247e<Drawable> {
        final /* synthetic */ C7473n f16660a;

        C61591(C7473n c7473n) {
            this.f16660a = c7473n;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7608n c7608n = (C7608n) this.f16660a.f16244a;
            if (!this.f16660a.f22157u) {
                this.f16660a.f22157u = true;
                if (c7608n.f23349Q > 0 && c7608n.f23350R > 0) {
                    Point b = C2491i.m6807b(this.f16660a.f22154r, c7608n.f23349Q, c7608n.f23350R);
                    this.f16660a.m20074a(b.x, b.y);
                }
            }
            return false;
        }
    }

    class C68923 extends C6222c {
        final /* synthetic */ C7473n f19631a;

        C68923(C7473n c7473n) {
            this.f19631a = c7473n;
        }

        public final void mo2382a(int i, int i2) {
        }

        public final void mo2383a(C4113d c4113d) {
            this.f19631a.c.runOnUiThread(new C36668(this.f19631a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19631a.m20077a(this.f19631a.f22138A);
            }
        }

        public final void mo2384a(C4113d c4113d, int i) {
        }

        public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
            this.f19631a.m20080b();
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
            this.f19631a.c.runOnUiThread(new C36668(this.f19631a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19631a.m20077a(this.f19631a.f22138A);
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
            this.f19631a.c.runOnUiThread(new C36668(this.f19631a));
            C4121n.m8000b();
        }
    }

    public C7473n(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, boolean z, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g, C3289j c3289j) {
        C7348b c7348b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_video_channel_output_list_item : R.layout.chat_video_channel_output_list_item_old, c3280a, c3286g, c3284e);
        c7348b.f22159w = true;
        c7348b.f22139B = true ^ C2535a.m6888a().au();
        c7348b.f22140C = new C61591(c7348b);
        c7348b.c = activity;
        c7348b.f22152p = c3284e;
        c7348b.f22153q = c3283d;
        c7348b.f22158v = c3289j;
        c7348b.f22141e = z;
        c7348b.f22154r = i3;
        c7348b.f22142f = (ImageView) c7348b.itemView.findViewById(R.id.content_imageView);
        c7348b.f22143g = (TextView) c7348b.itemView.findViewById(R.id.video_length_textView);
        c7348b.f22144h = (TextView) c7348b.itemView.findViewById(R.id.video_size_textView);
        c7348b.f22147k = (ImageView) c7348b.itemView.findViewById(R.id.status_imageView);
        c7348b.f22148l = c7348b.itemView.findViewById(R.id.bottom_gradient_view);
        c7348b.f22149m = c7348b.itemView.findViewById(R.id.top_gradient_view);
        c7348b.f22146j = (TextView) c7348b.itemView.findViewById(R.id.progress_text_action_view);
        c7348b.f22150n = (ImageButton) c7348b.itemView.findViewById(R.id.action_imageView);
        c7348b.f22151o = (ProgressWheel) c7348b.itemView.findViewById(R.id.progress_wheel);
        c7348b.f22155s = c7348b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7348b.f22156t = (ImageView) c7348b.itemView.findViewById(R.id.actionDownloadChatFile);
        c7348b.f22160x = (TextureView) c7348b.itemView.findViewById(R.id.textureView1);
        c7348b.f22145i = (ImageButton) c7348b.itemView.findViewById(R.id.action_image_option);
        c7348b.f22161y = (VideoView) c7348b.itemView.findViewById(R.id.video_view);
        c7348b.f22161y.f11710a = new C68923(c7348b);
        c7348b.f22160x.setOnClickListener(new C36624(c7348b));
        c7348b.f22156t.setOnClickListener(new C36635(c7348b));
        m20074a(i3, i2);
        c7348b.f22150n.setOnClickListener(new C36646(c7348b));
        c7348b.f22142f.setOnClickListener(new C36657(c7348b));
    }

    private void m20073a() {
        if (this.f22150n != null) {
            this.f22150n.setVisibility(8);
        }
    }

    private void m20074a(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.f22142f.getLayoutParams();
        layoutParams.height = i2;
        if (this.f22139B) {
            layoutParams.width = i;
        }
        int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        LayoutParams layoutParams2 = (LayoutParams) this.f22148l.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f22139B) {
            layoutParams2.width = i;
        }
        layoutParams2 = (LayoutParams) this.f22149m.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f22139B) {
            layoutParams2.width = i;
        }
        layoutParams = (LayoutParams) this.f22161y.getLayoutParams();
        layoutParams.height = i2;
        if (this.f22139B) {
            layoutParams.width = i;
        }
        layoutParams = (LayoutParams) this.f22160x.getLayoutParams();
        layoutParams.height = i2;
        if (this.f22139B) {
            layoutParams.width = i;
        }
    }

    private void m20077a(C7608n c7608n) {
        this.f22158v.mo2336g(c7608n.f20777c, c7608n.f23351S);
        String str = c7608n.f20777c;
        if (this.f22161y != null) {
            C4113d player = this.f22161y.getPlayer();
            if (!(player == null || player.f11761f)) {
                if (player.isPlaying()) {
                    player.m7967b();
                    if (this.f22150n != null) {
                        this.f22150n.setVisibility(0);
                        m20080b();
                    }
                    C4121n.m8000b();
                    return;
                }
                C4121n.f11799a = str;
                m20073a();
                player.seekTo(0);
                player.start();
            }
        }
    }

    private void m20078a(C7608n c7608n, C2971k c2971k) {
        boolean z = ((c7608n.f23358Z == null || c7608n.f23358Z.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22150n, z);
    }

    private void m20080b() {
        this.c.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C7473n f10906a;

            {
                this.f10906a = r1;
            }

            public final void run() {
                this.f10906a.f22161y.getCoverView().setVisibility(0);
            }
        });
    }

    private void m20083c() {
        if (this.f22145i != null) {
            this.f22145i.setVisibility(8);
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        int i;
        ImageView imageView;
        super.mo3180a(c6829g);
        C7608n c7608n = (C7608n) c6829g;
        this.f22138A = c7608n;
        Object a = C2613o.m7045a(c7608n.f23356X, c7608n.f23357Y, c7608n.f23351S, c7608n.f23352T, c7608n.f21300A);
        this.f22157u = false;
        C1247e c1247e = null;
        this.f22142f.setImageBitmap(null);
        if (c7608n.f23356X == C2987i.FINISHED && this.f22141e) {
            this.f22159w = C2476b.m6722a(c7608n.f23351S);
        }
        Point a2 = this.f22139B ? C2491i.m6763a(this.f22154r, c7608n.f23349Q, c7608n.f23350R) : null;
        C1274i a3;
        if (this.f22159w) {
            this.f22160x.setVisibility(8);
            this.f22161y.setVisibility(8);
            boolean z = c7608n.f23349Q > 0 && c7608n.f23350R > 0;
            C1248f c1248f = new C1248f();
            int i2 = (z && this.f22139B) ? a2.x : this.f22154r;
            i = (z && this.f22139B) ? a2.y : this.f22154r;
            C1248f b = c1248f.m2954b(i2, i);
            if (!z || this.f22139B) {
                c1247e = this.f22140C;
            }
            a3 = C1212c.m2872a(this.c).m10950a(a).m3034a(b).m3033a();
            a3.f3986c = c1247e;
            a3.m3031a(this.f22142f);
        } else {
            a3 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(new C1248f().m2954b(this.f22139B ? a2.x : this.f22154r, this.f22139B ? a2.y : this.f22154r));
            if (this.f22139B) {
                c1247e = this.f22140C;
            }
            a3.f3986c = c1247e;
            a3.m3031a(this.f22161y.getCoverView());
            this.f22161y.getVideoInfo().f11701e = false;
            this.f22161y.m7923a(c7608n.f23351S).m7922a(c7608n.f20777c);
            this.f22161y.setVisibility(0);
            this.f22160x.setVisibility(0);
            if (C4121n.f11799a.equalsIgnoreCase(c7608n.f20777c)) {
                final int i3 = C4121n.f11800b;
                if (i3 > 0) {
                    this.c.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C7473n f10915b;

                        public final void run() {
                            if (this.f10915b.f22161y != null) {
                                C4113d player = this.f10915b.f22161y.getPlayer();
                                if (player != null && !player.f11761f) {
                                    this.f10915b.m20073a();
                                    player.seekTo(i3);
                                    player.start();
                                }
                            }
                        }
                    });
                }
            } else {
                m20080b();
            }
        }
        this.f22143g.setText(C2491i.m6774a(this.c, (long) c7608n.f23354V, true));
        this.f22144h.setText(c7608n.f23355W);
        switch (c7608n.f21337w) {
            case ERROR:
                imageView = this.f22147k;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22147k;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22147k;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22147k;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        m20083c();
        switch (c7608n.f23356X) {
            case FINISHED:
                this.f22151o.setVisibility(8);
                this.f22156t.setVisibility(8);
                this.f22146j.setVisibility(8);
                this.f22150n.setImageResource(R.drawable.ic_video_play);
                if (!this.f22159w) {
                    if (this.f22145i != null) {
                        this.f22145i.setVisibility(0);
                    }
                    if (this.f22162z) {
                        this.f22162z = false;
                        m20077a(c7608n);
                        break;
                    }
                }
                this.f22150n.setVisibility(0);
                m20083c();
                break;
                break;
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22151o.setVisibility(8);
                this.f22150n.setVisibility(0);
                this.f22146j.setVisibility(8);
                this.f22156t.setVisibility(8);
                m20078a(c7608n, c7608n.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22151o.setVisibility(0);
                this.f22150n.setVisibility(0);
                this.f22150n.setImageResource(R.drawable.ic_file_stop_download);
                this.f22146j.setVisibility(0);
                this.f22146j.setText(c7608n.f23348P);
                if (c7608n.f23353U > 0) {
                    progressWheel = this.f22151o;
                    f = ((float) c7608n.f23353U) * 0.01f;
                } else {
                    progressWheel = this.f22151o;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22156t.setVisibility(8);
                this.f22162z = true;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7608n, this.f22155s, true);
    }
}
