package mobi.mmdt.ott.logic.notifications.notifsData;

import java.util.ArrayList;

public final class C6001c extends C2876b {
    public ArrayList<C2877e> f16160a = new ArrayList();
    public String f16161c;
    public String f16162d;
    public boolean f16163e;

    public C6001c(String str, String str2, String str3, boolean z) {
        super(str3);
        this.f16161c = str;
        this.f16162d = str2;
        this.f16163e = z;
    }

    public final void m13276a(String str, String str2) {
        this.f16160a.add(new C2877e(str, str2, false));
    }
}
