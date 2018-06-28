package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.get_result;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.PollResult;

public class GetPollResultResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "PollID")
    private String pollID;
    @C1902a
    @C1904c(a = "PollResult")
    private PollResult pollResults;

    public GetPollResultResponse(int i, String str, String str2, PollResult pollResult) {
        super(i, str);
        this.pollID = str2;
        this.pollResults = pollResult;
    }

    public String getPollID() {
        return this.pollID;
    }

    public PollResult getPollResults() {
        return this.pollResults;
    }
}
