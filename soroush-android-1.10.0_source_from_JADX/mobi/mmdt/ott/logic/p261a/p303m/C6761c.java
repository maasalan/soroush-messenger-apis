package mobi.mmdt.ott.logic.p261a.p303m;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p360l.p361a.C2840b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2980g;

public final class C6761c extends C5891a {
    private String f19315a;
    private C2973m f19316b;

    public C6761c(C2973m c2973m, String str) {
        super(C2683h.f8620b);
        this.f19315a = str;
        this.f19316b = c2973m;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        long a = C2778b.m7093a();
        C2980g.m7448i(this.f19315a);
        C2840b.m7184a(C2483a.m6744a(MyApplication.m12952b()), C2535a.m6888a().m6928d(), C2721a.m7067a(this.f19316b), this.f19315a, null, null, a);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
