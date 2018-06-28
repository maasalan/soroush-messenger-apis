package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.groupchat.windowsarchive;

import com.google.p164b.p165a.C1904c;
import java.util.List;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ChatResult;

public class WindowsGroupArchiveResponse extends BaseResponse {
    @C1904c(a = "AfterMoreMessagesExists")
    private int afterMoreMessagesExists;
    @C1904c(a = "BeforeMoreMessagesExists")
    private int beforeMoreMessagesExits;
    @C1904c(a = "Messages")
    private List<ChatResult> messages;
    @C1904c(a = "MessagesCount")
    private int messagesCount;

    public WindowsGroupArchiveResponse(int i, String str, int i2, int i3, int i4, List<ChatResult> list) {
        super(i, str);
        this.beforeMoreMessagesExits = i2;
        this.afterMoreMessagesExists = i3;
        this.messagesCount = i4;
        this.messages = list;
    }

    public int getAfterMoreMessagesExists() {
        return this.afterMoreMessagesExists;
    }

    public int getBeforeMoreMessagesExits() {
        return this.beforeMoreMessagesExits;
    }

    public List<ChatResult> getMessages() {
        return this.messages;
    }

    public int getMessagesCount() {
        return this.messagesCount;
    }

    public void setAfterMoreMessagesExists(int i) {
        this.afterMoreMessagesExists = i;
    }

    public void setBeforeMoreMessagesExits(int i) {
        this.beforeMoreMessagesExits = i;
    }

    public void setMessages(List<ChatResult> list) {
        this.messages = list;
    }

    public void setMessagesCount(int i) {
        this.messagesCount = i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("WindowsGroupArchiveResponse{resultCode=");
        stringBuilder.append(this.resultCode);
        stringBuilder.append(", resultMessage='");
        stringBuilder.append(this.resultMessage);
        stringBuilder.append('\'');
        stringBuilder.append(", beforeMoreMessagesExits=");
        stringBuilder.append(this.beforeMoreMessagesExits);
        stringBuilder.append(", afterMoreMessagesExists=");
        stringBuilder.append(this.afterMoreMessagesExists);
        stringBuilder.append(", messagesCount=");
        stringBuilder.append(this.messagesCount);
        stringBuilder.append(", messages=");
        stringBuilder.append(this.messages);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
