package mobi.mmdt.ott.logic.p351h.p352a.p353a;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p351h.p352a.C2821a;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.p354a.C2820d;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.p354a.p525a.C5985d;
import p000a.p001a.p002a.C0005c;

public final class C6808e extends C5891a {
    public C6808e() {
        super(C2683h.f8622d);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C0005c.m0a().m9d(new C2820d(C2821a.m7154a()));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5985d(th));
        return C1073q.f3504b;
    }
}
