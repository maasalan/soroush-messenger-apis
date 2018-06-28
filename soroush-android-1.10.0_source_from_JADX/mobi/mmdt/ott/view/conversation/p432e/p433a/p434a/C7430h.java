package mobi.mmdt.ott.view.conversation.p432e.p433a.p434a;

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
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7704h;

public final class C7430h extends C7345b {
    private View f21620d;
    private ImageView f21621e;
    private ImageButton f21622f;
    private ProgressWheel f21623g;
    private C3283d f21624h;
    private int f21625i;
    private boolean f21626j;
    private RelativeLayout f21627k;
    private C1247e<Drawable> f21628l;

    class C35012 implements OnClickListener {
        final /* synthetic */ C7430h f10647a;

        C35012(C7430h c7430h) {
            this.f10647a = c7430h;
        }

        public final void onClick(View view) {
            C7704h c7704h = (C7704h) this.f10647a.f16244a;
            this.f10647a.f21624h.mo2332e(c7704h.f24169P, c7704h.f24170Q);
        }
    }

    class C61361 implements C1247e<Drawable> {
        final /* synthetic */ C7430h f16621a;

        C61361(C7430h c7430h) {
            this.f16621a = c7430h;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7704h c7704h = (C7704h) this.f16621a.f16244a;
            this.f16621a.f21623g.setVisibility(8);
            this.f16621a.f21622f.setVisibility(8);
            if (c7704h.f24171R > 0 && c7704h.f24172S > 0) {
                Point b = C2491i.m6807b(this.f16621a.f21625i, c7704h.f24171R, c7704h.f24172S);
                this.f16621a.m19779a(b.x, b.y);
            }
            return false;
        }
    }

    public C7430h(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3288i c3288i, C3283d c3283d, C3286g c3286g) {
        C7345b c7345b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_location_channel_direct_input_list_item : R.layout.chat_location_channel_direct_input_list_item_old, c3288i, c3286g, c3284e);
        c7345b.f21626j = C2535a.m6888a().au() ^ 1;
        c7345b.f21628l = new C61361(c7345b);
        c7345b.f21624h = c3283d;
        c7345b.f21625i = i3;
        c7345b.f21621e = (ImageView) c7345b.itemView.findViewById(R.id.content_imageView);
        c7345b.f21622f = (ImageButton) c7345b.itemView.findViewById(R.id.action_imageView);
        c7345b.f21623g = (ProgressWheel) c7345b.itemView.findViewById(R.id.progress_wheel);
        c7345b.f21627k = (RelativeLayout) c7345b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7345b.f21620d = c7345b.itemView.findViewById(R.id.bottom_gradient_view);
        m19779a(i3, i2);
        c7345b.f21621e.setOnClickListener(new C35012(c7345b));
    }

    private void m19779a(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.f21621e.getLayoutParams();
        layoutParams.height = i2;
        if (this.f21626j) {
            layoutParams.width = i;
            layoutParams = (LayoutParams) this.f21620d.getLayoutParams();
            layoutParams.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            layoutParams.width = i;
        }
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7704h c7704h = (C7704h) c6829g;
        this.f21621e.setImageBitmap(null);
        if (c7704h.f24171R > 0 && c7704h.f24172S > 0) {
            Point a = C2491i.m6763a(this.f21625i, c7704h.f24171R, c7704h.f24172S);
            C1274i a2 = C1212c.m2872a(this.c).m10950a(c7704h.f24173T).m3033a().m3034a(new C1248f().m2954b(a.x, a.y));
            a2.f3986c = this.f21628l;
            a2.m3031a(this.f21621e);
        }
        m19051a((C7358a) c7704h, this.f21627k, false);
    }
}
