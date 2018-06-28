package mobi.mmdt.ott.logic.p261a.p284f.p286b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2650p;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5922o;
import mobi.mmdt.ott.logic.p371s.C2898a;
import p000a.p001a.p002a.C0005c;

public final class C6706o extends C5891a {
    private String f19089a;

    public C6706o(String str) {
        super(C2683h.f8620b);
        this.f19089a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2898a.m7272a(this.f19089a);
        C2808d.m7148b(new C6700i(this.f19089a, true, false));
        C0005c.m0a().m9d(new C2650p(this.f19089a));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5922o(th));
        return C1073q.f3504b;
    }
}
