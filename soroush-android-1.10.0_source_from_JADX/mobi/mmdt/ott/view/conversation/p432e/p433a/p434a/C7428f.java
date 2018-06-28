package mobi.mmdt.ott.view.conversation.p432e.p433a.p434a;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
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
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p261a.af.C2613o;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7702f;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7428f extends C7345b {
    private ImageView f21591d;
    private View f21592e;
    private TextView f21593f;
    private ImageButton f21594g;
    private ProgressWheel f21595h;
    private C3284e f21596i;
    private C3283d f21597j;
    private int f21598k;
    private int f21599l;
    private float f21600m;
    private RelativeLayout f21601n;
    private TextView f21602o;
    private Uri f21603p;
    private boolean f21604q;
    private C1247e<Drawable> f21605r;

    class C34952 implements OnClickListener {
        final /* synthetic */ C7428f f10641a;

        C34952(C7428f c7428f) {
            this.f10641a = c7428f;
        }

        public final void onClick(View view) {
            C7702f c7702f = (C7702f) this.f10641a.f16244a;
            switch (c7702f.f24158W) {
                case DELETED:
                case NOT_STARTED:
                    this.f10641a.f21596i.mo2307a(c7702f.ac, true);
                    return;
                case TRANSMITTING:
                    this.f10641a.f21596i.mo2305a(c7702f.ac);
                    return;
                case CANCEL:
                    this.f10641a.f21596i.mo2307a(c7702f.ac, true);
                    return;
                case ERROR:
                    this.f10641a.f21596i.mo2307a(c7702f.ac, true);
                    return;
                default:
                    return;
            }
        }
    }

    class C34963 implements OnClickListener {
        final /* synthetic */ C7428f f10642a;

        C34963(C7428f c7428f) {
            this.f10642a = c7428f;
        }

        public final void onClick(View view) {
            C7702f c7702f = (C7702f) this.f10642a.f16244a;
            if (C34974.f10643a[c7702f.f24158W.ordinal()] == 6) {
                this.f10642a.f21597j.mo2325c(c7702f.f24154S, c7702f.f21334t);
            }
        }
    }

    class C61341 implements C1247e<Drawable> {
        final /* synthetic */ C7428f f16619a;

        C61341(C7428f c7428f) {
            this.f16619a = c7428f;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7702f c7702f = (C7702f) this.f16619a.f16244a;
            C7428f.m19770a(this.f16619a, c7702f.f24152Q, c7702f.f24153R);
            return false;
        }
    }

    public C7428f(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, float f, int i2, C3284e c3284e, C3288i c3288i, C3283d c3283d, C3286g c3286g) {
        C7345b c7345b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_image_captioned_channel_direct_input_list_item : R.layout.chat_image_captioned_channel_direct_input_list_item_old, c3288i, c3286g, c3284e);
        c7345b.f21604q = C2535a.m6888a().au() ^ 1;
        c7345b.f21605r = new C61341(c7345b);
        c7345b.f21596i = c3284e;
        c7345b.f21597j = c3283d;
        c7345b.f21598k = i3;
        c7345b.f21600m = f;
        c7345b.f21599l = i2;
        c7345b.f21591d = (ImageView) c7345b.itemView.findViewById(R.id.content_imageView);
        c7345b.f21593f = (TextView) c7345b.itemView.findViewById(R.id.caption_textView);
        c7345b.f21594g = (ImageButton) c7345b.itemView.findViewById(R.id.action_imageView);
        c7345b.f21595h = (ProgressWheel) c7345b.itemView.findViewById(R.id.progress_wheel);
        c7345b.f21601n = (RelativeLayout) c7345b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7345b.f21592e = c7345b.itemView.findViewById(R.id.bottom_gradient_view);
        c7345b.f21602o = (TextView) c7345b.itemView.findViewById(R.id.progress_text_action_view);
        LayoutParams layoutParams = (LayoutParams) c7345b.f21591d.getLayoutParams();
        layoutParams.height = i3;
        if (c7345b.f21604q) {
            layoutParams.width = i3;
            m19769a(i3);
        }
        c7345b.f21594g.setOnClickListener(new C34952(c7345b));
        c7345b.f21591d.setOnClickListener(new C34963(c7345b));
    }

    private void m19769a(int i) {
        if (this.f21592e != null) {
            int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            LayoutParams layoutParams = (LayoutParams) this.f21592e.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = dimension;
        }
    }

    static /* synthetic */ void m19770a(C7428f c7428f, int i, int i2) {
        if (i > 0 && i2 > 0) {
            LayoutParams layoutParams = (LayoutParams) c7428f.f21591d.getLayoutParams();
            if (c7428f.f21604q) {
                Point b = C2491i.m6807b(c7428f.f21598k, i, i2);
                i = i < c7428f.f21598k ? c7428f.f21598k : b.x;
                i2 = b.y;
                layoutParams.width = i;
                c7428f.m19769a(i);
            } else {
                float f = (float) i;
                float f2 = c7428f.f21600m / f;
                if (f <= c7428f.f21600m) {
                    f = (float) i2;
                    i2 = (int) (f + (f2 * f));
                }
                if (i2 > c7428f.f21599l) {
                    i2 = c7428f.f21599l;
                }
            }
            layoutParams.height = i2;
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7702f c7702f = (C7702f) c6829g;
        Object a = C2613o.m7045a(c7702f.f24158W, c7702f.f24159X, c7702f.f24154S, c7702f.f24155T, c7702f.f21300A);
        if (this.f21603p == null || !this.f21603p.equals(a)) {
            C1274i a2;
            C1247e c1247e = null;
            this.f21591d.setImageBitmap(null);
            C5255m a3 = C4515k.m8230a(c7702f.f24158W, c7702f.f24154S);
            if (c7702f.f24152Q <= 0 || c7702f.f24153R <= 0) {
                C1248f b = new C1248f().m2954b(this.f21598k, this.f21598k);
                if (a3 != null) {
                    b.m2951a(a3);
                }
                a2 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                a2.f3986c = this.f21605r;
                a2 = a2.m3034a(b);
            } else {
                Point a4 = this.f21604q ? C2491i.m6763a(this.f21598k, c7702f.f24152Q, c7702f.f24153R) : null;
                C1248f b2 = new C1248f().m2954b(this.f21604q ? a4.x : this.f21598k, this.f21604q ? a4.y : this.f21598k);
                if (a3 != null) {
                    b2.m2951a(a3);
                }
                a2 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(b2);
                if (this.f21604q) {
                    c1247e = this.f21605r;
                }
                a2.f3986c = c1247e;
            }
            a2.m3031a(this.f21591d);
        }
        this.f21603p = a;
        if (c7702f.f24156U == null || c7702f.f24156U.isEmpty()) {
            this.f21593f.setVisibility(8);
        } else {
            this.f21593f.setText(c7702f.f24156U);
            this.f21593f.setVisibility(0);
            this.f21593f.setTextSize((float) c7702f.f24160Y);
            C4520n.m8234a(this.f21593f);
        }
        switch (c7702f.f24158W) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21595h.setVisibility(8);
                this.f21594g.setVisibility(0);
                this.f21594g.setImageResource(R.drawable.ic_file_start_download);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21595h.setVisibility(0);
                this.f21594g.setVisibility(0);
                this.f21594g.setImageResource(R.drawable.ic_file_stop_download);
                this.f21602o.setVisibility(0);
                this.f21602o.setText(c7702f.f24151P);
                if (c7702f.f24157V > 0) {
                    progressWheel = this.f21595h;
                    f = ((float) c7702f.f24157V) * 0.01f;
                } else {
                    progressWheel = this.f21595h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f21595h.setVisibility(8);
                this.f21594g.setVisibility(8);
                break;
            default:
                break;
        }
        this.f21602o.setVisibility(8);
        m19051a((C7358a) c7702f, this.f21601n, false);
    }
}
