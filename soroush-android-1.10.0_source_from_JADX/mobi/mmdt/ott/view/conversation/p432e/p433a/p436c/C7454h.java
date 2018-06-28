package mobi.mmdt.ott.view.conversation.p432e.p433a.p436c;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p105g.C1247e;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7589h;

public final class C7454h extends C7347b {
    private ImageView f21919e;
    private View f21920f;
    private ImageButton f21921g;
    private ProgressWheel f21922h;
    private C3283d f21923i;
    private int f21924j;
    private boolean f21925k;
    private C1247e<Drawable> f21926l;
    private RelativeLayout f21927m;

    class C35852 implements OnClickListener {
        final /* synthetic */ C7454h f10753a;

        C35852(C7454h c7454h) {
            this.f10753a = c7454h;
        }

        public final void onClick(View view) {
            C7589h c7589h = (C7589h) this.f10753a.f16244a;
            this.f10753a.f21923i.mo2332e(c7589h.f23190P, c7589h.f23191Q);
        }
    }

    class C61481 implements C1247e<Drawable> {
        final /* synthetic */ C7454h f16633a;

        C61481(C7454h c7454h) {
            this.f16633a = c7454h;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7589h c7589h = (C7589h) this.f16633a.f16244a;
            this.f16633a.f21922h.setVisibility(8);
            this.f16633a.f21921g.setVisibility(8);
            if (c7589h.f23192R > 0 && c7589h.f23193S > 0) {
                Point b = C2491i.m6807b(this.f16633a.f21924j, c7589h.f23192R, c7589h.f23193S);
                this.f16633a.m19942a(b.x, b.y);
            }
            return false;
        }
    }

    public C7454h(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3280a c3280a, C3283d c3283d, C3286g c3286g) {
        C7347b c7347b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_location_channel_input_list_item : R.layout.chat_location_channel_input_list_item_old, c3280a, c3286g, c3284e);
        c7347b.f21925k = C2535a.m6888a().au() ^ 1;
        c7347b.f21926l = new C61481(c7347b);
        c7347b.f21923i = c3283d;
        c7347b.f21924j = i3;
        c7347b.f21919e = (ImageView) c7347b.itemView.findViewById(R.id.content_imageView);
        c7347b.f21920f = c7347b.itemView.findViewById(R.id.bottom_gradient_view);
        c7347b.f21921g = (ImageButton) c7347b.itemView.findViewById(R.id.action_imageView);
        c7347b.f21922h = (ProgressWheel) c7347b.itemView.findViewById(R.id.progress_wheel);
        c7347b.f21927m = (RelativeLayout) c7347b.itemView.findViewById(R.id.layout_balloon_chat_background);
        m19942a(i3, i2);
        c7347b.f21919e.setOnClickListener(new C35852(c7347b));
    }

    private void m19942a(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.f21919e.getLayoutParams();
        layoutParams.height = i2;
        if (this.f21925k) {
            layoutParams.width = i;
            layoutParams = (LayoutParams) this.f21920f.getLayoutParams();
            layoutParams.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            layoutParams.width = i;
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7589h c7589h = (C7589h) c6829g;
        this.f21919e.setImageBitmap(null);
        if (c7589h.f23192R > 0 && c7589h.f23193S > 0) {
            Point a = C2491i.m6763a(this.f21924j, c7589h.f23192R, c7589h.f23193S);
            C1274i a2 = C1212c.m2872a(this.c).m10950a(c7589h.f23194T).m3033a().m3034a(new C1248f().m2954b(a.x, a.y));
            a2.f3986c = this.f21926l;
            a2.m3031a(this.f21919e);
        }
        m19051a((C7358a) c7589h, this.f21927m, false);
    }
}
