package mobi.mmdt.ott.logic.p261a.af;

import java.util.Iterator;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.provider.p386h.C2984c;

public final class C2608b {
    public static void m7039a() {
        Iterator it = C2984c.m7460a().iterator();
        while (it.hasNext()) {
            C2808d.m7149c(new C6671m(((Long) it.next()).longValue(), false));
        }
    }
}
