package mobi.mmdt.ott.logic.notifications.notifsData;

import java.util.ArrayList;

public final class C6002d extends C2876b {
    public ArrayList<C2877e> f16164a = new ArrayList();
    public String f16165c;
    public String f16166d;
    public boolean f16167e;

    public C6002d(String str, String str2, String str3, boolean z) {
        super(str3);
        this.f16165c = str;
        this.f16166d = str2;
        this.f16167e = z;
    }

    public final void m13277a(String str, String str2, boolean z) {
        this.f16164a.add(new C2877e(str, str2, z));
    }
}
