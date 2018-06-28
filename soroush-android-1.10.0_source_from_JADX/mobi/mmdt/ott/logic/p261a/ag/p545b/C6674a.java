package mobi.mmdt.ott.logic.p261a.ag.p545b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.checkversion.C5813a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.checkversion.CheckVersionResponse;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.ag.p272a.C2615a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6674a extends C5891a {
    private String f19008a;

    public C6674a(String str) {
        super(C2683h.f8620b);
        this.f19008a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
        th.printStackTrace();
    }

    public final void onRun() {
        C2535a a = C2535a.m6888a();
        a.f8278a.edit().putLong("mobi.mmdt.ott.model.pref.KEY_LAST_CHECK_VERSION_CALL", C2778b.m7093a()).apply();
        CheckVersionResponse a2 = new C5813a(this.f19008a).m13018a(MyApplication.m12952b());
        C0005c.m0a().m9d(new C2615a(a2.getDownloadLink(), a2.getLastVersion(), a2.getChagesList()));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        th.printStackTrace();
        return C1073q.f3504b;
    }
}
