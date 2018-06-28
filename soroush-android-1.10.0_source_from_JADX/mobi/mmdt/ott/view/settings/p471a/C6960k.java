package mobi.mmdt.ott.view.settings.p471a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.p583b.C7387l;

public final class C6960k extends C6073e {
    private FrameLayout f19866b = ((FrameLayout) this.itemView.findViewById(R.id.frame_layout_root));
    private TextView f19867c;
    private TextView f19868d;
    private View f19869e;

    public C6960k(final C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.settings_item_single_line_with_information, c3126i);
        RelativeLayout relativeLayout = (RelativeLayout) this.itemView.findViewById(R.id.root_relativeLayout);
        this.f19867c = (TextView) this.itemView.findViewById(R.id.textView1);
        this.f19868d = (TextView) this.itemView.findViewById(R.id.textView2);
        this.f19868d.setTypeface(this.f19868d.getTypeface(), 1);
        this.f19869e = this.itemView.findViewById(R.id.divider_line);
        C2491i.m6796a(this.f19869e, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6803a(this.f19867c);
        relativeLayout.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C6960k f12235b;

            public final void onClick(View view) {
                C7387l c7387l = (C7387l) this.f12235b.f16244a;
                if (!c7387l.f21478a) {
                    c3126i.mo2234c(c7387l.f19504k);
                }
            }
        });
    }

    protected final void mo3180a(C6829g c6829g) {
        View view;
        int i;
        TextView textView;
        int i2;
        C7387l c7387l = (C7387l) c6829g;
        this.f19867c.setText(c7387l.f21479b);
        this.f19868d.setText(c7387l.f21480c);
        if (c7387l.f19504k == 0) {
            view = this.f19869e;
            i = 4;
        } else {
            view = this.f19869e;
            i = 0;
        }
        view.setVisibility(i);
        C2491i.m6796a(this.f19866b, UIThemeManager.getmInstance().getRecycler_view_background_color());
        if (c7387l.f21478a) {
            textView = this.f19867c;
            i2 = UIThemeManager.disable_color;
            C2491i.m6802a(textView, (int) UIThemeManager.disable_color);
            textView = this.f19868d;
        } else {
            C2491i.m6802a(this.f19867c, UIThemeManager.getmInstance().getText_primary_color());
            textView = this.f19868d;
            i2 = UIThemeManager.getmInstance().getAccent_color();
        }
        C2491i.m6802a(textView, i2);
    }
}
