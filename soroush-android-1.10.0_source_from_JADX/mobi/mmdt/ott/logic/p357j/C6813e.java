package mobi.mmdt.ott.logic.p357j;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.removelink.C5855a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p357j.p358a.C2835l;
import mobi.mmdt.ott.logic.p357j.p358a.C5989k;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6813e extends C5891a {
    private String f19437a;

    public C6813e(String str) {
        super(C2683h.f8621c);
        this.f19437a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        new C5855a(C2535a.m6888a().m6928d(), this.f19437a).m13060a(MyApplication.m12952b());
        C0005c.m0a().m9d(new C2835l());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5989k(th));
        return C1073q.f3504b;
    }
}
