package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.check_members_exist;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelMemberRole;

public class CheckExistMemberInChannelResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "Members")
    private ChannelMemberRole[] members;

    public CheckExistMemberInChannelResponse(int i, String str, ChannelMemberRole[] channelMemberRoleArr) {
        super(i, str);
        this.members = channelMemberRoleArr;
    }

    public ChannelMemberRole[] getMembers() {
        return this.members;
    }

    public void setMembers(ChannelMemberRole[] channelMemberRoleArr) {
        this.members = channelMemberRoleArr;
    }
}
