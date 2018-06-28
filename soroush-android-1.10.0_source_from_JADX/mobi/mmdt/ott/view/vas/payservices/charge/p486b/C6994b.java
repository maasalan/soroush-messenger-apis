package mobi.mmdt.ott.view.vas.payservices.charge.p486b;

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
import mobi.mmdt.ott.logic.vas.p372a.C2912b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.vas.payservices.charge.p593c.C7235b;

public final class C6994b extends C6073e {
    private TextView f19990b = ((TextView) this.itemView.findViewById(R.id.textView1));
    private TextView f19991c = ((TextView) this.itemView.findViewById(R.id.textView2));
    private TextView f19992d = ((TextView) this.itemView.findViewById(R.id.textView3));
    private Activity f19993e;
    private RoundAvatarImageView f19994f = ((RoundAvatarImageView) this.itemView.findViewById(R.id.imageView1));
    private ImageView f19995g = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ImageView f19996h = ((ImageView) this.itemView.findViewById(R.id.star_imageView));
    private View f19997i = this.itemView.findViewById(R.id.divider_line);
    private String f19998j = C2535a.m6888a().m6919b();

    public C6994b(Activity activity, C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.list_item_pay_history, c3126i);
        this.f19993e = activity;
        C2491i.m6796a(this.f19997i, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19990b, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19992d, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6802a(this.f19991c, UIThemeManager.getmInstance().getText_secondary_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        C5284j a;
        int i;
        ImageView imageView;
        int i2;
        C7235b c7235b = (C7235b) c6829g;
        this.f19991c.setText(C2491i.m6777a(this.f19998j, c7235b.f20891e));
        this.f19990b.setText(c7235b.f20887a);
        TextView textView = this.f19992d;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C2912b.m7285a(c7235b.f20889c));
        stringBuilder.append(" ");
        stringBuilder.append(C2491i.m6777a(this.f19998j, C2491i.m6776a(c7235b.f20890d)));
        stringBuilder.append(" ");
        stringBuilder.append(C4522p.m8236a(R.string.rial));
        textView.setText(stringBuilder.toString());
        this.f19994f.setImageBitmap(null);
        C1212c.m2872a(this.f19993e).m10950a(Integer.valueOf(c7235b.f20888b)).m3034a(C1248f.m2937a().m2955b(C1144h.f3689a)).m3031a(this.f19994f);
        if (c7235b.f20892f == 1) {
            a = C1212c.m2872a(this.f19993e);
            i = R.drawable.ic_pay_ok;
        } else {
            a = C1212c.m2872a(this.f19993e);
            i = R.drawable.ic_pay_error;
        }
        a.m10950a(Integer.valueOf(i)).m3034a(C1248f.m2937a().m2955b(C1144h.f3689a).m2955b(C1144h.f3689a)).m3031a(this.f19995g);
        if (c7235b.f20893g == 1) {
            imageView = this.f19996h;
            i2 = 0;
        } else {
            imageView = this.f19996h;
            i2 = 8;
        }
        imageView.setVisibility(i2);
    }
}
