package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.create;

import android.content.Context;
import java.util.List;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.ThreadType;

public final class C5866a extends C2566a {
    private CreatePaymentRequest f16030a;

    public C5866a(String str, ThreadType threadType, String str2, String str3, List<String> list) {
        this.f16030a = new CreatePaymentRequest(str, threadType, str2, str3, list, 0);
    }

    public final CreatePaymentResponse m13071a(Context context) {
        return (CreatePaymentResponse) registeredSend(context, C2567b.m7018a().m7022a(context).createPayment(this.f16030a), this.f16030a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13071a(context);
    }
}
