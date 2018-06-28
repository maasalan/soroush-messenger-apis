package mobi.mmdt.ott.logic.vas.p372a.p550b;

import android.content.Context;
import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.PaymentModule;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.vas_webservices.purchase_charge.C5887a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p329x.C2763c;
import mobi.mmdt.ott.logic.vas.p372a.C2910a;
import mobi.mmdt.ott.logic.vas.p372a.C2912b;
import mobi.mmdt.ott.logic.vas.p372a.p373a.C2907c;
import mobi.mmdt.ott.logic.vas.p372a.p373a.C6006b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p383e.C6016b;
import p000a.p001a.p002a.C0005c;

public final class C6814a extends C5891a {
    private C2910a f19438a;

    public C6814a(C2910a c2910a) {
        super(C2683h.f8622d);
        this.f19438a = c2910a;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2480b.m6736b(" PurchaseChargeJob run");
        Context b = MyApplication.m12952b();
        String str = this.f19438a.f9074a;
        String str2 = this.f19438a.f9075b;
        int ordinal = this.f19438a.f9076c.ordinal();
        int i = this.f19438a.f9079f;
        boolean z = this.f19438a.f9077d;
        String str3 = this.f19438a.f9078e;
        long currentTimeMillis = System.currentTimeMillis();
        C6016b c6016b = new C6016b();
        if (!(str2 == null || str2.isEmpty() || str3 == null || str3.isEmpty() || str == null)) {
            if (!str.isEmpty()) {
                c6016b.m13325d(str3).m13321b(null).m13322c(Integer.valueOf(i)).m13324d(Integer.valueOf(z)).m13320b(Integer.valueOf(ordinal)).m13323c(str2).m13326e(null).m13327f(null).m13316a(Integer.valueOf(0)).m13328g(String.valueOf(currentTimeMillis)).m13317a(str).m13319a(false).m13318a(C2763c.ChargePayment);
                c6016b.m7349a(b);
                C0005c.m0a().m9d(new C2907c(new C5887a(C2535a.m6888a().m6928d(), C2912b.m7288b(this.f19438a.f9079f), Long.parseLong(this.f19438a.f9078e), this.f19438a.f9075b, this.f19438a.f9076c, this.f19438a.f9077d, PaymentModule.values()).m13092a(MyApplication.m12952b())));
                return;
            }
        }
        throw new NullPointerException();
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C6006b(th));
        return C1073q.f3504b;
    }
}
