package mobi.mmdt.ott.logic.p261a.p298k;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.checkfreechannelid.C5830a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2698e;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5940f;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6738c extends C5891a {
    private String f19195a;

    public C6738c(String str) {
        super(C2683h.f8620b);
        this.f19195a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        new C5830a(C2535a.m6888a().m6928d(), this.f19195a).m13035a(MyApplication.m12952b());
        C0005c.m0a().m9d(new C2698e());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5940f(th));
        return C1073q.f3504b;
    }
}
