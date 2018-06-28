package mobi.mmdt.ott.view.components.fileselector.p406a;

import android.app.Activity;
import android.support.v4.p029a.C0346c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.fileselector.p565b.C7325c;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;

public final class C6833b extends C6073e {
    private Activity f19530b;
    private RoundAvatarImageView f19531c = ((RoundAvatarImageView) this.itemView.findViewById(R.id.imageView1));
    private TextView f19532d = ((TextView) this.itemView.findViewById(R.id.textView1));
    private TextView f19533e = ((TextView) this.itemView.findViewById(R.id.textView2));
    private View f19534f = this.itemView.findViewById(R.id.divider_line);

    public C6833b(Activity activity, C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.files_folder_list_item, c3126i);
        this.f19530b = activity;
        C2491i.m6796a(this.f19534f, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19532d, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19533e, UIThemeManager.getmInstance().getText_secondary_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        View view;
        int i;
        C7325c c7325c = (C7325c) c6829g;
        this.f19532d.setText(c7325c.f21102a);
        this.f19533e.setText(c7325c.f21104c);
        this.f19531c.setBackgroundColor(C0346c.m687c(this.f19530b, R.color.folder_background_color));
        this.f19531c.setTextColor(-1);
        this.f19531c.setImageBitmap(null);
        C1212c.m2872a(this.f19530b).m10950a(Integer.valueOf(R.drawable.ic_file_selection_folder)).m3031a(this.f19531c);
        if (c7325c.f19504k == 0) {
            view = this.f19534f;
            i = 4;
        } else {
            view = this.f19534f;
            i = 0;
        }
        view.setVisibility(i);
    }
}
