package mobi.mmdt.ott.view.settings.p471a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.p583b.C7385j;

public final class C6958i extends C6073e {
    private TextView f19861b = ((TextView) this.itemView.findViewById(R.id.textView1));
    private View f19862c;

    public C6958i(C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.settings_item_single_line_description, c3126i);
        this.itemView.findViewById(R.id.root_frame_layout);
        this.f19862c = this.itemView.findViewById(R.id.divider_line);
        C2491i.m6796a(this.f19862c, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19861b, UIThemeManager.getmInstance().getText_secondary_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        View view;
        int i;
        C7385j c7385j = (C7385j) c6829g;
        this.f19861b.setText(c7385j.f21475a);
        if (c7385j.f19504k == 0) {
            view = this.f19862c;
            i = 4;
        } else {
            view = this.f19862c;
            i = 0;
        }
        view.setVisibility(i);
    }
}
