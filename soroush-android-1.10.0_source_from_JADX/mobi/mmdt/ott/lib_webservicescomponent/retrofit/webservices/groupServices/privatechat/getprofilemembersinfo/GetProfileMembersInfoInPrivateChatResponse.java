package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getprofilemembersinfo;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class GetProfileMembersInfoInPrivateChatResponse extends BaseResponse {
    @C1904c(a = "Members")
    private C2574b[] members;

    public GetProfileMembersInfoInPrivateChatResponse(int i, String str, C2574b[] c2574bArr) {
        super(i, str);
        this.members = c2574bArr;
    }

    public C2574b[] getMembers() {
        return this.members;
    }
}
