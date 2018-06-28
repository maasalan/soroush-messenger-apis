package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.Role;

public class ChannelMemberRole {
    @C1902a
    @C1904c(a = "Role")
    private Role role;
    @C1902a
    @C1904c(a = "Username")
    private String userName;

    public ChannelMemberRole(String str, Role role) {
        this.userName = str;
        this.role = role;
    }

    public Role getRole() {
        return this.role;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setUserName(String str) {
        this.userName = str;
    }
}
