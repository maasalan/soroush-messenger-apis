package mobi.mmdt.ott.logic.notifications.notifsData;

import java.util.ArrayList;

public final class C6003f extends C2876b {
    public ArrayList<C2877e> f16168a = new ArrayList();
    public String f16169c;
    public String f16170d;
    public boolean f16171e;

    public C6003f(String str, String str2, String str3, boolean z) {
        super(str3);
        this.f16169c = str;
        this.f16170d = str2;
        this.f16171e = z;
    }

    public final void m13278a(String str) {
        this.f16168a.add(new C2877e(this.f16170d, str, false));
    }
}
