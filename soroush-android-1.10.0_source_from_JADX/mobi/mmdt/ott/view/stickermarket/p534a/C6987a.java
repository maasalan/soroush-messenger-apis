package mobi.mmdt.ott.view.stickermarket.p534a;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p105g.C1247e;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.stickermarket.p588b.C7392b;
import mobi.mmdt.ott.view.tools.C4515k;

public final class C6987a extends C6073e {
    private Activity f19942b;
    private ImageView f19943c;
    private TextView f19944d;
    private TextView f19945e;
    private ProgressWheel f19946f;
    private View f19947g;
    private C1247e<Drawable> f19948h = new C62671(this);

    class C62671 implements C1247e<Drawable> {
        final /* synthetic */ C6987a f17096a;

        C62671(C6987a c6987a) {
            this.f17096a = c6987a;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            this.f17096a.f19946f.setVisibility(8);
            return false;
        }
    }

    public C6987a(Activity activity, C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.sticker_market_category_list_item, c3126i);
        this.f19942b = activity;
        this.f19947g = this.itemView.findViewById(R.id.divider_line);
        this.f19943c = (ImageView) this.itemView.findViewById(R.id.imageView1);
        this.f19944d = (TextView) this.itemView.findViewById(R.id.textView1);
        this.f19945e = (TextView) this.itemView.findViewById(R.id.textView2);
        this.f19946f = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        C2491i.m6796a(this.f19947g, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19944d, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19945e, UIThemeManager.getmInstance().getText_secondary_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        View view;
        int i;
        C7392b c7392b = (C7392b) c6829g;
        this.f19944d.setText(c7392b.f21493b);
        this.f19945e.setText(c7392b.f21494c);
        C1274i a = C1212c.m2872a(this.f19942b).m10950a(C4515k.m8231a(c7392b.f21495d));
        a.f3986c = this.f19948h;
        a.m3033a().m3031a(this.f19943c);
        if (c7392b.f19504k == 0) {
            view = this.f19947g;
            i = 4;
        } else {
            view = this.f19947g;
            i = 0;
        }
        view.setVisibility(i);
    }
}
