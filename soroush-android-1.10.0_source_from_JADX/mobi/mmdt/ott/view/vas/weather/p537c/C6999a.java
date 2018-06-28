package mobi.mmdt.ott.view.vas.weather.p537c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.logic.vas.p374b.p375a.C2914a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.vas.weather.p601d.C7400a;

public final class C6999a extends C6073e {
    private TextView f20003b = ((TextView) this.itemView.findViewById(R.id.weather_setting_item_name));
    private ImageView f20004c = ((ImageView) this.itemView.findViewById(R.id.weather_setting_city_item_icon));
    private View f20005d = this.itemView.findViewById(R.id.default_city_divider);

    public C6999a(LayoutInflater layoutInflater, ViewGroup viewGroup, C3126i c3126i) {
        super(layoutInflater, viewGroup, R.layout.setting_removable_city_item_rtl, c3126i);
        C2491i.m6801a(this.f20004c, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6796a(this.f20005d, UIThemeManager.getmInstance().getAccent_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        View view;
        C7400a c7400a = (C7400a) c6829g;
        if (c7400a.f21524b) {
            imageView = this.f20004c;
            i = R.drawable.ic_sticker_details_cancel;
        } else {
            imageView = this.f20004c;
            i = R.drawable.ic_arrow_left;
        }
        imageView.setImageResource(i);
        if (c7400a.f21525c) {
            view = this.f20005d;
            i = 0;
        } else {
            view = this.f20005d;
            i = 4;
        }
        view.setVisibility(i);
        this.f20003b.setText(C2914a.m7291a(c7400a.f21523a));
    }
}
