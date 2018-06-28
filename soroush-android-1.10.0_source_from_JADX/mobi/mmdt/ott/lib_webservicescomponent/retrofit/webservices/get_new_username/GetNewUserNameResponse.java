package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.get_new_username;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class GetNewUserNameResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "NewData")
    private String newUsername;

    public GetNewUserNameResponse(int i, String str, String str2) {
        super(i, str);
        this.newUsername = str2;
    }

    public String getNewUsername() {
        return this.newUsername;
    }
}
