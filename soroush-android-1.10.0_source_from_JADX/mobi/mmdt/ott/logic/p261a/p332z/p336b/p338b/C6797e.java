package mobi.mmdt.ott.logic.p261a.p332z.p336b.p338b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.ivrRequest.IvrProcess;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p337a.C2771f;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p337a.C5974e;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6797e extends C5891a {
    public C6797e() {
        super(C2683h.f8620b);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        new IvrProcess(C2535a.m6888a().m6928d()).sendRequest(MyApplication.m12952b());
        C0005c.m0a().m9d(new C2771f());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5974e(th));
        return C1073q.f3504b;
    }
}
