package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.vas_webservices.purchase_charge;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.PaymentModule;

public class PurchaseChargeResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "EChargeId")
    private String mEChargeId;
    @C1902a
    @C1904c(a = "PaymentId")
    private String mPaymentId;
    @C1902a
    @C1904c(a = "ValidModules")
    private PaymentModule[] mValidModules;

    public PurchaseChargeResponse(int i, String str, PaymentModule[] paymentModuleArr, String str2, String str3) {
        super(i, str);
        this.mValidModules = paymentModuleArr;
        this.mEChargeId = str2;
        this.mPaymentId = str3;
    }

    public String getmEChargeId() {
        return this.mEChargeId;
    }

    public String getmPaymentId() {
        return this.mPaymentId;
    }

    public PaymentModule[] getmValidModules() {
        return this.mValidModules;
    }
}
