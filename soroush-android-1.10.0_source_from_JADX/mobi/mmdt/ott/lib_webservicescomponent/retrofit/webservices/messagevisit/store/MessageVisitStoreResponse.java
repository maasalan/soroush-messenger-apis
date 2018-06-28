package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.messagevisit.store;

import com.google.p164b.p165a.C1904c;
import java.util.HashMap;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.ResponseMessageVisit;

public class MessageVisitStoreResponse extends BaseResponse {
    @C1904c(a = "MessagesData")
    HashMap<String, ResponseMessageVisit> messgeData;

    public MessageVisitStoreResponse(int i, String str, HashMap<String, ResponseMessageVisit> hashMap) {
        super(i, str);
        this.messgeData = hashMap;
    }

    public HashMap<String, ResponseMessageVisit> getMessgeData() {
        return this.messgeData;
    }

    public void setMessgeData(HashMap<String, ResponseMessageVisit> hashMap) {
        this.messgeData = hashMap;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MessageVisitStoreResponse{resultCode=");
        stringBuilder.append(this.resultCode);
        stringBuilder.append(", resultMessage='");
        stringBuilder.append(this.resultMessage);
        stringBuilder.append('\'');
        stringBuilder.append(", messgeData=");
        stringBuilder.append(this.messgeData);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
