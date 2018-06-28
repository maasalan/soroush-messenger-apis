package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.userchat.archive;

import com.google.p164b.p165a.C1904c;
import java.util.List;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ChatResult;

public class UserChatArchiveResponse extends BaseResponse {
    @C1904c(a = "Messages")
    private List<ChatResult> chatRespons;
    @C1904c(a = "MessagesCount")
    int messageCount;
    @C1904c(a = "MoreMessagesExists")
    int moreMessageExist;

    public UserChatArchiveResponse(int i, String str, int i2, int i3, List<ChatResult> list) {
        super(i, str);
        this.moreMessageExist = i2;
        this.messageCount = i3;
        this.chatRespons = list;
    }

    public List<ChatResult> getChatRespons() {
        return this.chatRespons;
    }

    public int getMessageCount() {
        return this.messageCount;
    }

    public int getMoreMessageExist() {
        return this.moreMessageExist;
    }

    public void setChatRespons(List<ChatResult> list) {
        this.chatRespons = list;
    }

    public void setMessageCount(int i) {
        this.messageCount = i;
    }

    public void setMoreMessageExist(int i) {
        this.moreMessageExist = i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("UserChatArchiveResponse{resultCode=");
        stringBuilder.append(this.resultCode);
        stringBuilder.append(", resultMessage='");
        stringBuilder.append(this.resultMessage);
        stringBuilder.append('\'');
        stringBuilder.append(", moreMessageExist=");
        stringBuilder.append(this.moreMessageExist);
        stringBuilder.append(", messageCount=");
        stringBuilder.append(this.messageCount);
        stringBuilder.append(", chatRespons=");
        stringBuilder.append(this.chatRespons);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
