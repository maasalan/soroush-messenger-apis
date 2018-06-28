package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.changememberrole;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.Role;

public class ChangeMemberRoleInChannelRequest extends ChannelRequest {
    @C1902a
    @C1904c(a = "MemberUsername")
    private String memberUserName;
    @C1902a
    @C1904c(a = "MemberNewRole")
    private Role newMemberRole;

    public ChangeMemberRoleInChannelRequest(String str, String str2, String str3, Role role) {
        super(str, str2);
        this.memberUserName = str3;
        this.newMemberRole = role;
    }

    public String getMemberUserName() {
        return this.memberUserName;
    }

    public Role getNewMemberRole() {
        return this.newMemberRole;
    }

    public void setMemberUserName(String str) {
        this.memberUserName = str;
    }

    public void setNewMemberRole(Role role) {
        this.newMemberRole = role;
    }
}
