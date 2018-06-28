package mobi.mmdt.ott.logic.p261a.p332z.p336b.p338b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p258a.C2558a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p258a.C2559b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p337a.C2769a;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p337a.C5972b;
import mobi.mmdt.ott.logic.p371s.C2900c;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6796d extends C5891a {
    private final String f19409a;
    private final String f19410b;

    public C6796d(String str, String str2) {
        super(C2683h.f8620b);
        this.f19410b = str;
        this.f19409a = str2;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        try {
            C2535a.m6888a().m6922b(C2900c.m7277a(C2535a.m6888a().m6928d(), this.f19410b, this.f19409a).getUserName());
            C2535a a = C2535a.m6888a();
            a.f8278a.edit().putString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_PROFILE_PIN_CODE", this.f19410b).apply();
            C0005c.m0a().m9d(new C2769a());
        } catch (C2559b e) {
            if (e.f8367a.equals(C2558a.NOT_AUTHORIZED)) {
                throw new C2773a();
            }
            throw e;
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5972b(th));
        return C1073q.f3504b;
    }
}
