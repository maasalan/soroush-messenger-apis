package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.createlink;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class CreatePrivateGroupNewLinkResponse extends BaseResponse {
    @C1904c(a = "GroupNewJoinLink")
    private String groupNewJoinLink;

    public CreatePrivateGroupNewLinkResponse(int i, String str, String str2) {
        super(i, str);
        this.groupNewJoinLink = str2;
    }

    public String getGroupNewJoinLink() {
        return this.groupNewJoinLink;
    }

    public void setGroupNewJoinLink(String str) {
        this.groupNewJoinLink = str;
    }
}
