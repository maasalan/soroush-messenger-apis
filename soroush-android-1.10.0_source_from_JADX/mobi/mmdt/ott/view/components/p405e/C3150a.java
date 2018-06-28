package mobi.mmdt.ott.view.components.p405e;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.support.v4.p029a.C0346c;
import android.support.v4.p029a.p030a.C0343b;
import android.support.v7.app.C0662a;
import android.support.v7.app.C7406c;
import android.support.v7.widget.Toolbar;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p350g.C2816a;
import p000a.p001a.p002a.C0005c;

public class C3150a extends Fragment {
    protected Toolbar f9774d;

    public static Context m7631c() {
        return MyApplication.m12952b();
    }

    public final void m7632a(int i, int i2) {
        C2491i.m6796a(this.f9774d, i);
        C2491i.m6795a(this.f9774d, i2);
    }

    public final void m7633a(Activity activity) {
        C7406c c7406c = (C7406c) activity;
        c7406c.m19694f().mo2585a(this.f9774d);
        if (this.f9774d != null) {
            this.f9774d.setOverflowIcon(C0343b.m671a(getResources(), R.drawable.ic_option, activity.getTheme()));
            if (this.f9774d.getOverflowIcon() != null) {
                C2491i.m6790a(this.f9774d.getOverflowIcon(), -1);
            }
        }
        C0662a a = c7406c.m19694f().mo457a();
        if (a != null) {
            a.mo471a(true);
            a.mo476b(true);
            a.mo469a(C2491i.m6808b(C0346c.m682a(getActivity(), (int) R.drawable.ic_back_dark), -1));
        }
    }

    public void onEvent(C2816a c2816a) {
    }

    public void onPause() {
        super.onPause();
        if (C0005c.m0a().m7b(this)) {
            C0005c.m0a().m8c(this);
        }
    }

    public void onResume() {
        super.onResume();
        if (!C0005c.m0a().m7b(this)) {
            C0005c.m0a().m6a((Object) this);
        }
    }
}
