package mobi.mmdt.ott.view.newdesign.mainpage.p469d;

import android.support.design.widget.AppBarLayout;
import android.view.View;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.conversation.typing.AVLoadingIndicatorView;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C4274a {
    public AVLoadingIndicatorView f12072a;
    public AVLoadingIndicatorView f12073b;
    public TextView f12074c;
    public AppBarLayout f12075d;

    public C4274a(View view) {
        this.f12072a = (AVLoadingIndicatorView) view.findViewById(R.id.waiting_view_subtitle_toolbar_fa);
        this.f12073b = (AVLoadingIndicatorView) view.findViewById(R.id.waiting_view_subtitle_toolbar_en);
        this.f12074c = (TextView) view.findViewById(R.id.title_toolbar_textView);
        this.f12075d = (AppBarLayout) view.findViewById(R.id.appbar);
        m8069a(C2535a.m6888a().m6919b(), 0);
    }

    private void m8069a(String str, int i) {
        (str.equals("fa") ? this.f12072a : this.f12073b).setVisibility(i);
    }

    public final void m8070a(String str) {
        if (!(this.f12074c == null || this.f12072a == null || this.f12073b == null)) {
            this.f12074c.setText(C4522p.m8236a(MyApplication.m12950a().f15895J.f8930e));
            C2491i.m6803a(this.f12074c);
            switch (MyApplication.m12950a().f15895J) {
                case CONNECTING:
                case WAITING_FOR_NETWORK:
                    m8069a(str, 0);
                    break;
                case UPDATING:
                case CONNECTED:
                    m8069a(str, 8);
                    return;
                default:
                    return;
            }
        }
    }
}
