package mobi.mmdt.ott.view.settings.p471a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.p583b.C7378c;

public final class C6951b extends C6073e {
    private TextView f19839b = ((TextView) this.itemView.findViewById(R.id.textView1));

    public C6951b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.setting_description_item, null);
        View findViewById = this.itemView.findViewById(R.id.divider_line);
        ((FrameLayout) this.itemView.findViewById(R.id.root_frame_layout)).setBackgroundColor(UIThemeManager.getmInstance().getSpacer_view_color());
        findViewById.setVisibility(8);
    }

    protected final void mo3180a(C6829g c6829g) {
        this.f19839b.setText(((C7378c) c6829g).f21456a);
    }
}
