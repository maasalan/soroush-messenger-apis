package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.groupchat.archive;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class GroupChatArchiveRequest extends RegisteredRequest {
    @C1904c(a = "Count")
    private int count;
    @C1904c(a = "GroupId")
    private String groupId;
    @C1904c(a = "MessageId")
    private String messageId;

    GroupChatArchiveRequest(String str, String str2, int i, String str3) {
        super(str);
        this.groupId = str2;
        this.count = i;
        this.messageId = str3;
    }

    public int getCount() {
        return this.count;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupChatArchiveRequest{groupId='");
        stringBuilder.append(this.groupId);
        stringBuilder.append('\'');
        stringBuilder.append(", count=");
        stringBuilder.append(this.count);
        stringBuilder.append(", messageId='");
        stringBuilder.append(this.messageId);
        stringBuilder.append('\'');
        stringBuilder.append(", requestId='");
        stringBuilder.append(this.requestId);
        stringBuilder.append('\'');
        stringBuilder.append(", userName='");
        stringBuilder.append(this.userName);
        stringBuilder.append('\'');
        stringBuilder.append(", hashMethod='");
        stringBuilder.append(this.hashMethod);
        stringBuilder.append('\'');
        stringBuilder.append(", authValue='");
        stringBuilder.append(this.authValue);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
