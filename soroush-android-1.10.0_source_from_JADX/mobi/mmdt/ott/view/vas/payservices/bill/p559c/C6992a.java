package mobi.mmdt.ott.view.vas.payservices.bill.p559c;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C5284j;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.vas.payservices.bill.p485b.C4555a;
import mobi.mmdt.ott.view.vas.payservices.bill.p591d.C7233a;

public final class C6992a extends C6073e {
    private TextView f19975b = ((TextView) this.itemView.findViewById(R.id.textView1));
    private TextView f19976c = ((TextView) this.itemView.findViewById(R.id.textView2));
    private TextView f19977d = ((TextView) this.itemView.findViewById(R.id.textView3));
    private Activity f19978e;
    private RoundAvatarImageView f19979f = ((RoundAvatarImageView) this.itemView.findViewById(R.id.imageView1));
    private ImageView f19980g = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private View f19981h = this.itemView.findViewById(R.id.divider_line);
    private String f19982i = C2535a.m6888a().m6919b();

    public C6992a(Activity activity, C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.list_item_pay_history, c3126i);
        this.f19978e = activity;
        C2491i.m6796a(this.f19981h, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19975b, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19977d, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6802a(this.f19976c, UIThemeManager.getmInstance().getText_secondary_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        C5284j a;
        int i;
        C7233a c7233a = (C7233a) c6829g;
        this.f19976c.setText(C2491i.m6777a(this.f19982i, c7233a.f20882c));
        this.f19975b.setText(C4555a.m8299f(c7233a.f20880a));
        TextView textView = this.f19977d;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C2491i.m6777a(this.f19982i, C2491i.m6776a(c7233a.f20881b)));
        stringBuilder.append(" ");
        stringBuilder.append(C4522p.m8236a(R.string.rial));
        textView.setText(stringBuilder.toString());
        C1212c.m2872a(this.f19978e).m10950a(Integer.valueOf(C4555a.m8298e(c7233a.f20880a))).m3034a(C1248f.m2937a().m2955b(C1144h.f3689a)).m3031a(this.f19979f);
        if (c7233a.f20883d == 1) {
            a = C1212c.m2872a(this.f19978e);
            i = R.drawable.ic_pay_ok;
        } else {
            a = C1212c.m2872a(this.f19978e);
            i = R.drawable.ic_pay_error;
        }
        a.m10950a(Integer.valueOf(i)).m3034a(C1248f.m2937a().m2955b(C1144h.f3689a).m2955b(C1144h.f3689a)).m3031a(this.f19980g);
    }
}
