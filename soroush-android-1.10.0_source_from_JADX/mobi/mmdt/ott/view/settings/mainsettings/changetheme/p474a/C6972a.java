package mobi.mmdt.ott.view.settings.mainsettings.changetheme.p474a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.mainsettings.C4374a;
import mobi.mmdt.ott.view.settings.mainsettings.changetheme.p586b.C7226a;

public final class C6972a extends C6073e {
    private C4374a f19918b;
    private TextView f19919c = ((TextView) this.itemView.findViewById(R.id.textView1));
    private ViewGroup f19920d = ((ViewGroup) this.itemView.findViewById(R.id.root_layout));
    private ImageView f19921e = ((ImageView) this.itemView.findViewById(R.id.option1));
    private ImageView f19922f = ((ImageView) this.itemView.findViewById(R.id.tick1));
    private View f19923g = this.itemView.findViewById(R.id.divider_line);

    class C43961 implements OnClickListener {
        final /* synthetic */ C6972a f12271a;

        C43961(C6972a c6972a) {
            this.f12271a = c6972a;
        }

        public final void onClick(View view) {
            C7226a c7226a = (C7226a) this.f12271a.f16244a;
            this.f12271a.f19918b.mo3685a(c7226a.f19503j, c7226a.f20869c);
        }
    }

    public C6972a(C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup, C4374a c4374a) {
        super(layoutInflater, viewGroup, R.layout.list_item_theme, c3126i);
        this.f19918b = c4374a;
        this.f19921e.setOnClickListener(new C43961(this));
        C2491i.m6796a(this.f19923g, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19919c, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6801a(this.f19922f, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6801a(this.f19921e, UIThemeManager.getmInstance().getAccent_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        C7226a c7226a = (C7226a) c6829g;
        this.f19919c.setText(c7226a.f20867a);
        if (c7226a.f19504k == 0) {
            this.f19923g.setVisibility(4);
        } else {
            this.f19923g.setVisibility(0);
        }
        if (c7226a.f20868b) {
            this.f19922f.setVisibility(0);
        } else {
            this.f19922f.setVisibility(4);
        }
        if (c7226a.f19503j == 10001) {
            this.f19921e.setVisibility(4);
        } else {
            this.f19921e.setVisibility(0);
        }
    }
}
