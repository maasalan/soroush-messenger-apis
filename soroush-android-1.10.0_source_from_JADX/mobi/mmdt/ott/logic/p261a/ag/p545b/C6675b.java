package mobi.mmdt.ott.logic.p261a.ag.p545b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.C6686d;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.tools.C4478a;

public final class C6675b extends C5891a {
    public C6675b() {
        super(C2683h.f8620b);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2535a.m6888a().m6923b(true);
        C2535a.m6888a().f8278a.edit().putInt("mobi.mmdt.ott.model.pref.PrefKeys.KEY_OBSOLETE_VERSION", MyApplication.m12952b().getPackageManager().getPackageInfo(MyApplication.m12952b().getPackageName(), 0).versionCode).apply();
        C2808d.m7147a(new C6686d());
        C4478a.m8137a();
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
