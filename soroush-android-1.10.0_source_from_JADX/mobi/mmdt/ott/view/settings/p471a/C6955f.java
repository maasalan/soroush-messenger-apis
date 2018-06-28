package mobi.mmdt.ott.view.settings.p471a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;

public final class C6955f extends C6073e {
    public C6955f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.settings_item_empty_view, null);
        ((FrameLayout) this.itemView.findViewById(R.id.root)).setBackgroundColor(UIThemeManager.getmInstance().getSpacer_view_color());
    }

    protected final void mo3180a(C6829g c6829g) {
    }
}
