package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.base;

public class MessagesLikeCount {
    private int mLikeCount;
    private String mMessageId;

    public MessagesLikeCount(String str, int i) {
        this.mLikeCount = i;
        this.mMessageId = str;
    }

    public int getmLikeStatus() {
        return this.mLikeCount;
    }

    public String getmMessageId() {
        return this.mMessageId;
    }
}
