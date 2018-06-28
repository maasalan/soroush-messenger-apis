package mobi.mmdt.ott.view.conversation.p432e.p433a.p438e;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7615h;

public final class C7480h extends C7349b {
    private View f22234e;
    private ImageView f22235f;
    private ImageButton f22236g;
    private ProgressWheel f22237h;
    private C3283d f22238i;
    private int f22239j;
    private boolean f22240k;
    private RelativeLayout f22241l;
    private C1247e<Drawable> f22242m;

    class C36912 implements OnClickListener {
        final /* synthetic */ C7480h f10944a;

        C36912(C7480h c7480h) {
            this.f10944a = c7480h;
        }

        public final void onClick(View view) {
            C7615h c7615h = (C7615h) this.f10944a.f16244a;
            this.f10944a.f22238i.mo2332e(c7615h.f23395P, c7615h.f23396Q);
        }
    }

    class C61621 implements C1247e<Drawable> {
        final /* synthetic */ C7480h f16663a;

        C61621(C7480h c7480h) {
            this.f16663a = c7480h;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7615h c7615h = (C7615h) this.f16663a.f16244a;
            this.f16663a.f22237h.setVisibility(8);
            this.f16663a.f22236g.setVisibility(8);
            if (c7615h.f23397R > 0 && c7615h.f23398S > 0) {
                Point b = C2491i.m6807b(this.f16663a.f22239j, c7615h.f23397R, c7615h.f23398S);
                this.f16663a.m20119a(b.x, b.y);
            }
            return false;
        }
    }

    public C7480h(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3280a c3280a, C3283d c3283d, C3286g c3286g) {
        C7349b c7349b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_location_channel_input_list_item : R.layout.chat_location_channel_input_list_item_old, c3280a, c3286g, c3284e);
        c7349b.f22240k = C2535a.m6888a().au() ^ 1;
        c7349b.f22242m = new C61621(c7349b);
        c7349b.f22238i = c3283d;
        c7349b.f22239j = i3;
        c7349b.f22235f = (ImageView) c7349b.itemView.findViewById(R.id.content_imageView);
        c7349b.f22236g = (ImageButton) c7349b.itemView.findViewById(R.id.action_imageView);
        c7349b.f22237h = (ProgressWheel) c7349b.itemView.findViewById(R.id.progress_wheel);
        c7349b.f22241l = (RelativeLayout) c7349b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7349b.f22234e = c7349b.itemView.findViewById(R.id.bottom_gradient_view);
        m20119a(i3, i2);
        c7349b.f22235f.setOnClickListener(new C36912(c7349b));
    }

    private void m20119a(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.f22235f.getLayoutParams();
        layoutParams.height = i2;
        if (this.f22240k) {
            layoutParams.width = i;
            layoutParams = (LayoutParams) this.f22234e.getLayoutParams();
            layoutParams.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            layoutParams.width = i;
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7615h c7615h = (C7615h) c6829g;
        this.f22235f.setImageBitmap(null);
        if (c7615h.f23397R > 0 && c7615h.f23398S > 0) {
            Point a = C2491i.m6763a(this.f22239j, c7615h.f23397R, c7615h.f23398S);
            C1274i a2 = C1212c.m2872a(this.c).m10950a(c7615h.f23399T).m3033a().m3034a(new C1248f().m2954b(a.x, a.y));
            a2.f3986c = this.f22242m;
            a2.m3031a(this.f22235f);
        }
        m19051a((C7358a) c7615h, this.f22241l, false);
    }
}
