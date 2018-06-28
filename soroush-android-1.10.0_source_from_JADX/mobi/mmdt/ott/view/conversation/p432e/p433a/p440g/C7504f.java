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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7639f;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7504f extends C7351b {
    private ImageView f22520d;
    private TextView f22521e;
    private ImageButton f22522f;
    private ProgressWheel f22523g;
    private C3284e f22524h;
    private C3283d f22525i;
    private int f22526j;
    private RelativeLayout f22527k;
    private TextView f22528l;
    private Uri f22529m;
    private C1247e<Drawable> f22530n = new C61741(this);

    class C37892 implements OnClickListener {
        final /* synthetic */ C7504f f11126a;

        C37892(C7504f c7504f) {
            this.f11126a = c7504f;
        }

        public final void onClick(View view) {
            C7639f c7639f = (C7639f) this.f11126a.f16244a;
            switch (c7639f.ab) {
                case DELETED:
                case NOT_STARTED:
                    this.f11126a.f22524h.mo2307a(c7639f.f23101W, true);
                    return;
                case TRANSMITTING:
                    this.f11126a.f22524h.mo2305a(c7639f.f23101W);
                    return;
                case CANCEL:
                    this.f11126a.f22524h.mo2307a(c7639f.f23101W, true);
                    return;
                case ERROR:
                    this.f11126a.f22524h.mo2307a(c7639f.f23101W, true);
                    return;
                default:
                    return;
            }
        }
    }

    class C37903 implements OnClickListener {
        final /* synthetic */ C7504f f11127a;

        C37903(C7504f c7504f) {
            this.f11127a = c7504f;
        }

        public final void onClick(View view) {
            C7639f c7639f = (C7639f) this.f11127a.f16244a;
            if (C37914.f11128a[c7639f.ab.ordinal()] == 6) {
                this.f11127a.f22525i.mo2325c(c7639f.f23537S, c7639f.f21334t);
            }
        }
    }

    class C61741 implements C1247e<Drawable> {
        final /* synthetic */ C7504f f16691a;

        C61741(C7504f c7504f) {
            this.f16691a = c7504f;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7639f c7639f = (C7639f) this.f16691a.f16244a;
            int i = c7639f.f23535Q;
            if (i > 0 && c7639f.f23536R > 0) {
                Point b = C2491i.m6807b(this.f16691a.f22526j, i, c7639f.f23536R);
                LayoutParams layoutParams = (LayoutParams) this.f16691a.f22520d.getLayoutParams();
                layoutParams.width = i < this.f16691a.f22526j ? this.f16691a.f22526j : b.x;
                layoutParams.height = b.y;
            }
            return false;
        }
    }

    public C7504f(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3288i c3288i, C3283d c3283d, C3286g c3286g) {
        int i3 = i;
        super(activity, layoutInflater, viewGroup, R.layout.chat_image_captioned_social_input_list_item, c3288i, c3286g, c3284e);
        this.f22524h = c3284e;
        this.f22525i = c3283d;
        this.f22526j = i3;
        this.f22520d = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f22521e = (TextView) this.itemView.findViewById(R.id.caption_textView);
        this.f22522f = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22523g = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f22527k = (RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f22528l = (TextView) this.itemView.findViewById(R.id.progress_text_action_view);
        LayoutParams layoutParams = (LayoutParams) this.f22520d.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i3;
        this.f22522f.setOnClickListener(new C37892(this));
        this.f22520d.setOnClickListener(new C37903(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7639f c7639f = (C7639f) c6829g;
        Object a = C2613o.m7045a(c7639f.ab, c7639f.ac, c7639f.f23537S, c7639f.f23538T, c7639f.f21300A);
        if (this.f22529m == null || !this.f22529m.equals(a)) {
            C1274i a2;
            this.f22520d.setImageBitmap(null);
            if (c7639f.f23535Q <= 0 || c7639f.f23536R <= 0) {
                C1248f a3;
                if (c7639f.ab != C2987i.FINISHED || c7639f.f23537S == null) {
                    a2 = C1212c.m2872a(this.c).m10950a(a);
                    a3 = new C1248f().m2959e().m2954b(this.f22526j, this.f22526j).m2951a(new C7156b(10));
                } else {
                    a2 = C1212c.m2872a(this.c).m10950a(a);
                    a3 = new C1248f().m2959e().m2954b(this.f22526j, this.f22526j);
                }
                a2 = a2.m3034a(a3).m3033a();
            } else {
                Point a4 = C2491i.m6763a(this.f22526j, c7639f.f23535Q, c7639f.f23536R);
                a2 = (c7639f.ab != C2987i.FINISHED || c7639f.f23537S == null) ? C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(new C1248f().m2954b(a4.x, a4.y).m2951a(new C7156b(10))) : C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(new C1248f().m2954b(a4.x, a4.y));
            }
            a2.f3986c = this.f22530n;
            a2.m3031a(this.f22520d);
        }
        this.f22529m = a;
        if (c7639f.f23539U == null || c7639f.f23539U.isEmpty()) {
            this.f22521e.setVisibility(8);
        } else {
            this.f22521e.setText(c7639f.f23539U);
            this.f22521e.setVisibility(0);
            this.f22521e.setTextSize((float) (((double) c7639f.ad) * 0.85d));
            C4520n.m8234a(this.f22521e);
        }
        switch (c7639f.ab) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22523g.setVisibility(8);
                this.f22522f.setVisibility(0);
                this.f22522f.setImageResource(R.drawable.ic_file_start_download);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22523g.setVisibility(0);
                this.f22522f.setVisibility(0);
                this.f22522f.setImageResource(R.drawable.ic_file_stop_download);
                this.f22528l.setVisibility(0);
                this.f22528l.setText(c7639f.f23534P);
                if (c7639f.aa > 0) {
                    progressWheel = this.f22523g;
                    f = ((float) c7639f.aa) * 0.01f;
                } else {
                    progressWheel = this.f22523g;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22523g.setVisibility(8);
                this.f22522f.setVisibility(8);
                break;
            default:
                break;
        }
        this.f22528l.setVisibility(8);
        m19051a((C7358a) c7639f, this.f22527k, false);
    }
}
