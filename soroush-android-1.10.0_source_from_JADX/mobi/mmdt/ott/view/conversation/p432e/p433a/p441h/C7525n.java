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
import mobi.mmdt.ott.view.conversation.p432e.p433a.p441h.C7525n;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7660n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C6222c;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.VideoView;
import tv.danmaku.ijk.media.player.IjkTimedText;

public final class C7525n extends C7352b {
    private C1247e<Drawable> f22754A = new C61871(this);
    private final boolean f22755d;
    private ImageView f22756e;
    private TextView f22757f;
    private TextView f22758g;
    private ImageButton f22759h;
    private ImageView f22760i;
    private View f22761j;
    private View f22762k;
    private TextView f22763l;
    private ImageButton f22764m;
    private ProgressWheel f22765n;
    private C3284e f22766o;
    private C3283d f22767p;
    private int f22768q;
    private LinearLayout f22769r;
    private ImageView f22770s;
    private boolean f22771t;
    private C3289j f22772u;
    private boolean f22773v = true;
    private TextureView f22774w;
    private VideoView f22775x;
    private boolean f22776y;
    private C7660n f22777z;

    class C38724 implements OnClickListener {
        final /* synthetic */ C7525n f11287a;

        C38724(C7525n c7525n) {
            this.f11287a = c7525n;
        }

        public final void onClick(View view) {
            C7660n c7660n = (C7660n) this.f11287a.f16244a;
            if (C38712.f11285a[c7660n.f23682Z.ordinal()] == 1) {
                this.f11287a.m20442a(c7660n);
            }
        }
    }

    class C38735 implements OnClickListener {
        final /* synthetic */ C7525n f11288a;

        C38735(C7525n c7525n) {
            this.f11288a = c7525n;
        }

        public final void onClick(View view) {
            this.f11288a.f22766o.mo2331e(((C7660n) this.f11288a.f16244a).f23677S);
        }
    }

    class C38746 implements OnClickListener {
        final /* synthetic */ C7525n f11289a;

        C38746(C7525n c7525n) {
            this.f11289a = c7525n;
        }

