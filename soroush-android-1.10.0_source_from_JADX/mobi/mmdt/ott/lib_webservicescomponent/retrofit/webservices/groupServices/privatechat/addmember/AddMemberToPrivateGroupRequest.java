package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.addmember;

import com.google.p164b.p165a.C1904c;
import java.util.List;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.AddMemberModel;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.GroupRequest;

public class AddMemberToPrivateGroupRequest extends GroupRequest {
    @C1904c(a = "Members")
    List<AddMemberModel> members;

    public AddMemberToPrivateGroupRequest(String str, String str2, List<AddMemberModel> list) {
        super(str, str2);
        this.members = list;
    }

    public List<AddMemberModel> getMembers() {
        return this.members;
    }

    public void setMembers(List<AddMemberModel> list) {
        this.members = list;
    }
}
