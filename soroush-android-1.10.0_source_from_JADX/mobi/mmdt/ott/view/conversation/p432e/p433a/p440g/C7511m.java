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
import mobi.mmdt.ott.view.conversation.p432e.p433a.p440g.C7511m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7646m;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C6222c;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.VideoView;
import mobi.mmdt.ott.view.tools.C4520n;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7511m extends C7351b {
    private C7646m f22574A;
    private C1247e<Drawable> f22575B = new C61791(this);
    private final boolean f22576d;
    private ImageView f22577e;
    private TextView f22578f;
    private TextView f22579g;
    private TextView f22580h;
    private ImageButton f22581i;
    private View f22582j;
    private View f22583k;
    private ImageButton f22584l;
    private ProgressWheel f22585m;
    private C3284e f22586n;
    private C3283d f22587o;
    private int f22588p;
    private RelativeLayout f22589q;
    private ImageView f22590r;
    private boolean f22591s;
    private TextView f22592t;
    private C3289j f22593u;
    private boolean f22594v = true;
    private TextureView f22595w;
    private VideoView f22596x;
    private Uri f22597y;
    private boolean f22598z;

    class C38134 implements OnClickListener {
        final /* synthetic */ C7511m f11182a;

        C38134(C7511m c7511m) {
            this.f11182a = c7511m;
        }

        public final void onClick(View view) {
            C7646m c7646m = (C7646m) this.f11182a.f16244a;
            if (C38122.f11181a[c7646m.ad.ordinal()] == 1) {
                this.f11182a.m20320a(c7646m);
            }
        }
    }

    class C38145 implements OnClickListener {
        final /* synthetic */ C7511m f11183a;

        C38145(C7511m c7511m) {
            this.f11183a = c7511m;
        }

        public final void onClick(View view) {
            this.f11183a.f22586n.mo2331e(((C7646m) this.f11183a.f16244a).f23571S);
        }
    }

    class C38156 implements OnClickListener {
        final /* synthetic */ C7511m f11184a;

        C38156(C7511m c7511m) {
            this.f11184a = c7511m;
        }

        public final void onClick(View view) {
            C7646m c7646m = (C7646m) this.f11184a.f16244a;
            switch (c7646m.ad) {
                case FINISHED:
                    if (this.f11184a.f22594v) {
                        this.f11184a.f22587o.mo2309a(c7646m.f23571S, c7646m.f23573U);
                        return;
                    } else {
                        this.f11184a.m20320a(c7646m);
                        return;
                    }
                case DELETED:
                case NOT_STARTED:
                    this.f11184a.f22586n.mo2307a(c7646m.f23101W, true);
                    return;
                case TRANSMITTING:
                    this.f11184a.f22586n.mo2305a(c7646m.f23101W);
                    return;
                case CANCEL:
                    this.f11184a.f22586n.mo2307a(c7646m.f23101W, true);
                    return;
                case ERROR:
                    this.f11184a.f22586n.mo2307a(c7646m.f23101W, true);
                    return;
                default:
                    return;
            }
        }
    }

    class C38167 implements OnClickListener {
        final /* synthetic */ C7511m f11185a;

        C38167(C7511m c7511m) {
            this.f11185a = c7511m;
        }

        public final void onClick(View view) {
            C7646m c7646m = (C7646m) this.f11185a.f16244a;
            if (C38122.f11181a[c7646m.ad.ordinal()] == 1) {
                this.f11185a.f22587o.mo2309a(c7646m.f23571S, c7646m.f23573U);
            }
        }
    }

    class C38178 implements Runnable {
        final /* synthetic */ C7511m f11186a;

        C38178(C7511m c7511m) {
            this.f11186a = c7511m;
        }

        public final void run() {
            this.f11186a.f22584l.setImageResource(R.drawable.ic_video_play);
            this.f11186a.f22584l.setVisibility(0);
        }
    }

    class C61791 implements C1247e<Drawable> {
        final /* synthetic */ C7511m f16704a;

        C61791(C7511m c7511m) {
            this.f16704a = c7511m;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7646m c7646m = (C7646m) this.f16704a.f16244a;
            if (!this.f16704a.f22591s) {
                this.f16704a.f22591s = true;
                if (c7646m.f23569Q > 0 && c7646m.f23570R > 0) {
                    Point b = C2491i.m6807b(this.f16704a.f22588p, c7646m.f23569Q, c7646m.f23570R);
                    LayoutParams layoutParams = (LayoutParams) this.f16704a.f22577e.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                    int dimension = (int) this.f16704a.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
                    LayoutParams layoutParams2 = (LayoutParams) this.f16704a.f22582j.getLayoutParams();
                    layoutParams2.height = dimension;
                    layoutParams2.width = b.x;
                    layoutParams2 = (LayoutParams) this.f16704a.f22583k.getLayoutParams();
                    layoutParams2.height = dimension;
                    layoutParams2.width = b.x;
                    layoutParams = (LayoutParams) this.f16704a.f22596x.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                    layoutParams = (LayoutParams) this.f16704a.f22595w.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                }
            }
            return false;
        }
    }

    class C68993 extends C6222c {
        final /* synthetic */ C7511m f19642a;

        C68993(C7511m c7511m) {
            this.f19642a = c7511m;
        }

        public final void mo2382a(int i, int i2) {
        }

        public final void mo2383a(C4113d c4113d) {
            this.f19642a.c.runOnUiThread(new C38178(this.f19642a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19642a.m20320a(this.f19642a.f22574A);
            }
        }

        public final void mo2384a(C4113d c4113d, int i) {
        }

        public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
            this.f19642a.m20322b();
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
            this.f19642a.c.runOnUiThread(new C38178(this.f19642a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19642a.m20320a(this.f19642a.f22574A);
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
            this.f19642a.c.runOnUiThread(new C38178(this.f19642a));
            C4121n.m8000b();
        }
    }

    public C7511m(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, boolean z, C3284e c3284e, C3288i c3288i, C3283d c3283d, C3286g c3286g, C3289j c3289j) {
        int i3 = i;
        int i4 = i2;
        super(activity, layoutInflater, viewGroup, R.layout.chat_video_captioned_social_input_list_item, c3288i, c3286g, c3284e);
        this.f22586n = c3284e;
        this.f22587o = c3283d;
        this.f22593u = c3289j;
        this.f22576d = z;
        this.f22588p = i3;
        this.f22577e = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f22578f = (TextView) this.itemView.findViewById(R.id.caption_textView);
        this.f22579g = (TextView) this.itemView.findViewById(R.id.video_length_textView);
        this.f22580h = (TextView) this.itemView.findViewById(R.id.video_size_textView);
        this.f22582j = this.itemView.findViewById(R.id.bottom_gradient_view);
        this.f22583k = this.itemView.findViewById(R.id.top_gradient_view);
        this.f22584l = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22585m = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f22589q = (RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f22590r = (ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile);
        this.f22592t = (TextView) this.itemView.findViewById(R.id.progress_text_action_view);
        this.f22595w = (TextureView) this.itemView.findViewById(R.id.textureView1);
        this.f22581i = (ImageButton) this.itemView.findViewById(R.id.action_image_option);
        this.f22596x = (VideoView) this.itemView.findViewById(R.id.video_view);
        this.f22596x.f11710a = new C68993(this);
        this.f22595w.setOnClickListener(new C38134(this));
        this.f22590r.setOnClickListener(new C38145(this));
        LayoutParams layoutParams = (LayoutParams) this.f22577e.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        layoutParams = (LayoutParams) this.f22596x.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        layoutParams = (LayoutParams) this.f22595w.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        LayoutParams layoutParams2 = (LayoutParams) this.f22582j.getLayoutParams();
        layoutParams2.height = dimension;
        layoutParams2.width = i3;
        layoutParams2 = (LayoutParams) this.f22583k.getLayoutParams();
        layoutParams2.height = dimension;
        layoutParams2.width = i3;
        this.f22584l.setOnClickListener(new C38156(this));
        this.f22577e.setOnClickListener(new C38167(this));
    }

    private void m20318a() {
        if (this.f22584l != null) {
            this.f22584l.setVisibility(8);
        }
    }

    private void m20320a(C7646m c7646m) {
        this.f22593u.mo2336g(c7646m.f20777c, c7646m.f23571S);
        String str = c7646m.f20777c;
        if (this.f22596x != null) {
            C4113d player = this.f22596x.getPlayer();
            if (!(player == null || player.f11761f)) {
                if (player.isPlaying()) {
                    player.m7967b();
                    if (this.f22584l != null) {
                        this.f22584l.setVisibility(0);
                        m20322b();
                    }
                    C4121n.m8000b();
                    return;
                }
                C4121n.f11799a = str;
                m20318a();
                player.seekTo(0);
                player.start();
            }
        }
    }

    private void m20322b() {
        this.c.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C7511m f11180a;

            {
                this.f11180a = r1;
            }

            public final void run() {
                this.f11180a.f22596x.getCoverView().setVisibility(0);
            }
        });
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7646m c7646m = (C7646m) c6829g;
        this.f22574A = c7646m;
        Object a = C2613o.m7045a(c7646m.ad, c7646m.ae, c7646m.f23571S, c7646m.f23572T, c7646m.f21300A);
        this.f22591s = false;
        if (c7646m.ad == C2987i.FINISHED && this.f22576d) {
            this.f22594v = C2476b.m6722a(c7646m.f23571S);
        }
        Point a2;
        C1274i a3;
        C1274i a4;
        C1248f a5;
        if (this.f22594v) {
            this.f22595w.setVisibility(8);
            this.f22596x.setVisibility(8);
            if (this.f22597y == null || !this.f22597y.equals(a)) {
                this.f22577e.setVisibility(0);
                this.f22577e.setImageBitmap(null);
                a2 = C2491i.m6763a(this.f22588p, c7646m.f23569Q, c7646m.f23570R);
                if (c7646m.f23569Q <= 0 || c7646m.f23570R <= 0) {
                    C1248f a6;
                    if (c7646m.ad != C2987i.FINISHED || c7646m.f23571S == null) {
                        a3 = C1212c.m2872a(this.c).m10950a(a);
                        a6 = new C1248f().m2954b(this.f22588p, this.f22588p).m2951a(new C7156b(10));
                    } else {
                        a3 = C1212c.m2872a(this.c).m10950a(a);
                        a6 = new C1248f().m2954b(this.f22588p, this.f22588p);
                    }
                    a3 = a3.m3034a(a6).m3033a();
                } else {
                    if (c7646m.ad != C2987i.FINISHED || c7646m.f23571S == null) {
                        a4 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                        a5 = new C1248f().m2954b(a2.x, a2.y).m2951a(new C7156b(10));
                    } else {
                        a4 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                        a5 = new C1248f().m2954b(a2.x, a2.y);
                    }
                    a3 = a4.m3034a(a5);
                }
                a3.f3986c = this.f22575B;
                a3.m3031a(this.f22577e);
            }
        } else {
            a2 = C2491i.m6763a(this.f22588p, c7646m.f23569Q, c7646m.f23570R);
            if (this.f22597y == null || !this.f22597y.equals(a)) {
                this.f22577e.setImageBitmap(null);
                this.f22577e.setVisibility(8);
                if (c7646m.ad != C2987i.FINISHED || c7646m.f23571S == null) {
                    a4 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                    a5 = new C1248f().m2954b(a2.x, a2.y).m2951a(new C7156b(10));
                } else {
                    a4 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                    a5 = new C1248f().m2954b(a2.x, a2.y);
                }
                a3 = a4.m3034a(a5);
                a3.f3986c = this.f22575B;
                a3.m3031a(this.f22596x.getCoverView());
            }
            this.f22596x.getVideoInfo().f11701e = false;
            this.f22596x.m7923a(c7646m.f23571S).m7922a(c7646m.f20777c);
            this.f22596x.setVisibility(0);
            this.f22595w.setVisibility(0);
            if (C4121n.f11799a.equalsIgnoreCase(c7646m.f20777c)) {
                final int i = C4121n.f11800b;
                if (i > 0) {
                    this.c.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C7511m f11188b;

                        public final void run() {
                            if (this.f11188b.f22596x != null) {
                                C4113d player = this.f11188b.f22596x.getPlayer();
                                if (player != null && !player.f11761f) {
                                    this.f11188b.m20318a();
                                    player.seekTo(i);
                                    player.start();
                                }
                            }
                        }
                    });
                }
            } else {
                m20322b();
            }
        }
        this.f22597y = a;
        this.f22579g.setText(C2491i.m6774a(this.c, (long) c7646m.ab, true));
        this.f22580h.setText(c7646m.ac);
        if (c7646m.f23573U == null || c7646m.f23573U.isEmpty()) {
            this.f22578f.setVisibility(8);
        } else {
            this.f22578f.setText(c7646m.f23573U);
            this.f22578f.setVisibility(0);
            this.f22578f.setTextSize((float) (((double) c7646m.af) * 0.85d));
            C4520n.m8234a(this.f22578f);
        }
        this.f22581i.setVisibility(8);
        switch (c7646m.ad) {
            case FINISHED:
                this.f22585m.setVisibility(8);
                this.f22590r.setVisibility(8);
                this.f22592t.setVisibility(8);
                this.f22584l.setImageResource(R.drawable.ic_video_play);
                if (!this.f22594v) {
                    this.f22581i.setVisibility(0);
                    if (this.f22598z) {
                        this.f22598z = false;
                        m20320a(c7646m);
                        break;
                    }
                }
                this.f22584l.setVisibility(0);
                this.f22581i.setVisibility(8);
                break;
                break;
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22585m.setVisibility(8);
                this.f22584l.setVisibility(0);
                this.f22584l.setImageResource(R.drawable.ic_file_start_download);
                this.f22590r.setVisibility(8);
                this.f22592t.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22585m.setVisibility(0);
                this.f22584l.setVisibility(0);
                this.f22584l.setImageResource(R.drawable.ic_file_stop_download);
                this.f22592t.setVisibility(0);
                this.f22592t.setText(c7646m.f23568P);
                if (c7646m.aa > 0) {
                    progressWheel = this.f22585m;
                    f = ((float) c7646m.aa) * 0.01f;
                } else {
                    progressWheel = this.f22585m;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22590r.setVisibility(8);
                this.f22598z = true;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7646m, this.f22589q, false);
    }
}
