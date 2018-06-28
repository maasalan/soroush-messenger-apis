package mobi.mmdt.ott.logic.p261a.p284f.p286b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.leavechannel.C5837a;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2651r;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5923q;
import mobi.mmdt.ott.logic.p261a.p323v.p324a.C2748b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p385g.C2976c;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p390l.C3004f;
import p000a.p001a.p002a.C0005c;

public final class C6707p extends C5891a {
    private String f19090a;

    public C6707p(String str) {
        super(C2683h.f8620b);
        this.f19090a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2976c a = C2980g.m7433a(this.f19090a);
        if (!a.f9287g.equals(C3004f.OWNER)) {
            new C5837a(C2535a.m6888a().m6928d(), this.f19090a).m13042a(MyApplication.m12952b());
            C2808d.m7148b(new C6700i(this.f19090a));
            C2980g.m7444e(this.f19090a);
            C2966b.m7412d(this.f19090a);
            C2480b.m6742f("UpdateNotificationJob UpdateNotificationService from LeaveChannelJob ");
            if (!a.f9292l) {
                C0005c.m0a().m9d(new C2748b(a.f9292l ^ 1));
            }
            C0005c.m0a().m9d(new C2651r(this.f19090a));
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5923q(th));
        return C1073q.f3504b;
    }
}
