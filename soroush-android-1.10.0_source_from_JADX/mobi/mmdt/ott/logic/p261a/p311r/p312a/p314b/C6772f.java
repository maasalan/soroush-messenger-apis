package mobi.mmdt.ott.logic.p261a.p311r.p312a.p314b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.leavegroup.C5854a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p313a.C2734f;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p313a.C5958e;
import mobi.mmdt.ott.logic.p261a.p323v.p324a.C2748b;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.logic.p360l.p361a.C2840b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p385g.C2976c;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.provider.p390l.C6037d;
import p000a.p001a.p002a.C0005c;

public final class C6772f extends C5891a {
    private String f19344a;
    private boolean f19345b;

    public C6772f(String str, boolean z) {
        super(C2683h.f8620b);
        this.f19344a = str;
        this.f19345b = z;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String d = C2535a.m6888a().m6928d();
        C2976c a = C2980g.m7433a(this.f19344a);
        if (!a.f9287g.equals(C3004f.NONE)) {
            new C5854a(C2535a.m6888a().m6928d(), this.f19344a).m13059a(MyApplication.m12952b());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C2999a.m7500a(d).f9416b);
            stringBuilder.append(" left group");
            C2840b.m7183a(this.f19344a, stringBuilder.toString(), d, C2483a.m6744a(MyApplication.m12952b()));
            C5996e.m13260a().f16147a.m7104a(this.f19344a, d);
        }
        if (this.f19345b) {
            C2980g.m7444e(this.f19344a);
            d = this.f19344a;
            new C6037d().m13531a(d).m7360a(MyApplication.m12952b());
            C2966b.m7412d(this.f19344a);
        }
        C0005c.m0a().m9d(new C2734f());
        if (!a.f9292l) {
            C2480b.m6742f("UpdateNotificationJob UpdateNotificationService from LeaveAndDeleteGroupJob");
            C0005c.m0a().m9d(new C2748b(a.f9292l ^ true));
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5958e(th));
        return C1073q.f3504b;
    }
}
