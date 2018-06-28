package mobi.mmdt.ott.view.settings.p471a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.p583b.C7386k;

public final class C6959j extends C6073e {
    private final Activity f19863b;
    private TextView f19864c = ((TextView) this.itemView.findViewById(R.id.textView1));
    private View f19865d = this.itemView.findViewById(R.id.divider_line);

    public C6959j(Activity activity, C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.settings_item_single_line, c3126i);
        this.f19863b = activity;
    }

    protected final void mo3180a(C6829g c6829g) {
        LayoutParams layoutParams;
        float b;
        C7386k c7386k = (C7386k) c6829g;
        this.f19864c.setText(c7386k.f21476a);
        if (c7386k.f21477b == -1) {
            this.f19864c.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f19864c.setPadding((int) C2491i.m6804b(this.f19863b, 32.0f), 0, (int) C2491i.m6804b(this.f19863b, 32.0f), 0);
            layoutParams = (FrameLayout.LayoutParams) this.f19865d.getLayoutParams();
            b = C2491i.m6804b(this.f19863b, 16.0f);
        } else {
            this.f19864c.setCompoundDrawablesWithIntrinsicBounds(c7386k.f21477b, 0, 0, 0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f19865d.getLayoutParams();
            b = C2491i.m6804b(this.f19863b, 62.0f);
        }
        layoutParams.setMargins((int) b, 0, (int) C2491i.m6804b(this.f19863b, 16.0f), 0);
        this.f19865d.setLayoutParams(layoutParams);
        if (c7386k.f19504k == 0) {
            this.f19865d.setVisibility(4);
        } else {
            this.f19865d.setVisibility(0);
        }
        UIThemeManager uIThemeManager = UIThemeManager.getmInstance();
        int text_primary_color = uIThemeManager.getText_primary_color();
        C2491i.m6796a(this.f19865d, uIThemeManager.getLine_divider_color());
        C2491i.m6802a(this.f19864c, text_primary_color);
        C2491i.m6828c(this.f19864c, text_primary_color);
        C2491i.m6803a(this.f19864c);
    }
}
