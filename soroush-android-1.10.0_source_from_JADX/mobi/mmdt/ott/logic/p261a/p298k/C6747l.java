package mobi.mmdt.ott.logic.p261a.p298k;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.removemember.C5841a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2708w;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5947v;
import mobi.mmdt.ott.logic.p360l.p361a.C2840b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6747l extends C5891a {
    private String f19249a;
    private String f19250b;

    public C6747l(String str, String str2) {
        super(C2683h.f8620b);
        this.f19249a = str;
        this.f19250b = str2;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String d = C2535a.m6888a().m6928d();
        String a = C2483a.m6744a(MyApplication.m12952b());
        new C5841a(C2535a.m6888a().m6928d(), this.f19249a, this.f19250b).m13046a(MyApplication.m12952b());
        C2840b.m7187b(a, this.f19250b, d, this.f19249a);
        C0005c.m0a().m9d(new C2708w(this.f19250b));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5947v(th));
        return C1073q.f3504b;
    }
}
