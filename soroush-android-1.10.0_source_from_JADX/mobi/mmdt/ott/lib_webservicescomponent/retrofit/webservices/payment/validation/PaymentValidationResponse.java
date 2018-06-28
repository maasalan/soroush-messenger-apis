package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.validation;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class PaymentValidationResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "CardNo")
    private String cardNo;
    @C1902a
    @C1904c(a = "ReferenceNo")
    private String referenceNO;
    @C1902a
    @C1904c(a = "TrackNo")
    private String trackNO;

    public PaymentValidationResponse(int i, String str, String str2, String str3, String str4) {
        super(i, str);
        this.referenceNO = str2;
        this.trackNO = str3;
        this.cardNo = str4;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public String getReferenceNO() {
        return this.referenceNO;
    }

    public String getTrackNO() {
        return this.trackNO;
    }

    public void setCardNo(String str) {
        this.cardNo = str;
    }

    public void setReferenceNO(String str) {
        this.referenceNO = str;
    }

    public void setTrackNO(String str) {
        this.trackNO = str;
    }
}
