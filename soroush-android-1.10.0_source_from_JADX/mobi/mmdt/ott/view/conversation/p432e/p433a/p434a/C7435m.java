package mobi.mmdt.ott.view.conversation.p432e.p433a.p434a;

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
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p418a.C3289j;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p434a.C7435m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7709m;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C6222c;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.VideoView;
import mobi.mmdt.ott.view.tools.C4515k;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7435m extends C7345b {
    private boolean f21670A;
    private C1247e<Drawable> f21671B;
    private final boolean f21672d;
    private ImageView f21673e;
    private TextView f21674f;
    private TextView f21675g;
    private ImageButton f21676h;
    private View f21677i;
    private View f21678j;
    private ImageButton f21679k;
    private ProgressWheel f21680l;
    private C3284e f21681m;
    private C3283d f21682n;
    private int f21683o;
    private RelativeLayout f21684p;
    private ImageView f21685q;
    private boolean f21686r;
    private TextView f21687s;
    private C3289j f21688t;
    private boolean f21689u;
    private TextureView f21690v;
    private VideoView f21691w;
    private Uri f21692x;
    private C7709m f21693y;
    private boolean f21694z;

    class C35154 implements OnClickListener {
        final /* synthetic */ C7435m f10664a;

        C35154(C7435m c7435m) {
            this.f10664a = c7435m;
        }

        public final void onClick(View view) {
            C7709m c7709m = (C7709m) this.f10664a.f16244a;
            if (C35142.f10663a[c7709m.f24214X.ordinal()] == 1) {
                this.f10664a.m19817a(c7709m);
            }
        }
    }

    class C35165 implements OnClickListener {
        final /* synthetic */ C7435m f10665a;

        C35165(C7435m c7435m) {
            this.f10665a = c7435m;
        }

        public final void onClick(View view) {
            this.f10665a.f21681m.mo2331e(((C7709m) this.f10665a.f16244a).f24209S);
        }
    }

    class C35176 implements OnClickListener {
        final /* synthetic */ C7435m f10666a;

        C35176(C7435m c7435m) {
            this.f10666a = c7435m;
        }

        public final void onClick(View view) {
            C7709m c7709m = (C7709m) this.f10666a.f16244a;
            switch (c7709m.f24214X) {
                case FINISHED:
                    if (this.f10666a.f21689u) {
                        this.f10666a.f21682n.mo2309a(c7709m.f24209S, null);
                        return;
                    } else {
                        this.f10666a.m19817a(c7709m);
                        return;
                    }
                case DELETED:
                case NOT_STARTED:
                    this.f10666a.f21681m.mo2307a(c7709m.ac, true);
                    return;
                case TRANSMITTING:
                    this.f10666a.f21681m.mo2305a(c7709m.ac);
                    return;
                case CANCEL:
                    this.f10666a.f21681m.mo2307a(c7709m.ac, true);
                    return;
                case ERROR:
                    this.f10666a.f21681m.mo2307a(c7709m.ac, true);
                    return;
                default:
                    return;
            }
        }
    }

    class C35187 implements OnClickListener {
        final /* synthetic */ C7435m f10667a;

        C35187(C7435m c7435m) {
            this.f10667a = c7435m;
        }

        public final void onClick(View view) {
            C7709m c7709m = (C7709m) this.f10667a.f16244a;
            if (C35142.f10663a[c7709m.f24214X.ordinal()] == 1) {
                this.f10667a.f21682n.mo2309a(c7709m.f24209S, null);
            }
        }
    }

    class C35198 implements Runnable {
        final /* synthetic */ C7435m f10668a;

        C35198(C7435m c7435m) {
            this.f10668a = c7435m;
        }

        public final void run() {
            this.f10668a.f21679k.setImageResource(R.drawable.ic_video_play);
            this.f10668a.f21679k.setVisibility(0);
        }
    }

    class C61391 implements C1247e<Drawable> {
        final /* synthetic */ C7435m f16624a;

        C61391(C7435m c7435m) {
            this.f16624a = c7435m;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7709m c7709m = (C7709m) this.f16624a.f16244a;
            if (!this.f16624a.f21686r) {
                this.f16624a.f21686r = true;
                if (c7709m.f24207Q > 0 && c7709m.f24208R > 0) {
                    Point b = C2491i.m6807b(this.f16624a.f21683o, c7709m.f24207Q, c7709m.f24208R);
                    this.f16624a.m19814a(b.x, b.y);
                }
            }
            return false;
        }
    }

    class C68853 extends C6222c {
        final /* synthetic */ C7435m f19622a;

        C68853(C7435m c7435m) {
            this.f19622a = c7435m;
        }

        public final void mo2382a(int i, int i2) {
        }

        public final void mo2383a(C4113d c4113d) {
            this.f19622a.c.runOnUiThread(new C35198(this.f19622a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19622a.m19817a(this.f19622a.f21693y);
            }
        }

        public final void mo2384a(C4113d c4113d, int i) {
        }

        public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
            this.f19622a.m19819b();
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
            this.f19622a.c.runOnUiThread(new C35198(this.f19622a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19622a.m19817a(this.f19622a.f21693y);
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
            this.f19622a.c.runOnUiThread(new C35198(this.f19622a));
            C4121n.m8000b();
        }
    }

    public C7435m(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, boolean z, C3284e c3284e, C3288i c3288i, C3283d c3283d, C3286g c3286g, C3289j c3289j) {
        C7345b c7345b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_video_channel_direct_input_list_item : R.layout.chat_video_channel_direct_input_list_item_old, c3288i, c3286g, c3284e);
        c7345b.f21689u = true;
        c7345b.f21670A = true ^ C2535a.m6888a().au();
        c7345b.f21671B = new C61391(c7345b);
        c7345b.f21681m = c3284e;
        c7345b.f21682n = c3283d;
        c7345b.f21688t = c3289j;
        c7345b.f21672d = z;
        c7345b.f21683o = i3;
        c7345b.f21673e = (ImageView) c7345b.itemView.findViewById(R.id.content_imageView);
        c7345b.f21674f = (TextView) c7345b.itemView.findViewById(R.id.video_length_textView);
        c7345b.f21675g = (TextView) c7345b.itemView.findViewById(R.id.video_size_textView);
        c7345b.f21677i = c7345b.itemView.findViewById(R.id.bottom_gradient_view);
        c7345b.f21678j = c7345b.itemView.findViewById(R.id.top_gradient_view);
        c7345b.f21679k = (ImageButton) c7345b.itemView.findViewById(R.id.action_imageView);
        c7345b.f21680l = (ProgressWheel) c7345b.itemView.findViewById(R.id.progress_wheel);
        c7345b.f21684p = (RelativeLayout) c7345b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7345b.f21685q = (ImageView) c7345b.itemView.findViewById(R.id.actionDownloadChatFile);
        c7345b.f21687s = (TextView) c7345b.itemView.findViewById(R.id.progress_text_action_view);
        c7345b.f21690v = (TextureView) c7345b.itemView.findViewById(R.id.textureView1);
        c7345b.f21676h = (ImageButton) c7345b.itemView.findViewById(R.id.action_image_option);
        c7345b.f21691w = (VideoView) c7345b.itemView.findViewById(R.id.video_view);
        c7345b.f21691w.f11710a = new C68853(c7345b);
        c7345b.f21690v.setOnClickListener(new C35154(c7345b));
        c7345b.f21685q.setOnClickListener(new C35165(c7345b));
        m19814a(i3, i2);
        c7345b.f21679k.setOnClickListener(new C35176(c7345b));
        c7345b.f21673e.setOnClickListener(new C35187(c7345b));
    }

    private void m19813a() {
        if (this.f21679k != null) {
            this.f21679k.setVisibility(8);
        }
    }

    private void m19814a(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.f21673e.getLayoutParams();
        layoutParams.height = i2;
        if (this.f21670A) {
            layoutParams.width = i;
        }
        int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        LayoutParams layoutParams2 = (LayoutParams) this.f21677i.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f21670A) {
            layoutParams2.width = i;
        }
        layoutParams2 = (LayoutParams) this.f21678j.getLayoutParams();
        layoutParams2.height = dimension;
        if (this.f21670A) {
            layoutParams2.width = i;
        }
        layoutParams = (LayoutParams) this.f21691w.getLayoutParams();
        layoutParams.height = i2;
        if (this.f21670A) {
            layoutParams.width = i;
        }
        layoutParams = (LayoutParams) this.f21690v.getLayoutParams();
        layoutParams.height = i2;
        if (this.f21670A) {
            layoutParams.width = i;
        }
    }

    private void m19817a(C7709m c7709m) {
        this.f21688t.mo2336g(c7709m.f20777c, c7709m.f24209S);
        String str = c7709m.f20777c;
        if (this.f21691w != null) {
            C4113d player = this.f21691w.getPlayer();
            if (!(player == null || player.f11761f)) {
                if (player.isPlaying()) {
                    player.m7967b();
                    if (this.f21679k != null) {
                        this.f21679k.setVisibility(0);
                        m19819b();
                    }
                    C4121n.m8000b();
                    return;
                }
                C4121n.f11799a = str;
                m19813a();
                player.seekTo(0);
                player.start();
            }
        }
    }

    private void m19819b() {
        this.c.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C7435m f10662a;

            {
                this.f10662a = r1;
            }

            public final void run() {
                this.f10662a.f21691w.getCoverView().setVisibility(0);
            }
        });
    }

    private void m19822c() {
        if (this.f21676h != null) {
            this.f21676h.setVisibility(8);
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7709m c7709m = (C7709m) c6829g;
        this.f21693y = c7709m;
        Object a = C2613o.m7045a(c7709m.f24214X, c7709m.f24215Y, c7709m.f24209S, c7709m.f24210T, c7709m.f21300A);
        this.f21686r = false;
        if (c7709m.f24214X == C2987i.FINISHED && this.f21672d) {
            this.f21689u = C2476b.m6722a(c7709m.f24209S);
        }
        C5255m a2 = C4515k.m8230a(c7709m.f24214X, c7709m.f24209S);
        C1247e c1247e = null;
        C1248f b;
        C1274i a3;
        Point a4;
        if (this.f21689u) {
            this.f21690v.setVisibility(8);
            this.f21691w.setVisibility(8);
            if (this.f21692x == null || !this.f21692x.equals(a)) {
                this.f21673e.setVisibility(0);
                this.f21673e.setImageBitmap(null);
                if (c7709m.f24207Q <= 0 || c7709m.f24208R <= 0) {
                    b = new C1248f().m2954b(this.f21683o, this.f21683o);
                    if (a2 != null) {
                        b.m2951a(a2);
                    }
                    a3 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                    a3.f3986c = this.f21671B;
                    a3 = a3.m3034a(b);
                } else {
                    a4 = this.f21670A ? C2491i.m6763a(this.f21683o, c7709m.f24207Q, c7709m.f24208R) : null;
                    b = new C1248f().m2954b(this.f21670A ? a4.x : this.f21683o, this.f21670A ? a4.y : this.f21683o);
                    if (a2 != null) {
                        b.m2951a(a2);
                    }
                    a3 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(b);
                    if (this.f21670A) {
                        c1247e = this.f21671B;
                    }
                    a3.f3986c = c1247e;
                }
                a3.m3031a(this.f21673e);
            }
        } else {
            if (this.f21692x == null || !this.f21692x.equals(a)) {
                this.f21673e.setImageBitmap(null);
                this.f21673e.setVisibility(8);
                a4 = this.f21670A ? C2491i.m6763a(this.f21683o, c7709m.f24207Q, c7709m.f24208R) : null;
                b = new C1248f().m2954b(this.f21670A ? a4.x : this.f21683o, this.f21670A ? a4.y : this.f21683o);
                if (a2 != null) {
                    b.m2951a(a2);
                }
                a3 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(b);
                if (this.f21670A) {
                    c1247e = this.f21671B;
                }
                a3.f3986c = c1247e;
                a3.m3031a(this.f21691w.getCoverView());
            }
            this.f21691w.getVideoInfo().f11701e = false;
            this.f21691w.m7923a(c7709m.f24209S).m7922a(c7709m.f20777c);
            this.f21691w.setVisibility(0);
            this.f21690v.setVisibility(0);
            if (C4121n.f11799a.equalsIgnoreCase(c7709m.f20777c)) {
                final int i = C4121n.f11800b;
                if (i > 0) {
                    this.c.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C7435m f10670b;

                        public final void run() {
                            if (this.f10670b.f21691w != null) {
                                C4113d player = this.f10670b.f21691w.getPlayer();
                                if (player != null && !player.f11761f) {
                                    this.f10670b.m19813a();
                                    player.seekTo(i);
                                    player.start();
                                }
                            }
                        }
                    });
                }
            } else {
                m19819b();
            }
        }
        this.f21692x = a;
        this.f21674f.setText(C2491i.m6774a(this.c, (long) c7709m.f24212V, true));
        this.f21675g.setText(c7709m.f24213W);
        m19822c();
        switch (c7709m.f24214X) {
            case FINISHED:
                this.f21680l.setVisibility(8);
                this.f21685q.setVisibility(8);
                this.f21687s.setVisibility(8);
                this.f21679k.setImageResource(R.drawable.ic_video_play);
                if (!this.f21689u) {
                    if (this.f21676h != null) {
                        this.f21676h.setVisibility(0);
                    }
                    if (this.f21694z) {
                        this.f21694z = false;
                        m19817a(c7709m);
                        break;
                    }
                }
                this.f21679k.setVisibility(0);
                m19822c();
                break;
                break;
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21680l.setVisibility(8);
                this.f21679k.setVisibility(0);
                this.f21679k.setImageResource(R.drawable.ic_file_start_download);
                this.f21685q.setVisibility(8);
                this.f21687s.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21680l.setVisibility(0);
                this.f21679k.setVisibility(0);
                this.f21679k.setImageResource(R.drawable.ic_file_stop_download);
                this.f21687s.setVisibility(0);
                this.f21687s.setText(c7709m.f24206P);
                if (c7709m.f24211U > 0) {
                    progressWheel = this.f21680l;
                    f = ((float) c7709m.f24211U) * 0.01f;
                } else {
                    progressWheel = this.f21680l;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f21685q.setVisibility(8);
                this.f21694z = true;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7709m, this.f21684p, false);
    }
}
