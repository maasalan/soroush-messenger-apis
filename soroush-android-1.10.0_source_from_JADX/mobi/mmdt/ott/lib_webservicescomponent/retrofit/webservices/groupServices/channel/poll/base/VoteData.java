package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;

public class VoteData {
    @C1902a
    @C1904c(a = "QuestionAnswer")
    private String questionAnswer;
    @C1902a
    @C1904c(a = "QuestionComment")
    private String questionComment;

    public VoteData(String str, String str2) {
        this.questionAnswer = str;
        this.questionComment = str2;
    }

    public String getQuestionAnswer() {
        return this.questionAnswer;
    }

    public String getQuestionComment() {
        return this.questionComment;
    }

    public void setQuestionAnswer(String str) {
        this.questionAnswer = str;
    }

    public void setQuestionComment(String str) {
        this.questionComment = str;
    }
}
