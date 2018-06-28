package mobi.mmdt.ott.logic.p261a.p298k;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.deletechannel.C5832a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2707u;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5946t;
import mobi.mmdt.ott.logic.p261a.p323v.p324a.C2748b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p385g.C2976c;
import mobi.mmdt.ott.provider.p385g.C2980g;
import p000a.p001a.p002a.C0005c;

public final class C6746k extends C5891a {
    private String f19248a;

    public C6746k(String str) {
        super(C2683h.f8620b);
        this.f19248a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        new C5832a(C2535a.m6888a().m6928d(), this.f19248a).m13037a(MyApplication.m12952b());
        C2980g.m7444e(this.f19248a);
        C2966b.m7415f(this.f19248a);
        C2976c a = C2980g.m7433a(this.f19248a);
        if (!(a == null || a.f9292l)) {
            C0005c.m0a().m9d(new C2748b(a.f9292l ^ 1));
        }
        C0005c.m0a().m9d(new C2707u());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5946t(th));
        return C1073q.f3504b;
    }
}
