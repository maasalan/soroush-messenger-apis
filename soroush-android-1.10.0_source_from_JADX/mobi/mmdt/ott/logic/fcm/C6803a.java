package mobi.mmdt.ott.logic.fcm;

import com.google.firebase.iid.FirebaseInstanceId;
import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.fcm.sendtoken.C5819a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public final class C6803a extends C5891a {
    private String f19429a;

    public C6803a() {
        super(C2683h.f8622d);
    }

    public final void onAdded() {
        this.f19429a = C2535a.m6888a().m6904P();
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        if (this.f19429a == null || this.f19429a.isEmpty()) {
            C2535a.m6888a().m6944g(FirebaseInstanceId.m5609a().m5621d());
            this.f19429a = C2535a.m6888a().m6904P();
        }
        if (this.f19429a != null && !this.f19429a.isEmpty()) {
            if (new C5819a(C2535a.m6888a().m6928d(), this.f19429a).m13024a(MyApplication.m12952b()).getResultCode() == 200) {
                C2535a.m6888a().m6967r(true);
            }
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
