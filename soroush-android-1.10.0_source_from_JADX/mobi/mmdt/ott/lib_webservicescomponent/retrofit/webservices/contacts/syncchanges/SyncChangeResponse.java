package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.syncchanges;

import com.google.p164b.p165a.C1904c;
import java.util.List;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.ResponseMember;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class SyncChangeResponse extends BaseResponse {
    @C1904c(a = "Members")
    private List<ResponseMember> members;

    public SyncChangeResponse(int i, String str, List<ResponseMember> list) {
        super(i, str);
        this.members = list;
    }

    public List<ResponseMember> getMembers() {
        return this.members;
    }

    public void setMembers(List<ResponseMember> list) {
        this.members = list;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SyncChangeResponse{resultCode=");
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
