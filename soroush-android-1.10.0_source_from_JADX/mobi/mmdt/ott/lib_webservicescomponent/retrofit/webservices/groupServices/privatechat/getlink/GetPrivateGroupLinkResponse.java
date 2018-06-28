package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getlink;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class GetPrivateGroupLinkResponse extends BaseResponse {
    @C1904c(a = "GroupJoinLink")
    private String groupJoinLink;

    public GetPrivateGroupLinkResponse(int i, String str, String str2) {
        super(i, str);
        this.groupJoinLink = str2;
    }

    public String getGroupJoinLink() {
        return this.groupJoinLink;
    }

    public void setGroupJoinLink(String str) {
        this.groupJoinLink = str;
    }
}
