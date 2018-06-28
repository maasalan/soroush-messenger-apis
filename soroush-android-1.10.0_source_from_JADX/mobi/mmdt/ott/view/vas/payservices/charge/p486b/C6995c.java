package mobi.mmdt.ott.view.vas.payservices.charge.p486b;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.vas.payservices.charge.p593c.C7236c;

public final class C6995c extends C6073e {
    private TextView f19999b = ((TextView) this.itemView.findViewById(R.id.textView1));

    public C6995c(C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.charge_type_list_item, c3126i);
        C2491i.m6796a(this.itemView, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6802a(this.f19999b, UIThemeManager.getmInstance().getText_primary_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        this.f19999b.setText(((C7236c) c6829g).f20898a);
    }
}
