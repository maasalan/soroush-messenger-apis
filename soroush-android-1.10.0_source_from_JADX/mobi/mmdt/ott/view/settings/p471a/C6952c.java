package mobi.mmdt.ott.view.settings.p471a;

import android.app.Activity;
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
import mobi.mmdt.ott.view.settings.p583b.C7379d;

public final class C6952c extends C6073e {
    private final Activity f19840b;
    private TextView f19841c = ((TextView) this.itemView.findViewById(R.id.textView1));
    private TextView f19842d = ((TextView) this.itemView.findViewById(R.id.textView2));
    private View f19843e = this.itemView.findViewById(R.id.divider_line);

    public C6952c(Activity activity, C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.settings_item_double_line, c3126i);
        this.f19840b = activity;
    }

    protected final void mo3180a(C6829g c6829g) {
        C7379d c7379d = (C7379d) c6829g;
        this.f19841c.setText(c7379d.f21457a);
        this.f19842d.setText(c7379d.f21458b);
        if (c7379d.f21459c == -1) {
            this.f19842d.setPadding((int) C2491i.m6804b(this.f19840b, 32.0f), 0, (int) C2491i.m6804b(this.f19840b, 32.0f), 0);
            this.f19841c.setPadding((int) C2491i.m6804b(this.f19840b, 32.0f), 0, (int) C2491i.m6804b(this.f19840b, 32.0f), 0);
            this.f19841c.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            this.f19841c.setCompoundDrawablesWithIntrinsicBounds(c7379d.f21459c, 0, 0, 0);
            this.f19842d.setPadding((int) C2491i.m6804b(this.f19840b, 61.0f), 0, (int) C2491i.m6804b(this.f19840b, 32.0f), 0);
        }
        if (c7379d.f19504k == 0) {
            this.f19843e.setVisibility(4);
        } else {
            this.f19843e.setVisibility(0);
        }
        C2491i.m6796a(this.f19843e, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19841c, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6828c(this.f19841c, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6802a(this.f19842d, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6803a(this.f19841c);
    }
}
