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
import mobi.mmdt.ott.view.settings.p583b.C7384i;

public final class C6957h extends C6073e {
    private TextView f19858b = ((TextView) this.itemView.findViewById(R.id.textView1));
    private TextView f19859c = ((TextView) this.itemView.findViewById(R.id.textView2));
    private View f19860d = this.itemView.findViewById(R.id.divider_line);

    public C6957h(C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.settings_item_single_line_color, c3126i);
        C2491i.m6796a(this.f19860d, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19858b, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6803a(this.f19858b);
    }

    protected final void mo3180a(C6829g c6829g) {
        View view;
        int i;
        C7384i c7384i = (C7384i) c6829g;
        this.f19858b.setText(c7384i.f21472a);
        this.f19859c.setText(c7384i.f21473b);
        this.f19859c.setTextColor(c7384i.f21474c);
        if (c7384i.f19504k == 0) {
            view = this.f19860d;
            i = 4;
        } else {
            view = this.f19860d;
            i = 0;
        }
        view.setVisibility(i);
    }
}
