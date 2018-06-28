package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.syncall;

import com.google.p164b.p165a.C1904c;
import java.util.List;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.ResponseMember;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class SyncAllResponse extends BaseResponse {
    @C1904c(a = "Members")
    List<ResponseMember> members;

    public SyncAllResponse(int i, String str) {
        super(i, str);
    }

    public List<ResponseMember> getMembers() {
        return this.members;
    }

    public void setMembers(List<ResponseMember> list) {
        this.members = list;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SyncAllResponse{resultCode=");
        stringBuilder.append(this.resultCode);
        stringBuilder.append(", resultMessage='");
        stringBuilder.append(this.resultMessage);
        stringBuilder.append('\'');
        stringBuilder.append(", members=");
        stringBuilder.append(this.members);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
