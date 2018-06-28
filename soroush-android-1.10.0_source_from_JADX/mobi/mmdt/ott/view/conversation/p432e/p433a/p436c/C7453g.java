package mobi.mmdt.ott.view.conversation.p432e.p433a.p436c;

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
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7588g;
import mobi.mmdt.ott.view.tools.C4515k;

public final class C7453g extends C7347b {
    private int f21905e;
    private int f21906f;
    private float f21907g;
    private View f21908h;
    private ImageView f21909i;
    private ImageButton f21910j;
    private ProgressWheel f21911k;
    private C3284e f21912l;
    private C3283d f21913m;
    private RelativeLayout f21914n;
    private TextView f21915o;
    private Uri f21916p;
    private boolean f21917q;
    private C1247e<Drawable> f21918r;

    class C35822 implements OnClickListener {
        final /* synthetic */ C7453g f10750a;

        C35822(C7453g c7453g) {
            this.f10750a = c7453g;
        }

        public final void onClick(View view) {
            C7588g c7588g = (C7588g) this.f10750a.f16244a;
            switch (c7588g.f23188V) {
                case DELETED:
                case NOT_STARTED:
                    this.f10750a.f21912l.mo2307a(c7588g.ac, true);
                    return;
                case TRANSMITTING:
                    this.f10750a.f21912l.mo2305a(c7588g.ac);
                    return;
                case CANCEL:
                    this.f10750a.f21912l.mo2307a(c7588g.ac, true);
                    return;
                case ERROR:
                    this.f10750a.f21912l.mo2307a(c7588g.ac, true);
                    return;
                default:
                    return;
            }
        }
    }

    class C35833 implements OnClickListener {
        final /* synthetic */ C7453g f10751a;

        C35833(C7453g c7453g) {
            this.f10751a = c7453g;
        }

        public final void onClick(View view) {
            C7588g c7588g = (C7588g) this.f10751a.f16244a;
            if (C35844.f10752a[c7588g.f23188V.ordinal()] == 6) {
                this.f10751a.f21913m.mo2325c(c7588g.f23185S, c7588g.f21334t);
            }
        }
    }

    class C61471 implements C1247e<Drawable> {
        final /* synthetic */ C7453g f16632a;

        C61471(C7453g c7453g) {
            this.f16632a = c7453g;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7588g c7588g = (C7588g) this.f16632a.f16244a;
            C7453g.m19938a(this.f16632a, c7588g.f23183Q, c7588g.f23184R);
            return false;
        }
    }

    public C7453g(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, float f, int i2, C3284e c3284e, C3280a c3280a, C3283d c3283d, C3286g c3286g) {
        C7347b c7347b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_image_channel_input_list_item : R.layout.chat_image_channel_input_list_item_old, c3280a, c3286g, c3284e);
        c7347b.f21917q = C2535a.m6888a().au() ^ 1;
        c7347b.f21918r = new C61471(c7347b);
        c7347b.f21912l = c3284e;
        c7347b.f21913m = c3283d;
        c7347b.f21905e = i3;
        c7347b.f21907g = f;
        c7347b.f21906f = i2;
        c7347b.f21909i = (ImageView) c7347b.itemView.findViewById(R.id.content_imageView);
        c7347b.f21908h = c7347b.itemView.findViewById(R.id.bottom_gradient_view);
        c7347b.f21910j = (ImageButton) c7347b.itemView.findViewById(R.id.action_imageView);
        c7347b.f21911k = (ProgressWheel) c7347b.itemView.findViewById(R.id.progress_wheel);
        c7347b.f21914n = (RelativeLayout) c7347b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7347b.f21915o = (TextView) c7347b.itemView.findViewById(R.id.progress_text_action_view);
        LayoutParams layoutParams = (LayoutParams) c7347b.f21909i.getLayoutParams();
        layoutParams.height = i3;
        if (c7347b.f21917q) {
            layoutParams.width = i3;
            m19937a(i3);
        }
        c7347b.f21910j.setOnClickListener(new C35822(c7347b));
        c7347b.f21909i.setOnClickListener(new C35833(c7347b));
    }

    private void m19937a(int i) {
        if (this.f21908h != null) {
            int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            LayoutParams layoutParams = (LayoutParams) this.f21908h.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = dimension;
        }
    }

    static /* synthetic */ void m19938a(C7453g c7453g, int i, int i2) {
        if (i > 0 && i2 > 0) {
            LayoutParams layoutParams = (LayoutParams) c7453g.f21909i.getLayoutParams();
            if (c7453g.f21917q) {
                Point b = C2491i.m6807b(c7453g.f21905e, i, i2);
                i = i < c7453g.f21905e ? c7453g.f21905e : b.x;
                i2 = b.y;
                layoutParams.width = i;
                c7453g.m19937a(i);
            } else {
                float f = (float) i;
                float f2 = c7453g.f21907g / f;
                if (f <= c7453g.f21907g) {
                    f = (float) i2;
                    i2 = (int) (f + (f2 * f));
                }
                if (i2 > c7453g.f21906f) {
                    i2 = c7453g.f21906f;
                }
            }
            layoutParams.height = i2;
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7588g c7588g = (C7588g) c6829g;
        Object a = C2613o.m7045a(c7588g.f23188V, c7588g.f23189W, c7588g.f23185S, c7588g.f23186T, c7588g.f21300A);
        if (this.f21916p == null || !this.f21916p.equals(a)) {
            C1274i a2;
            C1247e c1247e = null;
            this.f21909i.setImageBitmap(null);
            C5255m a3 = C4515k.m8230a(c7588g.f23188V, c7588g.f23185S);
            if (c7588g.f23183Q <= 0 || c7588g.f23184R <= 0) {
                C1248f b = new C1248f().m2954b(this.f21905e, this.f21905e);
                if (a3 != null) {
                    b.m2951a(a3);
                }
                a2 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                a2.f3986c = this.f21918r;
                a2 = a2.m3034a(b);
            } else {
                Point a4 = this.f21917q ? C2491i.m6763a(this.f21905e, c7588g.f23183Q, c7588g.f23184R) : null;
                C1248f b2 = new C1248f().m2954b(this.f21917q ? a4.x : this.f21905e, this.f21917q ? a4.y : this.f21905e);
                if (a3 != null) {
                    b2.m2951a(a3);
                }
                a2 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(b2);
                if (this.f21917q) {
                    c1247e = this.f21918r;
                }
                a2.f3986c = c1247e;
            }
            a2.m3031a(this.f21909i);
        }
        this.f21916p = a;
        switch (c7588g.f23188V) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21911k.setVisibility(8);
                this.f21910j.setVisibility(0);
                this.f21910j.setImageResource(R.drawable.ic_file_start_download);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21911k.setVisibility(0);
                this.f21910j.setVisibility(0);
                this.f21910j.setImageResource(R.drawable.ic_file_stop_download);
                this.f21915o.setVisibility(0);
                this.f21915o.setText(c7588g.f23182P);
                if (c7588g.f23187U > 0) {
                    progressWheel = this.f21911k;
                    f = ((float) c7588g.f23187U) * 0.01f;
                } else {
                    progressWheel = this.f21911k;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f21911k.setVisibility(8);
                this.f21910j.setVisibility(8);
                break;
            default:
                break;
        }
        this.f21915o.setVisibility(8);
        m19051a((C7358a) c7588g, this.f21914n, false);
    }
}
