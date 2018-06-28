package mobi.mmdt.ott.view.components.mediaselector.p413a;

import android.app.Activity;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.mediaselector.p567b.C7332d;
import mobi.mmdt.ott.view.components.mediaselector.photoselection.C3218a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;

public final class C6858c extends C6073e {
    private Activity f19566b;
    private ImageView f19567c;
    private ImageView f19568d;
    private FrameLayout f19569e;
    private FrameLayout f19570f;
    private C3218a f19571g;
    private CheckBox f19572h;
    private boolean f19573i = false;

    class C32101 implements OnCheckedChangeListener {
        final /* synthetic */ C6858c f9941a;

        C32101(C6858c c6858c) {
            this.f9941a = c6858c;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!this.f9941a.f19573i) {
                if (z) {
                    this.f9941a.f19571g.mo2283a((C7332d) this.f9941a.f16244a);
                    return;
                }
                this.f9941a.f19571g.mo2285b((C7332d) this.f9941a.f16244a);
            }
        }
    }

    public C6858c(Activity activity, C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3218a c3218a) {
        super(layoutInflater, viewGroup, R.layout.media_photo_list_item, c3126i);
        this.f19566b = activity;
        this.f19567c = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f19568d = (ImageView) this.itemView.findViewById(R.id.corner_gradiant_imageView);
        this.f19569e = (FrameLayout) this.itemView.findViewById(R.id.root_frameLayout);
        this.f19570f = (FrameLayout) this.itemView.findViewById(R.id.content_frameLayout);
        this.f19572h = (CheckBox) this.itemView.findViewById(R.id.check_checkBox);
        LayoutParams layoutParams = (LayoutParams) this.f19567c.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        layoutParams = (LayoutParams) this.f19568d.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        GridLayoutManager.LayoutParams layoutParams2 = (GridLayoutManager.LayoutParams) this.f19569e.getLayoutParams();
        layoutParams2.height = i2;
        layoutParams2.width = i;
        this.f19571g = c3218a;
        this.f19572h.setOnCheckedChangeListener(new C32101(this));
        C2491i.m6799a(this.f19572h, UIThemeManager.getmInstance().getAccent_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        C7332d c7332d = (C7332d) c6829g;
        this.f19567c.setImageBitmap(null);
        if (c7332d.f21134b != null) {
            C1212c.m2872a(this.f19566b).m10958e().m3037a(c7332d.f21134b).m3034a(new C1248f().m2959e()).m3033a().m3031a(this.f19567c);
        }
        this.f19573i = true;
        this.f19572h.setChecked(c7332d.f21135c);
        this.f19573i = false;
        if (this.f19571g == null || !this.f19571g.mo2284a()) {
            this.f19572h.setVisibility(8);
            this.f19568d.setVisibility(8);
            return;
        }
        this.f19572h.setVisibility(0);
        this.f19568d.setVisibility(0);
    }
}
