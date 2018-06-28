package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.visit.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;

public class GetVisitMessagesData {
    @C1902a
    @C1904c(a = "l")
    private int mLikeCount;
    @C1902a(a = false, b = false)
    private String mMessageId;
    @C1902a
    @C1904c(a = "v")
    private int mVisitCount;

    public GetVisitMessagesData(String str, int i, int i2) {
        this.mMessageId = str;
        this.mVisitCount = i;
        this.mLikeCount = i2;
    }

    public int getmLikeCount() {
        return this.mLikeCount;
    }

    public String getmMessageId() {
        return this.mMessageId;
    }

    public int getmVisitCount() {
        return this.mVisitCount;
    }

    public void setmMessageId(String str) {
        this.mMessageId = str;
    }
}
