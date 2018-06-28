package mobi.mmdt.ott.view.conversation.p432e.p433a.p441h;

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
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3289j;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p441h.C7524m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7659m;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C6222c;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.VideoView;
import mobi.mmdt.ott.view.tools.C4520n;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7524m extends C7352b {
    private C7659m f22729A;
    private C1247e<Drawable> f22730B = new C61861(this);
    private final boolean f22731d;
    private ImageView f22732e;
    private TextView f22733f;
    private TextView f22734g;
    private TextView f22735h;
    private ImageButton f22736i;
    private ImageView f22737j;
    private View f22738k;
    private View f22739l;
    private ImageButton f22740m;
    private TextView f22741n;
    private ProgressWheel f22742o;
    private C3284e f22743p;
    private C3283d f22744q;
    private int f22745r;
    private RelativeLayout f22746s;
    private ImageView f22747t;
    private boolean f22748u;
    private C3289j f22749v;
    private boolean f22750w = true;
    private TextureView f22751x;
    private VideoView f22752y;
    private boolean f22753z;

    class C38654 implements OnClickListener {
        final /* synthetic */ C7524m f11277a;

        C38654(C7524m c7524m) {
            this.f11277a = c7524m;
        }

        public final void onClick(View view) {
            C7659m c7659m = (C7659m) this.f11277a.f16244a;
            if (C38642.f11275a[c7659m.aa.ordinal()] == 1) {
                this.f11277a.m20419a(c7659m);
            }
        }
    }

    class C38665 implements OnClickListener {
        final /* synthetic */ C7524m f11278a;

        C38665(C7524m c7524m) {
            this.f11278a = c7524m;
        }

        public final void onClick(View view) {
            this.f11278a.f22743p.mo2331e(((C7659m) this.f11278a.f16244a).f23668S);
        }
    }

    class C38676 implements OnClickListener {
        final /* synthetic */ C7524m f11279a;

        C38676(C7524m c7524m) {
            this.f11279a = c7524m;
        }

        public final void onClick(View view) {
            C7659m c7659m = (C7659m) this.f11279a.f16244a;
            switch (c7659m.aa) {
                case FINISHED:
                    if (this.f11279a.f22750w) {
                        this.f11279a.f22744q.mo2309a(c7659m.f23668S, c7659m.f23670U);
                        return;
                    } else {
                        this.f11279a.m20419a(c7659m);
                        return;
                    }
                case DELETED:
                case NOT_STARTED:
                    if (c7659m.ad == null || c7659m.ad.isEmpty()) {
                        this.f11279a.f22743p.mo2307a(c7659m.mo3604b(), false);
                        return;
                    } else {
                        this.f11279a.f22743p.mo2307a(c7659m.mo3604b(), true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11279a.f22743p.mo2305a(c7659m.mo3604b());
                    return;
                case CANCEL:
                    if (c7659m.ad == null || c7659m.ad.isEmpty()) {
                        this.f11279a.f22743p.mo2307a(c7659m.mo3604b(), false);
                        return;
                    } else {
                        this.f11279a.f22743p.mo2307a(c7659m.mo3604b(), true);
                        return;
                    }
                case ERROR:
                    if (c7659m.ad == null || c7659m.ad.isEmpty()) {
                        this.f11279a.f22743p.mo2307a(c7659m.mo3604b(), false);
                        return;
                    } else {
                        this.f11279a.f22743p.mo2307a(c7659m.mo3604b(), true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C38687 implements OnClickListener {
        final /* synthetic */ C7524m f11280a;

        C38687(C7524m c7524m) {
            this.f11280a = c7524m;
        }

        public final void onClick(View view) {
            C7659m c7659m = (C7659m) this.f11280a.f16244a;
            if (c7659m.ad == null || c7659m.ad.isEmpty()) {
                int[] iArr = C38642.f11275a;
                c7659m.aa.ordinal();
                this.f11280a.f22744q.mo2309a(c7659m.f23668S, c7659m.f23670U);
            } else if (c7659m.aa == C2987i.FINISHED) {
                this.f11280a.f22744q.mo2309a(c7659m.f23668S, c7659m.f23670U);
            }
        }
    }

    class C38698 implements Runnable {
        final /* synthetic */ C7524m f11281a;

        C38698(C7524m c7524m) {
            this.f11281a = c7524m;
        }

        public final void run() {
            this.f11281a.f22740m.setImageResource(R.drawable.ic_video_play);
            this.f11281a.f22740m.setVisibility(0);
        }
    }

    class C61861 implements C1247e<Drawable> {
        final /* synthetic */ C7524m f16719a;

        C61861(C7524m c7524m) {
            this.f16719a = c7524m;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7659m c7659m = (C7659m) this.f16719a.f16244a;
            if (!this.f16719a.f22748u) {
                this.f16719a.f22748u = true;
                if (c7659m.f23666Q > 0 && c7659m.f23667R > 0) {
                    Point b = C2491i.m6807b(this.f16719a.f22745r, c7659m.f23666Q, c7659m.f23667R);
                    LayoutParams layoutParams = (LayoutParams) this.f16719a.f22732e.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                    int dimension = (int) this.f16719a.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
                    LayoutParams layoutParams2 = (LayoutParams) this.f16719a.f22738k.getLayoutParams();
                    layoutParams2.height = dimension;
                    layoutParams2.width = b.x;
                    layoutParams2 = (LayoutParams) this.f16719a.f22739l.getLayoutParams();
                    layoutParams2.height = dimension;
                    layoutParams2.width = b.x;
                    layoutParams = (LayoutParams) this.f16719a.f22752y.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                    layoutParams = (LayoutParams) this.f16719a.f22751x.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                }
            }
            return false;
        }
    }

    class C69013 extends C6222c {
        final /* synthetic */ C7524m f19644a;

        C69013(C7524m c7524m) {
            this.f19644a = c7524m;
        }

        public final void mo2382a(int i, int i2) {
        }

        public final void mo2383a(C4113d c4113d) {
            this.f19644a.c.runOnUiThread(new C38698(this.f19644a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19644a.m20419a(this.f19644a.f22729A);
            }
        }

        public final void mo2384a(C4113d c4113d, int i) {
        }

        public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
            this.f19644a.m20422b();
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
            this.f19644a.c.runOnUiThread(new C38698(this.f19644a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19644a.m20419a(this.f19644a.f22729A);
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
            this.f19644a.c.runOnUiThread(new C38698(this.f19644a));
            C4121n.m8000b();
        }
    }

    public C7524m(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, boolean z, C3284e c3284e, C3283d c3283d, C3286g c3286g, C3289j c3289j) {
        int i3 = i;
        int i4 = i2;
        super(activity, layoutInflater, viewGroup, R.layout.chat_video_captioned_output_list_item, c3286g, c3284e);
        this.f22743p = c3284e;
        this.f22744q = c3283d;
        this.f22749v = c3289j;
        this.f22731d = z;
        this.f22745r = i3;
        this.f22732e = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f22733f = (TextView) this.itemView.findViewById(R.id.caption_textView);
        this.f22734g = (TextView) this.itemView.findViewById(R.id.video_length_textView);
        this.f22735h = (TextView) this.itemView.findViewById(R.id.video_size_textView);
        this.f22737j = (ImageView) this.itemView.findViewById(R.id.status_imageView);
        this.f22738k = this.itemView.findViewById(R.id.bottom_gradient_view);
        this.f22739l = this.itemView.findViewById(R.id.top_gradient_view);
        this.f22740m = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22741n = (TextView) this.itemView.findViewById(R.id.progress_text_action_view);
        this.f22742o = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f22746s = (RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f22747t = (ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile);
        this.f22751x = (TextureView) this.itemView.findViewById(R.id.textureView1);
        this.f22736i = (ImageButton) this.itemView.findViewById(R.id.action_image_option);
        this.f22752y = (VideoView) this.itemView.findViewById(R.id.video_view);
        this.f22752y.f11710a = new C69013(this);
        this.f22751x.setOnClickListener(new C38654(this));
        this.f22747t.setOnClickListener(new C38665(this));
        LayoutParams layoutParams = (LayoutParams) this.f22732e.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        layoutParams = (LayoutParams) this.f22752y.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        layoutParams = (LayoutParams) this.f22751x.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        LayoutParams layoutParams2 = (LayoutParams) this.f22738k.getLayoutParams();
        layoutParams2.height = dimension;
        layoutParams2.width = i3;
        layoutParams2 = (LayoutParams) this.f22739l.getLayoutParams();
        layoutParams2.height = dimension;
        layoutParams2.width = i3;
        this.f22740m.setOnClickListener(new C38676(this));
        this.f22732e.setOnClickListener(new C38687(this));
    }

    private void m20417a() {
        if (this.f22740m != null) {
            this.f22740m.setVisibility(8);
        }
    }

    private void m20419a(C7659m c7659m) {
        this.f22749v.mo2336g(c7659m.f20777c, c7659m.f23668S);
        String str = c7659m.f20777c;
        if (this.f22752y != null) {
            C4113d player = this.f22752y.getPlayer();
            if (!(player == null || player.f11761f)) {
                if (player.isPlaying()) {
                    player.m7967b();
                    if (this.f22740m != null) {
                        this.f22740m.setVisibility(0);
                        m20422b();
                    }
                    C4121n.m8000b();
                    return;
                }
                C4121n.f11799a = str;
                m20417a();
                player.seekTo(0);
                player.start();
            }
        }
    }

    private void m20420a(C7659m c7659m, C2971k c2971k) {
        boolean z = ((c7659m.ad == null || c7659m.ad.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22740m, z);
    }

    private void m20422b() {
        this.c.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C7524m f11274a;

            {
                this.f11274a = r1;
            }

            public final void run() {
                this.f11274a.f22752y.getCoverView().setVisibility(0);
            }
        });
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7659m c7659m = (C7659m) c6829g;
        this.f22729A = c7659m;
        Object a = C2613o.m7045a(c7659m.aa, c7659m.ab, c7659m.f23668S, c7659m.f23669T, c7659m.f21300A);
        this.f22732e.setImageBitmap(null);
        this.f22748u = false;
        if (c7659m.aa == C2987i.FINISHED && this.f22731d) {
            this.f22750w = C2476b.m6722a(c7659m.f23668S);
        }
        C1274i a2;
        Point a3;
        if (this.f22750w) {
            this.f22751x.setVisibility(8);
            this.f22752y.setVisibility(8);
            if (c7659m.f23666Q <= 0 || c7659m.f23667R <= 0) {
                a2 = C1212c.m2872a(this.c).m10950a(a).m3034a(new C1248f().m2959e().m2954b(this.f22745r, this.f22745r)).m3033a();
            } else {
                a3 = C2491i.m6763a(this.f22745r, c7659m.f23666Q, c7659m.f23667R);
                a2 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(new C1248f().m2954b(a3.x, a3.y));
            }
            a2.f3986c = this.f22730B;
            a2.m3031a(this.f22732e);
        } else {
            a3 = C2491i.m6763a(this.f22745r, c7659m.f23666Q, c7659m.f23667R);
            a2 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(new C1248f().m2954b(a3.x, a3.y));
            a2.f3986c = this.f22730B;
            a2.m3031a(this.f22752y.getCoverView());
            this.f22752y.getVideoInfo().f11701e = false;
            this.f22752y.m7923a(c7659m.f23668S).m7922a(c7659m.f20777c);
            this.f22752y.setVisibility(0);
            this.f22751x.setVisibility(0);
            if (C4121n.f11799a.equalsIgnoreCase(c7659m.f20777c)) {
                final int i2 = C4121n.f11800b;
                if (i2 > 0) {
                    this.c.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C7524m f11283b;

                        public final void run() {
                            if (this.f11283b.f22752y != null) {
                                C4113d player = this.f11283b.f22752y.getPlayer();
                                if (player != null && !player.f11761f) {
                                    this.f11283b.m20417a();
                                    player.seekTo(i2);
                                    player.start();
                                }
                            }
                        }
                    });
                }
            } else {
                m20422b();
            }
        }
        this.f22734g.setText(C2491i.m6774a(this.c, (long) c7659m.f23672Y, true));
        this.f22735h.setText(c7659m.f23673Z);
        if (c7659m.f23670U == null || c7659m.f23670U.isEmpty()) {
            this.f22733f.setVisibility(8);
        } else {
            this.f22733f.setText(c7659m.f23670U);
            this.f22733f.setVisibility(0);
            this.f22733f.setTextSize((float) (((double) c7659m.ac) * 0.85d));
            C4520n.m8234a(this.f22733f);
        }
        switch (c7659m.f21337w) {
            case ERROR:
                imageView = this.f22737j;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22737j;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22737j;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22737j;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        this.f22736i.setVisibility(8);
        switch (c7659m.aa) {
            case FINISHED:
                this.f22742o.setVisibility(8);
                this.f22747t.setVisibility(8);
                this.f22741n.setVisibility(8);
                this.f22740m.setImageResource(R.drawable.ic_video_play);
                if (!this.f22750w) {
                    this.f22736i.setVisibility(0);
                    if (this.f22753z) {
                        this.f22753z = false;
                        m20419a(c7659m);
                        break;
                    }
                }
                this.f22740m.setVisibility(0);
                this.f22736i.setVisibility(8);
                break;
                break;
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22742o.setVisibility(8);
                this.f22740m.setVisibility(0);
                this.f22741n.setVisibility(8);
                this.f22747t.setVisibility(8);
                m20420a(c7659m, c7659m.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22742o.setVisibility(0);
                this.f22740m.setVisibility(0);
                this.f22740m.setImageResource(R.drawable.ic_file_stop_download);
                this.f22741n.setVisibility(0);
                this.f22741n.setText(c7659m.f23665P);
                if (c7659m.f23671V > 0) {
                    progressWheel = this.f22742o;
                    f = ((float) c7659m.f23671V) * 0.01f;
                } else {
                    progressWheel = this.f22742o;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22747t.setVisibility(8);
                this.f22753z = true;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7659m, this.f22746s, true);
    }
}
