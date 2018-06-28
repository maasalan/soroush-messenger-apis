package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.channelarchive;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelRequest;

public class GetChannelArchiveRequest extends ChannelRequest {
    @C1904c(a = "Count")
    private int count;
    @C1904c(a = "MessageID")
    private String messageId;
    @C1904c(a = "Offset")
    private int offset;

    public GetChannelArchiveRequest(String str, String str2, int i, int i2, String str3) {
        super(str, str2);
        this.offset = i;
        this.count = i2;
        this.messageId = str3;
    }

    public int getCount() {
        return this.count;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public int getOffset() {
        return this.offset;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setOffset(int i) {
        this.offset = i;
    }
}
