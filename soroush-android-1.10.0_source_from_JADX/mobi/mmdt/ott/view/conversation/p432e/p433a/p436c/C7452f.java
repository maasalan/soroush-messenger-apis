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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7587f;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7452f extends C7347b {
    private View f21890e;
    private int f21891f;
    private int f21892g;
    private float f21893h;
    private ImageView f21894i;
    private TextView f21895j;
    private ImageButton f21896k;
    private ProgressWheel f21897l;
    private C3284e f21898m;
    private C3283d f21899n;
    private RelativeLayout f21900o;
    private TextView f21901p;
    private Uri f21902q;
    private boolean f21903r;
    private C1247e<Drawable> f21904s;

    class C35792 implements OnClickListener {
        final /* synthetic */ C7452f f10747a;

        C35792(C7452f c7452f) {
            this.f10747a = c7452f;
        }

        public final void onClick(View view) {
            C7587f c7587f = (C7587f) this.f10747a.f16244a;
            switch (c7587f.f23179W) {
                case DELETED:
                case NOT_STARTED:
                    this.f10747a.f21898m.mo2307a(c7587f.ac, true);
                    return;
                case TRANSMITTING:
                    this.f10747a.f21898m.mo2305a(c7587f.ac);
                    return;
                case CANCEL:
                    this.f10747a.f21898m.mo2307a(c7587f.ac, true);
                    return;
                case ERROR:
                    this.f10747a.f21898m.mo2307a(c7587f.ac, true);
                    return;
                default:
                    return;
            }
        }
    }

    class C35803 implements OnClickListener {
        final /* synthetic */ C7452f f10748a;

        C35803(C7452f c7452f) {
            this.f10748a = c7452f;
        }

        public final void onClick(View view) {
            C7587f c7587f = (C7587f) this.f10748a.f16244a;
            if (C35814.f10749a[c7587f.f23179W.ordinal()] == 6) {
                this.f10748a.f21899n.mo2325c(c7587f.f23175S, c7587f.f21334t);
            }
        }
    }

    class C61461 implements C1247e<Drawable> {
        final /* synthetic */ C7452f f16631a;

        C61461(C7452f c7452f) {
            this.f16631a = c7452f;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7587f c7587f = (C7587f) this.f16631a.f16244a;
            C7452f.m19933a(this.f16631a, c7587f.f23173Q, c7587f.f23174R);
            return false;
        }
    }

    public C7452f(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, float f, int i3, C3284e c3284e, C3280a c3280a, C3283d c3283d, C3286g c3286g) {
        C7347b c7347b = this;
        int i4 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_image_captioned_channel_input_list_item : R.layout.chat_image_captioned_channel_input_list_item_old, c3280a, c3286g, c3284e);
        c7347b.f21903r = C2535a.m6888a().au() ^ 1;
        c7347b.f21904s = new C61461(c7347b);
        c7347b.f21898m = c3284e;
        c7347b.f21899n = c3283d;
        c7347b.f21891f = i4;
        c7347b.f21893h = f;
        c7347b.f21892g = i3;
        c7347b.f21894i = (ImageView) c7347b.itemView.findViewById(R.id.content_imageView);
        c7347b.f21895j = (TextView) c7347b.itemView.findViewById(R.id.caption_textView);
        c7347b.f21896k = (ImageButton) c7347b.itemView.findViewById(R.id.action_imageView);
        c7347b.f21897l = (ProgressWheel) c7347b.itemView.findViewById(R.id.progress_wheel);
        c7347b.f21900o = (RelativeLayout) c7347b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7347b.f21901p = (TextView) c7347b.itemView.findViewById(R.id.progress_text_action_view);
        c7347b.f21890e = c7347b.itemView.findViewById(R.id.bottom_gradient_view);
        LayoutParams layoutParams = (LayoutParams) c7347b.f21894i.getLayoutParams();
        layoutParams.height = i2;
        if (c7347b.f21903r) {
            layoutParams.width = i4;
            m19932a(i4);
        }
        c7347b.f21896k.setOnClickListener(new C35792(c7347b));
        c7347b.f21894i.setOnClickListener(new C35803(c7347b));
    }

    private void m19932a(int i) {
        if (this.f21890e != null) {
            int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            LayoutParams layoutParams = (LayoutParams) this.f21890e.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = dimension;
        }
    }

    static /* synthetic */ void m19933a(C7452f c7452f, int i, int i2) {
        if (i > 0 && i2 > 0) {
            LayoutParams layoutParams = (LayoutParams) c7452f.f21894i.getLayoutParams();
            if (c7452f.f21903r) {
                Point b = C2491i.m6807b(c7452f.f21891f, i, i2);
                i = i < c7452f.f21891f ? c7452f.f21891f : b.x;
                i2 = b.y;
                layoutParams.width = i;
                c7452f.m19932a(i);
            } else {
                float f = (float) i;
                float f2 = c7452f.f21893h / f;
                if (f <= c7452f.f21893h) {
                    f = (float) i2;
                    i2 = (int) (f + (f2 * f));
                }
                if (i2 > c7452f.f21892g) {
                    i2 = c7452f.f21892g;
                }
            }
            layoutParams.height = i2;
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7587f c7587f = (C7587f) c6829g;
        Object a = C2613o.m7045a(c7587f.f23179W, c7587f.f23180X, c7587f.f23175S, c7587f.f23176T, c7587f.f21300A);
        if (this.f21902q == null || !this.f21902q.equals(a)) {
            C1274i a2;
            C1247e c1247e = null;
            this.f21894i.setImageBitmap(null);
            C5255m a3 = C4515k.m8230a(c7587f.f23179W, c7587f.f23175S);
            if (c7587f.f23173Q <= 0 || c7587f.f23174R <= 0) {
                C1248f b = new C1248f().m2954b(this.f21891f, this.f21891f);
                if (a3 != null) {
                    b.m2951a(a3);
                }
                a2 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                a2.f3986c = this.f21904s;
                a2 = a2.m3034a(b);
            } else {
                Point a4 = this.f21903r ? C2491i.m6763a(this.f21891f, c7587f.f23173Q, c7587f.f23174R) : null;
                C1248f b2 = new C1248f().m2954b(this.f21903r ? a4.x : this.f21891f, this.f21903r ? a4.y : this.f21891f);
                if (a3 != null) {
                    b2.m2951a(a3);
                }
                a2 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(b2);
                if (this.f21903r) {
                    c1247e = this.f21904s;
                }
                a2.f3986c = c1247e;
            }
            a2.m3031a(this.f21894i);
        }
        this.f21902q = a;
        if (c7587f.f23177U == null || c7587f.f23177U.isEmpty()) {
            this.f21895j.setVisibility(8);
        } else {
            this.f21895j.setText(c7587f.f23177U);
            this.f21895j.setVisibility(0);
            this.f21895j.setTextSize((float) c7587f.f23181Y);
            C4520n.m8234a(this.f21895j);
        }
        switch (c7587f.f23179W) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21897l.setVisibility(8);
                this.f21896k.setVisibility(0);
                this.f21896k.setImageResource(R.drawable.ic_file_start_download);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21897l.setVisibility(0);
                this.f21896k.setVisibility(0);
                this.f21896k.setImageResource(R.drawable.ic_file_stop_download);
                this.f21901p.setVisibility(0);
                this.f21901p.setText(c7587f.f23172P);
                if (c7587f.f23178V > 0) {
                    progressWheel = this.f21897l;
                    f = ((float) c7587f.f23178V) * 0.01f;
                } else {
                    progressWheel = this.f21897l;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f21897l.setVisibility(8);
                this.f21896k.setVisibility(8);
                break;
            default:
                break;
        }
        this.f21901p.setVisibility(8);
        m19051a((C7358a) c7587f, this.f21900o, false);
    }
}
