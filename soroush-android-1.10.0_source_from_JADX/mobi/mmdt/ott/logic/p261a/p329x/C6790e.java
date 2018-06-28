package mobi.mmdt.ott.logic.p261a.p329x;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.PaymentModule;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.startpay.C5868a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.startpay.StartPaymentResponse;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.aa;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.ab;
import mobi.mmdt.ott.logic.vas.p372a.p373a.C2908e;
import mobi.mmdt.ott.logic.vas.p372a.p373a.C6007d;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2973m;
import org.json.JSONObject;
import p000a.p001a.p002a.C0005c;

public final class C6790e extends C5891a {
    private String f19393a;
    private String f19394b;
    private PaymentModule f19395c;
    private C2763c f19396d;
    private String f19397e;
    private String f19398f;
    private C2973m f19399g;

    public C6790e(String str, String str2, PaymentModule paymentModule, C2763c c2763c) {
        super(C2683h.f8620b);
        this.f19393a = str;
        this.f19394b = str2;
        this.f19395c = paymentModule;
        this.f19396d = c2763c;
    }

    public C6790e(String str, String str2, PaymentModule paymentModule, C2763c c2763c, C2973m c2973m, String str3, String str4) {
        super(C2683h.f8620b);
        this.f19393a = str;
        this.f19394b = str2;
        this.f19395c = paymentModule;
        this.f19396d = c2763c;
        this.f19399g = c2973m;
        this.f19398f = str4;
        this.f19397e = str3;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String str;
        C0005c a;
        Object abVar;
        PaymentModule paymentModule = this.f19395c;
        String str2 = this.f19398f;
        String str3 = this.f19397e;
        C2973m c2973m = this.f19399g;
        if (c2973m != null) {
            switch (c2973m) {
                case SINGLE:
                    str = "USER";
                    break;
                case GROUP:
                    str = "GROUP";
                    break;
                case CHANNEL:
                    str = "CHANNEL";
                    break;
                case BOT:
                    str = "BOT";
                    break;
                default:
                    break;
            }
        }
        str = "";
        StartPaymentResponse a2 = new C5868a(C2535a.m6888a().m6928d(), paymentModule, str2, str3, str, this.f19394b, this.f19393a).m13073a(MyApplication.m12952b());
        String transactionID = a2.getTransactionID();
        JSONObject jSONObject = new JSONObject(a2.getRequestPaymentObjects());
        if (this.f19396d == C2763c.ChannelPayment) {
            a = C0005c.m0a();
            abVar = new ab(transactionID, jSONObject, this.f19394b, this.f19395c);
        } else if (this.f19396d == C2763c.ChargePayment) {
            a = C0005c.m0a();
            abVar = new C2908e(transactionID, jSONObject, this.f19394b, this.f19395c);
        } else {
            if (this.f19396d == C2763c.BillPayment) {
                C0005c.m0a().m9d(new ab(transactionID, jSONObject, this.f19394b, this.f19395c));
            }
            return;
        }
        a.m9d(abVar);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c a;
        Object aaVar;
        if (this.f19396d == C2763c.ChannelPayment) {
            a = C0005c.m0a();
            aaVar = new aa(th);
        } else if (this.f19396d == C2763c.ChargePayment) {
            a = C0005c.m0a();
            aaVar = new C6007d(th);
        } else {
            if (this.f19396d == C2763c.BillPayment) {
                a = C0005c.m0a();
                aaVar = new aa(th);
            }
            return C1073q.f3504b;
        }
        a.m9d(aaVar);
        return C1073q.f3504b;
    }
}
