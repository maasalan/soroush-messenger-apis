package mobi.mmdt.ott.logic.p261a.p298k;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.search_channel.C5842a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2709y;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5948x;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6748m extends C5891a {
    private String f19251a;

    public C6748m(String str) {
        super(C2683h.f8620b);
        this.f19251a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C0005c.m0a().m9d(new C2709y(new C5842a(C2535a.m6888a().m6928d(), this.f19251a).m13047a(MyApplication.m12952b()).getSearchChannelModel()));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5948x(th));
        return C1073q.f3504b;
    }
}
