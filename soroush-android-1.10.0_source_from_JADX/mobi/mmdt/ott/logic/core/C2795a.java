package mobi.mmdt.ott.logic.core;

import com.p072b.p073a.p074a.C1063i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.MyApplication.C24941;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p294h.C6730a;
import mobi.mmdt.ott.logic.p261a.p294h.C6732c;
import mobi.mmdt.ott.logic.p368p.C6004c;
import mobi.mmdt.ott.view.tools.C4516l;

public final class C2795a {
    public static void m7132a() {
        C1063i c6730a = new C6730a();
        new C24941(MyApplication.m12950a(), c6730a.getId(), c6730a).start();
    }

    public static void m7133b() {
        C2808d.m7149c(new C6732c());
        if (!C4516l.m8232a()) {
            C6004c.m13279a().m13284c();
        }
    }
}
