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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7613f;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7478f extends C7349b {
    private View f22205e;
    private ImageView f22206f;
    private TextView f22207g;
    private ImageButton f22208h;
    private ProgressWheel f22209i;
    private C3284e f22210j;
    private C3283d f22211k;
    private int f22212l;
    private TextView f22213m;
    private int f22214n;
    private float f22215o;
    private RelativeLayout f22216p;
    private Uri f22217q;
    private boolean f22218r;
    private C1247e<Drawable> f22219s;

    class C36852 implements OnClickListener {
        final /* synthetic */ C7478f f10938a;

        C36852(C7478f c7478f) {
            this.f10938a = c7478f;
        }

        public final void onClick(View view) {
            C7613f c7613f = (C7613f) this.f10938a.f16244a;
            switch (c7613f.ad) {
                case DELETED:
                case NOT_STARTED:
                    this.f10938a.f22210j.mo2307a(c7613f.f23088W, true);
                    return;
                case TRANSMITTING:
                    this.f10938a.f22210j.mo2305a(c7613f.f23088W);
                    return;
                case CANCEL:
                    this.f10938a.f22210j.mo2307a(c7613f.f23088W, true);
                    return;
                case ERROR:
                    this.f10938a.f22210j.mo2307a(c7613f.f23088W, true);
                    return;
                default:
                    return;
            }
        }
    }

    class C36863 implements OnClickListener {
        final /* synthetic */ C7478f f10939a;

        C36863(C7478f c7478f) {
            this.f10939a = c7478f;
        }

        public final void onClick(View view) {
            C7613f c7613f = (C7613f) this.f10939a.f16244a;
            if (C36874.f10940a[c7613f.ad.ordinal()] == 6) {
                this.f10939a.f22211k.mo2325c(c7613f.f23386S, c7613f.f21334t);
            }
        }
    }

    class C61601 implements C1247e<Drawable> {
        final /* synthetic */ C7478f f16661a;

        C61601(C7478f c7478f) {
            this.f16661a = c7478f;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7613f c7613f = (C7613f) this.f16661a.f16244a;
            C7478f.m20110a(this.f16661a, c7613f.f23384Q, c7613f.f23385R);
            return false;
        }
    }

    public C7478f(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, float f, int i2, C3284e c3284e, C3280a c3280a, C3283d c3283d, C3286g c3286g) {
        C7349b c7349b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_image_captioned_channel_input_list_item : R.layout.chat_image_captioned_channel_input_list_item_old, c3280a, c3286g, c3284e);
        c7349b.f22218r = C2535a.m6888a().au() ^ 1;
        c7349b.f22219s = new C61601(c7349b);
        c7349b.f22210j = c3284e;
        c7349b.f22211k = c3283d;
        c7349b.f22212l = i3;
        c7349b.f22215o = f;
        c7349b.f22214n = i2;
        c7349b.f22206f = (ImageView) c7349b.itemView.findViewById(R.id.content_imageView);
        c7349b.f22207g = (TextView) c7349b.itemView.findViewById(R.id.caption_textView);
        c7349b.f22208h = (ImageButton) c7349b.itemView.findViewById(R.id.action_imageView);
        c7349b.f22209i = (ProgressWheel) c7349b.itemView.findViewById(R.id.progress_wheel);
        c7349b.f22216p = (RelativeLayout) c7349b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7349b.f22213m = (TextView) c7349b.itemView.findViewById(R.id.progress_text_action_view);
        c7349b.f22205e = c7349b.itemView.findViewById(R.id.bottom_gradient_view);
        LayoutParams layoutParams = (LayoutParams) c7349b.f22206f.getLayoutParams();
        layoutParams.height = i3;
        if (c7349b.f22218r) {
            layoutParams.width = i3;
            m20109a(i3);
        }
        c7349b.f22208h.setOnClickListener(new C36852(c7349b));
        c7349b.f22206f.setOnClickListener(new C36863(c7349b));
    }

    private void m20109a(int i) {
        if (this.f22205e != null) {
            int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            LayoutParams layoutParams = (LayoutParams) this.f22205e.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = dimension;
        }
    }

    static /* synthetic */ void m20110a(C7478f c7478f, int i, int i2) {
        if (i > 0 && i2 > 0) {
            LayoutParams layoutParams = (LayoutParams) c7478f.f22206f.getLayoutParams();
            if (c7478f.f22218r) {
                Point b = C2491i.m6807b(c7478f.f22212l, i, i2);
                i = i < c7478f.f22212l ? c7478f.f22212l : b.x;
                i2 = b.y;
                layoutParams.width = i;
                c7478f.m20109a(i);
            } else {
                float f = (float) i;
                float f2 = c7478f.f22215o / f;
                if (f <= c7478f.f22215o) {
                    f = (float) i2;
                    i2 = (int) (f + (f2 * f));
                }
                if (i2 > c7478f.f22214n) {
                    i2 = c7478f.f22214n;
                }
            }
            layoutParams.height = i2;
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7613f c7613f = (C7613f) c6829g;
        Object a = C2613o.m7045a(c7613f.ad, c7613f.ae, c7613f.f23386S, c7613f.f23387T, c7613f.f21300A);
        if (this.f22217q == null || !this.f22217q.equals(a)) {
            C1274i a2;
            C1247e c1247e = null;
            this.f22206f.setImageBitmap(null);
            C5255m a3 = C4515k.m8230a(c7613f.ad, c7613f.f23386S);
            if (c7613f.f23384Q <= 0 || c7613f.f23385R <= 0) {
                C1248f b = new C1248f().m2954b(this.f22212l, this.f22212l);
                if (a3 != null) {
                    b.m2951a(a3);
                }
                a2 = C1212c.m2872a(this.c).m10950a(a).m3033a();
                a2.f3986c = this.f22219s;
                a2 = a2.m3034a(b);
            } else {
                Point a4 = this.f22218r ? C2491i.m6763a(this.f22212l, c7613f.f23384Q, c7613f.f23385R) : null;
                C1248f b2 = new C1248f().m2954b(this.f22218r ? a4.x : this.f22212l, this.f22218r ? a4.y : this.f22212l);
                if (a3 != null) {
                    b2.m2951a(a3);
                }
                a2 = C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(b2);
                if (this.f22218r) {
                    c1247e = this.f22219s;
                }
                a2.f3986c = c1247e;
            }
            a2.m3031a(this.f22206f);
        }
        this.f22217q = a;
        if (c7613f.f23388U == null || c7613f.f23388U.isEmpty()) {
            this.f22207g.setVisibility(8);
        } else {
            this.f22207g.setText(c7613f.f23388U);
            this.f22207g.setVisibility(0);
            this.f22207g.setTextSize((float) c7613f.af);
            C4520n.m8234a(this.f22207g);
        }
        switch (c7613f.ad) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22209i.setVisibility(8);
                this.f22208h.setVisibility(0);
                this.f22208h.setImageResource(R.drawable.ic_file_start_download);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22209i.setVisibility(0);
                this.f22208h.setVisibility(0);
                this.f22208h.setImageResource(R.drawable.ic_file_stop_download);
                this.f22213m.setVisibility(0);
                this.f22213m.setText(c7613f.f23383P);
                if (c7613f.ac > 0) {
                    progressWheel = this.f22209i;
                    f = ((float) c7613f.ac) * 0.01f;
                } else {
                    progressWheel = this.f22209i;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22209i.setVisibility(8);
                this.f22208h.setVisibility(8);
                break;
            default:
                break;
        }
        this.f22213m.setVisibility(8);
        m19051a((C7358a) c7613f, this.f22216p, false);
    }
}
