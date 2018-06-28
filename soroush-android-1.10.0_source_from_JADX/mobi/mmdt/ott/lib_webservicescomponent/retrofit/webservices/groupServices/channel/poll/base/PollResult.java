package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import java.io.Serializable;

public class PollResult implements Serializable {
    @C1902a
    @C1904c(a = "Options")
    private PollOption[] mOptions;
    @C1902a
    @C1904c(a = "Question")
    private String mQuestionTitle;
    @C1902a
    @C1904c(a = "TotalVotes")
    private long mTotalVotes;
    @C1902a
    @C1904c(a = "UserVote")
    private String mUserVote;

    public PollResult(String str, long j, String str2, PollOption[] pollOptionArr) {
        this.mQuestionTitle = str;
        this.mTotalVotes = j;
        this.mUserVote = str2;
        this.mOptions = pollOptionArr;
    }

    public PollOption[] getmOptions() {
        return this.mOptions;
    }

    public String getmQuestionTitle() {
        return this.mQuestionTitle;
    }

    public long getmTotalVotes() {
        return this.mTotalVotes;
    }

    public String getmUserVote() {
        return this.mUserVote;
    }
}
