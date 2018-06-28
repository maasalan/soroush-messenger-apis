package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.create;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class CreatePaymentResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "PaymentId")
    private String paymentId;

    public CreatePaymentResponse(int i, String str, String str2) {
        super(i, str);
        this.paymentId = str2;
    }

    public String getPaymentId() {
        return this.paymentId;
    }

    public void setPaymentId(String str) {
        this.paymentId = str;
    }
}
