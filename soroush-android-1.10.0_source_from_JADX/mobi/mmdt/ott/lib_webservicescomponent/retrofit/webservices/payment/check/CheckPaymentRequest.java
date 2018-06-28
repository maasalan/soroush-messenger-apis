package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.check;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import java.util.List;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.PaymentModule;

public class CheckPaymentRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "AvailableModules")
    private List<PaymentModule> availableModules;
    @C1902a
    @C1904c(a = "PaymentId")
    private String paymentID;

    public CheckPaymentRequest(String str, String str2, List<PaymentModule> list) {
        super(str);
        this.paymentID = str2;
        this.availableModules = list;
    }

    public List<PaymentModule> getAvailableModules() {
        return this.availableModules;
    }

    public String getPaymentID() {
        return this.paymentID;
    }

    public void setAvailableModules(List<PaymentModule> list) {
        this.availableModules = list;
    }

    public void setPaymentID(String str) {
        this.paymentID = str;
    }
}
