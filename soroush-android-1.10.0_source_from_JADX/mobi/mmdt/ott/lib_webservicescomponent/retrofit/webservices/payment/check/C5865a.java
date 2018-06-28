package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.check;

import android.content.Context;
import java.util.List;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.PaymentModule;

public final class C5865a extends C2566a {
    private CheckPaymentRequest f16029a;

    public C5865a(String str, String str2, List<PaymentModule> list) {
        this.f16029a = new CheckPaymentRequest(str, str2, list);
    }

    public final CheckPaymentResponse m13070a(Context context) {
        return (CheckPaymentResponse) registeredSend(context, C2567b.m7018a().m7022a(context).checkPayment(this.f16029a), this.f16029a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13070a(context);
    }
}
