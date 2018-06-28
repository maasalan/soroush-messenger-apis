package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.card;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class GetUserChargeResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "Credit")
    private String credit;
    @C1902a
    @C1904c(a = "Username")
    private String userName;

    public GetUserChargeResponse(int i, String str, String str2, String str3) {
        super(i, str);
        this.userName = str2;
        this.credit = str3;
    }

    public String getCredit() {
        return this.credit;
    }

    public String getUserName() {
        return this.userName;
    }
}
