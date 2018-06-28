package mobi.mmdt.ott.view.contact.p415a.p417b;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
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
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.contact.p415a.p569c.C7339d;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6871c extends C6073e {
    private FrameLayout f19597b = ((FrameLayout) this.itemView.findViewById(R.id.root_contact_item_layout));
    private Activity f19598c;
    private RoundAvatarImageView f19599d = ((RoundAvatarImageView) this.itemView.findViewById(R.id.imageView1));
    private TextView f19600e = ((TextView) this.itemView.findViewById(R.id.textView1));
    private TextView f19601f = ((TextView) this.itemView.findViewById(R.id.textView2));
    private FrameLayout f19602g = ((FrameLayout) this.itemView.findViewById(R.id.root_layout));
    private LinearLayout f19603h = ((LinearLayout) this.itemView.findViewById(R.id.invite_linearLayout));
    private View f19604i = this.itemView.findViewById(R.id.divider_line);

    public C6871c(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.list_item_contacts, null);
        this.f19598c = activity;
        this.f19603h.setVisibility(8);
        new View[1][0] = this.f19597b;
        C2491i.m6796a(this.f19604i, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19600e, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19601f, UIThemeManager.getmInstance().getText_secondary_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        C1274i a;
        C1248f b;
        C7339d c7339d = (C7339d) c6829g;
        this.f19600e.setText(c7339d.f21177b);
        TextView textView = this.f19601f;
        CharSequence a2 = (c7339d.f21178c == null || c7339d.f21178c.isEmpty()) ? C4522p.m8236a(R.string.im_using_soroush) : c7339d.f21178c;
        textView.setText(a2);
        this.f19599d.setImageBitmap(null);
        if (c7339d.f21179d != null) {
            a = C1212c.m2872a(this.f19598c).m10950a(C4515k.m8231a(C2556b.m6998a(c7339d.f21179d)));
            b = C1248f.m2945b().m2955b(C1144h.f3689a);
        } else if (c7339d.f21180e != null) {
            a = C1212c.m2872a(this.f19598c).m10950a(c7339d.f21180e);
            b = C1248f.m2945b();
        } else {
            C1212c.m2872a(this.f19598c).m10953a(this.f19599d);
            this.f19599d.setName(c7339d.f21177b);
            this.f19599d.setBackgroundColor(c7339d.f21181f);
        }
        a.m3034a(b).m3033a().m3031a(this.f19599d);
        this.f19599d.setName(c7339d.f21177b);
        this.f19599d.setBackgroundColor(c7339d.f21181f);
    }
}
