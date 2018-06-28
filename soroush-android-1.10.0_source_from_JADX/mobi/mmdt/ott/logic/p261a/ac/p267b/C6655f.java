package mobi.mmdt.ott.logic.p261a.ac.p267b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.get_sticker_banner.C5878a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2587e;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2588f;
import mobi.mmdt.ott.logic.p371s.C2899b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6655f extends C5891a {
    public C6655f() {
        super(C2683h.f8620b);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C0005c.m0a().m9d(new C2588f(new C5878a(C2535a.m6888a().m6928d(), C2899b.m7275a().m7276a(C2535a.m6888a().m6919b())).m13083a(MyApplication.m12952b()).getmBanners()));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C2587e());
        return C1073q.f3504b;
    }
}
