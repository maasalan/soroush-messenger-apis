package mobi.mmdt.ott.logic.p261a.p298k;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.Role;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2697d;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5939c;
import mobi.mmdt.ott.logic.p360l.p361a.C2840b;
import mobi.mmdt.ott.logic.p371s.C2898a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p390l.C3004f;
import p000a.p001a.p002a.C0005c;

public final class C6737b extends C5891a {
    private String f19192a;
    private String f19193b;
    private C3004f f19194c;

    public C6737b(String str, String str2, C3004f c3004f) {
        super(C2683h.f8620b);
        this.f19192a = str;
        this.f19193b = str2;
        this.f19194c = c3004f;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String str;
        C3004f c3004f;
        String d = C2535a.m6888a().m6928d();
        String a = C2483a.m6744a(MyApplication.m12952b());
        switch (this.f19194c) {
            case ADMIN:
                C2898a.m7270a(this.f19192a, this.f19193b, Role.ADMIN);
                d = this.f19193b;
                str = this.f19192a;
                c3004f = C3004f.MEMBER;
                break;
            case VISITOR:
                C2898a.m7270a(this.f19192a, this.f19193b, Role.VISITOR);
                C2840b.m7187b(a, this.f19193b, d, this.f19192a);
                break;
            case MEMBER:
                C2898a.m7270a(this.f19192a, this.f19193b, Role.MEMBER);
                d = this.f19193b;
                str = this.f19192a;
                c3004f = C3004f.ADMIN;
                break;
            default:
                break;
        }
        C2840b.m7185a(a, d, str, c3004f, this.f19194c);
        C0005c.m0a().m9d(new C2697d(this.f19193b, this.f19194c));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5939c(th));
        return C1073q.f3504b;
    }
}
