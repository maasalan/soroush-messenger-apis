package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.set_vote;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.VoteData;

public class SetVoteRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "PollID")
    private String pollID;
    @C1902a
    @C1904c(a = "VoteData")
    private VoteData voteData;

    public SetVoteRequest(String str, String str2, VoteData voteData) {
        super(str);
        this.pollID = str2;
        this.voteData = voteData;
    }

    public String getPollID() {
        return this.pollID;
    }

    public VoteData getVoteData() {
        return this.voteData;
    }

    public void setPollID(String str) {
        this.pollID = str;
    }

    public void setVoteData(VoteData voteData) {
        this.voteData = voteData;
    }
}
