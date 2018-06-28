package mobi.mmdt.ott.view.conversation.p432e.p433a.p440g;

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
import com.p085c.p086a.p105g.C1247e;
import com.p085c.p086a.p105g.C1248f;
import jp.wasabeef.p215a.p216a.C7156b;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p261a.af.C2613o;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7640g;

public final class C7505g extends C7351b {
    private ImageView f22531d;
    private View f22532e;
    private ImageButton f22533f;
    private ProgressWheel f22534g;
    private C3284e f22535h;
    private C3283d f22536i;
    private int f22537j;
    private RelativeLayout f22538k;
    private TextView f22539l;
    private Uri f22540m;
    private C1247e<Drawable> f22541n = new C61751(this);

    class C37922 implements OnClickListener {
        final /* synthetic */ C7505g f11129a;

        C37922(C7505g c7505g) {
            this.f11129a = c7505g;
        }

        public final void onClick(View view) {
            C7640g c7640g = (C7640g) this.f11129a.f16244a;
            switch (c7640g.aa) {
                case DELETED:
                case NOT_STARTED:
                    this.f11129a.f22535h.mo2307a(c7640g.f23101W, true);
                    return;
                case TRANSMITTING:
                    this.f11129a.f22535h.mo2305a(c7640g.f23101W);
                    return;
                case CANCEL:
                    this.f11129a.f22535h.mo2307a(c7640g.f23101W, true);
                    return;
                case ERROR:
                    this.f11129a.f22535h.mo2307a(c7640g.f23101W, true);
                    return;
                default:
                    return;
            }
        }
    }

    class C37933 implements OnClickListener {
        final /* synthetic */ C7505g f11130a;

        C37933(C7505g c7505g) {
            this.f11130a = c7505g;
        }

        public final void onClick(View view) {
            C7640g c7640g = (C7640g) this.f11130a.f16244a;
            if (C37944.f11131a[c7640g.aa.ordinal()] == 6) {
                this.f11130a.f22536i.mo2325c(c7640g.f23543S, c7640g.f21334t);
            }
        }
    }

    class C61751 implements C1247e<Drawable> {
        final /* synthetic */ C7505g f16692a;

        C61751(C7505g c7505g) {
            this.f16692a = c7505g;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7640g c7640g = (C7640g) this.f16692a.f16244a;
            int i = c7640g.f23541Q;
            if (i > 0 && c7640g.f23542R > 0) {
                Point b = C2491i.m6807b(this.f16692a.f22537j, i, c7640g.f23542R);
                LayoutParams layoutParams = (LayoutParams) this.f16692a.f22531d.getLayoutParams();
                i = i < this.f16692a.f22537j ? this.f16692a.f22537j : b.x;
                layoutParams.width = i;
                layoutParams.height = b.y;
                int dimension = (int) this.f16692a.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
                layoutParams = (LayoutParams) this.f16692a.f22532e.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = dimension;
            }
            return false;
        }
    }

    public C7505g(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3288i c3288i, C3283d c3283d, C3286g c3286g) {
        int i3 = i;
        super(activity, layoutInflater, viewGroup, R.layout.chat_image_social_input_list_item, c3288i, c3286g, c3284e);
        this.f22535h = c3284e;
        this.f22536i = c3283d;
        this.f22537j = i3;
        this.f22531d = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f22532e = this.itemView.findViewById(R.id.bottom_gradient_view);
        this.f22533f = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22534g = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f22538k = (RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f22539l = (TextView) this.itemView.findViewById(R.id.progress_text_action_view);
        LayoutParams layoutParams = (LayoutParams) this.f22531d.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i3;
        LayoutParams layoutParams2 = (LayoutParams) this.f22532e.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i3;
        this.f22533f.setOnClickListener(new C37922(this));
        this.f22531d.setOnClickListener(new C37933(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7640g c7640g = (C7640g) c6829g;
        Object a = C2613o.m7045a(c7640g.aa, c7640g.ab, c7640g.f23543S, c7640g.f23544T, c7640g.f21300A);
        if (this.f22540m == null || !this.f22540m.equals(a)) {
            C1274i a2;
            this.f22531d.setImageBitmap(null);
            if (c7640g.f23541Q <= 0 || c7640g.f23542R <= 0) {
                C1248f a3;
                if (c7640g.aa != C2987i.FINISHED || c7640g.f23543S == null) {
                    a2 = C1212c.m2872a(this.c).m10950a(a);
                    a3 = new C1248f().m2959e().m2954b(this.f22537j, this.f22537j).m2951a(new C7156b(10));
                } else {
                    a2 = C1212c.m2872a(this.c).m10950a(a);
                    a3 = new C1248f().m2959e().m2954b(this.f22537j, this.f22537j);
                }
                a2 = a2.m3034a(a3).m3033a();
            } else {
                Point a4 = C2491i.m6763a(this.f22537j, c7640g.f23541Q, c7640g.f23542R);
                a2 = (c7640g.aa != C2987i.FINISHED || c7640g.f23543S == null) ? C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(new C1248f().m2954b(a4.x, a4.y).m2951a(new C7156b(10))) : C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(new C1248f().m2954b(a4.x, a4.y));
            }
            a2.f3986c = this.f22541n;
            a2.m3031a(this.f22531d);
        }
        this.f22540m = a;
        switch (c7640g.aa) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22534g.setVisibility(8);
                this.f22533f.setVisibility(0);
                this.f22533f.setImageResource(R.drawable.ic_file_start_download);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22534g.setVisibility(0);
                this.f22533f.setVisibility(0);
                this.f22533f.setImageResource(R.drawable.ic_file_stop_download);
                this.f22539l.setVisibility(0);
                this.f22539l.setText(c7640g.f23540P);
                if (c7640g.f23545U > 0) {
                    progressWheel = this.f22534g;
                    f = ((float) c7640g.f23545U) * 0.01f;
                } else {
                    progressWheel = this.f22534g;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22534g.setVisibility(8);
                this.f22533f.setVisibility(8);
                break;
            default:
                break;
        }
        this.f22539l.setVisibility(8);
        m19051a((C7358a) c7640g, this.f22538k, false);
    }
}
