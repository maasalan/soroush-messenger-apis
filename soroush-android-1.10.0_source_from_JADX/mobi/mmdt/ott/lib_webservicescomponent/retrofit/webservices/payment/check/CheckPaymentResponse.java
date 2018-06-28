package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.check;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.PaymentModule;

public class CheckPaymentResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "ValidModules")
    private PaymentModule[] validModules;

    public CheckPaymentResponse(int i, String str, PaymentModule[] paymentModuleArr) {
        super(i, str);
        this.validModules = paymentModuleArr;
    }

    public PaymentModule[] getValidModules() {
        return this.validModules;
    }

    public void setValidModules(PaymentModule[] paymentModuleArr) {
        this.validModules = paymentModuleArr;
    }
}
