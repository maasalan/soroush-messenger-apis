package mobi.mmdt.ott.logic.p261a.p332z.p336b.p338b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.clientCountry.C5814a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p337a.C2770c;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p337a.C5973d;
import p000a.p001a.p002a.C0005c;

public final class C6794b extends C5891a {
    public C6794b() {
        super(C2683h.f8620b);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C0005c.m0a().m9d(new C2770c(new C5814a().m13019a(MyApplication.m12952b())));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5973d(th));
        return C1073q.f3504b;
    }
}
