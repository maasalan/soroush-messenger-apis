package mobi.mmdt.ott.view.newdesign.mainpage.p467c.p468a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.newdesign.mainpage.p467c.p581b.C7373b;

public final class C6938a extends C6073e {
    private TextView f19824b = ((TextView) this.itemView.findViewById(R.id.textView1));
    private ImageView f19825c = ((ImageView) this.itemView.findViewById(R.id.imageView));
    private View f19826d = this.itemView.findViewById(R.id.divider_line);

    public C6938a(final C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.navigation_item_simple_line, c3126i);
        ((LinearLayout) this.itemView.findViewById(R.id.linear_layout_content)).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C6938a f12057b;

            public final void onClick(View view) {
                c3126i.mo2234c(this.f12057b.f16244a.f19504k);
            }
        });
        this.f19824b.setTypeface(this.f19824b.getTypeface(), 1);
        UIThemeManager uIThemeManager = UIThemeManager.getmInstance();
        int text_primary_color = uIThemeManager.getText_primary_color();
        C2491i.m6796a(this.f19826d, uIThemeManager.getLine_divider_color());
        C2491i.m6802a(this.f19824b, text_primary_color);
        C2491i.m6801a(this.f19825c, text_primary_color);
    }

    protected final void mo3180a(C6829g c6829g) {
        View view;
        int i;
        C7373b c7373b = (C7373b) c6829g;
        this.f19824b.setText(c7373b.f21452b);
        this.f19825c.setImageResource(c7373b.f21453c);
        if (c7373b.f21451a) {
            view = this.f19826d;
            i = 0;
        } else {
            view = this.f19826d;
            i = 8;
        }
        view.setVisibility(i);
    }
}
