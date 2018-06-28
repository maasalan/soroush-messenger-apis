package mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p345c.C2788a;
import mobi.mmdt.ott.p240c.C2524c.C2522a;

public final class C6718g extends C5891a {
    private String f19119a;
    private boolean f19120b = false;
    private C2522a f19121c;

    public C6718g(String str, C2522a c2522a) {
        super(C2683h.f8620b);
        this.f19119a = str;
        this.f19121c = c2522a;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        if (!this.f19120b) {
            C2788a a = C2788a.m7101a();
            a.f8811c.mo2149a(this.f19121c, this.f19119a);
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
