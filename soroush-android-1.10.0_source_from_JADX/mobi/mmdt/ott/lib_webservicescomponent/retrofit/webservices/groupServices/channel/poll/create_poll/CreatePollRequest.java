package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.create_poll;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.PollData;

public class CreatePollRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "PollData")
    private PollData pollData;
    @C1902a
    @C1904c(a = "PollViewResultStatus")
    private int pollViewResultStatus;

    public CreatePollRequest(String str, int i, PollData pollData) {
        super(str);
        this.pollViewResultStatus = i;
        this.pollData = pollData;
    }

    public PollData getPollData() {
        return this.pollData;
    }

    public int getPollViewResultStatus() {
        return this.pollViewResultStatus;
    }

    public void setPollData(PollData pollData) {
        this.pollData = pollData;
    }

    public void setPollViewResultStatus(int i) {
        this.pollViewResultStatus = i;
    }
}
