package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.validation;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import java.util.HashMap;
import java.util.Iterator;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;
import org.json.JSONException;
import org.json.JSONObject;

public class PaymentValidationRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "ResponsePayObject")
    private HashMap responsePayObject = new HashMap();
    @C1902a
    @C1904c(a = "TransactionId")
    private String transactionID;

    public PaymentValidationRequest(String str, String str2, JSONObject jSONObject) {
        super(str);
        this.transactionID = str2;
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            str2 = (String) keys.next();
            try {
                this.responsePayObject.put(str2, jSONObject.get(str2));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public HashMap getResponsePayObject() {
        return this.responsePayObject;
    }

    public String getTransactionID() {
        return this.transactionID;
    }

    public void setResponsePayObject(HashMap hashMap) {
        this.responsePayObject = hashMap;
    }

    public void setTransactionID(String str) {
        this.transactionID = str;
    }
}
