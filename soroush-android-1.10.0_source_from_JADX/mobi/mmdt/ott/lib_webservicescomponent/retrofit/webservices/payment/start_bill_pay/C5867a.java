package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.start_bill_pay;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.PaymentModule;

public final class C5867a extends C2566a {
    private StartBilPayRequest f16031a;

    public C5867a(String str, String str2, String str3, String str4, PaymentModule[] paymentModuleArr) {
        this.f16031a = new StartBilPayRequest(str, str2, str3, str4, paymentModuleArr);
    }

    public final StartBilPayResponse m13072a(Context context) {
        return (StartBilPayResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getStartBilPay(this.f16031a), this.f16031a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13072a(context);
    }
}
