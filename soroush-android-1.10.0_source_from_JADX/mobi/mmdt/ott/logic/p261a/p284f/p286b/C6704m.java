package mobi.mmdt.ott.logic.p261a.p284f.p286b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.get_result.C5839a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2649n;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5921m;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6704m extends C5891a {
    private String f19087a;

    public C6704m(String str) {
        super(C2683h.f8620b);
        this.f19087a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C0005c.m0a().m9d(new C2649n(new C5839a(C2535a.m6888a().m6928d(), this.f19087a).m13044a(MyApplication.m12952b()).getPollResults()));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5921m(th));
        return C1073q.f3504b;
    }
}
