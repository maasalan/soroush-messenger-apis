package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;

public class MessageLike {
    @C1902a
    @C1904c(a = "LikeStatus")
    private int mLikeStatus;
    @C1902a
    @C1904c(a = "MessageID")
    private String mMessageId;

    public enum LikeStatus {
        UNLIKE,
        LIKE
    }

    public MessageLike(String str, int i) {
        this.mLikeStatus = i;
        this.mMessageId = str;
    }

    public int getmLikeStatus() {
        return this.mLikeStatus;
    }

    public String getmMessageId() {
        return this.mMessageId;
    }
}
