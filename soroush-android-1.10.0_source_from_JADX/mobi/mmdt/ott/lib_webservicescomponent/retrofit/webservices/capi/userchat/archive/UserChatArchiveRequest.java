package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.userchat.archive;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class UserChatArchiveRequest extends RegisteredRequest {
    @C1904c(a = "Count")
    private int count;
    @C1904c(a = "MessageId")
    private String messageId;
    @C1904c(a = "UserId")
    private String userId;

    UserChatArchiveRequest(String str, String str2, int i, String str3) {
        super(str);
        this.userId = str2;
        this.count = i;
        this.messageId = str3;
    }

    public int getCount() {
        return this.count;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