        public final void onClick(View view) {
            C7660n c7660n = (C7660n) this.f11289a.f16244a;
            switch (c7660n.f23682Z) {
                case FINISHED:
                    if (this.f11289a.f22773v) {
                        this.f11289a.f22767p.mo2309a(c7660n.f23677S, null);
                        return;
                    } else {
                        this.f11289a.m20442a(c7660n);
                        return;
                    }
                case DELETED:
                case NOT_STARTED:
                    if (c7660n.ab == null || c7660n.ab.isEmpty()) {
                        this.f11289a.f22766o.mo2307a(c7660n.mo3604b(), false);
                        return;
                    } else {
                        this.f11289a.f22766o.mo2307a(c7660n.mo3604b(), true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11289a.f22766o.mo2305a(c7660n.mo3604b());
                    return;
                case CANCEL:
                    if (c7660n.ab == null || c7660n.ab.isEmpty()) {
                        this.f11289a.f22766o.mo2307a(c7660n.mo3604b(), false);
                        return;
                    } else {
                        this.f11289a.f22766o.mo2307a(c7660n.mo3604b(), true);
                        return;
                    }
                case ERROR:
                    if (c7660n.ab == null || c7660n.ab.isEmpty()) {
                        this.f11289a.f22766o.mo2307a(c7660n.mo3604b(), false);
                        return;
                    } else {
                        this.f11289a.f22766o.mo2307a(c7660n.mo3604b(), true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C38757 implements OnClickListener {
        final /* synthetic */ C7525n f11290a;

        C38757(C7525n c7525n) {
            this.f11290a = c7525n;
        }

        public final void onClick(View view) {
            C7660n c7660n = (C7660n) this.f11290a.f16244a;
            if (c7660n.ab == null || c7660n.ab.isEmpty()) {
                int[] iArr = C38712.f11285a;
                c7660n.f23682Z.ordinal();
                this.f11290a.f22767p.mo2309a(c7660n.f23677S, null);
            } else if (c7660n.f23682Z == C2987i.FINISHED) {
                this.f11290a.f22767p.mo2309a(c7660n.f23677S, null);
            }
        }
    }

    class C38768 implements Runnable {
        final /* synthetic */ C7525n f11291a;

        C38768(C7525n c7525n) {
            this.f11291a = c7525n;
        }

        public final void run() {
            this.f11291a.f22764m.setImageResource(R.drawable.ic_video_play);
            this.f11291a.f22764m.setVisibility(0);
        }
    }

    class C61871 implements C1247e<Drawable> {
        final /* synthetic */ C7525n f16720a;

        C61871(C7525n c7525n) {
            this.f16720a = c7525n;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7660n c7660n = (C7660n) this.f16720a.f16244a;
            if (!this.f16720a.f22771t) {
                this.f16720a.f22771t = true;
                if (c7660n.f23675Q > 0 && c7660n.f23676R > 0) {
                    Point b = C2491i.m6807b(this.f16720a.f22768q, c7660n.f23675Q, c7660n.f23676R);
                    LayoutParams layoutParams = (LayoutParams) this.f16720a.f22756e.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                    int dimension = (int) this.f16720a.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
                    LayoutParams layoutParams2 = (LayoutParams) this.f16720a.f22761j.getLayoutParams();
                    layoutParams2.height = dimension;
                    layoutParams2.width = b.x;
                    layoutParams2 = (LayoutParams) this.f16720a.f22762k.getLayoutParams();
                    layoutParams2.height = dimension;
                    layoutParams2.width = b.x;
                    layoutParams = (LayoutParams) this.f16720a.f22775x.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                    layoutParams = (LayoutParams) this.f16720a.f22774w.getLayoutParams();
                    layoutParams.height = b.y;
                    layoutParams.width = b.x;
                }
            }
            return false;
        }
    }

    class C69023 extends C6222c {
        final /* synthetic */ C7525n f19645a;

        C69023(C7525n c7525n) {
            this.f19645a = c7525n;
        }

        public final void mo2382a(int i, int i2) {
        }

        public final void mo2383a(C4113d c4113d) {
            this.f19645a.c.runOnUiThread(new C38768(this.f19645a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19645a.m20442a(this.f19645a.f22777z);
            }
        }

        public final void mo2384a(C4113d c4113d, int i) {
        }

        public final void mo2385a(C4113d c4113d, Uri uri, long j, long j2, C2986h c2986h) {
            this.f19645a.m20445b();
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
            this.f19645a.c.runOnUiThread(new C38768(this.f19645a));
            C4121n.m8000b();
            if (C2535a.m6888a().m6981z()) {
                this.f19645a.m20442a(this.f19645a.f22777z);
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
            this.f19645a.c.runOnUiThread(new C38768(this.f19645a));
            C4121n.m8000b();
        }
    }

    public C7525n(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, boolean z, C3284e c3284e, C3283d c3283d, C3286g c3286g, C3289j c3289j) {
        int i3 = i;
        int i4 = i2;
        super(activity, layoutInflater, viewGroup, R.layout.chat_video_output_list_item, c3286g, c3284e);
        this.c = activity;
        this.f22766o = c3284e;
        this.f22767p = c3283d;
        this.f22772u = c3289j;
        this.f22755d = z;
        this.f22768q = i3;
        this.f22756e = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f22757f = (TextView) this.itemView.findViewById(R.id.video_length_textView);
        this.f22758g = (TextView) this.itemView.findViewById(R.id.video_size_textView);
        this.f22760i = (ImageView) this.itemView.findViewById(R.id.status_imageView);
        this.f22761j = this.itemView.findViewById(R.id.bottom_gradient_view);
        this.f22762k = this.itemView.findViewById(R.id.top_gradient_view);
        this.f22764m = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22763l = (TextView) this.itemView.findViewById(R.id.progress_text_action_view);
        this.f22765n = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f22769r = (LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f22770s = (ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile);
        this.f22774w = (TextureView) this.itemView.findViewById(R.id.textureView1);
        this.f22759h = (ImageButton) this.itemView.findViewById(R.id.action_image_option);
        this.f22775x = (VideoView) this.itemView.findViewById(R.id.video_view);
        this.f22775x.f11710a = new C69023(this);
        this.f22774w.setOnClickListener(new C38724(this));
        this.f22770s.setOnClickListener(new C38735(this));
        LayoutParams layoutParams = (LayoutParams) this.f22756e.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        layoutParams = (LayoutParams) this.f22775x.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        layoutParams = (LayoutParams) this.f22774w.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        LayoutParams layoutParams2 = (LayoutParams) this.f22761j.getLayoutParams();
        layoutParams2.height = dimension;
        layoutParams2.width = i3;
        layoutParams2 = (LayoutParams) this.f22762k.getLayoutParams();
        layoutParams2.height = dimension;
        layoutParams2.width = i3;
        this.f22764m.setOnClickListener(new C38746(this));
        this.f22756e.setOnClickListener(new C38757(this));
    }

    private void m20440a() {
        if (this.f22764m != null) {
            this.f22764m.setVisibility(8);
        }
    }

    private void m20442a(C7660n c7660n) {
        this.f22772u.mo2336g(c7660n.f20777c, c7660n.f23677S);
        String str = c7660n.f20777c;
        if (this.f22775x != null) {
            C4113d player = this.f22775x.getPlayer();
            if (!(player == null || player.f11761f)) {
                if (player.isPlaying()) {
                    player.m7967b();
                    if (this.f22764m != null) {
                        this.f22764m.setVisibility(0);
                        m20445b();
                    }
                    C4121n.m8000b();
                    return;
                }
                C4121n.f11799a = str;
                m20440a();
                player.seekTo(0);
                player.start();
            }
        }
    }

    private void m20443a(C7660n c7660n, C2971k c2971k) {
        boolean z = ((c7660n.ab == null || c7660n.ab.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22764m, z);
    }

    private void m20445b() {
        this.c.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C7525n f11284a;

            {
                this.f11284a = r1;
            }

            public final void run() {
                this.f11284a.f22775x.getCoverView().setVisibility(0);
            }
        });
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7660n c7660n = (C7660n) c6829g;
        this.f22777z = c7660n;
        Object a = C2613o.m7045a(c7660n.f23682Z, c7660n.aa, c7660n.f23677S, c7660n.f23678T, c7660n.f21300A);
        this.f22756e.setImageBitmap(null);
        this.f22771t = false;
        if (c7660n.f23682Z == C2987i.FINISHED && this.f22755d) {
            this.f22773v = C2476b.m6722a(c7660n.f23677S);
        }
        C1274i a2;
        Point a3;
        if (this.f22773v) {
            this.f22774w.setVisibility(8);
            this.f22775x.setVisibility(8);
            if (c7660n.f23675Q <= 0 || c7660n.f23676R <= 0) {
                a2 = C1212c.m2872a(this.c).m10950a(a).m3034a(new C1248f().m2959e().m2954b(this.f22768q, this.f22768q)).m3033a();
            } else {
                a3 = C2491i.m6763a(this.f22768q, c7660n.f23675Q, c7660n.f23676R);
                a2 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(new C1248f().m2954b(a3.x, a3.y));
            }
            a2.f3986c = this.f22754A;
            a2.m3031a(this.f22756e);
        } else {
            a3 = C2491i.m6763a(this.f22768q, c7660n.f23675Q, c7660n.f23676R);
            a2 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(new C1248f().m2954b(a3.x, a3.y));
            a2.f3986c = this.f22754A;
            a2.m3031a(this.f22775x.getCoverView());
            this.f22775x.getVideoInfo().f11701e = false;
            this.f22775x.m7923a(c7660n.f23677S).m7922a(c7660n.f20777c);
            this.f22775x.setVisibility(0);
            this.f22774w.setVisibility(0);
            if (C4121n.f11799a.equalsIgnoreCase(c7660n.f20777c)) {
                final int i2 = C4121n.f11800b;
                if (i2 > 0) {
                    this.c.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C7525n f11293b;

                        public final void run() {
                            if (this.f11293b.f22775x != null) {
                                C4113d player = this.f11293b.f22775x.getPlayer();
                                if (player != null && !player.f11761f) {
                                    this.f11293b.m20440a();
                                    player.seekTo(i2);
                                    player.start();
                                }
                            }
                        }
                    });
                }
            } else {
                m20445b();
            }
        }
        this.f22757f.setText(C2491i.m6774a(this.c, (long) c7660n.f23680V, true));
        this.f22758g.setText(c7660n.f23681Y);
        switch (c7660n.f21337w) {
            case ERROR:
                imageView = this.f22760i;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22760i;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22760i;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22760i;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        this.f22759h.setVisibility(8);
        switch (c7660n.f23682Z) {
            case FINISHED:
                this.f22765n.setVisibility(8);
                this.f22770s.setVisibility(8);
                this.f22763l.setVisibility(8);
                this.f22764m.setImageResource(R.drawable.ic_video_play);
                if (!this.f22773v) {
                    this.f22759h.setVisibility(0);
                    if (this.f22776y) {
                        this.f22776y = false;
                        m20442a(c7660n);
                        break;
                    }
                }
                this.f22764m.setVisibility(0);
                this.f22759h.setVisibility(8);
                break;
                break;
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22765n.setVisibility(8);
                this.f22764m.setVisibility(0);
                this.f22763l.setVisibility(8);
                this.f22770s.setVisibility(8);
                m20443a(c7660n, c7660n.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22765n.setVisibility(0);
                this.f22764m.setVisibility(0);
                this.f22764m.setImageResource(R.drawable.ic_file_stop_download);
                this.f22763l.setVisibility(0);
                this.f22763l.setText(c7660n.f23674P);
                if (c7660n.f23679U > 0) {
                    progressWheel = this.f22765n;
                    f = ((float) c7660n.f23679U) * 0.01f;
                } else {
                    progressWheel = this.f22765n;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22770s.setVisibility(8);
                this.f22776y = true;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7660n, this.f22769r, true);
    }
}
