package mobi.mmdt.ott.view.components.mediacaption.p410b.p411a;

import android.app.Activity;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.mediacaption.C3202a;
import mobi.mmdt.ott.view.components.mediacaption.p410b.p566b.C7330d;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;

public final class C6854c extends C6073e {
    private Activity f19549b;
    private ImageView f19550c = ((ImageView) this.itemView.findViewById(R.id.content_imageView));
    private ImageButton f19551d = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private FrameLayout f19552e = ((FrameLayout) this.itemView.findViewById(R.id.root_frameLayout));
    private FrameLayout f19553f = ((FrameLayout) this.itemView.findViewById(R.id.select_lines_frameLayout));
    private C3202a f19554g;

    class C32071 implements OnClickListener {
        final /* synthetic */ C6854c f9937a;

        C32071(C6854c c6854c) {
            this.f9937a = c6854c;
        }

        public final void onClick(View view) {
            this.f9937a.f19554g.mo2279a((C7330d) this.f9937a.f16244a);
        }
    }

    class C32082 implements OnClickListener {
        final /* synthetic */ C6854c f9938a;

        C32082(C6854c c6854c) {
            this.f9938a = c6854c;
        }

        public final void onClick(View view) {
            this.f9938a.f19554g.mo2281b((C7330d) this.f9938a.f16244a);
        }
    }

    public C6854c(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3202a c3202a) {
        super(layoutInflater, viewGroup, R.layout.image_caption_photo_list_item, null);
        this.f19549b = activity;
        LayoutParams layoutParams = (LayoutParams) this.f19550c.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        GridLayoutManager.LayoutParams layoutParams2 = (GridLayoutManager.LayoutParams) this.f19552e.getLayoutParams();
        layoutParams2.height = i2;
        layoutParams2.width = i;
        this.f19554g = c3202a;
        this.f19551d.setOnClickListener(new C32071(this));
        this.f19550c.setOnClickListener(new C32082(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        FrameLayout frameLayout;
        int i;
        C7330d c7330d = (C7330d) c6829g;
        this.f19550c.setImageBitmap(null);
        if (c7330d.f21125a != null) {
            C1212c.m2872a(this.f19549b).m10950a(c7330d.f21125a).m3034a(new C1248f().m2959e()).m3033a().m3031a(this.f19550c);
        }
        if (c7330d.f21126b) {
            frameLayout = this.f19553f;
            i = 0;
        } else {
            frameLayout = this.f19553f;
            i = 8;
        }
        frameLayout.setVisibility(i);
    }
}
