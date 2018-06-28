package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.removemember;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelRequest;

public class RemoveMemberFromChannelRequest extends ChannelRequest {
    @C1902a
    @C1904c(a = "MemberUsername")
    private String memberUserName;

    public RemoveMemberFromChannelRequest(String str, String str2, String str3) {
        super(str, str2);
        this.memberUserName = str3;
    }

    public String getMemberUserName() {
        return this.memberUserName;
    }

    public void setMemberUserName(String str) {
        this.memberUserName = str;
    }
}
