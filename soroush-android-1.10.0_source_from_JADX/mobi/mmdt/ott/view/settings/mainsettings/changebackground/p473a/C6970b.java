package mobi.mmdt.ott.view.settings.mainsettings.changebackground.p473a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.mainsettings.changebackground.C4390b;
import mobi.mmdt.ott.view.settings.mainsettings.changebackground.p585b.C7391c;

public final class C6970b extends C6073e {
    private View f19907b = this.itemView.findViewById(R.id.view_left_selected);
    private View f19908c = this.itemView.findViewById(R.id.view_right_selected);
    private View f19909d = this.itemView.findViewById(R.id.view_bottom_selected);
    private View f19910e = this.itemView.findViewById(R.id.view_top_selected);
    private Activity f19911f;
    private ImageView f19912g = ((ImageView) this.itemView.findViewById(R.id.content_imageView));
    private TextView f19913h = ((TextView) this.itemView.findViewById(R.id.content_textView));
    private FrameLayout f19914i = ((FrameLayout) this.itemView.findViewById(R.id.select_lines_frameLayout));
    private C4390b f19915j;
    private FrameLayout f19916k = ((FrameLayout) this.itemView.findViewById(R.id.root_frameLayout));

    class C43891 implements OnClickListener {
        final /* synthetic */ C6970b f12261a;

        C43891(C6970b c6970b) {
            this.f12261a = c6970b;
        }

        public final void onClick(View view) {
            this.f12261a.f19915j.mo2429a((C7391c) this.f12261a.f16244a);
        }
    }

    public C6970b(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C4390b c4390b) {
        super(layoutInflater, viewGroup, R.layout.resource_change_background_list_item, null);
        this.f19911f = activity;
        LayoutParams layoutParams = (LayoutParams) this.f19912g.getLayoutParams();
        layoutParams.height = i2 / 2;
        layoutParams.width = i / 2;
        ViewGroup.LayoutParams layoutParams2 = this.f19916k.getLayoutParams();
        layoutParams2.height = i2;
        layoutParams2.width = i;
        this.f19915j = c4390b;
        this.f19916k.setOnClickListener(new C43891(this));
        C2491i.m6802a(this.f19913h, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6801a(this.f19912g, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6796a(this.f19916k, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(this.f19910e, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6796a(this.f19909d, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6796a(this.f19907b, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6796a(this.f19908c, UIThemeManager.getmInstance().getAccent_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        FrameLayout frameLayout;
        int i;
        C7391c c7391c = (C7391c) c6829g;
        this.f19912g.setImageBitmap(null);
        this.f19913h.setText(c7391c.f21490b);
        if (c7391c.f21489a != 0) {
            C1212c.m2872a(this.f19911f).m10950a(Integer.valueOf(c7391c.f21489a)).m3031a(this.f19912g);
        }
        if (c7391c.f21491c) {
            frameLayout = this.f19914i;
            i = 0;
        } else {
            frameLayout = this.f19914i;
            i = 8;
        }
        frameLayout.setVisibility(i);
    }
}
