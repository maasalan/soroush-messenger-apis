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
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p105g.C1247e;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7667h;

public final class C7532h extends C7353b {
    private ImageView f22843d;
    private View f22844e;
    private ImageButton f22845f;
    private ProgressWheel f22846g;
    private C3284e f22847h;
    private C3283d f22848i;
    private int f22849j;
    private LinearLayout f22850k;
    private C1247e<Drawable> f22851l = new C61901(this);

    class C38982 implements OnClickListener {
        final /* synthetic */ C7532h f11317a;

        C38982(C7532h c7532h) {
            this.f11317a = c7532h;
        }

        public final void onClick(View view) {
            C7667h c7667h = (C7667h) this.f11317a.f16244a;
            if (!this.f11317a.f22845f.isShown()) {
                this.f11317a.f22848i.mo2332e(c7667h.f23729Q, c7667h.f23728P);
            }
        }
    }

    class C61901 implements C1247e<Drawable> {
        final /* synthetic */ C7532h f16723a;

        C61901(C7532h c7532h) {
            this.f16723a = c7532h;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7667h c7667h = (C7667h) this.f16723a.f16244a;
            this.f16723a.f22846g.setVisibility(8);
            this.f16723a.f22845f.setVisibility(8);
            if (c7667h.f23730R > 0 && c7667h.f23731S > 0) {
                Point b = C2491i.m6807b(this.f16723a.f22849j, c7667h.f23730R, c7667h.f23731S);
                LayoutParams layoutParams = (LayoutParams) this.f16723a.f22843d.getLayoutParams();
                layoutParams.height = b.y;
                layoutParams.width = b.x;
                LayoutParams layoutParams2 = (LayoutParams) this.f16723a.f22844e.getLayoutParams();
                layoutParams2.height = (int) this.f16723a.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
                layoutParams2.width = b.x;
            }
            return false;
        }
    }

    public C7532h(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_location_input_list_item, c3286g, c3284e);
        this.f22847h = c3284e;
        this.f22848i = c3283d;
        this.f22849j = i;
        this.f22843d = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f22844e = this.itemView.findViewById(R.id.bottom_gradient_view);
        this.f22845f = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22846g = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f22850k = (LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        LayoutParams layoutParams = (LayoutParams) this.f22843d.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        LayoutParams layoutParams2 = (LayoutParams) this.f22844e.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i;
        this.f22843d.setOnClickListener(new C38982(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7667h c7667h = (C7667h) c6829g;
        this.f22843d.setImageBitmap(null);
        Point a = C2491i.m6763a(this.f22849j, c7667h.f23730R, c7667h.f23731S);
        C1274i a2 = C1212c.m2872a(this.c).m10950a(Uri.parse(c7667h.f23732T)).m3033a().m3034a(new C1248f().m2954b(a.x, a.y));
        a2.f3986c = this.f22851l;
        a2.m3031a(this.f22843d);
        m19051a((C7358a) c7667h, this.f22850k, false);
    }
}
