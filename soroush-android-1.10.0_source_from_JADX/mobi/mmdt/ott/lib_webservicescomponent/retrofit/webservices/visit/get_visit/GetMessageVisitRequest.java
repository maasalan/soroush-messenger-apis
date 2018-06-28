package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.visit.get_visit;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class GetMessageVisitRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "MessageIDs")
    private String[] messageIDs;

    public GetMessageVisitRequest(String str, String[] strArr) {
        super(str);
        this.messageIDs = strArr;
    }

    public String[] getMessageIDs() {
        return this.messageIDs;
    }

    public void setMessageIDs(String[] strArr) {
        this.messageIDs = strArr;
    }
}
