package mobi.mmdt.ott.view.conversation.p432e.p433a.p440g;

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
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p418a.C3289j;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p440g.C7512n;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7647n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C6222c;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.VideoView;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7512n extends C7351b {
    private C1247e<Drawable> f22599A = new C61801(this);
    private final boolean f22600d;
    private ImageView f22601e;
    private TextView f22602f;
    private TextView f22603g;
    private ImageButton f22604h;
    private View f22605i;
    private View f22606j;
    private ImageButton f22607k;
    private ProgressWheel f22608l;
    private C3284e f22609m;
    private C3283d f22610n;
    private int f22611o;
    private RelativeLayout f22612p;
    private ImageView f22613q;
    private boolean f22614r;
    private TextView f22615s;
    private C3289j f22616t;
    private boolean f22617u = true;
    private TextureView f22618v;
    private VideoView f22619w;
    private Uri f22620x;
    private boolean f22621y;
    private C7647n f22622z;

    class C38204 implements OnClickListener {
        final /* synthetic */ C7512n f11191a;

        C38204(C7512n c7512n) {
            this.f11191a = c7512n;
        }

        public final void onClick(View view) {
            C7647n c7647n = (C7647n) this.f11191a.f16244a;
            if (C38192.f11190a[c7647n.ac.ordinal()] == 1) {
                this.f11191a.m20342a(c7647n);
            }
        }
    }

    class C38215 implements OnClickListener {
        final /* synthetic */ C7512n f11192a;

        C38215(C7512n c7512n) {
            this.f11192a = c7512n;
        }

        public final void onClick(View view) {
            this.f11192a.f22609m.mo2331e(((C7647n) this.f11192a.f16244a).f23577S);
        }
    }

    class C38226 implements OnClickListener {
        final /* synthetic */ C7512n f11193a;

        C38226(C7512n c7512n) {
            this.f11193a = c7512n;
        }

        public final void onClick(View view) {
            C7647n c7647n = (C7647n) this.f11193a.f16244a;
            switch (c7647n.ac) {
                case FINISHED:
                    if (this.f11193a.f22617u) {
                        this.f11193a.f22610n.mo2309a(c7647n.f23577S, null);
                        return;
                    } else {
                        this.f11193a.m20342a(c7647n);
                        return;
                    }
                case DELETED:
                case NOT_STARTED:
                    this.f11193a.f22609m.mo2307a(c7647n.f23101W, true);
                    return;
                case TRANSMITTING:
                    this.f11193a.f22609m.mo2305a(c7647n.f23101W);
                    return;
                case CANCEL:
                    this.f11193a.f22609m.mo2307a(c7647n.f23101W, true);
                    return;
                case ERROR:
                    this.f11193a.f22609m.mo2307a(c7647n.f23101W, true);
                    return;
                default:
                    return;
            }
        }
    }

    class C38237 implements OnClickListener {
        final /* synthetic */ C7512n f11194a;

        C38237(C7512n c7512n) {
            this.f11194a = c7512n;
        }

        public final void onClick(View view) {
            C7647n c7647n = (C7647n) this.f11194a.f16244a;
            if (C38192.f11190a[c7647n.ac.ordinal()] == 1) {
                this.f11194a.f22610n.mo2309a(c7647n.f23577S, null);
            }
        }
    }

    class C38248 implements Runnable {
        final /* synthetic */ C7512n f11195a;

        C38248(C7512n c7512n) {
            this.f11195a = c7512n;
        }

        public final void run() {
            this.f11195a.f22607k.setImageResource(R.drawable.ic_video_play);
            this.f11195a.f22607k.setVisibility(0);
        }
    }

    class C61801 implements C1247e<Drawable> {
        final /* synthetic */ C7512n f16705a;

        C61801(C7512n c7512n) {
            this.f16705a = c7512n;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7647n c7647n = (C7647n) this.f16705a.f16244a;
            if (!this.f16705a.f22614r) {
                this.f16705a.f22614r = true;
                if (c7647n.f23575Q > 0 && c7647n.f23576R > 0) {
                    Point b = C2491i.m6807b(this.f16705a.f22611o, c7647n.f23575Q, c7647n.f23576R);
                    LayoutParams layoutParams = (LayoutParams) this.f16705a.f22601e.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                    int dimension = (int) this.f16705a.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
                    LayoutParams layoutParams2 = (LayoutParams) this.f16705a.f22605i.getLayoutParams();
                    layoutParams2.height = dimension;
                    layoutParams2.width = b.x;
                    layoutParams2 = (LayoutParams) this.f16705a.f22606j.getLayoutParams();
                    layoutParams2.height = dimension;
                    layoutParams2.width = b.x;
                    layoutParams = (LayoutParams) this.f16705a.f22619w.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                    layoutParams = (LayoutParams) this.f16705a.f22618v.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                }
            }
            return false;
        }
    }

    class C69003 extends C6222c {
        final /* synthetic */ C7512n f19643a;

        C69003(C7512n c7512n) {
            this.f19643a = c7512n;
        }

        public final void mo2382a(int i, int i2) {
        }

        public final void mo2383a(C4113d c4113d) {
            this.f19643a.c.runOnUiThread(new C38248(this.f19643a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19643a.m20342a(this.f19643a.f22622z);
            }
        }

        public final void mo2384a(C4113d c4113d, int i) {
        }

        public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
            this.f19643a.m20344b();
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
            this.f19643a.c.runOnUiThread(new C38248(this.f19643a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19643a.m20342a(this.f19643a.f22622z);
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
            this.f19643a.c.runOnUiThread(new C38248(this.f19643a));
            C4121n.m8000b();
        }
    }

    public C7512n(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, boolean z, C3284e c3284e, C3288i c3288i, C3283d c3283d, C3286g c3286g, C3289j c3289j) {
        int i3 = i;
        int i4 = i2;
        super(activity, layoutInflater, viewGroup, R.layout.chat_video_social_input_list_item, c3288i, c3286g, c3284e);
        this.f22609m = c3284e;
        this.f22610n = c3283d;
        this.f22616t = c3289j;
        this.f22600d = z;
        this.f22611o = i3;
        this.f22601e = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f22602f = (TextView) this.itemView.findViewById(R.id.video_length_textView);
        this.f22603g = (TextView) this.itemView.findViewById(R.id.video_size_textView);
        this.f22605i = this.itemView.findViewById(R.id.bottom_gradient_view);
        this.f22606j = this.itemView.findViewById(R.id.top_gradient_view);
        this.f22607k = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22608l = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f22612p = (RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f22613q = (ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile);
        this.f22615s = (TextView) this.itemView.findViewById(R.id.progress_text_action_view);
        this.f22618v = (TextureView) this.itemView.findViewById(R.id.textureView1);
        this.f22604h = (ImageButton) this.itemView.findViewById(R.id.action_image_option);
        this.f22619w = (VideoView) this.itemView.findViewById(R.id.video_view);
        this.f22619w.f11710a = new C69003(this);
        this.f22618v.setOnClickListener(new C38204(this));
        this.f22613q.setOnClickListener(new C38215(this));
        LayoutParams layoutParams = (LayoutParams) this.f22601e.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        layoutParams = (LayoutParams) this.f22619w.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        layoutParams = (LayoutParams) this.f22618v.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        LayoutParams layoutParams2 = (LayoutParams) this.f22605i.getLayoutParams();
        layoutParams2.height = dimension;
        layoutParams2.width = i3;
        layoutParams2 = (LayoutParams) this.f22606j.getLayoutParams();
        layoutParams2.height = dimension;
        layoutParams2.width = i3;
        this.f22607k.setOnClickListener(new C38226(this));
        this.f22601e.setOnClickListener(new C38237(this));
    }

    private void m20340a() {
        if (this.f22607k != null) {
            this.f22607k.setVisibility(8);
        }
    }

    private void m20342a(C7647n c7647n) {
        this.f22616t.mo2336g(c7647n.f20777c, c7647n.f23577S);
        String str = c7647n.f20777c;
        if (this.f22619w != null) {
            C4113d player = this.f22619w.getPlayer();
            if (!(player == null || player.f11761f)) {
                if (player.isPlaying()) {
                    player.m7967b();
                    if (this.f22607k != null) {
                        this.f22607k.setVisibility(0);
                        m20344b();
                    }
                    C4121n.m8000b();
                    return;
                }
                C4121n.f11799a = str;
                m20340a();
                player.seekTo(0);
                player.start();
            }
        }
    }

    private void m20344b() {
        this.c.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C7512n f11189a;

            {
                this.f11189a = r1;
            }

            public final void run() {
                this.f11189a.f22619w.getCoverView().setVisibility(0);
            }
        });
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7647n c7647n = (C7647n) c6829g;
        this.f22622z = c7647n;
        Object a = C2613o.m7045a(c7647n.ac, c7647n.ad, c7647n.f23577S, c7647n.f23578T, c7647n.f21300A);
        this.f22614r = false;
        if (c7647n.ac == C2987i.FINISHED && this.f22600d) {
            this.f22617u = C2476b.m6722a(c7647n.f23577S);
        }
        Point a2;
        C1274i a3;
        C1274i a4;
        C1248f a5;
        if (this.f22617u) {
            this.f22618v.setVisibility(8);
            this.f22619w.setVisibility(8);
            if (this.f22620x == null || !this.f22620x.equals(a)) {
                this.f22601e.setVisibility(0);
                this.f22601e.setImageBitmap(null);
                a2 = C2491i.m6763a(this.f22611o, c7647n.f23575Q, c7647n.f23576R);
                if (c7647n.f23575Q <= 0 || c7647n.f23576R <= 0) {
                    C1248f a6;
                    if (c7647n.ac != C2987i.FINISHED || c7647n.f23577S == null) {
                        a3 = C1212c.m2872a(this.c).m10950a(a);
                        a6 = new C1248f().m2954b(this.f22611o, this.f22611o).m2951a(new C7156b(10));
                    } else {
                        a3 = C1212c.m2872a(this.c).m10950a(a);
                        a6 = new C1248f().m2954b(this.f22611o, this.f22611o);
                    }
                    a3 = a3.m3034a(a6).m3033a();
                } else {
                    if (c7647n.ac != C2987i.FINISHED || c7647n.f23577S == null) {
                        a4 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                        a5 = new C1248f().m2954b(a2.x, a2.y).m2951a(new C7156b(10));
                    } else {
                        a4 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                        a5 = new C1248f().m2954b(a2.x, a2.y);
                    }
                    a3 = a4.m3034a(a5);
                }
                a3.f3986c = this.f22599A;
                a3.m3031a(this.f22601e);
            }
        } else {
            a2 = C2491i.m6763a(this.f22611o, c7647n.f23575Q, c7647n.f23576R);
            if (this.f22620x == null || !this.f22620x.equals(a)) {
                this.f22601e.setVisibility(8);
                this.f22601e.setImageBitmap(null);
                if (c7647n.ac != C2987i.FINISHED || c7647n.f23577S == null) {
                    a4 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                    a5 = new C1248f().m2954b(a2.x, a2.y).m2951a(new C7156b(10));
                } else {
                    a4 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                    a5 = new C1248f().m2954b(a2.x, a2.y);
                }
                a3 = a4.m3034a(a5);
                a3.f3986c = this.f22599A;
                a3.m3031a(this.f22619w.getCoverView());
            }
            this.f22619w.getVideoInfo().f11701e = false;
            this.f22619w.m7923a(c7647n.f23577S).m7922a(c7647n.f20777c);
            this.f22619w.setVisibility(0);
            this.f22618v.setVisibility(0);
            if (C4121n.f11799a.equalsIgnoreCase(c7647n.f20777c)) {
                final int i = C4121n.f11800b;
                if (i > 0) {
                    this.c.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C7512n f11197b;

                        public final void run() {
                            if (this.f11197b.f22619w != null) {
                                C4113d player = this.f11197b.f22619w.getPlayer();
                                if (player != null && !player.f11761f) {
                                    this.f11197b.m20340a();
                                    player.seekTo(i);
                                    player.start();
                                }
                            }
                        }
                    });
                }
            } else {
                m20344b();
            }
        }
        this.f22620x = a;
        this.f22602f.setText(C2491i.m6774a(this.c, (long) c7647n.aa, true));
        this.f22603g.setText(c7647n.ab);
        this.f22604h.setVisibility(8);
        switch (c7647n.ac) {
            case FINISHED:
                this.f22608l.setVisibility(8);
                this.f22613q.setVisibility(8);
                this.f22615s.setVisibility(8);
                this.f22607k.setImageResource(R.drawable.ic_video_play);
                if (!this.f22617u) {
                    this.f22604h.setVisibility(0);
                    if (this.f22621y) {
                        this.f22621y = false;
                        m20342a(c7647n);
                        break;
                    }
                }
                this.f22607k.setVisibility(0);
                this.f22604h.setVisibility(8);
                break;
                break;
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22608l.setVisibility(8);
                this.f22607k.setVisibility(0);
                this.f22607k.setImageResource(R.drawable.ic_file_start_download);
                this.f22613q.setVisibility(8);
                this.f22615s.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22608l.setVisibility(0);
                this.f22607k.setVisibility(0);
                this.f22607k.setImageResource(R.drawable.ic_file_stop_download);
                this.f22615s.setVisibility(0);
                this.f22615s.setText(c7647n.f23574P);
                if (c7647n.f23579U > 0) {
                    progressWheel = this.f22608l;
                    f = ((float) c7647n.f23579U) * 0.01f;
                } else {
                    progressWheel = this.f22608l;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22613q.setVisibility(8);
                this.f22621y = true;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7647n, this.f22612p, false);
    }
}
