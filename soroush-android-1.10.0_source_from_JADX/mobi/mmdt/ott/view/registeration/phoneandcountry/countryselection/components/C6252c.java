package mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;

final class C6252c extends ViewHolder {
    TextView f17004a;
    TextView f17005b;

    C6252c(View view) {
        super(view);
        this.f17004a = (TextView) view.findViewById(R.id.text1);
        this.f17005b = (TextView) view.findViewById(R.id.text2);
        C2491i.m6802a(this.f17004a, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f17005b, UIThemeManager.getmInstance().getText_secondary_color());
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f17004a.getText().toString());
        stringBuilder.append("_");
        stringBuilder.append(this.f17005b.getText().toString());
        return stringBuilder.toString();
    }
}
