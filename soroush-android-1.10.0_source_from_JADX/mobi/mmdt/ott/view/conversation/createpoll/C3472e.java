package mobi.mmdt.ott.view.conversation.createpoll;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;

public final class C3472e extends ArrayAdapter<String> {
    private Activity f10602a;
    private ArrayList f10603b;
    private LayoutInflater f10604c;

    public C3472e(Activity activity, ArrayList arrayList) {
        super(activity, R.layout.question_type_spinner_item, arrayList);
        this.f10602a = activity;
        this.f10603b = arrayList;
        this.f10604c = (LayoutInflater) activity.getSystemService("layout_inflater");
    }

    private View m7889a(int i, ViewGroup viewGroup) {
        View inflate = this.f10604c.inflate(R.layout.question_type_spinner_item, viewGroup, false);
        C3471d c3471d = (C3471d) this.f10603b.get(i);
        TextView textView = (TextView) inflate.findViewById(R.id.textView1);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.imageView1);
        textView.setText(c3471d.f10600a);
        imageView.setImageResource(c3471d.f10601b);
        C2491i.m6802a(textView, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6801a(imageView, UIThemeManager.getmInstance().getText_primary_color());
        return inflate;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return m7889a(i, viewGroup);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return m7889a(i, viewGroup);
    }
}
