package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.get_like;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class GetLikeRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "MessageIDs")
    private String[] messageIDs;

    public GetLikeRequest(String str, String[] strArr) {
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
