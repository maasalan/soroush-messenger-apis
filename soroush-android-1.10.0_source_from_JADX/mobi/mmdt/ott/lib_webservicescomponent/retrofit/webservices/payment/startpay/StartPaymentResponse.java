package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.startpay;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import java.util.Map;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class StartPaymentResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "RequestPayObject")
    private Map<String, String> requestPaymentObjects;
    @C1902a
    @C1904c(a = "TransactionId")
    private String transactionID;

    public StartPaymentResponse(int i, String str, Map<String, String> map, String str2) {
        super(i, str);
        this.requestPaymentObjects = map;
        this.transactionID = str2;
    }

    public Map<String, String> getRequestPaymentObjects() {
        return this.requestPaymentObjects;
    }

    public String getTransactionID() {
        return this.transactionID;
    }

    public void setRequestPaymentObjects(Map<String, String> map) {
        this.requestPaymentObjects = map;
    }

    public void setTransactionID(String str) {
        this.transactionID = str;
    }
}
