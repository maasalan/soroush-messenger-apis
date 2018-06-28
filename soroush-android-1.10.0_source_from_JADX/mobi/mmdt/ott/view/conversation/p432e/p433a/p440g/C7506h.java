package mobi.mmdt.ott.view.conversation.p432e.p433a.p440g;

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
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7641h;

public final class C7506h extends C7351b {
    private ImageView f22542d;
    private View f22543e;
    private ImageButton f22544f;
    private ProgressWheel f22545g;
    private C3283d f22546h;
    private int f22547i;
    private RelativeLayout f22548j;
    private C1247e<Drawable> f22549k = new C61761(this);

    class C37952 implements OnClickListener {
        final /* synthetic */ C7506h f11132a;

        C37952(C7506h c7506h) {
            this.f11132a = c7506h;
        }

        public final void onClick(View view) {
            C7641h c7641h = (C7641h) this.f11132a.f16244a;
            this.f11132a.f22546h.mo2332e(c7641h.f23546P, c7641h.f23547Q);
        }
    }

    class C61761 implements C1247e<Drawable> {
        final /* synthetic */ C7506h f16693a;

        C61761(C7506h c7506h) {
            this.f16693a = c7506h;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7641h c7641h = (C7641h) this.f16693a.f16244a;
            this.f16693a.f22545g.setVisibility(8);
            this.f16693a.f22544f.setVisibility(8);
            if (c7641h.f23548R > 0 && c7641h.f23549S > 0) {
                Point b = C2491i.m6807b(this.f16693a.f22547i, c7641h.f23548R, c7641h.f23549S);
                LayoutParams layoutParams = (LayoutParams) this.f16693a.f22542d.getLayoutParams();
                layoutParams.height = b.y;
                layoutParams.width = b.x;
                LayoutParams layoutParams2 = (LayoutParams) this.f16693a.f22543e.getLayoutParams();
                layoutParams2.height = (int) this.f16693a.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
                layoutParams2.width = b.x;
            }
            return false;
        }
    }

    public C7506h(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3288i c3288i, C3283d c3283d, C3286g c3286g) {
        int i3 = i;
        super(activity, layoutInflater, viewGroup, R.layout.chat_location_social_input_list_item, c3288i, c3286g, c3284e);
        this.f22546h = c3283d;
        this.f22547i = i3;
        this.f22542d = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f22543e = this.itemView.findViewById(R.id.bottom_gradient_view);
        this.f22544f = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22545g = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f22548j = (RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        LayoutParams layoutParams = (LayoutParams) this.f22542d.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i3;
        LayoutParams layoutParams2 = (LayoutParams) this.f22543e.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i3;
        this.f22542d.setOnClickListener(new C37952(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7641h c7641h = (C7641h) c6829g;
        this.f22542d.setImageBitmap(null);
        if (c7641h.f23548R > 0 && c7641h.f23549S > 0) {
            Point a = C2491i.m6763a(this.f22547i, c7641h.f23548R, c7641h.f23549S);
            C1274i a2 = C1212c.m2872a(this.c).m10950a(c7641h.f23550T).m3033a().m3034a(new C1248f().m2954b(a.x, a.y));
            a2.f3986c = this.f22549k;
            a2.m3031a(this.f22542d);
        }
        m19051a((C7358a) c7641h, this.f22548j, false);
    }
}
