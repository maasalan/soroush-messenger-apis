package mobi.mmdt.ott.logic.p261a.p276b;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.aa.C6643b;
import mobi.mmdt.ott.logic.p345c.C2788a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p389k.C2999a;

public final class C6680c extends C5891a {
    public C6680c() {
        super(C2683h.f8620b);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        ArrayList b;
        try {
            b = C2788a.m7101a().f8811c.mo2154b();
        } catch (Throwable e) {
            C2480b.m6737b("Error in GetBlockUsersJob", e);
            b = null;
        }
        if (!(b == null || b.size() == 0)) {
            String[] strArr = (String[]) b.toArray(new String[b.size()]);
            new C6643b(strArr, false, false).onRun();
            C2999a.m7514d(strArr);
        }
        C2535a.m6888a().f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.PrefKeys.KEY_IS_BLOCKED_USERS_SYNCED", true).apply();
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
