package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;

public class PollData {
    @C1902a
    @C1904c(a = "CommentBoxCharsLimit")
    private int commentBoxCharsLimit;
    @C1902a
    @C1904c(a = "Enable")
    private int enable;
    @C1902a
    @C1904c(a = "HaveCommentBox")
    private int havaCommentBox;
    @C1902a
    @C1904c(a = "Options")
    private PollOption[] pollOptions;
    @C1902a
    @C1904c(a = "Question")
    private String question;
    @C1902a
    @C1904c(a = "Type")
    private PollType type;

    public PollData(String str, int i, PollType pollType, int i2, int i3, PollOption[] pollOptionArr) {
        this.question = str;
        this.enable = i;
        this.type = pollType;
        this.havaCommentBox = i2;
        this.commentBoxCharsLimit = i3;
        this.pollOptions = pollOptionArr;
    }

    public int getCommentBoxCharsLimit() {
        return this.commentBoxCharsLimit;
    }

    public int getEnable() {
        return this.enable;
    }

    public int getHavaCommentBox() {
        return this.havaCommentBox;
    }

    public PollOption[] getPollOptions() {
        return this.pollOptions;
    }

    public String getQuestion() {
        return this.question;
    }

    public PollType getType() {
        return this.type;
    }

    public void setCommentBoxCharsLimit(int i) {
        this.commentBoxCharsLimit = i;
    }

    public void setEnable(int i) {
        this.enable = i;
    }

    public void setHavaCommentBox(int i) {
        this.havaCommentBox = i;
    }

    public void setPollOptions(PollOption[] pollOptionArr) {
        this.pollOptions = pollOptionArr;
    }

    public void setQuestion(String str) {
        this.question = str;
    }

    public void setType(PollType pollType) {
        this.type = pollType;
    }
}
