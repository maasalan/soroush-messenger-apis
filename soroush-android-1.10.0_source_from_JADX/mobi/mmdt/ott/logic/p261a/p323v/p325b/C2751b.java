package mobi.mmdt.ott.logic.p261a.p323v.p325b;

import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6716e;
import mobi.mmdt.ott.provider.p384f.C2970j;

public final class C2751b {
    private static C2751b f8697d;
    C2970j f8698a = null;
    String f8699b;
    long f8700c = -1;

    private C2751b() {
    }

    public static C2751b m7076a() {
        if (f8697d == null) {
            f8697d = new C2751b();
        }
        return f8697d;
    }

    public final void m7077a(String str) {
        Object obj = (f8697d == null || f8697d.f8698a == null || this.f8699b == null || f8697d.f8698a != C2970j.OUT) ? null : 1;
        if (obj != null) {
            C2808d.m7148b(new C6716e(this.f8699b, this.f8700c, str));
            f8697d = null;
        }
    }
}
