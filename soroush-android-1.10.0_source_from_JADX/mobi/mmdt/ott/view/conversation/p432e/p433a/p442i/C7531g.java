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
import android.widget.LinearLayout;
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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7666g;

public final class C7531g extends C7353b {
    private ImageView f22832d;
    private View f22833e;
    private TextView f22834f;
    private ImageButton f22835g;
    private ProgressWheel f22836h;
    private C3284e f22837i;
    private C3283d f22838j;
    private int f22839k;
    private LinearLayout f22840l;
    private Uri f22841m;
    private C1247e<Drawable> f22842n = new C61891(this);

    class C38952 implements OnClickListener {
        final /* synthetic */ C7531g f11314a;

        C38952(C7531g c7531g) {
            this.f11314a = c7531g;
        }

        public final void onClick(View view) {
            C7666g c7666g = (C7666g) this.f11314a.f16244a;
            switch (c7666g.f23726Y) {
                case DELETED:
                case NOT_STARTED:
                    this.f11314a.f22837i.mo2307a(c7666g.mo3604b(), true);
                    return;
                case TRANSMITTING:
                    this.f11314a.f22837i.mo2305a(c7666g.mo3604b());
                    return;
                case CANCEL:
                    this.f11314a.f22837i.mo2307a(c7666g.mo3604b(), true);
                    return;
                case ERROR:
                    this.f11314a.f22837i.mo2307a(c7666g.mo3604b(), true);
                    return;
                default:
                    return;
            }
        }
    }

    class C38963 implements OnClickListener {
        final /* synthetic */ C7531g f11315a;

        C38963(C7531g c7531g) {
            this.f11315a = c7531g;
        }

        public final void onClick(View view) {
            C7666g c7666g = (C7666g) this.f11315a.f16244a;
            if (C38974.f11316a[c7666g.f23726Y.ordinal()] == 6) {
                this.f11315a.f22838j.mo2325c(c7666g.f23723S, c7666g.f21334t);
            }
        }
    }

    class C61891 implements C1247e<Drawable> {
        final /* synthetic */ C7531g f16722a;

        C61891(C7531g c7531g) {
            this.f16722a = c7531g;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7666g c7666g = (C7666g) this.f16722a.f16244a;
            int i = c7666g.f23721Q;
            if (i > 0 && c7666g.f23722R > 0) {
                Point b = C2491i.m6807b(this.f16722a.f22839k, i, c7666g.f23722R);
                LayoutParams layoutParams = (LayoutParams) this.f16722a.f22832d.getLayoutParams();
                i = i < this.f16722a.f22839k ? this.f16722a.f22839k : b.x;
                layoutParams.width = i;
                layoutParams.height = b.y;
                int dimension = (int) this.f16722a.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
                layoutParams = (LayoutParams) this.f16722a.f22833e.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = dimension;
            }
            return false;
        }
    }

    public C7531g(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_image_input_list_item, c3286g, c3284e);
        this.f22837i = c3284e;
        this.f22838j = c3283d;
        this.f22839k = i;
        this.f22832d = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f22833e = this.itemView.findViewById(R.id.bottom_gradient_view);
        this.f22835g = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22836h = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f22840l = (LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f22834f = (TextView) this.itemView.findViewById(R.id.progress_text_action_view);
        LayoutParams layoutParams = (LayoutParams) this.f22832d.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        LayoutParams layoutParams2 = (LayoutParams) this.f22833e.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i;
        this.f22835g.setOnClickListener(new C38952(this));
        this.f22832d.setOnClickListener(new C38963(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7666g c7666g = (C7666g) c6829g;
        Object a = C2613o.m7045a(c7666g.f23726Y, c7666g.f23727Z, c7666g.f23723S, c7666g.f23724T, c7666g.f21300A);
        if (this.f22841m == null || !this.f22841m.equals(a)) {
            C1274i a2;
            this.f22832d.setImageBitmap(null);
            if (c7666g.f23721Q <= 0 || c7666g.f23722R <= 0) {
                C1248f a3;
                if (c7666g.f23726Y != C2987i.FINISHED || c7666g.f23723S == null) {
                    a2 = C1212c.m2872a(this.c).m10950a(a);
                    a3 = new C1248f().m2959e().m2954b(this.f22839k, this.f22839k).m2951a(new C7156b(10));
                } else {
                    a2 = C1212c.m2872a(this.c).m10950a(a);
                    a3 = new C1248f().m2959e().m2954b(this.f22839k, this.f22839k);
                }
                a2 = a2.m3034a(a3).m3033a();
            } else {
                Point a4 = C2491i.m6763a(this.f22839k, c7666g.f23721Q, c7666g.f23722R);
                a2 = (c7666g.f23726Y != C2987i.FINISHED || c7666g.f23723S == null) ? C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(new C1248f().m2954b(a4.x, a4.y).m2951a(new C7156b(10))) : C1212c.m2872a(this.c).m10950a(a).m3033a().m3034a(new C1248f().m2954b(a4.x, a4.y));
            }
            a2.f3986c = this.f22842n;
            a2.m3031a(this.f22832d);
        }
        this.f22841m = a;
        switch (c7666g.f23726Y) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22836h.setVisibility(8);
                this.f22835g.setVisibility(0);
                this.f22835g.setImageResource(R.drawable.ic_file_start_download);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22836h.setVisibility(0);
                this.f22835g.setVisibility(0);
                this.f22835g.setImageResource(R.drawable.ic_file_stop_download);
                this.f22834f.setVisibility(0);
                this.f22834f.setText(c7666g.f23720P);
                if (c7666g.f23725U > 0) {
                    progressWheel = this.f22836h;
                    f = ((float) c7666g.f23725U) * 0.01f;
                } else {
                    progressWheel = this.f22836h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22836h.setVisibility(8);
                this.f22835g.setVisibility(8);
                break;
            default:
                break;
        }
        this.f22834f.setVisibility(8);
        m19051a((C7358a) c7666g, this.f22840l, false);
    }
}
