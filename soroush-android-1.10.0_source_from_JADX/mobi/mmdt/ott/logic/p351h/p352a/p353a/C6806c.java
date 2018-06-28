package mobi.mmdt.ott.logic.p351h.p352a.p353a;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.p354a.C2817a;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.p354a.p525a.C5983b;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C6021g;
import mobi.mmdt.ott.provider.p386h.C6027g;
import p000a.p001a.p002a.C0005c;

public final class C6806c extends C5891a {
    public C6806c() {
        super(C2683h.f8622d);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C6021g c6021g = new C6021g();
        c6021g.m13381a(C2972l.HEAD_MESSAGE);
        c6021g.m7360a(MyApplication.m12952b());
        new C6027g().m7360a(MyApplication.m12952b());
        C0005c.m0a().m9d(new C2817a());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5983b(th));
        return C1073q.f3504b;
    }
}
