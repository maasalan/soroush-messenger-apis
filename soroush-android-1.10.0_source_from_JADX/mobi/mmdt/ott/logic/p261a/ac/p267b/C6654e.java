package mobi.mmdt.ott.logic.p261a.ac.p267b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_categories.C5879a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2583a;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2584b;
import mobi.mmdt.ott.logic.p371s.C2899b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6654e extends C5891a {
    private int f18942a;

    public C6654e(int i) {
        super(C2683h.f8620b);
        this.f18942a = i;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C0005c.m0a().m9d(new C2584b(new C5879a(C2535a.m6888a().m6928d(), C2899b.m7275a().m7276a(C2535a.m6888a().m6919b())).m13084a(MyApplication.m12952b()).getmStrickerCategories(), this.f18942a));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C2583a());
        return C1073q.f3504b;
    }
}
