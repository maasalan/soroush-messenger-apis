package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getnewmessagearchive;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class GetPrivateGroupNewMessageArchiveRequest extends RegisteredRequest {
    @C1904c(a = "GroupJID")
    private String[] groupJIDs;
    @C1904c(a = "MessageTimestampMilliSecond")
    private String messageTimestampMiliSecond;

    public GetPrivateGroupNewMessageArchiveRequest(String str, String[] strArr, String str2) {
        super(str);
        this.groupJIDs = strArr;
        this.messageTimestampMiliSecond = str2;
    }

    public String[] getGroupJIDs() {
        return this.groupJIDs;
    }

    public String getMessageTimestampMiliSecond() {
        return this.messageTimestampMiliSecond;
    }

    public void setGroupJIDs(String[] strArr) {
        this.groupJIDs = strArr;
    }

    public void setMessageTimestampMiliSecond(String str) {
        this.messageTimestampMiliSecond = str;
    }
}
