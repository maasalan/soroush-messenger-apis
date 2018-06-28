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
import mobi.mmdt.ott.view.conversation.p432e.p433a.p437d.C7472m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7607m;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C6222c;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.VideoView;
import mobi.mmdt.ott.view.tools.C4520n;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7472m extends C7348b {
    private boolean f22112A;
    private C7607m f22113B;
    private boolean f22114C;
    private C1247e<Drawable> f22115D;
    private final boolean f22116e;
    private ImageView f22117f;
    private TextView f22118g;
    private TextView f22119h;
    private TextView f22120i;
    private ImageButton f22121j;
    private ImageView f22122k;
    private View f22123l;
    private View f22124m;
    private ImageButton f22125n;
    private TextView f22126o;
    private ProgressWheel f22127p;
    private C3284e f22128q;
    private C3283d f22129r;
    private int f22130s;
    private RelativeLayout f22131t;
    private ImageView f22132u;
    private boolean f22133v;
    private C3289j f22134w;
    private boolean f22135x;
    private TextureView f22136y;
    private VideoView f22137z;

    class C36554 implements OnClickListener {
        final /* synthetic */ C7472m f10899a;

        C36554(C7472m c7472m) {
            this.f10899a = c7472m;
        }

        public final void onClick(View view) {
            C7607m c7607m = (C7607m) this.f10899a.f16244a;
            if (C36542.f10897a[c7607m.f23346Y.ordinal()] == 1) {
                this.f10899a.m20056a(c7607m);
            }
        }
    }

    class C36565 implements OnClickListener {
        final /* synthetic */ C7472m f10900a;

        C36565(C7472m c7472m) {
            this.f10900a = c7472m;
        }

        public final void onClick(View view) {
            this.f10900a.f22128q.mo2331e(((C7607m) this.f10900a.f16244a).f23340S);
        }
    }

    class C36576 implements OnClickListener {
        final /* synthetic */ C7472m f10901a;

        C36576(C7472m c7472m) {
            this.f10901a = c7472m;
        }

        public final void onClick(View view) {
            C7607m c7607m = (C7607m) this.f10901a.f16244a;
            switch (c7607m.f23346Y) {
                case FINISHED:
                    if (this.f10901a.f22135x) {
                        this.f10901a.f22129r.mo2309a(c7607m.f23340S, c7607m.f23342U);
                        return;
                    } else {
                        this.f10901a.m20056a(c7607m);
                        return;
                    }
                case DELETED:
                case NOT_STARTED:
                    if (c7607m.ab == null || c7607m.ab.isEmpty()) {
                        this.f10901a.f22128q.mo2307a(c7607m.ac, false);
                        return;
                    } else {
                        this.f10901a.f22128q.mo2307a(c7607m.ac, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f10901a.f22128q.mo2305a(c7607m.ac);
                    return;
                case CANCEL:
                    if (c7607m.ab == null || c7607m.ab.isEmpty()) {
                        this.f10901a.f22128q.mo2307a(c7607m.ac, false);
                        return;
                    } else {
                        this.f10901a.f22128q.mo2307a(c7607m.ac, true);
                        return;
                    }
                case ERROR:
                    if (c7607m.ab == null || c7607m.ab.isEmpty()) {
                        this.f10901a.f22128q.mo2307a(c7607m.ac, false);
                        return;
                    } else {
                        this.f10901a.f22128q.mo2307a(c7607m.ac, true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C36587 implements OnClickListener {
        final /* synthetic */ C7472m f10902a;

        C36587(C7472m c7472m) {
            this.f10902a = c7472m;
        }

        public final void onClick(View view) {
            C7607m c7607m = (C7607m) this.f10902a.f16244a;
            if (c7607m.ab == null || c7607m.ab.isEmpty()) {
                int[] iArr = C36542.f10897a;
                c7607m.f23346Y.ordinal();
                this.f10902a.f22129r.mo2309a(c7607m.f23340S, c7607m.f23342U);
            } else if (c7607m.f23346Y == C2987i.FINISHED) {
                this.f10902a.f22129r.mo2309a(c7607m.f23340S, c7607m.f23342U);
            }
        }
    }

    class C36598 implements Runnable {
        final /* synthetic */ C7472m f10903a;

        C36598(C7472m c7472m) {
            this.f10903a = c7472m;
        }

        public final void run() {
            this.f10903a.f22125n.setImageResource(R.drawable.ic_video_play);
            this.f10903a.f22125n.setVisibility(0);
        }
    }

    class C61581 implements C1247e<Drawable> {
        final /* synthetic */ C7472m f16659a;

        C61581(C7472m c7472m) {
            this.f16659a = c7472m;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7607m c7607m = (C7607m) this.f16659a.f16244a;
            if (!this.f16659a.f22133v) {
                this.f16659a.f22133v = true;
                if (c7607m.f23338Q > 0 && c7607m.f23339R > 0) {
                    Point b = C2491i.m6807b(this.f16659a.f22130s, c7607m.f23338Q, c7607m.f23339R);
                    this.f16659a.m20053a(b.x, b.y);
                }
            }
            return false;
        }
    }

    class C68913 extends C6222c {
        final /* synthetic */ C7472m f19630a;

        C68913(C7472m c7472m) {
            this.f19630a = c7472m;
        }

        public final void mo2382a(int i, int i2) {
        }

        public final void mo2383a(C4113d c4113d) {
            this.f19630a.c.runOnUiThread(new C36598(this.f19630a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19630a.m20056a(this.f19630a.f22113B);
            }
        }

        public final void mo2384a(C4113d c4113d, int i) {
        }

        public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
            this.f19630a.m20059b();
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
            this.f19630a.c.runOnUiThread(new C36598(this.f19630a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19630a.m20056a(this.f19630a.f22113B);
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
            this.f19630a.c.runOnUiThread(new C36598(this.f19630a));
            C4121n.m8000b();
        }
    }

    public C7472m(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, boolean z, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g, C3289j c3289j) {
        C7348b c7348b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_video_captioned_channel_output_list_item : R.layout.chat_video_captioned_channel_output_list_item_old, c3280a, c3286g, c3284e);
        c7348b.f22135x = true;
        c7348b.f22114C = true ^ C2535a.m6888a().au();
        c7348b.f22115D = new C61581(c7348b);
        c7348b.f22128q = c3284e;
        c7348b.f22129r = c3283d;
        c7348b.f22134w = c3289j;
        c7348b.f22116e = z;
        c7348b.f22130s = i3;
        c7348b.f22117f = (ImageView) c7348b.itemView.findViewById(R.id.content_imageView);
        c7348b.f22118g = (TextView) c7348b.itemView.findViewById(R.id.caption_textView);
        c7348b.f22119h = (TextView) c7348b.itemView.findViewById(R.id.video_length_textView);
        c7348b.f22120i = (TextView) c7348b.itemView.findViewById(R.id.video_size_textView);
        c7348b.f22122k = (ImageView) c7348b.itemView.findViewById(R.id.status_imageView);
        c7348b.f22123l = c7348b.itemView.findViewById(R.id.bottom_gradient_view);
        c7348b.f22124m = c7348b.itemView.findViewById(R.id.top_gradient_view);
        c7348b.f22125n = (ImageButton) c7348b.itemView.findViewById(R.id.action_imageView);
        c7348b.f22126o = (TextView) c7348b.itemView.findViewById(R.id.progress_text_action_view);
        c7348b.f22127p = (ProgressWheel) c7348b.itemView.findViewById(R.id.progress_wheel);
        c7348b.f22131t = (RelativeLayout) c7348b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7348b.f22132u = (ImageView) c7348b.itemView.findViewById(R.id.actionDownloadChatFile);
        c7348b.f22136y = (TextureView) c7348b.itemView.findViewById(R.id.textureView1);
        c7348b.f22121j = (ImageButton) c7348b.itemView.findViewById(R.id.action_image_option);
        c7348b.f22137z = (VideoView) c7348b.itemView.findViewById(R.id.video_view);
        c7348b.f22137z.f11710a = new C68913(c7348b);
        c7348b.f22136y.setOnClickListener(new C36554(c7348b));
        c7348b.f22132u.setOnClickListener(new C36565(c7348b));
        m20053a(i3, i2);
        c7348b.f22125n.setOnClickListener(new C36576(c7348b));
        c7348b.f22117f.setOnClickListener(new C36587(c7348b));
    }

    private void m20052a() {
        if (this.f22125n != null) {
            this.f22125n.setVisibility(8);
        }
    }

    private void m20053a(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.f22117f.getLayoutParams();
        layoutParams.height = i2;
        if (this.f22114C) {
            layoutParams.width = i;
        }
        int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        LayoutParams layoutParams2 = (LayoutParams) this.f22123l.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f22114C) {
            layoutParams2.width = i;
        }
        layoutParams2 = (LayoutParams) this.f22124m.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f22114C) {
            layoutParams2.width = i;
        }
        layoutParams = (LayoutParams) this.f22137z.getLayoutParams();
        layoutParams.height = i2;
        if (this.f22114C) {
            layoutParams.width = i;
        }
        layoutParams = (LayoutParams) this.f22136y.getLayoutParams();
        layoutParams.height = i2;
        if (this.f22114C) {
            layoutParams.width = i;
        }
    }

    private void m20056a(C7607m c7607m) {
        this.f22134w.mo2336g(c7607m.f20777c, c7607m.f23340S);
        String str = c7607m.f20777c;
        if (this.f22137z != null) {
            C4113d player = this.f22137z.getPlayer();
            if (!(player == null || player.f11761f)) {
                if (player.isPlaying()) {
                    player.m7967b();
                    if (this.f22125n != null) {
                        this.f22125n.setVisibility(0);
                        m20059b();
                    }
                    C4121n.m8000b();
                    return;
                }
                C4121n.f11799a = str;
                m20052a();
                player.seekTo(0);
                player.start();
            }
        }
    }

    private void m20057a(C7607m c7607m, C2971k c2971k) {
        boolean z = ((c7607m.ab == null || c7607m.ab.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22125n, z);
    }

    private void m20059b() {
        this.c.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C7472m f10896a;

            {
                this.f10896a = r1;
            }

            public final void run() {
                this.f10896a.f22137z.getCoverView().setVisibility(0);
            }
        });
    }

    private void m20062c() {
        if (this.f22121j != null) {
            this.f22121j.setVisibility(8);
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7607m c7607m = (C7607m) c6829g;
        this.f22113B = c7607m;
        Object a = C2613o.m7045a(c7607m.f23346Y, c7607m.f23347Z, c7607m.f23340S, c7607m.f23341T, c7607m.f21300A);
        C1247e c1247e = null;
        this.f22117f.setImageBitmap(null);
        this.f22133v = false;
        if (c7607m.f23346Y == C2987i.FINISHED && this.f22116e) {
            this.f22135x = C2476b.m6722a(c7607m.f23340S);
        }
        Point a2 = this.f22114C ? C2491i.m6763a(this.f22130s, c7607m.f23338Q, c7607m.f23339R) : null;
        C1274i a3;
        if (this.f22135x) {
            this.f22136y.setVisibility(8);
            this.f22137z.setVisibility(8);
            boolean z = c7607m.f23338Q > 0 && c7607m.f23339R > 0;
            C1248f c1248f = new C1248f();
            int i2 = (z && this.f22114C) ? a2.x : this.f22130s;
            int i3 = (z && this.f22114C) ? a2.y : this.f22130s;
            C1248f b = c1248f.m2954b(i2, i3);
            if (!z || this.f22114C) {
                c1247e = this.f22115D;
            }
            a3 = C1212c.m2872a(this.c).m10950a(a).m3034a(b).m3033a();
            a3.f3986c = c1247e;
            a3.m3031a(this.f22117f);
        } else {
            a3 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(new C1248f().m2954b(this.f22114C ? a2.x : this.f22130s, this.f22114C ? a2.y : this.f22130s));
            if (this.f22114C) {
                c1247e = this.f22115D;
            }
            a3.f3986c = c1247e;
            a3.m3031a(this.f22137z.getCoverView());
            this.f22137z.getVideoInfo().f11701e = false;
            this.f22137z.m7923a(c7607m.f23340S).m7922a(c7607m.f20777c);
            this.f22137z.setVisibility(0);
            this.f22136y.setVisibility(0);
            if (C4121n.f11799a.equalsIgnoreCase(c7607m.f20777c)) {
                final int i4 = C4121n.f11800b;
                if (i4 > 0) {
                    this.c.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C7472m f10905b;

                        public final void run() {
                            if (this.f10905b.f22137z != null) {
                                C4113d player = this.f10905b.f22137z.getPlayer();
                                if (player != null && !player.f11761f) {
                                    this.f10905b.m20052a();
                                    player.seekTo(i4);
                                    player.start();
                                }
                            }
                        }
                    });
                }
            } else {
                m20059b();
            }
        }
        this.f22119h.setText(C2491i.m6774a(this.c, (long) c7607m.f23344W, true));
        this.f22120i.setText(c7607m.f23345X);
        if (c7607m.f23342U == null || c7607m.f23342U.isEmpty()) {
            this.f22118g.setVisibility(8);
        } else {
            this.f22118g.setText(c7607m.f23342U);
            this.f22118g.setVisibility(0);
            this.f22118g.setTextSize((float) c7607m.aa);
            C4520n.m8234a(this.f22118g);
        }
        switch (c7607m.f21337w) {
            case ERROR:
                imageView = this.f22122k;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22122k;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22122k;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22122k;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        m20062c();
        switch (c7607m.f23346Y) {
            case FINISHED:
                this.f22127p.setVisibility(8);
                this.f22132u.setVisibility(8);
                this.f22126o.setVisibility(8);
                this.f22125n.setImageResource(R.drawable.ic_video_play);
                if (!this.f22135x) {
                    if (this.f22121j != null) {
                        this.f22121j.setVisibility(0);
                    }
                    if (this.f22112A) {
                        this.f22112A = false;
                        m20056a(c7607m);
                        break;
                    }
                }
                this.f22125n.setVisibility(0);
                m20062c();
                break;
                break;
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22127p.setVisibility(8);
                this.f22125n.setVisibility(0);
                this.f22126o.setVisibility(8);
                this.f22132u.setVisibility(8);
                m20057a(c7607m, c7607m.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22127p.setVisibility(0);
                this.f22125n.setVisibility(0);
                this.f22125n.setImageResource(R.drawable.ic_file_stop_download);
                this.f22126o.setVisibility(0);
                this.f22126o.setText(c7607m.f23337P);
                if (c7607m.f23343V > 0) {
                    progressWheel = this.f22127p;
                    f = ((float) c7607m.f23343V) * 0.01f;
                } else {
                    progressWheel = this.f22127p;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22132u.setVisibility(8);
                this.f22112A = true;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7607m, this.f22131t, true);
    }
}
