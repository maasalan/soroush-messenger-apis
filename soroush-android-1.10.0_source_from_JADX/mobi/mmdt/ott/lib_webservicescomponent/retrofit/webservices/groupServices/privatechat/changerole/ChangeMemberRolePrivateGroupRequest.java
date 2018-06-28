package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.changerole;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.GroupRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.Role;

public class ChangeMemberRolePrivateGroupRequest extends GroupRequest {
    @C1904c(a = "MemberNewRole")
    private Role memberNewRole;
    @C1904c(a = "MemberUsername")
    private String memberUserName;

    public ChangeMemberRolePrivateGroupRequest(String str, String str2, String str3, Role role) {
        super(str, str2);
        this.memberUserName = str3;
        this.memberNewRole = role;
    }
}
