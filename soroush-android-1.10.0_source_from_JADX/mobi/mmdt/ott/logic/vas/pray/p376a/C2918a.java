package mobi.mmdt.ott.logic.vas.pray.p376a;

import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p259b.C2565c;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public final class C2918a {
    public String f9083a;
    public String f9084b;
    public String f9085c;
    public C2919b f9086d;
    private String f9087e;
    private String f9088f;

    public C2918a(String str, String str2, String str3, String str4, C2919b c2919b) {
        this.f9087e = str;
        this.f9084b = str3;
        this.f9085c = str4;
        this.f9086d = c2919b;
        this.f9083a = str2;
        this.f9088f = C2535a.m6888a().m6919b().equalsIgnoreCase(C2565c.FA.toString()) ? this.f9085c : this.f9084b;
    }
}
