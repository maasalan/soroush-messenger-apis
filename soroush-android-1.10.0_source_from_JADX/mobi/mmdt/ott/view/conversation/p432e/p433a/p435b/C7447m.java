package mobi.mmdt.ott.view.conversation.p432e.p433a.p435b;

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
import mobi.mmdt.ott.view.conversation.p432e.p433a.p435b.C7447m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7721m;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C6222c;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.VideoView;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7447m extends C7346b {
    private C7721m f21823A;
    private boolean f21824B;
    private C1247e<Drawable> f21825C;
    private final boolean f21826e;
    private ImageView f21827f;
    private TextView f21828g;
    private TextView f21829h;
    private ImageButton f21830i;
    private ImageView f21831j;
    private TextView f21832k;
    private View f21833l;
    private View f21834m;
    private ImageButton f21835n;
    private ProgressWheel f21836o;
    private C3284e f21837p;
    private C3283d f21838q;
    private int f21839r;
    private RelativeLayout f21840s;
    private ImageView f21841t;
    private boolean f21842u;
    private C3289j f21843v;
    private boolean f21844w;
    private TextureView f21845x;
    private VideoView f21846y;
    private boolean f21847z;

    class C35564 implements OnClickListener {
        final /* synthetic */ C7447m f10718a;

        C35564(C7447m c7447m) {
            this.f10718a = c7447m;
        }

        public final void onClick(View view) {
            C7721m c7721m = (C7721m) this.f10718a.f16244a;
            if (C35552.f10716a[c7721m.f24331X.ordinal()] == 1) {
                this.f10718a.m19901a(c7721m);
            }
        }
    }

    class C35575 implements OnClickListener {
        final /* synthetic */ C7447m f10719a;

        C35575(C7447m c7447m) {
            this.f10719a = c7447m;
        }

        public final void onClick(View view) {
            this.f10719a.f21837p.mo2331e(((C7721m) this.f10719a.f16244a).f24326S);
        }
    }

    class C35586 implements OnClickListener {
        final /* synthetic */ C7447m f10720a;

        C35586(C7447m c7447m) {
            this.f10720a = c7447m;
        }

        public final void onClick(View view) {
            C7721m c7721m = (C7721m) this.f10720a.f16244a;
            switch (c7721m.f24331X) {
                case DELETED:
                case NOT_STARTED:
                    if (c7721m.f24333Z == null || c7721m.f24333Z.isEmpty()) {
                        this.f10720a.f21837p.mo2307a(c7721m.ac, false);
                        return;
                    } else {
                        this.f10720a.f21837p.mo2307a(c7721m.ac, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f10720a.f21837p.mo2305a(c7721m.ac);
                    return;
                case CANCEL:
                    if (c7721m.f24333Z == null || c7721m.f24333Z.isEmpty()) {
                        this.f10720a.f21837p.mo2307a(c7721m.ac, false);
                        return;
                    } else {
                        this.f10720a.f21837p.mo2307a(c7721m.ac, true);
                        return;
                    }
                case ERROR:
                    if (c7721m.f24333Z == null || c7721m.f24333Z.isEmpty()) {
                        this.f10720a.f21837p.mo2307a(c7721m.ac, false);
                        return;
                    } else {
                        this.f10720a.f21837p.mo2307a(c7721m.ac, true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C35597 implements OnClickListener {
        final /* synthetic */ C7447m f10721a;

        C35597(C7447m c7447m) {
            this.f10721a = c7447m;
        }

        public final void onClick(View view) {
            C7721m c7721m = (C7721m) this.f10721a.f16244a;
            if (c7721m.f24333Z == null || c7721m.f24333Z.isEmpty()) {
                int[] iArr = C35552.f10716a;
                c7721m.f24331X.ordinal();
                this.f10721a.f21838q.mo2309a(c7721m.f24326S, null);
            } else if (c7721m.f24331X == C2987i.FINISHED) {
                this.f10721a.f21838q.mo2309a(c7721m.f24326S, null);
            }
        }
    }

    class C35608 implements Runnable {
        final /* synthetic */ C7447m f10722a;

        C35608(C7447m c7447m) {
            this.f10722a = c7447m;
        }

        public final void run() {
            this.f10722a.f21835n.setImageResource(R.drawable.ic_video_play);
            this.f10722a.f21835n.setVisibility(0);
        }
    }

    class C61451 implements C1247e<Drawable> {
        final /* synthetic */ C7447m f16630a;

        C61451(C7447m c7447m) {
            this.f16630a = c7447m;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7721m c7721m = (C7721m) this.f16630a.f16244a;
            if (!this.f16630a.f21842u) {
                this.f16630a.f21842u = true;
                if (c7721m.f24324Q > 0 && c7721m.f24325R > 0) {
                    Point b = C2491i.m6807b(this.f16630a.f21839r, c7721m.f24324Q, c7721m.f24325R);
                    this.f16630a.m19898a(b.x, b.y);
                }
            }
            return false;
        }
    }

    class C68873 extends C6222c {
        final /* synthetic */ C7447m f19624a;

        C68873(C7447m c7447m) {
            this.f19624a = c7447m;
        }

        public final void mo2382a(int i, int i2) {
        }

        public final void mo2383a(C4113d c4113d) {
            this.f19624a.c.runOnUiThread(new C35608(this.f19624a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19624a.m19901a(this.f19624a.f21823A);
            }
        }

        public final void mo2384a(C4113d c4113d, int i) {
        }

        public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
            this.f19624a.m19904b();
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
            this.f19624a.c.runOnUiThread(new C35608(this.f19624a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19624a.m19901a(this.f19624a.f21823A);
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
            this.f19624a.c.runOnUiThread(new C35608(this.f19624a));
            C4121n.m8000b();
        }
    }

    public C7447m(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, boolean z, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g, C3289j c3289j) {
        C7346b c7346b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_video_channel_direct_output_list_item : R.layout.chat_video_channel_direct_output_list_item_old, c3280a, c3286g, c3284e);
        c7346b.f21844w = true;
        c7346b.f21824B = true ^ C2535a.m6888a().au();
        c7346b.f21825C = new C61451(c7346b);
        c7346b.c = activity;
        c7346b.f21837p = c3284e;
        c7346b.f21838q = c3283d;
        c7346b.f21843v = c3289j;
        c7346b.f21826e = z;
        c7346b.f21839r = i3;
        c7346b.f21827f = (ImageView) c7346b.itemView.findViewById(R.id.content_imageView);
        c7346b.f21828g = (TextView) c7346b.itemView.findViewById(R.id.video_length_textView);
        c7346b.f21829h = (TextView) c7346b.itemView.findViewById(R.id.video_size_textView);
        c7346b.f21831j = (ImageView) c7346b.itemView.findViewById(R.id.status_imageView);
        c7346b.f21833l = c7346b.itemView.findViewById(R.id.bottom_gradient_view);
        c7346b.f21834m = c7346b.itemView.findViewById(R.id.top_gradient_view);
        c7346b.f21835n = (ImageButton) c7346b.itemView.findViewById(R.id.action_imageView);
        c7346b.f21832k = (TextView) c7346b.itemView.findViewById(R.id.progress_text_action_view);
        c7346b.f21836o = (ProgressWheel) c7346b.itemView.findViewById(R.id.progress_wheel);
        c7346b.f21840s = (RelativeLayout) c7346b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7346b.f21841t = (ImageView) c7346b.itemView.findViewById(R.id.actionDownloadChatFile);
        c7346b.f21845x = (TextureView) c7346b.itemView.findViewById(R.id.textureView1);
        c7346b.f21830i = (ImageButton) c7346b.itemView.findViewById(R.id.action_image_option);
        c7346b.f21846y = (VideoView) c7346b.itemView.findViewById(R.id.video_view);
        c7346b.f21846y.f11710a = new C68873(c7346b);
        c7346b.f21845x.setOnClickListener(new C35564(c7346b));
        c7346b.f21841t.setOnClickListener(new C35575(c7346b));
        m19898a(i3, i2);
        c7346b.f21835n.setOnClickListener(new C35586(c7346b));
        c7346b.f21827f.setOnClickListener(new C35597(c7346b));
    }

    private void m19897a() {
        if (this.f21835n != null) {
            this.f21835n.setVisibility(8);
        }
    }

    private void m19898a(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.f21827f.getLayoutParams();
        layoutParams.height = i2;
        if (this.f21824B) {
            layoutParams.width = i;
        }
        int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        LayoutParams layoutParams2 = (LayoutParams) this.f21833l.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f21824B) {
            layoutParams2.width = i;
        }
        layoutParams2 = (LayoutParams) this.f21834m.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f21824B) {
            layoutParams2.width = i;
        }
        layoutParams = (LayoutParams) this.f21846y.getLayoutParams();
        layoutParams.height = i2;
        if (this.f21824B) {
            layoutParams.width = i;
        }
        layoutParams = (LayoutParams) this.f21845x.getLayoutParams();
        layoutParams.height = i2;
        if (this.f21824B) {
            layoutParams.width = i;
        }
    }

    private void m19901a(C7721m c7721m) {
        this.f21843v.mo2336g(c7721m.f20777c, c7721m.f24326S);
        String str = c7721m.f20777c;
        if (this.f21846y != null) {
            C4113d player = this.f21846y.getPlayer();
            if (!(player == null || player.f11761f)) {
                if (player.isPlaying()) {
                    player.m7967b();
                    if (this.f21835n != null) {
                        this.f21835n.setVisibility(0);
                        m19904b();
                    }
                    C4121n.m8000b();
                    return;
                }
                C4121n.f11799a = str;
                m19897a();
                player.seekTo(0);
                player.start();
            }
        }
    }

    private void m19902a(C7721m c7721m, C2971k c2971k) {
        boolean z = ((c7721m.f24333Z == null || c7721m.f24333Z.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f21835n, z);
    }

    private void m19904b() {
        this.c.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C7447m f10715a;

            {
                this.f10715a = r1;
            }

            public final void run() {
                this.f10715a.f21846y.getCoverView().setVisibility(0);
            }
        });
    }

    private void m19907c() {
        if (this.f21830i != null) {
            this.f21830i.setVisibility(8);
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7721m c7721m = (C7721m) c6829g;
        this.f21823A = c7721m;
        Object a = C2613o.m7045a(c7721m.f24331X, c7721m.f24332Y, c7721m.f24326S, c7721m.f24327T, c7721m.f21300A);
        C1247e c1247e = null;
        this.f21827f.setImageBitmap(null);
        this.f21842u = false;
        if (c7721m.f24331X == C2987i.FINISHED && this.f21826e) {
            this.f21844w = C2476b.m6722a(c7721m.f24326S);
        }
        Point a2 = this.f21824B ? C2491i.m6763a(this.f21839r, c7721m.f24324Q, c7721m.f24325R) : null;
        C1274i a3;
        if (this.f21844w) {
            this.f21845x.setVisibility(8);
            this.f21846y.setVisibility(8);
            boolean z = c7721m.f24324Q > 0 && c7721m.f24325R > 0;
            C1248f c1248f = new C1248f();
            int i2 = (z && this.f21824B) ? a2.x : this.f21839r;
            int i3 = (z && this.f21824B) ? a2.y : this.f21839r;
            C1248f b = c1248f.m2954b(i2, i3);
            if (!z || this.f21824B) {
                c1247e = this.f21825C;
            }
            a3 = C1212c.m2872a(this.c).m10950a(a).m3034a(b).m3033a();
            a3.f3986c = c1247e;
            a3.m3031a(this.f21827f);
        } else {
            a3 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(new C1248f().m2954b(this.f21824B ? a2.x : this.f21839r, this.f21824B ? a2.y : this.f21839r));
            if (this.f21824B) {
                c1247e = this.f21825C;
            }
            a3.f3986c = c1247e;
            a3.m3031a(this.f21846y.getCoverView());
            this.f21846y.getVideoInfo().f11701e = false;
            this.f21846y.m7923a(c7721m.f24326S).m7922a(c7721m.f20777c);
            this.f21846y.setVisibility(0);
            this.f21845x.setVisibility(0);
            if (C4121n.f11799a.equalsIgnoreCase(c7721m.f20777c)) {
                final int i4 = C4121n.f11800b;
                if (i4 > 0) {
                    this.c.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C7447m f10724b;

                        public final void run() {
                            if (this.f10724b.f21846y != null) {
                                C4113d player = this.f10724b.f21846y.getPlayer();
                                if (player != null && !player.f11761f) {
                                    this.f10724b.m19897a();
                                    player.seekTo(i4);
                                    player.start();
                                }
                            }
                        }
                    });
                }
            } else {
                m19904b();
            }
        }
        this.f21828g.setText(C2491i.m6774a(this.c, (long) c7721m.f24329V, true));
        this.f21829h.setText(c7721m.f24330W);
        switch (c7721m.f21337w) {
            case ERROR:
                imageView = this.f21831j;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f21831j;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f21831j;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f21831j;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        m19907c();
        switch (c7721m.f24331X) {
            case FINISHED:
                this.f21836o.setVisibility(8);
                this.f21841t.setVisibility(8);
                this.f21832k.setVisibility(8);
                this.f21835n.setImageResource(R.drawable.ic_video_play);
                if (!this.f21844w) {
                    if (this.f21830i != null) {
                        this.f21830i.setVisibility(0);
                    }
                    if (this.f21847z) {
                        this.f21847z = false;
                        m19901a(c7721m);
                        break;
                    }
                }
                this.f21835n.setVisibility(0);
                m19907c();
                break;
                break;
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21836o.setVisibility(8);
                this.f21835n.setVisibility(0);
                this.f21832k.setVisibility(8);
                this.f21841t.setVisibility(8);
                m19902a(c7721m, c7721m.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21836o.setVisibility(0);
                this.f21835n.setVisibility(0);
                this.f21835n.setImageResource(R.drawable.ic_file_stop_download);
                this.f21832k.setVisibility(0);
                this.f21832k.setText(c7721m.f24323P);
                if (c7721m.f24328U > 0) {
                    progressWheel = this.f21836o;
                    f = ((float) c7721m.f24328U) * 0.01f;
                } else {
                    progressWheel = this.f21836o;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f21841t.setVisibility(8);
                this.f21847z = true;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7721m, this.f21840s, true);
    }
}
