package mobi.mmdt.ott.logic.p261a.p329x;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.validation.C5869a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.validation.PaymentValidationResponse;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.ac;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.ad;
import mobi.mmdt.ott.logic.vas.p372a.p373a.C2909g;
import mobi.mmdt.ott.logic.vas.p372a.p373a.C6008f;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p383e.C2962e;
import org.json.JSONObject;
import p000a.p001a.p002a.C0005c;

public final class C6791f extends C5891a {
    private String f19400a;
    private String f19401b;
    private C2763c f19402c;

    public C6791f(String str, String str2, C2763c c2763c) {
        super(C2683h.f8620b);
        this.f19400a = str;
        this.f19401b = str2;
        this.f19402c = c2763c;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        StringBuilder stringBuilder = new StringBuilder("VerifyTransaction: mResponseData: ");
        stringBuilder.append(this.f19401b);
        C2480b.m6742f(stringBuilder.toString());
        PaymentValidationResponse a = new C5869a(C2535a.m6888a().m6928d(), this.f19400a, new JSONObject(this.f19401b)).m13074a(MyApplication.m12952b());
        if (this.f19402c == C2763c.ChannelPayment) {
            C0005c.m0a().m9d(new ad());
        } else if (this.f19402c == C2763c.ChargePayment) {
            C2962e.m7387a(MyApplication.m12952b(), this.f19400a);
            C0005c.m0a().m9d(new C2909g(a.getReferenceNO(), a.getTrackNO(), a.getCardNo()));
        } else {
            if (this.f19402c == C2763c.BillPayment) {
                C2962e.m7387a(MyApplication.m12952b(), this.f19400a);
                C0005c.m0a().m9d(new ad());
            }
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c a;
        Object acVar;
        if (this.f19402c == C2763c.ChannelPayment) {
            a = C0005c.m0a();
            acVar = new ac(th);
        } else if (this.f19402c == C2763c.ChargePayment) {
            a = C0005c.m0a();
            acVar = new C6008f(th);
        } else {
            if (this.f19402c == C2763c.BillPayment) {
                a = C0005c.m0a();
                acVar = new ac(th);
            }
            return C1073q.f3504b;
        }
        a.m9d(acVar);
        return C1073q.f3504b;
    }
}
