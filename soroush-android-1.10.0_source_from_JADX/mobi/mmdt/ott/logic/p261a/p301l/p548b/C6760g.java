package mobi.mmdt.ott.logic.p261a.p301l.p548b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.logic.notifications.C2874b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p323v.p324a.C2748b;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p385g.C2980g;
import p000a.p001a.p002a.C0005c;

public final class C6760g extends C5891a {
    private String f19312a;
    private boolean f19313b;
    private boolean f19314c;

    public C6760g(String str, boolean z, boolean z2) {
        super(C2683h.f8622d);
        this.f19312a = str;
        this.f19313b = z;
        this.f19314c = z2;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        int f = C2966b.m7415f(this.f19312a);
        if (this.f19314c) {
            C2980g.m7440c(this.f19312a, 0);
        }
        if (f > 0 && !this.f19313b) {
            C0005c.m0a().m9d(new C2748b(this.f19313b ^ 1));
        }
        C2874b.m7229a();
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
