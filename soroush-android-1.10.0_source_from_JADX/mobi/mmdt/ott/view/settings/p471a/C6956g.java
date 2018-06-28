package mobi.mmdt.ott.view.settings.p471a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.p583b.C7383h;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6956g extends C6073e {
    private final Activity f19852b;
    private String f19853c;
    private RoundAvatarImageView f19854d = ((RoundAvatarImageView) this.itemView.findViewById(R.id.imageView1));
    private TextView f19855e = ((TextView) this.itemView.findViewById(R.id.textView1));
    private TextView f19856f = ((TextView) this.itemView.findViewById(R.id.textView2));
    private View f19857g = this.itemView.findViewById(R.id.divider_line);

    public C6956g(Activity activity, C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.settings_item_profile, c3126i);
        this.f19852b = activity;
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.root_profile_item_layout);
        this.f19853c = C2535a.m6888a().m6919b();
        new View[1][0] = frameLayout;
        C2491i.m6796a(this.f19857g, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19855e, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19856f, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6803a(this.f19855e);
    }

    protected final void mo3180a(C6829g c6829g) {
        TextView textView;
        CharSequence b;
        C1274i a;
        View view;
        int i;
        C7383h c7383h = (C7383h) c6829g;
        if (this.f19853c.equals("fa")) {
            this.f19855e.setText(C2491i.m6814b(c7383h.f21466a));
            textView = this.f19856f;
            String a2 = (c7383h.f21467b == null || c7383h.f21467b.isEmpty()) ? C4522p.m8236a(R.string.im_using_soroush) : c7383h.f21467b;
            b = C2491i.m6814b(a2);
        } else {
            this.f19855e.setText(c7383h.f21466a);
            textView = this.f19856f;
            b = (c7383h.f21467b == null || c7383h.f21467b.isEmpty()) ? C4522p.m8236a(R.string.im_using_soroush) : c7383h.f21467b;
        }
        textView.setText(b);
        this.f19854d.setImageBitmap(null);
        if (c7383h.f21468c != null && !c7383h.f21468c.isEmpty()) {
            a = C1212c.m2872a(this.f19852b).m10950a(C4515k.m8231a(C2556b.m6998a(c7383h.f21468c))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a));
        } else if (c7383h.f21469d != null) {
            a = C1212c.m2872a(this.f19852b).m10950a(c7383h.f21469d).m3034a(C1248f.m2945b()).m3033a();
        } else {
            C1212c.m2872a(this.f19852b).m10953a(this.f19854d);
            this.f19854d.setName(c7383h.f21466a);
            this.f19854d.setBackgroundColor(c7383h.f21470e);
            if (c7383h.f19504k != 0) {
                view = this.f19857g;
                i = 4;
            } else {
                view = this.f19857g;
                i = 0;
            }
            view.setVisibility(i);
        }
        a.m3031a(this.f19854d);
        this.f19854d.setName(c7383h.f21466a);
        this.f19854d.setBackgroundColor(c7383h.f21470e);
        if (c7383h.f19504k != 0) {
            view = this.f19857g;
            i = 0;
        } else {
            view = this.f19857g;
            i = 4;
        }
        view.setVisibility(i);
    }
}
