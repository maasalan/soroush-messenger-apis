package mobi.mmdt.ott.view.conversation.groupinfo.p448a;

import android.app.Activity;
import android.content.Context;
import android.support.v4.p029a.C0346c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.groupinfo.p574b.C7200a;
import mobi.mmdt.ott.view.tools.C4508f;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6913a extends C6073e {
    private final String f19696b = C2535a.m6888a().m6919b();
    private Activity f19697c;
    private RoundAvatarImageView f19698d = ((RoundAvatarImageView) this.itemView.findViewById(R.id.imageView1));
    private TextView f19699e = ((TextView) this.itemView.findViewById(R.id.textView1));
    private TextView f19700f = ((TextView) this.itemView.findViewById(R.id.textView2));
    private FrameLayout f19701g = ((FrameLayout) this.itemView.findViewById(R.id.root_layout));
    private TextView f19702h = ((TextView) this.itemView.findViewById(R.id.role_textView));
    private View f19703i = this.itemView.findViewById(R.id.divider_line);

    public C6913a(Activity activity, C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.group_member_list_item, c3126i);
        this.f19697c = activity;
        C2491i.m6796a(this.f19703i, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19699e, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19700f, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6790a(this.f19702h.getBackground(), UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6802a(this.f19702h, UIThemeManager.getmInstance().getAccent_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        TextView textView;
        int i;
        C7200a c7200a = (C7200a) c6829g;
        Object a = C4508f.m8220a(c7200a.f20788b);
        this.f19699e.setText(a);
        long j = c7200a.f20787a;
        if (j == -1 || j == 0) {
            this.f19700f.setText("");
        } else {
            Context context;
            int i2;
            CharSequence a2 = C2491i.m6772a(this.f19697c, C2778b.m7093a(), j);
            if (this.f19696b.equals("fa")) {
                String c;
                if (!(a2.contains(this.f19697c.getString(R.string.online)) || a2.contains(this.f19697c.getString(R.string.one_minute_ago)) || a2.contains(this.f19697c.getString(R.string.minutes_ago)) || a2.contains(this.f19697c.getString(R.string.today)) || a2.contains(this.f19697c.getString(R.string.yesterday)))) {
                    c = C2491i.m6825c(this.f19697c, j, this.f19696b);
                }
                a2 = C2491i.m6814b(c);
            }
            if (a2.equals(C4522p.m8236a(R.string.online))) {
                textView = this.f19700f;
                context = this.f19697c;
                i2 = R.color.online_user_text_color;
            } else {
                textView = this.f19700f;
                context = this.f19697c;
                i2 = R.color.textColorSecondary;
            }
            textView.setTextColor(C0346c.m687c(context, i2));
            this.f19700f.setText(a2);
        }
        switch (c7200a.f20791e) {
            case OWNER:
                this.f19702h.setVisibility(0);
                textView = this.f19702h;
                i = R.string.group_owner;
                break;
            case ADMIN:
                this.f19702h.setVisibility(0);
                textView = this.f19702h;
                i = R.string.group_admin;
                break;
            case MEMBER:
            case VISITOR:
            case NONE:
                this.f19702h.setVisibility(8);
                break;
            default:
                break;
        }
        textView.setText(C4522p.m8236a(i));
        this.f19698d.setImageBitmap(null);
        this.f19698d.setName(a);
        this.f19698d.setBackgroundColor(c7200a.f20790d);
        if (c7200a.f20789c != null) {
            C1212c.m2872a(this.f19697c).m10950a(C4515k.m8231a(C2556b.m6998a(c7200a.f20789c))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3031a(this.f19698d);
        } else {
            C1212c.m2872a(this.f19697c).m10953a(this.f19698d);
        }
        if (c7200a.f19504k == 0) {
            this.f19703i.setVisibility(4);
        } else {
            this.f19703i.setVisibility(0);
        }
    }
}
