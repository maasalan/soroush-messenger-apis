package mobi.mmdt.ott.view.conversation.p432e.p433a.p442i;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7665f;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7530f extends C7353b {
    private ImageView f22820d;
    private TextView f22821e;
    private TextView f22822f;
    private ImageButton f22823g;
    private ProgressWheel f22824h;
    private C3284e f22825i;
    private C3283d f22826j;
    private int f22827k;
    private RelativeLayout f22828l;
    private boolean f22829m;
    private Uri f22830n;
    private C1247e<Drawable> f22831o = new C61881(this);

    class C38922 implements OnClickListener {
        final /* synthetic */ C7530f f11311a;

        C38922(C7530f c7530f) {
            this.f11311a = c7530f;
        }

        public final void onClick(View view) {
            C7665f c7665f = (C7665f) this.f11311a.f16244a;
            switch (c7665f.f23719Z) {
                case DELETED:
                case NOT_STARTED:
                    this.f11311a.f22825i.mo2307a(c7665f.mo3604b(), true);
                    return;
                case TRANSMITTING:
                    this.f11311a.f22825i.mo2305a(c7665f.mo3604b());
                    return;
                case CANCEL:
                    this.f11311a.f22825i.mo2307a(c7665f.mo3604b(), true);
                    return;
                case ERROR:
                    this.f11311a.f22825i.mo2307a(c7665f.mo3604b(), true);
                    return;
                default:
                    return;
            }
        }
    }

    class C38933 implements OnClickListener {
        final /* synthetic */ C7530f f11312a;

        C38933(C7530f c7530f) {
            this.f11312a = c7530f;
        }

        public final void onClick(View view) {
            C7665f c7665f = (C7665f) this.f11312a.f16244a;
            if (C38944.f11313a[c7665f.f23719Z.ordinal()] == 6) {
                this.f11312a.f22826j.mo2325c(c7665f.f23715S, c7665f.f21334t);
            }
        }
    }

    class C61881 implements C1247e<Drawable> {
        final /* synthetic */ C7530f f16721a;

        C61881(C7530f c7530f) {
            this.f16721a = c7530f;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7665f c7665f = (C7665f) this.f16721a.f16244a;
            if (!this.f16721a.f22829m) {
                this.f16721a.f22829m = true;
                int i = c7665f.f23713Q;
                if (i > 0 && c7665f.f23714R > 0) {
                    Point b = C2491i.m6807b(this.f16721a.f22827k, i, c7665f.f23714R);
                    LayoutParams layoutParams = (LayoutParams) this.f16721a.f22820d.getLayoutParams();
                    layoutParams.width = i < this.f16721a.f22827k ? this.f16721a.f22827k : b.x;
                    layoutParams.height = b.y;
                }
            }
            return false;
        }
    }

    public C7530f(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_image_captioned_input_list_item, c3286g, c3284e);
        this.f22825i = c3284e;
        this.f22826j = c3283d;
        this.f22827k = i;
        this.f22820d = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f22821e = (TextView) this.itemView.findViewById(R.id.caption_textView);
        this.f22823g = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22824h = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f22828l = (RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f22822f = (TextView) this.itemView.findViewById(R.id.progress_text_action_view);
        LayoutParams layoutParams = (LayoutParams) this.f22820d.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        this.f22823g.setOnClickListener(new C38922(this));
        this.f22820d.setOnClickListener(new C38933(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7665f c7665f = (C7665f) c6829g;
        Object a = C2613o.m7045a(c7665f.f23719Z, c7665f.aa, c7665f.f23715S, c7665f.f23716T, c7665f.f21300A);
        if (this.f22830n == null || !this.f22830n.equals(a)) {
            C1274i a2;
            this.f22820d.setImageBitmap(null);
            if (c7665f.f23713Q <= 0 || c7665f.f23714R <= 0) {
                C1248f a3;
                if (c7665f.f23719Z != C2987i.FINISHED || c7665f.f23715S == null) {
                    a2 = C1212c.m2872a(this.c).m10950a(a);
                    a3 = new C1248f().m2959e().m2954b(this.f22827k, this.f22827k).m2951a(new C7156b(10));
                } else {
                    a2 = C1212c.m2872a(this.c).m10950a(a);
                    a3 = new C1248f().m2959e().m2954b(this.f22827k, this.f22827k);
                }
                a2 = a2.m3034a(a3).m3033a();
            } else {
                Point a4 = C2491i.m6763a(this.f22827k, c7665f.f23713Q, c7665f.f23714R);
                a2 = (c7665f.f23719Z != C2987i.FINISHED || c7665f.f23715S == null) ? C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(new C1248f().m2954b(a4.x, a4.y).m2951a(new C7156b(10))) : C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(new C1248f().m2954b(a4.x, a4.y));
            }
            a2.f3986c = this.f22831o;
            a2.m3031a(this.f22820d);
        }
        this.f22830n = a;
        if (c7665f.f23717U == null || c7665f.f23717U.isEmpty()) {
            this.f22821e.setVisibility(8);
        } else {
            this.f22821e.setText(c7665f.f23717U);
            this.f22821e.setVisibility(0);
            this.f22821e.setTextSize((float) (((double) c7665f.ab) * 0.85d));
            C4520n.m8234a(this.f22821e);
        }
        switch (c7665f.f23719Z) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22824h.setVisibility(8);
                this.f22823g.setVisibility(0);
                this.f22823g.setImageResource(R.drawable.ic_file_start_download);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22824h.setVisibility(0);
                this.f22823g.setVisibility(0);
                this.f22823g.setImageResource(R.drawable.ic_file_stop_download);
                this.f22822f.setVisibility(0);
                this.f22822f.setText(c7665f.f23712P);
                if (c7665f.f23718Y > 0) {
                    progressWheel = this.f22824h;
                    f = ((float) c7665f.f23718Y) * 0.01f;
                } else {
                    progressWheel = this.f22824h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22824h.setVisibility(8);
                this.f22823g.setVisibility(8);
                break;
            default:
                break;
        }
        this.f22822f.setVisibility(8);
        m19051a((C7358a) c7665f, this.f22828l, false);
    }
}
