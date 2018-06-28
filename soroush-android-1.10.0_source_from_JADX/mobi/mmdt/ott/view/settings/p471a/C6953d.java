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
import mobi.mmdt.ott.view.settings.p583b.C7380e;

public final class C6953d extends C6073e {
    private TextView f19844b = ((TextView) this.itemView.findViewById(R.id.textView1));
    private TextView f19845c = ((TextView) this.itemView.findViewById(R.id.textView3));
    private TextView f19846d = ((TextView) this.itemView.findViewById(R.id.textView2));
    private View f19847e = this.itemView.findViewById(R.id.divider_line);

    public C6953d(C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.settings_item_double_line_with_information, c3126i);
        C2491i.m6796a(this.f19847e, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19844b, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19846d, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19845c, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6803a(this.f19844b);
    }

    protected final void mo3180a(C6829g c6829g) {
        View view;
        int i;
        C7380e c7380e = (C7380e) c6829g;
        this.f19844b.setText(c7380e.f21460a);
        this.f19845c.setText(c7380e.f21461b);
        this.f19846d.setText(c7380e.f21462c);
        if (c7380e.f19504k == 0) {
            view = this.f19847e;
            i = 4;
        } else {
            view = this.f19847e;
            i = 0;
        }
        view.setVisibility(i);
    }
}
