package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.channelarchive;

import com.google.p164b.C5593n;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class GetChannelArchiveResponse extends BaseResponse {
    @C1904c(a = "MessagesCount")
    private int messageCount;
    @C1904c(a = "Messages")
    private C5593n[] messages;

    public GetChannelArchiveResponse(int i, String str, int i2, C5593n[] c5593nArr) {
        super(i, str);
        this.messageCount = i2;
        this.messages = c5593nArr;
    }

    public int getMessageCount() {
        return this.messageCount;
    }

    public C5593n[] getMessages() {
        return this.messages;
    }

    public void setMessageCount(int i) {
        this.messageCount = i;
    }

    public void setMessages(C5593n[] c5593nArr) {
        this.messages = c5593nArr;
    }
}
