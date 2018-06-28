package mobi.mmdt.ott.logic.p261a.ai.p274a.p546b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.card.C5812a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.ai.p274a.p275a.C2620a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6678a extends C5891a {
    public C6678a() {
        super(C2683h.f8620b);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
        th.printStackTrace();
    }

    public final void onRun() {
        C0005c.m0a().m9d(new C2620a(new C5812a(C2535a.m6888a().m6928d()).m13017a(MyApplication.m12952b()).getCredit()));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        th.printStackTrace();
        return C1073q.f3504b;
    }
}
