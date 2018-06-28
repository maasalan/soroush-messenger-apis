package mobi.mmdt.ott.logic.p261a.p301l.p548b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p360l.p361a.C2840b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2980g;

public final class C6758e extends C5891a {
    private String[] f19306a;
    private C2973m f19307b;
    private boolean f19308c;
    private String f19309d;

    public C6758e(String str, String[] strArr, C2973m c2973m, boolean z) {
        super(C2683h.f8620b);
        this.f19309d = str;
        this.f19306a = strArr;
        this.f19307b = c2973m;
        this.f19308c = z;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String d = C2535a.m6888a().m6928d();
        if (this.f19308c) {
            C2840b.m7186a(this.f19309d, this.f19307b, this.f19309d, C2483a.m6744a(MyApplication.m12952b()), this.f19306a, this.f19308c, C2778b.m7093a());
        } else {
            C2840b.m7186a(d, this.f19307b, this.f19309d, C2483a.m6744a(MyApplication.m12952b()), this.f19306a, this.f19308c, C2778b.m7093a());
        }
        C2966b.m7411d(this.f19306a);
        C2980g.m7446g(this.f19309d);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
