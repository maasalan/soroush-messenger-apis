package mobi.mmdt.ott.view.conversation.p432e.p433a.p438e;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7614g;
import mobi.mmdt.ott.view.tools.C4515k;

public final class C7479g extends C7349b {
    private View f22220e;
    private ImageView f22221f;
    private ImageButton f22222g;
    private ProgressWheel f22223h;
    private C3284e f22224i;
    private C3283d f22225j;
    private int f22226k;
    private TextView f22227l;
    private int f22228m;
    private float f22229n;
    private RelativeLayout f22230o;
    private Uri f22231p;
    private boolean f22232q;
    private C1247e<Drawable> f22233r;

    class C36882 implements OnClickListener {
        final /* synthetic */ C7479g f10941a;

        C36882(C7479g c7479g) {
            this.f10941a = c7479g;
        }

        public final void onClick(View view) {
            C7614g c7614g = (C7614g) this.f10941a.f16244a;
            switch (c7614g.ac) {
                case DELETED:
                case NOT_STARTED:
                    this.f10941a.f22224i.mo2307a(c7614g.f23088W, true);
                    return;
                case TRANSMITTING:
                    this.f10941a.f22224i.mo2305a(c7614g.f23088W);
                    return;
                case CANCEL:
                    this.f10941a.f22224i.mo2307a(c7614g.f23088W, true);
                    return;
                case ERROR:
                    this.f10941a.f22224i.mo2307a(c7614g.f23088W, true);
                    return;
                default:
                    return;
            }
        }
    }

    class C36893 implements OnClickListener {
        final /* synthetic */ C7479g f10942a;

        C36893(C7479g c7479g) {
            this.f10942a = c7479g;
        }

        public final void onClick(View view) {
            C7614g c7614g = (C7614g) this.f10942a.f16244a;
            if (C36904.f10943a[c7614g.ac.ordinal()] == 6) {
                this.f10942a.f22225j.mo2325c(c7614g.f23392S, c7614g.f21334t);
            }
        }
    }

    class C61611 implements C1247e<Drawable> {
        final /* synthetic */ C7479g f16662a;

        C61611(C7479g c7479g) {
            this.f16662a = c7479g;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7614g c7614g = (C7614g) this.f16662a.f16244a;
            C7479g.m20115a(this.f16662a, c7614g.f23390Q, c7614g.f23391R);
            return false;
        }
    }

    public C7479g(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, float f, int i2, C3284e c3284e, C3280a c3280a, C3283d c3283d, C3286g c3286g) {
        C7349b c7349b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_image_channel_input_list_item : R.layout.chat_image_channel_input_list_item_old, c3280a, c3286g, c3284e);
        c7349b.f22232q = C2535a.m6888a().au() ^ 1;
        c7349b.f22233r = new C61611(c7349b);
        c7349b.f22224i = c3284e;
        c7349b.f22225j = c3283d;
        c7349b.f22226k = i3;
        c7349b.f22229n = f;
        c7349b.f22228m = i2;
        c7349b.f22221f = (ImageView) c7349b.itemView.findViewById(R.id.content_imageView);
        c7349b.f22222g = (ImageButton) c7349b.itemView.findViewById(R.id.action_imageView);
        c7349b.f22223h = (ProgressWheel) c7349b.itemView.findViewById(R.id.progress_wheel);
        c7349b.f22230o = (RelativeLayout) c7349b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7349b.f22227l = (TextView) c7349b.itemView.findViewById(R.id.progress_text_action_view);
        c7349b.f22220e = c7349b.itemView.findViewById(R.id.bottom_gradient_view);
        LayoutParams layoutParams = (LayoutParams) c7349b.f22221f.getLayoutParams();
        layoutParams.height = i3;
        if (c7349b.f22232q) {
            layoutParams.width = i3;
            m20114a(i3);
        }
        c7349b.f22222g.setOnClickListener(new C36882(c7349b));
        c7349b.f22221f.setOnClickListener(new C36893(c7349b));
    }

    private void m20114a(int i) {
        if (this.f22220e != null) {
            int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            LayoutParams layoutParams = (LayoutParams) this.f22220e.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = dimension;
        }
    }

    static /* synthetic */ void m20115a(C7479g c7479g, int i, int i2) {
        if (i > 0 && i2 > 0) {
            LayoutParams layoutParams = (LayoutParams) c7479g.f22221f.getLayoutParams();
            if (c7479g.f22232q) {
                Point b = C2491i.m6807b(c7479g.f22226k, i, i2);
                i = i < c7479g.f22226k ? c7479g.f22226k : b.x;
                i2 = b.y;
                layoutParams.width = i;
                c7479g.m20114a(i);
            } else {
                float f = (float) i;
                float f2 = c7479g.f22229n / f;
                if (f <= c7479g.f22229n) {
                    f = (float) i2;
                    i2 = (int) (f + (f2 * f));
                }
                if (i2 > c7479g.f22228m) {
                    i2 = c7479g.f22228m;
                }
            }
            layoutParams.height = i2;
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7614g c7614g = (C7614g) c6829g;
        Object a = C2613o.m7045a(c7614g.ac, c7614g.ad, c7614g.f23392S, c7614g.f23393T, c7614g.f21300A);
        if (this.f22231p == null || !this.f22231p.equals(a)) {
            C1274i a2;
            C1247e c1247e = null;
            this.f22221f.setImageBitmap(null);
            C5255m a3 = C4515k.m8230a(c7614g.ac, c7614g.f23392S);
            if (c7614g.f23390Q <= 0 || c7614g.f23391R <= 0) {
                C1248f b = new C1248f().m2954b(this.f22226k, this.f22226k);
                if (a3 != null) {
                    b.m2951a(a3);
                }
                a2 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                a2.f3986c = this.f22233r;
                a2 = a2.m3034a(b);
            } else {
                Point a4 = this.f22232q ? C2491i.m6763a(this.f22226k, c7614g.f23390Q, c7614g.f23391R) : null;
                C1248f b2 = new C1248f().m2954b(this.f22232q ? a4.x : this.f22226k, this.f22232q ? a4.y : this.f22226k);
                if (a3 != null) {
                    b2.m2951a(a3);
                }
                a2 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(b2);
                if (this.f22232q) {
                    c1247e = this.f22233r;
                }
                a2.f3986c = c1247e;
            }
            a2.m3031a(this.f22221f);
        }
        this.f22231p = a;
        switch (c7614g.ac) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22223h.setVisibility(8);
                this.f22222g.setVisibility(0);
                this.f22222g.setImageResource(R.drawable.ic_file_start_download);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22223h.setVisibility(0);
                this.f22222g.setVisibility(0);
                this.f22222g.setImageResource(R.drawable.ic_file_stop_download);
                this.f22227l.setVisibility(0);
                this.f22227l.setText(c7614g.f23389P);
                if (c7614g.f23394U > 0) {
                    progressWheel = this.f22223h;
                    f = ((float) c7614g.f23394U) * 0.01f;
                } else {
                    progressWheel = this.f22223h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22223h.setVisibility(8);
                this.f22222g.setVisibility(8);
                break;
            default:
                break;
        }
        this.f22227l.setVisibility(8);
        m19051a((C7358a) c7614g, this.f22230o, false);
    }
}
