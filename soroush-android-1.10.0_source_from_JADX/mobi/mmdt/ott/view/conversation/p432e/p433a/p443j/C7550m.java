package mobi.mmdt.ott.view.conversation.p432e.p433a.p443j;

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
import com.p085c.p086a.p105g.C1247e;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p386h.C2986h;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3289j;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p443j.C7550m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7685m;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C6222c;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.VideoView;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7550m extends C7354b {
    private C7685m f23030A;
    private C1247e<Drawable> f23031B = new C62001(this);
    private final boolean f23032d;
    private ImageView f23033e;
    private TextView f23034f;
    private TextView f23035g;
    private TextView f23036h;
    private ImageButton f23037i;
    private ImageView f23038j;
    private View f23039k;
    private View f23040l;
    private ImageButton f23041m;
    private TextView f23042n;
    private ProgressWheel f23043o;
    private C3284e f23044p;
    private C3283d f23045q;
    private int f23046r;
    private RelativeLayout f23047s;
    private ImageView f23048t;
    private boolean f23049u;
    private C3289j f23050v;
    private boolean f23051w = true;
    private TextureView f23052x;
    private VideoView f23053y;
    private boolean f23054z;

    class C39684 implements OnClickListener {
        final /* synthetic */ C7550m f11462a;

        C39684(C7550m c7550m) {
            this.f11462a = c7550m;
        }

        public final void onClick(View view) {
            C7685m c7685m = (C7685m) this.f11462a.f16244a;
            if (C39672.f11460a[c7685m.aa.ordinal()] == 1) {
                this.f11462a.m20613a(c7685m);
            }
        }
    }

    class C39695 implements OnClickListener {
        final /* synthetic */ C7550m f11463a;

        C39695(C7550m c7550m) {
            this.f11463a = c7550m;
        }

        public final void onClick(View view) {
            this.f11463a.f23044p.mo2331e(((C7685m) this.f11463a.f16244a).f23857S);
        }
    }

    class C39706 implements OnClickListener {
        final /* synthetic */ C7550m f11464a;

        C39706(C7550m c7550m) {
            this.f11464a = c7550m;
        }

        public final void onClick(View view) {
            C7685m c7685m = (C7685m) this.f11464a.f16244a;
            switch (c7685m.aa) {
                case FINISHED:
                    if (this.f11464a.f23051w) {
                        this.f11464a.f23045q.mo2309a(c7685m.f23857S, c7685m.f23859U);
                        return;
                    } else {
                        this.f11464a.m20613a(c7685m);
                        return;
                    }
                case DELETED:
                case NOT_STARTED:
                    if (c7685m.ad == null || c7685m.ad.isEmpty()) {
                        this.f11464a.f23044p.mo2307a(c7685m.mo3604b(), false);
                        return;
                    } else {
                        this.f11464a.f23044p.mo2307a(c7685m.mo3604b(), true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11464a.f23044p.mo2305a(c7685m.mo3604b());
                    return;
                case CANCEL:
                    if (c7685m.ad == null || c7685m.ad.isEmpty()) {
                        this.f11464a.f23044p.mo2307a(c7685m.mo3604b(), false);
                        return;
                    } else {
                        this.f11464a.f23044p.mo2307a(c7685m.mo3604b(), true);
                        return;
                    }
                case ERROR:
                    if (c7685m.ad == null || c7685m.ad.isEmpty()) {
                        this.f11464a.f23044p.mo2307a(c7685m.mo3604b(), false);
                        return;
                    } else {
                        this.f11464a.f23044p.mo2307a(c7685m.mo3604b(), true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C39717 implements OnClickListener {
        final /* synthetic */ C7550m f11465a;

        C39717(C7550m c7550m) {
            this.f11465a = c7550m;
        }

        public final void onClick(View view) {
            C7685m c7685m = (C7685m) this.f11465a.f16244a;
            C2987i c2987i = c7685m.aa;
            if (c7685m.ad == null || c7685m.ad.isEmpty()) {
                int[] iArr = C39672.f11460a;
                c7685m.aa.ordinal();
                this.f11465a.f23045q.mo2309a(c7685m.f23857S, c7685m.f23859U);
            } else if (c2987i == C2987i.FINISHED) {
                this.f11465a.f23045q.mo2309a(c7685m.f23857S, c7685m.f23859U);
            }
        }
    }

    class C39728 implements Runnable {
        final /* synthetic */ C7550m f11466a;

        C39728(C7550m c7550m) {
            this.f11466a = c7550m;
        }

        public final void run() {
            this.f11466a.f23041m.setImageResource(R.drawable.ic_video_play);
            this.f11466a.f23041m.setVisibility(0);
        }
    }

    class C62001 implements C1247e<Drawable> {
        final /* synthetic */ C7550m f16749a;

        C62001(C7550m c7550m) {
            this.f16749a = c7550m;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7685m c7685m = (C7685m) this.f16749a.f16244a;
            if (!this.f16749a.f23049u) {
                this.f16749a.f23049u = true;
                if (c7685m.f23855Q > 0 && c7685m.f23856R > 0) {
                    Point b = C2491i.m6807b(this.f16749a.f23046r, c7685m.f23855Q, c7685m.f23856R);
                    LayoutParams layoutParams = (LayoutParams) this.f16749a.f23033e.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                    int dimension = (int) this.f16749a.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
                    LayoutParams layoutParams2 = (LayoutParams) this.f16749a.f23039k.getLayoutParams();
                    layoutParams2.height = dimension;
                    layoutParams2.width = b.x;
                    layoutParams2 = (LayoutParams) this.f16749a.f23040l.getLayoutParams();
                    layoutParams2.height = dimension;
                    layoutParams2.width = b.x;
                    layoutParams = (LayoutParams) this.f16749a.f23053y.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                    layoutParams = (LayoutParams) this.f16749a.f23052x.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                }
            }
            return false;
        }
    }

    class C69063 extends C6222c {
        final /* synthetic */ C7550m f19651a;

        C69063(C7550m c7550m) {
            this.f19651a = c7550m;
        }

        public final void mo2382a(int i, int i2) {
        }

        public final void mo2383a(C4113d c4113d) {
            this.f19651a.c.runOnUiThread(new C39728(this.f19651a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19651a.m20613a(this.f19651a.f23030A);
            }
        }

        public final void mo2384a(C4113d c4113d, int i) {
        }

        public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
            this.f19651a.m20616b();
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
            this.f19651a.c.runOnUiThread(new C39728(this.f19651a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19651a.m20613a(this.f19651a.f23030A);
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
            this.f19651a.c.runOnUiThread(new C39728(this.f19651a));
            C4121n.m8000b();
        }
    }

    public C7550m(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, boolean z, C3284e c3284e, C3283d c3283d, C3286g c3286g, C3289j c3289j) {
        int i3 = i;
        int i4 = i2;
        super(activity, layoutInflater, viewGroup, R.layout.chat_video_captioned_output_list_item, c3286g, c3284e);
        this.f23044p = c3284e;
        this.f23045q = c3283d;
        this.f23050v = c3289j;
        this.f23032d = z;
        this.f23046r = i3;
        this.f23033e = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f23034f = (TextView) this.itemView.findViewById(R.id.caption_textView);
        this.f23035g = (TextView) this.itemView.findViewById(R.id.video_length_textView);
        this.f23036h = (TextView) this.itemView.findViewById(R.id.video_size_textView);
        this.f23038j = (ImageView) this.itemView.findViewById(R.id.status_imageView);
        this.f23039k = this.itemView.findViewById(R.id.bottom_gradient_view);
        this.f23040l = this.itemView.findViewById(R.id.top_gradient_view);
        this.f23041m = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f23042n = (TextView) this.itemView.findViewById(R.id.progress_text_action_view);
        this.f23043o = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f23047s = (RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f23048t = (ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile);
        this.f23052x = (TextureView) this.itemView.findViewById(R.id.textureView1);
        this.f23037i = (ImageButton) this.itemView.findViewById(R.id.action_image_option);
        this.f23053y = (VideoView) this.itemView.findViewById(R.id.video_view);
        this.f23053y.f11710a = new C69063(this);
        this.f23052x.setOnClickListener(new C39684(this));
        this.f23048t.setOnClickListener(new C39695(this));
        LayoutParams layoutParams = (LayoutParams) this.f23033e.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        layoutParams = (LayoutParams) this.f23053y.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        layoutParams = (LayoutParams) this.f23052x.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        LayoutParams layoutParams2 = (LayoutParams) this.f23039k.getLayoutParams();
        layoutParams2.height = dimension;
        layoutParams2.width = i3;
        layoutParams2 = (LayoutParams) this.f23040l.getLayoutParams();
        layoutParams2.height = dimension;
        layoutParams2.width = i3;
        this.f23041m.setOnClickListener(new C39706(this));
        this.f23033e.setOnClickListener(new C39717(this));
    }

    private void m20611a() {
        if (this.f23041m != null) {
            this.f23041m.setVisibility(8);
        }
    }

    private void m20613a(C7685m c7685m) {
        this.f23050v.mo2336g(c7685m.f20777c, c7685m.f23857S);
        String str = c7685m.f20777c;
        if (this.f23053y != null) {
            C4113d player = this.f23053y.getPlayer();
            if (!(player == null || player.f11761f)) {
                if (player.isPlaying()) {
                    player.m7967b();
                    if (this.f23041m != null) {
                        this.f23041m.setVisibility(0);
                        m20616b();
                    }
                    C4121n.m8000b();
                    return;
                }
                C4121n.f11799a = str;
                m20611a();
                player.seekTo(0);
                player.start();
            }
        }
    }

    private void m20614a(C7685m c7685m, C2971k c2971k) {
        boolean z = ((c7685m.ad == null || c7685m.ad.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f23041m, z);
    }

    private void m20616b() {
        this.c.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C7550m f11459a;

            {
                this.f11459a = r1;
            }

            public final void run() {
                this.f11459a.f23053y.getCoverView().setVisibility(0);
            }
        });
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void mo3180a(mobi.mmdt.ott.view.components.p401c.C6829g r9) {
        /*
        r8 = this;
        super.mo3180a(r9);
        r9 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7685m) r9;
        r8.f23030A = r9;
        r0 = r9.aa;
        r1 = r9.ab;
        r2 = r9.f23857S;
        r3 = r9.f23858T;
        r4 = r9.f21300A;
        r0 = mobi.mmdt.ott.logic.p261a.af.C2613o.m7045a(r0, r1, r2, r3, r4);
        r1 = r8.f23033e;
        r2 = 0;
        r1.setImageBitmap(r2);
        r1 = 0;
        r8.f23049u = r1;
        r2 = r9.aa;
        r3 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r3) goto L_0x0030;
    L_0x0024:
        r2 = r8.f23032d;
        if (r2 == 0) goto L_0x0030;
    L_0x0028:
        r2 = r9.f23857S;
        r2 = mobi.mmdt.componentsutils.p232b.p234b.C2476b.m6722a(r2);
        r8.f23051w = r2;
    L_0x0030:
        r2 = r8.f23051w;
        r3 = 8;
        if (r2 != 0) goto L_0x00a8;
    L_0x0036:
        r2 = r8.f23046r;
        r4 = r9.f23855Q;
        r5 = r9.f23856R;
        r2 = mobi.mmdt.componentsutils.p232b.C2491i.m6763a(r2, r4, r5);
        r4 = r8.c;
        r4 = com.p085c.p086a.C1212c.m2872a(r4);
        r0 = r4.m10950a(r0);
        r0 = r0.m3033a();
        r4 = new com.c.a.g.f;
        r4.<init>();
        r5 = r2.x;
        r2 = r2.y;
        r2 = r4.m2954b(r5, r2);
        r0 = r0.m3034a(r2);
        r2 = r8.f23031B;
        r0.f3986c = r2;
        r2 = r8.f23053y;
        r2 = r2.getCoverView();
        r0.m3031a(r2);
        r0 = r8.f23053y;
        r0 = r0.getVideoInfo();
        r0.f11701e = r1;
        r0 = r8.f23053y;
        r2 = r9.f23857S;
        r0 = r0.m7923a(r2);
        r2 = r9.f20777c;
        r0.m7922a(r2);
        r0 = r8.f23053y;
        r0.setVisibility(r1);
        r0 = r8.f23052x;
        r0.setVisibility(r1);
        r0 = mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n.f11799a;
        r2 = r9.f20777c;
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 == 0) goto L_0x00a4;
    L_0x0095:
        r0 = mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n.f11800b;
        if (r0 <= 0) goto L_0x0110;
    L_0x0099:
        r2 = r8.c;
        r4 = new mobi.mmdt.ott.view.conversation.e.a.j.m$9;
        r4.<init>(r8, r0);
        r2.runOnUiThread(r4);
        goto L_0x0110;
    L_0x00a4:
        r8.m20616b();
        goto L_0x0110;
    L_0x00a8:
        r2 = r8.f23052x;
        r2.setVisibility(r3);
        r2 = r8.f23053y;
        r2.setVisibility(r3);
        r2 = r9.f23855Q;
        if (r2 <= 0) goto L_0x00e4;
    L_0x00b6:
        r2 = r9.f23856R;
        if (r2 <= 0) goto L_0x00e4;
    L_0x00ba:
        r2 = r8.f23046r;
        r4 = r9.f23855Q;
        r5 = r9.f23856R;
        r2 = mobi.mmdt.componentsutils.p232b.C2491i.m6763a(r2, r4, r5);
        r4 = r8.c;
        r4 = com.p085c.p086a.C1212c.m2872a(r4);
        r0 = r4.m10950a(r0);
        r0 = r0.m3033a();
        r4 = new com.c.a.g.f;
        r4.<init>();
        r5 = r2.x;
        r2 = r2.y;
        r2 = r4.m2954b(r5, r2);
        r0 = r0.m3034a(r2);
        goto L_0x0107;
    L_0x00e4:
        r2 = r8.c;
        r2 = com.p085c.p086a.C1212c.m2872a(r2);
        r0 = r2.m10950a(r0);
        r2 = new com.c.a.g.f;
        r2.<init>();
        r2 = r2.m2959e();
        r4 = r8.f23046r;
        r5 = r8.f23046r;
        r2 = r2.m2954b(r4, r5);
        r0 = r0.m3034a(r2);
        r0 = r0.m3033a();
    L_0x0107:
        r2 = r8.f23031B;
        r0.f3986c = r2;
        r2 = r8.f23033e;
        r0.m3031a(r2);
    L_0x0110:
        r0 = r8.c;
        r2 = r9.f23861Y;
        r4 = (long) r2;
        r2 = 1;
        r0 = mobi.mmdt.componentsutils.p232b.C2491i.m6774a(r0, r4, r2);
        r4 = r8.f23035g;
        r4.setText(r0);
        r0 = r8.f23036h;
        r4 = r9.f23862Z;
        r0.setText(r4);
        r0 = r9.f23859U;
        if (r0 == 0) goto L_0x0153;
    L_0x012a:
        r0 = r9.f23859U;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0153;
    L_0x0132:
        r0 = r8.f23034f;
        r4 = r9.f23859U;
        r0.setText(r4);
        r0 = r8.f23034f;
        r0.setVisibility(r1);
        r0 = r8.f23034f;
        r4 = r9.ac;
        r4 = (double) r4;
        r6 = 4605831338911806259; // 0x3feb333333333333 float:4.172325E-8 double:0.85;
        r4 = r4 * r6;
        r4 = (float) r4;
        r0.setTextSize(r4);
        r0 = r8.f23034f;
        mobi.mmdt.ott.view.tools.C4520n.m8234a(r0);
        goto L_0x0158;
    L_0x0153:
        r0 = r8.f23034f;
        r0.setVisibility(r3);
    L_0x0158:
        r0 = mobi.mmdt.ott.view.conversation.p432e.p433a.p443j.C7550m.C39672.f11461b;
        r4 = r9.f21337w;
        r4 = r4.ordinal();
        r0 = r0[r4];
        switch(r0) {
            case 1: goto L_0x0178;
            case 2: goto L_0x0172;
            case 3: goto L_0x016c;
            case 4: goto L_0x016c;
            case 5: goto L_0x016c;
            case 6: goto L_0x016c;
            case 7: goto L_0x0166;
            default: goto L_0x0165;
        };
    L_0x0165:
        goto L_0x0180;
    L_0x0166:
        r0 = r8.f23038j;
        r4 = 2131231989; // 0x7f0804f5 float:1.8080075E38 double:1.052968509E-314;
        goto L_0x017d;
    L_0x016c:
        r0 = r8.f23038j;
        r4 = 2131231990; // 0x7f0804f6 float:1.8080077E38 double:1.0529685096E-314;
        goto L_0x017d;
    L_0x0172:
        r0 = r8.f23038j;
        r4 = 2131231987; // 0x7f0804f3 float:1.808007E38 double:1.052968508E-314;
        goto L_0x017d;
    L_0x0178:
        r0 = r8.f23038j;
        r4 = 2131231983; // 0x7f0804ef float:1.8080062E38 double:1.052968506E-314;
    L_0x017d:
        r0.setImageResource(r4);
    L_0x0180:
        r0 = r8.f23037i;
        r0.setVisibility(r3);
        r0 = mobi.mmdt.ott.view.conversation.p432e.p433a.p443j.C7550m.C39672.f11460a;
        r4 = r9.aa;
        r4 = r4.ordinal();
        r0 = r0[r4];
        switch(r0) {
            case 1: goto L_0x020e;
            case 2: goto L_0x01f4;
            case 3: goto L_0x01f4;
            case 4: goto L_0x01b9;
            case 5: goto L_0x01a4;
            case 6: goto L_0x0194;
            default: goto L_0x0192;
        };
    L_0x0192:
        goto L_0x0242;
    L_0x0194:
        r0 = r8.f23043o;
        r0.setVisibility(r3);
        r0 = r8.f23042n;
        r0.setVisibility(r3);
        r0 = r8.f23041m;
        r0.setVisibility(r1);
        goto L_0x01b3;
    L_0x01a4:
        r0 = r8.f23043o;
        r0.setVisibility(r3);
        r0 = r8.f23041m;
        r0.setVisibility(r1);
        r0 = r8.f23042n;
        r0.setVisibility(r3);
    L_0x01b3:
        r0 = r8.f23048t;
        r0.setVisibility(r3);
        goto L_0x0208;
    L_0x01b9:
        r0 = r8.f23043o;
        r0.setVisibility(r1);
        r0 = r8.f23041m;
        r0.setVisibility(r1);
        r0 = r8.f23042n;
        r0.setVisibility(r1);
        r0 = r8.f23042n;
        r1 = r9.f23854P;
        r0.setText(r1);
        r0 = r8.f23041m;
        r1 = 2131231909; // 0x7f0804a5 float:1.8079912E38 double:1.0529684696E-314;
        r0.setImageResource(r1);
        r0 = r9.f23860V;
        if (r0 <= 0) goto L_0x01e8;
    L_0x01db:
        r0 = r8.f23043o;
        r1 = r9.f23860V;
        r1 = (float) r1;
        r4 = 1008981770; // 0x3c23d70a float:0.01 double:4.9850323E-315;
        r1 = r1 * r4;
    L_0x01e4:
        r0.setProgress(r1);
        goto L_0x01ec;
    L_0x01e8:
        r0 = r8.f23043o;
        r1 = 0;
        goto L_0x01e4;
    L_0x01ec:
        r0 = r8.f23048t;
        r0.setVisibility(r3);
        r8.f23054z = r2;
        goto L_0x0242;
    L_0x01f4:
        r0 = r8.f23043o;
        r0.setVisibility(r3);
        r0 = r8.f23041m;
        r0.setVisibility(r1);
        r0 = r8.f23048t;
        r0.setVisibility(r3);
        r0 = r8.f23042n;
        r0.setVisibility(r3);
    L_0x0208:
        r0 = r9.f21337w;
        r8.m20614a(r9, r0);
        goto L_0x0242;
    L_0x020e:
        r0 = r8.f23043o;
        r0.setVisibility(r3);
        r0 = r8.f23042n;
        r0.setVisibility(r3);
        r0 = r8.f23041m;
        r4 = 2131232105; // 0x7f080569 float:1.808031E38 double:1.0529685664E-314;
        r0.setImageResource(r4);
        r0 = r8.f23048t;
        r0.setVisibility(r1);
        r0 = r8.f23051w;
        if (r0 == 0) goto L_0x0234;
    L_0x0229:
        r0 = r8.f23041m;
        r0.setVisibility(r1);
        r0 = r8.f23037i;
        r0.setVisibility(r3);
        goto L_0x0242;
    L_0x0234:
        r0 = r8.f23037i;
        r0.setVisibility(r1);
        r0 = r8.f23054z;
        if (r0 == 0) goto L_0x0242;
    L_0x023d:
        r8.f23054z = r1;
        r8.m20613a(r9);
    L_0x0242:
        r0 = r8.f23047s;
        r8.m19051a(r9, r0, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.e.a.j.m.a(mobi.mmdt.ott.view.components.c.g):void");
    }
}
