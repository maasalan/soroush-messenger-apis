package mobi.mmdt.ott.logic.p261a.p329x;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.PaymentModule;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.check.C5865a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2705r;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2706s;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2973m;
import p000a.p001a.p002a.C0005c;

public final class C6789b extends C5891a {
    private String f19388a;
    private String f19389b;
    private String f19390c;
    private String f19391d;
    private C2973m f19392e;

    public C6789b(String str, String str2, C2973m c2973m, String str3, String str4) {
        super(C2683h.f8620b);
        this.f19388a = str;
        this.f19389b = str2;
        this.f19392e = c2973m;
        this.f19390c = str3;
        this.f19391d = str4;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        List arrayList = new ArrayList();
        arrayList.add(PaymentModule.PARSIANMPL4FACTOR);
        arrayList.add(PaymentModule.PARSIANMPL);
        C0005c.m0a().m9d(new C2706s(this.f19388a, new C5865a(C2535a.m6888a().m6928d(), this.f19388a, arrayList).m13070a(MyApplication.m12952b()).getValidModules(), this.f19389b, this.f19392e, this.f19390c, this.f19391d));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C2705r());
        return C1073q.f3504b;
    }
}
