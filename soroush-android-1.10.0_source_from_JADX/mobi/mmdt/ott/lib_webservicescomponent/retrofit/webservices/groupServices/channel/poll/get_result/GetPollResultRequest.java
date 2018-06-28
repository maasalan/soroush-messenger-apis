package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.get_result;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class GetPollResultRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "PollID")
    private String pollID;

    public GetPollResultRequest(String str, String str2) {
        super(str);
        this.pollID = str2;
    }

    public String getPollID() {
        return this.pollID;
    }

    public void setPollID(String str) {
        this.pollID = str;
    }
}
