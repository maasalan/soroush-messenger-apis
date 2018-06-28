package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.startpay;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.PaymentModule;

public final class C5868a extends C2566a {
    private StartPaymentRequest f16032a;

    public C5868a(String str, PaymentModule paymentModule, String str2, String str3, String str4, String str5, String str6) {
        this.f16032a = new StartPaymentRequest(str, paymentModule, str2, str3, str4, str5, str6);
    }

    public final StartPaymentResponse m13073a(Context context) {
        return (StartPaymentResponse) registeredSend(context, C2567b.m7018a().m7022a(context).startPayment(this.f16032a), this.f16032a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13073a(context);
    }
}
