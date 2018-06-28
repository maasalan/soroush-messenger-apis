package mobi.mmdt.ott.logic.p261a.p277c.p278a;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6726o;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p291a.C2660a;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C2674a;
import mobi.mmdt.ott.provider.p384f.C2973m;

public final class C6681e extends C5891a {
    private String f19020a;
    private String f19021b;
    private String f19022c;

    public C6681e(String str, String str2, String str3) {
        super(C2683h.f8620b);
        this.f19020a = str;
        this.f19021b = str3;
        this.f19022c = str2;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2660a c2660a = new C2660a(C2483a.m6744a(MyApplication.m12952b()), this.f19021b, this.f19020a, C2973m.BOT);
        C6726o.m17188a(c2660a, new C2674a(null, null, null), null, null);
        c2660a.f8577c = this.f19022c;
        C6726o.m17187a(c2660a, null, null);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
