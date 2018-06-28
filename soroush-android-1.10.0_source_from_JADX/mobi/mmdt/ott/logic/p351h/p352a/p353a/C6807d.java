package mobi.mmdt.ott.logic.p351h.p352a.p353a;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p351h.p352a.C2821a;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.p354a.C2819c;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.p354a.p525a.C5984c;
import p000a.p001a.p002a.C0005c;

public final class C6807d extends C5891a {
    public C6807d() {
        super(C2683h.f8622d);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C0005c.m0a().m9d(new C2819c(C2821a.m7161c()));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5984c(th));
        return C1073q.f3504b;
    }
}
