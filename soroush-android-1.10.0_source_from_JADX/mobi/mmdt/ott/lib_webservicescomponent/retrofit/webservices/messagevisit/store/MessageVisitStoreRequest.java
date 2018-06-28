package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.messagevisit.store;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class MessageVisitStoreRequest extends RegisteredRequest {
    @C1904c(a = "VisitedMessageIds")
    private String[] visitMessageId;

    public MessageVisitStoreRequest(String str, String[] strArr) {
        super(str);
        this.visitMessageId = strArr;
    }

    public String[] getVisitMessageId() {
        return this.visitMessageId;
    }

    public void setVisitMessageId(String[] strArr) {
        this.visitMessageId = strArr;
    }
}
