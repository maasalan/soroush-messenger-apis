package mobi.mmdt.ott.logic.p261a.p321u;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.get_new_username.C5820a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p321u.p322a.C2746b;
import mobi.mmdt.ott.logic.p261a.p321u.p322a.C5967a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6778a extends C5891a {
    public C6778a() {
        super(C2683h.f8622d);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C0005c.m0a().m9d(new C2746b(new C5820a(C2535a.m6888a().m6928d()).m13025a(MyApplication.m12952b()).getNewUsername()));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5967a(th));
        return C1073q.f3504b;
    }
}
