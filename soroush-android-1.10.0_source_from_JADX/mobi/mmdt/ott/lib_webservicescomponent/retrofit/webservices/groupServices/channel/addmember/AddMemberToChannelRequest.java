package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.addmember;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelMemberRole;

public class AddMemberToChannelRequest extends ChannelRequest {
    @C1902a
    @C1904c(a = "Members")
    private ChannelMemberRole[] memberList;

    public AddMemberToChannelRequest(String str, String str2, ChannelMemberRole[] channelMemberRoleArr) {
        super(str, str2);
        this.memberList = channelMemberRoleArr;
    }

    public ChannelMemberRole[] getMemberList() {
        return this.memberList;
    }

    public void setMemberList(ChannelMemberRole[] channelMemberRoleArr) {
        this.memberList = channelMemberRoleArr;
    }
}
