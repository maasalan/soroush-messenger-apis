package mobi.mmdt.ott.view.block.p553a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import mobi.mmdt.ott.view.block.p595b.C7320a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6819a extends C6073e {
    private String f19450b = C2535a.m6888a().m6919b();
    private Activity f19451c;
    private RoundAvatarImageView f19452d = ((RoundAvatarImageView) this.itemView.findViewById(R.id.imageView1));
    private TextView f19453e = ((TextView) this.itemView.findViewById(R.id.textView1));
    private TextView f19454f = ((TextView) this.itemView.findViewById(R.id.textView2));
    private View f19455g = this.itemView.findViewById(R.id.divider_line);

    public C6819a(Activity activity, C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.list_item_block_contacts, c3126i);
        this.f19451c = activity;
        C2491i.m6796a(this.f19455g, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19453e, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19454f, UIThemeManager.getmInstance().getText_secondary_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        TextView textView;
        CharSequence b;
        C1274i a;
        View view;
        int i;
        C7320a c7320a = (C7320a) c6829g;
        if (this.f19450b.equals("fa")) {
            this.f19453e.setText(C2491i.m6814b(c7320a.f21066a));
            textView = this.f19454f;
            String a2 = (c7320a.f21067b == null || c7320a.f21067b.isEmpty()) ? C4522p.m8236a(R.string.im_using_soroush) : c7320a.f21067b;
            b = C2491i.m6814b(a2);
        } else {
            this.f19453e.setText(c7320a.f21066a);
            textView = this.f19454f;
            b = (c7320a.f21067b == null || c7320a.f21067b.isEmpty()) ? C4522p.m8236a(R.string.im_using_soroush) : c7320a.f21067b;
        }
        textView.setText(b);
        this.f19452d.setImageBitmap(null);
        if (c7320a.f21068c != null && !c7320a.f21068c.isEmpty()) {
            a = C1212c.m2872a(this.f19451c).m10950a(C4515k.m8231a(C2556b.m6998a(c7320a.f21068c))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a));
        } else if (c7320a.f21069d != null) {
            a = C1212c.m2872a(this.f19451c).m10950a(c7320a.f21069d).m3034a(C1248f.m2945b()).m3033a();
        } else {
            C1212c.m2872a(this.f19451c).m10953a(this.f19452d);
            this.f19452d.setName(c7320a.f21066a);
            this.f19452d.setBackgroundColor(c7320a.f21070e);
            if (c7320a.f19504k != 0) {
                view = this.f19455g;
                i = 4;
            } else {
                view = this.f19455g;
                i = 0;
            }
            view.setVisibility(i);
        }
        a.m3031a(this.f19452d);
        this.f19452d.setName(c7320a.f21066a);
        this.f19452d.setBackgroundColor(c7320a.f21070e);
        if (c7320a.f19504k != 0) {
            view = this.f19455g;
            i = 0;
        } else {
            view = this.f19455g;
            i = 4;
        }
        view.setVisibility(i);
    }
}
