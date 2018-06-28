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
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.stickermarket.p588b.C7393c;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6988b extends C6073e {
    private boolean f19949b;
    private Activity f19950c;
    private ImageView f19951d;
    private TextView f19952e;
    private TextView f19953f;
    private TextView f19954g;
    private ProgressWheel f19955h;
    private ProgressWheel f19956i;
    private View f19957j;
    private C1247e<Drawable> f19958k = new C62681(this);

    class C62681 implements C1247e<Drawable> {
        final /* synthetic */ C6988b f17097a;

        C62681(C6988b c6988b) {
            this.f17097a = c6988b;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            this.f17097a.f19955h.setVisibility(8);
            return false;
        }
    }

    public C6988b(Activity activity, C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.sticker_market_package_list_item, c3126i);
        this.f19950c = activity;
        this.f19957j = this.itemView.findViewById(R.id.divider_line);
        this.f19951d = (ImageView) this.itemView.findViewById(R.id.imageView1);
        this.f19952e = (TextView) this.itemView.findViewById(R.id.textView1);
        this.f19953f = (TextView) this.itemView.findViewById(R.id.textView2);
        this.f19954g = (TextView) this.itemView.findViewById(R.id.textView3);
        this.f19955h = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f19956i = (ProgressWheel) this.itemView.findViewById(R.id.load_more_progressWheel);
        this.f19949b = C2535a.m6888a().m6919b().equals("fa");
        C2491i.m6796a(this.f19957j, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19952e, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19953f, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6802a(this.f19954g, UIThemeManager.getmInstance().getText_secondary_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        TextView textView;
        C7393c c7393c = (C7393c) c6829g;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c7393c.f21499d);
        stringBuilder.append(" ");
        stringBuilder.append(C4522p.m8236a(R.string.downloads));
        CharSequence stringBuilder2 = stringBuilder.toString();
        if (this.f19949b) {
            this.f19952e.setText(C2491i.m6814b(c7393c.f21497b));
            textView = this.f19954g;
            stringBuilder2 = C2491i.m6814b((String) stringBuilder2);
        } else {
            this.f19952e.setText(c7393c.f21497b);
            textView = this.f19954g;
        }
        textView.setText(stringBuilder2);
        stringBuilder2 = c7393c.f21498c;
        double parseDouble = Double.parseDouble(stringBuilder2);
        TextView textView2 = this.f19953f;
        if (parseDouble == 0.0d) {
            stringBuilder2 = C4522p.m8236a(R.string.free);
        }
        textView2.setText(stringBuilder2);
        C1274i a = C1212c.m2872a(this.f19950c).m10950a(C4515k.m8231a(c7393c.f21500e));
        a.f3986c = this.f19958k;
        a.m3033a().m3031a(this.f19951d);
        if (c7393c.f19504k == 0) {
            this.f19957j.setVisibility(4);
        } else {
            this.f19957j.setVisibility(0);
        }
        if (c7393c.f21501f) {
            this.f19956i.setVisibility(0);
        } else {
            this.f19956i.setVisibility(8);
        }
    }
}
