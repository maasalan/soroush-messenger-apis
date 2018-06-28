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
import mobi.mmdt.ott.view.conversation.p432e.p433a.p439f.C7498m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7633m;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C6222c;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.VideoView;
import mobi.mmdt.ott.view.tools.C4520n;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7498m extends C7350b {
    private boolean f22427A;
    private C7633m f22428B;
    private boolean f22429C;
    private C1247e<Drawable> f22430D;
    private final boolean f22431e;
    private ImageView f22432f;
    private TextView f22433g;
    private TextView f22434h;
    private TextView f22435i;
    private ImageButton f22436j;
    private ImageView f22437k;
    private View f22438l;
    private View f22439m;
    private ImageButton f22440n;
    private TextView f22441o;
    private ProgressWheel f22442p;
    private C3284e f22443q;
    private C3283d f22444r;
    private int f22445s;
    private RelativeLayout f22446t;
    private ImageView f22447u;
    private boolean f22448v;
    private C3289j f22449w;
    private boolean f22450x;
    private TextureView f22451y;
    private VideoView f22452z;

    class C37614 implements OnClickListener {
        final /* synthetic */ C7498m f11090a;

        C37614(C7498m c7498m) {
            this.f11090a = c7498m;
        }

        public final void onClick(View view) {
            C7633m c7633m = (C7633m) this.f11090a.f16244a;
            if (C37602.f11088a[c7633m.ac.ordinal()] == 1) {
                this.f11090a.m20233a(c7633m);
            }
        }
    }

    class C37625 implements OnClickListener {
        final /* synthetic */ C7498m f11091a;

        C37625(C7498m c7498m) {
            this.f11091a = c7498m;
        }

        public final void onClick(View view) {
            this.f11091a.f22443q.mo2331e(((C7633m) this.f11091a.f16244a).f23499S);
        }
    }

    class C37636 implements OnClickListener {
        final /* synthetic */ C7498m f11092a;

        C37636(C7498m c7498m) {
            this.f11092a = c7498m;
        }

        public final void onClick(View view) {
            C7633m c7633m = (C7633m) this.f11092a.f16244a;
            switch (c7633m.ac) {
                case FINISHED:
                    if (this.f11092a.f22450x) {
                        this.f11092a.f22444r.mo2309a(c7633m.f23499S, c7633m.f23501U);
                        return;
                    } else {
                        this.f11092a.m20233a(c7633m);
                        return;
                    }
                case DELETED:
                case NOT_STARTED:
                    if (c7633m.af == null || c7633m.af.isEmpty()) {
                        this.f11092a.f22443q.mo2307a(c7633m.f23095W, false);
                        return;
                    } else {
                        this.f11092a.f22443q.mo2307a(c7633m.f23095W, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11092a.f22443q.mo2305a(c7633m.f23095W);
                    return;
                case CANCEL:
                    if (c7633m.af == null || c7633m.af.isEmpty()) {
                        this.f11092a.f22443q.mo2307a(c7633m.f23095W, false);
                        return;
                    } else {
                        this.f11092a.f22443q.mo2307a(c7633m.f23095W, true);
                        return;
                    }
                case ERROR:
                    if (c7633m.af == null || c7633m.af.isEmpty()) {
                        this.f11092a.f22443q.mo2307a(c7633m.f23095W, false);
                        return;
                    } else {
                        this.f11092a.f22443q.mo2307a(c7633m.f23095W, true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C37647 implements OnClickListener {
        final /* synthetic */ C7498m f11093a;

        C37647(C7498m c7498m) {
            this.f11093a = c7498m;
        }

        public final void onClick(View view) {
            C7633m c7633m = (C7633m) this.f11093a.f16244a;
            if (c7633m.af == null || c7633m.af.isEmpty()) {
                int[] iArr = C37602.f11088a;
                c7633m.ac.ordinal();
                this.f11093a.f22444r.mo2309a(c7633m.f23499S, c7633m.f23501U);
            } else if (c7633m.ac == C2987i.FINISHED) {
                this.f11093a.f22444r.mo2309a(c7633m.f23499S, c7633m.f23501U);
            }
        }
    }

    class C37658 implements Runnable {
        final /* synthetic */ C7498m f11094a;

        C37658(C7498m c7498m) {
            this.f11094a = c7498m;
        }

        public final void run() {
            this.f11094a.f22440n.setImageResource(R.drawable.ic_video_play);
            this.f11094a.f22440n.setVisibility(0);
        }
    }

    class C61721 implements C1247e<Drawable> {
        final /* synthetic */ C7498m f16689a;

        C61721(C7498m c7498m) {
            this.f16689a = c7498m;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7633m c7633m = (C7633m) this.f16689a.f16244a;
            if (!this.f16689a.f22448v) {
                this.f16689a.f22448v = true;
                if (c7633m.f23497Q > 0 && c7633m.f23498R > 0) {
                    Point b = C2491i.m6807b(this.f16689a.f22445s, c7633m.f23497Q, c7633m.f23498R);
                    this.f16689a.m20230a(b.x, b.y);
                }
            }
            return false;
        }
    }

    class C68963 extends C6222c {
        final /* synthetic */ C7498m f19637a;

        C68963(C7498m c7498m) {
            this.f19637a = c7498m;
        }

        public final void mo2382a(int i, int i2) {
        }

        public final void mo2383a(C4113d c4113d) {
            this.f19637a.c.runOnUiThread(new C37658(this.f19637a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19637a.m20233a(this.f19637a.f22428B);
            }
        }

        public final void mo2384a(C4113d c4113d, int i) {
        }

        public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
            this.f19637a.m20236b();
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
            this.f19637a.c.runOnUiThread(new C37658(this.f19637a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19637a.m20233a(this.f19637a.f22428B);
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
            this.f19637a.c.runOnUiThread(new C37658(this.f19637a));
            C4121n.m8000b();
        }
    }

    public C7498m(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, boolean z, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g, C3289j c3289j) {
        C7350b c7350b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_video_captioned_channel_output_list_item : R.layout.chat_video_captioned_channel_output_list_item_old, c3280a, c3286g, c3284e);
        c7350b.f22450x = true;
        c7350b.f22429C = true ^ C2535a.m6888a().au();
        c7350b.f22430D = new C61721(c7350b);
        c7350b.f22443q = c3284e;
        c7350b.f22444r = c3283d;
        c7350b.f22449w = c3289j;
        c7350b.f22431e = z;
        c7350b.f22445s = i3;
        c7350b.f22432f = (ImageView) c7350b.itemView.findViewById(R.id.content_imageView);
        c7350b.f22433g = (TextView) c7350b.itemView.findViewById(R.id.caption_textView);
        c7350b.f22434h = (TextView) c7350b.itemView.findViewById(R.id.video_length_textView);
        c7350b.f22435i = (TextView) c7350b.itemView.findViewById(R.id.video_size_textView);
        c7350b.f22437k = (ImageView) c7350b.itemView.findViewById(R.id.status_imageView);
        c7350b.f22438l = c7350b.itemView.findViewById(R.id.bottom_gradient_view);
        c7350b.f22439m = c7350b.itemView.findViewById(R.id.top_gradient_view);
        c7350b.f22440n = (ImageButton) c7350b.itemView.findViewById(R.id.action_imageView);
        c7350b.f22441o = (TextView) c7350b.itemView.findViewById(R.id.progress_text_action_view);
        c7350b.f22442p = (ProgressWheel) c7350b.itemView.findViewById(R.id.progress_wheel);
        c7350b.f22446t = (RelativeLayout) c7350b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7350b.f22447u = (ImageView) c7350b.itemView.findViewById(R.id.actionDownloadChatFile);
        c7350b.f22451y = (TextureView) c7350b.itemView.findViewById(R.id.textureView1);
        c7350b.f22436j = (ImageButton) c7350b.itemView.findViewById(R.id.action_image_option);
        c7350b.f22452z = (VideoView) c7350b.itemView.findViewById(R.id.video_view);
        c7350b.f22452z.f11710a = new C68963(c7350b);
        c7350b.f22451y.setOnClickListener(new C37614(c7350b));
        c7350b.f22447u.setOnClickListener(new C37625(c7350b));
        m20230a(i3, i2);
        c7350b.f22440n.setOnClickListener(new C37636(c7350b));
        c7350b.f22432f.setOnClickListener(new C37647(c7350b));
    }

    private void m20229a() {
        if (this.f22440n != null) {
            this.f22440n.setVisibility(8);
        }
    }

    private void m20230a(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.f22432f.getLayoutParams();
        layoutParams.height = i2;
        if (this.f22429C) {
            layoutParams.width = i;
        }
        int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        LayoutParams layoutParams2 = (LayoutParams) this.f22438l.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f22429C) {
            layoutParams2.width = i;
        }
        layoutParams2 = (LayoutParams) this.f22439m.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f22429C) {
            layoutParams2.width = i;
        }
        layoutParams = (LayoutParams) this.f22452z.getLayoutParams();
        layoutParams.height = i2;
        if (this.f22429C) {
            layoutParams.width = i;
        }
        layoutParams = (LayoutParams) this.f22451y.getLayoutParams();
        layoutParams.height = i2;
        if (this.f22429C) {
            layoutParams.width = i;
        }
    }

    private void m20233a(C7633m c7633m) {
        this.f22449w.mo2336g(c7633m.f20777c, c7633m.f23499S);
        String str = c7633m.f20777c;
        if (this.f22452z != null) {
            C4113d player = this.f22452z.getPlayer();
            if (!(player == null || player.f11761f)) {
                if (player.isPlaying()) {
                    player.m7967b();
                    if (this.f22440n != null) {
                        this.f22440n.setVisibility(0);
                        m20236b();
                    }
                    C4121n.m8000b();
                    return;
                }
                C4121n.f11799a = str;
                m20229a();
                player.seekTo(0);
                player.start();
            }
        }
    }

    private void m20234a(C7633m c7633m, C2971k c2971k) {
        boolean z = ((c7633m.af == null || c7633m.af.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22440n, z);
    }

    private void m20236b() {
        this.c.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C7498m f11087a;

            {
                this.f11087a = r1;
            }

            public final void run() {
                this.f11087a.f22452z.getCoverView().setVisibility(0);
            }
        });
    }

    private void m20239c() {
        if (this.f22436j != null) {
            this.f22436j.setVisibility(8);
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7633m c7633m = (C7633m) c6829g;
        this.f22428B = c7633m;
        Object a = C2613o.m7045a(c7633m.ac, c7633m.ad, c7633m.f23499S, c7633m.f23500T, c7633m.f21300A);
        C1247e c1247e = null;
        this.f22432f.setImageBitmap(null);
        this.f22448v = false;
        if (c7633m.ac == C2987i.FINISHED && this.f22431e) {
            this.f22450x = C2476b.m6722a(c7633m.f23499S);
        }
        Point a2 = this.f22429C ? C2491i.m6763a(this.f22445s, c7633m.f23497Q, c7633m.f23498R) : null;
        C1274i a3;
        if (this.f22450x) {
            this.f22451y.setVisibility(8);
            this.f22452z.setVisibility(8);
            boolean z = c7633m.f23497Q > 0 && c7633m.f23498R > 0;
            C1248f c1248f = new C1248f();
            int i2 = (z && this.f22429C) ? a2.x : this.f22445s;
            int i3 = (z && this.f22429C) ? a2.y : this.f22445s;
            C1248f b = c1248f.m2954b(i2, i3);
            if (!z || this.f22429C) {
                c1247e = this.f22430D;
            }
            a3 = C1212c.m2872a(this.c).m10950a(a).m3034a(b).m3033a();
            a3.f3986c = c1247e;
            a3.m3031a(this.f22432f);
        } else {
            a3 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(new C1248f().m2954b(this.f22429C ? a2.x : this.f22445s, this.f22429C ? a2.y : this.f22445s));
            if (this.f22429C) {
                c1247e = this.f22430D;
            }
            a3.f3986c = c1247e;
            a3.m3031a(this.f22452z.getCoverView());
            this.f22452z.getVideoInfo().f11701e = false;
            this.f22452z.m7923a(c7633m.f23499S).m7922a(c7633m.f20777c);
            this.f22452z.setVisibility(0);
            this.f22451y.setVisibility(0);
            if (C4121n.f11799a.equalsIgnoreCase(c7633m.f20777c)) {
                final int i4 = C4121n.f11800b;
                if (i4 > 0) {
                    this.c.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C7498m f11096b;

                        public final void run() {
                            if (this.f11096b.f22452z != null) {
                                C4113d player = this.f11096b.f22452z.getPlayer();
                                if (player != null && !player.f11761f) {
                                    this.f11096b.m20229a();
                                    player.seekTo(i4);
                                    player.start();
                                }
                            }
                        }
                    });
                }
            } else {
                m20236b();
            }
        }
        this.f22434h.setText(C2491i.m6774a(this.c, (long) c7633m.aa, true));
        this.f22435i.setText(c7633m.ab);
        if (c7633m.f23501U == null || c7633m.f23501U.isEmpty()) {
            this.f22433g.setVisibility(8);
        } else {
            this.f22433g.setText(c7633m.f23501U);
            this.f22433g.setVisibility(0);
            this.f22433g.setTextSize((float) c7633m.ae);
            C4520n.m8234a(this.f22433g);
        }
        switch (c7633m.f21337w) {
            case ERROR:
                imageView = this.f22437k;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22437k;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22437k;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22437k;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        m20239c();
        switch (c7633m.ac) {
            case FINISHED:
                this.f22442p.setVisibility(8);
                this.f22447u.setVisibility(8);
                this.f22441o.setVisibility(8);
                this.f22440n.setImageResource(R.drawable.ic_video_play);
                if (!this.f22450x) {
                    if (this.f22436j != null) {
                        this.f22436j.setVisibility(0);
                    }
                    if (this.f22427A) {
                        this.f22427A = false;
                        m20233a(c7633m);
                        break;
                    }
                }
                this.f22440n.setVisibility(0);
                m20239c();
                break;
                break;
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22442p.setVisibility(8);
                this.f22440n.setVisibility(0);
                this.f22441o.setVisibility(8);
                this.f22447u.setVisibility(8);
                m20234a(c7633m, c7633m.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22442p.setVisibility(0);
                this.f22440n.setVisibility(0);
                this.f22440n.setImageResource(R.drawable.ic_file_stop_download);
                this.f22441o.setVisibility(0);
                this.f22441o.setText(c7633m.f23496P);
                if (c7633m.f23502V > 0) {
                    progressWheel = this.f22442p;
                    f = ((float) c7633m.f23502V) * 0.01f;
                } else {
                    progressWheel = this.f22442p;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22447u.setVisibility(8);
                this.f22427A = true;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7633m, this.f22446t, true);
    }
}
