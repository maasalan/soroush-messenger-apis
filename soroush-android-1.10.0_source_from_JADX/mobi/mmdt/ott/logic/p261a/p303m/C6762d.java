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

public final class C6762d extends C5891a {
    private String f19317a;
    private String f19318b;
    private String f19319c;
    private C2973m f19320d;

    public C6762d(String str, String str2, C2973m c2973m, String str3) {
        super(C2683h.f8620b);
        this.f19317a = str;
        this.f19319c = str2;
        this.f19320d = c2973m;
        this.f19318b = str3;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String d = C2535a.m6888a().m6928d();
        String a = C2483a.m6744a(MyApplication.m12952b());
        long a2 = C2778b.m7093a();
        if ((this.f19317a == null || this.f19317a.isEmpty()) && (this.f19318b == null || this.f19318b.isEmpty())) {
            C2980g.m7448i(this.f19319c);
        } else {
            C2721a.m7069a(a, this.f19320d, a2, this.f19317a, this.f19319c, this.f19318b);
        }
        C2840b.m7184a(C2483a.m6744a(MyApplication.m12952b()), d, C2721a.m7067a(this.f19320d), this.f19319c, this.f19317a, this.f19318b, a2);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
