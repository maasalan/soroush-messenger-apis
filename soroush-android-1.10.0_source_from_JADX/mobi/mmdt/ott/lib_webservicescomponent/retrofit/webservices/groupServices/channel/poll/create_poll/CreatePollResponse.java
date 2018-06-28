package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.create_poll;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class CreatePollResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "PollID")
    private String pollId;

    public CreatePollResponse(int i, String str, String str2) {
        super(i, str);
        this.pollId = str2;
    }

    public String getPollId() {
        return this.pollId;
    }
}
