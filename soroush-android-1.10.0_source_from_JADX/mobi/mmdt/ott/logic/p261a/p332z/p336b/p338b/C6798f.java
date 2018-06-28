package mobi.mmdt.ott.logic.p261a.p332z.p336b.p338b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sendSms.C5873a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;

public final class C6798f extends C5891a {
    private String f19411a;

    public C6798f(String str) {
        super(C2683h.f8620b);
        this.f19411a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        new C5873a(this.f19411a).m13078a(MyApplication.m12952b());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
