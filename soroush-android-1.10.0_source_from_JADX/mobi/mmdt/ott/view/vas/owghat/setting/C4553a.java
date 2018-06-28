package mobi.mmdt.ott.view.vas.owghat.setting;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;

public final class C4553a extends ArrayAdapter {
    public C4553a(Context context, List list) {
        super(context, R.layout.spinner_layout_item, list);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        C2491i.m6802a((TextView) view2.findViewById(R.id.text1), UIThemeManager.getmInstance().getText_primary_color());
        return view2;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        C2491i.m6802a((TextView) view2.findViewById(R.id.text1), UIThemeManager.getmInstance().getText_primary_color());
        return view2;
    }
}
