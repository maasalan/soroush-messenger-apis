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
import mobi.mmdt.ott.view.settings.p583b.C7381f;

public final class C6954e extends C6073e {
    private TextView f19848b = ((TextView) this.itemView.findViewById(R.id.textView1));
    private TextView f19849c = ((TextView) this.itemView.findViewById(R.id.textView2));
    private TextView f19850d = ((TextView) this.itemView.findViewById(R.id.textView3));
    private View f19851e = this.itemView.findViewById(R.id.divider_line);

    public C6954e(C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.settings_item_double_line_with_state, c3126i);
        C2491i.m6796a(this.f19851e, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19848b, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19849c, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6803a(this.f19848b);
    }

    protected final void mo3180a(C6829g c6829g) {
        View view;
        int i;
        C7381f c7381f = (C7381f) c6829g;
        this.f19848b.setText(c7381f.f21463a);
        this.f19849c.setText(c7381f.f21464b);
        this.f19850d.setText(c7381f.f21465c);
        if (c7381f.f19504k == 0) {
            view = this.f19851e;
            i = 4;
        } else {
            view = this.f19851e;
            i = 0;
        }
        view.setVisibility(i);
    }
}
