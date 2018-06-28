package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models;

import com.google.p164b.p165a.C1904c;

public class ResponseMessageVisit {
    @C1904c(a = "l")
    private String likeNo;
    @C1904c(a = "v")
    private String visitNo;

    public ResponseMessageVisit(String str, String str2) {
        this.likeNo = str;
        this.visitNo = str2;
    }

    public String getLikeNo() {
        return this.likeNo;
    }

    public String getVisitNo() {
        return this.visitNo;
    }

    public void setLikeNo(String str) {
        this.likeNo = str;
    }

    public void setVisitNo(String str) {
        this.visitNo = str;
    }
}
