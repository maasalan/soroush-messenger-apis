package mobi.mmdt.ott.view.newdesign.mainpage.p470e;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.main.C4144a;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C4276b {
    C4279d f12076a;
    private ImageView f12077b;
    private TextView f12078c;
    private int f12079d = -1;

    public C4276b(RelativeLayout relativeLayout, int i, C4279d c4279d) {
        this.f12078c = (TextView) relativeLayout.findViewById(R.id.tab_badge_textView);
        this.f12077b = (ImageView) relativeLayout.findViewById(R.id.tab_icon);
        this.f12076a = c4279d;
        this.f12077b.setPadding(i, i, i, i);
        C2491i.m6803a(this.f12078c);
        m8073b(8);
        AssetManager assets = this.f12077b.getContext().getAssets();
        StringBuilder stringBuilder = new StringBuilder("fonts/");
        stringBuilder.append(C2535a.m6888a().at());
        Typeface createFromAsset = Typeface.createFromAsset(assets, stringBuilder.toString());
        C2491i.m6802a(this.f12078c, UIThemeManager.getmInstance().getTab_badge_text_color());
        C2491i.m6789a(createFromAsset, this.f12078c);
        C4276b.m8072a(this.f12078c, UIThemeManager.getmInstance().getTab_not_selected_gray_color(), UIThemeManager.getmInstance().getPrimary_color());
        C2491i.m6783a(UIThemeManager.getmInstance().getTab_not_selected_gray_color(), this.f12077b);
        C2491i.m6790a(this.f12078c.getBackground(), UIThemeManager.getmInstance().getTab_not_selected_gray_color());
        C4276b.m8072a(this.f12078c, UIThemeManager.getmInstance().getTab_not_selected_gray_color(), UIThemeManager.getmInstance().getPrimary_color());
    }

    private static void m8072a(View view, int i, int i2) {
        Drawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(2, i2);
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(gradientDrawable);
        } else {
            view.setBackgroundDrawable(gradientDrawable);
        }
    }

    private void m8073b(int i) {
        this.f12078c.setVisibility(i);
    }

    public final void m8074a(int i) {
        this.f12077b.setImageResource(i);
    }

    public final void m8075a(String str, int i) {
        if (i != this.f12079d) {
            this.f12079d = i;
            if (this.f12078c != null) {
                if (i == 0) {
                    m8073b(8);
                } else if (i < 100) {
                    m8073b(0);
                    C4144a.m8008d(this.f12078c);
                    if (str.equals("fa")) {
                        this.f12078c.setText(String.format(C4522p.m8236a(R.string.unread_count_number), new Object[]{C2491i.m6809b(i)}));
                        return;
                    }
                    this.f12078c.setText(String.format(C4522p.m8236a(R.string.unread_count_number), new Object[]{Integer.valueOf(i)}));
                } else {
                    m8073b(0);
                    C4144a.m8008d(this.f12078c);
                    if (str.equals("fa")) {
                        this.f12078c.setText(C2491i.m6814b(C4522p.m8236a(R.string.unread_message_counts)));
                        return;
                    }
                    this.f12078c.setText(C4522p.m8236a(R.string.unread_message_counts));
                }
            }
        }
    }

    public final void m8076a(boolean z) {
        int tab_selected_color = z ? UIThemeManager.getmInstance().getTab_selected_color() : UIThemeManager.getmInstance().getTab_not_selected_gray_color();
        C2491i.m6802a(this.f12078c, UIThemeManager.getmInstance().getTab_badge_text_color());
        C2491i.m6783a(tab_selected_color, this.f12077b);
        C2491i.m6790a(this.f12078c.getBackground(), tab_selected_color);
        C4276b.m8072a(this.f12078c, tab_selected_color, UIThemeManager.getmInstance().getPrimary_color());
    }
}
