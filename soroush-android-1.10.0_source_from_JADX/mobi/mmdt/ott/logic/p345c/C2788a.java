package mobi.mmdt.ott.logic.p345c;

import java.util.Map;
import mobi.mmdt.ott.p240c.C2515a;
import mobi.mmdt.ott.p240c.C2524c;
import mobi.mmdt.ott.p240c.C2526d;
import mobi.mmdt.ott.p240c.p241a.C5770a;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public final class C2788a {
    private static C2788a f8808d;
    public C2515a f8809a;
    public C2526d f8810b;
    public C2524c f8811c = C5770a.m12970c();

    private C2788a() {
    }

    public static C2788a m7101a() {
        if (f8808d == null) {
            f8808d = new C2788a();
        }
        return f8808d;
    }

    public final String m7102a(String str, String str2, String str3, Map<String, String> map) {
        return this.f8811c.mo2139a(str, str2, str3, map);
    }

    public final void m7103a(String str) {
        this.f8811c.mo2155b(str);
    }

    public final void m7104a(String str, String str2) {
        this.f8811c.mo2142a(str, str2);
    }

    public final boolean m7105a(boolean z) {
        return this.f8811c.mo2152a(z);
    }

    public final String m7106b(String str, String str2, String str3, Map<String, String> map) {
        return this.f8811c.mo2153b(str, str2, str3, map);
    }

    public final String m7107c(String str, String str2, String str3, Map<String, String> map) {
        return this.f8811c.mo2140a(str, str2, str3, map, C2535a.m6888a().m6928d());
    }
}
