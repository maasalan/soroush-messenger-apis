package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getnewmessagearchive;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class GetPrivateGroupNewMessageArchiveResponse extends BaseResponse {
    @C1904c(a = "MessagesBase64Encoded")
    private int messageBase64Encoded;
    @C1904c(a = "Messages")
    private String[] messages;
    @C1904c(a = "MessagesCount")
    private int messagesCount;

    public GetPrivateGroupNewMessageArchiveResponse(int i, String str, int i2, int i3, String[] strArr) {
        super(i, str);
        this.messageBase64Encoded = i2;
        this.messagesCount = i3;
        this.messages = strArr;
    }

    public int getMessageBase64Encoded() {
        return this.messageBase64Encoded;
    }

    public String[] getMessages() {
        return this.messages;
    }

    public int getMessagesCount() {
        return this.messagesCount;
    }

    public void setMessageBase64Encoded(int i) {
        this.messageBase64Encoded = i;
    }

    public void setMessages(String[] strArr) {
        this.messages = strArr;
    }

    public void setMessagesCount(int i) {
        this.messagesCount = i;
    }
}
