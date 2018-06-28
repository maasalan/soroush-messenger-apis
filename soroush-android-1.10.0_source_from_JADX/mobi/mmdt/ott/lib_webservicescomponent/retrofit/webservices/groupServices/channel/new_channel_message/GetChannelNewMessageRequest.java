package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.new_channel_message;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class GetChannelNewMessageRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "ChannelID")
    private String[] channelID;
    @C1902a
    @C1904c(a = "MessageID")
    private String messageID;
    @C1902a
    @C1904c(a = "MessageTimestamp")
    private long messageTimeStamp;

    public GetChannelNewMessageRequest(String str, String[] strArr, String str2, long j) {
        super(str);
        this.channelID = strArr;
        this.messageID = str2;
        this.messageTimeStamp = j;
    }

    public String[] getChannelID() {
        return this.channelID;
    }

    public String getMessageID() {
        return this.messageID;
    }

    public long getMessageTimeStamp() {
        return this.messageTimeStamp;
    }
}
