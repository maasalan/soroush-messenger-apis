package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.intractive_message;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelRequest;

public class GetChannelInteractiveMessageRequest extends ChannelRequest {
    @C1902a
    @C1904c(a = "Count")
    private int count;
    @C1902a
    @C1904c(a = "Timestamp")
    private long timeStamp;

    public GetChannelInteractiveMessageRequest(String str, String str2, long j, int i) {
        super(str, str2);
        this.timeStamp = j;
        this.count = i;
    }

    public int getCount() {
        return this.count;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }
}
