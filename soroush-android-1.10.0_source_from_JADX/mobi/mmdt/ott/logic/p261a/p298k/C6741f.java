package mobi.mmdt.ott.logic.p261a.p298k;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.deletechannelmessages.C5833a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p385g.C2980g;

public final class C6741f extends C5891a {
    private String f19229a;
    private String[] f19230b;

    public C6741f(String str, String[] strArr) {
        super(C2683h.f8620b);
        this.f19229a = str;
        this.f19230b = strArr;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        new C5833a(C2535a.m6888a().m6928d(), this.f19229a, this.f19230b).m13038a(MyApplication.m12952b());
        for (String c : this.f19230b) {
            C2966b.m7409c(c);
        }
        C2980g.m7446g(this.f19229a);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
