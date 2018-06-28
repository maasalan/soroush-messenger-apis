package mobi.mmdt.ott.logic.p261a.p277c;

import com.p072b.p073a.p074a.C1073q;
import java.util.Map;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.logic.p360l.p361a.C2840b;
import mobi.mmdt.ott.provider.p385g.C2976c;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p390l.C3004f;

public final class C6683c extends C5891a {
    private String f19024a;

    public C6683c(String str) {
        super(C2683h.f8620b);
        this.f19024a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String a = C2483a.m6744a(MyApplication.m12952b());
        String str = this.f19024a;
        Map a2 = C2840b.m7181a();
        a2.put("MAJOR_TYPE", "BOT");
        a2.put("MINOR_TYPE", "START");
        C5996e.m13260a().f16147a.m7106b(str, " ", a, a2);
        C2976c a3 = C2980g.m7433a(this.f19024a);
        C2980g.m7426a(a3.f9281a, a3.f9282b, a3.f9283c, a3.f9285e, a3.f9286f, a3.f9292l, a3.f9284d, a3.f9284d, C3004f.MEMBER);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
