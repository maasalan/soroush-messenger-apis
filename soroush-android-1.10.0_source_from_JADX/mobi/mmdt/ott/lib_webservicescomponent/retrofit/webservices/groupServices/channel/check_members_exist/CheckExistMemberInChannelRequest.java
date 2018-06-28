package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.check_members_exist;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelRequest;

public class CheckExistMemberInChannelRequest extends ChannelRequest {
    @C1902a
    @C1904c(a = "Members")
    private String[] members;

    public CheckExistMemberInChannelRequest(String str, String str2, String[] strArr) {
        super(str, str2);
        this.members = strArr;
    }

    public String[] getMembers() {
        return this.members;
    }

    public void setMembers(String[] strArr) {
        this.members = strArr;
    }
}
