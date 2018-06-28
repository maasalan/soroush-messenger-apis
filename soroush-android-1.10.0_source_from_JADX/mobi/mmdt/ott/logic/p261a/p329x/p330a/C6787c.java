package mobi.mmdt.ott.logic.p261a.p329x.p330a;

import android.content.Context;
import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.PaymentModule;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.start_bill_pay.C5867a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.start_bill_pay.StartBilPayResponse;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p382d.C6014c;
import p000a.p001a.p002a.C0005c;

public final class C6787c extends C5891a {
    private String f19375a;
    private String f19376b;
    private String f19377c;
    private String f19378d;

    public C6787c(String str, String str2, String str3, String str4) {
        super(C2683h.f8620b);
        this.f19375a = str2;
        this.f19377c = str;
        this.f19376b = str3;
        this.f19378d = str4;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        Context b = MyApplication.m12952b();
        String str = this.f19377c;
        String str2 = this.f19375a;
        String str3 = this.f19376b;
        long currentTimeMillis = System.currentTimeMillis();
        String str4 = this.f19378d;
        C6014c c6014c = new C6014c();
        if (!(str3 == null || str3.isEmpty() || str == null || str.isEmpty() || str2 == null)) {
            if (!str2.isEmpty()) {
                c6014c.m13311d(str3).m13308b(str).m13310c(str2).m13309c().m13312e(null).m13306a(Integer.valueOf(0)).m13313f(String.valueOf(currentTimeMillis)).m13307a(str4);
                c6014c.m7349a(b);
                StartBilPayResponse a = new C5867a(C2535a.m6888a().m6928d(), this.f19377c, this.f19375a, this.f19376b, new PaymentModule[]{PaymentModule.PARSIANMPL4FACTOR, PaymentModule.PARSIANMPL}).m13072a(MyApplication.m12952b());
                C0005c.m0a().m9d(new C2762b(a.getPaymentId(), a.getBillPayId(), a.getValidModules(), this.f19376b, this.f19378d));
                return;
            }
        }
        throw new NullPointerException();
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5970a(th));
        return C1073q.f3504b;
    }
}
