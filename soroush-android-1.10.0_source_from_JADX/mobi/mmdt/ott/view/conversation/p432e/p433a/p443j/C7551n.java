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
import android.widget.LinearLayout;
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
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3289j;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p443j.C7551n;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7686n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C6222c;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.VideoView;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7551n extends C7354b {
    private C1247e<Drawable> f23055A = new C62011(this);
    private final boolean f23056d;
    private ImageView f23057e;
    private TextView f23058f;
    private TextView f23059g;
    private ImageButton f23060h;
    private TextView f23061i;
    private ImageView f23062j;
    private View f23063k;
    private View f23064l;
    private ImageButton f23065m;
    private ProgressWheel f23066n;
    private C3284e f23067o;
    private C3283d f23068p;
    private int f23069q;
    private LinearLayout f23070r;
    private ImageView f23071s;
    private boolean f23072t;
    private C3289j f23073u;
    private boolean f23074v = true;
    private TextureView f23075w;
    private VideoView f23076x;
    private boolean f23077y;
    private C7686n f23078z;

    class C39754 implements OnClickListener {
        final /* synthetic */ C7551n f11472a;

        C39754(C7551n c7551n) {
            this.f11472a = c7551n;
        }

        public final void onClick(View view) {
            C7686n c7686n = (C7686n) this.f11472a.f16244a;
            if (C39742.f11470a[c7686n.f23871Z.ordinal()] == 1) {
                this.f11472a.m20636a(c7686n);
            }
        }
    }

    class C39765 implements OnClickListener {
        final /* synthetic */ C7551n f11473a;

        C39765(C7551n c7551n) {
            this.f11473a = c7551n;
        }

        public final void onClick(View view) {
            this.f11473a.f23067o.mo2331e(((C7686n) this.f11473a.f16244a).f23865R);
        }
    }

    class C39776 implements OnClickListener {
        final /* synthetic */ C7551n f11474a;

        C39776(C7551n c7551n) {
            this.f11474a = c7551n;
        }

        public final void onClick(View view) {
            C7686n c7686n = (C7686n) this.f11474a.f16244a;
            switch (c7686n.f23871Z) {
                case FINISHED:
                    if (this.f11474a.f23074v) {
                        this.f11474a.f23068p.mo2309a(c7686n.f23865R, null);
                        return;
                    } else {
                        this.f11474a.m20636a(c7686n);
                        return;
                    }
                case DELETED:
                case NOT_STARTED:
                    if (c7686n.ab == null || c7686n.ab.isEmpty()) {
                        this.f11474a.f23067o.mo2307a(c7686n.mo3604b(), false);
                        return;
                    } else {
                        this.f11474a.f23067o.mo2307a(c7686n.mo3604b(), true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11474a.f23067o.mo2305a(c7686n.mo3604b());
                    return;
                case CANCEL:
                    if (c7686n.ab == null || c7686n.ab.isEmpty()) {
                        this.f11474a.f23067o.mo2307a(c7686n.mo3604b(), false);
                        return;
                    } else {
                        this.f11474a.f23067o.mo2307a(c7686n.mo3604b(), true);
                        return;
                    }
                case ERROR:
                    if (c7686n.ab == null || c7686n.ab.isEmpty()) {
                        this.f11474a.f23067o.mo2307a(c7686n.mo3604b(), false);
                        return;
                    } else {
                        this.f11474a.f23067o.mo2307a(c7686n.mo3604b(), true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C39787 implements OnClickListener {
        final /* synthetic */ C7551n f11475a;

        C39787(C7551n c7551n) {
            this.f11475a = c7551n;
        }

        public final void onClick(View view) {
            C7686n c7686n = (C7686n) this.f11475a.f16244a;
            C2987i c2987i = c7686n.f23871Z;
            if (c7686n.ab == null || c7686n.ab.isEmpty()) {
                int[] iArr = C39742.f11470a;
                c7686n.f23871Z.ordinal();
                this.f11475a.f23068p.mo2309a(c7686n.f23865R, null);
            } else if (c2987i == C2987i.FINISHED) {
                this.f11475a.f23068p.mo2309a(c7686n.f23865R, null);
            }
        }
    }

    class C39798 implements Runnable {
        final /* synthetic */ C7551n f11476a;

        C39798(C7551n c7551n) {
            this.f11476a = c7551n;
        }

        public final void run() {
            this.f11476a.f23065m.setImageResource(R.drawable.ic_video_play);
            this.f11476a.f23065m.setVisibility(0);
        }
    }

    class C62011 implements C1247e<Drawable> {
        final /* synthetic */ C7551n f16750a;

        C62011(C7551n c7551n) {
            this.f16750a = c7551n;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7686n c7686n = (C7686n) this.f16750a.f16244a;
            if (!this.f16750a.f23072t) {
                this.f16750a.f23072t = true;
                if (c7686n.f23863P > 0 && c7686n.f23864Q > 0) {
                    Point b = C2491i.m6807b(this.f16750a.f23069q, c7686n.f23863P, c7686n.f23864Q);
                    LayoutParams layoutParams = (LayoutParams) this.f16750a.f23057e.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                    int dimension = (int) this.f16750a.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
                    LayoutParams layoutParams2 = (LayoutParams) this.f16750a.f23063k.getLayoutParams();
                    layoutParams2.height = dimension;
                    layoutParams2.width = b.x;
                    layoutParams2 = (LayoutParams) this.f16750a.f23064l.getLayoutParams();
                    layoutParams2.height = dimension;
                    layoutParams2.width = b.x;
                    layoutParams = (LayoutParams) this.f16750a.f23076x.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                    layoutParams = (LayoutParams) this.f16750a.f23075w.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                }
            }
            return false;
        }
    }

    class C69073 extends C6222c {
        final /* synthetic */ C7551n f19652a;

        C69073(C7551n c7551n) {
            this.f19652a = c7551n;
        }

        public final void mo2382a(int i, int i2) {
        }

        public final void mo2383a(C4113d c4113d) {
            this.f19652a.c.runOnUiThread(new C39798(this.f19652a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19652a.m20636a(this.f19652a.f23078z);
            }
        }

        public final void mo2384a(C4113d c4113d, int i) {
        }

        public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
            this.f19652a.m20639b();
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
            this.f19652a.c.runOnUiThread(new C39798(this.f19652a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19652a.m20636a(this.f19652a.f23078z);
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
            this.f19652a.c.runOnUiThread(new C39798(this.f19652a));
            C4121n.m8000b();
        }
    }

    public C7551n(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, boolean z, C3284e c3284e, C3283d c3283d, C3286g c3286g, C3289j c3289j) {
        int i3 = i;
        int i4 = i2;
        super(activity, layoutInflater, viewGroup, R.layout.chat_video_output_list_item, c3286g, c3284e);
        this.c = activity;
        this.f23067o = c3284e;
        this.f23068p = c3283d;
        this.f23073u = c3289j;
        this.f23056d = z;
        this.f23069q = i3;
        this.f23057e = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f23058f = (TextView) this.itemView.findViewById(R.id.video_length_textView);
        this.f23061i = (TextView) this.itemView.findViewById(R.id.progress_text_action_view);
        this.f23059g = (TextView) this.itemView.findViewById(R.id.video_size_textView);
        this.f23062j = (ImageView) this.itemView.findViewById(R.id.status_imageView);
        this.f23063k = this.itemView.findViewById(R.id.bottom_gradient_view);
        this.f23064l = this.itemView.findViewById(R.id.top_gradient_view);
        this.f23065m = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f23066n = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f23070r = (LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f23071s = (ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile);
        this.f23075w = (TextureView) this.itemView.findViewById(R.id.textureView1);
        this.f23060h = (ImageButton) this.itemView.findViewById(R.id.action_image_option);
        this.f23076x = (VideoView) this.itemView.findViewById(R.id.video_view);
        this.f23076x.f11710a = new C69073(this);
        this.f23075w.setOnClickListener(new C39754(this));
        this.f23071s.setOnClickListener(new C39765(this));
        LayoutParams layoutParams = (LayoutParams) this.f23057e.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        layoutParams = (LayoutParams) this.f23076x.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        layoutParams = (LayoutParams) this.f23075w.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        LayoutParams layoutParams2 = (LayoutParams) this.f23063k.getLayoutParams();
        layoutParams2.height = dimension;
        layoutParams2.width = i3;
        layoutParams2 = (LayoutParams) this.f23064l.getLayoutParams();
        layoutParams2.height = dimension;
        layoutParams2.width = i3;
        this.f23065m.setOnClickListener(new C39776(this));
        this.f23057e.setOnClickListener(new C39787(this));
    }

    private void m20634a() {
        if (this.f23065m != null) {
            this.f23065m.setVisibility(8);
        }
    }

    private void m20636a(C7686n c7686n) {
        this.f23073u.mo2336g(c7686n.f20777c, c7686n.f23865R);
        String str = c7686n.f20777c;
        if (this.f23076x != null) {
            C4113d player = this.f23076x.getPlayer();
            if (!(player == null || player.f11761f)) {
                if (player.isPlaying()) {
                    player.m7967b();
                    if (this.f23065m != null) {
                        this.f23065m.setVisibility(0);
                        m20639b();
                    }
                    C4121n.m8000b();
                    return;
                }
                C4121n.f11799a = str;
                m20634a();
                player.seekTo(0);
                player.start();
            }
        }
    }

    private void m20637a(C7686n c7686n, C2971k c2971k) {
        boolean z = ((c7686n.ab == null || c7686n.ab.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f23065m, z);
    }

    private void m20639b() {
        this.c.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C7551n f11469a;

            {
                this.f11469a = r1;
            }

            public final void run() {
                this.f11469a.f23076x.getCoverView().setVisibility(0);
            }
        });
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7686n c7686n = (C7686n) c6829g;
        this.f23078z = c7686n;
        Object a = C2613o.m7045a(c7686n.f23871Z, c7686n.aa, c7686n.f23865R, c7686n.f23866S, c7686n.f21300A);
        this.f23057e.setImageBitmap(null);
        this.f23072t = false;
        if (c7686n.f23871Z == C2987i.FINISHED && this.f23056d) {
            this.f23074v = C2476b.m6722a(c7686n.f23865R);
        }
        C1274i a2;
        Point a3;
        if (this.f23074v) {
            this.f23075w.setVisibility(8);
            this.f23076x.setVisibility(8);
            if (c7686n.f23863P <= 0 || c7686n.f23864Q <= 0) {
                a2 = C1212c.m2872a(this.c).m10950a(a).m3034a(new C1248f().m2959e().m2954b(this.f23069q, this.f23069q)).m3033a();
            } else {
                a3 = C2491i.m6763a(this.f23069q, c7686n.f23863P, c7686n.f23864Q);
                a2 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(new C1248f().m2954b(a3.x, a3.y));
            }
            a2.f3986c = this.f23055A;
            a2.m3031a(this.f23057e);
        } else {
            a3 = C2491i.m6763a(this.f23069q, c7686n.f23863P, c7686n.f23864Q);
            a2 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(new C1248f().m2954b(a3.x, a3.y));
            a2.f3986c = this.f23055A;
            a2.m3031a(this.f23076x.getCoverView());
            this.f23076x.getVideoInfo().f11701e = false;
            this.f23076x.m7923a(c7686n.f23865R).m7922a(c7686n.f20777c);
            this.f23076x.setVisibility(0);
            this.f23075w.setVisibility(0);
            if (C4121n.f11799a.equalsIgnoreCase(c7686n.f20777c)) {
                final int i2 = C4121n.f11800b;
                if (i2 > 0) {
                    this.c.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C7551n f11478b;

                        public final void run() {
                            if (this.f11478b.f23076x != null) {
                                C4113d player = this.f11478b.f23076x.getPlayer();
                                if (player != null && !player.f11761f) {
                                    this.f11478b.m20634a();
                                    player.seekTo(i2);
                                    player.start();
                                }
                            }
                        }
                    });
                }
            } else {
                m20639b();
            }
        }
        this.f23058f.setText(C2491i.m6774a(this.c, (long) c7686n.f23868U, true));
        this.f23059g.setText(c7686n.f23870Y);
        switch (c7686n.f21337w) {
            case ERROR:
                imageView = this.f23062j;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f23062j;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f23062j;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f23062j;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        this.f23060h.setVisibility(8);
        switch (c7686n.f23871Z) {
            case FINISHED:
                this.f23066n.setVisibility(8);
                this.f23071s.setVisibility(8);
                this.f23061i.setVisibility(8);
                this.f23065m.setImageResource(R.drawable.ic_video_play);
                if (!this.f23074v) {
                    this.f23060h.setVisibility(0);
                    if (this.f23077y) {
                        this.f23077y = false;
                        m20636a(c7686n);
                        break;
                    }
                }
                this.f23065m.setVisibility(0);
                this.f23060h.setVisibility(8);
                break;
                break;
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f23066n.setVisibility(8);
                this.f23065m.setVisibility(0);
                this.f23071s.setVisibility(8);
                this.f23061i.setVisibility(8);
                m20637a(c7686n, c7686n.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f23066n.setVisibility(0);
                this.f23065m.setVisibility(0);
                this.f23065m.setImageResource(R.drawable.ic_file_stop_download);
                this.f23061i.setVisibility(0);
                this.f23061i.setText(c7686n.f23869V);
                if (c7686n.f23867T > 0) {
                    progressWheel = this.f23066n;
                    f = ((float) c7686n.f23867T) * 0.01f;
                } else {
                    progressWheel = this.f23066n;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f23071s.setVisibility(8);
                this.f23077y = true;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7686n, this.f23070r, true);
    }
}
