package mobi.mmdt.ott.view.settings.mainsettings.privacy.activesession.p475a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.mainsettings.privacy.activesession.C4425b;
import mobi.mmdt.ott.view.settings.mainsettings.privacy.activesession.p587b.C7228b;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6981b extends C6073e {
    private View f19931b;
    private TextView f19932c;
    private TextView f19933d = ((TextView) this.itemView.findViewById(R.id.textView1));
    private TextView f19934e;
    private TextView f19935f;
    private TextView f19936g;
    private RelativeLayout f19937h = ((RelativeLayout) this.itemView.findViewById(R.id.session_detail_relative_layout));

    public C6981b(LayoutInflater layoutInflater, ViewGroup viewGroup, final C4425b c4425b) {
        super(layoutInflater, viewGroup, R.layout.active_session_detail_session_item, null);
        this.f19933d.setTypeface(this.f19933d.getTypeface(), 1);
        this.f19935f = (TextView) this.itemView.findViewById(R.id.textView3);
        this.f19936g = (TextView) this.itemView.findViewById(R.id.textView4);
        this.f19934e = (TextView) this.itemView.findViewById(R.id.textView2);
        this.f19932c = (TextView) this.itemView.findViewById(R.id.textView5);
        this.f19932c.setTypeface(this.f19932c.getTypeface(), 1);
        this.f19931b = this.itemView.findViewById(R.id.divider_line);
        this.f19937h.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C6981b f12334b;

            public final void onClick(View view) {
                c4425b.onClick(this.f12334b.f16244a.f19504k);
            }
        });
        C2491i.m6802a(this.f19932c, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6802a(this.f19933d, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19935f, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19936g, UIThemeManager.getmInstance().getText_primary_color());
    }

    private static void m18038a(TextView textView, String str) {
        if (str == null || str.isEmpty()) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(str);
    }

    protected final void mo3180a(C6829g c6829g) {
        C7228b c7228b = (C7228b) c6829g;
        boolean z = c7228b.f20872b;
        boolean z2 = c7228b.f20873c;
        if (z) {
            this.f19932c.setVisibility(0);
            this.f19932c.setText(C4522p.m8236a(R.string.current_session_item_list));
            this.f19937h.setClickable(false);
            C2491i.m6802a(this.f19934e, UIThemeManager.getmInstance().getAccent_color());
        } else {
            C2491i.m6802a(this.f19934e, UIThemeManager.getmInstance().getText_primary_color());
            this.f19937h.setClickable(true);
            if (z2) {
                this.f19932c.setVisibility(0);
                this.f19932c.setText(C4522p.m8236a(R.string.active_session_item_list));
            } else {
                this.f19932c.setVisibility(8);
            }
        }
        C6981b.m18038a(this.f19933d, c7228b.f20871a);
        C6981b.m18038a(this.f19935f, c7228b.f20874d);
        C6981b.m18038a(this.f19936g, c7228b.f20875e);
        C6981b.m18038a(this.f19934e, c7228b.f20876f);
        if (c7228b.f19504k != 0) {
            if (z || !z2) {
                this.f19931b.setVisibility(0);
                return;
            }
        }
        this.f19931b.setVisibility(4);
    }
}
