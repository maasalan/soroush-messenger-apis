package mobi.mmdt.ott.logic.p357j;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getlink.C5849a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getlink.GetPrivateGroupLinkResponse;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p357j.p358a.C2829c;
import mobi.mmdt.ott.logic.p357j.p358a.C5986b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6810b extends C5891a {
    private String f19432a;

    public C6810b(String str) {
        super(C2683h.f8621c);
        this.f19432a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        GetPrivateGroupLinkResponse a = new C5849a(C2535a.m6888a().m6928d(), this.f19432a).m13054a(MyApplication.m12952b());
        if (a.getGroupJoinLink() != null) {
            if (!a.getGroupJoinLink().equals("")) {
                C0005c.m0a().m9d(new C2829c(a.getGroupJoinLink()));
                return;
            }
        }
        C0005c.m0a().m9d(new C2829c(null));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5986b(th));
        return C1073q.f3504b;
    }
}
