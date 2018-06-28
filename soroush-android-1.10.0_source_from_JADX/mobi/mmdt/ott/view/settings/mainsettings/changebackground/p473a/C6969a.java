package mobi.mmdt.ott.view.settings.mainsettings.changebackground.p473a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p085c.p086a.C1212c;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.mainsettings.changebackground.C4390b;
import mobi.mmdt.ott.view.settings.mainsettings.changebackground.p585b.C7390b;

public final class C6969a extends C6073e {
    private Activity f19898b;
    private ImageView f19899c = ((ImageView) this.itemView.findViewById(R.id.content_imageView));
    private FrameLayout f19900d = ((FrameLayout) this.itemView.findViewById(R.id.select_lines_frameLayout));
    private C4390b f19901e;
    private FrameLayout f19902f = ((FrameLayout) this.itemView.findViewById(R.id.root_frameLayout));
    private View f19903g = this.itemView.findViewById(R.id.view_left_selected);
    private View f19904h = this.itemView.findViewById(R.id.view_right_selected);
    private View f19905i = this.itemView.findViewById(R.id.view_bottom_selected);
    private View f19906j = this.itemView.findViewById(R.id.view_top_selected);

    class C43881 implements OnClickListener {
        final /* synthetic */ C6969a f12260a;

        C43881(C6969a c6969a) {
            this.f12260a = c6969a;
        }

        public final void onClick(View view) {
            this.f12260a.f19901e.mo2429a((C7390b) this.f12260a.f16244a);
        }
    }

    public C6969a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C4390b c4390b) {
        super(layoutInflater, viewGroup, R.layout.image_change_background_list_item, null);
        this.f19898b = activity;
        LayoutParams layoutParams = this.f19902f.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        this.f19901e = c4390b;
        this.f19899c.setOnClickListener(new C43881(this));
        C2491i.m6796a(this.f19906j, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6796a(this.f19905i, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6796a(this.f19903g, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6796a(this.f19904h, UIThemeManager.getmInstance().getAccent_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        FrameLayout frameLayout;
        int i;
        C7390b c7390b = (C7390b) c6829g;
        this.f19899c.setImageBitmap(null);
        if (c7390b.f21486a != null) {
            C1212c.m2872a(this.f19898b).m10950a(c7390b.f21486a).m3031a(this.f19899c);
        }
        if (c7390b.f21487b) {
            frameLayout = this.f19900d;
            i = 0;
        } else {
            frameLayout = this.f19900d;
            i = 8;
        }
        frameLayout.setVisibility(i);
    }
}
