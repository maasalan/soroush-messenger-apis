package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.validation;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import org.json.JSONObject;

public final class C5869a extends C2566a {
    private PaymentValidationRequest f16033a;

    public C5869a(String str, String str2, JSONObject jSONObject) {
        this.f16033a = new PaymentValidationRequest(str, str2, jSONObject);
    }

    public final PaymentValidationResponse m13074a(Context context) {
        return (PaymentValidationResponse) registeredSend(context, C2567b.m7018a().m7022a(context).paymentValidation(this.f16033a), this.f16033a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13074a(context);
    }
}
