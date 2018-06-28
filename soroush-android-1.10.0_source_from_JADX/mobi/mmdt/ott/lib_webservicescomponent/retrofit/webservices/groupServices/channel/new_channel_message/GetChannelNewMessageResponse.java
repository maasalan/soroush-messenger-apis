package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.new_channel_message;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class GetChannelNewMessageResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "Messages")
    private String[] messages;
    @C1902a
    @C1904c(a = "MessagesCount")
    private int messagesCount;

    public GetChannelNewMessageResponse(int i, String str, int i2, String[] strArr) {
        super(i, str);
        this.messagesCount = i2;
        this.messages = strArr;
    }

    public String[] getMessages() {
        return this.messages;
    }

    public int getMessagesCount() {
        return this.messagesCount;
    }
}
