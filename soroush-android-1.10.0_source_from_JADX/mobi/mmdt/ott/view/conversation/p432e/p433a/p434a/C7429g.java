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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7703g;
import mobi.mmdt.ott.view.tools.C4515k;

public final class C7429g extends C7345b {
    private ImageView f21606d;
    private View f21607e;
    private ImageButton f21608f;
    private ProgressWheel f21609g;
    private C3284e f21610h;
    private C3283d f21611i;
    private int f21612j;
    private int f21613k;
    private float f21614l;
    private RelativeLayout f21615m;
    private TextView f21616n;
    private Uri f21617o;
    private boolean f21618p;
    private C1247e<Drawable> f21619q;

    class C34982 implements OnClickListener {
        final /* synthetic */ C7429g f10644a;

        C34982(C7429g c7429g) {
            this.f10644a = c7429g;
        }

        public final void onClick(View view) {
            C7703g c7703g = (C7703g) this.f10644a.f16244a;
            switch (c7703g.f24167V) {
                case DELETED:
                case NOT_STARTED:
                    this.f10644a.f21610h.mo2307a(c7703g.ac, true);
                    return;
                case TRANSMITTING:
                    this.f10644a.f21610h.mo2305a(c7703g.ac);
                    return;
                case CANCEL:
                    this.f10644a.f21610h.mo2307a(c7703g.ac, true);
                    return;
                case ERROR:
                    this.f10644a.f21610h.mo2307a(c7703g.ac, true);
                    return;
                default:
                    return;
            }
        }
    }

    class C34993 implements OnClickListener {
        final /* synthetic */ C7429g f10645a;

        C34993(C7429g c7429g) {
            this.f10645a = c7429g;
        }

        public final void onClick(View view) {
            C7703g c7703g = (C7703g) this.f10645a.f16244a;
            if (C35004.f10646a[c7703g.f24167V.ordinal()] == 6) {
                this.f10645a.f21611i.mo2325c(c7703g.f24164S, c7703g.f21334t);
            }
        }
    }

    class C61351 implements C1247e<Drawable> {
        final /* synthetic */ C7429g f16620a;

        C61351(C7429g c7429g) {
            this.f16620a = c7429g;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7703g c7703g = (C7703g) this.f16620a.f16244a;
            C7429g.m19775a(this.f16620a, c7703g.f24162Q, c7703g.f24163R);
            return false;
        }
    }

    public C7429g(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, float f, int i2, C3284e c3284e, C3288i c3288i, C3283d c3283d, C3286g c3286g) {
        C7345b c7345b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_image_channel_direct_input_list_item : R.layout.chat_image_channel_direct_input_list_item_old, c3288i, c3286g, c3284e);
        c7345b.f21618p = C2535a.m6888a().au() ^ 1;
        c7345b.f21619q = new C61351(c7345b);
        c7345b.f21610h = c3284e;
        c7345b.f21611i = c3283d;
        c7345b.f21612j = i3;
        c7345b.f21614l = f;
        c7345b.f21613k = i2;
        c7345b.f21606d = (ImageView) c7345b.itemView.findViewById(R.id.content_imageView);
        c7345b.f21607e = c7345b.itemView.findViewById(R.id.bottom_gradient_view);
        c7345b.f21608f = (ImageButton) c7345b.itemView.findViewById(R.id.action_imageView);
        c7345b.f21609g = (ProgressWheel) c7345b.itemView.findViewById(R.id.progress_wheel);
        c7345b.f21615m = (RelativeLayout) c7345b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7345b.f21616n = (TextView) c7345b.itemView.findViewById(R.id.progress_text_action_view);
        LayoutParams layoutParams = (LayoutParams) c7345b.f21606d.getLayoutParams();
        layoutParams.height = i3;
        if (c7345b.f21618p) {
            layoutParams.width = i3;
            m19774a(i3);
        }
        c7345b.f21608f.setOnClickListener(new C34982(c7345b));
        c7345b.f21606d.setOnClickListener(new C34993(c7345b));
    }

    private void m19774a(int i) {
        if (this.f21607e != null) {
            int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            LayoutParams layoutParams = (LayoutParams) this.f21607e.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = dimension;
        }
    }

    static /* synthetic */ void m19775a(C7429g c7429g, int i, int i2) {
        if (i > 0 && i2 > 0) {
            LayoutParams layoutParams = (LayoutParams) c7429g.f21606d.getLayoutParams();
            if (c7429g.f21618p) {
                Point b = C2491i.m6807b(c7429g.f21612j, i, i2);
                i = i < c7429g.f21612j ? c7429g.f21612j : b.x;
                i2 = b.y;
                layoutParams.width = i;
                c7429g.m19774a(i);
            } else {
                float f = (float) i;
                float f2 = c7429g.f21614l / f;
                if (f <= c7429g.f21614l) {
                    f = (float) i2;
                    i2 = (int) (f + (f2 * f));
                }
                if (i2 > c7429g.f21613k) {
                    i2 = c7429g.f21613k;
                }
            }
            layoutParams.height = i2;
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7703g c7703g = (C7703g) c6829g;
        Object a = C2613o.m7045a(c7703g.f24167V, c7703g.f24168W, c7703g.f24164S, c7703g.f24165T, c7703g.f21300A);
        if (this.f21617o == null || !this.f21617o.equals(a)) {
            C1274i a2;
            C1247e c1247e = null;
            this.f21606d.setImageBitmap(null);
            C5255m a3 = C4515k.m8230a(c7703g.f24167V, c7703g.f24164S);
            if (c7703g.f24162Q <= 0 || c7703g.f24163R <= 0) {
                C1248f b = new C1248f().m2954b(this.f21612j, this.f21612j);
                if (a3 != null) {
                    b.m2951a(a3);
                }
                a2 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                a2.f3986c = this.f21619q;
                a2 = a2.m3034a(b);
            } else {
                Point a4 = this.f21618p ? C2491i.m6763a(this.f21612j, c7703g.f24162Q, c7703g.f24163R) : null;
                C1248f b2 = new C1248f().m2954b(this.f21618p ? a4.x : this.f21612j, this.f21618p ? a4.y : this.f21612j);
                if (a3 != null) {
                    b2.m2951a(a3);
                }
                a2 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(b2);
                if (this.f21618p) {
                    c1247e = this.f21619q;
                }
                a2.f3986c = c1247e;
            }
            a2.m3031a(this.f21606d);
        }
        this.f21617o = a;
        switch (c7703g.f24167V) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21609g.setVisibility(8);
                this.f21608f.setVisibility(0);
                this.f21608f.setImageResource(R.drawable.ic_file_start_download);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21609g.setVisibility(0);
                this.f21608f.setVisibility(0);
                this.f21608f.setImageResource(R.drawable.ic_file_stop_download);
                this.f21616n.setVisibility(0);
                this.f21616n.setText(c7703g.f24161P);
                if (c7703g.f24166U > 0) {
                    progressWheel = this.f21609g;
                    f = ((float) c7703g.f24166U) * 0.01f;
                } else {
                    progressWheel = this.f21609g;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f21609g.setVisibility(8);
                this.f21608f.setVisibility(8);
                break;
            default:
                break;
        }
        this.f21616n.setVisibility(8);
        m19051a((C7358a) c7703g, this.f21615m, false);
    }
}
