package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.vas_webservices.purchase_charge;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.PaymentModule;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.vas_webservices.base.ChargeType;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.vas_webservices.base.OperatorType;

public final class C5887a extends C2566a {
    private PurchaseChargeRequest f16056a;

    public C5887a(String str, ChargeType chargeType, long j, String str2, OperatorType operatorType, boolean z, PaymentModule[] paymentModuleArr) {
        this.f16056a = new PurchaseChargeRequest(str, chargeType, j, str2, operatorType, z, paymentModuleArr);
    }

    public final PurchaseChargeResponse m13092a(Context context) {
        return (PurchaseChargeResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getPurchaseCharge(this.f16056a), this.f16056a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13092a(context);
    }
}
