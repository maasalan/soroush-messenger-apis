package mobi.mmdt.ott.logic.p261a.p277c;

import com.p072b.p073a.p074a.C1073q;
import java.util.Map;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.logic.p360l.p361a.C2840b;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p385g.C2980g;

public final class C6684d extends C5891a {
    private String f19025a;

    public C6684d(String str) {
        super(C2683h.f8620b);
        this.f19025a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String a = C2483a.m6744a(MyApplication.m12952b());
        String str = this.f19025a;
        Map a2 = C2840b.m7181a();
        a2.put("MAJOR_TYPE", "BOT");
        a2.put("MINOR_TYPE", "STOP");
        C5996e.m13260a().f16147a.m7106b(str, " ", a, a2);
        C2966b.m7412d(this.f19025a);
        C2980g.m7444e(this.f19025a);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
