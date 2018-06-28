package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.memberinfo;

import com.google.p164b.p165a.C1904c;
import java.util.Arrays;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.ResponseMember;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class MemberInfoResponse extends BaseResponse {
    @C1904c(a = "Members")
    private ResponseMember[] members;

    public MemberInfoResponse(int i, String str, ResponseMember[] responseMemberArr) {
        super(i, str);
        this.members = responseMemberArr;
    }

    public ResponseMember[] getMembers() {
        return this.members;
    }

    public void setMembers(ResponseMember[] responseMemberArr) {
        this.members = responseMemberArr;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MemberInfoResponse{resultCode=");
        stringBuilder.append(this.resultCode);
        stringBuilder.append(", resultMessage='");
        stringBuilder.append(this.resultMessage);
        stringBuilder.append('\'');
        stringBuilder.append(", members=");
        stringBuilder.append(Arrays.toString(this.members));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
