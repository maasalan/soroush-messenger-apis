package mobi.mmdt.ott.view.components.p405e;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.p029a.C0346c;
import android.support.v4.p029a.p030a.C0343b;
import android.support.v7.app.C0662a;
import android.support.v7.app.C7406c;
import android.support.v7.widget.Toolbar;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;

public class C6830b extends Fragment {
    protected Toolbar ak;

    public final void m17262S() {
        C2491i.m6796a(this.ak, 0);
        C2491i.m6795a(this.ak, -1);
    }

    public final void m17263a(Activity activity, int i) {
        C7406c c7406c = (C7406c) activity;
        c7406c.m19694f().mo2585a(this.ak);
        if (this.ak != null) {
            this.ak.setOverflowIcon(C0343b.m671a(m8912l(), R.drawable.ic_option, activity.getTheme()));
            if (this.ak.getOverflowIcon() != null) {
                C2491i.m6790a(this.ak.getOverflowIcon(), i);
            }
        }
        C0662a a = c7406c.m19694f().mo457a();
        if (a != null) {
            a.mo471a(true);
            a.mo476b(true);
            a.mo469a(C2491i.m6808b(C0346c.m682a(m8911k(), (int) R.drawable.ic_back_dark), i));
        }
    }
}
