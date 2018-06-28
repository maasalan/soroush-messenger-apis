package mobi.mmdt.ott.logic.p371s;

import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p259b.p260a.C2562b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.create_session.C5877a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.create_session.CreateNewSessionResponse;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public final class C2899b {
    private static C2899b f9057a;
    private String f9058b;

    private C2899b() {
    }

    public static C2899b m7275a() {
        if (f9057a == null) {
            f9057a = new C2899b();
        }
        return f9057a;
    }

    public final String m7276a(String str) {
        if (this.f9058b == null) {
            String[] strArr = new String[]{C2556b.m6997a(MyApplication.m12952b())};
            CreateNewSessionResponse a = new C5877a(C2535a.m6888a().m6928d(), str, C2562b.m7012a(C2556b.m6999b(MyApplication.m12952b())), strArr).m13082a(MyApplication.m12952b());
            if (!(a == null || a.getSessionKey() == null || a.getResultCode() != 200)) {
                this.f9058b = a.getSessionKey();
            }
        }
        return this.f9058b;
    }
}
