package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;

public class PollOption {
    @C1902a
    @C1904c(a = "DisplayCommentBox")
    private boolean mDisplayCommentBox;
    @C1902a
    @C1904c(a = "OptionID")
    private String mOptionID;
    @C1902a
    @C1904c(a = "Text")
    private String mText;
    @C1902a
    @C1904c(a = "VotesCount")
    private long mVotesCount;

    public PollOption(String str, String str2, long j) {
        this.mOptionID = str;
        this.mText = str2;
        this.mVotesCount = j;
    }

    public PollOption(String str, String str2, boolean z) {
        this.mOptionID = str;
        this.mText = str2;
        this.mDisplayCommentBox = z;
    }

    public boolean getmDisplayCommentBox() {
        return this.mDisplayCommentBox;
    }

    public String getmOptionID() {
        return this.mOptionID;
    }

    public String getmText() {
        return this.mText;
    }

    public long getmVotesCount() {
        return this.mVotesCount;
    }
}
